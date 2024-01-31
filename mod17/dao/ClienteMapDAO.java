import generic.GenericDAO;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO {
    
    public ClienteMapDAO() {
        super();	
     }

    @Override
    public Class<Cliente> getTipoClasse() {
        // TODO Auto-generated method stub
        return null;
    }     
}
