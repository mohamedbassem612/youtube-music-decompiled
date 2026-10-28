package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acri implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ acri(acrn acrnVar, acrk acrkVar, alql alqlVar, long j, boolean z, int i) {
        this.$cid = i;
        this.c = acrnVar;
        this.d = acrkVar;
        this.e = alqlVar;
        this.a = j;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, zya] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        Object obj = this.c;
        if (i == 0) {
            acrn acrnVar = (acrn) obj;
            acrnVar.c((acrk) this.d, (alql) this.e, acrnVar.c.b() - this.a, this.b);
            return;
        }
        zxi zxiVar = (zxi) obj;
        zxiVar.k = this.e;
        zxiVar.d = this.b;
        zxiVar.e = this.a;
        ((sny) this.d).a(zxiVar, zzl.b, Duration.ZERO);
    }

    public /* synthetic */ acri(zxi zxiVar, zya zyaVar, boolean z, long j, sny snyVar, int i) {
        this.$cid = i;
        this.c = zxiVar;
        this.e = zyaVar;
        this.b = z;
        this.a = j;
        this.d = snyVar;
    }
}
