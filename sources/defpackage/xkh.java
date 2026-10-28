package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xkh implements xkf {
    private final xit a;

    public xkh(xit xitVar) {
        this.a = xitVar;
    }

    @Override // defpackage.xkf
    public final void c(amiu amiuVar) {
        aihf builder = amiuVar.toBuilder();
        builder.copyOnWrite();
        amiu amiuVar2 = (amiu) builder.instance;
        amiuVar2.f = 106;
        amiuVar2.b |= 4;
        this.a.w(107, (amiu) builder.build());
    }

    @Override // defpackage.xkf
    public final void d(amix amixVar) {
        this.a.z(amixVar);
    }

    @Override // defpackage.xkf
    public final void e(long j) {
        this.a.x(107, j);
    }

    @Override // defpackage.xkf
    public final void f(String str, long j) {
        this.a.y(str, 107, j);
    }

    @Override // defpackage.xkf
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.xkf
    public final /* synthetic */ void b() {
    }
}
