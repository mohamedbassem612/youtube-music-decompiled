package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yso extends ysp {
    private final ysv a;

    public yso(ysv ysvVar) {
        this.a = ysvVar;
    }

    @Override // defpackage.ysw
    public final int b() {
        return 2;
    }

    @Override // defpackage.ysp, defpackage.ysw
    public final ysv c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ysw)) {
            return false;
        }
        ysw yswVar = (ysw) obj;
        return yswVar.b() == 2 && this.a.t(yswVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlatypusOnesieNetworkRequestParams{netFetchParams=" + this.a.toString() + '}';
    }
}
