class Test
{
    public static void main (String[] args) 
    {
            //An integer can be null, so this is fine
            Integer i = null;
            Integer j= (Integer) null;
            Integer k= (Integer) null;
            Integer l=i;
            System.out.println(l);
             
            //Unboxing null to integer throws NullpointerException
            //int a = i;
    }
}