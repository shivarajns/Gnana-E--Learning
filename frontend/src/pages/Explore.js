import React, { useEffect, useState } from "react"
import axios from "axios"
import { useNavigate } from "react-router-dom";

function Explore() {

    const navigate = useNavigate();


    const [data, setData] = useState([]);
    const [loading, setLoading] = useState(true);
    const [id, setID] = useState(0);

    useEffect(() => {
        axios
            .get("http://localhost:8081/api/courses")
            .then((response) => {
                setData(response.data);
                setLoading(false);
            })
            .catch((error) => {
                console.error("Error: ", error)
                setLoading(false);
            })

    }, [])


    useEffect (()=>{
        console.log(data);
    }, [data])


    

    return (
        <div className="Explore">
            <div className="search-cnt">
                <input type="text" name="search-btn" id="search-btn" className="search-btn" placeholder="Web Development, Ai, Ml...."></input>
                <button style={{ scale: "0.8", fontWeight: "normal", height: "45px" }}>Search</button>
            </div>

            <div className="suggestion-cnt">
                {data.slice(0, 10).map((iteam, index) => {
                   return( <div key={index} iteam={iteam} className="course-card">

                        <h1>{iteam.title}</h1>
                        {/* <p>For {iteam.level}</p> */}
                        <p>Modules: {iteam.modules}</p>
                        <p>{iteam.description}</p>
                        <button style={{"marginTop":"15px"}} onClick={()=>navigate(`/modules/${iteam.id}`)}>Learn More</button>
                    </div>
                   )
                })}
            </div>
        </div>


    )
}

export default Explore