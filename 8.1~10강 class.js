class person {
    constructor(name, first, second) {
        this.name = name;
        this.first = first;
        this.second = second;
    }
    sum() {
        return 'prototype : ' + (this.first + this.second);
    }
}

let kim = new person('kim', 10, 20);
kim.sum = function () {
    return 'this : ' + (this.first + this.second);
}
let lee = new person('lee', 10, 10);
console.log(kim.sum());
console.log(lee.sum());




