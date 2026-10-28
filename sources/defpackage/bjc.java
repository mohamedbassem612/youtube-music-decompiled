package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bjc {
    protected volatile bji a;
    private volatile bhy b;
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

    public final bhy b() {
        bhy bhyVar;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                bhyVar = this.b;
            } else {
                if (this.a == null) {
                    this.b = bhy.d;
                } else {
                    this.b = this.a.d();
                }
                bhyVar = this.b;
            }
        }
        return bhyVar;
    }

    @Deprecated
    public final bji c(bji bjiVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = bjiVar;
                        this.b = bhy.d;
                    } catch (bja unused) {
                        this.c = true;
                        this.a = bjiVar;
                        this.b = bhy.d;
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
        if (!(obj instanceof bjc)) {
            return false;
        }
        bjc bjcVar = (bjc) obj;
        bji bjiVar = this.a;
        bji bjiVar2 = bjcVar.a;
        if (bjiVar == null) {
            return bjiVar2 != null ? c(bjiVar2.e()).equals(bjiVar2) : b().equals(bjcVar.b());
        }
        return bjiVar2 == null ? bjiVar.equals(bjcVar.c(bjiVar.e())) : bjiVar.equals(bjiVar2);
    }

    public final int hashCode() {
        return 1;
    }
}
