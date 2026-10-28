package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vlh {
    final /* synthetic */ wjr a;
    private final long b;
    private boolean c = false;
    private final aihf d;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, mbc] */
    public vlh(wjr wjrVar, String str) {
        this.a = wjrVar;
        this.b = wjrVar.a.b();
        aihf aihfVarCreateBuilder = akjr.a.createBuilder();
        int iG = wjr.g(str);
        aihfVarCreateBuilder.copyOnWrite();
        akjr akjrVar = (akjr) aihfVarCreateBuilder.instance;
        akjrVar.b |= SemanticState.Focused;
        akjrVar.f = iG;
        int iH = wjr.h(str);
        aihfVarCreateBuilder.copyOnWrite();
        akjr akjrVar2 = (akjr) aihfVarCreateBuilder.instance;
        akjrVar2.b |= SemanticState.Hidden;
        akjrVar2.g = iH;
        this.d = aihfVarCreateBuilder;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mbc] */
    private final void c() {
        ahno.O(!this.c);
        wjr wjrVar = this.a;
        long jB = wjrVar.a.b() - this.b;
        aihf aihfVar = this.d;
        aihfVar.copyOnWrite();
        akjr akjrVar = (akjr) aihfVar.instance;
        akjr akjrVar2 = akjr.a;
        akjrVar.b |= 32;
        akjrVar.d = (int) jB;
        xeu xeuVar = (xeu) wjrVar.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVar, alot.DATA_PLAN_CPID_REQUESTED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            akjr akjrVar3 = (akjr) aihfVar.build();
            akjrVar3.getClass();
            alouVar.d = akjrVar3;
            alouVar.c = 51;
            xeuVar.b((alou) alosVar.build());
        }
        this.c = true;
    }

    public final void a() {
        aihf aihfVar = this.d;
        aihfVar.copyOnWrite();
        akjr akjrVar = (akjr) aihfVar.instance;
        akjr akjrVar2 = akjr.a;
        akjrVar.c = 2;
        akjrVar.b |= 8;
        aihfVar.copyOnWrite();
        akjr akjrVar3 = (akjr) aihfVar.instance;
        akjrVar3.b |= 64;
        akjrVar3.e = -1;
        c();
    }

    public final void b(long j) {
        aihf aihfVar = this.d;
        aihfVar.copyOnWrite();
        akjr akjrVar = (akjr) aihfVar.instance;
        akjr akjrVar2 = akjr.a;
        akjrVar.c = 1;
        akjrVar.b |= 8;
        aihfVar.copyOnWrite();
        akjr akjrVar3 = (akjr) aihfVar.instance;
        akjrVar3.b |= 64;
        akjrVar3.e = (int) j;
        c();
    }
}
