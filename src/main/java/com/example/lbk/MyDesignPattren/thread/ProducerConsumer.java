package com.example.lbk.MyDesignPattren.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
	
	public static void main(String[] args) {
		ProducerConsumer pc = new ProducerConsumer();
		Storage s = pc.new Storage();
		
		ExecutorService service = Executors.newCachedThreadPool();
        Producer p = pc.new Producer("张三", s);
        Producer p2 = pc.new Producer("李四", s);
        Consumer c = pc.new Consumer("王五", s);
        Consumer c2 = pc.new Consumer("老刘", s);
        Consumer c3 = pc.new Consumer("老林", s);
        service.submit(p);
        //service.submit(p2);
        service.submit(c);
        service.submit(c2);
        service.submit(c3);
	}
	
	/**
	 * 生产者
	 * @author liubo
	 *
	 */
	class Producer implements Runnable{
		
		private String name;
		
		private Storage storage = null;
		
		public Producer(String name, Storage s) {
			this.name = name;
			this.storage = s;
		}
		
		@Override
		public void run() {
			try {
				while(true) {
					Product product = new Product((int) (Math.random() * 10000));
					System.out.println(name + "准备生产(" + product.toString() + ").");
					storage.push(product);
					System.out.println(name + "已生产(" + product.toString() + ").");
					System.out.println("===================");
					Thread.sleep(500);
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}

	/**
	 * 消费者
	 * @author liubo
	 *
	 */
	class Consumer implements Runnable{
		
		private String name;
		
		private Storage storage;
		
		public Consumer(String name, Storage s) {
			this.name = name;
			this.storage = s;
		}

		@Override
		public void run() {
			try {
				while(true) {
					System.out.println(name + "准备消费产品.");
					Product product = storage.pop();
					System.out.println(name + "已消费(" + product.toString() + ").");
					System.out.println("===================");
					Thread.sleep(500);
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

	/**
	 * 产品
	 * @author liubo
	 *
	 */
	class Product {
		
		private int id;
		
		public Product(int id) {
			this.id = id;
		}
		
		public String toString() {
			return "产品：" + this.id;
		}
		
	}

	/**
	 * 仓库--用来存放产品
	 * @author liubo
	 *
	 */
	class Storage {
		
		BlockingQueue<Product> queues = new LinkedBlockingQueue();
		
		/**
	     * 生产
	     * 
	     * @param p
	     *            产品
	     * @throws InterruptedException
	     */
		public void push(Product product) throws InterruptedException {
			queues.put(product);
		}
		
		/**
	     * 消费
	     * 
	     * @param p
	     *            产品
	     * @throws InterruptedException
	     */
		public Product pop() throws InterruptedException {
			return queues.take();
		}
		

	}


}
