package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abqq {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public abqq(mbc mbcVar, zwb zwbVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, abpt abptVar, abrf abrfVar, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6) {
        this.a = zwbVar;
        this.g = awmdVar;
        this.c = awmdVar3;
        this.b = abptVar;
        this.j = abrfVar;
        this.h = awmdVar2;
        this.e = awmdVar4;
        this.d = awmdVar5;
        this.f = awmdVar6;
        this.i = new ahgb(new aeot(new avgj(mbcVar, null), new aakt(11), new aaje()), MoreExecutors.directExecutor(), mbcVar);
    }

    public static boolean i(int i) {
        return i == aaus.a(aohx.AUDIO_ONLY, -1);
    }

    public static final boolean k(wjf wjfVar) {
        aogq aogqVarV = wjfVar.v();
        if (aogqVarV != null) {
            aogp aogpVarA = aogp.a(aogqVarV.h);
            if (aogpVarA == null) {
                aogpVarA = aogp.UNKNOWN;
            }
            if (aogpVarA == aogp.OK) {
                return true;
            }
        }
        return false;
    }

    public static final boolean l(wjf wjfVar) {
        alvl alvlVarT = wjfVar.t();
        return alvlVarT != null && aaje.q(alvlVarT);
    }

    public final yrr a(abnl abnlVar, String str, abnp abnpVar) {
        Optional optional = abnpVar.i;
        Optional optionalL = abnlVar.l();
        Duration durationJ = abnlVar.j();
        byte[] bArrR = abnlVar.R();
        Integer num = (Integer) optional.orElse(null);
        arfb arfbVar = (arfb) abnpVar.h.orElse(null);
        arie arieVar = abnlVar.i().c;
        if (arieVar == null) {
            arieVar = arie.a;
        }
        arie arieVar2 = arieVar;
        yrr yrrVarG = yrr.g((vyo) this.e, optionalL, str, durationJ, abnpVar.g, bArrR, num, arfbVar, arieVar2, null, abnlVar.C(), ((abmt) this.i).aL());
        if (yrrVarG != null) {
            yrrVarG.d.set(jrp.ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE);
            if (!TextUtils.isEmpty(abnlVar.w())) {
                yrrVarG.b(abnlVar.w());
            } else if (!TextUtils.isEmpty(abnlVar.u())) {
                yrrVarG.i = true;
            }
        }
        return yrrVarG;
    }

    public final avlr b(avlr avlrVar, xir xirVar) {
        return avlrVar.x(new abqo(this, xirVar, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [avlr, awko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r32v1, types: [byte[], java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v17, types: [abqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [avni] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    public final abrj c(agke agkeVar, abnl abnlVar, abnp abnpVar, String str, int i) {
        ?? r6;
        avlr avlrVarB;
        avlr avlrVarA;
        abqg abqgVar;
        avlr avlrVarX;
        abmw abmwVar = abmw.MEDIASESSION;
        abnlVar.w();
        xir xirVar = abnpVar.b;
        int i2 = 536870912;
        if (xirVar != null) {
            xirVar.f(tau.STREAMING_WATCH_INITIATED);
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                amiuVar.b |= 32768;
                amiuVar.n = str;
            }
            String strC = typ.c(abnlVar.w());
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
            amiuVar2.b |= 536870912;
            amiuVar2.w = strC;
            xirVar.h((amiu) aihfVarCreateBuilder.build());
        }
        if (!abnlVar.L() && TextUtils.isEmpty(abnlVar.w()) && TextUtils.isEmpty(abnlVar.u())) {
            ahgr ahgrVarB = abrj.b();
            ahgrVarB.h(agpn.b);
            return ahgrVarB.f();
        }
        if (agkeVar.isEmpty()) {
            ahgr ahgrVarB2 = abrj.b();
            ahgrVarB2.h(agpn.b);
            return ahgrVarB2.f();
        }
        Object obj = this.i;
        ahgr ahgrVarB3 = abrj.b();
        abmt abmtVar = (abmt) obj;
        int i3 = 0;
        int i4 = 19;
        int i5 = 5;
        int i6 = 1;
        if (abmtVar.g.l(329, 45751111L, false)) {
            avni abqgVar2 = abmtVar.aX() ? new abqg(ahgrVarB3, i5) : avoi.d;
            ahno.F(!agkeVar.isEmpty());
            abnlVar.w();
            if (!abnlVar.L() && TextUtils.isEmpty(abnlVar.w()) && TextUtils.isEmpty(abnlVar.u())) {
                avlrVarX = avlr.A(new IllegalArgumentException("Unexpected missing videoId and playlistId."));
            } else {
                int size = agkeVar.size();
                while (i3 < size) {
                    ((avmb) this.h).e(new abbj((abqh) agkeVar.get(i3), 14));
                    i3++;
                    i2 = i2;
                }
                int i7 = i2;
                yrr yrrVarA = a(abnlVar, str, abnpVar);
                Object obj2 = this.b;
                abqx abqxVar = (abqx) obj2;
                tmw tmwVar = (tmw) abqxVar.h.a(abqxVar.b, this.c.e(), abnlVar.Q(), yrrVarA, agkeVar, xirVar, i).i.a();
                if (xirVar != null) {
                    xirVar.f(tau.STREAMING_WATCH_REQUESTED);
                    tym.ag(tsa.STREAMING_WATCH_REQUESTED);
                    aihf aihfVarCreateBuilder2 = amiu.a.createBuilder();
                    if (str != null) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVarCreateBuilder2.instance;
                        amiuVar3.b |= 32768;
                        amiuVar3.n = str;
                    }
                    String strC2 = typ.c(abnlVar.w());
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiu amiuVar4 = (amiu) aihfVarCreateBuilder2.instance;
                    amiuVar4.b |= i7;
                    amiuVar4.w = strC2;
                    xirVar.h((amiu) aihfVarCreateBuilder2.build());
                } else {
                    xirVar = null;
                }
                awko awkoVarC = awen.c(nsi.h(((wnn) obj2).e(), tmwVar));
                awkoVarC.f(abqgVar2);
                avlrVarX = awkoVarC.x(new abqo(this, xirVar, i6));
            }
            ahgrVarB3.h((agkj) Collection.EL.stream(agkeVar).collect(aghu.a(new aalr(i4), new aazx(this, avlrVarX, 8, null))));
            return ahgrVarB3.f();
        }
        Object obj3 = null;
        Optional optionalFindFirst = Collection.EL.stream(agkeVar).filter(new aaep(9)).findFirst();
        abqp abqpVar = new abqp(this, abnlVar, str, abnpVar);
        if (true == optionalFindFirst.isPresent()) {
            optionalFindFirst = Optional.ofNullable(abqpVar.a.a(abqpVar.b, abqpVar.c, abqpVar.d));
        }
        yrr yrrVar = (yrr) optionalFindFirst.orElse(null);
        ahno.F(!agkeVar.isEmpty());
        Object obj4 = this.b;
        zwa zwaVarE = this.c.e();
        byte[] bArrQ = abnlVar.Q();
        ahno.F(!agkeVar.isEmpty());
        int size2 = agkeVar.size();
        int i8 = 0;
        while (i8 < size2) {
            ((avmb) ((abqx) obj4).e).e(new abbj((abqh) agkeVar.get(i8), 15));
            i8++;
            obj3 = obj3;
        }
        ?? r32 = obj3;
        abqx abqxVar2 = (abqx) obj4;
        Object obj5 = abqxVar2.d;
        abxv abxvVar = abqxVar2.b;
        Object obj6 = abqxVar2.i;
        aaer aaerVar = new aaer(agkeVar, 17);
        aaer aaerVar2 = new aaer(agkeVar, 18);
        zwaVarE.getClass();
        obj6.getClass();
        abmt abmtVar2 = (abmt) ((grj) obj5).a.io();
        abmtVar2.getClass();
        abra abraVar = new abra(abxvVar, zwaVarE, (vxu) obj6, aaerVar, aaerVar2, abmtVar2);
        abraVar.x = new acsa(xirVar, 1);
        abraVar.o(bArrQ);
        agev agevVarA = ((abmt) abqxVar2.g).bh() ? abqx.a((vyo) abqxVar2.f) : abrg.f((vyo) abqxVar2.f);
        ypp yppVarE = ((wlp) abqxVar2.c).e();
        yppVarE.h = abraVar;
        yppVarE.l(alyi.a);
        yppVarE.g = new ablq(4);
        yppVarE.f = new wvb(14);
        yppVarE.m((Set) Collection.EL.stream(agkeVar).map(new aalr(20)).collect(aghu.b));
        if (agevVarA.g()) {
            yppVarE.i = agevVarA.c();
        }
        wlo wloVarK = yppVarE.k();
        if (abmtVar.bi()) {
            wloVarK.U();
        }
        if (abmtVar.G()) {
            wloVarK.T();
        }
        wloVarK.V();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        String strW = abnlVar.w();
        int i9 = 5;
        rzo rzoVar = new rzo(this, wloVarK, abnpVar, atomicBoolean, 3);
        if (abmtVar.aX()) {
            abqgVar = new abqg(ahgrVarB3, i9);
        } else {
            r6 = r32;
        }
        if (xirVar != null) {
            xirVar.n("sw_s");
            tym.ag(tsa.STREAMING_WATCH_REQUESTED);
            aihf aihfVarCreateBuilder3 = amiu.a.createBuilder();
            if (str != null) {
                r6 = abqgVar;
                aihfVarCreateBuilder3.copyOnWrite();
                amiu amiuVar5 = (amiu) aihfVarCreateBuilder3.instance;
                amiuVar5.b |= 32768;
                amiuVar5.n = str;
            }
            r6 = abqgVar;
            String strC3 = typ.c(strW);
            aihfVarCreateBuilder3.copyOnWrite();
            amiu amiuVar6 = (amiu) aihfVarCreateBuilder3.instance;
            amiuVar6.b |= 536870912;
            amiuVar6.w = strC3;
            xirVar.h((amiu) aihfVarCreateBuilder3.build());
        }
        r6 = abqgVar;
        Object obj7 = this.f;
        if (obj7 == null || yrrVar == null) {
            avlrVarB = b(abqxVar2.b(wloVarK), xirVar);
        } else {
            zhq zhqVar = zhq.ABR;
            if (yrrVar.x == 0) {
                throw r32;
            }
            yrv yrvVar = (yrv) obj7;
            zjd zjdVarB = yrvVar.b(xirVar);
            zjdVarB.L();
            zgm zgmVar = yrvVar.e;
            zgmVar.d(yrrVar);
            String str2 = yrrVar.b;
            zjr zjrVar = yrvVar.d;
            ytf ytfVar = new ytf(zgmVar, str2, yrvVar.h, zjrVar);
            yrvVar.d(xirVar, ytfVar);
            yrvVar.i.x(ywl.C(zgmVar, str2, zjrVar), str2);
            if (yrrVar.i || !TextUtils.isEmpty(yrrVar.h)) {
                try {
                    xpl xplVarC = yti.c(((yrv) obj7).b, ((yrv) obj7).f, ((yrv) obj7).c);
                    avlrVarA = yrvVar.g.a(yrrVar, ytfVar, new xsc(xplVarC), zjdVarB, wloVarK, xplVarC, new yrs(wloVarK)).b();
                } catch (ytg e) {
                    int i10 = e.a;
                    if (i10 == 0) {
                        throw r32;
                    }
                    int i11 = i10 - 1;
                    if (i11 == 0) {
                        ytfVar.e("unavailable.hotconfig", e);
                    } else if (i11 == 1) {
                        ytfVar.e("unavailable.keyexpired", e);
                    }
                    avlrVarA = avlr.A(e);
                }
            } else {
                avlrVarA = avlr.A(new IllegalArgumentException("Onesie requests must have a non-null videoId."));
            }
            avlrVarB = b(avlrVarA, xirVar);
            if (abmtVar.e.m(134, 45426524L)) {
                avlrVarB = avlrVarB.x(new abqg(atomicBoolean, 4)).P((avnn) rzoVar.get());
            }
        }
        ?? C = awen.c(avlrVarB);
        ?? r7 = r6;
        if (r6 == 0) {
            r7 = avoi.d;
        }
        C.f(r7);
        if (abmtVar.W()) {
            aazo aazoVar = (aazo) this.d.io();
            if (!aazoVar.a.isEmpty()) {
                C.ag(new abqg(aazoVar, 3), new xuk(18));
            }
        }
        ahgrVarB3.h((agkj) Collection.EL.stream(agkeVar).collect(aghu.a(new aalr(19), new aazx(this, C, 7, r32))));
        return ahgrVarB3.f();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    public final wgs d(wgs wgsVar) throws IOException {
        if (wgsVar.j() > 0 && wgsVar.e() != 22) {
            return wgsVar;
        }
        ?? r5 = this.d;
        sxv sxvVarC = sxv.c();
        ((zyh) r5.io()).a(wgsVar.e, sxvVarC);
        try {
            long jLongValue = ((Long) sxvVarC.get()).longValue();
            aihh aihhVar = (aihh) wgsVar.b.toBuilder();
            Uri uri = wgsVar.e;
            String str = wgsVar.c;
            Uri.Builder builderBuildUpon = uri.buildUpon();
            aihhVar.copyOnWrite();
            alaw alawVar = (alaw) aihhVar.instance;
            alawVar.c |= SemanticState.Modal;
            alawVar.q = jLongValue;
            return yno.et(builderBuildUpon, str, aihhVar);
        } catch (ExecutionException e) {
            throw new IOException("fetchContentLengthIfNecessary failed", e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x0121  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v2, types: [abrf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [abrf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3, types: [wjf] */
    /* JADX WARN: Type inference failed for: r7v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r8v1, types: [awmd, java.lang.Object] */
    public final wjf e(aauo aauoVar) {
        ?? A;
        String str;
        Boolean bool;
        Object obj;
        ListenableFuture listenableFutureAq;
        aeos aeosVar;
        Object obj2;
        taq.c();
        String strK = this.a.e().k();
        byte[] bArr = aauoVar.c;
        byte[] bArr2 = bArr != null ? bArr : new byte[0];
        aofb aofbVar = aauoVar.b;
        String str2 = aauoVar.a;
        aaup aaupVar = new aaup(strK, str2, aofbVar, bArr2);
        int i = 4;
        try {
            Object obj3 = this.i;
            aeov aeovVar = (aeov) ((agm) ((ahgb) obj3).e).b(aaupVar);
            if (aeovVar == null) {
                aeosVar = null;
            } else {
                long j = aeovVar.b;
                if (j == 0) {
                    aeosVar = new aeos(aeovVar.a, 2);
                } else {
                    aeosVar = new aeos(aeovVar.a, j > ((ahgb) obj3).d.b() ? 2 : 4);
                }
            }
            agev agevVar = (agev) ((aher) (aeosVar != null ? ahng.n(agev.i(aeosVar)) : ahng.n(agdf.a))).b;
            if (!agevVar.g() || ((aeos) agevVar.c()).b == 4) {
                A = 0;
            } else {
                obj2 = ((aeos) agevVar.c()).a;
            }
        } catch (InterruptedException | ExecutionException e) {
            zvp.b(zvn.b, zvm.C, "Some error occurred when reading from the cache player response", e);
        }
        if (A == 0) {
            abps abpsVar = (abps) this.g.io();
            abri abriVarD = ((abrg) this.h.io()).d();
            abriVarD.F = true;
            abriVarD.a = str2;
            if (bArr != null) {
                A = obj2;
                abriVarD.o(bArr);
            } else {
                A = obj2;
                abriVarD.m();
            }
            String str3 = aauoVar.d;
            if (str3 != null && str3.length() > 0) {
                abriVarD.c = str3;
            }
            switch (aofbVar) {
                case OFFLINE_TYPE_UNKNOWN:
                    i = 1;
                    if (i != 1) {
                        abriVarD.aj = i;
                    }
                    str = aauoVar.e;
                    if (str != null) {
                        abriVarD.ac = str;
                    }
                    bool = aauoVar.f;
                    ((absg) this.c.io()).hX(abriVarD);
                    if (bool != null) {
                        abriVarD.D = bool.booleanValue();
                    }
                    this.b.hX(abriVarD);
                    this.j.hX(abriVarD);
                    A = abpsVar.a(abriVarD);
                    obj = this.i;
                    if (A == 0) {
                        listenableFutureAq = ahng.m(new IllegalArgumentException("value cannot be null."));
                    } else {
                        listenableFutureAq = ahno.aq(new gmf(obj, aaupVar, (Object) A, 19), ((ahgb) obj).b);
                    }
                    taf.h(listenableFutureAq, MoreExecutors.directExecutor(), new ztb(12));
                    break;
                case OFFLINE_NOW:
                    i = 2;
                    if (i != 1) {
                        abriVarD.aj = i;
                    }
                    str = aauoVar.e;
                    if (str != null) {
                        abriVarD.ac = str;
                    }
                    bool = aauoVar.f;
                    ((absg) this.c.io()).hX(abriVarD);
                    if (bool != null) {
                        abriVarD.D = bool.booleanValue();
                    }
                    this.b.hX(abriVarD);
                    this.j.hX(abriVarD);
                    A = abpsVar.a(abriVarD);
                    obj = this.i;
                    if (A == 0) {
                        listenableFutureAq = ahng.m(new IllegalArgumentException("value cannot be null."));
                    } else {
                        listenableFutureAq = ahno.aq(new gmf(obj, aaupVar, (Object) A, 19), ((ahgb) obj).b);
                    }
                    taf.h(listenableFutureAq, MoreExecutors.directExecutor(), new ztb(12));
                    break;
                case OFFLINE_DEFERRED:
                    i = 3;
                    if (i != 1) {
                        abriVarD.aj = i;
                    }
                    str = aauoVar.e;
                    if (str != null) {
                        abriVarD.ac = str;
                    }
                    bool = aauoVar.f;
                    ((absg) this.c.io()).hX(abriVarD);
                    if (bool != null) {
                        abriVarD.D = bool.booleanValue();
                    }
                    this.b.hX(abriVarD);
                    this.j.hX(abriVarD);
                    A = abpsVar.a(abriVarD);
                    obj = this.i;
                    if (A == 0) {
                        listenableFutureAq = ahng.m(new IllegalArgumentException("value cannot be null."));
                    } else {
                        listenableFutureAq = ahno.aq(new gmf(obj, aaupVar, (Object) A, 19), ((ahgb) obj).b);
                    }
                    taf.h(listenableFutureAq, MoreExecutors.directExecutor(), new ztb(12));
                    break;
                case OFFLINE_MODE_TYPE_OFFLINE_SHARING:
                    if (i != 1) {
                        abriVarD.aj = i;
                    }
                    str = aauoVar.e;
                    if (str != null) {
                        abriVarD.ac = str;
                    }
                    bool = aauoVar.f;
                    ((absg) this.c.io()).hX(abriVarD);
                    if (bool != null) {
                        abriVarD.D = bool.booleanValue();
                    }
                    this.b.hX(abriVarD);
                    this.j.hX(abriVarD);
                    A = abpsVar.a(abriVarD);
                    obj = this.i;
                    if (A == 0) {
                        listenableFutureAq = ahng.m(new IllegalArgumentException("value cannot be null."));
                    } else {
                        listenableFutureAq = ahno.aq(new gmf(obj, aaupVar, (Object) A, 19), ((ahgb) obj).b);
                    }
                    taf.h(listenableFutureAq, MoreExecutors.directExecutor(), new ztb(12));
                    break;
                case OFFLINE_MODE_TYPE_SIDELOAD:
                    i = 5;
                    if (i != 1) {
                        abriVarD.aj = i;
                    }
                    str = aauoVar.e;
                    if (str != null) {
                        abriVarD.ac = str;
                    }
                    bool = aauoVar.f;
                    ((absg) this.c.io()).hX(abriVarD);
                    if (bool != null) {
                        abriVarD.D = bool.booleanValue();
                    }
                    this.b.hX(abriVarD);
                    this.j.hX(abriVarD);
                    A = abpsVar.a(abriVarD);
                    obj = this.i;
                    if (A == 0) {
                        listenableFutureAq = ahng.m(new IllegalArgumentException("value cannot be null."));
                    } else {
                        listenableFutureAq = ahno.aq(new gmf(obj, aaupVar, (Object) A, 19), ((ahgb) obj).b);
                    }
                    taf.h(listenableFutureAq, MoreExecutors.directExecutor(), new ztb(12));
                    break;
                case OFFLINE_MODE_TYPE_AUTO_OFFLINE:
                    i = 6;
                    if (i != 1) {
                        abriVarD.aj = i;
                    }
                    str = aauoVar.e;
                    if (str != null) {
                        abriVarD.ac = str;
                    }
                    bool = aauoVar.f;
                    ((absg) this.c.io()).hX(abriVarD);
                    if (bool != null) {
                        abriVarD.D = bool.booleanValue();
                    }
                    this.b.hX(abriVarD);
                    this.j.hX(abriVarD);
                    A = abpsVar.a(abriVarD);
                    obj = this.i;
                    if (A == 0) {
                        listenableFutureAq = ahng.m(new IllegalArgumentException("value cannot be null."));
                    } else {
                        listenableFutureAq = ahno.aq(new gmf(obj, aaupVar, (Object) A, 19), ((ahgb) obj).b);
                    }
                    taf.h(listenableFutureAq, MoreExecutors.directExecutor(), new ztb(12));
                    break;
                case OFFLINE_MODE_TYPE_DOWNLOAD_RECOMMENDATIONS:
                    i = 7;
                    if (i != 1) {
                        abriVarD.aj = i;
                    }
                    str = aauoVar.e;
                    if (str != null) {
                        abriVarD.ac = str;
                    }
                    bool = aauoVar.f;
                    ((absg) this.c.io()).hX(abriVarD);
                    if (bool != null) {
                        abriVarD.D = bool.booleanValue();
                    }
                    this.b.hX(abriVarD);
                    this.j.hX(abriVarD);
                    A = abpsVar.a(abriVarD);
                    obj = this.i;
                    if (A == 0) {
                        listenableFutureAq = ahng.m(new IllegalArgumentException("value cannot be null."));
                    } else {
                        listenableFutureAq = ahno.aq(new gmf(obj, aaupVar, (Object) A, 19), ((ahgb) obj).b);
                    }
                    taf.h(listenableFutureAq, MoreExecutors.directExecutor(), new ztb(12));
                    break;
                case OFFLINE_MODE_TYPE_EMERGENCY_BUFFER:
                    i = 8;
                    if (i != 1) {
                        abriVarD.aj = i;
                    }
                    str = aauoVar.e;
                    if (str != null) {
                        abriVarD.ac = str;
                    }
                    bool = aauoVar.f;
                    ((absg) this.c.io()).hX(abriVarD);
                    if (bool != null) {
                        abriVarD.D = bool.booleanValue();
                    }
                    this.b.hX(abriVarD);
                    this.j.hX(abriVarD);
                    A = abpsVar.a(abriVarD);
                    obj = this.i;
                    if (A == 0) {
                        listenableFutureAq = ahng.m(new IllegalArgumentException("value cannot be null."));
                    } else {
                        listenableFutureAq = ahno.aq(new gmf(obj, aaupVar, (Object) A, 19), ((ahgb) obj).b);
                    }
                    taf.h(listenableFutureAq, MoreExecutors.directExecutor(), new ztb(12));
                    break;
                default:
                    throw new RuntimeException(null, null);
            }
        }
        A = obj2;
        return A;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(String str) {
        aaum aaumVar = new aaum(this, str, 0);
        Object obj = this.i;
        taf.h(ahno.aq(new wan(obj, aaumVar, 19, null), ((ahgb) obj).b), MoreExecutors.directExecutor(), new ztb(11));
    }

    public final wjf j(String str, aofb aofbVar, byte[] bArr, String str2, String str3) {
        aaun aaunVarA = aauo.a(str, aofbVar);
        aaunVarA.c = bArr;
        aaunVarA.d = str2;
        aaunVarA.e = str3;
        return e(aaunVarA.a());
    }

    public final /* synthetic */ void m(String str, aaup aaupVar) {
        ArrayList arrayList = new ArrayList();
        if (aaupVar.a.equals(str)) {
            ((agm) ((ahgb) this.i).e).d(aaupVar);
            arrayList.add(ahng.n(null));
        }
        try {
            ahng.g(arrayList).a(new okp(15), MoreExecutors.directExecutor()).get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zvp.b(zvn.b, zvm.C, "Some error occurred when evicting player response", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [awmd, java.lang.Object] */
    public final wgs n(int i, aodp aodpVar, wja wjaVar, boolean z, wiu wiuVar) {
        wgs wgsVar;
        if (i(i) && !z) {
            return null;
        }
        boolean z2 = wjaVar.A;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        if (z2) {
            String str = wjaVar.g;
            if (!yvf.b()) {
                i2 = 480;
            }
        }
        try {
            yod yodVarB = ((yob) ((aazo) this.e.io()).a.io()).b(wjaVar, wiuVar, z, new yoc(new yog(i, i), aazo.c(aodpVar), true, null, -1, -2, -1L, Alert.DURATION_SHOW_INDEFINITELY, 0, null), i2);
            wgs[] wgsVarArrN = yodVarB.n();
            wgs[] wgsVarArr = z ? yodVarB.c : wgsVarArrN;
            if (wgsVarArr.length > 0) {
                wgsVar = wgsVarArr[0];
            } else {
                aoqd aoqdVar = wiuVar.d;
                if ((aoqdVar.b & SemanticState.Obscured) != 0) {
                    ajbx ajbxVar = aoqdVar.k;
                    if (ajbxVar == null) {
                        ajbxVar = ajbx.a;
                    }
                    if (ajbxVar.i) {
                        wgsVar = null;
                    } else if (z) {
                        wgsVar = null;
                    } else {
                        wgsVar = null;
                    }
                } else if (z || wgsVarArrN.length <= 0 || !wgsVarArrN[0].aa()) {
                    wgsVar = null;
                } else {
                    wgsVar = wgsVarArrN[0];
                }
            }
        } catch (yof unused) {
        }
        if (wgsVar == null) {
            return null;
        }
        try {
            return d(wgsVar);
        } catch (IOException unused2) {
            return null;
        }
    }

    public final void o(Optional optional, pzt pztVar) {
        ((elr) this.e).p(aaao.TTL, false);
        if (optional.isEmpty()) {
            return;
        }
        ahgb ahgbVar = (ahgb) this.i;
        ahgbVar.i((ajcs) optional.get());
        ahgbVar.h((ajcs) optional.get(), pztVar.a);
    }

    public final void p(ozj ozjVar, pzx pzxVar) {
        Optional optionalS = ((elr) this.j).s(ozjVar);
        if (optionalS.isEmpty()) {
            return;
        }
        String str = ozjVar.a;
        Map map = pzxVar.b;
        if (map == null || !map.containsKey(str)) {
            ((elr) this.e).p(aaao.DISMISSED, false);
            ahgb ahgbVar = (ahgb) this.i;
            ahgbVar.i((ajcs) optionalS.get());
            ahgbVar.h((ajcs) optionalS.get(), pzxVar.a);
            return;
        }
        if (!(map.get(str) instanceof qad)) {
            if (map.get(str) instanceof qaa) {
                ((elr) this.e).p(aaao.REPLACED, false);
                return;
            }
            return;
        }
        ((elr) this.e).p(aaao.CAPPED, false);
        Object obj = this.i;
        ajcs ajcsVar = (ajcs) optionalS.get();
        xgt xgtVarB = aabp.b(pzxVar.a);
        if (xgtVarB == null) {
            ((ahgb) obj).e();
            return;
        }
        amud amudVar = ajcsVar.m;
        if (amudVar == null) {
            amudVar = amud.b;
        }
        if ((amudVar.c & 1) != 0) {
            amud amudVar2 = ajcsVar.m;
            if (amudVar2 == null) {
                amudVar2 = amud.b;
            }
            ((ahgb) obj).g(amudVar2.d, xgtVarB);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void q(aicf aicfVar) {
        String str = aicfVar.c == 4 ? (String) aicfVar.d : "";
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    ((elr) this.e).p(aaao.ACTION1_CLICKED, false);
                }
                break;
            case 49:
                if (str.equals("1")) {
                    ((elr) this.e).p(aaao.ACTION2_CLICKED, false);
                }
                break;
            case 50:
                if (str.equals("2")) {
                    ((elr) this.e).p(aaao.ACTION3_CLICKED, false);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, xgn] */
    public final void r(ozj ozjVar, pzp pzpVar, int i, boolean z) {
        Optional optionalS = ((elr) this.j).s(ozjVar);
        if (optionalS.isEmpty()) {
            return;
        }
        ajcs ajcsVar = (ajcs) optionalS.get();
        Object obj = this.i;
        String str = ozjVar.a;
        amud amudVar = ajcsVar.m;
        if (amudVar == null) {
            amudVar = amud.b;
        }
        if ((amudVar.c & 1) != 0) {
            ahgb ahgbVar = (ahgb) obj;
            Optional optionalW = ((elr) ahgbVar.d).w(str);
            if (!optionalW.isEmpty()) {
                ?? r4 = ahgbVar.b;
                r4.C((xgt) optionalW.get());
                amud amudVar2 = ajcsVar.m;
                if (amudVar2 == null) {
                    amudVar2 = amud.b;
                }
                xgj xgjVar = new xgj(amudVar2.d, (amud) null);
                aihf aihfVarCreateBuilder = amdm.a.createBuilder();
                if (!((vxz) ahgbVar.e).l(21, 45699164L, false)) {
                    boolean z2 = i == 3;
                    aihfVarCreateBuilder.copyOnWrite();
                    amdm amdmVar = (amdm) aihfVarCreateBuilder.instance;
                    amdmVar.b |= 16;
                    amdmVar.e = z2;
                    aihfVarCreateBuilder.copyOnWrite();
                    amdm amdmVar2 = (amdm) aihfVarCreateBuilder.instance;
                    amdmVar2.b |= 8;
                    amdmVar2.d = z;
                }
                if (pzpVar != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    amdm amdmVar3 = (amdm) aihfVarCreateBuilder.instance;
                    amdmVar3.b |= 4;
                    amdmVar3.c = pzpVar.h;
                }
                aihf aihfVarCreateBuilder2 = amdd.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amdd amddVar = (amdd) aihfVarCreateBuilder2.instance;
                amdm amdmVar4 = (amdm) aihfVarCreateBuilder.build();
                amdmVar4.getClass();
                amddVar.B = amdmVar4;
                amddVar.d |= 262144;
                amdd amddVar2 = (amdd) aihfVarCreateBuilder2.build();
                r4.d(xgjVar);
                r4.w(xgjVar, amddVar2);
                if ((ajcsVar.b & 32) != 0) {
                    aqgg aqggVar = ajcsVar.j;
                    if (aqggVar == null) {
                        aqggVar = aqgg.a;
                    }
                    for (aqgf aqgfVar : aqggVar.b) {
                        if ((aqgfVar.b & 4) != 0) {
                            amud amudVar3 = aqgfVar.e;
                            if (amudVar3 == null) {
                                amudVar3 = amud.b;
                            }
                            if ((amudVar3.c & 1) != 0) {
                                r4.w(new xgj(amudVar3.d, (amud) null), null);
                            }
                        }
                    }
                }
            }
        }
        if (ajcsVar.h.size() > 0) {
            this.h.execute(afwl.i(new zgc(this, ajcsVar, 17)));
        }
        if ((ajcsVar.b & 16) != 0) {
            ?? r11 = ((ahgb) obj).c;
            ajwo ajwoVar = ajcsVar.g;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            r11.c(ajwoVar, pzpVar != null ? agkj.j("ALL_IMAGES_LOADED", Boolean.valueOf(pzpVar.h)) : agpn.b);
        }
    }

    public abqq(vxe vxeVar, Executor executor, Executor executor2, elr elrVar, elr elrVar2, aaap aaapVar, vxz vxzVar, ahgb ahgbVar, Map map, awmd awmdVar) {
        this.a = vxeVar;
        this.h = executor;
        this.g = executor2;
        this.j = elrVar;
        this.e = elrVar2;
        this.f = aaapVar;
        this.b = vxzVar;
        this.i = ahgbVar;
        this.c = map;
        this.d = awmdVar;
    }

    public abqq(agfr agfrVar, Key key, zgy zgyVar, zgy zgyVar2, mbc mbcVar, ygf ygfVar, tgr tgrVar, Optional optional, zjr zjrVar) {
        this.j = new Object();
        agfrVar.getClass();
        this.g = agfrVar;
        key.getClass();
        this.d = key;
        zgyVar.getClass();
        this.i = zgyVar;
        this.c = zgyVar2;
        mbcVar.getClass();
        this.e = mbcVar;
        ygfVar.getClass();
        this.f = ygfVar;
        tgrVar.getClass();
        this.a = tgrVar;
        this.h = optional;
        this.b = zjrVar;
    }

    public abqq(tbt tbtVar, abqx abqxVar, zwb zwbVar, awmd awmdVar, vyo vyoVar, yrx yrxVar, avmb avmbVar, avmb avmbVar2, abmt abmtVar, awmd awmdVar2) {
        this.a = tbtVar;
        this.b = abqxVar;
        this.d = awmdVar;
        this.e = vyoVar;
        this.f = yrxVar;
        this.c = zwbVar;
        this.g = avmbVar;
        this.h = avmbVar2;
        this.i = abmtVar;
        this.j = awmdVar2;
    }
}
