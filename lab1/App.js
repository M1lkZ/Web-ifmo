const subButton = document.getElementById("submit-button")
const checkboxes = document.querySelectorAll("input[type=checkbox]")
const clearButton = document.getElementById("clear-table-button")
const inputField = document.getElementById("input-field")
let c = 0;
let flag = 0;

window.onload = function(){
    inputField.addEventListener("input", function (){
            inputField.value = inputField.value.replace(/[^\d.-]/g, '');
            let y = inputField.value;
            let valid = true;
            for(let i = 0; i < y.length; i++){
                if(i === 0 && y[i] === '-'){
                    continue;
                }
                if(i !== 0 && i !== y.length -1 && (y.charCodeAt(i) === 46 || y.charCodeAt(i) === 44)){
                    continue;
                }
                if(y.charCodeAt(i) < 48 || y.charCodeAt(i) > 57){
                    valid = false;
                    break;
                }
            }
            if(!valid){
                subButton.disabled = true;
                document.getElementById("warning").innerText = "Not a number";
                return;
            }
            let yFloat = parseFloat(y);

            if(yFloat < -5 || yFloat > 5){
                subButton.disabled = true;
                document.getElementById("warning").innerText = "Y should be in [-5; 5] range";

            }else{
                subButton.disabled = false;
                document.getElementById("warning").innerText = "";
            }

        })
    for(let i = 0;i <= checkboxes.length - 1; i++){
        checkboxes[i].addEventListener("change", function() {
            if(this.checked === true){
                c += 1
            } else if(this.checked === false){
                c -= 1
            }
            if(c === 1){
                flag = 1;
            } else {
                flag = 0;
            }
            if (flag === 1){
                subButton.disabled = false;
            } else {
                subButton.disabled = true;
            }
        })
    }
}

clearButton.onclick = function (){
    window.location.href = "clear-table.php";
}