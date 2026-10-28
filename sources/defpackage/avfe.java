package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avfe extends avav {
    public final auzd a;
    public final avar b;
    public final Status c;

    public avfe(auzd auzdVar, avar avarVar, Status status) {
        this.a = auzdVar;
        this.b = avarVar;
        this.c = status;
    }

    @Override // defpackage.avaj
    public final avat a(aval avalVar) {
        return new avfd(this, avalVar);
    }

    @Override // defpackage.avav
    public final String c() {
        return "fixed_picker_lb_internal";
    }

    @Override // defpackage.avav
    public final void d() {
    }

    @Override // defpackage.avav
    public final void e() {
    }
}
