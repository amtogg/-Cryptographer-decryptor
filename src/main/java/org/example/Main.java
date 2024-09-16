package org.example;

import org.example.model.HackModel;
import org.example.model.CryptoModel;
import org.example.service.BruteForceService;
import org.example.service.ConsoleService;
import org.example.service.CryptoService;

import java.util.Scanner;

import static org.example.constants.Constants.*;


public class Main {


    public static void main(String[] args) {

        CryptoService cryptoService = new CryptoService();
        CryptoModel cryptoModel = new CryptoModel();
        Scanner scanner = new Scanner(System.in);
        ConsoleService consoleService = new ConsoleService(scanner);
        HackModel hackModel = new HackModel();
        BruteForceService bruteForceService = new BruteForceService();
        Integer value = 3;
        switch (value) {
            // cryptText
            case 1:
                cryptoModel = consoleService.enterCryptoData(ENTER_FILE_NAME_ENCRYPTION);
                cryptoService.cryptText(cryptoModel);
                break;
            case 2:
                //deCryptText
                cryptoService.deCryptText(consoleService.enterCryptoData(ENTER_FILENAME_DECRYPTION));// TODO vernyt kak case 1 и разобраться почему не работает

                break;
            case 3:
                // brute force decrypt
                hackModel = consoleService.enterBruteData();
                bruteForceService.hackBruteForce(hackModel);

                break;
                case 4:
                    // statistical analysis decrypt


            }

        System.out.println(cryptoModel.getFileSourcePath() + " " + cryptoModel.getFileSavePath() + " " + cryptoModel.getKey());
        System.out.println(hackModel.getEncryptedFileNamePath() + " " + hackModel.getExampleFileNamePath() + " " + hackModel.getHackResultFileNamePath());

    }


}
