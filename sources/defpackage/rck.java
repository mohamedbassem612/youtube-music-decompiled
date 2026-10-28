package defpackage;

import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class rck extends qup {
    private final aglh f;
    private static final rbm g = new rbm(rck.class.getName());
    private static final Duration e = Duration.ofMillis(2);

    public rck(agke agkeVar) {
        quz quzVar = new quz((quz) ((qup) agkeVar.get(0)).b);
        Stream map = Collection.EL.stream(agkeVar).map(new rcf(8));
        Collector collector = aghu.a;
        super(quzVar, nra.t((List) map.collect(collector)));
        Stream stream = Collection.EL.stream(agkeVar);
        Comparator comparatorNaturalOrder = Comparator$CC.naturalOrder();
        rcf rcfVar = new rcf(7);
        Function functionIdentity = Function$CC.identity();
        Comparator comparator = aglh.b;
        this.f = (aglh) stream.collect(aghu.c(comparatorNaturalOrder, rcfVar, functionIdentity));
        qup qupVar = (qup) agkeVar.get(0);
        qup qupVar2 = (qup) aguu.K(agkeVar);
        Duration durationPlus = qupVar2.c.plus(qupVar2.d);
        g(qupVar.c);
        f(durationPlus.minus(((qup) agkeVar.get(0)).c));
        quz quzVar2 = (quz) this.b;
        quz quzVar3 = (quz) qupVar.b;
        quzVar2.g = qupVar.it();
        quzVar2.k = quzVar3.k;
        quzVar2.p(quzVar3.l);
        quzVar2.m = quzVar3.m;
        quzVar2.n = quzVar3.n;
        quzVar2.o = quzVar3.o;
        if (afyd.g(agkeVar, Comparator$CC.comparing(new rcf(7)))) {
            return;
        }
        new rbc(g, rbd.e).a("Segments should be passed in order, received: %s", Collection.EL.stream(agkeVar).map(new rcf(7)).collect(collector));
    }

    public qup i(Duration duration) {
        if (duration.compareTo(this.c) < 0 && duration.plus(e).compareTo(this.c) >= 0) {
            duration = this.c;
        }
        aglh aglhVar = this.f;
        Map.Entry entryFloorEntry = aglhVar.floorEntry(duration);
        qup qupVar = entryFloorEntry == null ? null : (qup) entryFloorEntry.getValue();
        if (qupVar != null && qupVar.c.plus(qupVar.d).compareTo(duration) > 0) {
            return qupVar;
        }
        rbc rbcVar = new rbc(g, rbd.d);
        rbcVar.c();
        agps agpsVar = aglhVar.c;
        rbcVar.a("Could not find a corresponding video segment for t=%s, segments=%s", duration, agpsVar);
        throw new IllegalArgumentException(a.bX(agpsVar, duration, "Could not find a corresponding video segment for t=", ", segments="));
    }

    public agke j() {
        return agke.n(this.f.d);
    }

    public agke k() {
        return agke.q(this);
    }

    protected rck(rck rckVar) {
        super(rckVar);
        this.f = (aglh) Collection.EL.stream(rckVar.f.d).map(new rcf(6)).collect(aghu.c(Comparator$CC.naturalOrder(), new rcf(7), Function$CC.identity()));
    }
}
