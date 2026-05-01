document.addEventListener("DOMContentLoaded", function(){
    let getInput = document.getElementById("input-msg");
    let sendBtn = document.querySelector(".send-msg-btn")
    let messageContainer = document.getElementById("messages")
    
    function scrollToBottom(){
        messageContainer.scrollTop = messageContainer.scrollHeight;
    }

    function addMessage(text){
        if (!text.trim()) return;

        const messageUserDiv = document.createElement("div");
        
        messageUserDiv.className = "message-user";
        messageUserDiv.textContent = text;

        messageContainer.appendChild(messageUserDiv);
        getInput.value = "";
        scrollToBottom();
    }

    sendBtn.addEventListener("click", function(){
        addMessage(getInput.value);
    })

    getInput.addEventListener("keypress", function(event){
        if (event.key == "Enter"){
            event.preventDefault();
            addMessage(getInput.value);
        }
    })

    scrollToBottom();
});
