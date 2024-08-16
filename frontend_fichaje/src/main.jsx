import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter as Router, Route, Routes, Navigate } from 'react-router-dom';
import Login from './pages/Login/login.jsx';
import InicioEmp from './pages/empleados/inicio_emp.jsx';

ReactDOM.createRoot(document.getElementById('root')).render(
    <React.StrictMode>
        <Router>
            <Routes>
                <Route path="/" element={<Navigate to="/TecnoLogix/login" />} />
                <Route path="/TecnoLogix/login" element={<Login />} />

                <Route path="/TecnoLogix/inicio_emp" element={<InicioEmp />} />


                <Route path="/*" element={<Navigate to="/TecnoLogix/login" />} />
            </Routes>
        </Router>
    </React.StrictMode>
);
