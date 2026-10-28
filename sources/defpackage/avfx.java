package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avfx extends avfg {
    final /* synthetic */ avdw a;
    final /* synthetic */ avfy b;

    public avfx(avfy avfyVar, avdw avdwVar) {
        this.a = avdwVar;
        this.b = avfyVar;
    }

    @Override // defpackage.avfg, defpackage.avdw
    public final void a(Status status, avdv avdvVar, avbe avbeVar) {
        this.b.b.a.a(status.e());
        this.a.a(status, avdvVar, avbeVar);
    }

    @Override // defpackage.avfg
    protected final avdw b() {
        return this.a;
    }
}
