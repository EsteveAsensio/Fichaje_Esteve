import SidebarEmpleados from './empleados/sidebar/sidebar_emp.jsx';
import { Outlet } from 'react-router-dom';

const Layout = () => {
    return (
        <div className="layout">
            <SidebarEmpleados /> {/* Sidebar compartido */}
            <div className="content">
                <Outlet /> {/* Aquí se renderizan las páginas secundarias */}
            </div>
        </div>
    );
};

export default Layout;
