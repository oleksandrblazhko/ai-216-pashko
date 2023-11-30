<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Document</title>
    </head>
    <body>
    <div>
        <center>
            <h1>RequestForFood</h1>
            <h3>Please enter the data below:</h3>
            <form action="/req-food" method="post">
                <label for="productName">productName:</label>
                <input type="text" id="productName" name="productName" ><br>

                <label for="age">age:</label>
                <input type="text" id="age" name="age" ><br>

                <label for="userHeight">userHeight:</label>
                <input type="text" id="userHeight" name="userHeight" ><br>

                <label for="userWeight">userWeight:</label>
                <input type="text" id="userWeight" name="userWeight" ><br>

                <button type="submit">OK</button>
            </form>
        </center>
    </div>
    </body>
</html>
