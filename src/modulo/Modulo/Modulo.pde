void setup(){
  size(500,500);
  fill(100,0,0);
  ellipse(250,250,50,50);
  
  for(int i=400;i>0;i-=31){
    if(i%2==0){
    fill(255,0,0);
  }
    else{
      fill(0,0,0);
    }
     ellipse(250,250,i,i);
  }
}