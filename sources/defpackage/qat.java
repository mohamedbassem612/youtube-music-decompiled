package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qat {
    public MessageLite a;
    public Throwable b;
    public Object c;
    private boolean d;
    private boolean e;
    private byte f;

    public final qau a() {
        if (this.f == 3) {
            return new qau((Integer) this.c, this.a, this.b, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" isRetryableError");
        }
        if ((this.f & 2) == 0) {
            sb.append(" isAuthError");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 2);
    }

    public final void c(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 1);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public final pdq d() {
        if (this.f == 3) {
            return new pdq(this.a, this.c, this.b, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" isRetryableError");
        }
        if ((this.f & 2) == 0) {
            sb.append(" isAuthError");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 2);
    }

    public final void f(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 1);
    }
}
