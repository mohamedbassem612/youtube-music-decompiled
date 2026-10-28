package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yqb extends yqc {
    private final Throwable a;

    public yqb(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.yqq
    public final int b() {
        return 3;
    }

    @Override // defpackage.yqc, defpackage.yqq
    public final Throwable c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yqq)) {
            return false;
        }
        yqq yqqVar = (yqq) obj;
        return yqqVar.b() == 3 && this.a.equals(yqqVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InnertubeResponseHolder{throwable=" + this.a.toString() + '}';
    }
}
