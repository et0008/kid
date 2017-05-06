package com.etoak.site.test;

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import javax.swing.text.Highlighter;

/**
 * Created by yinyong on 2017/3/13.
 */
public class OpenCVTest {
    public static void main(String[] ags){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//        Mat m = new Mat(5, 10, CvType.CV_8UC1, new Scalar(0));
//        Mat mr1 = m.row(1);
//        Mat mc5 = m.col(5);
//        mc5.setTo(new Scalar(5));
//        System.out.println("OpenCV Mat data:\n" + m.dump());
        new OpenCVTest().run();
    }
    public void run(){
        System.out.println("--------run-----------");
        //getClass().getResource("/");
        //getClass().getResource("E:/kid/lbpcascade_frontalface.xml").getPath();
        //String xmlfilepath =  getClass().getResource("E:/kid/lbpcascade_frontalface.xml").getPath().substring(1);
        CascadeClassifier faceDetector = new CascadeClassifier("E:/kid/lbpcascade_frontalface.xml");
        Mat image = Imgcodecs.imread("E:/kid/aaa.jpg");
        MatOfRect faceDetections = new MatOfRect();
        faceDetector.detectMultiScale(image, faceDetections);
        System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));
        for (Rect rect : faceDetections.toArray()) {
            Imgproc.rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 255, 0));
        }
        String filename = "faceDetection.png";
        System.out.println(String.format("Writing %s", filename));
        Imgcodecs.imwrite(filename, image);

    }
}
