package j$.util;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends g implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new g(this.c);
    }

    @Override // j$.util.g, java.util.List
    public final java.util.List subList(int i, int i2) {
        i iVar;
        synchronized (this.b) {
            iVar = new i(this.c.subList(i, i2), this.b);
        }
        return iVar;
    }
}
