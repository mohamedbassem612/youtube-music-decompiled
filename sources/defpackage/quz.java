package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class quz extends quu {
    public qxe k;
    public Duration l;
    public boolean m;
    public float n;
    public boolean o;

    public quz(quz quzVar) {
        super(quzVar);
        this.l = Duration.ZERO;
        this.m = true;
        this.n = 1.0f;
        this.o = false;
        this.k = quzVar.k;
        this.l = quzVar.l;
        this.n = quzVar.n;
        this.m = quzVar.m;
        this.o = quzVar.o;
    }

    @Override // defpackage.qus
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qus clone() {
        return new quz(this);
    }

    @Override // defpackage.qus
    public final /* synthetic */ Object clone() {
        return new quz(this);
    }

    public final void p(Duration duration) {
        this.l = nrb.e(duration);
    }

    public final boolean q(boolean z) {
        if (this.o) {
            return (z && b().isEmpty()) ? false : true;
        }
        return false;
    }

    public quz(qxe qxeVar) {
        this.l = Duration.ZERO;
        this.m = true;
        this.n = 1.0f;
        this.o = false;
        this.k = qxeVar;
    }
}
