# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        res = []
        if(root == None): return res
        list = [root]
        while(list):
            newList =[]
            currList = []
            for node in list:
                if(node.left != None): newList.append(node.left)
                if(node.right != None ): newList.append(node.right)
                currList.append(node.val)
            res.append(currList)
            list = newList
        return res
        
