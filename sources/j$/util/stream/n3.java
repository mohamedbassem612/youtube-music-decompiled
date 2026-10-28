package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class n3 extends l3 {
    public ArrayList d;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final void end() {
        List.EL.sort(this.d, this.b);
        g3 g3Var = (g3) this.a;
        g3Var.p(this.d.size());
        boolean z = this.c;
        ArrayList arrayList = this.d;
        if (z) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (g3Var.s()) {
                    break;
                } else {
                    g3Var.r(obj);
                }
            }
        } else {
            Collection.EL.a(arrayList, new j$.desugar.sun.nio.fs.h((byte) 11, g3Var));
        }
        g3Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final void p(long j) {
        if (j < 2147483639) {
            this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
        } else {
            j$.time.g.a("Stream size exceeds max array size");
        }
    }
}
