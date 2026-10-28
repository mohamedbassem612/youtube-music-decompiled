package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class abph implements abqb {
    final /* synthetic */ abqb a;
    final /* synthetic */ xir b;
    final /* synthetic */ abpj c;

    public abph(abpj abpjVar, abqb abqbVar, xir xirVar) {
        this.a = abqbVar;
        this.b = xirVar;
        this.c = abpjVar;
    }

    @Override // defpackage.abqb
    public final void a(int i) {
        abpj abpjVar = this.c;
        if (abpjVar.m == null) {
            ((agrc) ((agrc) abpj.a.b()).k("com/google/android/libraries/youtube/player/net/PlayerRequestManager$2", "afterBothResponsesSuccessfullyLoadedMainThread", 516, "PlayerRequestManager.java")).E("About to send VIDEO_WATCH_LOADED but do not have a currentPlayerResponse. WatchNext set: %s, initialShouldJoinWatchNextResponseOfSequence: %s, requestPlayback: %s", Boolean.valueOf(abpjVar.n != null), Boolean.valueOf(abpjVar.p), Boolean.valueOf(abpj.q(i)));
        } else {
            abpjVar.m(abnw.e);
        }
        this.a.a(i);
    }

    @Override // defpackage.abqb
    public final void b(aboe aboeVar) {
        this.a.b(aboeVar);
    }

    @Override // defpackage.abqb
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.abqb
    public final void d(wjf wjfVar) {
        this.a.d(wjfVar);
        abpj abpjVar = this.c;
        abpjVar.h(wjfVar, abpjVar.k, this.b);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [axsp, java.lang.Object] */
    @Override // defpackage.abqb
    public final void e() {
        this.a.e();
        this.c.r.i.kk(new aays());
    }

    @Override // defpackage.abqb
    public final void f(aboe aboeVar) {
        this.a.f(aboeVar);
    }

    @Override // defpackage.abqb
    public final void g(wgi wgiVar, String str) {
        this.a.g(wgiVar, str);
        abpj abpjVar = this.c;
        abpjVar.n = wgiVar;
        if (wgiVar != null) {
            abpjVar.p(wgiVar);
        } else {
            abpjVar.j = null;
        }
        abvr abvrVar = abpjVar.q;
        if (abvrVar != null) {
            abvrVar.c(abpjVar.k, wgiVar, str);
        }
    }
}
