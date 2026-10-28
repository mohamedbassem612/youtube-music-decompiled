package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends n {
    public final ConcurrentHashMap i;
    public j j;

    public a(j[] jVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(jVarArr, i, 0, i2);
        this.i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        j jVar = this.j;
        if (jVar == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.i.g(jVar.b, null, null);
    }
}
