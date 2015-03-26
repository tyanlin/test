package dbscan;

import java.io.File;
import java.util.Hashtable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "F:\\stoneforest\\work\\项目\\cluster3\\2\\";
		File file = new File(path);
		File[] fileList = file.listFiles();
		for(int i = 0; i < fileList.length; i ++){
			String name = fileList[i].getName();
			if(name.endsWith(".ok")){
				fileList[i].delete();
			}
		}			
	}

}
