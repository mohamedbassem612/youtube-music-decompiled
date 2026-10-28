package defpackage;

import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.stream.IntStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rcq extends rcj {
    public static final /* synthetic */ int v = 0;
    private static final rbm w = new rbm("rcq");
    public final agke u;

    public rcq(agke agkeVar, agke agkeVar2) {
        super(agkeVar2);
        this.u = agkeVar;
        int i = 1;
        int i2 = 0;
        if (!afyd.g(agkeVar, Comparator$CC.comparing(new rcf(19)))) {
            rbc rbcVar = new rbc(w, rbd.e);
            rbcVar.c();
            rbcVar.a("Segments should be passed in order, received: %s", Collection.EL.stream(agkeVar).map(new rcf(19)).collect(aghu.a));
        }
        IntStream.CC.range(0, ((qwm) agkeVar.get(0)).is().size()).mapToObj(new rcr(agkeVar, i)).forEach(new rcp(this, i2));
    }

    @Override // defpackage.qwm, defpackage.qvu
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvu clone() {
        return new rcq(this);
    }

    @Override // defpackage.qwm
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qwm clone() {
        return new rcq(this);
    }

    @Override // defpackage.qwm, defpackage.qvu
    public final /* synthetic */ Object clone() {
        return new rcq(this);
    }

    @Override // defpackage.rcj
    public final agke w() {
        return this.u;
    }

    public final agke x() {
        return super.w();
    }

    private rcq(rcq rcqVar) {
        super(rcqVar);
        this.u = (agke) Collection.EL.stream(rcqVar.u).map(new rcf(20)).collect(aghu.a);
    }
}
