package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zby extends zca {
    private final zcb a;

    public zby(zcb zcbVar) {
        this.a = zcbVar;
    }

    @Override // defpackage.zca, defpackage.zcd
    public final zcb a() {
        return this.a;
    }

    @Override // defpackage.zcd
    public final zcc b() {
        return zcc.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zcd)) {
            return false;
        }
        zcd zcdVar = (zcd) obj;
        return zcc.a == zcdVar.b() && this.a.equals(zcdVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClientOrServerFormatSelectionResult{client=" + this.a.toString() + '}';
    }
}
