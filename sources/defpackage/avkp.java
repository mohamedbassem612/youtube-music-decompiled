package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avkp implements avkw {
    public final auyt a;
    public final int b = 1;
    public final boolean c = true;
    private boolean d = false;
    private boolean e = false;

    public avkp(auyt auytVar) {
        this.a = auytVar;
    }

    @Override // defpackage.avkw
    public final void a() {
        this.a.c();
        this.e = true;
    }

    @Override // defpackage.avkw
    public final void b(Throwable th) {
        this.a.b("Cancelled by client with StreamObserver.onError()", th);
        this.d = true;
    }

    @Override // defpackage.avkw
    public final void c(Object obj) {
        ahno.P(!this.d, "Stream was terminated by error, no further calls are allowed");
        ahno.P(!this.e, "Stream is already completed, no further calls are allowed");
        this.a.d(obj);
    }

    public final void d() {
        this.a.e();
    }
}
