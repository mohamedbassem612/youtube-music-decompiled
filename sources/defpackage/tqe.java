package defpackage;

import java.util.Arrays;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tqe {
    public final long[] a;
    public final long[] b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final ScheduledFuture i;

    public tqe(long[] jArr, long[] jArr2, boolean z, int i, int i2, int i3, int i4, int i5, ScheduledFuture scheduledFuture) {
        this.a = jArr;
        this.b = jArr2;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = scheduledFuture;
    }

    static boolean b(int i) {
        return ((i >> 10) & 1) == 1;
    }

    public final boolean a() {
        return this.d != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqe) {
            tqe tqeVar = (tqe) obj;
            boolean z = tqeVar instanceof tqe;
            if (Arrays.equals(this.a, z ? tqeVar.a : tqeVar.a)) {
                if (Arrays.equals(this.b, z ? tqeVar.b : tqeVar.b) && this.c == tqeVar.c && this.d == tqeVar.d && this.e == tqeVar.e && this.f == tqeVar.f && this.g == tqeVar.g && this.h == tqeVar.h) {
                    ScheduledFuture scheduledFuture = this.i;
                    if (scheduledFuture == null) {
                        if (tqeVar.i == null) {
                            return true;
                        }
                    } else if (scheduledFuture.equals(tqeVar.i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
        ScheduledFuture scheduledFuture = this.i;
        int iHashCode2 = scheduledFuture == null ? 0 : scheduledFuture.hashCode();
        int i = true != this.c ? 1237 : 1231;
        int i2 = this.d;
        int i3 = ((iHashCode * 1000003) ^ i) * 1000003;
        int i4 = this.e;
        int i5 = (i3 ^ i2) * 1000003;
        return ((((((((i5 ^ i4) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ iHashCode2;
    }

    public final String toString() {
        ScheduledFuture scheduledFuture = this.i;
        long[] jArr = this.b;
        return "Guts{active=" + Arrays.toString(this.a) + ", serialized=" + Arrays.toString(jArr) + ", isDirty=" + this.c + ", disposed=" + this.d + ", maskedLikely=" + this.e + ", changeCount=" + this.f + ", serialDelaySec=" + this.g + ", serializationFailures=" + this.h + ", serializeTask=" + String.valueOf(scheduledFuture) + '}';
    }

    public tqe() {
        throw null;
    }
}
