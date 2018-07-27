//todo
$(".portfolio a").on("click", function (event) {
    event.preventDefault();
    var $id = this.getAttribute("value")
    console.log($id);



    $.ajax({
        type: 'GET',
        url: "http://localhost:8080/api/products/" + $id,




        success: function (data) {
            var product = data;
            var productId = product.id;

            
            console.log(data)

            var cartLine = {
                product: product,
                quantity: 1,
                subSum: 2
            };


            $.ajax({
                type: 'POST',
                url: "http://localhost:8080/api/cartlines/add",
                contentType: "application/json",
                data: JSON.stringify(cartLine),

                success: function () {
                    console.log(cartLine);
                },
                error: function () {
                    console.log("ErrorCartLine");

                }

            })

        },
        error: function () {
            console.log("ErrorProduct");

        }

    })

});