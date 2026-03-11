<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${equipo.nombre}</title>
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


    <h1>${equipo.nombre}</h1><br>

    <div>
        <img src="\img\Escuderia\RedBull.png" alt="${equipo.nombre}" width="420vh"><br>
    </div>
    

    <div class="texto">
        <p><strong>Información adicional</strong></p>
    </div>

    <div class="texto">
        
        <ul>
            <li><img src="\img\Iconos\ubi.png" width="20vh"><strong> Fundador: </strong>${equipo.fundador}</li>
            <li><img src="\img\Iconos\ubi2.png" width="20vh"><strong> Nacionalidad: </strong>${equipo.nacionalidad}</li>
            <li><img src="\img\Iconos\campana.png" width="20vh"><strong> Origen: </strong>${equipo.origen}</li>
            <li><img src="\img\Iconos\trofeo.png" width="20vh"><strong> Éxitos: </strong>${equipo.exitos}</li>
        </ul>

        <br>
    </div>

    <#include "volverinicio.ftl">

    <div>
        <a href="/equipo/editar/${equipo.id}" class="boton">Editar equipo</a>
        <a href="/equipo/eliminar/${equipo.id}" class="boton">Eliminar equipo</a>
    </div>

</body>
</html>