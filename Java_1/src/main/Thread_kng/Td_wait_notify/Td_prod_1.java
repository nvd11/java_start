package Thread_kng.Td_wait_notify;

class Prod_1{
    private int id;
    public int getId(){
        return this.id;
    }
    public Prod_1(int id){
        this.id = id;
    }
}

class ProdQueue_1{
    private Prod_1[] prod_q;
    private int pRear;
    private int pFront;

    public ProdQueue_1(int len){
        prod_q = new Prod_1[len + 1]; //array queue. set the max length = capacity + 1
        pRear = 0;
        pFront = 0;
    }

    public int getLen(){
        return (pRear - pFront + prod_q.length) % prod_q.length;
    }
    
    public boolean isEmpty(){
        return (pRear == pFront);
    }

    public boolean isFull(){
        return ((pRear + 1) % prod_q.length == pFront); 
    } 

    public synchronized void enQueue(Prod_1 p){
        if (this.isFull()){
            throw new RuntimeException("the warehouse is full!");
        }

        prod_q[pRear] = p;
        pRear = ((pRear + 1) + prod_q.length) % prod_q.length;
    } 

    public synchronized Prod_1 deQueue(){
        if (this.isEmpty()){
            throw new RuntimeException("the warehouse is empty!");
        }  

        int p = pFront;
        pFront = ((pFront + 1) + prod_q.length) % prod_q.length; 
        return prod_q[p];
    } 

    public String toString(){
        if (this.isEmpty()){
            return "warehose: empty!";
        }
        StringBuffer s = new StringBuffer("count is " + this.getLen() + ": ");  
        int i;
        for (i=pFront; i != pRear; ){
            s = s.append(prod_q[i].getId() + ",");
            i = ((i+1) + prod_q.length) % prod_q.length;
        }
        s = s.delete(s.length() - 1,s.length());
        return s.toString();
    } 
}

class Producer_1 implements Runnable{
    private ProdQueue_1 pq;
    private int count;
    public Producer_1(ProdQueue_1 pq, int count){
        this.pq = pq;
        this.count = count;
    }

    private void thrdSleep(int ms){
        try{
             Thread.sleep(ms);
        }catch(Exception e){

        }
    }

    public void run(){
        Prod_1 p;
        int i;
        for (i=0; i<count; i++){
            this.thrdSleep(1000);
            p = new Prod_1(i);
            pq.enQueue(p);
            System.out.printf("Producer: made the product %d\n", p.getId());
        }
    }
    
}


class Seller_1 implements Runnable{
    private ProdQueue_1 pq;
    public Seller_1(ProdQueue_1 pq){
        this.pq = pq;
    }

    private void thrdSleep(int ms){
        try{
             Thread.sleep(ms);
        }catch(Exception e){

        }
    }

    public void run(){
        Prod_1 p;
        while(true){
            this.thrdSleep(2000);
            p = pq.deQueue();
            System.out.printf("Seller: sold the product %d\n", p.getId());
        }
    }

}

public class Td_prod_1{
    public static void f(){
        ProdQueue_1 pq = new ProdQueue_1(6);
        Producer_1 producer = new Producer_1(pq,20);
        Seller_1 seller = new Seller_1(pq);

        Thread thrd_prod = new Thread(producer);
        thrd_prod.start();

        Thread thrd_sell = new Thread(seller);
        thrd_sell.start();


    }

    public static void f1(){
        ProdQueue_1 pq = new ProdQueue_1(6);
        Prod_1 p;

        p = new Prod_1(1);
        pq.enQueue(p);

        p = new Prod_1(2);
        pq.enQueue(p);

        p = new Prod_1(3);
        pq.enQueue(p);
        p = new Prod_1(4);
        pq.enQueue(p);
        p = new Prod_1(5);
        pq.enQueue(p);
        p = new Prod_1(6);
        pq.enQueue(p); 

        pq.deQueue();
        pq.deQueue();
        p = new Prod_1(7);
        pq.enQueue(p);
        p = new Prod_1(8);
        pq.enQueue(p);
        //p = new Prod_1(9);
        //pq.enQueue(p);
        System.out.println(pq.toString());
    }

    
}
