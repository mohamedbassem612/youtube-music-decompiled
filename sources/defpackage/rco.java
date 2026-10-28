package defpackage;

import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rco extends qup {
    public static final rbm g = new rbm("rco");
    public final agke e;
    public final agke f;

    private rco(rco rcoVar) {
        super(rcoVar);
        Stream map = Collection.EL.stream(rcoVar.e).map(new rcf(14));
        Collector collector = aghu.a;
        this.e = (agke) map.collect(collector);
        this.f = (agke) Collection.EL.stream(rcoVar.f).map(new rcf(14)).collect(collector);
    }

    public static rco i(agke agkeVar, int i) {
        agke agkeVarB = agke.B(Comparator$CC.comparing(new rcf(15)), agkeVar);
        rco rcoVar = new rco(nra.t((List) Collection.EL.stream(agkeVarB).map(new rcf(15)).collect(aghu.a)), agke.B(Comparator$CC.comparing(new rcf(16)), agkeVar), agkeVarB);
        Duration duration = (Duration) Collection.EL.stream(agkeVar).map(new rcf(17)).min(Comparator$CC.naturalOrder()).orElse(Duration.ZERO);
        Duration duration2 = (Duration) Collection.EL.stream(agkeVar).map(new rcf(18)).max(Comparator$CC.naturalOrder()).orElse(Duration.ZERO);
        rcoVar.g(duration);
        rcoVar.f(duration2.minus(duration));
        ((quu) ((rcm) rcoVar.b)).a = i;
        return rcoVar;
    }

    public static agke j(agke agkeVar, Duration duration) {
        return (agke) Collection.EL.stream(agkeVar).filter(new jmy(duration, 10)).collect(aghu.a);
    }

    @Override // defpackage.qup
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qup clone() {
        return new rco(this);
    }

    @Override // defpackage.qup
    public final /* synthetic */ Object clone() {
        return new rco(this);
    }

    private rco(UUID uuid, agke agkeVar, agke agkeVar2) {
        super(new rcm(), uuid);
        this.e = agkeVar;
        this.f = agkeVar2;
    }
}
