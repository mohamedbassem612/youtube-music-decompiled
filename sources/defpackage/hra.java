package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hra implements hqu {
    public static final xgj a = new xgj(xhb.b(357459));
    public static final xgj b = new xgj(xhb.b(357458));
    public static final xgj c = new xgj(xhb.b(357460));
    public final Context d;
    public final awmd e;
    public final zwb f;
    public final xgm g;
    public final awou h;
    public final awut i;
    public final syn j;
    public final abfv k;

    public hra(Context context, awmd awmdVar, syn synVar, zwb zwbVar, xgm xgmVar, awou awouVar, awut awutVar, abfv abfvVar) {
        context.getClass();
        awmdVar.getClass();
        synVar.getClass();
        zwbVar.getClass();
        xgmVar.getClass();
        awouVar.getClass();
        abfvVar.getClass();
        this.d = context;
        this.e = awmdVar;
        this.j = synVar;
        this.f = zwbVar;
        this.g = xgmVar;
        this.h = awouVar;
        this.i = awutVar;
        this.k = abfvVar;
    }

    @Override // defpackage.hqu
    public final void a(Runnable runnable) {
        awro.t(this.i, null, 0, new hqz(this, runnable, null), 3);
    }

    public final void b(xgj xgjVar) {
        this.g.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar, null);
    }
}
