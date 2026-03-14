<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${piloto.nombre}</title>
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
        <img src="/img/Pilotos/${piloto.imagen}" alt="${piloto.nombre}" width="300vh">
    </div>
    
    <p class="nombre"><b>${piloto.nombre}</b></p>
    <p class="equipo">${piloto.idEquipo}</p>

    <p><b>Información Adicional</b></p>

    <div>
        
        <ul>
            <li><img src="\img\Iconos\piloto.png" width="20vh"><strong> Nombre: </strong>${piloto.nombre}</li>
            <li><img src="\img\Iconos\campana.png" width="20vh"><strong> Edad: </strong>${piloto.edad}</li>
            <li><img src="\img\Iconos\trofeo.png" width="20vh"><strong> Victorias: </strong>${piloto.victorias}</li>
            <li><img src="\img\Iconos\ubi.png" width="20vh"><strong> Equipo ID: </strong>${piloto.idEquipo}</li>
        </ul>

    </div>

    <#include "volverinicio.ftl">

    <div>
        <a href="/piloto/editar/${piloto.id}" class="boton">Editar piloto</a>
        <a href="/piloto/eliminar/${piloto.id}" class="boton">Eliminar piloto</a>
    </div>

</body>
</html>