$("#sendButton").on("click", function(){

    var name = null;
    var email = null;
    var topic = null;
    var comment = null;


    
    var comment = {
        name: name,
        email: email,
        topic: topic,
        comment: text
    };

    $.ajax({
        type: 'POST',
        url: "http://localhost:8080/api/comments/add",
        contentType: "application/json",
        data: JSON.stringify(comment),

        success: function () {
            console.log(comment);
        },
        error: function () {
            console.log("ErrorCartLine");

        }

    })
})