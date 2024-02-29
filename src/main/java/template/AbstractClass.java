package template;

public abstract class AbstractClass {
    /**
     * template method method defines the steps/skeleton for an algorithm.
     */
    final void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    /**
     * the concrete method may be used by the other method of this class, or from the subclasses.
     * But it's not possible to override the implementation of these methods.
     */
    protected final void concreteOperation() {

    }

    /**
     * subclasses needs to provide the implementation for primitiveOperation2
     */
    protected abstract void primitiveOperation2();

    /**
     * subclasses needs to provide the implementation for primitiveOperation2
     */
    protected abstract void primitiveOperation1();

    /**
     * A concrete method, but it does nothing. We can also have concrete methods that do nothing by default.
     * We call these "hooks". Subclasses are free to override these but don't have to.
     * A hook is a method that is declared in the abstract class, but only given an empty or default implementation.
     * This gives subclasses the ability to “hook into” the algorithm at various points, if they wish; a subclass is also free to ignore the hook.
     */
    protected void hook() {

    }
}
