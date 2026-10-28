package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avkq extends atxy {
    public final avkp b;
    private final avkw c;

    public avkq(avkw avkwVar, avkp avkpVar) {
        super(null);
        this.c = avkwVar;
        this.b = avkpVar;
        if (avkwVar instanceof avkt) {
            ((avkt) avkwVar).d();
        }
    }

    @Override // defpackage.atxy
    public final void q(Status status, avbe avbeVar) {
        boolean zE = status.e();
        avkw avkwVar = this.c;
        if (zE) {
            avkwVar.a();
        } else {
            avkwVar.b(new avcg(status));
        }
    }

    @Override // defpackage.atxy
    public final void s(Object obj) {
        this.c.c(obj);
        this.b.d();
    }

    @Override // defpackage.atxy
    public final void t() {
    }

    @Override // defpackage.atxy
    public final void r(avbe avbeVar) {
    }
}
