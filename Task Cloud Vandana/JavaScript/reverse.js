const str = 'This is sunny day';
const reverseSentence = str => {
   const arr = str.split(" ");
   const reversed = arr.map(el => {
      return el.split('').reverse().join("");
   });
   return reversed.join(" ");
};
console.log(reverseSentence(str));