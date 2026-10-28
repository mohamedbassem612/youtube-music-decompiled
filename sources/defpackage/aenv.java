package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aenv implements aenu {
    private final aenl a;
    private final awtr b;

    public aenv(aenl aenlVar) {
        this.a = aenlVar;
        this.b = new awtr(aenlVar, awts.a);
    }

    private final aenu q() {
        return (aenu) this.b.a;
    }

    @Override // defpackage.aenu
    public final aenr a(aeno aenoVar) {
        return q().a(aenoVar);
    }

    @Override // defpackage.aenu
    public final aenr b(aeno aenoVar) {
        return q().b(aenoVar);
    }

    @Override // defpackage.aenu
    public final aenr c(String str) {
        str.getClass();
        return q().c(str);
    }

    @Override // defpackage.aenu
    public final /* synthetic */ aenr d(aeno aenoVar) {
        return aewo.r(this, aenoVar);
    }

    @Override // defpackage.aenu
    public final aenr e(aeno aenoVar, Long l) {
        return q().e(aenoVar, l);
    }

    @Override // defpackage.aenu
    public final agfr f(String str) {
        str.getClass();
        return q().f(str);
    }

    @Override // defpackage.aenu
    public final void g(String str) {
        str.getClass();
        q().g(str);
    }

    @Override // defpackage.aenu
    public final void h(aens aensVar, aenr aenrVar) {
        q().h(aensVar, aenrVar);
    }

    @Override // defpackage.aenu
    public final void i(String str, aeno aenoVar) {
        q().i(str, aenoVar);
    }

    @Override // defpackage.aenu
    public final void j(String str, aoar aoarVar) {
        str.getClass();
        aoarVar.getClass();
        q().j(str, aoarVar);
    }

    @Override // defpackage.aenu
    public final void k(String str, int i) {
        str.getClass();
        q().k(str, i);
    }

    @Override // defpackage.aenu
    public final boolean l() {
        return q().l();
    }

    @Override // defpackage.aenu
    public final boolean m() {
        return q().m();
    }

    @Override // defpackage.aenu
    public final void n(String str, int i, Integer num) {
        str.getClass();
        q().n(str, i, num);
    }

    @Override // defpackage.aenu
    public final boolean o() {
        return q().o();
    }

    @Override // defpackage.aenu
    public final aenr p(String str, Long l) {
        return q().p(str, l);
    }
}
