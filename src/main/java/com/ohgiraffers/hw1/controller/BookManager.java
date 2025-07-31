package com.ohgiraffers.hw1.controller;
import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }
    public void addBook(BookDTO book) {
        bookList.add(new BookDTO(111, 1, "수학세계", "이승민"));
        bookList.add(new BookDTO(112, 3, "과학으로 살아남기", "이스민"));
        bookList.add(new BookDTO(113, 3, "과학?", "이스미"));
        bookList.add(new BookDTO(110, 7, "부처의 말", "이승미"));
        bookList.add(new BookDTO(114, 5, "급류", "잉승민"));
        bookList.add(new BookDTO(115, 3, "과학여행", "임승민"));
        bookList.add(new BookDTO(116, 1, "수학으로 살아님기", "익승민"));
    }

    public void deleteBook(int index){
        bookList.remove(index);
    }
    public int searchBook(String title){
        int i;
    if(bookList.contains(title)){
        return i = 1;
    }else {
        return i = -1;
    }
    }

    public void printBook(int index){
    for (int i = index; i == index; i++){
        System.out.println(bookList.get(i));
    }
    }

    public void displayAll(){

        for (int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i));
        }
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
