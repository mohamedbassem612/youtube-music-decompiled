package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rfc {
    public final Size a;
    private final long b;

    public rfc(long j, Size size) {
        this.b = j;
        this.a = size;
    }

    static rfc a(long j) {
        return new rfc(j, new Size(0, 0));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfc) {
            rfc rfcVar = (rfc) obj;
            if (this.b == rfcVar.b && this.a.equals(rfcVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "BoundingBox{timestamp=" + this.b + ", size=" + this.a.toString() + '}';
    }

    public rfc() {
        throw null;
    }
}
