<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clasificación</title>
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

        table {
            border-collapse: collapse;
            margin-top: 2vh;
            margin-bottom: 2vh;
            width: 90%;
        }

        a {
            text-decoration: none;
        }

        th, td {
            border-bottom:1px solid black;
        }

    </style>
</head>
<body>

    <#include "menu.ftl">
   
    <h1>Clasificación</h1>

    <div>

        <table>
            <tr>
                <th>Piloto</th>
                <th>Edad</th>
                <th>Equipo</th>
                <th>Victorias</th>
            </tr>
            <#list pilotos as piloto>
            <tr>
                <td>${piloto.nombre}</td>
                <td>${piloto.edad} años</td>
                <td>${piloto.idEquipo}</td>
                <td>${piloto.victorias}</td>
            </tr>
            </#list>
        </table>

        <#include "volverinicio.ftl">

    </div>

</body>
</html>