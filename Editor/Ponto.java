public class Ponto extends AbstractFigura {
    int raio = 1;
    
    public Ponto(int _cx, int _cy, double _r, double _g, double _b) {
        super(_cx, _cy, _r, _g, _b);
    }
    
    public void desenhar(ModeloCanvas mc) {
        mc.circulo(x, y, raio, r, g, b);
    }
    
    public boolean dentro(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) +
                         Math.pow(y - this.y, 2)) <= raio;
    }
}