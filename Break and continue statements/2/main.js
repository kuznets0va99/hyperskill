function sum(numbers) {
    let result = 0;

    for (let i = 0; i < numbers.length; i++){
        if (numbers[i] == 0){
            break;
        }
        else{
            result += numbers[i];
        }
    }
    return result;
}