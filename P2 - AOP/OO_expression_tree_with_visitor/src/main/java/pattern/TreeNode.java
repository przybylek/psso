//abstract superclass of both tree elements (simple, binary)

package pattern;

public interface TreeNode {
  public abstract String getLabel() ;
  public abstract void accept(Visitor v);// enable visitation - makes pattern work
}