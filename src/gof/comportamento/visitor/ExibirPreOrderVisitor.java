package gof.comportamento.visitor;

/**
 * @author gabriel.freitas
 */
public class ExibirPreOrderVisitor implements ArvoreVisitor {

    @Override
    public void visitar(No no) {
        if (no == null)
            return;
        System.out.println(no);
        visitar(no.getEsquerdo());
        visitar(no.getDireito());
    }

}
