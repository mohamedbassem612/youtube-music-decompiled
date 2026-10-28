package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aboi {
    public wgs a;
    public boolean b;
    private final tbt c;
    private final avlh d;
    private final avmm e = new avmm();
    private final abmt f;
    private Throwable g;
    private aboh h;

    public aboi(tbt tbtVar, avlh avlhVar, abmt abmtVar) {
        this.c = tbtVar;
        this.d = avlhVar;
        this.f = abmtVar;
    }

    public final synchronized int a() {
        return b().b.get();
    }

    public final synchronized aboh b() {
        aboh abohVar;
        abohVar = this.h;
        if (abohVar == null) {
            throw new RuntimeException("PlaybackMonitor queried outside playback sequence", this.g);
        }
        return abohVar;
    }

    public final String c() {
        return b().a;
    }

    public final synchronized void d() {
        aboh abohVar = this.h;
        if (abohVar != null) {
            this.e.b();
            this.c.l(abohVar);
            this.h = null;
            this.g = new Throwable("currentPlaybackSequenceMonitor became null here");
        }
    }

    public final synchronized void e(aazj aazjVar) {
        aboh abohVar = this.h;
        if (abohVar != null) {
            abohVar.a(aazjVar);
        }
    }

    public final void f(boolean z) {
        aboh abohVarB = b();
        abmw abmwVar = abmw.MEDIASESSION;
        boolean z2 = abohVarB.e;
        abohVarB.e = z;
    }

    public final void g(boolean z) {
        b().d = z;
    }

    public final void h(boolean z) {
        b().c = z;
    }

    @tcc
    public void handleFormatStreamChangeEvent(yvu yvuVar) {
        this.a = yvuVar.c;
    }

    public final void i(String str) {
        b().a = str;
    }

    public final synchronized void j() {
        d();
        this.g = null;
        abmt abmtVar = this.f;
        aboh abohVar = new aboh(abmtVar);
        this.h = abohVar;
        this.c.f(abohVar);
        if (abmtVar.g.l(431, 45796278L, false)) {
            this.e.c(this.d.ak(new abms(this, 16)));
        }
    }

    public final boolean k() {
        aboh abohVar = this.h;
        return abohVar != null && abohVar.e;
    }

    public final synchronized boolean l() {
        aboh abohVarB = b();
        return abohVarB.c || abohVarB.b();
    }

    public final synchronized boolean m() {
        return this.h != null;
    }

    public final synchronized boolean n() {
        return b().b();
    }
}
