import React from "react";
import Logo from '../Images/eLearningLogo.jpg'

function Home() {
    return (
        <div className="Home">
           <div className="logo-cont">
                <div className="logo-cont-sub-cnt">
                    <img src={Logo} alt="Logo" style={{width : "200px", height : "200px"}}></img>
                </div>
                <div className="logo-cont-sub-cnt-txt" style={{"padding": "5px"}}>
                    <p style={{fontSize:"1.7rem", fontWeight :"bold", }}>Empower Your Learning Journey with Gnana</p>
                    <p>“Learn anytime, anywhere with high-quality courses designed for every student.”</p>
                </div>
           </div>

           <div className="auth-button">
                <button>Login</button>
           </div>
        </div>
    )
}

export default Home