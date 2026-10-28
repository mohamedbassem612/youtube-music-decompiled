package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awul {
    public final Object a;
    public final awub b;
    public final awql c;
    public final Object d = null;
    public final Throwable e;

    public awul(Object obj, awub awubVar, awql awqlVar, Throwable th) {
        this.a = obj;
        this.b = awubVar;
        this.c = awqlVar;
        this.e = th;
    }

    public static /* synthetic */ awul b(awul awulVar, awub awubVar, Throwable th, int i) {
        Object obj = (i & 1) != 0 ? awulVar.a : null;
        if ((i & 2) != 0) {
            awubVar = awulVar.b;
        }
        awql awqlVar = (i & 4) != 0 ? awulVar.c : null;
        if ((i & 16) != 0) {
            th = awulVar.e;
        }
        return new awul(obj, awubVar, awqlVar, th);
    }

    public final boolean a() {
        return this.e != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof awul) {
            awul awulVar = (awul) obj;
            if (awrc.c(this.a, awulVar.a) && awrc.c(this.b, awulVar.b) && awrc.c(this.c, awulVar.c)) {
                Object obj2 = awulVar.d;
                if (awrc.c(null, null) && awrc.c(this.e, awulVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        awub awubVar = this.b;
        int iHashCode2 = awubVar == null ? 0 : awubVar.hashCode();
        int i = iHashCode * 31;
        awql awqlVar = this.c;
        int iHashCode3 = awqlVar == null ? 0 : awqlVar.hashCode();
        int i2 = (i + iHashCode2) * 31;
        Throwable th = this.e;
        return ((i2 + iHashCode3) * 961) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=null, cancelCause=" + this.e + ')';
    }
}
