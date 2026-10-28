package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class pfj {
    public final long a;
    public final int b;
    public final byte[] c;

    public pfj(long j, int i, byte[] bArr) {
        this.a = j;
        this.b = i;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pfj) {
            pfj pfjVar = (pfj) obj;
            if (this.a == pfjVar.a && this.b == pfjVar.b) {
                boolean z = pfjVar instanceof pfj;
                if (Arrays.equals(this.c, pfjVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Arrays.hashCode(this.c);
    }

    public final String toString() {
        return "ChimeTaskData{id=" + this.a + ", jobType=" + this.b + ", payload=" + Arrays.toString(this.c) + '}';
    }

    public pfj() {
        throw null;
    }
}
