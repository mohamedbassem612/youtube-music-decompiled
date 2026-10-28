package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class evh implements ett {
    private final ett b;
    private final ett c;

    public evh(ett ettVar, ett ettVar2) {
        this.b = ettVar;
        this.c = ettVar2;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (!(obj instanceof evh)) {
            return false;
        }
        evh evhVar = (evh) obj;
        return this.b.equals(evhVar.b) && this.c.equals(evhVar.c);
    }

    @Override // defpackage.ett
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        ett ettVar = this.c;
        return "DataCacheKey{sourceKey=" + String.valueOf(this.b) + ", signature=" + String.valueOf(ettVar) + '}';
    }
}
