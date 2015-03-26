package dbscan;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.CEDD;
import com.LireFeature;


public class GetCEDDforDBSCAN {

	public static void main(String[] args){
		String imagePath = "F:\\stoneforest\\work\\项目\\cluster3\\1\\";
		try {
			File pathFile = new File(imagePath);
			File[] pathLists = pathFile.listFiles();
			int len = pathLists.length;
			File wFile = new File("F:\\stoneforest\\work\\项目\\cluster3\\1.txt");
			
			if(wFile.exists()){
				wFile.delete();
				wFile.createNewFile();
			}else{
				wFile.createNewFile();
			}
			FileWriter fileWritter = new FileWriter(wFile.getName(),true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			for(int i = 0; i < len; i ++){
				if((i % 100) == 0) 
					System.out.println(i);
				execute(pathLists[i],bufferWritter);
				
			}
			bufferWritter.close();
			System.out.println("end");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void execute(File image,BufferedWriter bufferWritter){	
		try {
			BufferedImage bimg = ImageIO.read(image);
			if(bimg == null) return;
		    LireFeature lireFeature = null;
		    Class descriptorClass = CEDD.class;
		    String name= image.getName();
		    name = name.replace(".jpg", "");
		    Double flag = Double.parseDouble(name);
		    try {
				lireFeature = (LireFeature) descriptorClass.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    lireFeature.extract(bimg);
		    float[] f = lireFeature.getFloatFeatureVector();
		    int i = 0;
		    for(i = 0; i < f.length; i++){
		    	bufferWritter.write(f[i] + ",");
		    }
		    bufferWritter.write(flag + "\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
