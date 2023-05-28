import React, {useContext, useEffect, useState} from 'react';
import {Link, useParams} from "react-router-dom";
import {useFetching} from "../hooks/useFetching";
import PublicationService from "../API/PublicationService";
import cl from "./pagesStyles/CurrentPublication.module.css"
import MyModal from "../component/UI/MyModal/MyModal";
import BacklinkingItem from "../component/UI/Items/BacklinkingItem";
import {AuthContext} from "../context/AuthContext";

const CurrentPublication = () => {

    const {jwt, userId, isAuth} = useContext(AuthContext);
    const params = useParams()
    const [publication, setPublication] = useState({})
    const [modal, setModal] = useState(false);
    const [isResume, setIsResume] = useState(false)
    const [isOwner, setIsOwner] = useState(false)

    const [fetchPublicationById, isLoading, isError] = useFetching(async (id) => {
        const resume = await PublicationService.isResume(userId, jwt)
        console.log(resume.data)
        setIsResume(resume.data)
        const owner = await PublicationService.isOwner(params.id, jwt);
        setIsOwner(owner.data === userId)
        const response = await PublicationService.getById(params.id);
        setPublication((await response).data)
    })


    useEffect(() => {
        fetchPublicationById(params.id)
    }, [])

    console.log("OWNER", isOwner, "isResume", isResume, "isAuth", isAuth, userId);

    return (

        <div className={cl.publication__wrapper}>
            <MyModal visible={modal} setVisible={setModal}>
                <BacklinkingItem imdbId={params.id}/>
            </MyModal>
            <div className={cl.buttons}>
                <button disabled={isOwner || !isResume || !isAuth} onClick={() => setModal(true)} className={cl.link}>Відгукнутися</button>
                {/*<button disabled={isOwner || !isResume || !isAuth} onClick={() => setModal(true)} className={cl.link}>Поскаржитись</button>*/}
                <button className={cl.link}>Поділитись</button>
            </div>
            <div className={cl.publication}>

                <div className={cl.Title}>
                    {publication.title}
                </div>

                <div className={cl.description}>
                    {publication.description}
                </div>

                <div className={cl.footer}>
                    <div>date: {publication.date}</div>
                    <div>views: {publication.views}</div>
                </div>

            </div>
        </div>
    );
};

export default CurrentPublication;