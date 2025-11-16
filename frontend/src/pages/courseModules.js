import React, { useState } from "react";
import { useParams } from "react-router-dom";

function CourseModules() {

    const {id} = useParams();
    const [data, setData] = useState();

    return (
        <div>
            course: {id}
        </div>
    )
}


export default CourseModules