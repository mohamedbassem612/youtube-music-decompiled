package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xxd extends zik implements acey, xxf {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/player/MdxDirector");
    private xyw A;
    private int B;
    private long C;
    private wgo D;
    private final xxh E;
    private final xxh F;
    private wjf G;
    private final Object H;
    private acip I;
    private boolean J;
    private final rsm K;
    private agke L;
    private final axsp M;
    private final Object N;
    private ListenableFuture O;
    private final Object P;
    private final yar Q;
    private final aazo R;
    private final afip S;
    private final zdj T;
    private final ijt U;
    private final elq V;
    private final ci W;
    public final avmb b;
    public final xzc c;
    public final acdx d;
    public final acip e;
    public acip f;
    public final abvn g;
    volatile boolean h;
    public aazk i;
    public final aboi j;
    public final vxz k;
    final xxj l;
    private final Context m;
    private final mbc n;
    private final ahey o;
    private final tbt p;
    private final avlh q;
    private final avmm r;
    private final wjb s;
    private final acio t;
    private final abmt u;
    private final abfn v;
    private final xzs w;
    private final zvl x;
    private abnl y;
    private abob z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxd(Context context, mbc mbcVar, tbt tbtVar, rsk rskVar, aehs aehsVar, avlh avlhVar, ycp ycpVar, aboi aboiVar, wjb wjbVar, afip afipVar, acdx acdxVar, rnj rnjVar, txp txpVar, acio acioVar, vxu vxuVar, ruk rukVar, abvn abvnVar, abmt abmtVar, vxz vxzVar, elq elqVar, ci ciVar, abfn abfnVar, tce tceVar, zdj zdjVar, ijt ijtVar, aazo aazoVar, axsp axspVar, abnl abnlVar, ahey aheyVar, avmb avmbVar, xzs xzsVar, yar yarVar, zvl zvlVar) {
        super((byte[]) null);
        byte[] bArr = null;
        this.l = new xxj(this);
        this.r = new avmm();
        this.A = null;
        this.C = 0L;
        this.D = null;
        this.f = null;
        this.G = null;
        this.H = new Object();
        this.J = false;
        this.h = false;
        this.N = new Object();
        this.i = null;
        this.O = null;
        this.P = new Object();
        this.m = context;
        this.n = mbcVar;
        this.p = tbtVar;
        this.q = avlhVar;
        yco ycoVar = ycpVar.e;
        ycoVar.getClass();
        this.c = ycoVar;
        this.j = aboiVar;
        this.s = wjbVar;
        this.S = afipVar;
        this.d = acdxVar;
        this.t = acioVar;
        this.g = abvnVar;
        this.y = abnlVar;
        this.u = abmtVar;
        this.k = vxzVar;
        this.V = elqVar;
        this.v = abfnVar;
        this.T = zdjVar;
        this.W = ciVar;
        this.U = ijtVar;
        this.R = aazoVar;
        this.M = axspVar;
        this.o = aheyVar;
        this.b = avmbVar;
        this.w = xzsVar;
        this.Q = yarVar;
        this.x = zvlVar;
        this.K = new rsm(new xwy(this), rskVar, aehsVar, rnjVar, vxuVar, rukVar, tbtVar, tceVar);
        acip acipVarCN = cN(abnlVar != null ? abnlVar.p(txpVar) : txpVar.a(), 0, acioVar);
        this.e = acipVarCN;
        if (abmtVar.bI()) {
            acipVarCN.w().b = abnlVar;
        }
        afipVar.q(acipVarCN);
        xxh xxhVar = new xxh(this, new efi(this, elqVar, 7, bArr));
        xxh xxhVar2 = new xxh(this, new efi(this, elqVar, 8, bArr));
        this.I = acipVarCN;
        this.L = agpi.a;
        this.z = abob.a;
        this.B = 4;
        this.E = xxhVar;
        this.F = xxhVar2;
        afipVar.h(acipVarCN);
        afipVar.p(acipVarCN);
    }

    private final long cK() {
        xzc xzcVar = this.c;
        wjf wjfVarI = i();
        if (xzcVar.f() != 0) {
            return xzcVar.f();
        }
        if (wjfVarI != null) {
            return ((long) wjfVarI.a()) * 1000;
        }
        return 0L;
    }

    private final wjf cL() {
        wjf wjfVar;
        synchronized (this.H) {
            wjfVar = this.G;
        }
        return wjfVar;
    }

    private final xyu cM(wjf wjfVar) {
        xyv xyvVar = xyv.a;
        xyu xyuVar = new xyu();
        xyuVar.n(wjfVar.G());
        abnl abnlVar = this.y;
        if (abnlVar != null) {
            xyuVar.c(yno.cU(wjfVar, this.i, null, this.n));
            xyuVar.j(abnlVar.r());
            xyuVar.e(abnlVar.s());
            xyuVar.k(abnlVar.Q());
        }
        String strC = this.j.c();
        if (strC != null) {
            xyuVar.f(strC);
        }
        String str = wjfVar.t().v;
        if (!str.isEmpty()) {
            xyuVar.h(str);
        }
        if (this.k.l(R.styleable.AppCompatTheme_windowNoTitle, 45630215L, false) && aavv.f(wjfVar)) {
            xyuVar.b(this.W.ap());
        }
        return xyuVar;
    }

    private static acip cN(String str, int i, acio acioVar) {
        acioVar.d(str);
        acioVar.m(i);
        acioVar.k(new xxr());
        acioVar.e(new xwz());
        acioVar.f(false);
        acioVar.h(new xxa());
        return acioVar.a();
    }

    private static String cO(xzc xzcVar) {
        xve xveVarI = xzcVar.i();
        xvh xvhVarA = xveVarI != null ? xveVarI.a() : null;
        if (xvhVarA != null) {
            return xvhVarA.b;
        }
        return null;
    }

    private static String cP(xzc xzcVar) {
        xvz xvzVarK = xzcVar.k();
        if (xvzVarK != null) {
            return xvzVarK.b;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Set] */
    private final void cQ(int i) {
        agke agkeVar = this.L;
        wgo[] wgoVarArr = (wgo[]) agkeVar.toArray(new wgo[agkeVar.size()]);
        wgo wgoVar = this.D;
        wgs wgsVarEt = null;
        if (wgoVar == null) {
            agke agkeVar2 = this.L;
            int size = agkeVar2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    wgoVar = null;
                    break;
                }
                wgo wgoVar2 = (wgo) agkeVar2.get(i2);
                i2++;
                if (wgoVar2.d) {
                    wgoVar = wgoVar2;
                    break;
                }
            }
        }
        if (wgoVar != null) {
            aihh aihhVar = (aihh) alaw.b.createBuilder();
            Uri.Builder builder = new Uri.Builder();
            aihf aihfVarCreateBuilder = ajhl.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ajhl ajhlVar = (ajhl) aihfVarCreateBuilder.instance;
            String str = wgoVar.a;
            str.getClass();
            ajhlVar.b |= 2;
            ajhlVar.d = str;
            aihfVarCreateBuilder.copyOnWrite();
            ajhl ajhlVar2 = (ajhl) aihfVarCreateBuilder.instance;
            String str2 = wgoVar.b;
            str2.getClass();
            ajhlVar2.b |= 1;
            ajhlVar2.c = str2;
            aihfVarCreateBuilder.copyOnWrite();
            ajhl ajhlVar3 = (ajhl) aihfVarCreateBuilder.instance;
            ajhlVar3.b |= 4;
            ajhlVar3.e = wgoVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            ajhl ajhlVar4 = (ajhl) aihfVarCreateBuilder.instance;
            ajhlVar4.b |= 8;
            ajhlVar4.f = wgoVar.c;
            aihhVar.copyOnWrite();
            alaw alawVar = (alaw) aihhVar.instance;
            ajhl ajhlVar5 = (ajhl) aihfVarCreateBuilder.build();
            ajhlVar5.getClass();
            alawVar.y = ajhlVar5;
            alawVar.c |= 524288;
            wgsVarEt = yno.et(builder, null, aihhVar);
        }
        yvu yvuVar = new yvu(null, wgsVarEt, null, yvu.a, wgoVarArr, 0);
        afip afipVar = this.S;
        if (i != 0) {
            afipVar.x(yvuVar, this.I.au());
            return;
        }
        acip acipVar = this.I;
        Iterator it = afipVar.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).j(yvuVar, acipVar.au());
        }
        acipVar.az().kk(yvuVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00df  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fd  */
    private final void cR(int i, smk smkVar) throws Throwable {
        abob abobVar;
        smk smkVarA;
        abob abobVar2;
        aazj aazjVar;
        xxh xxhVar;
        acip acipVar;
        String str;
        abob abobVar3;
        wjf wjfVarI = i();
        boolean z = wjfVarI != null && wjfVarI.V();
        wjf wjfVarCL = cL();
        xxh xxhVar2 = this.F;
        xxhVar2.a = wjfVarCL;
        if (smkVar != null || (abobVar3 = this.z) == null || !abobVar3.a(abob.f, abob.e)) {
            if (smkVar != null && ((abobVar = this.z) == null || !abobVar.a(abob.f, abob.e))) {
                zvl zvlVar = this.x;
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 15;
                zvjVarA.d("MdxDirector setVideoStage ad should be null when videoStage is not an Ad state " + i + " | adPlayerResponse: " + String.valueOf(this.z) + " | lastMdxPlayerState: " + String.valueOf(this.A));
                zvlVar.a(zvjVarA.a());
                smkVarA = null;
            }
            abobVar2 = this.z;
            xxhVar = this.E;
            wjf wjfVar = xxhVar.a;
            wjf wjfVar2 = xxhVar2.a;
            if (true == abobVar2.h()) {
                xxhVar = xxhVar2;
            }
            acipVar = this.e;
            String strAu = acipVar.au();
            if (smkVarA == null) {
                str = null;
            } else {
                str = smkVarA.o;
            }
            aazjVar = new aazj(abobVar2, wjfVar, wjfVar2, xxhVar, strAu, str, z);
            if (i == 0) {
                acipVar.bf().kk(aazjVar);
                cU(abobVar2);
            } else {
                this.S.z(aazjVar);
                cU(abobVar2);
            }
            if (abobVar2.h() || smkVarA == null) {
            }
            if (wjfVarCL != null || wjfVarI != null) {
                smj smjVarN = smkVarA.n();
                wjf wjfVarCL2 = cL();
                if (wjfVarCL2 != null) {
                    smjVarN.k = wjfVarCL2;
                }
                wjf wjfVarI2 = i();
                if (wjfVarI2 != null) {
                    smjVarN.h = wjfVarI2.ab();
                }
                smkVarA = smjVarN.a();
            }
            if (this.u.aF() && smkVarA.r != null) {
                this.R.b(smkVarA.o, abxz.a);
            }
            rsm rsmVar = this.K;
            rsmVar.b(smkVarA, acipVar.au(), wjfVarI, false);
            new aaok(rsmVar.a, (smc) smkVarA, slm.PRE_ROLL, wjfVarI).U(aazjVar.a, aazjVar.g);
            if (smkVarA.b) {
                r(0);
                return;
            }
            return;
        }
        zvl zvlVar2 = this.x;
        zvj zvjVarA2 = zvk.a();
        zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA2.j = 15;
        zvjVarA2.d("MdxDirector setVideoStage ad null when playing interstitial | broadcastType: " + i + " | adPlayerResponse: " + String.valueOf(wjfVarCL) + " | lastMdxPlayerState: " + String.valueOf(this.A));
        zvlVar2.a(zvjVarA2.a());
        smkVarA = smkVar;
        abobVar2 = this.z;
        xxhVar = this.E;
        wjf wjfVar3 = xxhVar.a;
        wjf wjfVar4 = xxhVar2.a;
        if (true == abobVar2.h()) {
            xxhVar = xxhVar2;
        }
        acipVar = this.e;
        String strAu2 = acipVar.au();
        if (smkVarA == null) {
            str = null;
        } else {
            str = smkVarA.o;
        }
        aazjVar = new aazj(abobVar2, wjfVar3, wjfVar4, xxhVar, strAu2, str, z);
        if (i == 0) {
            acipVar.bf().kk(aazjVar);
            cU(abobVar2);
        } else {
            this.S.z(aazjVar);
            cU(abobVar2);
        }
        if (abobVar2.h()) {
        }
    }

    private final void cS(acip acipVar, int i) {
        aazn aaznVar = new aazn(this.B);
        afip afipVar = this.S;
        if (i == 0) {
            afipVar.F(aaznVar, 4, acipVar);
        } else {
            afipVar.B(aaznVar);
        }
    }

    private final void cT() {
        wjf wjfVar = this.E.a;
        if (wjfVar == null) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.player.director")).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "flingVideoFromPlayerResponse", 767, "MdxDirector.java")).t("Can not fling video, missing playerResponse.");
            return;
        }
        boolean zL = this.k.l(220, 45780220L, false);
        xzc xzcVar = this.c;
        if (!zL) {
            xzcVar.U(cM(wjfVar).a());
            return;
        }
        if (xzcVar == null) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.player.director")).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedSetPlayback", 779, "MdxDirector.java")).t("Cannot send RCI set playback command, mdxSession is null.");
            return;
        }
        String strZ = ahno.Z(cP(xzcVar));
        String strCO = cO(xzcVar);
        abnl abnlVar = this.y;
        ajwo ajwoVar = abnlVar != null ? abnlVar.b : null;
        if (strCO == null || ajwoVar == null) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.player.director")).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedSetPlayback", 815, "MdxDirector.java")).t("Cannot send RCI set playback command, missing mdxDiscoveryId, loungeToken, or command.");
            xzcVar.U(cM(wjfVar).a());
            return;
        }
        aihf aihfVarCreateBuilder = apih.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        apih apihVar = (apih) aihfVarCreateBuilder.instance;
        apihVar.c = ajwoVar;
        apihVar.b |= 16;
        apih apihVar2 = (apih) aihfVarCreateBuilder.build();
        xzs xzsVar = this.w;
        xyh xyhVar = new xyh();
        xyhVar.b();
        taf.i(xzsVar.e(xzsVar.b(0, apihVar2, strZ, strCO, xyhVar.a()).toBuilder()), MoreExecutors.directExecutor(), new xwk(4), new uqk(3), null);
    }

    private final void cU(abob abobVar) {
        abnv abnvVarC = acfz.c(abobVar);
        if (abnvVarC != null) {
            acip acipVar = this.e;
            agrx agrxVar = agso.a;
            acipVar.au();
            afip.I(new aayt(abnvVarC, acipVar.k(), acipVar.au()), acipVar);
        }
    }

    private final void cV() {
        acip acipVar = this.f;
        if (acipVar != null) {
            cX(acipVar);
            this.f = null;
        }
    }

    private final void cW() {
        xyq xyqVar = xyq.UNPLAYABLE;
        aboe aboeVar = new aboe(3, xyqVar.j, 1, this.m.getString(xyqVar.i), null, null, null, null);
        this.e.w().o = aboeVar;
        this.S.D(aboeVar, this.I, 4);
    }

    private final void cX(acip acipVar) {
        this.S.r(acipVar);
        if (this.u.aF()) {
            this.U.p(acipVar.au());
        }
    }

    private final void cY() {
        if (this.k.l(206, 45745764L, false)) {
            dc(2);
        } else {
            this.c.T();
        }
    }

    private final void cZ(abob abobVar, smk smkVar, boolean z) throws Throwable {
        acga acgaVarT;
        acga acgaVarT2;
        acga acgaVarT3;
        acga acgaVarT4;
        smk smkVar2;
        if (!z && this.z == abobVar) {
            acip acipVar = this.f;
            if (smkVar == null) {
                smkVar2 = null;
            } else if (acipVar == null) {
                smkVar2 = smkVar;
            } else if (smkVar.o.equals(acipVar.au())) {
                return;
            }
            if (smkVar2 == null && acipVar == null) {
                return;
            }
        }
        this.z = abobVar;
        agrx agrxVar = agso.a;
        if (smkVar == null) {
            smkVar = null;
        } else if (abobVar.a(abob.f, abob.e)) {
            String str = smkVar.o;
            acip acipVar2 = this.f;
            if (acipVar2 == null || !TextUtils.equals(acipVar2.au(), str)) {
                cV();
                this.f = cN(str, 1, this.t);
            }
        }
        elq elqVar = this.V;
        acip acipVar3 = this.e;
        acip acipVar4 = this.f;
        if (elqVar.w()) {
            int iOrdinal = abobVar.ordinal();
            if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    if (iOrdinal != 7) {
                        if (iOrdinal == 8 && acipVar3 != null && (acgaVarT4 = acipVar3.t()) != null && acgaVarT4.a() == Long.MIN_VALUE) {
                            acgaVarT4.t();
                        }
                    } else if (acipVar3 != null && (acgaVarT3 = acipVar3.t()) != null) {
                        acgaVarT3.t();
                    }
                } else if (acipVar4 != null && (acgaVarT2 = acipVar4.t()) != null && acgaVarT2.a() == Long.MIN_VALUE) {
                    acgaVarT2.t();
                }
            } else if (acipVar4 != null && (acgaVarT = acipVar4.t()) != null) {
                acgaVarT.r();
                acgaVarT.t();
            }
        }
        this.J = ak();
        cR(0, smkVar);
    }

    private final void da(acip acipVar, int i) throws Throwable {
        acip acipVarV;
        acga acgaVarT;
        this.B = i;
        agrx agrxVar = agso.a;
        if (acipVar != null && (acipVarV = this.V.v(acipVar)) != null && (acgaVarT = acipVarV.t()) != null) {
            if (i == 2) {
                acgaVarT.s();
            } else {
                acgaVarT.m();
            }
        }
        cS(acipVar, 0);
    }

    private final void db(acip acipVar) {
        if (acipVar != null) {
            if (acipVar != this.I || (this.k.l(R.styleable.AppCompatTheme_windowNoTitle, 45630215L, false) && aavv.f(i()))) {
                this.I = acipVar;
                this.S.h(acipVar);
            }
        }
    }

    private final void dc(int i) {
        xzc xzcVar = this.c;
        if (xzcVar == null) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.player.director")).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedPlayPause", 927, "MdxDirector.java")).t("Cannot send RCI play/pause command, mdxSession is null.");
            return;
        }
        String strCP = cP(xzcVar);
        String strCO = cO(xzcVar);
        int i2 = 2;
        if (strCP != null && strCO != null) {
            xzs xzsVar = this.w;
            xyh xyhVar = new xyh();
            xyhVar.b();
            taf.h(xzsVar.e(xzsVar.b(i, null, strCP, strCO, xyhVar.a()).toBuilder()), new cte(12), new xwk(i2));
            return;
        }
        agrf agrfVar = a;
        if (i == 2) {
            ((agrc) ((agrc) agrfVar.b().i(agso.a, "MDX.player.director")).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedPlayPause", 952, "MdxDirector.java")).t("Cannot send RCI play command, missing mdxDiscoveryId or loungeToken.");
            xzcVar.T();
        } else {
            ((agrc) ((agrc) agrfVar.b().i(agso.a, "MDX.player.director")).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedPlayPause", 956, "MdxDirector.java")).t("Cannot send RCI pause command, missing mdxDiscoveryId or loungeToken.");
            xzcVar.S();
        }
    }

    @Override // defpackage.acey
    public final void B(wjf wjfVar, abnl abnlVar) throws Throwable {
        acip acipVarV;
        acga acgaVarT;
        if (this.c.b() == 1) {
            this.E.a = wjfVar;
            acip acipVar = this.e;
            acipVar.w().j(wjfVar);
            if (this.u.aF()) {
                this.R.b(acipVar.au(), abxz.a);
            }
            afip.G(wjfVar, acipVar);
            elq elqVar = this.V;
            if (acipVar != null && (acipVarV = elqVar.v(acipVar)) != null && (acgaVarT = acipVarV.t()) != null) {
                acgaVarT.r();
            }
            this.y = abnlVar;
            agrx agrxVar = agso.a;
            wjfVar.G();
            this.j.c();
            synchronized (this.H) {
                this.G = null;
            }
            if (this.k.l(R.styleable.AppCompatTheme_windowNoTitle, 45630215L, false) && abnlVar != null) {
                abnlVar.f = wjfVar.C();
            }
            cZ(abob.c, null, false);
            alvl alvlVarT = wjfVar.t();
            boolean z = aaje.q(alvlVarT) || aaje.p(alvlVarT);
            wjf wjfVarJ = wjfVar.j(this.s);
            boolean z2 = wjfVarJ != null && aaje.q(wjfVarJ.t());
            if (!z && !z2) {
                cW();
                return;
            }
            String strG = wjfVar.G();
            xzc xzcVar = this.c;
            this.p.c((TextUtils.isEmpty(xzcVar.D()) && xzcVar.z().equals(strG)) ? xxo.b : xxo.a);
            if (!xzcVar.au(wjfVar.G(), this.j.c())) {
                wjfVar.G().equals(xzcVar.D());
                wjfVar.G();
                u(xzcVar.l());
            } else {
                wjfVar.G();
                cT();
                if (ah()) {
                    u(xzcVar.l());
                }
            }
        }
    }

    @Override // defpackage.zik
    public final void C() {
        smk smkVarH = this.c.h();
        wjf wjfVarI = i();
        if (smkVarH != null && wjfVarI != null) {
            smj smjVarN = smkVarH.n();
            smjVarN.h = wjfVarI.ab();
            smkVarH = smjVarN.a();
        }
        rsm rsmVar = this.K;
        if (smkVarH == null) {
            rsmVar.c(sgm.VIDEO_ENDED);
        } else {
            acip acipVar = this.e;
            rsmVar.b(smkVarH, acipVar != null ? acipVar.au() : null, wjfVarI, true);
        }
    }

    @Override // defpackage.zik
    public final void D(String str) {
        this.v.a(str);
    }

    @Override // defpackage.zik
    public final void E(wgo wgoVar) {
        this.D = wgoVar;
        cQ(0);
    }

    @Override // defpackage.zik
    public final void F(List list) {
        this.L = agke.n(list);
        cQ(0);
    }

    @Override // defpackage.zik
    public final void G(float f) {
        if (!this.u.aA()) {
            this.S.o(new aaxh(an(), i(), f), this.e);
        } else {
            abyd abydVarM = this.U.m(this.I.au());
            this.M.kk(new abxe(this.I, new agqj(new abxg(f, abydVarM != null ? (abxj) abydVarM.a(abxj.class) : abxj.a))));
        }
    }

    @Override // defpackage.acey
    public final void K() {
        if (ah()) {
            cY();
        } else {
            cT();
        }
    }

    @Override // defpackage.acey
    public final void O() throws Throwable {
        cR(1, this.c.h());
        cS(this.I, 1);
        r(1);
        cQ(1);
    }

    @Override // defpackage.acey
    public final void P() throws Throwable {
        if (this.h) {
            return;
        }
        synchronized (this.N) {
            if (this.h) {
                return;
            }
            this.h = true;
            W(false);
            xxh xxhVar = this.E;
            xxhVar.f();
            xxh xxhVar2 = this.F;
            xxhVar2.f();
            if (this.u.bI()) {
                this.e.w().b = null;
            }
            acip acipVar = this.e;
            acipVar.w().j(null);
            acipVar.w().o = null;
            cV();
            xxhVar.a = null;
            xxhVar2.a = null;
            this.y = null;
            this.C = 0L;
            this.D = null;
            this.L = agpi.a;
            da(null, 4);
            cQ(0);
            this.r.b();
            this.p.l(this);
            this.c.az(this);
            cZ(abob.a, null, false);
            acdx acdxVar = this.d;
            acdxVar.f(null);
            acdxVar.e(null);
            if (this.k.l(164, 45673420L, false)) {
                this.Q.s();
            }
            afip afipVar = this.S;
            afipVar.u();
            cX(acipVar);
            afipVar.g();
        }
    }

    @Override // defpackage.acey
    public final void Q() {
        if (ah()) {
            cY();
        } else if (TextUtils.isEmpty(this.c.D())) {
            cT();
        }
    }

    @Override // defpackage.acey
    public final void T(String str, aazh aazhVar) {
        if (!ah() || aazhVar == aazh.a) {
            return;
        }
        this.c.Z(str);
    }

    @Override // defpackage.acey
    public final void V(float f) {
        if (this.u.aA() || !an()) {
            return;
        }
        this.c.af(f);
        this.S.o(new aaxh(an(), i(), f), this.e);
    }

    public final void W(boolean z) {
        synchronized (this.P) {
            if (z) {
                ListenableFuture listenableFuture = this.O;
                if (listenableFuture != null && !listenableFuture.isDone()) {
                    agrx agrxVar = agso.a;
                    return;
                }
            }
            ListenableFuture listenableFuture2 = this.O;
            agrx agrxVar2 = agso.a;
            this.O = z ? ahno.aj(new xfd(this, 13), 1000L, 1000L, TimeUnit.MILLISECONDS, this.n, this.o) : null;
            if (listenableFuture2 != null) {
                listenableFuture2.cancel(false);
            }
        }
    }

    @Override // defpackage.acey
    public final void ab() {
        this.c.aj();
    }

    @Override // defpackage.acey
    public final boolean ac(abnl abnlVar, abnp abnpVar) {
        return false;
    }

    @Override // defpackage.acey
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.acey
    public final boolean ae() {
        return true;
    }

    @Override // defpackage.acey
    public final boolean af() {
        return false;
    }

    @Override // defpackage.acey
    public final boolean ag() {
        return !this.z.c(abob.i);
    }

    public final boolean ah() {
        return Objects.equals(q(), this.c.D());
    }

    @Override // defpackage.acey
    public final boolean ai() {
        return !ar(abob.j);
    }

    @Override // defpackage.acey, defpackage.acfl
    public final boolean aj() {
        return this.A == xyw.PLAYING || this.A == xyw.AD_PLAYING;
    }

    @Override // defpackage.acey
    public final boolean ak() {
        return ar(abob.f);
    }

    @Override // defpackage.acey
    public final boolean al() {
        return ar(abob.i);
    }

    @Override // defpackage.acey
    public final boolean am() {
        return this.c.b() == 2;
    }

    @Override // defpackage.acey
    public final boolean an() {
        return this.k.l(58, 45400591L, false) && this.c.as();
    }

    @Override // defpackage.acey
    public final boolean ao(long j, appa appaVar) {
        return ap(this.c.d() + j);
    }

    public final boolean ap(long j) throws Throwable {
        if (ah()) {
            this.c.X(Math.max(j, 0L));
            r(0);
            return true;
        }
        wjf wjfVarI = i();
        if (wjfVarI != null) {
            xzc xzcVar = this.c;
            if (TextUtils.isEmpty(xzcVar.D())) {
                xyu xyuVarCM = cM(wjfVarI);
                xyuVarCM.c(Math.max(j, 0L));
                xzcVar.U(xyuVarCM.a());
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.acey
    public final boolean aq(long j, appa appaVar) {
        return ap(j);
    }

    @Override // defpackage.acey
    public final boolean ar(abob abobVar) {
        return this.z.a(abobVar);
    }

    @Override // defpackage.acey
    public final boolean as(abob abobVar) {
        return this.z.c(abobVar);
    }

    @Override // defpackage.acey
    public final acig at() {
        throw null;
    }

    @Override // defpackage.acey
    public final void av(int i) {
        if (ah()) {
            if (this.k.l(206, 45745764L, false)) {
                dc(3);
            } else {
                this.c.S();
            }
        }
    }

    public final void aw(int i) {
        xzc xzcVar = this.c;
        if (xzcVar == null) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.player.director")).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedSkipVideo", 872, "MdxDirector.java")).t("Cannot send RCI skip video command, mdxSession is null.");
            return;
        }
        String strCP = cP(xzcVar);
        String strCO = cO(xzcVar);
        int i2 = 3;
        if (strCP == null || strCO == null) {
            agrf agrfVar = a;
            if (i == 3) {
                ((agrc) ((agrc) agrfVar.b().i(agso.a, "MDX.player.director")).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedSkipVideo", 896, "MdxDirector.java")).t("Cannot send RCI skip next video command, missing mdxDiscoveryId or loungeToken.");
                xzcVar.O();
                return;
            } else {
                ((agrc) ((agrc) agrfVar.b().i(agso.a, "MDX.player.director")).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedSkipVideo", 900, "MdxDirector.java")).t("Cannot send RCI skip previous video command, missing mdxDiscoveryId or loungeToken.");
                xzcVar.V();
                return;
            }
        }
        xzs xzsVar = this.w;
        xyh xyhVar = new xyh();
        xyhVar.b();
        xzt xztVarA = xyhVar.a();
        int i3 = xztVarA.d;
        if (i3 == 1) {
            i3 = 7;
        }
        aihf aihfVarCreateBuilder = apic.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihf aihfVarCreateBuilder2 = apis.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aihfVarCreateBuilder2.copyOnWrite();
        apis apisVar = (apis) aihfVarCreateBuilder2.instance;
        apisVar.c = i - 1;
        apisVar.b |= 1;
        aihn aihnVarBuild = aihfVarCreateBuilder2.build();
        aihnVarBuild.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        apic apicVar = (apic) aihfVarCreateBuilder.instance;
        apicVar.c = (apis) aihnVarBuild;
        apicVar.b = 6;
        taf.h(xzsVar.e(xzsVar.a(acfz.bm(aihfVarCreateBuilder), strCP, strCO, xzt.a(xztVarA, i3)).toBuilder()), new cte(13), new xwk(i2));
    }

    @Override // defpackage.acey
    public final float c() {
        if (an()) {
            return this.c.a();
        }
        return 1.0f;
    }

    @Override // defpackage.acey
    public final long f() {
        if (ah()) {
            xzc xzcVar = this.c;
            if (xzcVar.b() == 1) {
                this.C = xzcVar.d();
            }
        }
        return this.C;
    }

    @Override // defpackage.acey
    public final long g(long j) {
        return -1L;
    }

    @Override // defpackage.xxf
    public final long h() {
        if (ah() && as(abob.c)) {
            return cK();
        }
        return 0L;
    }

    @tcc
    public void handleDebugMdxAdSkipEvent(sfs sfsVar) {
        this.c.ah();
    }

    @tcc
    public void handleMdxPlayerStateChangedEvent(xyx xyxVar) {
        if (as(abob.c)) {
            if (ah() || (xyxVar.a.equals(xyw.ENDED) && TextUtils.isEmpty(this.c.D()))) {
                u(xyxVar.a);
            }
        }
    }

    @Override // defpackage.acey
    public final wjf i() {
        return this.E.a;
    }

    @Override // defpackage.acey
    public final aboe j() {
        return this.e.w().o;
    }

    @Override // defpackage.acey
    public final acfw k() {
        return this.E;
    }

    @Override // defpackage.acey
    public final acfw l() {
        return this.J ? this.F : this.E;
    }

    @Override // defpackage.acey
    public final acip m() {
        return this.e;
    }

    @Override // defpackage.acey
    public final acis n(int i) {
        return null;
    }

    @Override // defpackage.acey
    public final /* synthetic */ acjb o() {
        return null;
    }

    @Override // defpackage.acey
    public final String p() {
        return this.e.au();
    }

    @Override // defpackage.acey
    public final String q() {
        wjf wjfVarI = i();
        if (wjfVarI == null) {
            return null;
        }
        return wjfVarI.G();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    public final void r(int i) throws Throwable {
        long j;
        long jE;
        aazk aazkVar;
        acip acipVar;
        Duration durationOfMillis;
        Duration durationOfMillis2;
        afip afipVar;
        acip acipVarV;
        acga acgaVarT;
        long millis;
        long millis2;
        long jA;
        xzc xzcVar = this.c;
        smk smkVarH = xzcVar.h();
        int i2 = smkVarH != null ? smkVarH.c * 1000 : 0;
        long jCK = cK();
        String str = xyw.a;
        int iOrdinal = this.z.ordinal();
        long jG = -1;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 5) {
                    if (iOrdinal != 8) {
                        if (iOrdinal != 9) {
                            throw new IllegalStateException();
                        }
                        this.C = jCK;
                    }
                    aazkVar = new aazk(this.C, jE, jG, j, 0L, -1L, this.n.b(), false, this.I.au());
                    elq elqVar = this.V;
                    acipVar = this.I;
                    durationOfMillis = Duration.ofMillis(this.C);
                    durationOfMillis2 = Duration.ofMillis(jE);
                    durationOfMillis.getClass();
                    durationOfMillis2.getClass();
                    if (acipVar != null && (acipVarV = elqVar.v(acipVar)) != null && (acgaVarT = acipVarV.t()) != null) {
                        millis = durationOfMillis.toMillis();
                        millis2 = durationOfMillis2.toMillis();
                        jA = acgaVarT.a();
                        if (jA != Long.MIN_VALUE || (millis >= jA && millis - jA <= 5000)) {
                            acgaVarT.c(millis, millis2);
                        } else {
                            acgaVarT.e(millis, millis2, false);
                        }
                    }
                    afipVar = this.S;
                    if (i == 0) {
                        afipVar.E(this.I, aazkVar, 4);
                    } else {
                        afipVar.A(aazkVar);
                    }
                }
                jCK = i2;
                this.C = xzcVar.d();
            }
            this.C = xzcVar.d();
            jG = xzcVar.g();
            j = jCK;
            jE = xzcVar.e();
            aazkVar = new aazk(this.C, jE, jG, j, 0L, -1L, this.n.b(), false, this.I.au());
            elq elqVar2 = this.V;
            acipVar = this.I;
            durationOfMillis = Duration.ofMillis(this.C);
            durationOfMillis2 = Duration.ofMillis(jE);
            durationOfMillis.getClass();
            durationOfMillis2.getClass();
            if (acipVar != null) {
                millis = durationOfMillis.toMillis();
                millis2 = durationOfMillis2.toMillis();
                jA = acgaVarT.a();
                if (jA != Long.MIN_VALUE) {
                    acgaVarT.c(millis, millis2);
                } else {
                    acgaVarT.c(millis, millis2);
                }
            }
            afipVar = this.S;
            if (i == 0) {
                afipVar.E(this.I, aazkVar, 4);
            } else {
                afipVar.A(aazkVar);
            }
        }
        jCK = 0;
        this.C = 0L;
        j = jCK;
        jE = -1;
        aazkVar = new aazk(this.C, jE, jG, j, 0L, -1L, this.n.b(), false, this.I.au());
        elq elqVar3 = this.V;
        acipVar = this.I;
        durationOfMillis = Duration.ofMillis(this.C);
        durationOfMillis2 = Duration.ofMillis(jE);
        durationOfMillis.getClass();
        durationOfMillis2.getClass();
        if (acipVar != null) {
            millis = durationOfMillis.toMillis();
            millis2 = durationOfMillis2.toMillis();
            jA = acgaVarT.a();
            if (jA != Long.MIN_VALUE) {
                acgaVarT.c(millis, millis2);
            } else {
                acgaVarT.c(millis, millis2);
            }
        }
        afipVar = this.S;
        if (i == 0) {
            afipVar.E(this.I, aazkVar, 4);
        } else {
            afipVar.A(aazkVar);
        }
    }

    final void u(xyw xywVar) {
        agrx agrxVar = agso.a;
        xzc xzcVar = this.c;
        smk smkVarH = xzcVar.h();
        ListenableFuture listenableFutureP = xzcVar.p();
        ahno.at(listenableFutureP != null ? ahno.ar(listenableFutureP, new xwx(0), MoreExecutors.directExecutor()) : ahng.n(null), new hqd(this, xywVar, smkVarH, 6, null), this.o);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x009c A[Catch: all -> 0x00d3, TryCatch #0 {, blocks: (B:8:0x0009, B:10:0x000d, B:12:0x000f, B:14:0x0015, B:25:0x0031, B:26:0x003c, B:49:0x00c7, B:50:0x00cf, B:28:0x0041, B:29:0x004d, B:30:0x0059, B:31:0x0064, B:32:0x006f, B:33:0x007a, B:34:0x0085, B:37:0x008d, B:38:0x0094, B:40:0x009c, B:42:0x00a1, B:41:0x009f, B:43:0x00a6, B:46:0x00ae, B:47:0x00b6, B:48:0x00c1, B:15:0x0018, B:17:0x001c, B:18:0x001f, B:20:0x0023, B:21:0x0026, B:23:0x002c, B:24:0x002f), top: B:60:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009f A[Catch: all -> 0x00d3, TryCatch #0 {, blocks: (B:8:0x0009, B:10:0x000d, B:12:0x000f, B:14:0x0015, B:25:0x0031, B:26:0x003c, B:49:0x00c7, B:50:0x00cf, B:28:0x0041, B:29:0x004d, B:30:0x0059, B:31:0x0064, B:32:0x006f, B:33:0x007a, B:34:0x0085, B:37:0x008d, B:38:0x0094, B:40:0x009c, B:42:0x00a1, B:41:0x009f, B:43:0x00a6, B:46:0x00ae, B:47:0x00b6, B:48:0x00c1, B:15:0x0018, B:17:0x001c, B:18:0x001f, B:20:0x0023, B:21:0x0026, B:23:0x002c, B:24:0x002f), top: B:60:0x0009 }] */
    public final void v(xyw xywVar, wjf wjfVar, smk smkVar) {
        abob abobVar;
        acip acipVar;
        synchronized (this.H) {
            this.G = wjfVar;
        }
        synchronized (this.N) {
            if (this.h) {
                return;
            }
            this.A = xywVar;
            if (xywVar.p) {
                abobVar = abob.f;
            } else if (xywVar.r) {
                abobVar = abob.i;
            } else if (xywVar == xyw.ENDED) {
                abobVar = abob.j;
            } else {
                abobVar = i() != null ? abob.c : abob.a;
            }
            cZ(abobVar, smkVar, false);
            switch (xywVar.ordinal()) {
                case 0:
                case 6:
                    da(this.I, 4);
                    break;
                case 1:
                    db(this.f);
                    da(this.I, 2);
                    break;
                case 2:
                    wjf wjfVarI = i();
                    if (wjfVarI != null && smkVar != null) {
                        this.K.a(wjfVarI, smkVar, sgm.USER_SKIPPED);
                    }
                    break;
                case 3:
                    wjf wjfVarI2 = i();
                    if (wjfVarI2 != null && smkVar != null) {
                        this.K.a(wjfVarI2, smkVar, sgm.VIDEO_ENDED);
                    }
                    if (this.z.h()) {
                        acipVar = this.f;
                    } else {
                        acipVar = this.e;
                    }
                    da(acipVar, 7);
                    break;
                case 4:
                    db(this.f);
                    da(this.I, 3);
                    break;
                case 5:
                    db(this.f);
                    da(this.I, 5);
                    break;
                case 7:
                    if (this.z.h()) {
                        acipVar = this.f;
                    } else {
                        acipVar = this.e;
                    }
                    da(acipVar, 7);
                    break;
                case 8:
                    db(this.e);
                    da(this.I, 2);
                    break;
                case 9:
                case 11:
                    db(this.e);
                    da(this.I, 3);
                    break;
                case 10:
                    db(this.e);
                    da(this.I, 5);
                    break;
                case 12:
                    cW();
                    da(this.I, 8);
                    break;
            }
            r(0);
            W(xywVar.q);
        }
    }

    final void w() throws Throwable {
        this.c.ay(this);
        vxz vxzVar = this.k;
        if (vxzVar.l(R.styleable.AppCompatTheme_windowNoTitle, 45630215L, false)) {
            cZ(abob.a, null, true);
        }
        cZ(abob.b, null, false);
        avmm avmmVar = this.r;
        xxj xxjVar = this.l;
        int i = 4;
        int i2 = 2;
        avlh avlhVarW = aawb.w(this.q, new xwx(i2));
        xxd xxdVar = (xxd) xxjVar.a;
        xxj xxjVar2 = xxdVar.l;
        xxjVar2.getClass();
        xzc xzcVar = xxdVar.c;
        avlr avlrVarB = xzcVar.m().b();
        avmb avmbVar = xxdVar.b;
        avlr avlrVarO = avlrVarB.O(avmbVar);
        xxjVar2.getClass();
        avlr avlrVarO2 = xzcVar.m().a().O(avmbVar);
        xxjVar2.getClass();
        avmmVar.e(avlhVarW.al(new xul(xxjVar2, 5), new xuk(i2)), avlrVarO.af(new xul(xxjVar2, 6)), avlrVarO2.af(new xul(xxjVar2, 7)), ((avlh) xxdVar.g.r().i).al(new xul(xxjVar, 8), new xuk(i2)));
        this.p.f(this);
        if (vxzVar.l(151, 45650624L, false) && vxzVar.l(152, 45650625L, false)) {
            avmmVar.c(this.T.e().af(new xul(this, i)));
        }
        if (vxzVar.l(227, 45798911L, false) || !vxzVar.l(164, 45673420L, false)) {
            return;
        }
        this.Q.s();
    }

    @Override // defpackage.acey
    public final void z(wjf wjfVar, wjf wjfVar2) throws Throwable {
        B(wjfVar, null);
    }

    @Override // defpackage.acfl
    public final void J() {
    }

    @Override // defpackage.acey
    public final /* synthetic */ void R() {
    }

    @Override // defpackage.acey, defpackage.acic
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.acey
    public final void s() {
    }

    @Override // defpackage.acey
    public final void t() {
    }

    @Override // defpackage.acey
    public final /* synthetic */ void H(String str) {
    }

    @Override // defpackage.acey
    public final void I(aboe aboeVar) {
    }

    @Override // defpackage.acey
    public final /* synthetic */ void N(agke agkeVar) {
    }

    @Override // defpackage.acey
    public final void S(jrj jrjVar) {
    }

    @Override // defpackage.acey
    public final void U(boolean z) {
    }

    @Override // defpackage.acey
    public final void X(int i) {
    }

    @Override // defpackage.acey
    public final void Y(wiw wiwVar) {
    }

    @Override // defpackage.acey
    public final void Z(arfb arfbVar) {
    }

    @Override // defpackage.acey
    public final void aa(boolean z) {
    }

    @Override // defpackage.acey
    public final void au(int i) {
    }

    @Override // defpackage.acey
    public final void ax(int i) {
    }

    @Override // defpackage.acey
    public final /* synthetic */ void ay(acca accaVar) {
    }

    @Override // defpackage.acey
    public final void az(boolean z) {
    }

    @Override // defpackage.acey
    public final void A(wjf wjfVar, aboe aboeVar) {
    }

    @Override // defpackage.acey
    public final void L(abnl abnlVar, abnp abnpVar, String str) {
    }

    @Override // defpackage.acey
    public final void M(wjf wjfVar, abnl abnlVar, abnp abnpVar) {
    }
}
