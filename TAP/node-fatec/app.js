const express = require('express')

const app = express()

app.get("/", function (req, res) {
    res.send("Meu App com Express" )
});

app.get('/Teste/:item/:quantidade', function (req,res) {
    res.send("<p>Olá </p>" + req.params.item + req.params.quantidade);
})

app.get("/blog", function (req, res) {
    res.sendFile(__dirname + '/front/test.html');
});




app.listen(8081, function(){
    console.log("rodando o meu express")
})


