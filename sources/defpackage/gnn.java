package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnn {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final long f;

    public gnn(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f = j;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static gnm a() {
        gnm gnmVar = new gnm();
        gnmVar.c(0L);
        gnmVar.e(false);
        gnmVar.f(false);
        gnmVar.d(false);
        gnmVar.g(false);
        gnmVar.b(false);
        return gnmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gnn) {
            gnn gnnVar = (gnn) obj;
            if (this.f == gnnVar.f && this.a == gnnVar.a && this.b == gnnVar.b && this.c == gnnVar.c && this.d == gnnVar.d && this.e == gnnVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        long j = this.f;
        return ((((((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ i) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        return "BrowseResponseMetadata{responseTimeMs=" + this.f + ", wasLoadedFromDiskCache=" + this.a + ", wasSavedToDiskCache=" + this.b + ", wasClientGenerated=" + this.c + ", wasStaleOnRead=" + this.d + ", isGhostLoadingState=" + this.e + '}';
    }

    public gnn() {
        throw null;
    }
}
