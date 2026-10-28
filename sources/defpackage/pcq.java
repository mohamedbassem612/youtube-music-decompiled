package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pcq extends pcs {
    private final plx a;

    public pcq(plx plxVar) {
        this.a = plxVar;
    }

    @Override // defpackage.pcs, defpackage.pcu
    public final plx a() {
        return this.a;
    }

    @Override // defpackage.pcu
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pcu)) {
            return false;
        }
        pcu pcuVar = (pcu) obj;
        return pcuVar.b() == 1 && this.a.equals(pcuVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationTarget{account=" + this.a.toString() + '}';
    }
}
