package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acoq {
    public final Context a;
    public final aunn b;
    public final avmb c;
    public String d;
    public final awku e;
    public final awmi f;
    public boolean g;
    public final adif h;
    public final vwt i;

    public acoq(Context context, aunn aunnVar, adif adifVar, avmb avmbVar, vwt vwtVar, acvf acvfVar) {
        context.getClass();
        aunnVar.getClass();
        avmbVar.getClass();
        acvfVar.getClass();
        this.a = context;
        this.b = aunnVar;
        this.h = adifVar;
        this.c = avmbVar;
        this.i = vwtVar;
        this.e = awku.aC(Boolean.FALSE);
        this.f = new awmp(new acoo(this, 0));
    }

    public final void a(vob vobVar) {
        adif adifVar = this.h;
        Context context = this.a;
        if (adifVar.b(context)) {
            String strW = vobVar != null ? vobVar.w() : null;
            boolean z = false;
            if (vobVar != null && (strW == null || !adifVar.a(context, strW))) {
                z = true;
            }
            this.e.kk(Boolean.valueOf(z));
        }
    }

    public final boolean b(vob vobVar) {
        boolean z = vobVar != null && vobVar.K();
        String strW = vobVar != null ? vobVar.w() : null;
        return !z || (strW != null && this.h.a(this.a, strW));
    }
}
