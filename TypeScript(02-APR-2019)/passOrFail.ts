import * as readline from 'readline';


let result = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  result.question('Enter your marks of three subjects ' ,(answer) =>{
    let subject = (answer).split(" ");
    let subject1 = parseInt(subject[0]);
    let subject2 = parseInt(subject[1]);      
    let subject3 = parseInt(subject[2]);
      
  function Tocheck(num1?: number, num2?:number, num3?:number){
      let result:boolean = true;
      let sum:number = num1 + num2 + num3;
      if(sum < 125){
          result = false;
      }if(num1 < 40){
          result = false;
      }if(num2 < 40){
        result = false;
      }if(num3 < 40){
        result = false;
      }

      if(result == false){
          console.log("Fail");
      }
      else{
          console.log("Pass");
      }
      
    }
   
    Tocheck(subject1, subject2, subject3);
    result.close();
  });

