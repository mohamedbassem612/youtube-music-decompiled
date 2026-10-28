package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;
import j$.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aebc {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [mbc] */
    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, tqj] */
    public aebc(aerj aerjVar, String str) {
        ?? r1;
        this.g = aerjVar;
        this.e = new CopyOnWriteArrayList();
        ?? r0 = aerjVar.d;
        int i = tqr.a;
        boolean zK = r0.k(1073807904);
        this.a = zK;
        if (trj.b != 0) {
            ?? r2 = aerjVar.e;
            this.c = new trh(str, (mbc) r2, 32);
            r1 = r2;
        } else {
            r1 = 0;
            this.c = null;
        }
        this.f = new AtomicBoolean(false);
        tqz[] tqzVarArr = {new tqz(aerjVar.l(), r1, zK, aerjVar.d.k(1073815426)), new tqz((Executor) aerjVar.b.io(), r1, zK, aerjVar.d.k(1073815426))};
        this.b = tqzVarArr;
        avql avqlVar = new avql(new avle[]{tqzVarArr[0].a, tqzVarArr[1].a});
        avnn avnnVar = atqp.p;
        this.d = avqlVar;
        avqlVar.E(new hwu(2));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final akku a(xie xieVar, alot alotVar) {
        ?? r2 = this.f;
        if (((xic) r2.io()).h.i) {
            return akku.DELAYED_EVENT_TIER_IMMEDIATE;
        }
        Optional optional = xieVar.g;
        return (!optional.isPresent() || optional.get() == akku.DELAYED_EVENT_TIER_UNSPECIFIED) ? (akku) Objects.requireNonNullElse((akku) ((xic) r2.io()).f.get(alotVar), akku.DELAYED_EVENT_TIER_DEFAULT) : (akku) optional.get();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    public final boolean b(alot alotVar, xie xieVar) {
        if (alotVar.equals(alot.PAYLOAD_NOT_SET)) {
            ((xif) this.d).a("ClientEvent does not have one and only one payload set.");
            return false;
        }
        ?? r0 = this.g;
        int i = tqr.a;
        int iA = r0.a(1073894468);
        if (iA != 1) {
            if (iA == 2 && !xieVar.f) {
                return false;
            }
        } else if (xieVar.f) {
            return false;
        }
        long j = xieVar.a;
        xic xicVar = (xic) this.f.io();
        if (xicVar.d.contains(alotVar)) {
            return false;
        }
        Long l = (Long) xicVar.g.get(alotVar);
        return l == null || j >= l.longValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, tqj] */
    public final aihf c(alos alosVar, xie xieVar) {
        alov alovVar = ((alou) alosVar.instance).f;
        if (alovVar == null) {
            alovVar = alov.a;
        }
        long j = xieVar.b;
        aihf builder = alovVar.toBuilder();
        builder.copyOnWrite();
        alov alovVar2 = (alov) builder.instance;
        alovVar2.b |= 1;
        alovVar2.c = j;
        ?? r6 = this.g;
        int i = tqr.a;
        if (r6.k(1073828934)) {
            aihf aihfVarCreateBuilder = aoky.a.createBuilder();
            boolean z = xieVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            aoky aokyVar = (aoky) aihfVarCreateBuilder.instance;
            aokyVar.b |= 1;
            aokyVar.c = z;
            builder.copyOnWrite();
            alov alovVar3 = (alov) builder.instance;
            aoky aokyVar2 = (aoky) aihfVarCreateBuilder.build();
            aokyVar2.getClass();
            alovVar3.e = aokyVar2;
            alovVar3.b |= 8;
            ajij ajijVar = xieVar.e;
            if (ajijVar != ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN) {
                builder.copyOnWrite();
                alov alovVar4 = (alov) builder.instance;
                alovVar4.f = ajijVar.k;
                alovVar4.b |= 16;
            }
        }
        long j2 = xieVar.a;
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        alouVar.b |= 1;
        alouVar.e = j2;
        alosVar.copyOnWrite();
        alou alouVar2 = (alou) alosVar.instance;
        alov alovVar5 = (alov) builder.build();
        alovVar5.getClass();
        alouVar2.f = alovVar5;
        alouVar2.b |= 2;
        aihf aihfVarCreateBuilder2 = jrc.a.createBuilder();
        aigj byteString = ((alou) alosVar.build()).toByteString();
        aihfVarCreateBuilder2.copyOnWrite();
        jrc jrcVar = (jrc) aihfVarCreateBuilder2.instance;
        jrcVar.b |= 4;
        jrcVar.e = byteString;
        aihfVarCreateBuilder2.copyOnWrite();
        jrc jrcVar2 = (jrc) aihfVarCreateBuilder2.instance;
        jrcVar2.b |= 2;
        jrcVar2.d = "event_logging";
        String str = xieVar.c;
        aihfVarCreateBuilder2.copyOnWrite();
        jrc jrcVar3 = (jrc) aihfVarCreateBuilder2.instance;
        str.getClass();
        jrcVar3.b |= 16;
        jrcVar3.g = str;
        Optional optional = xieVar.d;
        hkp hkpVar = new hkp(aihfVarCreateBuilder2, 15);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) hkpVar.a;
            aihfVar.copyOnWrite();
            jrc jrcVar4 = (jrc) aihfVar.instance;
            jrcVar4.b |= SemanticState.Focused;
            jrcVar4.j = (String) obj;
        }
        if (xieVar.h) {
            aihfVarCreateBuilder2.copyOnWrite();
            jrc jrcVar5 = (jrc) aihfVarCreateBuilder2.instance;
            jrcVar5.b |= SemanticState.Hidden;
            jrcVar5.k = true;
        }
        return aihfVarCreateBuilder2;
    }

    public final void d(int i, int i2) {
        if (i2 != 0) {
            Object obj = this.c;
            if (obj != null) {
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f;
                if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
                    ((trh) obj).f(null);
                    ((avlb) this.d).F(new hoi(obj, 18), new sqk(obj, 16));
                }
            }
            ((tqz[]) this.b)[i].b(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void e(int i, int i2, Throwable th) {
        if (th != null) {
            this.e.add(th);
        }
        d(0, i2);
        d(1, i);
    }

    public final void f(avlb avlbVar, final int i, final int i2) {
        ege egeVar = new ege(((aerj) this.g).l(), 4);
        avmb avmbVar = awlg.a;
        avlbVar.r(new awir(egeVar)).F(new avnd() { // from class: tqx
            @Override // defpackage.avnd
            public final void a() {
                this.c.e(i, i2, null);
            }
        }, new avni() { // from class: tqy
            @Override // defpackage.avni
            public final void a(Object obj) {
                this.c.e(i, i2, (Throwable) obj);
            }
        });
    }

    public final void g() {
        tqz[] tqzVarArr = (tqz[]) this.b;
        tqzVarArr[0].g();
        tqzVarArr[1].g();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final void h(trb trbVar, Throwable th) {
        int i = trbVar.b;
        if (th != null) {
            this.e.add(th);
            i = 0;
        }
        ((tqz[]) this.b)[i].a(trbVar.c);
    }

    public final void i(trb... trbVarArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i >= trbVarArr.length) {
                break;
            }
            trb trbVar = trbVarArr[i];
            int i4 = ((int[]) ((aerj) this.g).c)[trbVar.b];
            int i5 = trbVar.e;
            if (i4 == 0) {
                i2 += i5;
            } else {
                i3 += i5;
            }
            i++;
        }
        tqz[] tqzVarArr = (tqz[]) this.b;
        tqzVarArr[0].d(i2);
        tqzVarArr[1].d(i3);
        for (trb trbVar2 : trbVarArr) {
            if (trbVar2.e != 0) {
                avlb avlbVar = trbVar2.a;
                byte[] bArr = null;
                if (avlbVar == null) {
                    h(trbVar2, null);
                } else {
                    avlbVar.F(new tdt(this, trbVar2, 2), new jbq(this, trbVar2, 2, bArr));
                }
            }
        }
    }

    @Deprecated
    public final void j(avmb avmbVar, trb... trbVarArr) {
        for (int i = 0; i < 2; i++) {
            trb trbVar = trbVarArr[i];
            avlb avlbVar = trbVar.a;
            if (avlbVar == null) {
                avlbVar = avpy.a;
                avnn avnnVar = atqp.p;
            }
            trbVar.a = avlbVar.r(avmbVar);
        }
        i(trbVarArr);
    }

    public aebc(mlo mloVar, aecs aecsVar, ntu ntuVar, afip afipVar, nqt nqtVar, adwq adwqVar, boolean z) {
        this.g = mloVar;
        this.b = aecsVar;
        this.c = ntuVar;
        this.d = afipVar;
        this.e = nqtVar;
        this.f = adwqVar;
        this.a = z;
    }

    public aebc(awmd awmdVar, xet xetVar, awmd awmdVar2, dov dovVar, tqj tqjVar, awmd awmdVar3) {
        this.e = awmdVar;
        this.c = xetVar;
        this.f = awmdVar2;
        this.d = dovVar.Q("DELAYED_EVENTS_TRANSPORT");
        this.g = tqjVar;
        this.b = awmdVar3;
        int i = zte.a;
        int i2 = tqr.a;
        boolean z = false;
        if (tqjVar.t(1024L) && tqjVar.a(1074135289) >= 4) {
            z = true;
        }
        this.a = z;
    }
}
