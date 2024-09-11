package org.example;

import org.example.model.CryptoModel;
import org.example.service.ConsoleService;
import org.example.service.CryptoService;

import java.util.Scanner;

import static org.example.constants.Constants.ENTER_FILENAME_DECRYPTION;
import static org.example.constants.Constants.ENTER_FILE_NAME_ENCRYPTION;


public class Main {


    public static void main(String[] args) {

        CryptoService cryptoService = new CryptoService();
        CryptoModel cryptoModel = new CryptoModel();
        Scanner scanner = new Scanner(System.in);
        ConsoleService consoleService = new ConsoleService(scanner);
        Integer value = 2;
        switch (value) {
            // шифровка
            case 1:
                cryptoModel = consoleService.enterData(ENTER_FILE_NAME_ENCRYPTION);
                cryptoService.crypt(cryptoModel);
                break;
            case 2:
                //расшифровка
                cryptoModel = consoleService.enterData(ENTER_FILENAME_DECRYPTION);
                cryptoService.deCryptText(cryptoModel);

                break;
        }
        System.out.printf(cryptoModel.getFileSourcePath() + " " + cryptoModel.getFileSavePath() + " " + cryptoModel.getKey());


    }


}
