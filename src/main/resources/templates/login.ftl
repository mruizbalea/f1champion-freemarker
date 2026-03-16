<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            margin-top: 0;
            margin-bottom: 0;
            margin-left: 2vh;
            margin-right: 2vh;
            height: 100vh;
        }

        div {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
        }

        form {
            width: 100%;

        }

        .cuerpo {
            height: 100vh;
        }

        
        .botones {
            width: 100%;
            justify-content: space-between;
            text-align: center;
        }

        .boton {
            width: 17vh;
        }

        .google {
            color: #000;
            height: 6vh;
            border-radius: 1vh;
            width: 100%;
            border-style: solid;
            border-width: 0.3vh;
            text-decoration: none;
            cursor: pointer;
            opacity: 0.5;
            align-content: center;
        }

        .inicio_sesion {
            margin-top: 3vh;
            height: 6vh;
            border-radius: 3vh;
            background-color: red;
            width: 100%;
            border: none;
        }

        input[type=submit] {
            width: 100%;
            color: white;
        }

        input[type=password] {
            width: 100%;
            height: 6vh;
            border-radius: 1vh;
        }

        input[type=text] {
            width: 100%;
            height: 6vh;
            border-radius: 1vh;
        }


        .texto {
            text-align: center;
            width: 100%;
        }

        .form {
            width: 100%;
            opacity: 0.8;
        }

        span {
            opacity: 0.5;
        }

        
        a {
            opacity: 1;
        }

        .labels {
            font-weight: bold;
        }

    </style>
    
</head>
<body>
    <div class="cabecera">

    </div>

    <div class="cuerpo">
        <img src="/img/Iconos/logooo.png" alt="logo_f1" width="300" height="300">

        <div class="form">
             <form method="post" action="/login">
                 <label for="username" class="labels">Email</label><br>
                 <input name="username" type="text" placeholder="tu.correo@ejemplo.com"><br><br>
                 <label for="password" class="labels">Contraseña</label><br>
                 <input name="password" type="password" placeholder="********"><br>
                 <input type="submit" value="Iniciar sesión" class="inicio_sesion">
             </form>
        </div>


        
        
        <div class="texto">
            <span>O continúa con</span>
        </div>
        
        <div class="botones">
            <div class="boton">
                <a href="https://www.google.com/?safe=active&ssui=on" class="google">Google</a>
            </div>
            <div class="boton">
                <a href="https://www.facebook.com/?locale=es_ES" class="google">Facebook</a>
            </div>
        </div>
        
        <span>¿Has olvidado tu contraseña? <a href="/login"><u>Contáctanos.</u></a></span>
    </div>
    
    <div class="pie">

    </div>
</body>
</html>