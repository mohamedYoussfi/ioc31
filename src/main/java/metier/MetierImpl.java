package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Couplage faible
    @Override
    public double calcul() {
        double d=dao.getData();
        double res=d*432;
        return res;
    }

    /**
     * Pour Injecter dans la variable dao un objet d'une classe
     * qui implémenter l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
