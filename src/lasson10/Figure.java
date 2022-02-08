package lasson10;

public interface Figure {
    //1 - все переменные, которые будут объявлены - по умолчанию:
    // public(доступная)
    // static (общая переменная для всех)
    // final (объявлена единожды - постоянная)
    // 2 - невозможно создать объект этого класса
    // 3 - все методы внутри - public abstract (без реализации)

    double perimetr();

    double sposhad();
}
