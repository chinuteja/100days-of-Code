/*Complete the finction below
Node is as follows
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}*/
class GfG
{
	public static int maxLevelSum(Node root)
         {
             Queue<Node>q=new LinkedList<Node>();
             int sum=0,maxsum=0;
             if(root!=null)
                q.add(root);
                while(!q.isEmpty())
                {
                    int count=q.size();
                    sum=0;
                    while(count-->0)
                    {
                        
                        Node temp=q.poll();
                        sum+=temp.data;
                        if(temp.left!=null)
                            q.add(temp.left);
                        if(temp.right!=null)
                            q.add(temp.right);
                    }
                    maxsum=Math.max(sum,maxsum);
                }
                return maxsum;
          }
}