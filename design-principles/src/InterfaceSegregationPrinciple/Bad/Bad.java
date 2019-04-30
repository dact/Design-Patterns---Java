package InterfaceSegregationPrinciple.Bad;

import InterfaceSegregationPrinciple.Good.IWorkable;

public class Bad {

}


// interface segregation principle - bad example

/**
 *
 */

interface IWorker {
    public void work();
    public void eat();
}

class Worker implements IWorker{
    public void work() {
        // ....working
    }
    public void eat() {
        // ...... eating in launch break
    }
}

class SuperWorker implements IWorker{
    public void work() {
        //.... working much more
    }

    public void eat() {
        //.... eating in launch break
    }
}

//la mala implementacion aqui es que robot no implementara el metodo comer y no debemos tener metodos sin implementar

class Robot implements IWorker {
    public void work() {
        // ....working
    }

    @Override
    public void eat() {

    }
}

class Manager {
    IWorker worker;

    public void setWorker(IWorker w) {
        worker=w;
    }

    public void manage() {
        worker.work();
    }
}