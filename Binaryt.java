class Binaryt
{
 Nodex root;
 Binaryt(int key)
 {
    root=new Nodex(key);
        }
  Binaryt(){
    root=null;
    }  
  public static void main(String args[])
  {
    Binaryt tree=new Binaryt();
    tree.root=new Nodex(1);
    tree.root.left=new Nodex(2);
    tree.root.right=new Nodex(3);
    tree.root.left.left=new Nodex(4);
    
    
    }
}