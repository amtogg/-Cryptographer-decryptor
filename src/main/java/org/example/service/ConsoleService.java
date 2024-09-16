package org.example.service;

import org.example.model.HackModel;
import org.example.model.CryptoModel;

import java.util.Scanner;

import static org.example.constants.Constants.*;

public class ConsoleService {
    CryptoModel cryptoModel = new CryptoModel();

    private final Scanner scanner;
    public ConsoleService(Scanner scanner){
        this.scanner = scanner;
    }
    HackModel hackModel = new HackModel();



    public CryptoModel enterCryptoData(String enterFileNameToEncrypt) {

        System.out.println(enterFileNameToEncrypt);
        cryptoModel.setFileSourcePath(scanner.nextLine());

        System.out.println(ENTER_FILE_NAME_SAVE);
        cryptoModel.setFileSavePath(scanner.nextLine());

        System.out.println(ENTER_KEY);
        cryptoModel.setKey(scanner.nextInt());

        return cryptoModel;
    }
    public HackModel enterBruteData (){

        System.out.println(ENTER_FILE_NAME_ENCRYPTED);
        hackModel.setEncryptedFileNamePath(scanner.nextLine());

        System.out.println(ENTER_FILE_NAME_EXAMPLE);
        hackModel.setExampleFileNamePath(scanner.nextLine());

        System.out.println(ENTER_FILE_NAME_HACK_RESULT);
        hackModel.setHackResultFileNamePath(scanner.nextLine());

        return hackModel;
    }
}
