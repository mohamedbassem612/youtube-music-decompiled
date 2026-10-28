package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class fo implements AdapterView.OnItemClickListener {
    final /* synthetic */ ft a;
    final /* synthetic */ fq b;

    public fo(fq fqVar, ft ftVar) {
        this.b = fqVar;
        this.a = ftVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ft ftVar = this.a;
        fq fqVar = this.b;
        DialogInterface.OnClickListener onClickListener = fqVar.p;
        gr grVar = ftVar.b;
        onClickListener.onClick(grVar, i);
        if (fqVar.u) {
            return;
        }
        grVar.dismiss();
    }
}
