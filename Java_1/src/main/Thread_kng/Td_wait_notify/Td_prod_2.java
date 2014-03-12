package Thread_kng.Td_wait_notify;
import Thread_kng.Td_wait_notify.Prod_1;


class ProdQueue_2{
    private Prod_1[] prod_q;
    private int pRear;
    private int pFront;

    public ProdQueue_2(int len){
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
        while (this.isFull()){
            try{
                this.wait();
            }catch(Exception e){

            }
        }

        prod_q[pRear] = p;
        pRear = ((pRear + 1) + prod_q.length) % prod_q.length;
        this.notify();
    } 

    public synchronized Prod_1 deQueue(){
        while (this.isEmpty()){
            try{
                this.wait();
            }catch(Exception e){

            }
        }  

        int p = pFront;
        pFront = ((pFront + 1) + prod_q.length) % prod_q.length; 
        this.notify();
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

class Producer_2 implements Runnable{
    private ProdQueue_2 pq;
    private int count;
    public Producer_2(ProdQueue_2 pq, int count){
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


class Seller_2 implements Runnable{
    private ProdQueue_2 pq;
    public Seller_2(ProdQueue_2 pq){
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

public class Td_prod_2{
    public static void f(){
        ProdQueue_2 pq = new ProdQueue_2(6);
        Producer_2 producer = new Producer_2(pq,20);
        Seller_2 seller = new Seller_2(pq);

        Thread thrd_prod = new Thread(producer);
        thrd_prod.start();

        Thread thrd_sell = new Thread(seller);
        thrd_sell.start();


    }


    
}
