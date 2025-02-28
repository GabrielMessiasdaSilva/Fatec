
const Sequelize = require('sequelize');

const sequelize = new Sequelize('exemplo', 'root', '', {
    host: 'localhost',
    dialect: 'mysql',
})

sequelize.authenticate().then(function () {
    console.log('Conectado ao banco de dados')

}).catch(function (erro) {
    console.log("Falha ao conectar ao banco de dados", erro)
})

//construindo entidades

const Agendamentos = sequelize.define('agendamentos', {

    nome: {
        type: Sequelize.STRING
    },
    email: {
        type: Sequelize.STRING

    },
    telefone: {
        type: Sequelize.STRING

    },
    cpf: {
        type: Sequelize.STRING
    },
    data: {
        type: Sequelize.STRING
    },
    hora: {
        type: Sequelize.STRING
    },
})

Agendamentos.sync();


