package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cfk {
    public boolean a;
    public boolean b;
    public boolean c;

    public cfk(cfl cflVar) {
        this.a = cflVar.b;
        this.b = cflVar.c;
        this.c = cflVar.d;
    }

    public final cfl a() {
        if (this.a || !(this.b || this.c)) {
            return new cfl(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
