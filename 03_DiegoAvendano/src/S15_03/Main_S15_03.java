package S15_03;
/**
 * @author 03_DiegoAvendano
 */
public class Main_S15_03 {
    public static void main(String[] args) {
        //Objetos 03_DiegoAvendano
        
        //Objeto profesor_03 03_DiegoAvendano
        profesor_03 objPro = new profesor_03();
        objPro.darClases();
        objPro.darExamen();
        objPro.darNotas();
        objPro.horasDeTrabajo();
        
        //Objeto auxiliar_03 03_DiegoAvendano
        auxiliar_03 objAux = new auxiliar_03();
        objAux.controlDeSalon();
        objAux.darComunicados();
        objAux.realizarRequisas();
        objAux.tomarAsistencia();
        
        
        //Objeto estudiante_03 03_DiegoAvendano
        estudiante_03 objEst = new estudiante_03();
        
        //Objeto director_03 03_DiegoAvendano
        director_03 objDir = new director_03();
        
    }
    
    
}
