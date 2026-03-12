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

    <#if equipos??>
        <div class="container">
            <#list equipos as equipo>
                <a href="/equipo/${equipo.id}">
                    <img src="${equipo.imagen}" alt="${equipo.nombre}" />
                    <p>${equipo.nombre}</p>
                </a>
            </#list>
        </div>
    <#else>
        <p>No hay equipos registrados.</p>
    </#if>

    <div>
        <a href="/crear-equipo" class="boton">Crear nuevo equipo</a>
    </div>

    <#include "volverinicio.ftl">

</body>
</html>