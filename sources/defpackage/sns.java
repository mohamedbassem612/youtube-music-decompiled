package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sns implements wun {
    private final awmd a;

    public sns(awmd awmdVar) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    @Override // defpackage.wun
    public final void a(wuq wuqVar) {
        tun tunVar = ((sek) this.a.io()).c;
        long j = -1;
        if (tunVar != null) {
            long jB = tunVar.c.b();
            long j2 = tunVar.a;
            if (j2 != -1) {
                j = jB - j2;
            }
        }
        wuqVar.G = j;
    }
}
