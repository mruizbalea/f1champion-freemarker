<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><#if piloto??>Editar Piloto<#else>Crear Piloto</#if></title>
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


        <#if piloto??>
            <h1>Editar Piloto</h1>
        <#else>
            <h1>Crear Piloto</h1>
        </#if>

        <#assign destino = "/crear-piloto">
        <#assign nombre = "">
        <#assign edad = 0>
        <#assign victorias = 0>
        <#assign idEquipo = 0>
        <#assign imagen = "">

        <#if piloto??>
            <#assign destino = "/piloto/editar/"+piloto.id>
            <#assign nombre = piloto.nombre>
            <#assign edad = piloto.edad>
            <#assign victorias = piloto.victorias>
            <#assign idEquipo = piloto.idEquipo>
            <#if piloto.imagen??>
                <#assign imagen = piloto.imagen>
            </#if>
        </#if>

        <div>

            <form method="post" action="${destino}" enctype="multipart/form-data">

                <div>
                    <label>Nombre:</label>
                    <input type="text" name="nombre" value="${nombre}" required>
                </div>

                <div>
                    <label>Edad:</label>
                    <input type="number" name="edad" value="${edad}" required>
                </div>

                <div>
                    <label>Victorias:</label>
                    <input type="number" name="victorias" value="${victorias}" required>
                </div>

                <div>
                    <label>ID Equipo:</label>
                    <input type="number" name="idEquipo" value="${idEquipo}" required>
                </div>

                <img src="${imagen}">
                <label for="imagen">Imagen</label>
                <input type="file" id="imagen" name="imagen">

                <div>
                    <button type="submit" class="boton">Guardar</button>
                </div>

            </form>
        </div>

        <#include "volverinicio.ftl">
    </div>

</body>

</html>