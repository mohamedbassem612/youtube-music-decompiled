package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xis {
    public static final xis a = new xis("", true);
    public final String b;
    public final boolean c;

    public xis(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null actionDescriptor");
        }
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xis) {
            xis xisVar = (xis) obj;
            if (this.b.equals(xisVar.b) && this.c == xisVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "LatencyActionLoggerCacheEntryType{actionDescriptor=" + this.b + ", isUniqueLoggerInstancePerActionType=" + this.c + '}';
    }

    public xis() {
        throw null;
    }
}
