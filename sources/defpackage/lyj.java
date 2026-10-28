package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lyj {
    protected volatile lyp a;
    private volatile lxa b;
    private volatile boolean c;

    public final int a() {
        int iQ;
        if (this.b != null) {
            iQ = this.b.b();
        } else {
            iQ = this.a != null ? this.a.q() : 0;
        }
        return ((352 - (Integer.numberOfLeadingZeros(iQ) * 9)) >>> 6) + iQ;
    }

    public final lxa b() {
        lxa lxaVar;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                lxaVar = this.b;
            } else {
                if (this.a == null) {
                    this.b = lxa.d;
                } else {
                    this.b = this.a.m();
                }
                lxaVar = this.b;
            }
        }
        return lxaVar;
    }

    @Deprecated
    public final lyp c(lyp lypVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = lypVar;
                        this.b = lxa.d;
                    } catch (lyh unused) {
                        this.c = true;
                        this.a = lypVar;
                        this.b = lxa.d;
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
        if (!(obj instanceof lyj)) {
            return false;
        }
        lyj lyjVar = (lyj) obj;
        lyp lypVar = this.a;
        lyp lypVar2 = lyjVar.a;
        if (lypVar == null) {
            return lypVar2 != null ? c(lypVar2.r()).equals(lypVar2) : b().equals(lyjVar.b());
        }
        return lypVar2 == null ? lypVar.equals(lyjVar.c(lypVar.r())) : lypVar.equals(lypVar2);
    }

    public final int hashCode() {
        return 1;
    }
}
