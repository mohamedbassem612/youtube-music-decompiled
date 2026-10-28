package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ikk extends ArrayAdapter {
    private final Context a;
    private final aduv b;

    public ikk(Context context, Context context2, ikj[] ikjVarArr, aduv aduvVar) {
        super(context, R.layout.playlist_privacy_item, ikjVarArr);
        this.a = context2;
        this.b = aduvVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(R.layout.playlist_privacy_dropdown_item, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.privacy_title);
        ikj ikjVar = (ikj) getItem(i);
        if (ikjVar != null) {
            textView.setText(ikjVar.c(getContext()));
            ((ImageView) view.findViewById(R.id.privacy_icon)).setImageResource(this.b.a(ikjVar.a()));
            ((TextView) view.findViewById(R.id.privacy_detail)).setText(ikjVar.b(getContext()));
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.playlist_privacy_item, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.privacy_title);
        ikj ikjVar = (ikj) getItem(i);
        if (ikjVar != null) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(this.b.a(ikjVar.a()), 0, 0, 0);
            textView.setText(ikjVar.c(getContext()));
        }
        return view;
    }
}
