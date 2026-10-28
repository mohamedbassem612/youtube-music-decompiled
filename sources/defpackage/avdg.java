package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avdg extends avav {
    public final avav a;
    private final avaw b;

    public avdg(avaw avawVar, String str) {
        avawVar.getClass();
        this.b = avawVar;
        str.getClass();
        avav avavVarA = avawVar.a(str);
        if (avavVarA == null) {
            Status statusWithDescription = Status.l.withDescription(a.bT(str, "Could not find policy '", "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            avavVarA = new avfe(auzd.c, new avak(avan.b(statusWithDescription)), statusWithDescription);
        }
        this.a = avavVarA;
    }

    @Override // defpackage.avaj
    public final /* synthetic */ avat a(aval avalVar) {
        return new avdf(this, avalVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    @Override // defpackage.avav
    public final avbp b(Map map) {
        List<avjr> listUnmodifiableList;
        String strK;
        if (map != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (map.containsKey("loadBalancingConfig")) {
                    arrayList.addAll(avjt.m(map, "loadBalancingConfig"));
                }
                if (arrayList.isEmpty() && (strK = avjt.k(map, "loadBalancingPolicy")) != null) {
                    arrayList.add(Collections.singletonMap(strK.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
                }
                List<Map> listUnmodifiableList2 = DesugarCollections.unmodifiableList(arrayList);
                if (listUnmodifiableList2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map map2 : listUnmodifiableList2) {
                        if (map2.size() != 1) {
                            throw new RuntimeException("There are " + map2.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + String.valueOf(map2));
                        }
                        String str = (String) ((Map.Entry) map2.entrySet().iterator().next()).getKey();
                        arrayList2.add(new avjr(str, avjt.o(map2, str)));
                    }
                    listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
                } else {
                    listUnmodifiableList = null;
                }
            } catch (RuntimeException e) {
                return new avbp(Status.c.withDescription("can't parse load balancer configuration").c(e));
            }
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null || listUnmodifiableList.isEmpty()) {
            return null;
        }
        avaw avawVar = this.b;
        ArrayList arrayList3 = new ArrayList();
        for (avjr avjrVar : listUnmodifiableList) {
            String str2 = avjrVar.a;
            avav avavVarA = avawVar.a(str2);
            if (avavVarA != null) {
                if (!arrayList3.isEmpty()) {
                    Logger.getLogger(avjt.class.getName()).logp(Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList3);
                }
                avbp avbpVarB = avavVarA.b(avjrVar.b);
                return avbpVarB.a == null ? new avbp(new avjs(avavVarA, avbpVarB.b)) : avbpVarB;
            }
            arrayList3.add(str2);
        }
        return new avbp(Status.c.withDescription(a.cs(arrayList3, "None of ", " specified by Service Config are available.")));
    }

    @Override // defpackage.avav
    public final String c() {
        return "auto_configured_internal";
    }

    @Override // defpackage.avav
    public final void d() {
    }

    @Override // defpackage.avav
    public final void e() {
    }
}
