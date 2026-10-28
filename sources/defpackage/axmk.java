package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axmk extends axol {
    public axmk(String str, int i, int i2) {
        super(str, i, i2);
    }

    @Override // defpackage.axol, org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        int i = this.b;
        if (i == -358 || i == -352) {
            return true;
        }
        return super.immediatelyRetryable();
    }
}
