package dbscan;

import java.io.File;

/** 
 * @author: tengyl;
 * @email: buaatyl@qq.com;
 * @time��2015��2��5�� ����10:46:55;
 */
public class Rename {
	public static void main(String[] args){
		//action("F:\\stoneforest\\work\\项目\\cluster1\\image\\","F:\\stoneforest\\work\\项目\\cluster1\\image1\\");
		action("F:\\stoneforest\\work\\项目\\cluster3\\2\\", "F:\\stoneforest\\work\\项目\\cluster3\\1\\");
	}
	public static void action(String src, String des){
		File filedir = new File(src);
		File[] files = filedir.listFiles();
		for(int i = 0 ; i < files.length; i++){
			String fileName = files[i].getName();
			File file = new File(src  +  File.separator + fileName);
			file.renameTo(new File(des + File.separator + (i+1) + ".jpg"));
		}
	}
}
