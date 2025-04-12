package week5.weeklyTechnicalContent1.innerClass;

public class RecyclerView {
    public abstract static class Adapter<VH>{
        abstract VH onCreateViewHolder();
        abstract void onBindViewHolder(VH holder);
        abstract int getItemCount();
    }
}
