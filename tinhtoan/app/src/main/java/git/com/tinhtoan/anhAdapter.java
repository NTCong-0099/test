package git.com.tinhtoan;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.view.LayoutInflater;



import java.util.List;

public class anhAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Anh> anhList;

    public anhAdapter(Context context, int layout, List<Anh> anhList) {
        this.context = context;
        this.layout = layout;
        this.anhList = anhList;
    }

    @Override
    public int getCount() {
        return anhList.size();

    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    private class ViewHoldel {
        ImageView imghinh;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHoldel holdel;

        if (convertView == null) {
            holdel = new ViewHoldel();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holdel.imghinh = (ImageView) convertView.findViewById(R.id.imagehinh);
            convertView.setTag(holdel);
        } else {
            holdel = (ViewHoldel) convertView.getTag();
        }
        Anh anh = anhList.get(position);

        holdel.imghinh.setImageResource(anh.getHinh());

        return convertView;
    }
    }

