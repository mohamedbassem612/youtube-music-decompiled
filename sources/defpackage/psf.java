package defpackage;

import android.os.Bundle;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class psf extends awpk implements awqk {
    Object a;
    Object b;
    int c;
    final /* synthetic */ psm d;
    final /* synthetic */ Bundle e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psf(psm psmVar, Bundle bundle, awoq awoqVar) {
        super(2, awoqVar);
        this.d = psmVar;
        this.e = bundle;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new psf(this.d, this.e, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((psf) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x010a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0128  */
    /* JADX WARN: Code duplicated, block: B:48:0x0154  */
    /* JADX WARN: Code duplicated, block: B:50:0x0158  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        List arrayList;
        psf psfVar;
        ?? r0;
        Map map;
        pky pkyVar;
        Map map2;
        ArrayList arrayList2;
        Collection collectionValues;
        awox awoxVar = awox.a;
        int i = this.c;
        int i2 = 2;
        int i3 = 1;
        if (i != 0) {
            if (i != 1) {
                Object obj2 = this.b;
                map = (Map) this.a;
                atqp.j(obj);
                psfVar = this;
                r0 = obj2;
            } else {
                arrayList = (List) this.a;
                atqp.j(obj);
            }
            pkyVar = (pky) obj;
            psfVar.d.a.b(qnl.ay(pkyVar, new rla(map, i3)), atqq.aw(r0.values()));
            if (pkyVar.i()) {
                return pkyVar instanceof pku ? pkyVar : qnl.ay(pkyVar, new prq(i2));
            }
            map2 = (Map) pkyVar.d();
            arrayList2 = null;
            if (map2 != null && (collectionValues = map2.values()) != null) {
                arrayList2 = new ArrayList();
                for (Object obj3 : collectionValues) {
                    if (((pky) obj3).j()) {
                        arrayList2.add(obj3);
                    }
                }
            }
            if (arrayList2 != null || arrayList2.isEmpty()) {
                return new pla(awmy.a);
            }
            Object objX = atqq.X(arrayList2);
            objX.getClass();
            return (pku) objX;
        }
        atqp.j(obj);
        int i4 = psm.b;
        List<pyl> listAD = ahng.aD(this.e, "GNP_ACCOUNTS_TO_REGISTER", pyl.a, ExtensionRegistryLite.getGeneratedRegistry());
        arrayList = new ArrayList(atqq.N(listAD, 10));
        for (pyl pylVar : listAD) {
            pylVar.getClass();
            arrayList.add(nqx.b(pylVar));
        }
        psm psmVar = this.d;
        this.a = arrayList;
        this.c = 1;
        obj = psmVar.j(this);
        if (obj == awoxVar) {
            return awoxVar;
        }
        List list = arrayList;
        pky pkyVar2 = (pky) obj;
        int iAu = a.au(pkyVar2);
        if (iAu != 0) {
            if (iAu == 1) {
                return (pku) pkyVar2;
            }
            throw new awmj();
        }
        Map map3 = (Map) ((pla) pkyVar2).a;
        Bundle bundle = this.e;
        aier aierVar = aier.values()[bundle.getInt("GNP_REGISTRATION_REASON")];
        plv plvVar = plv.values()[bundle.getInt("GNP_FCM_TARGET_TYPE")];
        pqo pqoVar = pqo.values()[bundle.getInt("GNP_ACCOUNT_TYPE_GROUP")];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map3.entrySet()) {
            if (list.contains((pxk) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        psm psmVar2 = this.d;
        this.a = map3;
        this.b = linkedHashMap;
        this.c = 2;
        psfVar = this;
        Object objM = psmVar2.m(list, map3, aierVar, plvVar, pqoVar, psfVar);
        if (objM == awoxVar) {
            return awoxVar;
        }
        r0 = linkedHashMap;
        map = map3;
        obj = objM;
        pkyVar = (pky) obj;
        psfVar.d.a.b(qnl.ay(pkyVar, new rla(map, i3)), atqq.aw(r0.values()));
        if (pkyVar.i()) {
            if (pkyVar instanceof pku) {
            }
        }
        map2 = (Map) pkyVar.d();
        arrayList2 = null;
        if (map2 != null) {
            arrayList2 = new ArrayList();
            while (r11.hasNext()) {
                if (((pky) obj3).j()) {
                    arrayList2.add(obj3);
                }
            }
        }
        if (arrayList2 != null) {
        }
        return new pla(awmy.a);
    }
}
