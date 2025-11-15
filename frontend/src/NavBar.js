import React, { useState } from "react";
import { NavLink } from "react-router-dom";
import Logo from "../src/Images/Logo.png";

function NavBar() {
  const [isHome, setIsHome] = useState(true);

  const handleClick = () => {
    setIsHome(!isHome);
  };


  const linkText = isHome ? "Explore Courses" : "Home";
  const linkPath = isHome ? "/explore" : "/";

  return (
    <div className="NavBar">
      <nav>
        <div className="Logo">
          <img src={Logo} alt="Logo" style={{ width: "100px", height: "80px" }} />
        </div>

        <ul>
          <li>
            <NavLink to={linkPath} className="NavLink" onClick={handleClick}>
              {linkText}
            </NavLink>
          </li>
        </ul>

      </nav>
    </div>
  );
}

export default NavBar;
