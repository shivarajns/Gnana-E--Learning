
function Explore() {
    return (
        <div className="Explore">
            <div className="search-cnt">
                <input type="text" name="search-btn" id="search-btn" className="search-btn" placeholder="Web Development, Ai, Ml...."></input>
                <button style={{scale:"0.8", fontWeight:"normal", height:"45px"}}>Search</button>
            </div>

            <div className="suggestion-cnt">
                <div className="course-card">

                </div>
                <div className="course-card">

                </div>
            </div>
        </div>

       
    )
}

export default Explore