package defpackage;

import j$.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rcb extends qvc {
    public final agke a;

    public rcb(agke agkeVar) {
        super(nra.t((List) Collection.EL.stream(agkeVar).map(new qzp(8)).collect(aghu.a)));
        this.a = agkeVar;
    }

    @Override // defpackage.qvc
    /* JADX INFO: renamed from: a */
    public final qvc clone() {
        return new rcb(this);
    }

    @Override // defpackage.qvc
    public final String c() {
        return "Merged effect";
    }

    @Override // defpackage.qvc
    public final /* synthetic */ Object clone() {
        return new rcb(this);
    }

    private rcb(rcb rcbVar) {
        super(rcbVar);
        this.a = (agke) Collection.EL.stream(rcbVar.a).map(new qzp(7)).collect(aghu.a);
    }
}
