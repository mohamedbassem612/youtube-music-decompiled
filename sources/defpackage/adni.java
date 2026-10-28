package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adni {
    public final adma a;
    public final long b;
    public final Runnable c;
    public final Runnable d;

    public adni(adma admaVar, long j, Runnable runnable, Runnable runnable2) {
        this.a = admaVar;
        this.b = j;
        this.c = runnable;
        this.d = runnable2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adni) {
            adni adniVar = (adni) obj;
            if (this.a.equals(adniVar.a) && this.b == adniVar.b && this.c.equals(adniVar.c) && this.d.equals(adniVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) this.b)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Runnable runnable = this.d;
        Runnable runnable2 = this.c;
        return "RemoveParameters{presenter=" + String.valueOf(this.a) + ", duration=" + this.b + ", onStart=" + String.valueOf(runnable2) + ", onEnd=" + String.valueOf(runnable) + '}';
    }

    public adni() {
        throw null;
    }
}
