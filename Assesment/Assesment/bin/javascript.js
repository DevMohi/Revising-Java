const numbers = [];

for (let i = 0; i < 10; i++) {
    var randomNumber = Math.floor(Math.random() * 1000) + 1;
    console.log(randomNumber)
    numbers.push(randomNumber);
}

let sum = 0;
for(let i=0; i<numbers.length; i++){
    sum = sum + numbers[i];
}

console.log("The sum is:", sum);
