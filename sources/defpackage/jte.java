package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jte {
    public final byte[] a;
    public final int b;
    public final int c;

    public jte(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jte)) {
            return false;
        }
        jte jteVar = (jte) obj;
        return Arrays.equals(this.a, jteVar.a) && this.b == jteVar.b && this.c == jteVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }
}
