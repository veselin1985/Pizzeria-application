var itemCount = 0;
var priceTotal = 0;



// Add Item to Cart
$('.btn-primary').click(function (){
  itemCount ++;

  $('#itemCount').text(itemCount).css('display', 'block');
  $(this).siblings('.product_name').clone().appendTo('#cartItems').append('<button class="removeItem" price="' + $(this).parent().find('.product_price span').text() +'">Remove Item</button>');

  // Calculate Total Price
  var price = Number($(this).parent().find('.product_price span').text());
  priceTotal += price;
  $('#cartTotal').text("Total: €" + priceTotal);
}); 



// Hide and Show Cart Items
$('.openCloseCart').click(function(){
  $('#shoppingCart').toggle();
});


// Empty Cart
$('#emptyCart').click(function() {
  itemCount = 0;
  priceTotal = 0;

  $('#itemCount').css('display', 'none');
  $('#cartItems').text('');
  $('#cartTotal').text("Total: €" + priceTotal);
}); 



// Remove Item From Cart
$('#shoppingCart').on('click', '.removeItem', function(){
  
  
  $(this).parent().remove();  
  itemCount --;
  $('#itemCount').text(itemCount);

  // Remove Cost of Deleted Item from Total Price
  var price = Number($(this).attr('price'));
  priceTotal -= price;



  $('#cartTotal').text("Total: €" + priceTotal);

  if (itemCount == 0) {
    $('#itemCount').css('display', 'none');
    priceTotal=0;
    $('#cartTotal').text("Total: €" + priceTotal);
  }
});