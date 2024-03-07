package com.example.springbootdemo.backUp;
import java.io.IOException;

public class RestoreMain {
    public static void main(String[] args) {
        RestoreMain restore = new RestoreMain();
        restore.restoreMethod();
    }

    public void restoreMethod() {
        try {
            // 注意：此处使用的是mysql命令而非mysqldump
            String command = "mysql --user=root --password=S10wj25. --host=localhost information_portal < D:\\陈俞宁\\作业\\数据库课程设计\\mainwork\\springbootDemo\\src\\main\\resources\\backUpRes\\backup.sql";
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", command);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("数据库恢复成功！");
            } else {
                System.out.println("错误代码：" + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
