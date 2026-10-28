package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zrf implements zrb, zqy {
    private final awmy a = awmy.a;

    @Override // defpackage.zqy
    public final /* synthetic */ zqv a() {
        return new zre(null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zrf) && awrc.c(this.a, ((zrf) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Refreshing(unit=" + this.a + ')';
    }
}
