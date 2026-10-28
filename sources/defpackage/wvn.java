package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wvn implements zzm {
    private final awmd a;
    private final ci b;

    protected wvn(ci ciVar, awmd awmdVar) {
        this.b = ciVar;
        this.a = awmdVar;
    }

    @Override // defpackage.zzm
    public final void a(String str, zwa zwaVar) {
        if (this.b.aD(zwaVar) != null || str.contains("visitor_id")) {
            return;
        }
        c(zwaVar);
    }

    public final void b(alzm alzmVar, zwa zwaVar) {
        alop alopVar = alzmVar.b;
        if (alopVar == null) {
            alopVar = alop.a;
        }
        String str = alopVar.c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.aE(zwaVar, str);
    }

    protected abstract void c(zwa zwaVar);

    public final void d(int i) {
        dov dovVar = (dov) this.a.io();
        aihf aihfVarCreateBuilder = ajlp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajlp ajlpVar = (ajlp) aihfVarCreateBuilder.instance;
        ajlpVar.c = i - 1;
        ajlpVar.b |= 1;
        ajlp ajlpVar2 = (ajlp) aihfVarCreateBuilder.build();
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        ajlpVar2.getClass();
        alouVar.d = ajlpVar2;
        alouVar.c = 281;
        dovVar.R((alou) alosVar.build());
    }
}
