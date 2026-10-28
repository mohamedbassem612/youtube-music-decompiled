package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acjf implements acjh {
    public final boolean a;
    public final acjc b;
    public final acji c;

    public acjf(boolean z, acjc acjcVar, acji acjiVar) {
        acjiVar.getClass();
        this.a = z;
        this.b = acjcVar;
        this.c = acjiVar;
    }

    @Override // defpackage.acjh
    public final acji a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acjf) {
            acjf acjfVar = (acjf) obj;
            if (this.a == acjfVar.a && this.b == acjfVar.b && awrc.c(this.c, acjfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((a.aj(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SyncToPlayback(forceLoadFirst=" + this.a + ", triggerType=" + this.b + ", timelineSyncDiff=" + this.c + ')';
    }
}
