package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zix extends ziz {
    private final clo a;

    public zix(clo cloVar) {
        this.a = cloVar;
    }

    @Override // defpackage.zjt
    public final int b() {
        return 3;
    }

    @Override // defpackage.ziz, defpackage.zjt
    public final clo d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zjt)) {
            return false;
        }
        zjt zjtVar = (zjt) obj;
        return zjtVar.b() == 3 && this.a.equals(zjtVar.d());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MediaCodecInfoWrapper{softwareVideo=" + this.a.b + '}';
    }
}
