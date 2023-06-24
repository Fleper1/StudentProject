import React, {useState} from 'react';
import cl from "./pagesStyles/FillResume.module.css"
import Tag from "../component/UI/Tags/Tag";

const FillResume = () => {

    const [tags, setTags] = useState([])

    const changeTags = (e) => {
        console.log(e.target.id)
        console.log(e.target.checked)

        if (e.target.checked){
            setTags([...tags, e.target.id])
            console.log("PASSED")
        }
        else {
            const newFilter = tags.filter(t => t !== e.target.id)
            setTags(newFilter)
        }
    }

    return (
        <div className={cl.container}>
            <form className={cl.wrapper}>
                <div className={cl.person}>
                    <div className={cl.inputbox}>
                        <input
                            required="required"
                            type="text"
                        />
                        <span>Ім'я:</span>
                        <i></i>
                    </div>
                    <div className={cl.inputbox}>
                        <input
                            required="required"
                            type="number"
                            pattern="[0-9]+"
                        />
                        <span>Вік:</span>
                        <i></i>
                    </div>
                </div>
                <div className={cl.form__group}>
                    <label htmlFor="aboutme">Про себе</label>
                    <textarea
                        rows="5"
                        cols="9"
                        name="aboutme"
                        id="aboutme"
                    />
                </div>
                <div className={cl.form__group}>
                    <label htmlFor="goals">Цілі:</label>
                    <textarea
                        rows="5"
                        cols="9"
                        name="goals"
                        id="goals"
                    />
                </div>
                <label style={{alignSelf: "center", marginTop: "10px"}} htmlFor="skills">Навички</label>
                <div id="skills" className={cl.skills}>
                    <Tag click={changeTags} id="Java">Java</Tag>
                    <Tag click={changeTags} id="React.js">React.js</Tag>
                    <Tag click={changeTags} id="Angular.js">Angular.js</Tag>
                    <Tag click={changeTags} id="Node.js">Node.js</Tag>
                    <Tag click={changeTags} id="Python">Python</Tag>
                    <Tag click={changeTags} id="Assembler">Assembler</Tag>
                    <Tag click={changeTags} id="Kotlin">Kotlin</Tag>
                    <Tag click={changeTags} id="JavaScript">JavaScript</Tag>
                    <Tag click={changeTags} id="Vue.js">Vue.js</Tag>
                    <Tag click={changeTags} id="Unreal">Unreal</Tag>
                    <Tag click={changeTags} id="Ruby">Ruby</Tag>
                    <Tag click={changeTags} id=".Net">.Net</Tag>
                    <Tag click={changeTags} id="C++">C++</Tag>
                    <Tag click={changeTags} id="GO">GO</Tag>
                    <Tag click={changeTags} id="C#">C#</Tag>
                    <Tag click={changeTags} id="C">C</Tag>
                </div>
                <div className={cl.languages}>

                </div>
            </form>
        </div>
    );
};

export default FillResume;