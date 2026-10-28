package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acje implements acjh {
    public final String a;
    public final boolean b;
    public final acjc c;
    public final acji d;

    public acje(String str, boolean z, acjc acjcVar, acji acjiVar) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = acjcVar;
        this.d = acjiVar;
    }

    @Override // defpackage.acjh
    public final acji a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acje) {
            acje acjeVar = (acje) obj;
            if (awrc.c(this.a, acjeVar.a) && this.b == acjeVar.b && this.c == acjeVar.c && awrc.c(this.d, acjeVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + a.aj(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SyncToCpn(cpn=" + this.a + ", forceLoadFirst=" + this.b + ", triggerType=" + this.c + ", timelineSyncDiff=" + this.d + ')';
    }
}
