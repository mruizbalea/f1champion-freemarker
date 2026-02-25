<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>
    <link rel="stylesheet" href="/CSS/Styles.css">
    <style>

        body {
            width: 100%;
            height: 100vh;
        }

        div {
            width: 100%;
        }

        .boton {
            margin: 1vh;
        }

        .bajo {
            background-color: red;
            
        }

        .terminos {
            
            color: white;
        }

        input:checked ~ .terminos {
            display: none;
            opacity: 0;
            
        }
        
        .fondo {
            
            overflow: hidden;
        }
        
    </style>
</head>
<body>

    <#include "menu.ftl">

    <div>
        <img src="img\Iconos\formula1.jpg" class="fondo"><br>
        <div>
            <p>Qué quieres hacer?</p>
        </div>
        

        <div>
            <a href="GrandPrix.ftl" class="boton">Grand Prix</a>
        </div>
        <div>
            <a href="Equipos.ftl" class="boton">Equipos</a>
        </div>
        <div>
            <a href="Pilotos.html" class="boton">Pilotos</a>
        </div>
        <div>
            <a href="Clasificacion.ftl" class="boton">Clasificación</a>
        </div>  
    </div>
              
    <hr>
    <div class="bajo">
        <p class="terminos">Términos y condiciones</p>
    </div>

</body>
</html>