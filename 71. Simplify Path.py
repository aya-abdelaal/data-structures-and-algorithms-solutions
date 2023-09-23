class Solution(object):
    def simplifyPath(self, path):
        """
        :type path: str
        :rtype: str
        """
        stack = []
        res = ""
        str = path.split('/')
        print(str)
        for string in str:
            if(string == ".." and len(stack) != 0):
                stack.pop()
            elif(string != "." and string != "" and string!=".."):
                stack.append(string)
        
        for string in stack:
            res += "/" + string
        if(res =="" ):
            res = "/"
        return res
