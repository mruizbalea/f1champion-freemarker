<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Equipo</title>
    <link rel="stylesheet" type="text/css" href="/css/Styles.css"/>
    <style>
        div {
            width: 100%;
            
        }

        .texto {
            justify-content: left;
        }

        p {
            margin: 1vh;
            font-size: larger;
            
        }

        li {
            margin: 1vh;
        }
    </style>
</head>
<body>

    <#include "menu.ftl">


    <h1>Red Bull Racing</h1><br>

    <div>
        <img src="img\Escuderia\image (13).png" alt="redbull" width="420vh"><br>
    </div>
    

    <div class="texto">
        <p><strong>Informacion adicional</strong></p>
    </div>

    <div class="texto">
        
        <ul>
            <li><img src="img\Iconos\ubi.png" width="20vh"><strong> Fundador:</strong> Dietrich Mateschitz</li>
            <li><img src="img\Iconos\ubi2.png" width="20vh"><strong> Nacionalidad:</strong> Austriaca</li>
            <li><img src="img\Iconos\campana.png" width="20vh"><strong> Origen:</strong> Compró el equipo Jaguar en 2004 y debutó en F1 en 2005</li>
            <li><img src="img\Iconos\trofeo.png" width="20vh"><strong> Éxitos:</strong> Han ganado múltiples Campeonatos de Constructores y Pilotos</li>
        </ul>

        <br>
    </div>

    <#include "volverinicio.ftl">

</body>
</html>