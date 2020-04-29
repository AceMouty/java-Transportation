package transport;

/*
 
 An interface declares what methods a class HAS TO HAVE!
 Interfaces contain methods ONLY no fields.
 By deaflut inteface methods are protected
  This means that only the parent and child konw about any of these methods.

 */

public interface Animal {

  void move();
  void eat(int i);
  String speak();

}