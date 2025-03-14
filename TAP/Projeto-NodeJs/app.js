const express = require('express');
const app = express();
const engine = require('express-handlebars').engine;
const bodyParser = require('body-parser');
const post = require('./Models/post')




// Template engine
app.engine('handlebars', engine({ defaultLayout: 'main' }));
app.set('view engine', 'handlebars');


app.use(bodyParser.urlencoded({extended:false}))
app.use(bodyParser.json)



app.get("/", function (req, res) {
    res.render("home" )
});



app.listen(8081, function(){
    console.log("rodando o meu express")
})


