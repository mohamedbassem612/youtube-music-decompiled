package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ziv extends ziz {
    private final clo a;

    public ziv(clo cloVar) {
        this.a = cloVar;
    }

    @Override // defpackage.ziz, defpackage.zjt
    public final clo a() {
        return this.a;
    }

    @Override // defpackage.zjt
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zjt)) {
            return false;
        }
        zjt zjtVar = (zjt) obj;
        return zjtVar.b() == 2 && this.a.equals(zjtVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MediaCodecInfoWrapper{audio=" + this.a.b + '}';
    }
}
