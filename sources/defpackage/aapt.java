package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aapt {
    public final String a;
    public final long b;
    public final String[] c;
    public final long d;
    public final long e;

    public aapt(String str, long j, String[] strArr, long j2, long j3) {
        str.getClass();
        this.a = str;
        this.b = j;
        strArr.getClass();
        this.c = strArr;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aapt)) {
            return false;
        }
        aapt aaptVar = (aapt) obj;
        return Objects.equals(this.a, aaptVar.a) && this.b == aaptVar.b && this.d == aaptVar.d && Arrays.equals(this.c, aaptVar.c) && this.e == aaptVar.e;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b), Long.valueOf(this.d), Long.valueOf(this.e));
    }
}
