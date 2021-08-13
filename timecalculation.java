public class timecalculation {
    public static void main(String args[])
    {
	    int r=32,k=40,h1=6,h2=5;
	    float s=r/(float)h1;
	    float km=k/(float)h2;
        float z=(s+km);
	    float time=110/z;
	    int hour=(int)time;int mins = (int)((time-hour)*100);
	    int minutes= (mins*60/100);
	    System.out.println("The time taken by both to complete 110 pages is : "+hour+" hours "+minutes+" minutes");
	
    }
}
