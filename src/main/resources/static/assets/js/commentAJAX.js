$("#sendComment").on("click", function(event){

    event.preventDefault();

    var name = $("#nameComment").val().trim();
    var email = $("#emailComment").val().trim();
    var topic = $("#topicComment").val().trim();
    var text = $("#textComment").val().trim();


    
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
