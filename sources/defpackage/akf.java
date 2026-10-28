package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class akf extends ajw {
    public awqg a;
    public final long c;
    private final ajw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akf(ajw ajwVar) {
        super(0L, ajz.a);
        Object obj = aka.a;
        this.d = ajwVar;
        this.a = null;
        this.c = ahs.j();
    }

    private final ajw b() {
        ajw ajwVar = this.d;
        return ajwVar == null ? aka.e : ajwVar;
    }

    @Override // defpackage.ajw
    public final void a() {
        this.b = true;
    }

    @Override // defpackage.ajw
    public final awqg d() {
        return null;
    }

    @Override // defpackage.ajw
    public final void f(akb akbVar) {
        b().f(akbVar);
    }

    @Override // defpackage.ajw
    public final void k() {
        b().k();
    }

    @Override // defpackage.ajw
    public final long m() {
        return b().m();
    }

    @Override // defpackage.ajw
    public final ajz n() {
        return b().n();
    }

    @Override // defpackage.ajw
    public final /* synthetic */ void l() {
    }
}
