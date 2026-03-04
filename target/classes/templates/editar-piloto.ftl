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

<div>



        <h1>${piloto???'Editar Piloto':'Nuevo Piloto'}</h1>

        <form method="post" action="/piloto">


            <label>Nombre:</label>
            <input type="text" name="nombre" value="${piloto.nombre!} required">

            <label>Edad:</label>
            <input type="number" name="edad" value="${piloto.edad!} required">

            <label>ID Equipo:</label>
            <input type="number" name="id_equipo" value="${piloto.id_equipo!} required">

            <button type="submit">Guardar</button>

        </form>

        <#include "volverinicio.ftl">
    </div>



</body>

</html>