import * as readline from 'readline';


let integer = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
integer.question('Enter your number' ,(answer) =>{
var num = (answer).split('');
var sum = 0;
for(var i = 0;i< num.length; i++){
 var sum = sum + parseInt(num[i]);
}
console.log("The sum of digits of given number is " +sum );
integer.close();
});