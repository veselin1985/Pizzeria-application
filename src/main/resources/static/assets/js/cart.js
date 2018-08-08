var itemCount = 0;
var priceTotal = 0;



// Add Item to Cart
$('.btn-primary').click(function (){
  itemCount ++;

  $('#itemCount').text(itemCount).css('display', 'block');
  $(this).siblings('.product_name').clone().appendTo('#cartItems').append('<button class="removeItem" price="' + $(this).parent().find('.product_price span').text() +'">Премахни</button>');
 
  $('#send_reservation').css('display', 'block');
  // Calculate Total Price
  var price = Number($(this).parent().find('.product_price span').text());
  priceTotal += price;
  $('#cartTotal').text("Общо: " + priceTotal.toFixed(2)+" лв.");
}); 



// Hide and Show Cart Items
$('.openCloseCart').click(function(){
  $('#shoppingCart').toggle();
});


// Empty Cart
$('#emptyCart').click(function() {
  itemCount = 0;
  priceTotal = 0;

  $('#send_reservation').css('display', 'none');
  $('#itemCount').css('display', 'none');
  $('#cartItems').text('');
  $('#cartTotal').text("Общо: " + priceTotal.toFixed(2)+" лв.");
}); 



// Remove Item From Cart
$('#shoppingCart').on('click', '.removeItem', function(){
  
  
  $(this).parent().remove();  
  itemCount --;
  $('#itemCount').text(itemCount);

  // Remove Cost of Deleted Item from Total Price
  var price = Number($(this).attr('price'));
  priceTotal -= price;



  $('#cartTotal').text("Общо: " + priceTotal.toFixed(2)+" лв.");

  if (itemCount == 0) {
    $('#send_reservation').css('display', 'none');
    $('#itemCount').css('display', 'none');
    priceTotal=0;
    $('#cartTotal').text("Общо: " + priceTotal.toFixed(2)+" лв.");
  }
});