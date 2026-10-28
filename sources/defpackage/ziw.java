package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ziw extends ziz {
    private final clo a;

    public ziw(clo cloVar) {
        this.a = cloVar;
    }

    @Override // defpackage.zjt
    public final int b() {
        return 4;
    }

    @Override // defpackage.ziz, defpackage.zjt
    public final clo c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zjt)) {
            return false;
        }
        zjt zjtVar = (zjt) obj;
        return zjtVar.b() == 4 && this.a.equals(zjtVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MediaCodecInfoWrapper{hardwareVideo=" + this.a.b + '}';
    }
}
