package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adnb {
    public final adma a;
    public final long b;
    public final Runnable c;
    public final Runnable d;

    public adnb(adma admaVar, long j, Runnable runnable, Runnable runnable2) {
        this.a = admaVar;
        this.b = j;
        this.c = runnable;
        this.d = runnable2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adnb) {
            adnb adnbVar = (adnb) obj;
            if (this.a.equals(adnbVar.a) && this.b == adnbVar.b && this.c.equals(adnbVar.c) && this.d.equals(adnbVar.d)) {
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
        return "AddParameters{presenter=" + String.valueOf(this.a) + ", duration=" + this.b + ", onStart=" + String.valueOf(runnable2) + ", onEnd=" + String.valueOf(runnable) + '}';
    }

    public adnb() {
        throw null;
    }
}
