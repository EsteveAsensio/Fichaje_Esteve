import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter as Router, Route, Routes, Navigate } from 'react-router-dom';
import Login from './pages/Login/login.jsx';
import Layout from './components/layout.jsx'
import InicioEmp from './pages/empleados/inicio_emp.jsx'
import Fichar from './pages/empleados/fichar/fichar.jsx'
import VerFichajesEmp from './pages/empleados/ver_fichajes/ver_fichajes_emp.jsx'
import ProyectosEmp from './pages/empleados/proyectos/proyectos_emp.jsx'
import SugerenciasEmp from './pages/empleados/sugerencias/sugerencias_emp.jsx'

ReactDOM.createRoot(document.getElementById('root')).render(
    <React.StrictMode>
        <Router>
            <Routes>
                <Route path="/" element={<Navigate to="/TecnoLogix/login" />} />
                <Route path="/TecnoLogix/login" element={<Login />} />

                {/* Todas las rutas dentro del Layout, que incluye el Sidebar */}
                <Route element={<Layout />}>
                    <Route path="/TecnoLogix/inicio_emp" element={<InicioEmp />} />
                    <Route path="/TecnoLogix/fichar" element={<Fichar />} />
                    <Route path="/TecnoLogix/ver_fichajes" element={<VerFichajesEmp />} />
                    <Route path="/TecnoLogix/proyectos" element={<ProyectosEmp />} />
                    <Route path="/TecnoLogix/sugerencias" element={<SugerenciasEmp />} />
                </Route>

                <Route path="/*" element={<Navigate to="/TecnoLogix/login" />} />
            </Routes>
        </Router>
    </React.StrictMode>
);
