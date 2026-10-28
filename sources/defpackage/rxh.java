package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, b = aixo.SLOT_TYPE_IN_PLAYER, c = {sir.class}, d = {sid.class, shq.class, shn.class, shx.class, sjz.class, sho.class, sjw.class, sjx.class, sja.class, shy.class, sjo.class})
public final class rxh implements rxj, rsq, sog, rst {
    private final spv A;
    private aiuv D;
    private boolean E;
    private sgn F;
    private boolean G;
    private boolean I;
    private boolean J;
    private boolean K;
    private final rsk M;
    private final vxu N;
    private final ruw O;
    private final ruk P;
    private final ruf Q;
    private final spy R;
    private final abnc S;
    private final roq T;
    private final rnj U;
    private final vwt V;
    public final ListenableFuture a;
    final sol b;
    public soi c;
    public final rpi d;
    private final vyo e;
    private final rsr f;
    private final sgv g;
    private final Executor h;
    private final smr i;
    private final sko j;
    private final wjf k;
    private final sgs l;
    private final slm m;
    private final String n;
    private final wjf o;
    private final ambn p;
    private final aivo q;
    private final amud r;
    private final ajwo s;
    private final int t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final long x;
    private final saq y;
    private final abvn z;
    private int B = -1;
    private int C = -1;
    private final avmm H = new avmm();
    private boolean L = false;

    public rxh(rsk rskVar, vyo vyoVar, vxu vxuVar, sgv sgvVar, rpi rpiVar, spy spyVar, Executor executor, abnc abncVar, ruk rukVar, ruf rufVar, roq roqVar, vwt vwtVar, rsr rsrVar, smr smrVar, sko skoVar, ruw ruwVar, saq saqVar, abvn abvnVar, rnj rnjVar, spv spvVar) {
        aizx aizxVarE;
        this.M = rskVar;
        this.e = vyoVar;
        this.N = vxuVar;
        this.f = rsrVar;
        this.P = rukVar;
        this.Q = rufVar;
        this.T = roqVar;
        this.V = vwtVar;
        this.g = sgvVar;
        this.d = rpiVar;
        this.R = spyVar;
        this.h = executor;
        this.S = abncVar;
        this.i = smrVar;
        this.j = skoVar;
        this.a = (ListenableFuture) smrVar.d(sjz.class);
        wjf wjfVar = (wjf) smrVar.d(sid.class);
        this.k = wjfVar;
        this.l = (sgs) smrVar.d(shq.class);
        this.m = (slm) smrVar.d(shx.class);
        this.b = som.a();
        this.c = soi.a;
        this.D = null;
        this.n = (String) smrVar.d(sho.class);
        wjf wjfVar2 = (wjf) smrVar.d(sjw.class);
        this.o = wjfVar2;
        this.q = (aivo) smrVar.d(sjx.class);
        this.r = (amud) smrVar.d(sja.class);
        this.s = (ajwo) smrVar.d(shy.class);
        this.t = ((Integer) smrVar.d(sjo.class)).intValue();
        this.p = (ambn) skoVar.d(sir.class);
        this.F = null;
        this.O = ruwVar;
        this.u = smrVar.e(siv.class) && smrVar.d(shx.class) == slm.MID_ROLL;
        this.y = saqVar;
        this.z = abvnVar;
        this.v = wjfVar.T() || ((aizxVarE = afxw.e(vyoVar)) != null && aizxVarE.at);
        this.w = wjfVar.T() || taq.aj(vyoVar);
        this.x = wjfVar2 != null ? wjfVar2.f().u() : 0L;
        this.U = rnjVar;
        this.A = spvVar;
    }

    private final int A() {
        int i = this.p.o;
        return i > 0 ? Math.max(1, (int) Math.round(((double) i) / 1000.0d)) : this.k.a();
    }

    private final Uri B() {
        ajwo ajwoVar = this.s;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(araw.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            arav aravVar = (arav) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            if (!aravVar.c.isEmpty()) {
                return Uri.parse(aravVar.c);
            }
        }
        return null;
    }

    private final ajnf C() {
        ambn ambnVar = this.p;
        if (ambnVar == null || (ambnVar.b & 8) == 0) {
            return null;
        }
        apji apjiVar = ambnVar.e;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return (ajnf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    private final ajwo D() {
        ajnf ajnfVarC = C();
        if (ajnfVarC == null || (ajnfVarC.b & SemanticState.Obscured) == 0) {
            return null;
        }
        ajwo ajwoVar = ajnfVarC.r;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    private final void E(boolean z) {
        this.J = z;
        boolean z2 = false;
        if (this.c.b.g()) {
            Object objC = this.c.b.c();
            if (objC instanceof ajvx) {
                z2 = ((ajvx) objC).j;
            }
        }
        if (z) {
            vyo vyoVar = this.e;
            if (z2 || afxw.e(vyoVar).al) {
                I();
                F();
            }
        }
    }

    private final void F() {
        if (this.J && this.I && !this.G) {
            this.y.ab(this.j, 0);
            this.G = true;
        }
    }

    private final void G() {
        if ((!this.u || this.v) && this.c.j) {
            this.h.execute(afwl.i(new rno(this, 14)));
        }
    }

    private final void H(long j, int i, int i2) {
        apzz apzzVar;
        aqaa aqaaVar;
        int i3 = (int) j;
        if (!this.u || this.w) {
            sol solVar = this.b;
            rpm.b(solVar, i3, i, i2);
            nrd.f(solVar, i2, i3, this.w);
        }
        vyo vyoVar = this.e;
        int iE = taq.aZ(vyoVar) ? nsf.e(this.t) : nsf.f(this.k.f());
        if (afxw.e(vyoVar).bt && (apzzVar = this.b.f().a) != null) {
            apji apjiVar = apzzVar.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = aqab.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = apzzVar.d;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                aqaaVar = (aqaa) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else {
                aqaaVar = null;
            }
            if (aqaaVar != null && (aqaaVar.b & 16) != 0) {
                aqpk aqpkVar = aqaaVar.d;
                if (aqpkVar == null) {
                    aqpkVar = aqpk.a;
                }
                if ((aqpkVar.b & 2) != 0) {
                    aqpk aqpkVar2 = aqaaVar.d;
                    if (aqpkVar2 == null) {
                        aqpkVar2 = aqpk.a;
                    }
                    iE = aqpkVar2.c;
                }
            }
        }
        int i4 = iE;
        boolean z = L() && this.K && afxw.e(vyoVar).bm && ((long) i3) > afxw.e(vyoVar).bo;
        boolean z2 = L() && this.K && afxw.e(vyoVar).bn && ((long) i3) > afxw.e(vyoVar).bp;
        sol solVar2 = this.b;
        this.k.f();
        if (nrk.g(solVar2, A(), i3, i4, z, z2, Duration.ofMillis(taq.Y(vyoVar)))) {
            this.R.h();
            boolean zAF = taq.aF(vyoVar);
            ruf rufVar = this.Q;
            if (zAF) {
                rufVar.c(new seo(1, this.l, Duration.ofMillis(this.t)));
            } else {
                rufVar.c(new seo(1, this.l));
            }
        }
        this.Q.e(solVar2.a());
        this.c = rww.c(this.c, j);
        G();
    }

    private final void I() {
        seo seoVar = new seo(3, sgs.d);
        ruf rufVar = this.Q;
        rufVar.c(seoVar);
        sol solVar = this.b;
        solVar.m();
        rufVar.e(solVar.a());
    }

    private final boolean J() {
        wjf wjfVar = this.o;
        return (wjfVar == null || nrl.d(wjfVar.u().p) == null) ? false : true;
    }

    private final boolean K() {
        ambn ambnVar = this.p;
        if (ambnVar != null && (ambnVar.b & 32) != 0) {
            return true;
        }
        wjf wjfVar = this.o;
        return (wjfVar == null || (wjfVar.u().b & 536870912) == 0) ? false : true;
    }

    private final boolean L() {
        if (this.t > 0) {
            vyo vyoVar = this.e;
            if (taq.az(vyoVar) && Duration.ofMillis(taq.Y(vyoVar)).toSeconds() < A()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:108:0x0204  */
    /* JADX WARN: Code duplicated, block: B:111:0x0230  */
    /* JADX WARN: Code duplicated, block: B:112:0x0246  */
    /* JADX WARN: Code duplicated, block: B:115:0x0267  */
    /* JADX WARN: Code duplicated, block: B:116:0x026b  */
    /* JADX WARN: Code duplicated, block: B:119:0x027d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0285  */
    /* JADX WARN: Code duplicated, block: B:125:0x0293 A[LOOP:0: B:123:0x028d->B:125:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x0117  */
    /* JADX WARN: Code duplicated, block: B:57:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:73:0x0167  */
    /* JADX WARN: Code duplicated, block: B:75:0x016e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:84:0x018f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0193  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c2  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.rxj
    public final void M() {
        boolean z;
        boolean z2;
        apzz apzzVar;
        int i;
        boolean z3;
        sol solVar;
        ambn ambnVar;
        ajnf ajnfVar;
        ajmb ajmbVar;
        aigj aigjVar;
        agev agevVar;
        boolean zAF;
        ruf rufVar;
        ListenableFuture listenableFuture;
        Iterator it;
        apji apjiVar;
        aihl aihlVar;
        aihl aihlVarCheckIsLite;
        apji apjiVar2;
        aihl aihlVarCheckIsLite2;
        Object objK;
        Object objC;
        apji apjiVar3;
        aihl aihlVar2;
        aihl aihlVarCheckIsLite3;
        apji apjiVar4;
        aihl aihlVarCheckIsLite4;
        Object objK2;
        Object objC2;
        apji apjiVar5;
        aihl aihlVarCheckIsLite5;
        apji apjiVar6;
        aihl aihlVarCheckIsLite6;
        Object objK3;
        Object objC3;
        try {
            this.Q.b(this);
            abnc abncVar = this.S;
            abncVar.c();
            vyo vyoVar = this.e;
            boolean zBf = taq.bf(vyoVar, abncVar);
            soh sohVarA = this.c.a();
            sohVarA.i(zBf);
            this.c = sohVarA.a();
            this.f.e(this);
            boolean z4 = this.u;
            if (z4) {
                this.O.a(this);
            }
            int iE = taq.aZ(vyoVar) ? nsf.e(this.t) : nsf.f(this.k.f());
            int i2 = this.t;
            boolean z5 = true;
            boolean z6 = i2 > 0;
            aolc aolcVar = null;
            if (z4) {
                if (z6) {
                    z = true;
                    z2 = true;
                } else {
                    sol solVar2 = this.b;
                    if (nrk.f(solVar2)) {
                        this.Q.e(solVar2.a());
                    }
                    i = i2;
                    z3 = true;
                }
                solVar = this.b;
                abnr abnrVarE = abncVar.e();
                ambnVar = this.p;
                if (ambnVar == null) {
                    ajnfVar = null;
                } else {
                    apjiVar5 = ambnVar.k;
                    if (apjiVar5 == null) {
                        apjiVar5 = apji.a;
                    }
                    aihlVarCheckIsLite5 = aihn.checkIsLite(ajnp.a);
                    apjiVar5.c(aihlVarCheckIsLite5);
                    if (apjiVar5.j.n(aihlVarCheckIsLite5.d)) {
                        apjiVar6 = ambnVar.k;
                        if (apjiVar6 == null) {
                            apjiVar6 = apji.a;
                        }
                        aihlVarCheckIsLite6 = aihn.checkIsLite(ajnp.a);
                        apjiVar6.c(aihlVarCheckIsLite6);
                        objK3 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
                        if (objK3 == null) {
                            objC3 = aihlVarCheckIsLite6.b;
                        } else {
                            objC3 = aihlVarCheckIsLite6.c(objK3);
                        }
                        ajnfVar = (ajnf) objC3;
                    } else {
                        ajnfVar = null;
                    }
                }
                nrd.c(solVar, abnrVarE, ajnfVar, J(), K());
                abnr abnrVarE2 = abncVar.e();
                if (ambnVar == null) {
                    ajmbVar = null;
                } else {
                    apjiVar3 = ambnVar.d;
                    if (apjiVar3 == null) {
                        apjiVar3 = apji.a;
                    }
                    aihlVar2 = ajmc.a;
                    aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                    apjiVar3.c(aihlVarCheckIsLite3);
                    if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                        apjiVar4 = ambnVar.d;
                        if (apjiVar4 == null) {
                            apjiVar4 = apji.a;
                        }
                        aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                        apjiVar4.c(aihlVarCheckIsLite4);
                        objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                        if (objK2 == null) {
                            objC2 = aihlVarCheckIsLite4.b;
                        } else {
                            objC2 = aihlVarCheckIsLite4.c(objK2);
                        }
                        ajmbVar = (ajmb) objC2;
                    } else {
                        ajmbVar = null;
                    }
                }
                nre.o(solVar, abnrVarE2, ajmbVar, J(), K());
                if (z5 || this.w) {
                    nrd.e(solVar, this.F);
                } else {
                    nrd.g(solVar);
                }
                solVar.h(z3);
                if (ambnVar != null) {
                    apjiVar = ambnVar.n;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihlVar = aold.a;
                    aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                    apjiVar.c(aihlVarCheckIsLite);
                    if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                        apjiVar2 = ambnVar.n;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                        apjiVar2.c(aihlVarCheckIsLite2);
                        objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                        if (objK == null) {
                            objC = aihlVarCheckIsLite2.b;
                        } else {
                            objC = aihlVarCheckIsLite2.c(objK);
                        }
                        aolcVar = (aolc) objC;
                    }
                }
                rpm.c(solVar, aolcVar);
                if (afxw.e(vyoVar).cC && !taq.av(vyoVar)) {
                    aaef aaefVarA = sot.a();
                    aaefVarA.e(z3);
                    solVar.j = aaefVarA.d();
                }
                if ((ambnVar.b & 32768) != 0) {
                    aigjVar = ambnVar.l;
                } else {
                    aigjVar = aigj.d;
                }
                solVar.q(aigjVar);
                sko skoVar = this.j;
                agevVar = skoVar.n;
                if (agevVar.g()) {
                    aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                    Object objC4 = agevVar.c();
                    aihfVarCreateBuilder.copyOnWrite();
                    amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                    amddVar.q = (amco) objC4;
                    amddVar.c |= SemanticState.ReadOnly;
                    solVar.n((amdd) aihfVarCreateBuilder.build());
                }
                zAF = taq.aF(vyoVar);
                rufVar = this.Q;
                if (zAF) {
                    rufVar.c(new seo(solVar.f().d, this.l, Duration.ofMillis(i)));
                } else {
                    rufVar.c(new seo(solVar.f().d, this.l));
                }
                this.Q.e(solVar.a());
                listenableFuture = this.a;
                if (listenableFuture.isDone()) {
                    z(listenableFuture);
                } else {
                    listenableFuture.addListener(new rno(this, 13), this.h);
                }
                if (L()) {
                    this.K = z3;
                }
                if (taq.ay(vyoVar)) {
                    it = this.T.a.iterator();
                    while (it.hasNext()) {
                        ((rtf) it.next()).b();
                    }
                }
                this.M.b(this.i, skoVar);
            }
            z = false;
            z2 = z6;
            soi soiVar = this.c;
            boolean z7 = soiVar.k && soiVar.b.g() && (this.c.b.c() instanceof ajvx);
            sol solVar3 = this.b;
            sgv sgvVar = this.g;
            ambn ambnVar2 = this.p;
            if (ambnVar2 == null || (ambnVar2.b & 1) == 0) {
                apzzVar = null;
            } else {
                apji apjiVar7 = ambnVar2.c;
                if (apjiVar7 == null) {
                    apjiVar7 = apji.a;
                }
                apzzVar = (apzz) aavv.s(apjiVar7, aqab.a);
            }
            if (apzzVar == null) {
                apzzVar = apzz.a;
            }
            i = i2;
            z3 = true;
            nrk.d(solVar3, sgvVar, apzzVar, this.r, this.F, this.k, this.m, z2, A(), iE, K(), z7);
            z5 = z;
            solVar = this.b;
            abnr abnrVarE3 = abncVar.e();
            ambnVar = this.p;
            if (ambnVar == null) {
                ajnfVar = null;
            } else {
                apjiVar5 = ambnVar.k;
                if (apjiVar5 == null) {
                    apjiVar5 = apji.a;
                }
                aihlVarCheckIsLite5 = aihn.checkIsLite(ajnp.a);
                apjiVar5.c(aihlVarCheckIsLite5);
                if (apjiVar5.j.n(aihlVarCheckIsLite5.d)) {
                    apjiVar6 = ambnVar.k;
                    if (apjiVar6 == null) {
                        apjiVar6 = apji.a;
                    }
                    aihlVarCheckIsLite6 = aihn.checkIsLite(ajnp.a);
                    apjiVar6.c(aihlVarCheckIsLite6);
                    objK3 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
                    if (objK3 == null) {
                        objC3 = aihlVarCheckIsLite6.b;
                    } else {
                        objC3 = aihlVarCheckIsLite6.c(objK3);
                    }
                    ajnfVar = (ajnf) objC3;
                } else {
                    ajnfVar = null;
                }
            }
            nrd.c(solVar, abnrVarE3, ajnfVar, J(), K());
            abnr abnrVarE4 = abncVar.e();
            if (ambnVar == null) {
                ajmbVar = null;
            } else {
                apjiVar3 = ambnVar.d;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aihlVar2 = ajmc.a;
                aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                apjiVar3.c(aihlVarCheckIsLite3);
                if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                    apjiVar4 = ambnVar.d;
                    if (apjiVar4 == null) {
                        apjiVar4 = apji.a;
                    }
                    aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                    apjiVar4.c(aihlVarCheckIsLite4);
                    objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                    if (objK2 == null) {
                        objC2 = aihlVarCheckIsLite4.b;
                    } else {
                        objC2 = aihlVarCheckIsLite4.c(objK2);
                    }
                    ajmbVar = (ajmb) objC2;
                } else {
                    ajmbVar = null;
                }
            }
            nre.o(solVar, abnrVarE4, ajmbVar, J(), K());
            if (z5) {
                nrd.e(solVar, this.F);
            } else {
                nrd.e(solVar, this.F);
            }
            solVar.h(z3);
            if (ambnVar != null) {
                apjiVar = ambnVar.n;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihlVar = aold.a;
                aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    apjiVar2 = ambnVar.n;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                    if (objK == null) {
                        objC = aihlVarCheckIsLite2.b;
                    } else {
                        objC = aihlVarCheckIsLite2.c(objK);
                    }
                    aolcVar = (aolc) objC;
                }
            }
            rpm.c(solVar, aolcVar);
            if (afxw.e(vyoVar).cC) {
                aaef aaefVarA2 = sot.a();
                aaefVarA2.e(z3);
                solVar.j = aaefVarA2.d();
            }
            if ((ambnVar.b & 32768) != 0) {
                aigjVar = ambnVar.l;
            } else {
                aigjVar = aigj.d;
            }
            solVar.q(aigjVar);
            sko skoVar2 = this.j;
            agevVar = skoVar2.n;
            if (agevVar.g()) {
                aihf aihfVarCreateBuilder2 = amdd.a.createBuilder();
                Object objC5 = agevVar.c();
                aihfVarCreateBuilder2.copyOnWrite();
                amdd amddVar2 = (amdd) aihfVarCreateBuilder2.instance;
                amddVar2.q = (amco) objC5;
                amddVar2.c |= SemanticState.ReadOnly;
                solVar.n((amdd) aihfVarCreateBuilder2.build());
            }
            zAF = taq.aF(vyoVar);
            rufVar = this.Q;
            if (zAF) {
                rufVar.c(new seo(solVar.f().d, this.l, Duration.ofMillis(i)));
            } else {
                rufVar.c(new seo(solVar.f().d, this.l));
            }
            this.Q.e(solVar.a());
            listenableFuture = this.a;
            if (listenableFuture.isDone()) {
                z(listenableFuture);
            } else {
                listenableFuture.addListener(new rno(this, 13), this.h);
            }
            if (L()) {
                this.K = z3;
            }
            if (taq.ay(vyoVar)) {
                it = this.T.a.iterator();
                while (it.hasNext()) {
                    ((rtf) it.next()).b();
                }
            }
            this.M.b(this.i, skoVar2);
        } catch (rso e) {
            this.M.u(this.i, this.j, new sas(e.getMessage(), e.a), 10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.rxj
    public final void N(int i) {
        int i2;
        this.E = true;
        soi soiVar = this.c;
        int i3 = rww.a;
        agev agevVar = soiVar.c;
        I();
        this.V.ao(false);
        Iterator it = this.T.a.iterator();
        while (it.hasNext()) {
            ((rtf) it.next()).a();
        }
        this.Q.d(this);
        this.f.h(this);
        if (this.u) {
            this.O.b(this);
        }
        rsk rskVar = this.M;
        smr smrVar = this.i;
        sko skoVar = this.j;
        rskVar.d(smrVar, skoVar, i);
        spv spvVar = this.A;
        aihf aihfVarCreateBuilder = aizg.a.createBuilder();
        aixn aixnVar = aixn.RENDERING_EVENT_TYPE_PLAYER_OVERLAY_EXIT_EVENT;
        aihfVarCreateBuilder.copyOnWrite();
        aizg aizgVar = (aizg) aihfVarCreateBuilder.instance;
        aizgVar.e = aixnVar.C;
        aizgVar.b |= 1;
        aihf aihfVarCreateBuilder2 = aiza.a.createBuilder();
        boolean z = this.L;
        aihfVarCreateBuilder2.copyOnWrite();
        aiza aizaVar = (aiza) aihfVarCreateBuilder2.instance;
        aizaVar.b |= 1;
        aizaVar.c = z;
        if (i != 0) {
            i2 = 3;
            if (i != 1) {
                if (i == 2) {
                    i2 = 4;
                } else if (i == 3) {
                    i2 = 5;
                } else if (i != 4) {
                    i2 = i != 5 ? 8 : 7;
                } else {
                    i2 = 6;
                }
            }
        } else {
            i2 = 2;
        }
        aihfVarCreateBuilder2.copyOnWrite();
        aiza aizaVar2 = (aiza) aihfVarCreateBuilder2.instance;
        aizaVar2.d = i2 - 1;
        aizaVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        aizg aizgVar2 = (aizg) aihfVarCreateBuilder.instance;
        aiza aizaVar3 = (aiza) aihfVarCreateBuilder2.build();
        aizaVar3.getClass();
        aizgVar2.d = aizaVar3;
        aizgVar2.c = 10;
        spvVar.a((aizg) aihfVarCreateBuilder.build(), null, smrVar, skoVar);
    }

    @Override // defpackage.rst
    public final void O(String str, String str2, String str3) {
        if (afxw.e(this.e).aH) {
            E(str2.equals(str3));
        }
    }

    @Override // defpackage.rst
    public final void P(long j, String str) {
        H(j, -1, A() * 1000);
    }

    @Override // defpackage.rxj
    public final void S() {
        this.Q.d(this);
        this.f.h(this);
        if (taq.bd(this.N)) {
            ((CopyOnWriteArrayList) this.U.a).remove(this);
        }
        if (this.u) {
            this.O.b(this);
        }
        this.H.dispose();
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    @Override // defpackage.rsq
    public final void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
        boolean z;
        vyo vyoVar = this.e;
        boolean zBf = taq.bf(vyoVar, this.S);
        boolean z2 = zBf && this.c.b.g() && (this.c.b.c() instanceof ajvx);
        sol solVar = this.b;
        boolean zE = nrk.e(solVar, abnrVar2);
        if (solVar.f().r == z2) {
            z = false;
        } else {
            soy soyVarA = solVar.f().a();
            soyVarA.h(z2);
            solVar.a = soyVarA.a();
            z = true;
        }
        boolean z3 = zE | z;
        boolean zP = nre.p(solVar, abnrVar2);
        boolean zD = nrd.d(solVar, abnrVar2);
        boolean z4 = taq.av(vyoVar) && nrj.q(solVar, abnrVar2);
        if (z3 || zP || zD || z4) {
            this.Q.e(solVar.a());
        }
        soh sohVarA = this.c.a();
        sohVarA.i(zBf);
        this.c = rww.d(sohVarA.a(), abnrVar);
        G();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.rxj
    public final void b() {
        apzt apztVar;
        aivw aivwVar;
        soi soiVarA;
        agev agevVarI;
        agev agevVarI2;
        agev agevVarI3;
        smr smrVar = this.i;
        sgn sgnVar = (sgn) smrVar.d(shn.class);
        int i = sgnVar.b;
        int i2 = sgnVar.c;
        int i3 = sgnVar.d;
        boolean z = (smrVar.e(six.class) && ((Boolean) smrVar.d(six.class)).booleanValue()) ? false : true;
        ambn ambnVar = this.p;
        if (ambnVar == null) {
            apztVar = null;
        } else {
            apji apjiVar = ambnVar.i;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apzu.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = ambnVar.i;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apzu.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                apztVar = (apzt) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else {
                apztVar = null;
            }
        }
        agev agevVarH = agev.h(apztVar);
        if (ambnVar == null) {
            aivwVar = null;
        } else {
            apji apjiVar3 = ambnVar.j;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVar = aivx.a;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            apjiVar3.c(aihlVarCheckIsLite3);
            if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                apji apjiVar4 = ambnVar.j;
                if (apjiVar4 == null) {
                    apjiVar4 = apji.a;
                }
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                apjiVar4.c(aihlVarCheckIsLite4);
                Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                aivwVar = (aivw) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
            } else {
                aivwVar = null;
            }
        }
        this.F = new sgn(i, i2, i3, z, agevVarH, agev.h(aivwVar), agev.h(C()));
        if ((!this.u || this.v) && K()) {
            vwt vwtVar = this.V;
            vwtVar.ao(false);
            if (ambnVar == null || (ambnVar.b & 32) == 0) {
                abnc abncVar = this.S;
                wjf wjfVar = this.o;
                abnr abnrVarE = abncVar.e();
                alkd alkdVar = wjfVar.u().A;
                if (alkdVar == null) {
                    alkdVar = alkd.a;
                }
                soiVarA = rww.a(abnrVarE, alkdVar);
                this.c = soiVarA;
            } else {
                abnr abnrVarE2 = this.S.e();
                apji apjiVar5 = ambnVar.g;
                if (apjiVar5 == null) {
                    apjiVar5 = apji.a;
                }
                soiVarA = rww.b(abnrVarE2, apjiVar5);
                this.c = soiVarA;
            }
            if (soiVarA.b.g()) {
                this.c.b.c();
                vwtVar.ao(true);
                Object objC = this.c.b.c();
                if (objC instanceof ajvx) {
                    vyo vyoVar = this.e;
                    if (((ajvx) objC).j || afxw.e(vyoVar).am) {
                        abvn abvnVar = this.z;
                        this.H.c((abvnVar.g().g.c(21, 45624291L, 0L) & 4) != 0 ? aawb.w(abvnVar.H(), new rmk(16)).P().al(new rlb(this, 14), new jeh(11)) : abvnVar.P().P().al(new rlb(this, 15), new jeh(11)));
                    }
                }
            }
            if (taq.av(this.e)) {
                sol solVar = this.b;
                abnr abnrVarE3 = this.S.e();
                MessageLite messageLite = (MessageLite) this.c.b.f();
                if (messageLite != null && (messageLite instanceof ajvx)) {
                    ajvx ajvxVar = (ajvx) messageLite;
                    ajvy ajvyVar = ajvxVar.d;
                    if (ajvyVar == null) {
                        ajvyVar = ajvy.a;
                    }
                    if ((ajvyVar.b & 2) != 0) {
                        ajvy ajvyVar2 = ajvxVar.d;
                        if (ajvyVar2 == null) {
                            ajvyVar2 = ajvy.a;
                        }
                        alay alayVar = ajvyVar2.d;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                        agevVarI = agev.i(ackj.k(null, alayVar, null, false));
                    } else {
                        agevVarI = agdf.a;
                    }
                } else {
                    agevVarI = agdf.a;
                }
                MessageLite messageLite2 = (MessageLite) this.c.b.f();
                if (messageLite2 != null && (messageLite2 instanceof ajvx)) {
                    ajvy ajvyVar3 = ((ajvx) messageLite2).d;
                    if (ajvyVar3 == null) {
                        ajvyVar3 = ajvy.a;
                    }
                    apji apjiVar6 = ajvyVar3.c;
                    if (apjiVar6 == null) {
                        apjiVar6 = apji.a;
                    }
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aiti.a);
                    apjiVar6.c(aihlVarCheckIsLite5);
                    if (apjiVar6.j.n(aihlVarCheckIsLite5.d)) {
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aiti.a);
                        apjiVar6.c(aihlVarCheckIsLite6);
                        Object objK3 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
                        alay alayVar2 = ((aith) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).b;
                        if (alayVar2 == null) {
                            alayVar2 = alay.a;
                        }
                        agevVarI2 = agev.i(ackj.k(null, alayVar2, null, false));
                    } else {
                        agevVarI2 = agdf.a;
                    }
                } else {
                    agevVarI2 = agdf.a;
                }
                MessageLite messageLite3 = (MessageLite) this.c.b.f();
                if (messageLite3 != null && (messageLite3 instanceof ajvx)) {
                    ajvx ajvxVar2 = (ajvx) messageLite3;
                    ajvy ajvyVar4 = ajvxVar2.d;
                    if (ajvyVar4 == null) {
                        ajvyVar4 = ajvy.a;
                    }
                    apji apjiVar7 = ajvyVar4.c;
                    if (apjiVar7 == null) {
                        apjiVar7 = apji.a;
                    }
                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aiti.a);
                    apjiVar7.c(aihlVarCheckIsLite7);
                    if (apjiVar7.j.n(aihlVarCheckIsLite7.d)) {
                        aqmh aqmhVar = ajvxVar2.c;
                        if (aqmhVar == null) {
                            aqmhVar = aqmh.a;
                        }
                        agevVarI3 = agev.i(aqmhVar);
                    } else {
                        agevVarI3 = agdf.a;
                    }
                } else {
                    agevVarI3 = agdf.a;
                }
                sou souVarA = solVar.e().a();
                souVarA.d(abnrVarE3 == abnr.FULLSCREEN);
                souVarA.e(agevVarI);
                souVarA.b(agevVarI2);
                souVarA.c(agevVarI3);
                solVar.i = souVarA.a();
            }
        }
        if (taq.ay(this.e) && ambnVar != null && (ambnVar.b & 536870912) != 0) {
            roq roqVar = this.T;
            apji apjiVar8 = ambnVar.p;
            if (apjiVar8 == null) {
                apjiVar8 = apji.a;
            }
            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(akce.a);
            apjiVar8.c(aihlVarCheckIsLite8);
            Object objK4 = apjiVar8.j.k(aihlVarCheckIsLite8.d);
            Iterator it = roqVar.a.iterator();
            while (it.hasNext()) {
                ((rtf) it.next()).c();
            }
        }
        if (taq.bd(this.N)) {
            ((CopyOnWriteArrayList) this.U.a).add(this);
        }
    }

    @Override // defpackage.rsq
    public final void d(String str, int i) {
        boolean z = i != 1;
        this.L = z;
        E(z);
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        abmt abmtVarG = this.z.g();
        if (abmtVarG != null && abmtVarG.am()) {
            long j4 = this.x;
            j = Math.max(0L, j - j4);
            j2 = Math.max(0L, j2 - j4);
            j3 = Math.max(0L, j3 - j4);
        }
        if (!str.equals(this.n) || this.u) {
            return;
        }
        H(j, (int) j2, (int) j3);
    }

    @Override // defpackage.sog
    public final void s() {
        sol solVar = this.b;
        nrd.b(solVar);
        nre.n(solVar);
        this.Q.e(solVar.a());
    }

    @Override // defpackage.sog
    public final void t() {
        sgs sgsVar;
        apzz apzzVar;
        aqaa aqaaVar;
        sol solVar = this.b;
        if (solVar.f().d != 1 || (sgsVar = this.l) == null) {
            rmp.m(this.i, this.j, "Skip ad was clicked but unable to process. skipState: " + solVar.f().d);
            return;
        }
        vyo vyoVar = this.e;
        if (taq.aE(vyoVar)) {
            apzzVar = solVar.f().a;
            sgsVar.d(this.B, this.C);
        } else {
            sgsVar.d(this.B, this.C);
            apzzVar = solVar.f().a;
        }
        if (apzzVar != null) {
            if (!taq.aE(vyoVar)) {
                if ((apzzVar.b & 32) != 0) {
                    new xgj(apzzVar.e, (amud) null);
                    rmp.n(null, "No interactionLogger available for logGesture");
                    return;
                }
                amud amudVar = solVar.f().n;
                if ((amudVar.c & 1) != 0) {
                    new xgj(amudVar);
                    rmp.n(null, "No interactionLogger available for logGesture");
                    return;
                }
                return;
            }
            apji apjiVar = apzzVar.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = aqab.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = apzzVar.d;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                aqaaVar = (aqaa) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else {
                aqaaVar = null;
            }
            if (aqaaVar != null && (aqaaVar.b & 8) != 0) {
                new xgj(aqaaVar.c, (amud) null);
                rmp.n(null, "No interactionLogger available for logGesture");
                return;
            }
            amud amudVar2 = solVar.f().n;
            if ((amudVar2.c & 1) != 0) {
                new xgj(amudVar2);
                rmp.n(null, "No interactionLogger available for logGesture");
            }
        }
    }

    @Override // defpackage.sog
    public final void u(int i, int i2) {
        this.B = i;
        this.C = i2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    @Override // defpackage.sog
    public final void v() {
        aiuv aiuvVar;
        amud amudVar;
        amud amudVar2;
        ajnf ajnfVarC = C();
        if (taq.ax(this.e) && ajnfVarC != null) {
            if ((ajnfVarC.b & 2097152) != 0) {
                amudVar = ajnfVarC.z;
                if (amudVar == null) {
                    amudVar = amud.b;
                }
                if ((amudVar.c & 1) != 0) {
                    amudVar2 = ajnfVarC.z;
                    if (amudVar2 == null) {
                        amudVar2 = amud.b;
                    }
                    new xgj(amudVar2.d, (amud) null);
                    rmp.n(null, "No interactionLogger available for logGesture");
                } else if ((ajnfVarC.b & 2097152) != 0) {
                    new xgj(ajnfVarC.y, (amud) null);
                    rmp.n(null, "No interactionLogger available for logGesture");
                }
            } else {
                amud amudVar3 = ajnfVarC.z;
                if (amudVar3 == null) {
                    amudVar3 = amud.b;
                }
                if ((amudVar3.c & 1) != 0) {
                    amudVar = ajnfVarC.z;
                    if (amudVar == null) {
                        amudVar = amud.b;
                    }
                    if ((amudVar.c & 1) != 0) {
                        amudVar2 = ajnfVarC.z;
                        if (amudVar2 == null) {
                            amudVar2 = amud.b;
                        }
                        new xgj(amudVar2.d, (amud) null);
                        rmp.n(null, "No interactionLogger available for logGesture");
                    } else if ((ajnfVarC.b & 2097152) != 0) {
                        new xgj(ajnfVarC.y, (amud) null);
                        rmp.n(null, "No interactionLogger available for logGesture");
                    }
                }
            }
        }
        abfx abfxVarF = this.Q.f();
        if (abfxVarF != null) {
            ajwo ajwoVarD = D();
            if (ajwoVarD == null && (aiuvVar = this.D) != null && (ajwoVarD = aiuvVar.h) == null) {
                ajwoVarD = ajwo.a;
            }
            if (ajwoVarD != null) {
                afv afvVar = new afv(2);
                afvVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", abfxVarF);
                this.P.b(ajwoVarD, afvVar);
            }
        }
    }

    public final void w(wgi wgiVar) {
        if (wgiVar != null) {
            alzo alzoVar = wgiVar.a.h;
            if (alzoVar == null) {
                alzoVar = alzo.a;
            }
            Stream map = Collection.EL.stream((alzoVar.b == 78882851 ? (aorw) alzoVar.c : aorw.a).h).filter(new rej(16)).map(new rxg(2));
            Collector collector = aghu.a;
            this.I = Collection.EL.stream((agke) Collection.EL.stream((agke) Collection.EL.stream((agke) map.collect(collector)).flatMap(new rxg(3)).collect(collector)).filter(new rej(17)).map(new rxg(0)).collect(collector)).anyMatch(new rej(15));
            F();
        }
    }

    @Override // defpackage.sog
    public final void x() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    @Override // defpackage.sog
    public final void y() {
        aiuv aiuvVar;
        ajwo ajwoVar;
        ruk rukVar;
        aiuv aiuvVar2;
        afv afvVar = new afv(1);
        afvVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.Q.f());
        afvVar.put(xhd.e, this.b.g());
        if (B() != null || this.s != null) {
            this.R.e();
            if (!taq.aV(this.e) || (aiuvVar2 = this.D) == null || (aiuvVar2.b & 4) == 0) {
                aiuvVar = this.D;
                if (aiuvVar != null || (aiuvVar.b & 8) == 0) {
                    ajwoVar = this.s;
                    rukVar = this.P;
                    if (ajwoVar != null) {
                        rukVar.b(ajwoVar, afvVar);
                    } else {
                        rukVar.b(vxh.c(B()), afvVar);
                    }
                } else {
                    ruk rukVar2 = this.P;
                    ajwo ajwoVar2 = aiuvVar.f;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    rukVar2.b(ajwoVar2, afvVar);
                }
            } else {
                alay alayVar = aiuvVar2.e;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                if (alayVar.c.size() <= 0) {
                    aiuvVar = this.D;
                    if (aiuvVar != null) {
                        ajwoVar = this.s;
                        rukVar = this.P;
                        if (ajwoVar != null) {
                            rukVar.b(ajwoVar, afvVar);
                        } else {
                            rukVar.b(vxh.c(B()), afvVar);
                        }
                    } else {
                        ajwoVar = this.s;
                        rukVar = this.P;
                        if (ajwoVar != null) {
                            rukVar.b(ajwoVar, afvVar);
                        } else {
                            rukVar.b(vxh.c(B()), afvVar);
                        }
                    }
                } else {
                    alay alayVar2 = this.D.e;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                    if ((((alba) alayVar2.c.get(0)).b & SemanticState.Modal) != 0) {
                        alay alayVar3 = this.D.e;
                        if (alayVar3 == null) {
                            alayVar3 = alay.a;
                        }
                        ajwo ajwoVar3 = ((alba) alayVar3.c.get(0)).l;
                        if (ajwoVar3 == null) {
                            ajwoVar3 = ajwo.a;
                        }
                        this.P.b(ajwoVar3, afvVar);
                    } else {
                        aiuvVar = this.D;
                        if (aiuvVar != null) {
                            ajwoVar = this.s;
                            rukVar = this.P;
                            if (ajwoVar != null) {
                                rukVar.b(ajwoVar, afvVar);
                            } else {
                                rukVar.b(vxh.c(B()), afvVar);
                            }
                        } else {
                            ajwoVar = this.s;
                            rukVar = this.P;
                            if (ajwoVar != null) {
                                rukVar.b(ajwoVar, afvVar);
                            } else {
                                rukVar.b(vxh.c(B()), afvVar);
                            }
                        }
                    }
                }
            }
        }
        aivo aivoVar = this.q;
        if (aivoVar != null) {
            this.P.c(aivoVar.k);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x010a  */
    public final void z(ListenableFuture listenableFuture) {
        aiuv aiuvVar;
        aiut aiutVarN;
        aiux aiuxVarO;
        if (this.E) {
            return;
        }
        try {
            wgi wgiVar = (wgi) ahng.v(listenableFuture);
            if (wgiVar != null) {
                alzo alzoVar = wgiVar.a.h;
                if (alzoVar == null) {
                    alzoVar = alzo.a;
                }
                int i = alzoVar.b;
                aiuv aiuvVar2 = null;
                if (i == 62960614) {
                    aiuvVar = i == 62960614 ? (aiuv) alzoVar.c : aiuv.a;
                } else {
                    aiuvVar = null;
                }
                if (aiuvVar != null || this.s != null || B() != null || D() != null) {
                    aiuvVar2 = aiuvVar == null ? aiuv.a : aiuvVar;
                }
                this.D = aiuvVar2;
                if (aiuvVar2 != null) {
                    if (!this.u || this.v) {
                        sol solVar = this.b;
                        if (nre.m(solVar, aiuvVar2, B(), this.s)) {
                            this.Q.e(solVar.a());
                        }
                    }
                    if (D() != null || (this.D.b & 16384) != 0) {
                        sol solVar2 = this.b;
                        son sonVarA = solVar2.b().a();
                        sonVarA.c(true);
                        solVar2.c = sonVarA.a();
                    }
                }
                if (!this.u) {
                    wjf wjfVar = this.o;
                    if (wjfVar == null) {
                        rmp.m(this.i, this.j, "Expected MediaAd PlayerResponseModel not to be null.");
                        return;
                    }
                    ambn ambnVar = this.p;
                    if (ambnVar == null) {
                        aiutVarN = wjfVar.n();
                    } else {
                        apji apjiVar = ambnVar.f;
                        if (apjiVar == null) {
                            apjiVar = apji.a;
                        }
                        aihl aihlVar = aiuu.a;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                        apjiVar.c(aihlVarCheckIsLite);
                        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                            apji apjiVar2 = ambnVar.f;
                            if (apjiVar2 == null) {
                                apjiVar2 = apji.a;
                            }
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                            apjiVar2.c(aihlVarCheckIsLite2);
                            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                            aiutVarN = (aiut) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                        } else {
                            aiutVarN = wjfVar.n();
                        }
                    }
                    if (ambnVar == null) {
                        aiuxVarO = wjfVar.o();
                    } else {
                        apji apjiVar3 = ambnVar.h;
                        if (apjiVar3 == null) {
                            apjiVar3 = apji.a;
                        }
                        aihl aihlVar2 = aiux.b;
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                        apjiVar3.c(aihlVarCheckIsLite3);
                        if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                            apji apjiVar4 = ambnVar.h;
                            if (apjiVar4 == null) {
                                apjiVar4 = apji.a;
                            }
                            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                            apjiVar4.c(aihlVarCheckIsLite4);
                            Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                            aiuxVarO = (aiux) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                        } else {
                            aiuxVarO = wjfVar.o();
                        }
                    }
                    if (aiutVarN != null) {
                        if ((aiutVarN.b & 1) != 0) {
                            this.b.p(true);
                        }
                        this.b.o(aiutVarN.c);
                    }
                    if (aiuxVarO != null && (aiuxVarO.c & 1) != 0) {
                        this.b.i(true);
                    }
                }
                ruf rufVar = this.Q;
                rufVar.h();
                rufVar.e(this.b.a());
            }
        } catch (Exception e) {
            rmp.m(this.i, this.j, e.toString());
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }
}
