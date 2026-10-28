package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zbz extends zca {
    private final yop a;

    public zbz(yop yopVar) {
        this.a = yopVar;
    }

    @Override // defpackage.zcd
    public final zcc b() {
        return zcc.b;
    }

    @Override // defpackage.zca, defpackage.zcd
    public final yop c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zcd)) {
            return false;
        }
        zcd zcdVar = (zcd) obj;
        return zcc.b == zcdVar.b() && this.a.equals(zcdVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClientOrServerFormatSelectionResult{server=" + this.a.toString() + '}';
    }
}
