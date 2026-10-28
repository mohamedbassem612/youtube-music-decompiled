package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aetb implements awmd {
    private final tao a;
    private volatile aqiz b;

    public aetb(tao taoVar) {
        this.a = taoVar;
    }

    private final synchronized aqiz c() {
        if (this.b == null) {
            this.b = this.a.e();
        }
        return this.b;
    }

    @Override // defpackage.awmd, defpackage.awmc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aqiz io() {
        return this.b != null ? this.b : c();
    }
}
