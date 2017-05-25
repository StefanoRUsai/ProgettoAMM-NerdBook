function createElement(utente){
    var name = $("<h2>").html(utente.nome);
    var link = $("<a>")
            .attr("href", "bacheca.html?user="+utente.id)
            .html("Link al Profilo");
    
    var userData = $("<div>")
            .attr("class","userData")
            .append(name)
            .append(link);

    
    
    return $("<div>")
            .attr("class","user")
            .append(userData);
}

function stateSuccess(data){
    var userListPage = $("#usersList");
    
    $(userListPage).empty();
    for(var instance in data){
        $(userListPage).append(createElement(data[instance]));
    }
}
function stateFailure(data, state){
    console.log(state);
}

$(document).ready(function(){
    $("#nomeUtenteCercato").click(function(){
        
        var utenteCercato = $("#searchField")[0].value;
        
        $.ajax({
            url: "RicercaAjax",
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
