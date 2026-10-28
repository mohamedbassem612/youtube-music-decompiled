package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aasd extends aasg {
    private final aamw a;
    private final aasf b;
    private final boolean c;
    private final aogv d;
    private final aamg e;

    private aasd(aamw aamwVar, aasf aasfVar, boolean z, aogv aogvVar, aamg aamgVar) {
        this.a = aamwVar;
        this.b = aasfVar;
        this.c = z;
        this.d = aogvVar;
        this.e = aamgVar;
    }

    @Override // defpackage.aasg
    public final aamg a() {
        return this.e;
    }

    @Override // defpackage.aasg
    public final aamw b() {
        return this.a;
    }

    @Override // defpackage.aasg
    public final aasf c() {
        return this.b;
    }

    @Override // defpackage.aasg
    public final aogv d() {
        return this.d;
    }

    @Override // defpackage.aasg
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aasg) {
            aasg aasgVar = (aasg) obj;
            if (this.a.equals(aasgVar.b()) && this.b.equals(aasgVar.c()) && this.c == aasgVar.e() && this.d.equals(aasgVar.d()) && this.e.equals(aasgVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        aamg aamgVar = this.e;
        aogv aogvVar = this.d;
        aasf aasfVar = this.b;
        return "OfflineTransferEvent{transfer=" + this.a.toString() + ", type=" + aasfVar.toString() + ", usingDataToDownloadStreams=" + this.c + ", failureReason=" + aogvVar.toString() + ", mediaStatus=" + aamgVar.toString() + '}';
    }

    public /* synthetic */ aasd(aamw aamwVar, aasf aasfVar, boolean z, aogv aogvVar, aamg aamgVar, aasc aascVar) {
        this(aamwVar, aasfVar, z, aogvVar, aamgVar);
    }
}
