package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffd implements ett {
    private final Object b;

    public ffd(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.b = obj;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (obj instanceof ffd) {
            return this.b.equals(((ffd) obj).b);
        }
        return false;
    }

    @Override // defpackage.ett
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b.toString() + '}';
    }
}
