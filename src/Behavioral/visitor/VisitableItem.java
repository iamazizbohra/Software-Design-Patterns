package Behavioral.visitor;

public interface VisitableItem {
    public int accept(IShoppingCartVisitor visitor);
}
