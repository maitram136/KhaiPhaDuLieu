/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong05.logic;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    
    //Thao tac 1: liet ke tat ca cac thu muc va tap tin trong thu muc hien tai
    public File[] getDirectoryContent(String folder){
        File directory = new File(folder);
        if(directory.isFile())
            return null;
        File[] results = directory.listFiles();
        return results;
    }
    
    //Thao tac 2: xuat ket qua
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < content.length; i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    //Thao tac 3: loc ra cac thu muc
    public File[] getSubDirectories(File[] content){
        ArrayList<File> result = new  ArrayList<>();
        for(int i = 0; i < content.length; i++ ){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    //Thao tac 4: loc ra tat ca cac tap tin
    public File[] getFiles(File[] content){
       ArrayList<File> result = new  ArrayList<>();
        for(int i = 0; i < content.length; i++ ){
            if(content[i].isFile()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua); 
    }
    
    //Thao tac 5: Duyet de quy xuat tat ca cac tap tin va thuc muc 
    public void getContentRecursively(String folder){
        File content = new File(folder);       
        //dieu kien dung
        if(content.isFile()){
            System.out.println(content.getPath() + File.separator + content.getName());
            return;
        }
        //cau goi de quy trong stack
        System.out.println("Thư mục: " + folder);
        File[] sub = content.listFiles();
        for(int i = 0; i < sub.length; i++){
            getContentRecursively(folder + File.separator + sub[i].getName());
        }
    }
}
