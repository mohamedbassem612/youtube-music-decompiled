package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahrz implements ahsc {
    final kjc a;

    public ahrz(kjc kjcVar) {
        this.a = kjcVar;
    }

    @Override // defpackage.ahsc
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.ahsc
    public final boolean b(ahsg ahsgVar) {
        if (!ahsgVar.e() && !ahsgVar.d() && !ahsgVar.b()) {
            return false;
        }
        this.a.x(ahsgVar.a);
        return true;
    }
}
