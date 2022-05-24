package id.gricowijaya.latihan3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

import id.gricowijaya.latihan3.R;

public class NamaMahasiswaAdapter extends
        RecyclerView.Adapter<NamaMahasiswaAdapter.NamaMahasiswaViewHolder>{
    @NonNull
    @Override
    public NamaMahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.activity_baru,
                parent, false);
        return new NamaMahasiswaViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull NamaMahasiswaViewHolder holder, int position) {
        String mCurrent = mNamaMahasiswaList.get(position);
        holder.namaMahasiswaView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mNamaMahasiswaList.size();
    }

    class NamaMahasiswaViewHolder extends RecyclerView.ViewHolder {
        public final TextView namaMahasiswaView;
        final NamaMahasiswaAdapter mAdapter;
        public NamaMahasiswaViewHolder(View itemView, NamaMahasiswaAdapter adapter) {
            super(itemView);
            namaMahasiswaView = itemView.findViewById(R.id.word);
            this.mAdapter = adapter;
        }
    }

    private final LinkedList<String> mNamaMahasiswaList;

    private LayoutInflater mInflater;
    public NamaMahasiswaAdapter(Context context,
                                LinkedList<String> namaMahasiswaList) {
        mInflater = LayoutInflater.from(context);
        this.mNamaMahasiswaList = namaMahasiswaList;
    }
}
