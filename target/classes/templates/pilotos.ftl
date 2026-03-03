<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pilotos</title>
    <link rel="stylesheet" type="text/css" href="/css/Styles.css"/>
    <style>

        div {
            width: 100%;
        }

        select {
            
            border: none;
            padding: 1vh;
            margin-top: 0.5vh;
            width: 90%;
            font-size: large;
        }

        label {
            font-size: larger;
            
        }

        a {
            text-decoration: none;
            color: black;
        }

        .pilotos {
            justify-content: space-evenly;
            
        }

        .pilotos img {
            width: 15vh;
        }

    </style>
</head>
<body>

    <#include "menu.ftl">

    <h1>Pilotos</h1>

    <div>
        <label for="selector"><b>Elige año: </b></label>
        <div class="select">
            <select id="selector">

                <option value="Opcion1">2025</option>
                <option value="Opcion2">2024</option>
                <option value="Opcion3">2023</option>
                <option value="Opcion4">2022</option>
                <option value="Opcion5">2021</option>
                    
            </select>
        </div>

        <div>

            <div class="pilotos">
                <a href="Piloto.ftl"><img src="img\Pilotos-pilotos\Captura de pantalla 2026-01-16 083346.png"/><p>Nombre Pilotos</p></a></li>
                <a href="Piloto.ftl"><img src="img\Pilotos-pilotos\Captura de pantalla 2026-01-16 083514.png"/><p>Nombre Pilotos</p></a></li>
                <a href="Piloto.ftl"><img src="img\Pilotos-pilotos\Captura de pantalla 2026-01-16 083633.png"/><p>Nombre Pilotos</p></a></li>
            </div>
            <div class="pilotos">
                <a href="Piloto.ftl"><img src="img\Pilotos-pilotos\Captura de pantalla 2026-01-16 083917 - copia.png"/><p>Nombre Pilotos</p></a></li>
                <a href="Piloto.ftl"><img src="img\Pilotos-pilotos\Captura de pantalla 2026-01-16 083957.png"/><p>Nombre Pilotos</p></a></li>
                <a href="Piloto.ftl"><img src="img\Pilotos-pilotos\Captura de pantalla 2026-01-16 084004.png"/><p>Nombre Pilotos</p></a></li>
            </div>
            <div class="pilotos">
                <a href="Piloto.ftl"><img src="img\Pilotos-pilotos\Captura de pantalla 2026-01-16 084018.png"/><p>Nombre Pilotos</p></a></li>
                <a href="Piloto.ftl"><img src="img\Pilotos-pilotos\Captura de pantalla 2026-01-16 084023.png"/><p>Nombre Pilotos</p></a></li>
                <a href="Piloto.ftl"><img src="img\Pilotos-pilotos\Captura de pantalla 2026-01-16 084037.png"/><p>Nombre Pilotos</p></a></li>
            </div>
            
        </div>

        <div>
            <a href="Inicio.ftl" class="boton">Volver al Inicio</a>
        </div>
    </div>
    

</body>
  
</html>