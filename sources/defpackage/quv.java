package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class quv extends quu {
    public final qwr k;
    public boolean l;

    private quv(quv quvVar) {
        super(quvVar);
        this.l = false;
        this.k = quvVar.k;
        this.l = quvVar.l;
    }

    @Override // defpackage.qus
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qus clone() {
        return new quv(this);
    }

    @Override // defpackage.qus
    public final /* synthetic */ Object clone() {
        return new quv(this);
    }

    public final boolean p(boolean z) {
        if (this.l) {
            return (z && b().isEmpty()) ? false : true;
        }
        return false;
    }

    public quv(qwr qwrVar) {
        this.l = false;
        this.k = qwrVar;
    }
}
