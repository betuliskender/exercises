void setup() {
  size (500, 500);
  noStroke();
  frameRate(30);
  rectMode(CENTER);
  fill(0);
  rect(height/2, width/2, 200, 400);
  ellipseMode(CENTER);
  //Red light
  fill(40);
  ellipse(height/2, width/2-110, 100, 100);
  //Yellow light
  fill(40);
  ellipse(height/2, width/2, 100, 100);
  //Green light
  fill(40);
  ellipse(height/2, width/2+110, 100, 100);
}

void draw() {
  //Red light counter
  if (frameCount >= 0 && frameCount <=100) {
    fill(255, 0, 0);
    ellipse(height/2, width/2-110, 100, 100);
  }
  //Yellow light counter
  if (frameCount >= 100 && frameCount <=150) {
    fill(255, 255, 0);
    ellipse(height/2, width/2, 100, 100);
    //Green light counter
  } else if (frameCount > 150) {
    fill(40);
    ellipse(height/2, width/2-110, 100, 100);
    fill(40);
    ellipse(height/2, width/2, 100, 100);
    fill(0, 255, 0);
    ellipse(height/2, width/2+110, 100, 100);
  }
}
