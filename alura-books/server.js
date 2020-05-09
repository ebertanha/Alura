const express = require('express')
let app = express()
let routes = require('./routes')
//Detecta enviroment
let env = process.env.NODE_ENV;
if(!env){
	env = 'development'
}
const DB_URL = require('./config/configdb.js')
// console.log(DB_URL)

//Conecta ao banco
require('./config/database')(DB_URL)

// Configura a porta pela variavel de ambiente ou usa a 3000 como padrão
const port = process.env.port || 3000

// Configura a pasta public para servir os arquivos estáticos, CSS, HTML, Imagens...
app.use(express.static("public"))

//Configura o arquivo de rotas
app.use(routes)

//Inicializa o servidor
app.listen(port, () =>{
     console.log('Server initialiazed on port ' + port) 
})