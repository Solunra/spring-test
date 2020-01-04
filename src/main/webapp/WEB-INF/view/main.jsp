<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Test Chat Group</title>
    <style>
        div{
            border: black solid 1px;
            position: center;
        }
        .chatHistory{
            height: 30vw;
            width: 50vw;
        }
        .chatBox{
            height: 10vw;
            width: 50vw;
        }
        button{
            float: right;
        }
    </style>
    <script>
        var chatUrl = window.location.href + "chat";
        var chatHistory = "No History";

        function getChatHistory()
        {
            var xmlHttp = new XMLHttpRequest();
            xmlHttp.open("GET", chatUrl, true); // true for asynchronous
            xmlHttp.send(null);
            xmlHttp.onreadystatechange = function() {
                if (xmlHttp.readyState == 4 && xmlHttp.status == 200)
                    callback(xmlHttp.responseText);
            }
        }

        function callback(response)
        {
            return response;
        }
    </script>
</head>
<body>
    <div class = "chatHistory">

    </div>
    <div class = "chatBox">
        <form id="sendMessage">
            <label>Username: </label><input name="username" type="text" method="PUT" action="${pageContext.request.contextPath}/chat"/><br/>
            <label>Message:  </label><input name="message" type="textbox" method="PUT" action="${pageContext.request.contextPath}/chat"/><br/>
            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>