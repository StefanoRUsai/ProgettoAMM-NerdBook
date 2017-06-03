function createElement(utente){
   
    
    var img = $("<img>")
            .attr("alt","foto profilo amico")
            .attr("class", "friendPic");
    
    if(utente.urlAvatar == null || utente.urlAvatar === "")
        img.attr("src", "img/profile-pictures.png");     
    else img.attr("src", utente.urlAvatar);
    
    var name = $("<a>")
            .append(img)
            .attr("href", "bacheca.html?postvisualizati=true&idOtherUser="+utente.idUtente)
            .append(utente.nome+" "+utente.cognome);
    
    return $("<li>").append(name);
    
    
}

function stateSuccess(data){
    var utente = $("#utentibarra");
    
    $(utente).empty();
    for(var instance in data){
        $(utente).append(createElement(data[instance]));
    }
}
function stateFailure(data, state){
    console.log(state);
}

$(document).ready(function(){
    $("#searchUser").click(function(){
        
        var utenteCercato = $("#searchField")[0].value;
        
        $.ajax({
            url: "filter.json",
            data:{
                cmd:"search",
                nomeUtente: utenteCercato
            },
            dataType:"json",
            success: function(data, state){
                stateSuccess(data)
            },
            error: function(data, state){
                stateFailure(data, state)
            }
        });
    })
});
