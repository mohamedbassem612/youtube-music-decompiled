package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avfd extends avat {
    final /* synthetic */ avfe f;
    private final aval g;

    public avfd(avfe avfeVar, aval avalVar) {
        this.f = avfeVar;
        this.g = avalVar;
    }

    @Override // defpackage.avat
    public final Status a(avap avapVar) {
        aval avalVar = this.g;
        avfe avfeVar = this.f;
        avalVar.f(avfeVar.a, avfeVar.b);
        return avfeVar.c;
    }

    @Override // defpackage.avat
    public final void b(Status status) {
        aval avalVar = this.g;
        avfe avfeVar = this.f;
        avalVar.f(avfeVar.a, avfeVar.b);
    }

    @Override // defpackage.avat
    public final void c() {
    }
}
