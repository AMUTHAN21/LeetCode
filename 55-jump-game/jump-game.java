class Solution 
{
    public boolean canJump(int[] nums) 
    {
        int n=nums.length;
        int temp=0;
        for(int i=0;i<n;i++)
        {
            if(i>temp)
            {
                return false;
            }
            temp=Math.max(temp,i+nums[i]);
        }
        return true;        
    }
}