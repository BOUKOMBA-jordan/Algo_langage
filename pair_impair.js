let nombre, reste;
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Veuillez saisir un nombre : ', (answer) => {
    nombre= answer;
    reste = nombre%2;
    if(reste===0){
        console.log("Ce nombre est pair");
    }else{
        console.log("Ce nombre est impair");
    }
    rl.close();
});
