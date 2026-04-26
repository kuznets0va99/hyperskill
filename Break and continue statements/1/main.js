function find5(numbers) {

    let index = -1; 
    
    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] === 5) {
            index = i;
            break;
        }
    }
    return index;
}