package defpackage;

import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yrc implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ yrc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, tjk] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, tjk] */
    /* JADX WARN: Type inference failed for: r7v20, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v42, types: [awqg, java.lang.Object] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        Object obj2;
        int i = 19;
        boolean zContains = false;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((yrd) this.a).a.onNetworkActiveStateChanged(bool.booleanValue());
                return awmy.a;
            case 1:
                ((Long) obj).getClass();
                return Boolean.valueOf(((yrd) this.a).b.c());
            case 2:
                tnm tnmVar = (tnm) obj;
                tnmVar.getClass();
                this.a.c(tnmVar);
                return awmy.a;
            case 3:
                Throwable th = (Throwable) obj;
                th.getClass();
                this.a.b(th);
                return awmy.a;
            case 4:
                ((ytc) this.a).c();
                return awmy.a;
            case 5:
                ((ytc) this.a).c();
                return awmy.a;
            case 6:
                String str = ((ywz) this.a.invoke(obj)).h().g;
                str.getClass();
                return str;
            case 7:
                ((zqt) obj).a((zrc) this.a);
                return awmy.a;
            case 8:
                ((zqt) obj).a((zrc) this.a);
                return awmy.a;
            case 9:
                ((zqt) obj).a((zrc) this.a);
                return awmy.a;
            case 10:
                ((zqt) obj).a((zrc) this.a);
                return awmy.a;
            case 11:
                zrh zrhVar = (zrh) obj;
                zrhVar.getClass();
                Iterator it = ((aeiv) this.a).a.iterator();
                while (it.hasNext()) {
                    ((awqg) it.next()).invoke(zrhVar);
                }
                return awmy.a;
            case 12:
                obj.getClass();
                Object objInvoke = this.a.invoke(obj);
                return objInvoke != null ? avlm.q(objInvoke) : avlm.l();
            case 13:
                ((ConcurrentHashMap) ((xsc) this.a).c).clear();
                return awmy.a;
            case 14:
                abii abiiVar = (abii) this.a;
                ConcurrentHashMap concurrentHashMap = abiiVar.f;
                aazq aazqVar = (aazq) obj;
                for (Object obj3 : concurrentHashMap.values()) {
                    obj3.getClass();
                    ((avmn) obj3).dispose();
                }
                concurrentHashMap.clear();
                abiiVar.e.clear();
                acip acipVar = aazqVar.b;
                if (acipVar == null) {
                    abiiVar.g = null;
                    abiiVar.d = null;
                } else {
                    abiiVar.g = acipVar.bq();
                    abiiVar.d = acipVar.au();
                }
                return awmy.a;
            case 15:
                abii.a((abii) this.a, "Error in rootChangedObservable subscription", (Throwable) obj, null, 4);
                return awmy.a;
            case 16:
                acip acipVar2 = ((aazq) obj).b;
                if (acipVar2 != null) {
                    Object obj4 = this.a;
                    abii abiiVar2 = (abii) obj4;
                    if (abiiVar2.e.containsKey(acipVar2.au())) {
                        String strAu = acipVar2.au();
                        ConcurrentHashMap concurrentHashMap2 = abiiVar2.f;
                        if (!concurrentHashMap2.containsKey(strAu)) {
                            concurrentHashMap2.put(strAu, acipVar2.aq().al(new abid(new pge(obj4, strAu, 20, bArr), 8), new abid(new pge(obj4, strAu, i, bArr), 3)));
                        }
                    }
                }
                return awmy.a;
            case 17:
                abii.a((abii) this.a, "Error in activeChangedObservable subscription", (Throwable) obj, null, 4);
                return awmy.a;
            case 18:
                aazn aaznVar = (aazn) obj;
                aaznVar.getClass();
                String str2 = aaznVar.b;
                int i2 = aaznVar.a;
                Object obj5 = this.a;
                if (i2 != 2) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    return avlh.G(new abim(str2, false, ((abin) obj5).c.b()));
                }
                abin abinVar = (abin) obj5;
                if (abinVar.d) {
                    obj2 = abinVar.b.t;
                    obj2.getClass();
                } else {
                    obj2 = abinVar.b.i;
                    obj2.getClass();
                }
                avlh avlhVarH = ((avlh) obj2).x(new wsh(new yrc(str2, i), 7)).ay().H(new yrb(new yta(6), 16));
                if (str2 == null) {
                    str2 = "";
                }
                return avlhVarH.U(new abim(str2, true, abinVar.c.b()));
            case 19:
                aazk aazkVar = (aazk) obj;
                Object obj6 = this.a;
                Duration duration = abin.a;
                aazkVar.getClass();
                return Boolean.valueOf(awrc.c(aazkVar.i, obj6));
            default:
                tnw tnwVar = (tnw) obj;
                tnwVar.getClass();
                alyi alyiVar = (alyi) tnwVar.a;
                if (alyiVar != null) {
                    Object obj7 = this.a;
                    aqdr aqdrVarA = aqdr.a(alyiVar.h);
                    if (aqdrVarA == null) {
                        aqdrVarA = aqdr.STREAMING_WATCH_RESPONSE_TYPE_UNKNOWN;
                    }
                    zContains = ((abqh) obj7).a.contains(aqdrVarA);
                }
                return Boolean.valueOf(zContains);
        }
    }
}
