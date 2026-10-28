package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adoj implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ adoi a;
    final /* synthetic */ adok b;

    public adoj(adok adokVar, adoi adoiVar) {
        this.a = adoiVar;
        this.b = adokVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        adoi adoiVar = this.a;
        if (adoiVar.a != i) {
            adok adokVar = this.b;
            adoiVar.a = i;
            adokVar.e.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
