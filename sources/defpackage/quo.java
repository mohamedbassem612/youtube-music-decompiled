package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class quo {
    public final jsk a;
    public final Optional b;

    public quo(jsk jskVar, Optional optional) {
        this.a = jskVar;
        this.b = optional;
    }

    public static sry a() {
        sry sryVar = new sry((char[]) null);
        sryVar.b = Optional.empty();
        return sryVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof quo) {
            quo quoVar = (quo) obj;
            if (this.a.equals(quoVar.a) && this.b.equals(quoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "RemoteDataSourceCacheConfig{cache=" + String.valueOf(this.a) + ", encryptionKey=" + String.valueOf(optional) + '}';
    }

    public quo() {
        throw null;
    }
}
