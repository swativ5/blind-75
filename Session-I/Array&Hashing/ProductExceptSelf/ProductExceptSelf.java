// package ProductExceptSelf;

// public class ProductExceptSelf {
//     public int[] productExceptSelf(int[] nums) {
//         int[] prefix = new int[nums.length];
//         int[] postfix = new int[nums.length];

//         prefix[0] = 1;
//         for (int i = 1; i < nums.length; i++)   {
//             prefix[i] = prefix[i-1] * nums[i-1];
//         }

//         postfix[-1] = 0;
//         for (int i = nums.length - 2; i >= 0; i--)  {
//             postfix[i] = postfix[i+1] * nums[i+1];
//         }

//         int ans[]=  new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             ans[i] = prefix[i] * postfix[i];
//         } 
//         return ans;
//     }


// }
