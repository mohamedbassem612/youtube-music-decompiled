package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.LruCache;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.Optional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class abpd {
    public final tbt a;
    public final abps b;
    public final abrg c;
    public final Executor d;
    public final Set e;
    public final mbc f;
    public final abwj g;
    public final vyo h;
    public final abmt i;
    public final LruCache j;
    private final Executor k;
    private final txp l;

    public abpd(tbt tbtVar, abps abpsVar, abrg abrgVar, Executor executor, Executor executor2, Set set, mbc mbcVar, vyo vyoVar, abmt abmtVar, txp txpVar, abpk abpkVar, abwj abwjVar) {
        tbtVar.getClass();
        this.a = tbtVar;
        abpsVar.getClass();
        this.b = abpsVar;
        abrgVar.getClass();
        this.c = abrgVar;
        executor.getClass();
        this.d = executor;
        executor2.getClass();
        this.k = executor2;
        set.getClass();
        this.e = set;
        this.f = mbcVar;
        this.g = abwjVar;
        this.i = abmtVar;
        this.j = abpkVar;
        vyoVar.getClass();
        this.h = vyoVar;
        txpVar.getClass();
        this.l = txpVar;
    }

    public static void n(wjf wjfVar, abri abriVar) {
        wjfVar.k().b("PLAYER_REQUEST_WAS_AUTOPLAY", abriVar.O);
        wjfVar.k().b("PLAYER_REQUEST_WAS_AUTONAV", abriVar.P);
        wjfVar.k().d("PLAYER_REQUEST_CLICK_TRACKING", Base64.encodeToString(abriVar.g, 0));
    }

    public static final int t(wjf wjfVar) {
        alop alopVar = wjfVar.u().d;
        if (alopVar == null) {
            alopVar = alop.a;
        }
        return alopVar.e;
    }

    private final void w(String str) {
        LruCache lruCache = this.j;
        if (lruCache != null) {
            lruCache.remove(str);
        }
    }

    private final boolean x() {
        abmt abmtVar = this.i;
        return abmtVar != null && abmtVar.g.l(304, 45737171L, false);
    }

    private final boolean y() {
        abmt abmtVar = this.i;
        return abmtVar != null && abmtVar.ci();
    }

    public final long b(wjf wjfVar) {
        return this.f.b() + TimeUnit.SECONDS.toMillis(t(wjfVar));
    }

    public final Pair c(abri abriVar, boolean z) {
        abmt abmtVar;
        LruCache lruCache = this.j;
        if (lruCache == null) {
            return null;
        }
        if (!abriVar.h && z && ((abmtVar = this.i) == null || !abmt.r(abmtVar.a).B)) {
            return (Pair) lruCache.remove(abriVar.Y());
        }
        Pair pair = (Pair) lruCache.get(abriVar.Y());
        if (pair != null || !abriVar.H) {
            return pair;
        }
        abriVar.H(false);
        Pair pair2 = (Pair) lruCache.get(abriVar.Y());
        abriVar.H(true);
        return pair2;
    }

    public final wjf d(abri abriVar, yrr yrrVar, wjf wjfVar, xir xirVar) {
        LruCache lruCache;
        abmt abmtVar;
        abmw abmwVar = abmw.MEDIASESSION;
        String str = abriVar.T;
        String str2 = abriVar.a;
        if (yrrVar == null || yrrVar.x != 4) {
            if (wjfVar != null) {
                wjfVar.J(abriVar.h);
            }
            wjfVar = a(wjfVar.G(), wjfVar);
            if (!y()) {
                boolean zI = aaje.i(wjfVar, this.f);
                boolean z = false;
                if (wjfVar != null && aaje.q(wjfVar.t())) {
                    z = true;
                }
                if ((q(wjfVar) || ((abmtVar = this.i) != null && abmtVar.aJ())) && !zI && z && (lruCache = this.j) != null && t(wjfVar) > 0) {
                    abmt abmtVar2 = this.i;
                    if (abmtVar2 != null && abmtVar2.aI()) {
                        n(wjfVar, abriVar);
                    }
                    lruCache.put(abriVar.Y(), new Pair(wjfVar, Long.valueOf(b(wjfVar))));
                }
            }
            this.a.c(new aayc(wjfVar.N()));
            if (xirVar != null) {
                xirVar.f(tau.PLAYER_SERVICE_RECEIVED);
                aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                boolean zN = wjfVar.N();
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                amiuVar.c |= SemanticState.Focused;
                amiuVar.C = zN;
                aihf aihfVarCreateBuilder2 = amis.a.createBuilder();
                boolean zN2 = wjfVar.N();
                aihfVarCreateBuilder2.copyOnWrite();
                amis amisVar = (amis) aihfVarCreateBuilder2.instance;
                amisVar.b |= 1;
                amisVar.c = zN2;
                aihfVarCreateBuilder.bx(aihfVarCreateBuilder2);
                xirVar.h((amiu) aihfVarCreateBuilder.build());
            }
        }
        return wjfVar;
    }

    public final yrr e(abnl abnlVar, abnp abnpVar, String str, aphs aphsVar) {
        return f(abnlVar, abnpVar, str, abnpVar != null ? abnpVar.g : null, aphsVar);
    }

    public final yrr f(abnl abnlVar, abnp abnpVar, String str, zkj zkjVar, aphs aphsVar) {
        arfb arfbVar;
        Integer num;
        Optional optionalL = abnlVar.l();
        Duration durationJ = abnlVar.j();
        byte[] bArrR = abnlVar.R();
        if (abnpVar == null) {
            num = null;
            arfbVar = null;
        } else {
            Integer num2 = (Integer) abnpVar.i.orElse(null);
            arfbVar = (arfb) abnpVar.h.orElse(null);
            num = num2;
        }
        arie arieVar = abnlVar.i().c;
        if (arieVar == null) {
            arieVar = arie.a;
        }
        return yrr.g(this.h, optionalL, str, durationJ, zkjVar, bArrR, num, arfbVar, arieVar, aphsVar, abnlVar.C(), o());
    }

    public final abri g(abnl abnlVar, aooj aoojVar, xir xirVar) {
        abri abriVarB = this.c.b(abnlVar.w(), abnlVar.Q(), abnlVar.s(), abnlVar.u(), abnlVar.a(), abnlVar.L(), -1, null, this.e, abnlVar.q(this.l), abnlVar.t(), xirVar, abnlVar.e, abnlVar.D(), true, abnlVar.j());
        abriVarB.aa = aoojVar;
        abriVarB.O = abnlVar.I();
        abriVarB.P = abnlVar.H();
        abriVarB.R = abnlVar.K();
        return abriVarB;
    }

    public final abri h(abnl abnlVar, int i) {
        return this.c.c(abnlVar, i, null, this.e, null, null);
    }

    public final ListenableFuture i(abnl abnlVar, String str, int i, aphs aphsVar, yrr yrrVar, boolean z, abnp abnpVar) {
        if (x() && ahno.aa(abnlVar.w())) {
            return ahng.m(new IllegalArgumentException("Unexpected empty videoId."));
        }
        typ.f(abnlVar.w());
        abrg abrgVar = this.c;
        Set set = this.e;
        xir xirVar = abnpVar.b;
        return j(abnlVar.w(), str, abrgVar.c(abnlVar, i, aphsVar, set, xirVar, str), yrrVar, z, true, xirVar, abnlVar, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final ListenableFuture j(String str, final String str2, final abri abriVar, final yrr yrrVar, final boolean z, boolean z2, final xir xirVar, abnl abnlVar, boolean z3) {
        abpc abpcVar;
        ListenableFuture listenableFuture;
        aboz abozVar;
        if (x() && ahno.aa(str)) {
            return ahng.m(new IllegalArgumentException("Unexpected empty videoId."));
        }
        typ.f(str);
        jrk jrkVar = abnlVar.a;
        String str3 = (jrkVar.c & SemanticState.Hidden) != 0 ? jrkVar.N : null;
        tbt tbtVar = this.a;
        tbtVar.c(new aayd(str3));
        if (xirVar != null) {
            xirVar.n("ps_s");
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            if (str2 != null) {
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                amiuVar.b |= 32768;
                amiuVar.n = str2;
            }
            if (str3 != null) {
                aihf aihfVarCreateBuilder2 = amje.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amje amjeVar = (amje) aihfVarCreateBuilder2.instance;
                amjeVar.b |= 1;
                amjeVar.c = str3;
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
                amje amjeVar2 = (amje) aihfVarCreateBuilder2.build();
                amjeVar2.getClass();
                amiuVar2.W = amjeVar2;
                amiuVar2.d |= 67108864;
            }
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar3 = (amiu) aihfVarCreateBuilder.instance;
            str.getClass();
            amiuVar3.b |= 536870912;
            amiuVar3.w = str;
            xirVar.h((amiu) aihfVarCreateBuilder.build());
        }
        Pair pairC = c(abriVar, z2);
        if (pairC != null && p(pairC)) {
            abmw abmwVar = abmw.MEDIASESSION;
            wjf wjfVar = (wjf) pairC.first;
            tbtVar.c(new aayc(true));
            if (xirVar != null) {
                xirVar.n("ps_r");
                aihf aihfVarCreateBuilder3 = amiu.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                amiu amiuVar4 = (amiu) aihfVarCreateBuilder3.instance;
                amiuVar4.c |= SemanticState.Focused;
                amiuVar4.C = true;
                aihf aihfVarCreateBuilder4 = amis.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                amis amisVar = (amis) aihfVarCreateBuilder4.instance;
                amisVar.b |= 1;
                amisVar.c = true;
                aihfVarCreateBuilder3.bx(aihfVarCreateBuilder4);
                xirVar.h((amiu) aihfVarCreateBuilder3.build());
            }
            abmt abmtVar = this.i;
            if (abmtVar != null && abmtVar.aI() && (wjfVar.k().e("PLAYER_REQUEST_WAS_AUTOPLAY") != abriVar.O || wjfVar.k().e("PLAYER_REQUEST_WAS_AUTONAV") != abriVar.P || !Base64.encodeToString(abriVar.g, 0).equals(wjfVar.k().a("PLAYER_REQUEST_CLICK_TRACKING")))) {
                wjfVar.k().c("PLAYER_RESPONSE_SOURCE_KEY", 3L);
            }
            return ahng.n(wjfVar);
        }
        if (xirVar != null && !y()) {
            aihf aihfVarCreateBuilder5 = amiu.a.createBuilder();
            aihf aihfVarCreateBuilder6 = amis.a.createBuilder();
            aihfVarCreateBuilder6.copyOnWrite();
            amis amisVar2 = (amis) aihfVarCreateBuilder6.instance;
            amisVar2.b |= 1;
            amisVar2.c = false;
            aihfVarCreateBuilder5.bx(aihfVarCreateBuilder6);
            xirVar.h((amiu) aihfVarCreateBuilder5.build());
        }
        if (pairC != null) {
            w(abriVar.Y());
        }
        if (r()) {
            return afxd.f(this.b.c(abriVar, str2, yrrVar, xirVar)).g(new hro(this, abriVar, yrrVar, xirVar, 4), MoreExecutors.directExecutor());
        }
        abmt abmtVar2 = this.i;
        if (abmtVar2 == null || !abmtVar2.aE() || !z3 || yrrVar == null) {
            final abpc abpcVar2 = new abpc(this, abriVar, str, xirVar);
            if (abmtVar2 != null && abmtVar2.ax() && z3 && yrrVar != null) {
                return ape.f(new aqk() { // from class: abov
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // defpackage.aqk
                    public final Object a(final aqi aqiVar) {
                        abps abpsVar = this.a.b;
                        abri abriVar2 = abriVar;
                        final abpc abpcVar3 = abpcVar2;
                        final abpl abplVar = new abpl(abpsVar.h(abriVar2, abpcVar3, yrrVar, z, xirVar).u(new avnd() { // from class: abow
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // defpackage.avnd
                            public final void a() {
                                aqi aqiVar2 = aqiVar;
                                abpc abpcVar4 = abpcVar3;
                                if (!abpcVar4.isDone() || abpcVar4.isCancelled()) {
                                    aqiVar2.b(null);
                                    return;
                                }
                                try {
                                    aqiVar2.b((wjf) ahng.v(abpcVar4));
                                } catch (ExecutionException e) {
                                    Throwable cause = e.getCause();
                                    ExecutionException cause2 = e;
                                    if (cause != null) {
                                        cause2 = e.getCause();
                                    }
                                    aqiVar2.d(cause2);
                                }
                            }
                        }).ag(new xuk(16), new abms(aqiVar, 17)), 1);
                        aqiVar.a(new Runnable() { // from class: abot
                            @Override // java.lang.Runnable
                            public final void run() {
                                aqi aqiVar2 = aqiVar;
                                abok abokVar = abplVar;
                                abpc abpcVar4 = abpcVar3;
                                if (!abpcVar4.isDone() || abpcVar4.isCancelled()) {
                                    abpcVar4.cancel(false);
                                    abokVar.a();
                                } else {
                                    try {
                                        aqiVar2.b((wjf) ahng.v(abpcVar4));
                                    } catch (ExecutionException unused) {
                                    } finally {
                                        abokVar.a();
                                    }
                                }
                            }
                        }, MoreExecutors.directExecutor());
                        return "PlayerFetcher.requestPlayerServiceResponseFutureInternal.onesieRequestFuture";
                    }
                });
            }
            abpcVar = abpcVar2;
            abok abokVarB = this.b.b(abriVar, abpcVar, str2, yrrVar, z, xirVar);
            listenableFuture = abpcVar;
            if (abmtVar2 != null && abmtVar2.aq()) {
                listenableFuture = abpcVar;
                abpcVar.d = abokVarB;
                listenableFuture = abpcVar;
            }
        } else {
            abozVar = new aboz(this, abriVar, str, xirVar);
            abok abokVarB2 = this.b.b(abriVar, abozVar, str2, yrrVar, z, xirVar);
            abozVar.a = abokVarB2;
            if (abozVar.c || abozVar.isCancelled()) {
                listenableFuture = abozVar;
                boolean zCompareAndSet = abozVar.b.compareAndSet(false, true);
                listenableFuture = abozVar;
                if (zCompareAndSet) {
                    abokVarB2.a();
                    listenableFuture = abozVar;
                }
            }
        }
        listenableFuture = abpcVar;
        listenableFuture = abozVar;
        return listenableFuture;
    }

    public final ListenableFuture k(final abnl abnlVar, final aooj aoojVar, final xir xirVar, final abnp abnpVar, final abnt abntVar) {
        abmt abmtVar = this.i;
        xir xirVar2 = (abmtVar == null || !abmtVar.bA() || abnpVar == null) ? xirVar : abnpVar.b;
        final String strQ = abnlVar.q(this.l);
        agfr agfrVar = new agfr() { // from class: abou
            @Override // defpackage.agfr
            public final Object io() {
                yrr yrrVarF;
                abpd abpdVar = this.a;
                abmt abmtVar2 = abpdVar.i;
                abnl abnlVar2 = abnlVar;
                abri abriVarG = abpdVar.g(abnlVar2, aoojVar, xirVar);
                abnt abntVar2 = abntVar;
                if (abmtVar2 == null || (!(abmt.r(abmtVar2.a).D || abmtVar2.d.l(5, 45358588L, false)) || (abntVar2.a <= 0 && abpdVar.g.e))) {
                    yrrVarF = null;
                } else {
                    String str = strQ;
                    abnp abnpVar2 = abnpVar;
                    abmtVar2.bA();
                    yrrVarF = abpdVar.f(abnlVar2, abnpVar2, str, null, null);
                }
                if (yrrVarF != null && !TextUtils.isEmpty(abnlVar2.w())) {
                    int i = abntVar2.c;
                    if (i == 0) {
                        throw null;
                    }
                    if (i == 3) {
                        yrrVarF.x = 3;
                    } else {
                        yrrVarF.x = 2;
                    }
                    yrrVarF.b(abnlVar2.w());
                    int i2 = (int) abntVar2.a;
                    yrrVarF.o = Math.max(i2, 0);
                    yrrVarF.n = Math.max(i2, 0);
                }
                return new abpb(abriVarG, agev.h(yrrVarF));
            }
        };
        AtomicReference atomicReference = new AtomicReference();
        ListenableFuture listenableFutureF = ahcs.f(ahng.n(agfrVar.io()), afwl.d(new qmw(this, abnlVar, xirVar2, atomicReference, 12, (short[]) null)), a.x() ? this.d : MoreExecutors.directExecutor());
        return (abmtVar == null || !abmtVar.aE()) ? listenableFutureF : new abpa(listenableFutureF, atomicReference);
    }

    public final ListenableFuture l(abnl abnlVar, aooj aoojVar, xir xirVar, abnp abnpVar) {
        ahsk ahskVarA = abnt.a();
        ahskVarA.e(-1L);
        return k(abnlVar, aoojVar, xirVar, abnpVar, ahskVarA.c());
    }

    public final void m(abnl abnlVar, int i) {
        if (this.j == null || TextUtils.isEmpty(abnlVar.w())) {
            return;
        }
        abnlVar.Q();
        w(h(abnlVar, i).Y());
    }

    public final boolean o() {
        abmt abmtVar = this.i;
        return abmtVar != null && abmtVar.aL();
    }

    public final boolean p(Pair pair) {
        mbc mbcVar = this.f;
        return mbcVar.b() <= ((Long) pair.second).longValue() && !aaje.i((wjf) pair.first, mbcVar);
    }

    public final boolean q(wjf wjfVar) {
        if (this.j != null && wjfVar != null && wjfVar.f() != null) {
            ajcm ajcmVar = wjfVar.f().d.A;
            if (ajcmVar == null) {
                ajcmVar = ajcm.a;
            }
            if (ajcmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return this.g.j;
    }

    public final void s(abnl abnlVar, String str, Executor executor, abnp abnpVar) {
        String strQ;
        yrr yrrVarE;
        vyo vyoVar = this.h;
        if (abmt.cd(vyoVar)) {
            if (!abmt.r(vyoVar).l) {
                Runnable runnableI = afwl.i(new zdy(this, abnlVar, abnpVar, abnlVar.q(this.l), str, 4));
                abmt abmtVar = this.i;
                if (abmtVar == null || !abmtVar.br() || a.x()) {
                    executor.execute(runnableI);
                    return;
                } else {
                    runnableI.run();
                    return;
                }
            }
            if (TextUtils.isEmpty(str) || (yrrVarE = e(abnlVar, abnpVar, (strQ = abnlVar.q(this.l)), null)) == null || TextUtils.isEmpty(str)) {
                return;
            }
            Runnable runnableI2 = afwl.i(new abwm(this, yrrVarE, str, abnlVar, strQ, abnpVar, 1));
            abmt abmtVar2 = this.i;
            if (abmtVar2 == null || !abmtVar2.br() || a.x()) {
                executor.execute(runnableI2);
            } else {
                runnableI2.run();
            }
        }
    }

    public final /* synthetic */ void u(String str, String str2, byte[] bArr, sxu sxuVar) {
        abpd abpdVar;
        try {
            abnk abnkVar = new abnk();
            aihh aihhVarP = aboc.p(str, "", -1, 0.0f, str2, null, false);
            aigj aigjVarV = aigj.v(bArr);
            aihhVarP.copyOnWrite();
            ajwo ajwoVar = (ajwo) aihhVarP.instance;
            ajwo ajwoVar2 = ajwo.a;
            aigjVarV.getClass();
            ajwoVar.b |= 1;
            ajwoVar.c = aigjVarV;
            abnkVar.a = (ajwo) aihhVarP.build();
            abpdVar = this;
            try {
                ListenableFuture listenableFutureI = abpdVar.i(abnkVar.a(), null, -1, null, null, false, abnp.a);
                long jMax = aawc.a;
                vyo vyoVar = abpdVar.h;
                if (vyoVar != null) {
                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(abmt.c(vyoVar)));
                }
                abpdVar.k.execute(afwl.i(new abaq(sxuVar, jMax > 0 ? (wjf) listenableFutureI.get(jMax, TimeUnit.MILLISECONDS) : (wjf) listenableFutureI.get(), 10)));
            } catch (InterruptedException e) {
                e = e;
                abpdVar.k.execute(afwl.i(new abaq(sxuVar, e, 11)));
            } catch (ExecutionException e2) {
                e = e2;
                abpdVar.k.execute(afwl.i(new abaq(sxuVar, e, 11)));
            } catch (TimeoutException e3) {
                e = e3;
                abpdVar.k.execute(afwl.i(new abaq(sxuVar, e, 11)));
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            e = e4;
            abpdVar = this;
        }
    }

    public final ListenableFuture v(abnl abnlVar, String str, aphs aphsVar, boolean z, abnp abnpVar) {
        if (x() && ahno.aa(abnlVar.w())) {
            return ahng.m(new IllegalArgumentException("Unexpected empty videoId."));
        }
        typ.f(abnlVar.w());
        yrr yrrVarE = e(abnlVar, abnpVar, str, aphsVar);
        if (yrrVarE != null && !TextUtils.isEmpty(abnlVar.w())) {
            yrrVarE.b(abnlVar.w());
        }
        return i(abnlVar, str, -1, aphsVar, yrrVarE, z, abnpVar);
    }

    public abpd(tbt tbtVar, abps abpsVar, abrg abrgVar, Executor executor, Executor executor2, List list, txp txpVar) {
        this.l = txpVar;
        this.a = tbtVar;
        this.b = abpsVar;
        this.c = abrgVar;
        this.d = executor;
        this.k = executor2;
        this.e = new HashSet(list);
        this.f = new tyq(0);
        this.j = null;
        this.h = null;
        this.i = null;
        this.g = abwj.a;
    }

    protected wjf a(String str, wjf wjfVar) {
        return wjfVar;
    }
}
