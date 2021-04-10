class person {
    constructor(name, first, second) {
        this.name = name;
        this.first = first;
        this.second = second;
    }
    sum() {
        return this.first + this.second;
    }
}

class personplus extends person {
    constructor(name, first, second, third) {
        super(name, first, second);
        this.third = third;
    }
    sum() {
        return super.sum() + this.third
    }
    avr() {
        return (this.first + this.second + this.third) / 3;
    }
}

let kim = new personplus('kim', 10, 20, 30);
console.log(kim.sum());
console.log(kim.avr());




