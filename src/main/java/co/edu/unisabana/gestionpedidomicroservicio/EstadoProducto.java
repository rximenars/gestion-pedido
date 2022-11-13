public class EstadoProducto
{
    private State myState;

    public void setState (State st)
    {
        this.myState = st;
    }

    public void executeAction()
    {
        myState.executeAction();
    }
}
