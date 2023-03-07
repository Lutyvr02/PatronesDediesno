package TareaParcial2.ej5;

public class client {
    public static void main(String[] args) {
        repositorios repositorio = new repositorios();
        git git = new git();
        developer dev1 =new developer("sgsfdasfgff","asdasdasdasdas");
        developer dev2 = new developer("gweeqwdefsdas","dFADas");
        developer dev3 = new developer("dsfsfsfasfaa","gdsdfasgsdfsadsdsd");
        repositorio.subscription(dev1);
        repositorio.subscription(dev2);
        repositorio.subscription(dev3);

        com commit = new com();
        commit.addCodigo("nuevo main()");
        repositorio.setCommit(commit);
        git.createCommit(repositorio.newMemento("primer Commit","1231236123123/3123123/2021231233"));
        commit.addCodigo("nuevo caminar()");
        repositorio.setCommit(commit);
        git.createCommit(repositorio.newMemento("segundo Commit","712/31231/2023123123"));
        commit.addCodigo("nuevo pensar()");
        repositorio.setCommit(commit);
        git.createCommit(repositorio.newMemento("tercero Commit","8123132/123123123/414124"));
        commit.addCodigo("nuevo comer()");
        repositorio.setCommit(commit);
        git.createCommit(repositorio.newMemento("cuarto Commit","4124123/412412412/5234124123"));
        commit.addCodigo("nuevo aplicarestado()");
        repositorio.setCommit(commit);
        git.createCommit(repositorio.newMemento("quinto Commit","124124123/123123123/4124123123123"));

        System.out.println("restaurar primer Commit");
        commit = repositorio.restoreCommit(git.getCommit("1231236123123/3123123/2021231233"));
        commit.showInfo();

        repositorio.removeDev(dev1);
        repositorio.removeDev(dev2);
        repositorio.removeDev(dev3);
        repositorio.subscription(new developer("hgfsdsgsafs","kjhsgasdhdsgaf"));
        repositorio.subscription(new developer("kjhgfdwSHDGSAF","jdhgsssdhdgsg"));
        repositorio.subscription(new developer("kjhtdgdjfdhfgs","gfasgdhdgsfdhfgsd"));

        System.out.println("Restaurar quinto Commit");
        commit = repositorio.restoreCommit(git.getCommit("1231236123123/3123123/2021231233"));
        commit.showInfo();
    }
}
