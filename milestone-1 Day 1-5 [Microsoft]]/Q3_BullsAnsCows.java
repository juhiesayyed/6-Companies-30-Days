class Solution {
    public String getHint(String secret, String guess) {
        List<Character> sec=new ArrayList<>();
        List<Character> gus=new ArrayList<>();

    int i=0;
        for(i=0;i<secret.length();i++)
        {
            sec.add(secret.charAt(i));
            gus.add(guess.charAt(i));
        }
        int countequal=0;
        List<Integer> com=new ArrayList<>();
        for(i=0;i<gus.size();i++)
        {
            if(gus.get(i)==sec.get(i))
            {
                countequal++;
                com.add(i);
            }
        }
        int t=0;
        for(int m=0;m<com.size();m++)
        {
            int h=com.get(m);
            gus.remove(h-t);
            sec.remove(h-t);
            t++;
        }
        
        int cow=0;
        List<Integer> visited=new ArrayList<>();
        int flag=0;
        for(i=0;i<sec.size();i++)
        {
            char c=sec.get(i);
            flag=0;
            for(int j=0;j<gus.size();j++)
            {
                if(c==gus.get(j))
                {
                    for(int k=0;k<visited.size();k++)
                    {
                        if(visited.get(k)==j)
                        {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)
                    {
                    visited.add(j);
                    cow++;//1|
                    break;
                    }
                    flag=0;
                    
                }
            }
        }
        
        String out=String.valueOf(countequal)+String.valueOf('A')+String.valueOf(cow)+String.valueOf('B');
        return out;

    }
}
