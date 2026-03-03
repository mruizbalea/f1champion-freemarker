<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Equipos</title>
    <link rel="stylesheet" type="text/css" href="/css/Styles.css"/>
    <style>

        div {
            width: 100%;
        }

        .container img {
            width: 45vh;
        }

        p {
            text-align: center;
        }

        a {
            text-decoration: none;
            color: black;
        }

    </style>
</head>
<body>

    <#include "menu.ftl">

    <h1>Equipos</h1>

    <div class="container">
        <#list listaEquipos as equipo>
            <a href="/equipo?id=${equipo.id}">
                <img src="img/coches/${equipo.imagen}" alt="${equipo.nombre}" />
                <p>${equipo.nombre}</p>
            </a>
        </#list>
    </div>

    <#include "volverinicio.ftl">

</body>
</html>