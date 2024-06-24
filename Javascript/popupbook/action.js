var overlay=document.querySelector(".overlay");
var box=document.querySelector(".box")
var buttonadd=document.getElementById("popup-button")

buttonadd.addEventListener("click",function()
{
    overlay.style.display="block"
    box.style.display="block"
})

var cancelbook=document.getElementById("cancel-popup")

cancelbook.addEventListener("click",function(event){
    event.preventDefault();
    overlay.style.display="none"
    box.style.display="none"
})

var container=document.querySelector(".container")
var addbook=document.getElementById("book-add")
var booktitleinput=document.getElementById("book-title-input")
var bookauthorinput=document.getElementById("book-author-input")
var bookdescinput=document.getElementById("book-desc-input")

addbook.addEventListener("click",function(event){
    event.preventDefault();
    var div=document.createElement("div")
    div.setAttribute("class","book-container")
    div.innerHTML=`<h2>${booktitleinput.value}</h2>
    <h5>${bookauthorinput.value}</h5>
    <p>${bookdescinput.value}</p>
    <button onclick='dele(event)'>Delete</button>`
    container.append(div);
    overlay.style.display="none"
    box.style.display="none"
})

function dele(event)
{
   event.target.parentElement.remove()
}



