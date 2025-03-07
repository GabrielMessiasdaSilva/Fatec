const express = require('express')

const app = express()

const engine = require('express-handlebars').engine

//app.engine("handlebars",handlebars({defaultLayout : 'main'}))
//app.set("view engine", "handlebars")


// Template engine
app.engine('handlebars', engine({ defaultLayout: 'main' }));
app.set('view engine', 'handlebars');



app.get("/", function (req, res) {
    res.render("primeira_pagina" )
});



app.listen(8081, function(){
    console.log("rodando o meu express")
})


