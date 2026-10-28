package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yqa extends yqc {
    private final alup a;

    public yqa(alup alupVar) {
        this.a = alupVar;
    }

    @Override // defpackage.yqc, defpackage.yqq
    public final alup a() {
        return this.a;
    }

    @Override // defpackage.yqq
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yqq)) {
            return false;
        }
        yqq yqqVar = (yqq) obj;
        return yqqVar.b() == 2 && this.a.equals(yqqVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InnertubeResponseHolder{onesieInnertubeResponse=" + this.a.toString() + '}';
    }
}
