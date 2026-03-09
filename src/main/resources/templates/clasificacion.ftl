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
          <#list pilotos>
           <tr>
               <td>1</td>
               <td>${p.nombre}</td>
               <td>${p.edad} años</td>
               <td>Equipo: ${p.idEquipo}</td>
               <td>Victorias: </td>
           </tr>
           </#list>

        </table>

        <#include "volverinicio.ftl">

    </div>

</body>
</html>