package defpackage;

import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aago implements yvi {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/drm/EntitiesBasedOfflineDrmStore");
    private final wcn b;
    private final aauk c;
    private final abxv d;

    public aago(wcn wcnVar, abxv abxvVar, aauk aaukVar) {
        this.b = wcnVar;
        this.d = abxvVar;
        this.c = aaukVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009b A[Catch: RuntimeException -> 0x00c6, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00c6, blocks: (B:13:0x007b, B:14:0x0083, B:16:0x0089, B:21:0x009b), top: B:27:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yvi
    public final yvh a(String str) {
        try {
            wcn wcnVar = this.b;
            aknu aknuVar = (aknu) wcnVar.g(wfs.g(146, str)).g(aknu.class).E();
            if (aknuVar == null && this.c.c().y) {
                abxv abxvVar = this.d;
                ArrayList arrayList = new ArrayList();
                tzk.ah(aagt.b, 7, "%" + str + '%', abxvVar, arrayList);
                List list = (List) wcnVar.s(tzk.ai(abxvVar, arrayList)).E();
                if (list.isEmpty()) {
                    return null;
                }
                aknuVar = (aknu) wcnVar.g((String) list.get(0)).g(aknu.class).E();
            }
            if (aknuVar == null || aknuVar.getLicenses().isEmpty()) {
                return null;
            }
            try {
                for (aknx aknxVar : aknuVar.getLicenses()) {
                    if (aknxVar.f.equals(str)) {
                        if (aknxVar != null) {
                            return new yvh(str, aknxVar.h.G(), (agke) Collection.EL.stream(aknxVar.g).map(new aaeq(2)).collect(aghu.a), aknxVar.e, aknxVar.i);
                        }
                        return null;
                    }
                }
                aknxVar = null;
                if (aknxVar != null) {
                    return new yvh(str, aknxVar.h.G(), (agke) Collection.EL.stream(aknxVar.g).map(new aaeq(2)).collect(aghu.a), aknxVar.e, aknxVar.i);
                }
                return null;
            } catch (RuntimeException e) {
                zvp.b(zvn.b, zvm.C, "Couldn't retrieve OfflineDrmData", e);
                return null;
            }
        } catch (RuntimeException unused) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/drm/EntitiesBasedOfflineDrmStore", "getVideoDrmData", 85, "EntitiesBasedOfflineDrmStore.java")).t("Stale drm store");
            return null;
        }
    }
}
