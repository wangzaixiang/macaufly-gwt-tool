Hostpage module is a module to help you to join modules in one
module .

Features:

1.you can create components between modules .
it mean the module is not a page , it only do one thing: to registe a
component factory to hostpage.and the page can find this factory to
create this module .it make your page compositional  .

2.subscribe service between modules
for example , you can subscribe  login event / logout event from
LoginModule .
than the loginModule fire a login event when the User is login . and
logout event when he is logout.


code url :
http://code.google.com/p/macaufly-gwt-tool/downloads/list

demo url:
http://jiangyongyuan.javaeye.com/blog/148162