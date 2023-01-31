class pi 
{
    public static void main(String args[])
    {
        boolean turn=true;
        double pi=0;
        for(int i=1;i<2000;i+=2)
        {
            if(turn)
            {
                pi += (double)4/i;
                turn=false;
            }
            else
            {
                pi -= (double)4/i;
                turn=true;
            }
        }
        System.out.println(pi);
    }
}