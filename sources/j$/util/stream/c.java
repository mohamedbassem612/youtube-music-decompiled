package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public int a;
    public int b;
    public long[] c;

    public abstract void clear();

    public final long count() {
        int i = this.b;
        return i == 0 ? this.a : this.c[i] + ((long) this.a);
    }
}
