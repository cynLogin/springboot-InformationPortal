package com.example.springbootdemo.backUp;

import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class backUpMain {
    public static void main(String[] args) {
        backUpMain back=new backUpMain();
        back.backUpMainMethod();
    }

    public void backUpMainMethod() {
        try {
            String command = "mysqldump --user=root --password=S10wj25. --host=localhost information_portal > D:\\陈俞宁\\作业\\数据库课程设计\\mainwork\\springbootDemo\\src\\main\\resources\\backUpRes\\backup.sql";
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", command);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("数据库备份成功！");
            } else {
                System.out.println("error!"+exitCode);
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
