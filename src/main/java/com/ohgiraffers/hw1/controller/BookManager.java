package com.ohgiraffers.hw1.controller;
import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }
    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook(int index){
        if (index >= 0 && index < bookList.size()) {
            bookList.remove(index);
            System.out.println("도서가 삭제되었습니다.");
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
    }

    public int searchBook(String title){
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }


    public void printBook(int index){
        System.out.println(bookList.get(index));

    }

    public ArrayList<BookDTO> displayAll(){

        return bookList;
    }

    public ArrayList<BookDTO> sortedBookList(int select){

        if (select == 1){
            bookList.sort(new AscCategory());

        } else if (select == 2) {
            bookList.sort(new DescCategory());

            }
        return bookList;
        }


    public void printBookList(ArrayList<BookDTO> br){
    for (BookDTO book : br){
        System.out.println("book = " + book);
    }
    }

}
