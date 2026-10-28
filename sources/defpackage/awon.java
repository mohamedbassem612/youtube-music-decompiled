package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awon implements awot {
    private final awqg a;
    private final awot b;

    public awon(awot awotVar, awqg awqgVar) {
        this.a = awqgVar;
        this.b = awotVar instanceof awon ? ((awon) awotVar).b : awotVar;
    }

    public final awos a(awos awosVar) {
        return (awos) this.a.invoke(awosVar);
    }

    public final boolean b(awot awotVar) {
        awotVar.getClass();
        return awotVar == this || this.b == awotVar;
    }

    public awon() {
        this(awor.j, new xzn(16));
    }
}
