import * as readline from 'readline';

let decimal = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  decimal.question('Enter a decimal number ' ,(answer) =>{
    function decimalToHexString(number)
{
  if (number < 0)
  {
    number = 0xFFFFFFFF + number + 1;
  }

  return number.toString(16).toUpperCase();
}

console.log(decimalToHexString(parseInt(answer)));
decimal.close();
     
  });
