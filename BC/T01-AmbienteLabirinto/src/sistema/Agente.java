
package sistema;

import ambiente.*;

import java.util.Random;

/**
 *
 * @author tacla
 */
public class Agente {
    /* referência ao ambiente para poder atuar no mesmo*/
    Model model;
    int ct=-1;
           
    public Agente(Model m) {
        this.model = m;       
    }
    
    /**Escolhe qual ação (UMA E SOMENTE UMA) será executada em um ciclo de raciocínio
     * @return 1 enquanto o plano não acabar; -1 quando acabar
     */
    public int deliberar() {
        ct++;
        
        // @todo
        // Escolher uma e somente uma ação a ser executada pelo agente e retorne 1
        // Chame o método executarIr(<direcao>) sendo que as direcoes possíveis
        // você encontra em comuns.PontosCardeais
        //
        // Para encerrar o ciclo de deliberação do agente, não escolha nenhuma
        // ação e retorne -1 (assim o programa encerra)

        Random rn = new Random();
        int dir = rn.nextInt(8);       //pode ser um rand
        executarIr(dir);

        if (ct > 4)
            return -1;
        
        return 1;

    }
    
    /**Funciona como um driver ou um atuador: envia o comando para
     * agente físico ou simulado (no nosso caso, simulado)
     * @param direcao N NE S SE ...
     * @return 1 se ok ou -1 se falha
     */
    public int executarIr(int direcao) {
        model.ir(direcao);
        return 1; 
    }   
    
    // Sensor
    
}
    

