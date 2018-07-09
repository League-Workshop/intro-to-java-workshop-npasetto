PImage mustache;
  PImage friend;
void setup(){
  size(500,500);
  friend = loadImage("images.jpeg");
    friend.resize(width,height);
  mustache = loadImage("mustache.jpg");
    mustache.resize(width,height);
}
void draw(){
  background(friend);
  image(mustache, mouseX, mouseY);
  
  
}