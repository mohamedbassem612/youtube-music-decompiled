package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public static /* synthetic */ int a(int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = i >> 2;
        }
        ?? r4 = z;
        if ((i3 & 2) != 0) {
            r4 = (i & 2) != 0 ? 1 : 0;
        }
        ?? r5 = z2;
        if ((i3 & 4) != 0) {
            r5 = i & 1;
        }
        return (((((i2 << 1) | r4) == true ? 1 : 0) << 1) | r5) == true ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
