package defpackage;

import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.stream.IntStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rct extends rck {
    public static final /* synthetic */ int f = 0;
    private static final rbm g = new rbm("rcq");
    public final agke e;

    public rct(agke agkeVar, agke agkeVar2) {
        super(agkeVar2);
        this.e = agkeVar;
        int i = 1;
        int i2 = 0;
        if (!afyd.g(agkeVar, Comparator$CC.comparing(new rcs(i)))) {
            rbc rbcVar = new rbc(g, rbd.e);
            rbcVar.c();
            rbcVar.a("Segments should be passed in order, received: %s", Collection.EL.stream(agkeVar).map(new rcs(i)).collect(aghu.a));
        }
        ((quz) this.b).f.clear();
        IntStream.CC.range(0, ((qup) agkeVar.get(0)).is().size()).mapToObj(new rcr(agkeVar, i2)).forEach(new rcp(this, 2));
    }

    @Override // defpackage.qup
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qup clone() {
        return new rct(this);
    }

    @Override // defpackage.qup
    public final /* synthetic */ Object clone() {
        return new rct(this);
    }

    @Override // defpackage.rck
    public final qup i(Duration duration) {
        qup qupVarI = super.i(duration);
        return qupVarI instanceof rck ? ((rck) qupVarI).i(duration) : qupVarI;
    }

    @Override // defpackage.rck
    public final agke j() {
        return this.e;
    }

    @Override // defpackage.rck
    public final agke k() {
        return super.j();
    }

    private rct(rct rctVar) {
        super(rctVar);
        this.e = (agke) Collection.EL.stream(rctVar.e).map(new rcs(0)).collect(aghu.a);
    }
}
