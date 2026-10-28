package defpackage;

import app.rive.semantics.SemanticState;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class huf extends aatx {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/orchestration/MusicPlaylistDownloadController");
    public final aany b;
    public final huh c;
    public final Integer d;
    public final aauk e;
    public final abxv f;
    private final hpy l;
    private final Executor m;

    public huf(aany aanyVar, aanb aanbVar, hpy hpyVar, huh huhVar, abxv abxvVar, aauk aaukVar, Integer num, Executor executor, tbt tbtVar) {
        super(aanyVar, aanbVar, aaukVar, tbtVar);
        this.b = aanyVar;
        this.l = hpyVar;
        this.c = huhVar;
        this.f = abxvVar;
        this.d = num;
        this.m = executor;
        this.e = aaukVar;
    }

    private final void l(Function function, String str) {
        afxd.f(this.l.a(kro.aq())).i(new hue(this, function, str), this.m);
    }

    @Override // defpackage.aatx
    public final int a() {
        return 28;
    }

    public final void b(String str) {
        k(str, this.f.b(), true, this.d.intValue());
    }

    @Override // defpackage.aatx
    public final void c() {
        afxd.f(this.l.a(kro.aq())).i(new hfb(this, 6), this.m);
        e();
        g();
        d();
    }

    public final void d() {
        if (this.e.v()) {
            this.b.d(new hud(0));
        }
        l(new hsw(9), "PPSE");
    }

    public final void e() {
        if (this.e.v()) {
            this.b.d(new hud(2));
        }
        l(new hsw(10), "PPSV");
    }

    public final void f() {
        if (this.e.v()) {
            this.b.d(new hod(1));
        }
        afxd.f(this.l.a(kro.aq())).i(new hfb(this, 7), this.m);
    }

    public final void g() {
        if (this.e.v()) {
            this.b.d(new gqk(20));
        }
        l(new hsw(8), "PPSDST");
    }

    @Override // defpackage.aatx
    protected final aofg h(boolean z) {
        aihh aihhVar = (aihh) aofg.b.createBuilder();
        int iK = hmy.k(4, this.d.intValue(), aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE);
        aihhVar.copyOnWrite();
        aofg aofgVar = (aofg) aihhVar.instance;
        aofgVar.c |= 1;
        aofgVar.d = iK;
        aihl aihlVar = anue.b;
        aihf aihfVarCreateBuilder = anue.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar = (anue) aihfVarCreateBuilder.instance;
        anueVar.c |= 64;
        anueVar.l = false;
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar2 = (anue) aihfVarCreateBuilder.instance;
        anueVar2.c |= SemanticState.Focused;
        anueVar2.m = z;
        aihhVar.e(aihlVar, (anue) aihfVarCreateBuilder.build());
        return (aofg) aihhVar.build();
    }

    @Override // defpackage.aatx
    public final aofg i(aogf aogfVar, int i) {
        aihh aihhVar = (aihh) aofg.b.createBuilder();
        int iK = hmy.k(3, this.d.intValue(), aogfVar);
        aihhVar.copyOnWrite();
        aofg aofgVar = (aofg) aihhVar.instance;
        aofgVar.c |= 1;
        aofgVar.d = iK;
        aihl aihlVar = anue.b;
        aihf aihfVarCreateBuilder = anue.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar = (anue) aihfVarCreateBuilder.instance;
        anueVar.j = aogfVar.e;
        anueVar.c |= 16;
        aihhVar.e(aihlVar, (anue) aihfVarCreateBuilder.build());
        aihf aihfVarCreateBuilder2 = aofa.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aofa aofaVar = (aofa) aihfVarCreateBuilder2.instance;
        aofaVar.c = i - 1;
        aofaVar.b |= 1;
        aihf aihfVarCreateBuilder3 = aoez.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        aoez aoezVar = (aoez) aihfVarCreateBuilder3.instance;
        aoezVar.c = 5;
        aoezVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        aofa aofaVar2 = (aofa) aihfVarCreateBuilder2.instance;
        aoez aoezVar2 = (aoez) aihfVarCreateBuilder3.build();
        aoezVar2.getClass();
        aofaVar2.e = aoezVar2;
        aofaVar2.b |= 8;
        aofa aofaVar3 = (aofa) aihfVarCreateBuilder2.build();
        aihhVar.copyOnWrite();
        aofg aofgVar2 = (aofg) aihhVar.instance;
        aofaVar3.getClass();
        aofgVar2.g = aofaVar3;
        aofgVar2.c |= 2;
        return (aofg) aihhVar.build();
    }
}
