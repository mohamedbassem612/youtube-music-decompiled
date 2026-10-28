package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ycd implements tcr {
    public static final Duration a;
    public final Context b;
    public final agfx c;
    public final aunn d;
    public final aunn e;
    public final Map f;
    public final awtr g;
    public final axaf h;
    public final axae i;
    public final vxz j;
    private final awut k;
    private final awut l;
    private final aunn m;
    private final awou n;
    private final awmi o;
    private final CopyOnWriteArrayList p;
    private final awwd q;
    private final awut r;
    private final awwd s;
    private final oml t;

    static {
        twu.b("MDx.RemoteScreenClient").getClass();
        ahng.E(1);
        a = ahng.E(10);
    }

    public ycd(Context context, agfx agfxVar, awut awutVar, awut awutVar2, vxz vxzVar, aunn aunnVar, dov dovVar, aunn aunnVar2, awou awouVar, oml omlVar, aunn aunnVar3, aunn aunnVar4) {
        context.getClass();
        awutVar.getClass();
        awutVar2.getClass();
        vxzVar.getClass();
        aunnVar.getClass();
        dovVar.getClass();
        aunnVar2.getClass();
        awouVar.getClass();
        omlVar.getClass();
        aunnVar3.getClass();
        aunnVar4.getClass();
        this.b = context;
        this.c = agfxVar;
        this.k = awutVar;
        this.l = awutVar2;
        this.j = vxzVar;
        this.m = aunnVar;
        this.n = awouVar;
        this.t = omlVar;
        this.d = aunnVar3;
        this.e = aunnVar4;
        this.o = new awmp(new yhn(aunnVar2, 1));
        this.p = new CopyOnWriteArrayList();
        this.f = new LinkedHashMap();
        this.g = new awtr(amyh.MDX_POLLING_FREQUENCY_ACTIVE, awts.a);
        this.h = axaw.a(null);
        this.q = awro.t(awutVar, null, 2, new bej(this, (awoq) null, 14), 1);
        this.r = awrc.L(awrc.L(awutVar, new awxf((awwd) awutVar.b().get(awwd.d))), new awus("MdxRemoteScreenClientPings"));
        this.i = axal.e(2, 2);
        this.s = awro.t(awutVar2, null, 2, new bej(this, (awoq) null, 15, (byte[]) null), 1);
        if (vxzVar.l(164, 45673420L, false)) {
            omlVar.g(this);
        }
    }

    private final Object l(alpn alpnVar, awoq awoqVar) {
        return awro.p(this.n, new tiy(this, alpnVar, (awoq) null, 5), awoqVar);
    }

    @Override // defpackage.tcr
    public final void a() {
        if (this.j.l(164, 45673420L, false) && h().b == 1) {
            awro.t(this.r, null, 0, new ifk(this, (awoq) null, 2), 3);
        }
    }

    public final amyh b() {
        return (amyh) this.g.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(alpn alpnVar, awoq awoqVar) throws Throwable {
        ybv ybvVar;
        if (awoqVar instanceof ybv) {
            ybvVar = (ybv) awoqVar;
            int i = ybvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ybvVar.c = i - Integer.MIN_VALUE;
            } else {
                ybvVar = new ybv(this, awoqVar);
            }
        } else {
            ybvVar = new ybv(this, awoqVar);
        }
        Object objL = ybvVar.a;
        Object obj = awox.a;
        int i2 = ybvVar.c;
        if (i2 == 0) {
            atqp.j(objL);
            aisa aisaVar = alpnVar.d;
            if (aisaVar == null) {
                aisaVar = aisa.a;
            }
            aisaVar.b.isEmpty();
            ybvVar.c = 1;
            objL = l(alpnVar, ybvVar);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objL);
        }
        List list = (List) objL;
        list.size();
        Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            yar yarVar = (yar) next;
            if (yarVar.x.l(164, 45673420L, false)) {
                CopyOnWriteArrayList copyOnWriteArrayList = yarVar.f;
                if (!list.equals(copyOnWriteArrayList)) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yarVar.b;
                    agke agkeVar = (agke) Collection.EL.stream(copyOnWriteArrayList2).filter(new xdn(12)).collect(aghu.a);
                    copyOnWriteArrayList2.clear();
                    copyOnWriteArrayList2.addAll(list);
                    copyOnWriteArrayList2.addAll(agkeVar);
                    copyOnWriteArrayList.clear();
                    copyOnWriteArrayList.addAll(list);
                    yarVar.k();
                }
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(alpn alpnVar, xzc xzcVar, awoq awoqVar) throws Throwable {
        ybw ybwVar;
        Object obj;
        List list;
        awou awouVar;
        tiy tiyVar;
        if (awoqVar instanceof ybw) {
            ybwVar = (ybw) awoqVar;
            int i = ybwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ybwVar.d = i - Integer.MIN_VALUE;
            } else {
                ybwVar = new ybw(this, awoqVar);
            }
        } else {
            ybwVar = new ybw(this, awoqVar);
        }
        Object objL = ybwVar.b;
        Object obj2 = awox.a;
        int i2 = ybwVar.d;
        if (i2 == 0) {
            atqp.j(objL);
            aisa aisaVar = alpnVar.d;
            if (aisaVar == null) {
                aisaVar = aisa.a;
            }
            aiie aiieVar = aisaVar.b;
            aiieVar.getClass();
            if (!aiieVar.isEmpty()) {
                ybwVar.a = xzcVar;
                ybwVar.d = 1;
                objL = l(alpnVar, ybwVar);
                if (objL == obj2) {
                    obj = xzcVar;
                    return obj2;
                }
                obj = xzcVar;
                list = (List) objL;
                if (obj == h().e) {
                    awouVar = this.n;
                    tiyVar = new tiy(this, list, (awoq) null, 4);
                    ybwVar.a = null;
                    ybwVar.d = 2;
                    if (awro.p(awouVar, tiyVar, ybwVar) == obj2) {
                        return obj2;
                    }
                }
            }
        } else if (i2 == 1) {
            Object obj3 = ybwVar.a;
            atqp.j(objL);
            obj = obj3;
            obj = xzcVar;
            list = (List) objL;
            if (obj == h().e) {
                awouVar = this.n;
                tiyVar = new tiy(this, list, (awoq) null, 4);
                ybwVar.a = null;
                ybwVar.d = 2;
                if (awro.p(awouVar, tiyVar, ybwVar) == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objL);
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, awoq awoqVar) throws Throwable {
        ybz ybzVar;
        if (awoqVar instanceof ybz) {
            ybzVar = (ybz) awoqVar;
            int i = ybzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ybzVar.c = i - Integer.MIN_VALUE;
            } else {
                ybzVar = new ybz(this, awoqVar);
            }
        } else {
            ybzVar = new ybz(this, awoqVar);
        }
        Object objF = ybzVar.a;
        awox awoxVar = awox.a;
        int i2 = ybzVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                this = ybzVar.d;
                atqp.j(objF);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objF);
            }
            return awmy.a;
        }
        atqp.j(objF);
        ybzVar.d = this;
        ybzVar.c = 1;
        objF = f(null, str, ybzVar);
        if (objF == awoxVar) {
            return awoxVar;
        }
        alpn alpnVar = ((ybs) objF).b;
        ybzVar.d = null;
        ybzVar.c = 2;
        if (this.c(alpnVar, ybzVar) == awoxVar) {
            return awoxVar;
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, String str2, awoq awoqVar) throws Throwable {
        yca ycaVar;
        if (awoqVar instanceof yca) {
            ycaVar = (yca) awoqVar;
            int i = ycaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ycaVar.c = i - Integer.MIN_VALUE;
            } else {
                ycaVar = new yca(this, awoqVar);
            }
        } else {
            ycaVar = new yca(this, awoqVar);
        }
        Object objAd = ycaVar.a;
        awox awoxVar = awox.a;
        int i2 = ycaVar.c;
        try {
            if (i2 == 0) {
                atqp.j(objAd);
                ListenableFuture listenableFutureA = ((yba) this.m.io()).a(str, str2);
                ycaVar.d = str;
                ycaVar.c = 1;
                objAd = awrc.ad(listenableFutureA, ycaVar);
                if (objAd == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = ycaVar.d;
                atqp.j(objAd);
            }
            alpn alpnVar = (alpn) objAd;
            akeh akehVar = alpnVar.e;
            if (akehVar == null) {
                akehVar = akeh.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apho.b);
            akehVar.c(aihlVarCheckIsLite);
            Object objK = akehVar.j.k(aihlVarCheckIsLite.d);
            Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
            if (1 != (((apho) objC).c & 1)) {
                objC = null;
            }
            apho aphoVar = (apho) objC;
            return new ybs(aphoVar != null ? aphoVar.d : null, alpnVar);
        } catch (CancellationException e) {
            throw e;
        } catch (toe unused) {
            alpn alpnVar2 = alpn.a;
            alpnVar2.getClass();
            return new ybs(str, alpnVar2);
        }
    }

    public final void g(amyh amyhVar, String str) {
        Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
        }
        if (amyhVar == null) {
            amyhVar = b();
        }
        if (amyhVar == amyh.MDX_POLLING_FREQUENCY_PING) {
            awro.t(this.r, null, 0, new qbj(this, str, (awoq) null, 18), 3);
            return;
        }
        ybt ybtVar = new ybt(amyhVar, str);
        this.h.d(ybtVar);
        this.q.v();
        if (this.j.l(219, 45780219L, false) && ybtVar.a == amyh.MDX_POLLING_FREQUENCY_ACTIVE) {
            this.s.v();
            this.i.b(ybtVar.b);
        }
    }

    public final ycp h() {
        return (ycp) this.o.a();
    }

    public final boolean i(yar yarVar) {
        return this.p.indexOf(yarVar) != -1;
    }

    public final void j(yar yarVar) {
        this.p.add(yarVar);
    }

    public final void k(yar yarVar) {
        this.p.remove(yarVar);
    }
}
