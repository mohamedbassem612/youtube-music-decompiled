package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class jmw implements zws {
    final /* synthetic */ jmx a;
    private final alvl b;
    private final sxu c;
    private final String d;

    public jmw(jmx jmxVar, alvl alvlVar, sxu sxuVar, String str) {
        this.a = jmxVar;
        this.b = alvlVar;
        this.c = sxuVar;
        this.d = str;
    }

    @Override // defpackage.zws
    public final void c() {
        this.a.f();
        absh.a(this.c, absg.h(this.b, this.d));
    }

    @Override // defpackage.zws
    public final void d() {
        this.a.f();
        absh.b(this.c);
    }

    @Override // defpackage.zws
    public final void e(Exception exc) {
        this.a.f();
        absh.a(this.c, absg.h(this.b, this.d));
    }
}
