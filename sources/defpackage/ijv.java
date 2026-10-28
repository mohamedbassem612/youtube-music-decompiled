package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ijv extends ArrayAdapter {
    private final Context a;
    private final aduv b;

    public ijv(Context context, Context context2, iju[] ijuVarArr, aduv aduvVar) {
        super(context, R.layout.playlist_comment_item, ijuVarArr);
        this.a = context2;
        this.b = aduvVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(R.layout.playlist_comment_dropdown_item, (ViewGroup) null);
        }
        iju ijuVar = (iju) getItem(i);
        if (ijuVar != null) {
            TextView textView = (TextView) view.findViewById(R.id.comment_title);
            getContext();
            textView.setText(ijuVar.a);
            TextView textView2 = (TextView) view.findViewById(R.id.comment_detail);
            getContext();
            textView2.setText(ijuVar.b);
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.playlist_comment_item, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.comment_title);
        iju ijuVar = (iju) getItem(i);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(this.b.a(aliz.COMMENT), 0, 0, 0);
        if (ijuVar != null) {
            getContext();
            textView.setText(ijuVar.a);
        }
        return view;
    }
}
