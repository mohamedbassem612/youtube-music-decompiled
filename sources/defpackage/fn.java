package defpackage;

import android.R;
import android.content.Context;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class fn extends ArrayAdapter {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ fq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(fq fqVar, Context context, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i, R.id.text1, charSequenceArr);
        this.b = fqVar;
        this.a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        fq fqVar = this.b;
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = fqVar.s;
        if (zArr != null && zArr[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}
