package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class o3 extends l3 {
    public Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        g3 g3Var = (g3) this.a;
        g3Var.p(this.e);
        if (this.c) {
            while (i < this.e && !g3Var.s()) {
                g3Var.accept(this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                g3Var.accept(this.d[i]);
                i++;
            }
        }
        g3Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final void p(long j) {
        if (j < 2147483639) {
            this.d = new Object[(int) j];
        } else {
            j$.time.g.a("Stream size exceeds max array size");
        }
    }
}
