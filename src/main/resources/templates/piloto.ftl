<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Piloto</title>
    <link rel="stylesheet" type="text/css" href="/css/Styles.css"/>
    <style>

        div {
            width: 100%;
        }
        p {
            text-align: left;
            margin-left: 1vh;
            font-size: larger;
        }

        .nombre {
            font-size: x-large;
            margin-bottom: 0;
            text-align: center;
        }

        .equipo {
            font-size: small;
            text-align: center;
        }

        li {
            margin: 1vh;
        }

        .pistas {
            justify-content: space-evenly;
            margin-bottom: 2vh;
        }

        .pista {
            width: 50%;
        }

    </style>
</head>
<body>

    <#include "menu.ftl">

    <div>
        <img src="img\Piloto-piloto\maxVers.png" width="300vh">
    </div>
    
    <p class="nombre"><b>Max Verstappen</b></p>
    <p class="equipo">Red Bull Racing</p>

    <p><b>Informacion Adicional</b></p>

    <div>
        
        <ul>
            <li><img src="img\Iconos\piloto.png" width="20vh"><strong> Nombre completo:</strong> Max Emilian Verstappen</li>
            <li><img src="img\Iconos\campana.png" width="20vh"><strong> Nacimiento:</strong> 30 de septiembre de 1997</li>
            <li><img src="img\Iconos\trofeo.png" width="20vh"><strong> Numero de Campeonato Mundial:</strong> 2021, 2022, 2023, 2024</li>
            <li><img src="img\Iconos\ubi2.png" width="20vh"><strong> Nacionalidad:</strong> Holanda</li>
        </ul>

        
    </div>

    <p><b>Pistas recientes</b></p>

    <div class="pistas">
        
        <div class="pista">
            <img src="img\Circuitos-mini\albert park.png"><p> Australia</p></li>
        </div>
         <div class="pista">
            <img src="img\Circuitos-mini\image (1).png"><p> China</p></li>
         </div>
        
    </div>
    

    

    <div>
        <a href="Inicio.ftl" class="boton">Volver al Inicio</a>
    </div>







</body>
</html>