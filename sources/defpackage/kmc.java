package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class kmc extends krd {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public kmc(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    @Override // defpackage.krd
    public final byte[] D() {
        byte[] bArrB;
        synchronized (this) {
            bArrB = (byte[]) this.b.get();
            if (bArrB == null) {
                bArrB = b();
                this.b = new WeakReference(bArrB);
            }
        }
        return bArrB;
    }

    protected abstract byte[] b();
}
