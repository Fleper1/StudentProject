import React, {useContext, useEffect, useState} from 'react';
import Loader from "../component/UI/Loader/Loader";
import {useFetching} from "../hooks/useFetching";
import ReviewsList from "../component/ReviewsList";
import {AuthContext} from "../context/AuthContext";
import ReviewsService from "../API/ReviewService";

const Reviews = () => {

    const [reviews, setReviews] = useState([]);
    const {jwt, userId} = useContext(AuthContext);

    const [fetchPosts, isPublicationLoading, reviewError] = useFetching(async () => {
        const response = await ReviewsService.getAllReviews(userId, jwt);
        if (response === 403){
            console.log("ERROR")
        }
        else {
            setReviews(response.data || []);
            console.log(reviews)
        }
    })

    useEffect(() => {
        fetchPosts();
    }, [])

    return (
        <div style={{marginTop: '60px'}}>
            {isPublicationLoading
                ? <Loader/>
                : <ReviewsList reviews={reviews}/>
            }
        </div>
    );
};

export default Reviews;