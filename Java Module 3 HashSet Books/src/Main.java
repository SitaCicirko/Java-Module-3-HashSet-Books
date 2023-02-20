import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Books {

    String title;
    String author;
    int publicationDate;

    public Books(String title, String author, int publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public boolean equals(Object o) {
        Books b = (Books) o;
        return this.title.equals(b.title) && this.author.equals(b.author);
    }
    @Override
    public int hashCode() {
        return publicationDate;
    }

    public String toString() {
        return title + ", author: " + author + ", published in: " + publicationDate;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class HashSetExample {

    public static void main (String[] args) throws java.lang.Exception {
        Books booksList1 = new Books("Zorro", "Isabel Allende", 1919 );
        Books booksList2 = new Books( "The da Vinci code", "Dan Brown", 2003);
        Books booksList3 = new Books("Earthsea", "Ursula Le Guin", 1968);
        Books booksList4 = new Books("Dune","Frank Herbert",1965);
        Books booksList5 = new Books( "Homo Deus", "Yuval Noah Harari", 2015);

        Set<Books> bookSet = new HashSet<>();
        bookSet.add(booksList1);
        bookSet.add(booksList2);
        bookSet.add(booksList3);
        bookSet.add(booksList4);
        bookSet.add(booksList5);

        for (Books theBooks : bookSet){
            System.out.println(theBooks);
        }

        for (Books theBook: bookSet) {
            if (theBook.publicationDate <= 2010) {
                System.out.println(theBook);
            }
        }
    }
}