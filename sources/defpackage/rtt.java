package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rtt implements rsu {
    final /* synthetic */ acfw a;
    final /* synthetic */ boolean b;
    final /* synthetic */ long c;
    final /* synthetic */ aciw[] d;
    final /* synthetic */ String e;
    final /* synthetic */ abzo f;

    public rtt(abzo abzoVar, acfw acfwVar, boolean z, long j, aciw[] aciwVarArr, String str) {
        this.a = acfwVar;
        this.b = z;
        this.c = j;
        this.d = aciwVarArr;
        this.e = str;
        this.f = abzoVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    @Override // defpackage.rsu
    public final void Q() throws Throwable {
        try {
            ((sdo) this.f.j.io()).i(this.a, this.b, this.c, this.d);
        } catch (rso unused) {
            this.f.x(this.e);
        }
    }

    @Override // defpackage.rsu
    public final void R() {
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void s() {
    }
}
