<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><#if equipo??>Editar Equipo<#else>Crear Equipo</#if></title>
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


        <#if equipo??>
            <h1>Editar Equipo</h1>
        <#else>
            <h1>Crear Equipo</h1>
        </#if>

        <#assign destino = "/crear-equipo">
        <#assign nombre = "">
        <#assign fundador = "">
        <#assign nacionalidad = "">
        <#assign origen = "">
        <#assign exitos = "">
        <#assign imagen = "">

        <#if equipo??>
            <#assign destino = "/equipo/editar/"+equipo.id>
            <#assign nombre = equipo.nombre>
            <#assign fundador = equipo.fundador>
            <#assign nacionalidad = equipo.nacionalidad>
            <#assign origen = equipo.origen>
            <#assign exitos = equipo.exitos>
            <#assign imagen = equipo.imagen>
        </#if>

        <div>

            <form method="post" action="${destino}" enctype="multipart/form-data">

                <input class="editar" type="hidden" name="imagenActual" value="${imagen}">

                <div>
                    <label>Nombre:</label>
                    <input class="editar" type="text" name="nombre" value="${nombre}" required>
                </div>

                <div>
                    <label>Fundador:</label>
                    <input class="editar" type="text" name="fundador" value="${fundador}" required>
                </div>

                <div>
                    <label>Nacionalidad:</label>
                    <input class="editar" type="text" name="nacionalidad" value="${nacionalidad}" required>
                </div>

                <div>
                    <label>Origen:</label>
                    <input class="editar" type="text" name="origen" value="${origen}" required>
                </div>

                <div>
                    <label>Exitos:</label>
                    <input class="editar" type="text" name="exitos" value="${exitos}" required>
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