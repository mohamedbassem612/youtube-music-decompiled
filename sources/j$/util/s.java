package j$.util;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class s extends n implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new n(this.b);
    }

    @Override // j$.util.n, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new s(this.b.subList(i, i2));
    }
}
