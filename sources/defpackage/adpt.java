package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adpt implements adpv {
    public final byte[] a;

    public adpt(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof adpt) && Arrays.equals(this.a, ((adpt) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "Bytes(bytes=" + Arrays.toString(this.a) + ')';
    }
}
