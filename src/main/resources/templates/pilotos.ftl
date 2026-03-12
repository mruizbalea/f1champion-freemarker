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

        <div class="pilotos">

            <#if pilotos??>
                <#list pilotos as piloto>
                    <div class="pilotos">
                        <a href="/piloto/${piloto.id}">
                            <img src="/img/Pilotos/${piloto.imagen}" alt="${piloto.nombre}">
                            <p>${piloto.nombre}</p>
                        </a>
                    </div>
                </#list>
            <#else>
                <p>No hay pilotos registrados.</p>
            </#if>

        </div>

        <a href="/crear-piloto" class="boton">Crear nuevo piloto</a>

        <#include "volverinicio.ftl">
    </div>
    

</body>
  
</html>