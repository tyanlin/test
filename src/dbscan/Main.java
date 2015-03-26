package dbscan;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e = 3;// if disdance less than this ,the point is in the cluster
		int k = 7;// if the number of point more than k, this cluster is core cluster
		/**
		 * e = 3, k = 7; 欧氏距离   oushi
		 * **/
		String fileName = "5K.txt";
		long beginTime = System.currentTimeMillis();
		DBSCAN d = new DBSCAN();
		Util u = new Util();
		d.run(e, k, u.readFile(fileName));
		long endTime = System.currentTimeMillis();
		System.out.println( "cost time :" + (endTime - beginTime)/1000 + "s");
	}
}
