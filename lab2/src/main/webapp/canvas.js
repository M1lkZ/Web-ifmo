const canvasDiv = document.getElementById("canvas-container")
const canvas = document.getElementById("canvas")
const context2d  = canvas.getContext("2d")
const clearButton = document.getElementById("clear-table-button")
const height = canvasDiv.clientHeight
const width = canvasDiv.clientWidth
canvas.width = width
canvas.height = height
context2d.translate(width / 2, height / 2)
context2d.scale(1,1);
canvas.addEventListener("click", function (ev){
    if ((ev.pageY - canvas.offsetTop) < height / 2){
        console.log("y is positive")
    } else if (((ev.pageY - canvas.offsetTop) === height / 2) || ((ev.pageY - canvas.offsetTop) < ((height / 2) - 5)) || ((ev.pageY - canvas.offsetTop) < ((height / 2) + 5))){
        console.log("y is zero")
    } else {
        console.log("y is negative")
    }
    if ((ev.pageX - canvas.offsetLeft) > width / 2){
        console.log("x is positive")
    } else if (((ev.pageX - canvas.offsetLeft) === width / 2) || ((ev.pageX - canvas.offsetTop) < ((height / 2) - 5)) || ((ev.pageX - canvas.offsetTop) < ((height / 2) + 5))){
        console.log("x is zero")
    } else {
        console.log("x is negative")
    }
})
function clearCanvas(){
    context2d.clearRect(-width / 2,-height / 2,width,height)
}
function drawCanvas(){
    context2d.fillStyle = "#ffffff"
    context2d.fillRect(-width / 2,-height / 2,width,height)
}
function drawAxes(){
    context2d.beginPath()
    context2d.strokeStyle = "#000000"
    context2d.lineWidth = 2;
    context2d.moveTo(-width,0)
    context2d.lineTo(width, 0)
    context2d.moveTo(0,-height)
    context2d.lineTo(0, height)
    context2d.stroke()
    context2d.closePath()

}
function redrawCanvas(){
    clearCanvas();
    drawCanvas();
    drawAxes();
}

redrawCanvas();

clearButton.addEventListener("click", function (){
    redrawCanvas();
    console.log("canvas redrawn");
})
