import Icon from "../../../assets/ImagesPrueba/Icon.svg";
import Profile from "../../../assets/ImagesPrueba/profile.png";
import Dashboard from "../../../assets/ImagesPrueba/dashboard.svg";
import Transactions from "../../../assets/ImagesPrueba/transactions.svg";
import Performance from "../../../assets/ImagesPrueba/performance.svg";
import News from "../../../assets/ImagesPrueba/news.svg";
import Settings from "../../../assets/ImagesPrueba/settings.svg";
import Support from "../../../assets/ImagesPrueba/support.svg";
import { useLocation } from "react-router-dom";
import { useState } from "react";
import './sidebar_emp.css';

const SidebarEmpleados = () => {
    const location = useLocation();
    const [closeMenu, setCloseMenu] = useState(false);

    const handleCloseMenu = () => {
        setCloseMenu(!closeMenu);
    };

    return (
        <div className="sidebar-empleados">
            <div className={`sidebar-wrapper ${closeMenu ? 'sidebar active' : 'sidebar'}`}>
                <div className={`logoContainer ${closeMenu ? 'active' : ''}`}>
                    <img src={Icon} alt="icon" className="logo" />
                    <h2 className="title">evergreen. </h2>
                </div>
                <div className={`burgerContainer ${closeMenu ? 'active' : ''}`}>
                    <div className="burgerTrigger" onClick={handleCloseMenu}></div>
                    <div className="burgerMenu"></div>
                </div>
                <div className={`profileContainer ${closeMenu ? 'active' : ''}`}>
                    <img src={Profile} alt="profile" className="profile" />
                    <div className="profileContents">
                        <p className="name">Hello, John👋</p>
                        <p>johnsmith@gmail.com</p>
                    </div>
                </div>
                <div className={`contentsContainer ${closeMenu ? 'active' : ''}`}>
                    <ul>
                        <li className={location.pathname === "/" ? "active" : ""}>
                            <img src={Dashboard} alt="dashboard" />
                            <a href="/">dashboard</a>
                        </li>
                        <li className={location.pathname === "/transactions" ? "active" : ""}>
                            <img src={Transactions} alt="transactions" />
                            <a href="/transactions">transactions</a>
                        </li>
                        <li className={location.pathname === "/performance" ? "active" : ""}>
                            <img src={Performance} alt="Performance" />
                            <a href="/performance">performance</a>
                        </li>
                        <li className={location.pathname === "/news" ? "active" : ""}>
                            <img src={News} alt="News" />
                            <a href="/news">news</a>
                        </li>
                        <li className={location.pathname === "/settings" ? "active" : ""}>
                            <img src={Settings} alt="Settings" />
                            <a href="/settings">settings</a>
                        </li>
                        <li className={location.pathname === "/support" ? "active" : ""}>
                            <img src={Support} alt="Support" />
                            <a href="/support">support</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    );
};

export default SidebarEmpleados;
