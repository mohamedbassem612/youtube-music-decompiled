package defpackage;

import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class rcj extends qwm {
    private static final rbm v = new rbm(rcj.class.getName());
    private final aglh u;

    static {
        Duration.ofMillis(2L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rcj(agke agkeVar) {
        qxe qxeVar = ((qwm) agkeVar.get(0)).k;
        Stream map = Collection.EL.stream(agkeVar).map(new rcf(5));
        Collector collector = aghu.a;
        super(qxeVar, nra.t((List) map.collect(collector)));
        Stream stream = Collection.EL.stream(agkeVar);
        Comparator comparatorNaturalOrder = Comparator$CC.naturalOrder();
        rcf rcfVar = new rcf(4);
        Function functionIdentity = Function$CC.identity();
        Comparator comparator = aglh.b;
        this.u = (aglh) stream.collect(aghu.c(comparatorNaturalOrder, rcfVar, functionIdentity));
        qwm qwmVar = (qwm) agkeVar.get(0);
        qwm qwmVar2 = (qwm) aguu.K(agkeVar);
        Duration durationPlus = qwmVar2.p.plus(qwmVar2.iu());
        this.o = qwmVar.o;
        u(qwmVar.p);
        t(durationPlus.minus(((qwm) agkeVar.get(0)).p));
        this.k = qwmVar.k;
        v(qwmVar.l);
        this.r = qwmVar.r;
        this.s = qwmVar.s;
        this.t = qwmVar.t;
        if (afyd.g(agkeVar, Comparator$CC.comparing(new rcf(4)))) {
            return;
        }
        new rbc(v, rbd.e).a("Segments should be passed in order, received: %s", Collection.EL.stream(agkeVar).map(new rcf(4)).collect(collector));
    }

    public agke w() {
        return agke.n(this.u.d);
    }

    protected rcj(rcj rcjVar) {
        super(rcjVar);
        this.u = (aglh) Collection.EL.stream(rcjVar.u.d).map(new rcf(3)).collect(aghu.c(Comparator$CC.naturalOrder(), new rcf(4), Function$CC.identity()));
    }
}
