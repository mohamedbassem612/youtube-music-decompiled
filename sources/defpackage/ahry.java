package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahry implements ahsc {
    private final ahsd a;
    private final kjc b;

    public ahry(ahsd ahsdVar, kjc kjcVar) {
        this.a = ahsdVar;
        this.b = kjcVar;
    }

    @Override // defpackage.ahsc
    public final boolean a(Exception exc) {
        this.b.w(exc);
        return true;
    }

    @Override // defpackage.ahsc
    public final boolean b(ahsg ahsgVar) {
        if (!ahsgVar.d() || this.a.b(ahsgVar)) {
            return false;
        }
        kjc kjcVar = this.b;
        String str = ahsgVar.b;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        kjcVar.v(new ahsa(str, ahsgVar.d, ahsgVar.e));
        return true;
    }
}
