package week5.weeklyTechnicalContent1.innerClass;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder>{

    public BookAdapter(){

    }
    @Override
    BookViewHolder onCreateViewHolder() {
        return new BookViewHolder();
    }
    @Override
    void onBindViewHolder(BookViewHolder holder) {}
    @Override
    int getItemCount(){
        return 5;
    }
    public class BookViewHolder {}
}
