import 'bootstrap/dist/css/bootstrap.min.css';
import './login_css.css';
import { Form, Button } from 'react-bootstrap';
import { useState } from "react";
import PropTypes from 'prop-types';

const LoginForm = ({ email, password, onEmailChange, onPasswordChange, onSubmit  }) => {
    const [isSignUpActive, setIsSignUpActive] = useState(false);

    const toggleSignUp = () => {
        setIsSignUpActive(true);
    };

    const toggleSignIn = () => {
        setIsSignUpActive(false);
    };

    return (
        <div className={`container ${isSignUpActive ? 'active' : ''}`} id="container">
            {/* Sign Up Form */}
            <div className="form-container sign-up">
                <Form>
                    <h1>Información</h1>
                    <div className="info">
                        <p> Acceda a la aplicación para realizar o finalizar su fichaje.
                            Es importante seleccionar el proyecto y la tarea sobre la que está trabajando.
                        </p>
                        <p>En caso de tener más dudas o querer más información, puedes descargar el manual <a className="link-edit" href="../../assets/documento/Manual_empelado.pdf" download>haciendo clic aquí</a>.</p>
                    </div>
                </Form>
            </div>

            {/* Sign In Form */}
            <div className="form-container sign-in">
                <Form onSubmit={onSubmit}>
                    <h1>Iniciar Sesión</h1>
                    <Form.Control type="email" placeholder="Correo" className="mb-2" value={email} onChange={onEmailChange} />
                    <Form.Control type="password" placeholder="Contraseña" className="mb-2" value={password} onChange={onPasswordChange} />
                    <Button variant="primary" type="submit">Iniciar</Button>
                </Form>
            </div>

            {/* Toggle Panel */}
            <div className="toggle-container">
                <div className="toggle">
                    <div className="toggle-panel toggle-left">
                        <h1>Inicar Sesión</h1>
                        <p>Introduce su correo y contraseña para poder inicar sesión.</p>
                        <Button className="hidden" onClick={toggleSignIn} id="login">Volver</Button>
                    </div>
                    <div className="toggle-panel toggle-right">
                        <h1>Obtener Más Información</h1>
                        <p>Obten información sobre la aplicación</p>
                        <Button className="hidden" onClick={toggleSignUp} id="register">Acceder</Button>
                    </div>
                </div>
            </div>
        </div>
    );
};

// Validación de las props usando PropTypes
LoginForm.propTypes = {
    email: PropTypes.string.isRequired,
    password: PropTypes.string.isRequired,
    onEmailChange: PropTypes.func.isRequired,
    onPasswordChange: PropTypes.func.isRequired,
    onSubmit: PropTypes.func.isRequired,
};

export default LoginForm;
