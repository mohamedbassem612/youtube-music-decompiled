package defpackage;

import android.util.Pair;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abqe implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abqe(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v27, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v64, types: [awqg, java.lang.Object] */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        int i = 14;
        switch (this.$cid) {
            case 0:
                obj.getClass();
                return this.a.invoke(obj);
            case 1:
                obj.getClass();
                return this.a.invoke(obj);
            case 2:
                obj.getClass();
                return this.a.invoke(obj);
            case 3:
                aoqd aoqdVar = ((aayp) obj).a.f().d;
                aqjo aqjoVar = aoqdVar.H;
                if (aqjoVar == null) {
                    aqjoVar = aqjo.a;
                }
                final Duration durationOfMillis = Duration.ofMillis(aqjoVar.b);
                aqjo aqjoVar2 = aoqdVar.H;
                if (aqjoVar2 == null) {
                    aqjoVar2 = aqjo.a;
                }
                Object obj2 = this.a;
                final Duration durationOfMillis2 = Duration.ofMillis(aqjoVar2.c);
                abfb abfbVar = new abfb(i);
                final abvb abvbVar = (abvb) obj2;
                return aawb.w(abvbVar.b, abfbVar).x(new avno() { // from class: abva
                    @Override // defpackage.avno
                    public final boolean a(Object obj3) {
                        aazk aazkVar = (aazk) obj3;
                        if (abvb.a(aazkVar).compareTo(durationOfMillis) < 0) {
                            if (abvb.a(aazkVar).compareTo(durationOfMillis2) >= 0 && !abvbVar.c(aazkVar)) {
                                return false;
                            }
                        }
                        return true;
                    }
                }).H(new hpn(obj2, durationOfMillis, 18));
            case 4:
                ((abvp) this.a).a.a();
                return ((aazq) obj).b.ar().g();
            case 5:
                return new Pair(((aazq) this.a).b, obj);
            case 6:
                obj.getClass();
                return this.a.invoke(obj);
            case 7:
                obj.getClass();
                return this.a.invoke(obj);
            case 8:
                obj.getClass();
                return this.a.invoke(obj);
            case 9:
                String str = acjr.a;
                obj.getClass();
                return this.a.invoke(obj);
            case 10:
                String str2 = acjr.a;
                obj.getClass();
                return this.a.invoke(obj);
            case 11:
                obj.getClass();
                return this.a.invoke(obj);
            case 12:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                Object obj3 = this.a;
                acng acngVar = (acng) obj3;
                acngVar.e = zBooleanValue;
                if (bool.booleanValue()) {
                    aunn aunnVar = acngVar.a;
                    return avlh.g(tzk.V(nsj.f(), ((vor) aunnVar.io()).d.j), ((vor) aunnVar.io()).d.q, nsj.f(), new acnc(obj3, 0));
                }
                acngVar.b(0);
                acngVar.c(0);
                acngVar.d(0);
                if (acngVar.o.aM()) {
                    acngVar.k = null;
                    acngVar.l = false;
                }
                return avlh.G(Boolean.FALSE);
            case 13:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                Object obj4 = this.a;
                acng acngVar2 = (acng) obj4;
                acngVar2.e = zBooleanValue2;
                if (bool2.booleanValue()) {
                    aunn aunnVar2 = acngVar2.a;
                    return avlh.f(tzk.V(nsj.f(), ((vor) aunnVar2.io()).d.j), ((vor) aunnVar2.io()).d.q, new vnc(obj4, 7));
                }
                acngVar2.b(0);
                acngVar2.c(0);
                if (acngVar2.o.aM()) {
                    acngVar2.k = null;
                    acngVar2.l = false;
                }
                return avlh.G(Boolean.FALSE);
            case 14:
                return ((acoi) this.a).w((alqc) obj);
            case 15:
                boolean z = !acsj.h((apef) obj);
                acoi acoiVar = (acoi) this.a;
                if (!acoiVar.ck.u() || !acoiVar.bI.isPresent() || ((acmi) acoiVar.bI.get()).c.isEmpty()) {
                    return acmi.c(z, true, null, null, null, acoiVar.F());
                }
                acmi acmiVar = (acmi) acoiVar.bI.get();
                return acmi.b(z, acmiVar.c, acmiVar.d, acmiVar.i, acoiVar.F());
            case 16:
                return acmi.c(true, true, null, null, null, ((acoi) this.a).F());
            case 17:
                acoi acoiVar2 = (acoi) this.a;
                return acoiVar2.bm.isEmpty() ? acmi.c(true, false, null, null, null, acoiVar2.F()) : acoiVar2.w((alqc) acoiVar2.bm.get());
            case 18:
                Object obj5 = this.a;
                return ((acoi) obj5).aN.ar().K(new abqe(obj5, i));
            case 19:
                acip acipVar = ((aazq) this.a).b;
                String str3 = acoi.g;
                return Pair.create(acipVar, Long.valueOf(((aaxt) obj).a));
            default:
                return a.m(this.a, obj);
        }
    }
}
