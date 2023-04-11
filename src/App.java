import java.util.Base64;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\tToma base64 purinho purinho!\n");
        String filePath = "pdfTeste.pdf";
        File file = new File(filePath);

        byte[] bytes = Files.readAllBytes(file.toPath());
        String encodedFile = Base64.getEncoder().encodeToString(bytes);
        String outputFilePath = "base64purinhoPurinho.txt";
        Files.write(Paths.get(outputFilePath), encodedFile.getBytes(), StandardOpenOption.CREATE);

        System.out.println(encodedFile + "\n\nFim do base64 purinho purinho!\n\n");

        /*
         * // Transforma string base64 em PDF
         * 
         * String filePath = "praticaSQL2.pdf";
         * File file = new File(filePath);
         * 
         * String encodedString =
         * "o4ZeYR6WtB+pAu3L0Z3kV1KeoeVuQhW/i6CY9G9imqC/i5OUcffb4gslP2BYpx/sXnK8SY8xbO4WkRyQ6V2g2QrW1DfxdMOeIRiM27UpMtm49/nMZB3sbUOUSbf3UBTkU3oZY0+qEfkBVqULwGKXPZI/KKaR6gHF2S0L83Nm0AVj3D23LhRendP/QoUidKvWTuh6IHYMgv/w7p003jigXMyn3m/EeepydvCVOyQOofgBqHXmz2InL1w8OVRjFHZv6Lbn35d/e+YXj5U758VX0DhG/pGW6jejb8umszVugoXLCAqY+FskOo/iKTRcJntPFT6Sd0Ct1b405purvnoz7L09CRqa6lWbxLUd9toVaJJmyqwR91cHWbVK7XhJ0fITjgiAso7tX9eIuvZ3iYzvLJVzjC/UtdkdnSjelMftgKShM1aTrlnunjaQvvgYc8ZglrtENvru4S/T7M8G49Ei3h80oSCaUbIpYvAQQwRSIg3SfGiDfv4EhrseFzUlWGpbr0mdz9QtqiZa0g5hQTZK8sHxYU1qNCJQoCITqR7kr7fUyq5/cZWpfE1erPK3i8QB5qZVjvA838HvrevAhJp4BBrkmwa6qchjOZGJoQOkSGJC75D8vi3+UKISqBi0sTjnz7aIHtsXtQVap6Pdy5fJPXZmnOWRHjoCxsFjatgFQyF7x9PVw4psiAqYHEd1AgrpI7E8Bfb+K7Ehd45V2D3Gqn5WYzktbywoMj+KV4pb2CMUrxmx+kqIa02PVodx8dMzFWuk69FJuhDtlPA24EMtzerNV2oZljXKmKpWlnCyvlFL8g029kXOg1mPjtLg8Me28aXW+/pq3TQfx+UqLWEc6O64hEcLAshxHBLlg/S1RZbO2Vkgo15EgcnHpG97eJ1IxMq0/ogrF4BnNjEbThDjsANDwxhFj+zfatkyNIx8FOxdwVNGsH9HMLr2XipGzsMHSaYCR1dTDXmtfu6Z6FLnRYQ69Ooz5tJOkxMjshu65jiC8PdQUV9xIPk/sW2WT8o4BKsh7AVqv5tga0XWzOEojMTGCVPgFjFlnKZV1CVGVvJnTAhcq3SfOHXOWUlLm9mWmrmUCbyERwVrqrpFpNjTZSQj9fbtgw32EjPQD7Am4IJVGuCWsUOWZC93LNzmOYeLyQBTQ/DLBuZWS7UiyJLUq6eWG9rKCisHrKZq/YFa27EGL5a8Kb6IF35EWK2NUMOi25qhm4jQhfJlZNB+fDXMR0FabOi9MmmCcpLivzg8KyYDMAclHt1Hpeq4/xvqfbMIPGvbBS1UN8AkF01LYo7JTVrww+jVoTDvSz5adKEbb6PrOZgfHDQtI8oMj7bdzKYeykdloibhTwcJvh1A0P1fSA==";
         * / Base64
         * 
         * byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
         * // Especifica o mesmo MIME da codificacao
         * OutputStream os = new FileOutputStream(file);
         * os.write(decodedBytes);
         * os.close();
         * System.out.println(os);
         */
    }

}
