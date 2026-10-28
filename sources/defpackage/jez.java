package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jez implements View.OnClickListener {
    final anrw a;
    final adly b;
    final /* synthetic */ jfb c;

    public jez(jfb jfbVar, anrw anrwVar, adly adlyVar) {
        this.c = jfbVar;
        this.a = anrwVar;
        this.b = adlyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dd supportFragmentManager = ((cf) this.c.f.a).getSupportFragmentManager();
        if (jku.e(supportFragmentManager)) {
            adly adlyVar = this.b;
            anrw anrwVar = this.a;
            izs izsVar = new izs();
            ((izp) izsVar).m = anrwVar;
            izsVar.o = adlyVar;
            izsVar.h(supportFragmentManager, "MUSIC_MULTISELECT_MENU_BOTTOM_SHEET_FRAGMENT_TAG");
        }
    }
}
