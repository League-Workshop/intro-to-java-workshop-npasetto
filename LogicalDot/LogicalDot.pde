void setup(){
  size(500,500);
}
void draw(){
  if(mousePressed){
    fill(32,180,198);
    ellipse(250,250,200,200);
  }else{
    fill(62,198,32);
    ellipse(250,250,300,300);
  }
}