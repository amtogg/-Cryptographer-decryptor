package org.example.service;

import org.example.model.CryptoModel;

public class  CryptoService {


        public void cryptText(CryptoModel cryptoModel){

                cryptoModel.setKey(cryptoModel.getKey() +1);
        }

        public CryptoModel deCryptText(CryptoModel cryptoModel) {
                cryptoModel.setKey(cryptoModel.getKey() -1);
                return cryptoModel;
        }

        public void bruteForce (){

        }
        //  public String encrypt (CryptoModel cryptoModel) {

//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(cryptoModel.getFileSourcePath()))) {
//            String tempLine =  bufferedReader.readLine();
//            while (tempLine != null) {
//                System.out.println(tempLine);
//            }
//        } catch (IOException e) {
//            System.err.println("Не удалось прочитать файл");
//        }

//        checkNullParamOnCrypt(cryptoModel);
        //     return "файл успушно зашифрован";
        //}
//    public String deCrypt (CryptoModel cryptoModel){
//       // checkNullParamOnCrypt(cryptoModel);
//        return "файл успешно расшифрован";
//    }

//    private static String checkNullParamOnCrypt(CryptoModel cryptoModel) {
//        if (cryptoModel.getFileSourcePath() == null) {
//            return "Невозможно найти файл для шифрования";
//        }
//        if (cryptoModel.getFileSavePath() == null){
//
//        }
//        if (cryptoModel.getKey() == null){
//            return "Невозможно найти ключ шифрования";
//        }
//        return null;
//    }

}
