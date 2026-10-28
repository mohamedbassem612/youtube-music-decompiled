package defpackage;

import j$.time.Duration;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rjo {
    public static final /* synthetic */ int a = 0;
    private static final Duration b = ahbt.b(1);

    public static quc a(quc qucVar) {
        quc qucVar2 = new quc(qucVar);
        int i = 6;
        Collection<List> collectionValues = ((Map) j$.util.Collection.EL.stream(qucVar2.c()).filter(new rej(i)).map(new ris(5)).sorted(new rit(2)).collect(Collectors.groupingBy(new ris(i)))).values();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        agqr it = qucVar2.d().iterator();
        while (it.hasNext()) {
            qxj qxjVar = (qxj) it.next();
            if (qxjVar instanceof qxh) {
                qvu qvuVar = qxjVar.e;
                if (qvuVar != null) {
                    map2.put(qvuVar.m, qxjVar);
                }
                qvu qvuVar2 = qxjVar.f;
                if (qvuVar2 != null) {
                    map.put(qvuVar2.m, qxjVar);
                }
            }
        }
        for (List list : collectionValues) {
            qvq qvqVar = (qvq) list.get(0);
            for (int i2 = 1; i2 < list.size(); i2++) {
                qvq qvqVar2 = (qvq) list.get(i2);
                UUID uuid = qvqVar2.m;
                boolean z = map.containsKey(uuid) || map2.containsKey(qvqVar.m);
                Duration durationMinus = qvqVar2.p.minus(qvqVar.p.plus(qvqVar.q));
                if (durationMinus.isNegative() || durationMinus.compareTo(b) > 0 || z) {
                    qvqVar = qvqVar2;
                } else {
                    Duration durationPlus = qvqVar2.p.plus(qvqVar2.q);
                    qucVar2.h(qvqVar);
                    qvqVar.t(durationPlus.minus(qvqVar.p));
                    qucVar2.g(qvqVar);
                    qucVar2.h(qvqVar2);
                    qxj qxjVar2 = (qxj) map2.get(uuid);
                    if (qxjVar2 != null) {
                        map2.put(qvqVar.m, qxjVar2);
                        qxjVar2.e = qvqVar;
                    }
                }
            }
        }
        return qucVar2;
    }
}
