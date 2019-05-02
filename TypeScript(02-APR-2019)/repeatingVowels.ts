import * as readline from 'readline';


let vowel = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  vowel.question('Enter your String ' ,(answer) =>{
   var newString = (answer).split('');
   var count = 0;
   for(var i = 0;i < newString.length; i++)
   {
       if(newString[i] =='a' || newString[i] == 'e' || newString[i] == 'i'|| newString[i] == 'o' || newString[i] == 'u' )
       count++;
   }
   console.log("The number of vowels in given array is " +count);
   vowel.close();
});
