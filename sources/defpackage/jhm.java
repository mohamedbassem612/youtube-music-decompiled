package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jhm extends ArrayAdapter implements SpinnerAdapter {
    private final Context a;
    private final int b;
    private final int c;
    private final int d;

    public jhm(Context context, int i) {
        super(context, R.layout.music_sort_filter_sub_menu_item);
        this.a = context;
        this.b = R.layout.sort_filter_spinner_contents;
        this.c = R.layout.music_sort_filter_sub_menu_item;
        this.d = i;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(R.layout.sort_filter_sub_menu_dropdown_item, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.item_text);
        aqav aqavVar = (aqav) getItem(i);
        if (aqavVar != null) {
            textView.setText(aqavVar.e);
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (viewGroup instanceof AdapterView) {
            i = ((AdapterView) viewGroup).getSelectedItemPosition();
        }
        if (view != null) {
            Boolean bool = Boolean.TRUE;
            Object tag = view.getTag(R.id.spinner_contents_view);
            if (tag == null || !tag.equals(bool)) {
                Context context = this.a;
                int i2 = this.b;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                View viewInflate = layoutInflaterFrom.inflate(i2, viewGroup, false);
                ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.spinner_header_item_container);
                viewGroup2.addView(layoutInflaterFrom.inflate(this.c, viewGroup2, false));
                ((ImageView) viewInflate.findViewById(R.id.spinner_arrow)).setImageResource(this.d);
                viewInflate.setTag(R.id.spinner_contents_view, Boolean.TRUE);
                view = viewInflate;
            }
        } else {
            Context context2 = this.a;
            int i3 = this.b;
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context2);
            View viewInflate2 = layoutInflaterFrom2.inflate(i3, viewGroup, false);
            ViewGroup viewGroup3 = (ViewGroup) viewInflate2.findViewById(R.id.spinner_header_item_container);
            viewGroup3.addView(layoutInflaterFrom2.inflate(this.c, viewGroup3, false));
            ((ImageView) viewInflate2.findViewById(R.id.spinner_arrow)).setImageResource(this.d);
            viewInflate2.setTag(R.id.spinner_contents_view, Boolean.TRUE);
            view = viewInflate2;
        }
        aqav aqavVar = (aqav) getItem(i);
        if (aqavVar != null) {
            ((TextView) view.findViewById(R.id.item_text)).setText(aqavVar.e);
        }
        return view;
    }
}
