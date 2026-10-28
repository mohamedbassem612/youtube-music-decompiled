package j$.util.stream;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class l3 extends w2 {
    public final Comparator b;
    public boolean c;

    public l3(g3 g3Var, Comparator comparator) {
        super(g3Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final boolean s() {
        this.c = true;
        return false;
    }
}
