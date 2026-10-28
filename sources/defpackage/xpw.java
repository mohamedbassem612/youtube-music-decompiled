package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xpw {
    public final cc a;
    public final xgn b;
    public xpv c;
    public final yar d;

    public xpw(cc ccVar, xgn xgnVar, yar yarVar) {
        this.a = ccVar;
        this.b = xgnVar;
        this.d = yarVar;
        ccVar.getLifecycle().b(new xps(this));
    }

    public final void a() {
        xpv xpvVar = this.c;
        xpvVar.a = this.d.e;
        xpvVar.jW();
    }
}
