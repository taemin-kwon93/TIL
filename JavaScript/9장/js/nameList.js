function newRegister() {
    var newP = document.createElement("p"); 
    var userName = document.querySelector("#userName");
    var text = document.createTextNode(userName.value);
    //console.log("userName.value: " + userName.value)
    newP.appendChild(text);

    var delBtn = document.createElement("span");
    var delText = document.createTextNode("X");
    delBtn.setAttribute("class", "del");
    delBtn.appendChild(delText);
    newP.appendChild(delBtn);

    var nameList = document.querySelector("#nameList");
    nameList.insertBefore(newP, nameList.childNodes[0]);
    userName.value=""; //텍스트 필드 지우기

    var removeBtns = document.querySelectorAll(".del");
    for(var i=0; i<removeBtns.length; i++) {
        removeBtns[i].addEventListener("click", function(){
            if(this.parentNode.parentNode) {
                this.parentNode.parentNode.removeChild(this.parentNode);
            }
        });
    }

}