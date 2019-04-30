package InterfaceSegregationPrinciple.Good;

public class Good {


}


// interface segregation principle - good example
interface IWorker extends IFeedable, IWorkable {
}



class Worker implements IWorkable, IFeedable{
    public void work() {
        // ....working
    }

    public void eat() {
        //.... eating in launch break
    }
}

class Robot implements IWorkable{
    public void work() {
        // ....working
    }
}

class SuperWorker implements IWorkable, IFeedable{
    public void work() {
        //.... working much more
    }

    public void eat() {
        //.... eating in launch break
    }
}

class Manager {
    IWorkable worker;

    public void setWorker(IWorkable w) {
        worker=w;
    }

    public void manage() {
        worker.work();
    }
}
