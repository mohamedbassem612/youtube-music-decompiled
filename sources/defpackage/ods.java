package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ods implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ods(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v78, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r7v80, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) throws Throwable {
        int iA;
        int i = 2;
        int i2 = 18;
        switch (this.$cid) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (zBooleanValue) {
                    return ((odx) obj2).b(0);
                }
                ((odx) obj2).e.j(1003);
                return ahng.n(odw.b);
            case 1:
                return ((aczl) ((odr) this.a).b.io()).u();
            case 2:
                obo oboVar = (obo) obj;
                int i3 = oboVar.f;
                int iBf = a.bf(i3);
                Object obj3 = this.a;
                if (iBf != 0 && iBf == 2) {
                    xsc xscVar = ((odx) obj3).f;
                    obp obpVar = oboVar.c;
                    if (obpVar == null) {
                        obpVar = obp.a;
                    }
                    ListenableFuture listenableFutureR = ahng.r(new ium(xscVar, obpVar, oboVar.d.G(), 8, (char[]) null), xscVar.a);
                    ((omj) xscVar.c).m(15305, listenableFutureR);
                    return listenableFutureR;
                }
                int iBf2 = a.bf(i3);
                if (iBf2 == 0 || iBf2 != 3) {
                    throw new AssertionError("Unreachable");
                }
                xsc xscVar2 = ((odx) obj3).f;
                obp obpVar2 = oboVar.c;
                if (obpVar2 == null) {
                    obpVar2 = obp.a;
                }
                ListenableFuture listenableFutureR2 = ahng.r(new hlm(xscVar2, obpVar2, oboVar.e.G(), oboVar.d.G(), 7, null), xscVar2.a);
                ((omj) xscVar2.c).m(15321, listenableFutureR2);
                return listenableFutureR2;
            case 3:
                Object obj4 = ((aczl) this.a).c;
                iug iugVar = new iug(obj4, 18);
                xsc xscVar3 = (xsc) obj4;
                ListenableFuture listenableFutureR3 = ahng.r(iugVar, xscVar3.a);
                ((omj) xscVar3.c).m(15314, listenableFutureR3);
                return listenableFutureR3;
            case 4:
                return ((xsc) ((aczl) this.a).g).aj();
            case 5:
                if (!((Boolean) obj).booleanValue()) {
                    ((ong) ((xgg) this.a).d).j(1036);
                }
                return aher.a;
            case 6:
                oip oipVar = (oip) obj;
                return ahng.n(oipVar == null ? agev.i(ahba.GROUP_NOT_FOUND) : xgg.c((oip) this.a, oipVar));
            case 7:
                if (((Boolean) obj).booleanValue()) {
                    return aher.a;
                }
                ((ong) ((xgg) this.a).d).j(1036);
                return ahng.m(new IOException("Failed to commit new group metadata to disk."));
            case 8:
                String str = ((oip) this.a).d;
                return aher.a;
            case 9:
                throw ((Throwable) this.a);
            case 10:
                agev agevVar = (agev) obj;
                if (!agevVar.g()) {
                    return aher.a;
                }
                Object obj5 = this.a;
                xgg xggVar = (xgg) obj5;
                return xggVar.s(xggVar.m.a((oip) agevVar.c()), new ods(obj5, 14));
            case 11:
                return ((xgg) this.a).r(aher.a, new iun((okz) obj, 17));
            case 12:
                return ((omn) ((xgg) this.a).c).d.f(agkz.n(((agkj) obj).values()));
            case 13:
                agkj agkjVar = (agkj) obj;
                agkj agkjVar2 = (agkj) ahng.v(this.a);
                HashMap map = new HashMap();
                agqr it = agkjVar2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (agkjVar.containsKey(entry.getValue())) {
                        oin oinVar = (oin) entry.getKey();
                        oiv oivVarA = oiv.a(((ojb) agkjVar.get(entry.getValue())).d);
                        if (oivVarA == null) {
                            oivVarA = oiv.NONE;
                        }
                        map.put(oinVar, oivVarA);
                    }
                }
                return ahng.n(agkj.h(map));
            case 14:
                if (!((Boolean) obj).booleanValue()) {
                    ((ong) ((xgg) this.a).d).j(1036);
                }
                return aher.a;
            case 15:
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((List) obj).iterator();
                while (true) {
                    Object obj6 = this.a;
                    if (!it2.hasNext()) {
                        return qnl.aJ(arrayList).N(new fxv(4), ((xgg) obj6).k);
                    }
                    oiw oiwVar = (oiw) it2.next();
                    if (!oiwVar.f) {
                        xgg xggVar2 = (xgg) obj6;
                        arrayList.add(xggVar2.s(xggVar2.m.g(oiwVar), new ods(obj6, 16)));
                    }
                }
                break;
            case 16:
                oip oipVar2 = (oip) obj;
                return (oipVar2 == null || (iA = nsw.a(oipVar2.r)) == 0 || iA == 1) ? ahng.n(Boolean.TRUE) : ((ook) ((agfr) ((agev) ((xgg) this.a).a).c()).io()).a();
            case 17:
                Object obj7 = this.a;
                olc olcVar = (olc) obj7;
                return ahno.as(olcVar.n(olcVar.a.b()), new olb(obj7, (onu) obj, i), olcVar.b);
            case 18:
                Object obj8 = this.a;
                olc olcVar2 = (olc) obj8;
                return ahno.as(olcVar2.n(olcVar2.a.k()), new okn(obj8, (onu) obj, 15), olcVar2.b);
            case 19:
                Object obj9 = this.a;
                olc olcVar3 = (olc) obj9;
                return ahno.as(olcVar3.n(olcVar3.a.e()), new okn(obj9, (onu) obj, i2), olcVar3.b);
            default:
                Object obj10 = this.a;
                ole oleVar = (ole) obj10;
                return ahno.as(oleVar.a.c(), new olb(obj10, (Boolean) obj, 12), oleVar.c);
        }
    }
}
