package edu.temple.fan;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class EventAdapter extends BaseAdapter {
    Context context;
    String[] events;

    public EventAdapter(Context context, String[] events){
        this.context = context;
        this.events = events;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        final int[] eventsColor = {Color.WHITE, Color.RED, Color.YELLOW, Color.GREEN};// Color.BLUE, Color.CYAN, Color.BLACK, Color.MAGENTA, Color.GRAY, Color.LTGRAY, Color.DKGRAY};

        TextView textView;
        if (convertView == null) {
            textView = new TextView(context);
        } else {
            textView = (TextView) convertView;
        }
        textView.setText(getItem(position).toString());
        textView.setBackgroundColor(eventsColor[position % eventsColor.length]);


        return textView;
    }
}
