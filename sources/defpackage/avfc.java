package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avfc implements avdx {
    final Status a;
    private final avdv b;

    public avfc(Status status, avdv avdvVar) {
        ahno.G(!status.e(), "error must not be OK");
        this.a = status;
        this.b = avdvVar;
    }

    @Override // defpackage.avdx
    public final avdu a(avbh avbhVar, avbe avbeVar, auyq auyqVar, auyw[] auywVarArr) {
        return new avfb(this.a, this.b, auywVarArr);
    }

    @Override // defpackage.avae
    public final avaa c() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
