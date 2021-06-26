package Command;

import CollectionElements.User;
import Other.CollectionManager;

/**
 * Класс для команды execute_script
 */
public class ComScript extends CommandAbstract {
    public ComScript() {
        super("execute_script",
           "считать и исполнить скрипт из указанного файла(при вводе указывать полный путь). В скрипте содержатся команды в " +
                   "таком же виде, в котором их вводит пользователь в интерактивном режиме");
    }

    @Override
    public String execute(Object args, CollectionManager colMan, User user) {
        return "Поиск файла";
    }
}

