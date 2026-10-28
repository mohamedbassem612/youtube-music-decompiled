package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ysn extends ysp {
    private final ysu a;

    public ysn(ysu ysuVar) {
        this.a = ysuVar;
    }

    @Override // defpackage.ysp, defpackage.ysw
    public final ysu a() {
        return this.a;
    }

    @Override // defpackage.ysw
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ysw)) {
            return false;
        }
        ysw yswVar = (ysw) obj;
        return yswVar.b() == 1 && this.a.t(yswVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlatypusOnesieNetworkRequestParams{dataSourceParams=" + this.a.toString() + '}';
    }
}
