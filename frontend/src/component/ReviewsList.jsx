import React from "react";
import ReviewItem from "./UI/Items/ReviewItem";
import cl from "./componentsStyles/ReviewsList.module.css"
import {Link} from "react-router-dom";

const ReviewsList = ({reviews}) => {


    return (
        <div className={cl.reviews__wrapper}>
            <div className={cl.buttons__div}>
                <Link className={cl.link} to={"/publications/add"}>Додати проект</Link>
            </div>
            <div>
                <h1>Відгуків: {reviews.length}</h1>
            </div>
            <div className={cl.all__reviews}>
                {reviews.map((review, index) =>
                    <ReviewItem key={index} review={review}/>)
                }
            </div>
        </div>
    );
};

export default ReviewsList;