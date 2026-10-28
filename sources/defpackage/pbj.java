package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pbj implements pbg {
    public final int a;

    public pbj(int i) {
        this.a = i;
    }

    @Override // defpackage.pbg
    public final /* synthetic */ ahzx a() {
        return nvh.a(this);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof pbj) && this.a == ((pbj) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TrayLimitInfo(limit=" + this.a + ')';
    }
}
