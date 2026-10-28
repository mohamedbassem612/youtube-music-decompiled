package defpackage;

import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class fp implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ ft b;
    final /* synthetic */ fq c;

    public fp(fq fqVar, AlertController$RecycleListView alertController$RecycleListView, ft ftVar) {
        this.c = fqVar;
        this.a = alertController$RecycleListView;
        this.b = ftVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        fq fqVar = this.c;
        boolean[] zArr = fqVar.s;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        fqVar.w.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
