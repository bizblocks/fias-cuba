Веб-приложения для работы с ГАР ФИАС.  
Для сборки и запуска   
./gradlew build setupTomcat createDb deploy start
gradlew.bar build setupTomcat createDb deploy start

На текущий момент данные загружаются только по одному региону. Runtime свойство приложения fias.fias-service.path указывает на путь к распакованным данным региона. 

Дорожная карта:
* нормализация адресов
* автоматическое обновление данных c сайта ФНС
* загрузка по всем регионам с возможностью выбора
* возможность загрузки напрямую из zip-архива (для экономии дискового пространства)