import { useState } from 'react';
import LoginForm from './login_form.jsx';
import './login_css.css';
import { useNavigate } from 'react-router-dom';

const Login = () => {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const navigate = useNavigate();

    const handleEmailChange = (event) => setEmail(event.target.value);
    const handlePasswordChange = (event) => setPassword(event.target.value);

    const handleSubmit = (event) => {
        event.preventDefault();

        // Aquí puedes agregar lógica de autenticación o validación antes de redirigir

        // Redirigir a la página de inicio_emp
        navigate('/TecnoLogix/inicio_emp');
    };

    return (
        <LoginForm
            email={email}
            password={password}
            onEmailChange={handleEmailChange}
            onPasswordChange={handlePasswordChange}
            onSubmit={handleSubmit}
        />
    );
};

// No necesitas PropTypes si no hay props externas
export default Login;
