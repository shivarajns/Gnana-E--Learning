import React from "react";
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
import NavBar from "./NavBar"
import Explore from "./pages/Explore";
import Home from "./pages/home";
import CourseModules from "./pages/courseModules";

function App() {
  return (
    <Router>
      <NavBar/>
      <Routes>
        <Route path="/" element={<Home/>}></Route>
        <Route path="/explore" element={<Explore/>}></Route>
        <Route path="/modules/:id" element={<CourseModules/>}></Route>
      </Routes>
      
    </Router>
  );
}

export default App;
