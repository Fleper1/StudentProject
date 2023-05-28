import React, {useContext} from 'react';
import cl from "../ItemsStyles/ReviewItem.module.css"
import {useNavigate} from "react-router-dom";
import {AuthContext} from "../../../context/AuthContext";

const ReviewItem = (review) => {

    const navigate = useNavigate();
    const {imdbId, setImdbId} = useContext(AuthContext);

    const openResume = () => {
        setImdbId(review.review.publicationId)
        navigate(`/resume/${review.review.resumeId}`)
    }

    return (
        <div onClick={openResume} className={cl.review}>
            <div className={cl.review__content}>
                <div className={cl.review__title}>
                    <h2>{review.review.fullName}</h2>
                    <h4>{review.review.title}</h4>
                </div>
                <div className={cl.review__description}>
                    {review.review.message}
                </div>
            </div>
        </div>
    );
};

export default ReviewItem;