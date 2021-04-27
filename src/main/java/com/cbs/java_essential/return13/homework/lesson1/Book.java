package com.cbs.java_essential.return13.homework.lesson1;

//       Задание 3
//       Используя IDEA, создайте проект c пакетом. Требуется: Создать класс Book(Main).
//       Создать классы Title, Author и Content, каждый из которых должен содержать одно строковое поле и метод void show ().
//       Реализуйте возможность добавления в книгу названия книги, имени автора и содержания.
//       Выведите на экран при помощи метода show() название книги, имя автора и Содержание.

public class Book {
    public static void main(String[] args) {
        Title title = new Title();
        title.setTitle("Человек невидимка");
        Author author = new Author();
        author.setAuthor("Герберт Уэллс");
        Content content = new Content();
        content.setContent("В этом романе описывается судьба английского учёного-медика, а впоследствии физика Гриффина, который изобрёл аппарат, делающий человека невидимым ");
        System.out.println(author.getAuthor());
        System.out.println(title.getTitle());
        System.out.println(content.getContent());
        System.out.println("-----------------------------------------------------------------------------\n");

        title.show();
        author.show();
        content.show();


    }
}

class Title {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void show() {
        System.out.println(title);
    }
}

class Author {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void show() {
        System.out.println(author);
    }
}

class Content {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println(content);
    }
}