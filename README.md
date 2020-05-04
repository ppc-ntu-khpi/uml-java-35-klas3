<img src="/other/RemoteStudyingClassDiagram.jpg" width="100%"/>

# Практична робота "Проектування ієрархії класів. Використання UML"

Цей репозиторій містить **автоматично згенерований код** за допомогою платформи для створення UML діаграм [GenMyModel](http://www.genmymodel.com/).

## Тема роботи: система керування дистанційним навчанням
У проекті було створено такі **основні** моделі даних:
1. **User** - користувач, який може бути як і студентом, так і викладачем (в залежності від того чи створив він курс)
2. **Listener** - слухач, який навчається на даному курсі.
3. **Course** - курс, на якому навчаються слухачі та дає завдання викладач.
4. **Task** - завдання на курсі, яке створює викладач і виконує слухач.
5. **Mark** - оцінка, яка ставиться викладачем слухачу за виконане завдання.

Також були створені **допоміжні** класи для роботи з цими моделями:
1. **UserReository** - клас для роботи з користувачем.
2. **CourseRepoistory** - клас для роботи з курсами, та всьому, що в ньому знаходиться.
