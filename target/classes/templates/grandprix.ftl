<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GrandPrix</title>
    <link rel="stylesheet" type="text/css" href="/css/Styles.css"/>
    <style>
        div {
            width: 100%;
                
        }

        .fotos {
            justify-content: space-evenly
        }

        select {
            
            border: none;
            padding: 1vh;
            margin-top: 0.5vh;
            width: 90%;
            font-size: large;
            margin-bottom: 2vh;
        }

        label {
            font-size: larger;
        }

        a {
            text-decoration: none;
            color: black;
        }

    </style>
</head>


<body>

    <#include "menu.ftl">

    <h1>Grand Prix</h1>

    <div>
        
        <label for="selector"><b>Elige año: </b></label>
        <div class="select">
            <select id="selector">

                <option value="Opcion1">2025</option>
                <option value="Opcion2">2024</option>
                <option value="Opcion3">2023</option>
                <option value="Opcion4">2022</option>
                <option value="Opcion5">2021</option>
                
            </select>
        </div>


        <div>

            <div class="fotos">
                <a href="GPAustralia.ftl"><img src="img\Circuitos-mini\albert park.png"/><p> Australia, 16/03</p></a></li>
                <a href="GPAustralia.ftl"><img src="img\Circuitos-mini\image (1).png"/><p> China, 23/03</p></a></li>
            </div>
            <div class="fotos">
                <a href="GPAustralia.ftl"><img src="img\Circuitos-mini\image (2).png"/><p> Japon, 06/04</p></a></li>
                <a href="GPAustralia.ftl"><img src="img\Circuitos-mini\image (3).png"/><p> Bareín, 15/04</p></a></li>
            </div>
            <div class="fotos">
                <a href="GPAustralia.ftl"><img src="img\Circuitos-mini\image (4).png"/><p> Arabia Saudi, 26/04</p></a></li>
                <a href="GPAustralia.ftl"><img src="img\Circuitos-mini\image (6).png"/><p> Miami, 25/05</p></a></li>
            </div>
            <div class="fotos">
                <a href="GPAustralia.ftl"><img src="img\Circuitos-mini\image (11).png"/><p> Emilia Romagno, 16/05</p></a></li>
                <a href="GPAustralia.ftl"><img src="img\Circuitos-mini\image.png"/><p> Monaco, 06/04</p></a></li>
            </div>
            <div class="fotos">
                <a href="GPAustralia.ftl"><img src="img\Circuitos-mini\image (4).png"/><p> España, 16/06</p></a></li>
                <a href="GPAustralia.ftl"><img src="img\Circuitos-mini\image (11).png"/><p> Canada, 15/06</p></a></li>
            </div>
            <div class="fotos">
                <a href="GPAustralia.ftl"><img src="img\Circuitos-mini\image (1).png"/><p> Austria, 29/06</p></a></li>
            </div>
            
        </div>
        

        <div>
            <a href="Inicio.html" class="boton">Volver al Inicio</a>
        </div>
    </div>
        
</body>
</html>