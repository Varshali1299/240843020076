import logo from './logo.svg';
import './App.css';

import { BrowserRouter, Routes, Route, Link } from 'react-router-dom'; 
import Home from './Login/Home.js';
import LoginPage from './Login/LoginPage.js';
 
import React from 'react';
import { useSelector } from 'react-redux';
import AdminHome from './Login/AdminHome.js';
import LogoutComp from './Login/logout.js';
import FarmerHome from './Login/FarmerHome.js';
import CustomerHome from './Login/CustomerHome.js';
import Regv from './Login/Regv.js';

function App() {
  const mystate = useSelector((state) => state.logged);

    return (
      // <Router>
        <div className='App' style = {{maxWidth: '600px'}}>
          {mystate.loggedIn && ( 
            <nav className='navbar navbar-expand-sm bg-light mb-3'>
              <div className='container-fluid'>
                <ul className='list-inline'>
                  <li className='list-inline-item'>
                    <Link to="/admin_home" className="nav-link px-3"> Home </Link>
                  </li>
                  <li className='list-inline-item'>
                    <Link to="F_register" className="nav-link px-3"> Farmer Registration </Link>
                  </li>
                  <li className='list-inline-item'>
                    <Link to="C_register" className="nav-link px-3"> Customer Registration </Link>
                  </li>
                  <li className='list-inline-item'>
                    <Link to="/logout" className="nav-link px-3"> Logout </Link> 
                  </li>
                </ul>
              </div>
            </nav>
          )}
          <Routes>
            <Route path="/" element={<LoginPage />} /> 
            <Route path="/register" element={<Regv/>} /> 
            <Route path="admin_home" element={<AdminHome/>} />
            <Route path="farmer_home" element={<FarmerHome/>} />
            <Route path="customer_home" element={<CustomerHome/>} />
            <Route path="logout" element={<LogoutComp/>} />
          </Routes>
          {/* <RegPageP/> */}
          {/* <Regv/> */}
        </div>
      // </Router>
  
  );
}

export default App;



