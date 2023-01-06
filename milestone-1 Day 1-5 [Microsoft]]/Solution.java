class Solution
{
  public List<List<Integer>> combinationSum3(int k, int n) 
  {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> current= new ArrayList<Integer>();
    combinationSum3next(result, current, k, 1, n);
    return result;
  }
  public void combinationSum3next(List<List<Integer>> result, List<Integer> current, int k, int start, int sum)
  {
    if(sum<0)
    {
      return;
    }
    if(sum==0 && current.size()==k)
    {
      result.add(new ArrayList<Integer>(curr));
      return;
    }
    for(int i=start; i<=9; i++)
    {
      current.add(i);
      combinationSum3next(result, current, k, i+1, sum-i);
      current.remove(current.size()-1);
    }
  }
}
