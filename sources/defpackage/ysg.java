package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ysg extends ysh {
    public final ysm a;

    public ysg(ysm ysmVar) {
        this.a = ysmVar;
    }

    @Override // defpackage.ysh, defpackage.ysl
    public final ysm a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ysl)) {
            return false;
        }
        ysl yslVar = (ysl) obj;
        yslVar.b();
        return this.a.equals(yslVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnesieMediaFetchObjects{platypusOnesieObjects=" + this.a.toString() + '}';
    }

    @Override // defpackage.ysl
    public final void b() {
    }
}
