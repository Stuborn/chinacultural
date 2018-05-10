package cn.dhc.chinacultural.activity;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cn.dhc.chinacultural.R;
import cn.dhc.chinacultural.bean.LanMuYiBean;

/**
 * Created by longzeqiu on 2018/4/26.
 */

public class MyAdapter extends BaseAdapter {

    private Context mContext;
    private LinearLayout linearLayout = null;
    private LayoutInflater inflater;
    private List<LanMuYiBean.RowsBean> mData = new ArrayList<LanMuYiBean.RowsBean>();
    private TextView tex;
    private final int VIEW_TYPE = 4;
    private final int TYPE_1 = 0;
    private final int TYPE_2 = 1;
    private final int TYPE_3 = 2;
    private final int TYPE_4 = 3;

    public MyAdapter(Context context) {
        // TODO Auto-generated constructor stub
        this.mContext = context;
        inflater = LayoutInflater.from(mContext);
    }

    public void setData(List<LanMuYiBean.RowsBean> mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }

    public void addData(List<LanMuYiBean.RowsBean> mData) {
        this.mData.addAll(mData);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        // TODO 自动生成的方法存根
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO 自动生成的方法存根
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO 自动生成的方法存根
        return position;
    }

    //每个convert view都会调用此方法，获得当前所需要的view样式
    @Override
    public int getItemViewType(int position) {
        // TODO Auto-generated method stub
        String templateId = mData.get(position).getTemplateId();
        Log.e("MyAdapter+getitemviewtp",templateId+"dfds");

        if(templateId.equals(0+""))
            return TYPE_1;
        else if(templateId.equals(1+""))
            return TYPE_2;
        else if(templateId.equals(2+""))
            return TYPE_3;
        else
            Log.e("MyAdapter", "zoule");
            return TYPE_4;
    }

    //返回样式的数量
    @Override
    public int getViewTypeCount() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder1 holder1 = null;
        viewHolder2 holder2 = null;
        viewHolder3 holder3 = null;
        viewHolder4 holder4 = null;
        int type = getItemViewType(position);
        Log.e("MyAdapter+getview", String.valueOf(type));
        // 无convertView，需要new出各个控件
        if (convertView == null) {
            Log.e("convertView = ", "###convertView为空###");
            // 按当前所需的样式，确定new的布局
            switch (type) {
                case TYPE_1:
                    convertView = inflater.inflate(R.layout.msg_model1_layout, parent,false);
                    holder1 = new viewHolder1();
                    holder1.iv_r = (ImageView) convertView.findViewById(R.id.iv_r);
                    holder1.title = (TextView) convertView.findViewById(R.id.title);
                    holder1.tv_a = (TextView) convertView.findViewById(R.id.tv_a);
                    holder1.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
                    holder1.iv_p = (ImageView) convertView.findViewById(R.id.iv_p);
                    Log.e("convertView = ", "布局样式一");
                    convertView.setTag(holder1);
                    break;
                case TYPE_2:
                    convertView = inflater.inflate(R.layout.msg_model2_layout, parent,false);
                    holder2 = new viewHolder2();
                    holder2.iv_r = (ImageView) convertView.findViewById(R.id.iv_r);
                    holder2.title = (TextView) convertView.findViewById(R.id.title);
                    holder2.tv_a = (TextView) convertView.findViewById(R.id.tv_a);
                    holder2.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
                    Log.e("convertView = ", "布局样式二");
                    convertView.setTag(holder2);
                    break;
                case TYPE_3:
                    convertView = inflater.inflate(R.layout.msg_model3_layout, parent,false);
                    holder3 = new viewHolder3();
                    holder3.iv_r = (ImageView) convertView.findViewById(R.id.iv_r);
                    holder3.title = (TextView) convertView.findViewById(R.id.title);
                    holder3.tv_a = (TextView) convertView.findViewById(R.id.tv_a);
                    holder3.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
                    holder3.iv1 = (ImageView) convertView.findViewById(R.id.iv1);
                    holder3.iv2 = (ImageView) convertView.findViewById(R.id.iv2);
                    holder3.iv3 = (ImageView) convertView.findViewById(R.id.iv3);
                    Log.e("convertView = ", "布局样式三");
                    convertView.setTag(holder3);
                    break;
                case TYPE_4:
                    ImageView iv_r;
                    TextView title;
                    TextView tv_a;
                    TextView tv_time;
                    ImageView iv_p;
                    convertView = inflater.inflate(R.layout.msg_model4_layout, parent,false);
                    holder4 = new viewHolder4();
                    holder4.iv_r = (ImageView) convertView.findViewById(R.id.iv_r);
                    holder4.title = (TextView) convertView.findViewById(R.id.title);
                    holder4.tv_a = (TextView) convertView.findViewById(R.id.tv_a);
                    holder4.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
                    holder4.iv_p = (ImageView) convertView.findViewById(R.id.iv_p);
                    Log.e("convertView = ", "布局样式三");
                    convertView.setTag(holder4);
                    break;
            }
        } else {
            // 有convertView，按样式，取得不用的布局
            switch (type) {
                case TYPE_1:
                    holder1 = (viewHolder1) convertView.getTag();
                    Log.e("convertView= ", "布局样式一");
                    break;
                case TYPE_2:
                    holder2 = (viewHolder2) convertView.getTag();
                    Log.e("convertView= ", "布局样式二");
                    break;
                case TYPE_3:
                    holder3 = (viewHolder3) convertView.getTag();
                    Log.e("convertView= ", "布局样式三");
                    break;
                case TYPE_4:
                    holder4 = (viewHolder4) convertView.getTag();
                    Log.e("convertView= ", "布局样式三");
                    break;
            }
        }

        // 设置资源
        switch (type) {
            case TYPE_1:
                holder1.title.setText(mData.get(position).getTitle());
                holder1.tv_a.setText(mData.get(position).getPublishTime());
                holder1.tv_time.setVisibility(View.GONE);
                break;
            case TYPE_2:
                holder2.title.setText(mData.get(position).getTitle());
                holder2.tv_a.setText(mData.get(position).getPublishTime());
                holder2.tv_time.setVisibility(View.GONE);
                break;
            case TYPE_3:
                holder3.title.setText(mData.get(position).getTitle());
                holder3.tv_a.setText(mData.get(position).getPublishTime());
                holder3.tv_time.setVisibility(View.GONE);
//                holder3.textView.setText(Integer.toString(position));
//                holder3.imageView.setBackgroundResource(R.drawable.icon);
                break;
            case TYPE_4:
                holder4.title.setText(mData.get(position).getTitle());
                holder4.tv_a.setText(mData.get(position).getPublishTime());
                holder4.tv_time.setVisibility(View.GONE);
//                holder3.textView.setText(Integer.toString(position));
//                holder3.imageView.setBackgroundResource(R.drawable.icon);
                break;
        }

        return convertView;
    }

    // 各个布局的控件资源
    class viewHolder1 {
        ImageView iv_r;
        TextView title;
        TextView tv_a;
        TextView tv_time;
        ImageView iv_p;
    }

    class viewHolder2 {
        ImageView iv_r;
        TextView title;
        TextView tv_a;
        TextView tv_time;
    }

    class viewHolder3 {
        ImageView iv_r;
        TextView title;
        TextView tv_a;
        TextView tv_time;
        ImageView iv1;
        ImageView iv2;
        ImageView iv3;
    }

    class viewHolder4 {
        ImageView iv_r;
        TextView title;
        TextView tv_a;
        TextView tv_time;
        ImageView iv_p;
    }

}
