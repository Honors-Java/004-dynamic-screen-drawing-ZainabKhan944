void setup() {
	size(300, 300);

}

void draw(){

}

void mousePressed() {
  stroke(0);
  fill(mouseX, mouseY, 0);
  rectMode(CENTER);
  rect(mouseX, mouseY, mouseX + 1, 10);
  println("pushed mouse!");

}



void keyPressed(){
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 20, 20);
  println("pushed mouse!");

}






//dont forget to add mouse and keypressed interaction functions