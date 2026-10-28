package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acjg implements acjh {
    public final long a;
    public final boolean b;
    public final acjc c;
    public final acji d;

    public acjg(long j, boolean z, acjc acjcVar, acji acjiVar) {
        this.a = j;
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
        if (obj instanceof acjg) {
            acjg acjgVar = (acjg) obj;
            if (this.a == acjgVar.a && this.b == acjgVar.b && this.c == acjgVar.c && awrc.c(this.d, acjgVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((a.ak(this.a) * 31) + a.aj(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SyncToTime(syncToTimeMillis=" + this.a + ", forceLoadFirst=" + this.b + ", triggerType=" + this.c + ", timelineSyncDiff=" + this.d + ')';
    }
}
