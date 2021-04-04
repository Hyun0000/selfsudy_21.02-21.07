function person(name, first, second, third) {
    this.name = name;
    this.first = first;
    this.second = second;
    this.third = third;
    this.sum = function () {
        return this.first + this.second + this.third;
    }
}

let kim = new person('kim', 10, 20, 30);
let lee = new person('lee', 10, 10, 10);
let park = new person('park', 10, 15, 100);

console.log(kim.sum());
console.log(lee.sum());
console.log(park.sum());







console.log(person());
console.log(new person());