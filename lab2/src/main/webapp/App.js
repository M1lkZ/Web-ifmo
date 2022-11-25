const subButton = document.getElementById("submit-button");
const clearButton = document.getElementById("clear-table-button");
const inputField = document.getElementById("input-field");
const hiddenInput = document.getElementById("hidden");
const buttons = document.getElementsByClassName("R");
let valid = true;

window.onload = function(){
    inputField.addEventListener("input", function (){
            inputField.value = inputField.value.replace(/[^\d.-]/g, '');
            let x = inputField.value;
            for(let i = 0; i < x.length; i++){
                if(i === 0 && x[i] === '-'){
                    continue;
                }
                if(i !== 0 && i !== x.length -1 && (x.charCodeAt(i) === 46 || x.charCodeAt(i) === 44)){
                    continue;
                }
                if(x.charCodeAt(i) < 48 || x.charCodeAt(i) > 57){
                    valid = false;
                    break;
                }
            }
            if(!valid){
                subButton.disabled = true;
                document.getElementById("warning").innerText = "Not a number";
                return;
            }
            let xFloat = parseFloat(x);

            if(xFloat < -3 || xFloat > 3){
                subButton.disabled = true;
                document.getElementById("warning").innerText = "X should be in [-3; 3] range";

            }else{
                document.getElementById("warning").innerText = "";
                subButton.disabled = false;
            }

        });

        for (let button of buttons) {
            button.addEventListener('click', () => {
                console.log(button.value);
                hiddenInput.setAttribute('value',button.value);
                redraw_canvas(getR());
            });
          }
        clearButton.onclick = function () {
            window.location.href = "clear";
        }
}
