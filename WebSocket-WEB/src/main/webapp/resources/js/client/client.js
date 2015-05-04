$(document).ready(function() {

// Create stomp client over sockJS protocol (see Note 1)
 var socket = new SockJS("/WebSocket/hello");
 var stompClient = Stomp.over(socket);

 // callback function to be called when stomp client is connected to server (see Note 2)
 var connectCallback = function() {
      alert("connected!");
      stompClient.subscribe('/topic/greetings', function(greeting){
      alert(greeting);
           alert(JSON.parse(greeting.body).content);
      });
 };

 // callback function to be called when stomp client+ could not connect to server (see Note 3)
 var errorCallback = function(error) {
      // display the error's message header:
      alert(error.headers.message);
 };

 // Connect as guest (Note 4)
 stompClient.connect("guest", "guest", connectCallback, errorCallback);

$('#sendMsg').click(function(){
    sendMessage($('#messageText').val());
});
function sendMessage(text){
   // jsonMsg='{"content":"'+text+'"}';
    //stompClient.send("/app/hello",text);
     stompClient.send("/app/hello",{}, JSON.stringify({ 'content':text}));
     }
});