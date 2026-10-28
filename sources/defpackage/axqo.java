package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axqo {
    protected volatile axqv a;
    private volatile axpo b;
    private volatile boolean c;

    public final int a() {
        int iH;
        if (this.b != null) {
            iH = this.b.b();
        } else {
            iH = this.a != null ? this.a.h() : 0;
        }
        return ((352 - (Integer.numberOfLeadingZeros(iH) * 9)) >>> 6) + iH;
    }

    public final axpo b() {
        axpo axpoVar;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                axpoVar = this.b;
            } else {
                if (this.a == null) {
                    this.b = axpo.d;
                } else {
                    this.b = this.a.c();
                }
                axpoVar = this.b;
            }
        }
        return axpoVar;
    }

    @Deprecated
    public final axqv c(axqv axqvVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = axqvVar;
                        this.b = axpo.d;
                    } catch (axqm unused) {
                        this.c = true;
                        this.a = axqvVar;
                        this.b = axpo.d;
                    }
                }
            }
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axqo)) {
            return false;
        }
        axqo axqoVar = (axqo) obj;
        axqv axqvVar = this.a;
        axqv axqvVar2 = axqoVar.a;
        if (axqvVar == null) {
            return axqvVar2 != null ? c(axqvVar2.e()).equals(axqvVar2) : b().equals(axqoVar.b());
        }
        return axqvVar2 == null ? axqvVar.equals(axqoVar.c(axqvVar.e())) : axqvVar.equals(axqvVar2);
    }

    public final int hashCode() {
        return 1;
    }
}
