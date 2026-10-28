package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acts implements bnu {
    public final aesp c;
    private final zvl d;
    private final xeu e;
    private final ytv f;
    private final abvn g;
    private final avmm h = new avmm();
    public String a = null;
    public String b = null;

    public acts(zvl zvlVar, xeu xeuVar, ytv ytvVar, abvn abvnVar, aesp aespVar) {
        this.e = xeuVar;
        this.d = zvlVar;
        this.f = ytvVar;
        this.g = abvnVar;
        this.c = aespVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    private final aihf h(int i, String str) {
        int i2;
        aihf aihfVarCreateBuilder = apen.a.createBuilder();
        ytv ytvVar = this.f;
        zsf zsfVarA = ytvVar != null ? ytvVar.e.E.a(this.a) : null;
        int i3 = 3;
        if (zsfVarA == null) {
            i2 = 1;
        } else {
            int iOrdinal = zsfVarA.ordinal();
            if (iOrdinal == 0) {
                i2 = 4;
            } else if (iOrdinal == 1) {
                i2 = 5;
            } else if (iOrdinal == 2 || iOrdinal == 3) {
                i2 = 6;
            } else {
                i2 = 1;
            }
        }
        aihfVarCreateBuilder.copyOnWrite();
        apen apenVar = (apen) aihfVarCreateBuilder.instance;
        apenVar.g = i2 - 1;
        apenVar.b |= 16;
        String str2 = "";
        if (str == null && (str = this.a) == null) {
            str = "";
        }
        aihfVarCreateBuilder.copyOnWrite();
        apen apenVar2 = (apen) aihfVarCreateBuilder.instance;
        str.getClass();
        apenVar2.b |= 8;
        apenVar2.f = str;
        aesp aespVar = this.c;
        int i4 = aespVar.i();
        aihfVarCreateBuilder.copyOnWrite();
        apen apenVar3 = (apen) aihfVarCreateBuilder.instance;
        apenVar3.b |= SemanticState.Focused;
        apenVar3.h = i4;
        int iJ = aespVar.j();
        aihfVarCreateBuilder.copyOnWrite();
        apen apenVar4 = (apen) aihfVarCreateBuilder.instance;
        apenVar4.b |= SemanticState.LiveRegion;
        apenVar4.j = iJ;
        int iK = aespVar.k();
        aihfVarCreateBuilder.copyOnWrite();
        apen apenVar5 = (apen) aihfVarCreateBuilder.instance;
        apenVar5.b |= SemanticState.ReadOnly;
        apenVar5.k = iK;
        abvk abvkVarO = this.g.o();
        String strN = abvkVarO.n();
        if (strN != null) {
            str2 = strN;
        } else {
            String str3 = this.b;
            if (str3 != null) {
                str2 = str3;
            }
        }
        aihfVarCreateBuilder.copyOnWrite();
        apen apenVar6 = (apen) aihfVarCreateBuilder.instance;
        str2.getClass();
        apenVar6.b |= 1;
        apenVar6.c = str2;
        String strM = abvkVarO.m();
        if (strM != null) {
            aihfVarCreateBuilder.copyOnWrite();
            apen apenVar7 = (apen) aihfVarCreateBuilder.instance;
            apenVar7.b |= 2;
            apenVar7.d = strM;
            int iB = abvkVarO.b();
            aihfVarCreateBuilder.copyOnWrite();
            apen apenVar8 = (apen) aihfVarCreateBuilder.instance;
            apenVar8.b |= 4;
            apenVar8.e = iB;
        }
        int iOrdinal2 = aespVar.l().ordinal();
        if (iOrdinal2 == 0) {
            i3 = 1;
        } else if (iOrdinal2 == 1) {
            i3 = 2;
        } else if (iOrdinal2 != 2) {
            if (iOrdinal2 != 3) {
                throw new RuntimeException(null, null);
            }
            i3 = 4;
        }
        if (i3 != 1) {
            aihfVarCreateBuilder.copyOnWrite();
            apen apenVar9 = (apen) aihfVarCreateBuilder.instance;
            apenVar9.i = i3 - 1;
            apenVar9.b |= SemanticState.Hidden;
        }
        aihf aihfVarCreateBuilder2 = apeo.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        apeo apeoVar = (apeo) aihfVarCreateBuilder2.instance;
        apeoVar.d = i - 1;
        apeoVar.b |= 2;
        apen apenVar10 = (apen) aihfVarCreateBuilder.build();
        aihfVarCreateBuilder2.copyOnWrite();
        apeo apeoVar2 = (apeo) aihfVarCreateBuilder2.instance;
        apenVar10.getClass();
        apeoVar2.c = apenVar10;
        apeoVar2.b |= 1;
        if (i3 != 1) {
            aihfVarCreateBuilder2.copyOnWrite();
            apeo apeoVar3 = (apeo) aihfVarCreateBuilder2.instance;
            apeoVar3.e = i3 - 1;
            apeoVar3.b |= 4;
        }
        apfp apfpVar = (apfp) ((AtomicReference) aespVar.e).get();
        if (apfpVar != null && (apfpVar.d & 4) != 0) {
            int iH = atqp.H(apfpVar.L);
            int i5 = iH != 0 ? iH : 1;
            aihfVarCreateBuilder2.copyOnWrite();
            apeo apeoVar4 = (apeo) aihfVarCreateBuilder2.instance;
            apeoVar4.f = i5 - 1;
            apeoVar4.b |= 8;
        }
        return aihfVarCreateBuilder2;
    }

    public final void a(int i) {
        String str = this.b;
        b((str == null || this.a == null || !str.equals(this.g.o().n())) ? "" : this.a, i);
    }

    public final void b(String str, int i) {
        xeu xeuVar = this.e;
        aihf aihfVarH = h(i, str);
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarH, alot.REEL_PLAYBACK_ERROR);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        apeo apeoVar = (apeo) aihfVarH.build();
        apeoVar.getClass();
        alouVar.d = apeoVar;
        alouVar.c = 148;
        xeuVar.b((alou) alosVar.build());
    }

    public final void c(int i, String str) {
        e(ajtv.ERROR_LEVEL_ERROR, null, 196, i, str);
    }

    public final void d(int i, String str) {
        e(ajtv.ERROR_LEVEL_WARNING, null, 196, i, str);
    }

    public final void e(ajtv ajtvVar, String str, int i, int i2, String str2) {
        apeo apeoVar = (apeo) h(i2, str).build();
        zvj zvjVarA = zvk.a();
        zvjVarA.j = 23;
        zvjVarA.i = i;
        zvjVarA.g = Optional.of(apeoVar);
        zvjVarA.d(str2);
        zvjVarA.c(ajtvVar);
        this.d.a(zvjVarA.a());
    }

    public final void f(int i, String str) {
        e(ajtv.ERROR_LEVEL_ERROR, null, 203, i, str);
    }

    public final void g(String str, int i, String str2) {
        e(ajtv.ERROR_LEVEL_ERROR, str, 198, i, str2);
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        this.h.b();
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        this.h.c(((avlh) this.g.r().b).al(new aawl(new acte(this, 6), "RPEL", 1), new acrr(3)));
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
