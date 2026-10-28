package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avfb extends avhv {
    private boolean b;
    private final Status c;
    private final avdv d;
    private final auyw[] e;

    public avfb(Status status, avdv avdvVar, auyw[] auywVarArr) {
        ahno.G(!status.e(), "error must not be OK");
        this.c = status;
        this.d = avdvVar;
        this.e = auywVarArr;
    }

    @Override // defpackage.avhv, defpackage.avdu
    public final void g(avfu avfuVar) {
        avfuVar.b("error", this.c);
        avfuVar.b("progress", this.d);
    }

    @Override // defpackage.avhv, defpackage.avdu
    public final void n(avdw avdwVar) {
        ahno.P(!this.b, "already started");
        this.b = true;
        int i = 0;
        while (true) {
            auyw[] auywVarArr = this.e;
            if (i >= auywVarArr.length) {
                avdwVar.a(this.c, this.d, new avbe());
                return;
            } else {
                auyw auywVar = auywVarArr[i];
                i++;
            }
        }
    }

    public avfb(Status status, auyw[] auywVarArr) {
        this(status, avdv.a, auywVarArr);
    }
}
