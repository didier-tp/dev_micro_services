package tp.service;

import tp.entity.Devise;
import java.util.List;


public interface DeviseService {
     List<Devise> allDevises();
     List<Devise> devisesByChangeMini(double changeMini);
     Devise deviseByCode(String code);
     Devise sauvegarderDevise( Devise devise);//save or update
     double convertir(double montant,
                      String codeDeviseSource,
                      String codeDeviseCible);
     void deleteDeviseByCode(String code);
}
