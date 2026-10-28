package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awum {
    public final Throwable b;
    public final awto c;

    public awum(Throwable th, boolean z) {
        this.b = th;
        this.c = new awto(z, awts.a);
    }

    public final boolean a() {
        return this.c.b();
    }

    public final String toString() {
        return awuw.a(this) + '[' + this.b + ']';
    }
}
