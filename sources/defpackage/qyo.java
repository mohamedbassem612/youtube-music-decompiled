package defpackage;

import androidx.car.app.model.Alert;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qyo {
    public final quc a;
    public quc b;
    public quc c;
    private final xsc d;

    public qyo(quc qucVar, final qyt qytVar) {
        this.a = qucVar;
        agjz agjzVar = new agjz(4);
        if (qytVar.l) {
            agjzVar.h(new rbz() { // from class: qyk
                @Override // defpackage.rbz
                public final rca a(final quc qucVar2) {
                    final qyt qytVar2 = qytVar;
                    return new rca() { // from class: qyn
                        @Override // defpackage.rca
                        public final void a() {
                            final boolean z = qytVar2.a.E;
                            quc qucVar3 = qucVar2;
                            agke agkeVar = (agke) Collection.EL.stream(qucVar3.c()).filter(new jor(15)).map(new qzp(15)).collect(aghu.a);
                            Iterable$EL.forEach(agkeVar, new kjk(qucVar3, 18));
                            agkz agkzVar = (agkz) Collection.EL.stream(qucVar3.d()).flatMap(new qzp(13)).filter(new jor(14)).map(new qzp(14)).collect(aghu.b);
                            final nrc nrcVar = new nrc();
                            BiFunction biFunction = new BiFunction() { // from class: rce
                                public final /* synthetic */ BiFunction andThen(Function function) {
                                    return BiFunction$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.BiFunction
                                public final Object apply(Object obj, Object obj2) {
                                    agke agkeVar2 = (agke) obj;
                                    Integer num = (Integer) obj2;
                                    if (agkeVar2.size() <= 1 && !z && (agkeVar2.size() != 1 || !(aguu.M(agkeVar2) instanceof qwl))) {
                                        return (qvs) aguu.M(agkeVar2);
                                    }
                                    Stream map = Collection.EL.stream(agkeVar2).map(new iuk(nrcVar, 18));
                                    Collector collector = aghu.a;
                                    agke agkeVar3 = (agke) map.collect(collector);
                                    int iIntValue = num.intValue();
                                    int i = rcl.l;
                                    agke agkeVarB = agke.B(Comparator$CC.comparing(new rcf(9)), agkeVar3);
                                    rcl rclVar = new rcl(nra.t((List) Collection.EL.stream(agkeVarB).map(new rcf(9)).collect(collector)), agke.B(Comparator$CC.comparing(new rcf(10)), agkeVar3), agkeVarB);
                                    Duration duration = (Duration) Collection.EL.stream(agkeVar3).map(new rcf(11)).min(Comparator$CC.naturalOrder()).orElse(Duration.ZERO);
                                    Duration duration2 = (Duration) Collection.EL.stream(agkeVar3).map(new rcf(12)).max(Comparator$CC.naturalOrder()).orElse(Duration.ZERO);
                                    rclVar.u(duration);
                                    rclVar.t(duration2.minus(duration));
                                    rclVar.b = iIntValue;
                                    return rclVar;
                                }
                            };
                            final iuk iukVar = new iuk(agkzVar, 17);
                            rbm rbmVar = rcd.a;
                            final LinkedHashSet<qvs> linkedHashSet = new LinkedHashSet();
                            final ArrayList arrayList = new ArrayList();
                            Collection.EL.stream(agkeVar).sorted(Comparator$EL.thenComparing(Comparator$CC.comparing(new qzp(9)), new qzp(10))).forEach(new Consumer() { // from class: rcc
                                @Override // java.util.function.Consumer
                                /* JADX INFO: renamed from: accept */
                                public final void r(Object obj) {
                                    qup qupVarF;
                                    qvs qvsVar = (qvs) obj;
                                    rbm rbmVar2 = rcd.a;
                                    try {
                                        qupVarF = nrcVar.f(qvsVar);
                                    } catch (IllegalArgumentException unused) {
                                        qupVarF = null;
                                    }
                                    if (qupVarF == null || !((Boolean) iukVar.apply(qupVarF)).booleanValue()) {
                                        arrayList.add(qvsVar);
                                    } else {
                                        linkedHashSet.add(qvsVar);
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            HashMap map = new HashMap();
                            Iterator it = linkedHashSet.iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                int iMax = Integer.MIN_VALUE;
                                int iMin = Alert.DURATION_SHOW_INDEFINITELY;
                                if (!zHasNext) {
                                    break;
                                }
                                qvs qvsVar = (qvs) it.next();
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    qvs qvsVar2 = (qvs) arrayList.get(i);
                                    Duration duration = qvsVar2.p;
                                    duration.getClass();
                                    if (aext.k(qvsVar.p(), duration)) {
                                        break;
                                    }
                                    Duration durationP = qvsVar.p();
                                    durationP.getClass();
                                    if (aext.i(qvsVar2.p, durationP)) {
                                        Duration durationP2 = qvsVar2.p();
                                        durationP2.getClass();
                                        if (aext.i(qvsVar.p, durationP2)) {
                                            int i2 = qvsVar.b;
                                            int i3 = qvsVar2.b;
                                            if (i2 <= i3) {
                                                if (i2 >= i3) {
                                                    rbc rbcVar = new rbc(rcd.a, rbd.e);
                                                    rbcVar.c();
                                                    rbcVar.a("Invalid graphical segments: Two segments overlap in time and have the same z-index.", new Object[0]);
                                                    iMax = qvsVar.b;
                                                    iMin = iMax;
                                                    break;
                                                }
                                                iMin = Math.min(iMin, i3 - 1);
                                            } else {
                                                iMax = Math.max(iMax, i3 + 1);
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                map.put(qvsVar, agpf.b(Integer.valueOf(iMax), Integer.valueOf(iMin)));
                            }
                            agjz agjzVar2 = new agjz(4);
                            while (!linkedHashSet.isEmpty()) {
                                agpf agpfVarB = agpf.b(Integer.MIN_VALUE, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
                                Comparable comparableE = Duration.ZERO;
                                agjz agjzVar3 = new agjz(4);
                                for (qvs qvsVar3 : linkedHashSet) {
                                    comparableE.getClass();
                                    if (aext.l(qvsVar3.p, comparableE) && !((Duration) comparableE).isZero()) {
                                        break;
                                    }
                                    agpf agpfVar = (agpf) map.get(qvsVar3);
                                    if (agpfVarB.h(agpfVar)) {
                                        agjzVar3.h(qvsVar3);
                                        agpfVarB = agpfVarB.c(agpfVar);
                                        comparableE = afyd.e(comparableE, qvsVar3.p());
                                    }
                                }
                                agke agkeVarG = agjzVar3.g();
                                Collection.EL.stream(agkeVarG).forEach(new kjk(linkedHashSet, 15));
                                agjzVar2.h((qvs) biFunction.apply(agkeVarG, (Integer) agpfVarB.e()));
                            }
                            Collection.EL.stream(arrayList).forEach(new kjk(agjzVar2, 16));
                            Iterable$EL.forEach(agjzVar2.g(), new kjk(qucVar3, 19));
                        }
                    };
                }
            });
        }
        final hgi hgiVar = new hgi(10);
        agjzVar.h(new rbz() { // from class: qym
            @Override // defpackage.rbz
            public final rca a(final quc qucVar2) {
                final Consumer consumer = hgiVar;
                return new rca() { // from class: qyl
                    @Override // defpackage.rca
                    public final void a() {
                        consumer.r(qucVar2);
                    }
                };
            }
        });
        this.d = new xsc(agjzVar.g(), qucVar);
        b(a());
    }

    public final tld a() {
        tld tldVar;
        quc qucVar = this.a;
        rbm rbmVar = qyp.a;
        rbmVar.a(rbk.b(qucVar, null));
        agkz agkzVar = (agkz) Collection.EL.stream(qucVar.b()).map(new qdi(18)).collect(aghu.b);
        agqr it = qucVar.b().iterator();
        while (it.hasNext()) {
            qup qupVar = (qup) it.next();
            if (qupVar.it() && qupVar.d.isZero()) {
                rbc rbcVar = new rbc(rbmVar, rbd.c);
                rbcVar.c();
                rbcVar.a("MediaComposition Segment found of zero duration", new Object[0]);
            }
        }
        agqr it2 = qucVar.d().iterator();
        while (it2.hasNext()) {
            qxj qxjVar = (qxj) it2.next();
            if (qxjVar.d && qxjVar.e == null && qxjVar.f == null) {
                rbc rbcVar2 = new rbc(rbmVar, rbd.c);
                rbcVar2.c();
                rbcVar2.a("MediaComposition transition found with no incoming or outgoing segments", new Object[0]);
            }
            qvu qvuVar = qxjVar.e;
            if (qvuVar != null && !agkzVar.contains(qvuVar.m)) {
                rbc rbcVar3 = new rbc(rbmVar, rbd.c);
                rbcVar3.c();
                rbcVar3.a("MediaComposition transition found with incoming segment not found in the composition", new Object[0]);
            }
            qvu qvuVar2 = qxjVar.f;
            if (qvuVar2 != null && !agkzVar.contains(qvuVar2.m)) {
                rbc rbcVar4 = new rbc(rbmVar, rbd.c);
                rbcVar4.c();
                rbcVar4.a("MediaComposition transition found with outgoing segment not found in the composition", new Object[0]);
            }
        }
        xsc xscVar = this.d;
        synchronized (xscVar.b) {
            quc qucVar2 = new quc((quc) xscVar.c);
            quc qucVar3 = new quc(qucVar2);
            agqs agqsVarListIterator = ((agke) xscVar.a).listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                ((rbz) agqsVarListIterator.next()).a(qucVar3).a();
            }
            tldVar = new tld(qucVar2, qucVar3);
        }
        return tldVar;
    }

    public final void b(tld tldVar) {
        this.b = (quc) tldVar.a;
        this.c = (quc) tldVar.b;
    }
}
