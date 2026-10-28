package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ahle implements ahhx {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahhx
    public final Object a(ahfy ahfyVar, ahhp ahhpVar) throws GeneralSecurityException {
        ahnf ahnfVarA;
        HashMap map = new HashMap();
        for (int i = 0; i < ahfyVar.a(); i++) {
            ahfx ahfxVarC = ahfyVar.c(i);
            if (ahfxVarC.b.equals(ahfw.a)) {
                ahge ahgeVar = (ahge) ahhpVar.a(ahfxVarC);
                ahfv ahfvVar = ahfxVarC.a;
                if (ahfvVar instanceof ahlo) {
                    ahnfVarA = ((ahlo) ahfvVar).c();
                } else {
                    if (!(ahfvVar instanceof ahhc)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + ahfvVar.getClass().getName() + " with parameters " + ahfvVar.b().toString());
                    }
                    ahgb ahgbVar = ((ahhc) ahfvVar).a;
                    Object obj = ahgbVar.d;
                    if (obj.equals(ahga.d)) {
                        ahnfVarA = ahnf.b(new byte[0]);
                    } else if (obj.equals(ahga.b)) {
                        ahnfVarA = ahhk.b(((Integer) ahgbVar.e).intValue());
                    } else {
                        if (!obj.equals(ahga.c) && !obj.equals(ahga.e)) {
                            throw new GeneralSecurityException("Unknown output prefix type");
                        }
                        ahnfVarA = ahhk.a(((Integer) ahgbVar.e).intValue());
                    }
                }
                aami aamiVar = new aami(ahgeVar, ahfxVarC.c, null);
                ahnfVarA.getClass();
                if (ahnfVarA.a() != 0 && ahnfVarA.a() != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                ((List) Map.EL.computeIfAbsent(map, ahnfVarA, new aegf(14))).add(aamiVar);
            }
        }
        if (((ahhe) ahfyVar.b(ahhe.class)) != null) {
            throw null;
        }
        List list = (List) map.get(ahhl.a);
        List listUnmodifiableList = list != null ? DesugarCollections.unmodifiableList(new ArrayList(list)) : Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (((ahnf) entry.getKey()).a() == 5) {
                long jA = ahhl.a(((ahnf) entry.getKey()).c());
                ArrayList arrayList2 = new ArrayList(((List) entry.getValue()).size() + listUnmodifiableList.size());
                arrayList2.addAll((Collection) entry.getValue());
                arrayList2.addAll(listUnmodifiableList);
                arrayList.add(new axmq(jA, DesugarCollections.unmodifiableList(arrayList2), null));
            }
        }
        j$.util.List.EL.sort(arrayList, new rit(18));
        long[] jArr = new long[arrayList.size()];
        List[] listArr = new List[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jArr[i2] = ((axmq) arrayList.get(i2)).a;
            listArr[i2] = ((axmq) arrayList.get(i2)).b;
        }
        return new ahms(new ahhl(jArr, listArr, listUnmodifiableList));
    }
}
