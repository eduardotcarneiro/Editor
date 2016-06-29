/**
 * Created by vitor on 22/06/16.
 */
public class ModoApagar implements ModoEditor {
    ModeloEditor modelo;
    Figura fig;

    public ModoApagar(ModeloEditor modelo){
        this.modelo = modelo;
    }

    @Override
    public void inicio(int x, int y) {
        for(Figura f: modelo.figuras){
            if(f.dentro(x,y)){
                fig = f;
                break;
            }
        }
    }

    @Override
    public void meio(int x, int y) {
        if(fig != null){

        }
    }

    @Override
    public void fim(int x, int y) {

    }

    @Override
    public String tag() {
        return "apaga";
    }
}
