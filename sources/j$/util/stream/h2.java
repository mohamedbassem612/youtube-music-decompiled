package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class h2 extends CountedCompleter {
    public final t0 a;
    public final int b;

    public h2(t0 t0Var) {
        this.a = t0Var;
        this.b = 0;
    }

    public abstract void a();

    public abstract h2 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i;
        while (this.a.l() != 0) {
            this.setPendingCount(this.a.l() - 1);
            int i2 = 0;
            int iCount = 0;
            while (true) {
                int iL = this.a.l() - 1;
                i = this.b + iCount;
                if (i2 < iL) {
                    h2 h2VarB = this.b(i2, i);
                    iCount = (int) (h2VarB.a.count() + ((long) iCount));
                    h2VarB.fork();
                    i2++;
                }
            }
            this = this.b(i2, i);
        }
        this.a();
        this.propagateCompletion();
    }

    public h2(h2 h2Var, t0 t0Var, int i) {
        super(h2Var);
        this.a = t0Var;
        this.b = i;
    }
}
