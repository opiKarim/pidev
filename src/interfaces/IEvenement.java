/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Evenement;

/**
 *
 * @author Nabil
 */
public interface IEvenement {
        public void ajouterEvenement(Evenement Ev);
        public List<Evenement> afficherEvenement();
        public void supprimerEvenement(int id);
        public void modifierEvenement(Evenement Ev,int idE);
  
}
