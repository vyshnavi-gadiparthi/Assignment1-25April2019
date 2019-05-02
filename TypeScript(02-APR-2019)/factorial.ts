import * as readline from 'readline';


let factorial = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
 factorial.question('Enter your number' ,(answer) =>{
     var mul =1;
        for(var i=1; i <=  parseInt(answer); i++){
            mul = mul * i;
        }
        console.log(mul);
        factorial.close();
 });