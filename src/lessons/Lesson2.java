package lessons;

import java.io.IOException;
import java.util.logging.*;

public class Lesson2 {

    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Lesson2.class.getName());

//        Куда данные будут логироваться (журналироваться)
//        1 — консоль
//        ConsoleHandler ch = new ConsoleHandler();
//        2 — файл
        FileHandler fhSimple = new FileHandler("src/lessons/log.txt");
//        FileHandler fh = new FileHandler("src/lessons/log.xml");

//        logger.addHandler(ch);
        logger.addHandler(fhSimple);
//        logger.addHandler(fh);

//        Устанавливаем, в каком виде данные выведутся в консоль
//        1 — простой формат данных
        SimpleFormatter sf = new SimpleFormatter();
//        ch.setFormatter(sf);
        fhSimple.setFormatter(sf);
//        2 — XML
//        XMLFormatter xml = new XMLFormatter();
//        ch.setFormatter(xml);
//        fh.setFormatter(xml);

//        logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}
