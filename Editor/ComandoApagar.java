/**
 * Created by vitor on 22/06/16.
 */
public class ComandoApagar implements Comando {
    Figura fig;

    public ComandoApagar(Figura fig){
        this.fig = fig;
    }

    @Override
    public void desfazer(ModeloEditor modelo) {

    }

    @Override
    public void refazer(ModeloEditor modelo) {

    }
}
