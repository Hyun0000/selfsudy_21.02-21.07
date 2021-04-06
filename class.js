class person {
    constructor(name, first, second) {
        this.name = name;
        this.first = first;
        this.second = second;
    }
}

let kim = new person('kim', 10, 20);
console.log(kim);

// let kim = new person('kim', 10, 20, 30);
// kim.sum = function () {
//     return 'modified : ' + (this.first + this.second + this.third);
// }
// let lee = new person('lee', 10, 10, 10);

// console.log(kim.sum());
// console.log(lee.sum());