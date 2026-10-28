package defpackage;

import android.accounts.Account;
import android.graphics.Rect;
import android.util.Pair;
import j$.util.DesugarCollections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vvb implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vvb(int i) {
        this.$cid = i;
        this.a = "";
    }

    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v24, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v27, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v31, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v32, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38, types: [awqg, java.lang.Object] */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        boolean z;
        int i = 3;
        int i2 = 2;
        int i3 = 4;
        boolean z2 = true;
        switch (this.$cid) {
            case 0:
                Rect rect = (Rect) obj;
                return Integer.valueOf(vpo.d(((vvd) this.a).a) ? -rect.width() : rect.width());
            case 1:
                return Pair.create(this.a, (Boolean) obj);
            case 2:
                akww akwwVar = ((alik) obj).v;
                if (akwwVar == null) {
                    akwwVar = akww.a;
                }
                Object obj2 = this.a;
                akwwVar.getClass();
                akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVar.c).get(45683858L);
                if (akwxVar != null) {
                    String str = akwxVar.b == 3 ? (String) akwxVar.c : "";
                    if (str != null) {
                        return str;
                    }
                }
                return obj2;
            case 3:
                Object obj3 = this.a;
                zwa zwaVarE = ((xkw) obj3).a.e();
                boolean z3 = zwaVarE instanceof rlt;
                if (z3) {
                    rlt rltVar = (rlt) zwaVarE;
                    if ((rltVar.h || rltVar.i) && !rltVar.j) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z3) {
                    rlt rltVar2 = (rlt) zwaVarE;
                    if (!zwaVarE.h()) {
                        try {
                            rre rreVar = ((xkw) obj3).d;
                            Account accountB = rreVar.b(rltVar2.b);
                            taq.c();
                            omj omjVar = rreVar.g;
                            if (omjVar.C(accountB, new String[]{ahwx.a.a}).intValue() == 1) {
                                taq.c();
                                z2 = omjVar.C(accountB, new String[]{ahwy.a.a}).intValue() != 1;
                            }
                        } catch (Exception unused) {
                            agrx agrxVar = agso.a;
                        }
                    }
                }
                return new xkv(z, z2);
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                agkh agkhVar = new agkh(4);
                boolean z4 = !zBooleanValue;
                xkw xkwVar = (xkw) this.a;
                agke agkeVarS = agke.s(xkwVar.e(z4), xkwVar.f(z4), xkwVar.d(z4));
                int i4 = ((agpi) agkeVarS).d;
                for (int i5 = 0; i5 < i4; i5++) {
                    xpe xpeVar = (xpe) agkeVarS.get(i5);
                    agkhVar.e(xpeVar.b, xpeVar);
                }
                return agkhVar.d(true);
            case 5:
                return this.a;
            case 6:
                return (axso) this.a.apply((acip) obj);
            case 7:
                aazq aazqVar = (aazq) obj;
                return ((avlh) this.a.apply(aazqVar.b)).H(new abqe(aazqVar, 5));
            case 8:
                return (axso) this.a.apply(((aazq) obj).b);
            case 9:
                obj.getClass();
                return this.a.invoke(obj);
            case 10:
                ?? r6 = this.a;
                String str2 = abwx.a;
                return a.z(r6, obj);
            case 11:
                obj.getClass();
                return this.a.invoke(obj);
            case 12:
                obj.getClass();
                return this.a.invoke(obj);
            case 13:
                aaww aawwVar = (aaww) obj;
                akef akefVar = aawwVar.b;
                wjf wjfVar = aawwVar.a;
                if ((akefVar.b & 2) != 0) {
                    z2 = akefVar.d;
                } else {
                    int i6 = ((abnc) ((abxv) this.a).b).s;
                    wiu wiuVarF = wjfVar.f();
                    if (wiuVarF == null || (!wiuVarF.aO() && (!wiuVarF.aQ() || i6 != 1))) {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            case 14:
                obj.getClass();
                return this.a.invoke(obj);
            case 15:
                abfv abfvVar = (abfv) this.a;
                for (adwp adwpVar : abfvVar.b) {
                    adwpVar.b();
                    if (adwpVar.b().a(obj)) {
                        return adwpVar;
                    }
                }
                return abfvVar.a;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    awdh awdhVar = new awdh(Boolean.FALSE);
                    avnn avnnVar = atqp.l;
                    return awdhVar;
                }
                Object obj4 = this.a;
                avlr avlrVarF = avlr.F(new aegt(obj4, i3));
                aeog aeogVar = (aeog) obj4;
                avmb avmbVar = aeogVar.o;
                return avlr.N(avlrVarF.W(avmbVar), aeogVar.r.O(avmbVar).K(new acpr(obj4, 13)), ((avlr) ((omj) aeogVar.q.io()).a).H().B(new adhb(i2)).K(new adhc(i))).r();
        }
    }

    public /* synthetic */ vvb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
