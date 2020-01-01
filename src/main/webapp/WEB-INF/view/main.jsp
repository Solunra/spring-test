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