package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tjr {
    public final Object a;
    public final tmt b;

    public tjr(Object obj, tmt tmtVar) {
        this.a = obj;
        this.b = tmtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tjr) {
            tjr tjrVar = (tjr) obj;
            if (awrc.c(this.a, tjrVar.a) && awrc.c(this.b, tjrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CacheResult(data=" + this.a + ", metadata=" + this.b + ')';
    }
}
