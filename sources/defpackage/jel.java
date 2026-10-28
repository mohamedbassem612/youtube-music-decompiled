package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jel implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ adly a;
    final /* synthetic */ anny b;
    final /* synthetic */ jem c;

    public jel(jem jemVar, adly adlyVar, anny annyVar) {
        this.a = adlyVar;
        this.b = annyVar;
        this.c = jemVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        jem jemVar = this.c;
        jemVar.h(this.a, this.b);
        if (jemVar.m.l(56, 45631656L, false)) {
            if (jemVar.n() == 1) {
                jemVar.i.setEnabled(false);
                jemVar.d.findViewById(R.id.voting_container).setAlpha(jemVar.l);
            } else {
                jemVar.i.setEnabled(true);
                jemVar.d.findViewById(R.id.voting_container).setAlpha(1.0f);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
