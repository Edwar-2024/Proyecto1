class Cliente
{

    private int codigo;
    private String nombre;
    public Cliente(int codigo, String nombre)
    {
        this.codigo=codigo;
        this.nombre=nombre;
    }

    public int getCodigo()
    {
           return codigo; 
    }

    public String getNombre()
    {
        return nombre;
    }
}