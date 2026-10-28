package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class axbe {
    private int a;
    private axcg b;
    public axbg[] d;
    public int e;

    public final axat a() {
        axcg axcgVar;
        synchronized (this) {
            axcgVar = this.b;
            if (axcgVar == null) {
                axcgVar = new axcg(this.e);
                this.b = axcgVar;
            }
        }
        return axcgVar;
    }

    protected abstract axbg g();

    protected abstract axbg[] j();

    protected final axbg k() {
        axbg axbgVarG;
        axcg axcgVar;
        synchronized (this) {
            axbg[] axbgVarArrJ = this.d;
            if (axbgVarArrJ == null) {
                axbgVarArrJ = j();
                this.d = axbgVarArrJ;
            } else {
                int i = this.e;
                int length = axbgVarArrJ.length;
                if (i >= length) {
                    Object[] objArrCopyOf = Arrays.copyOf(axbgVarArrJ, length << 1);
                    objArrCopyOf.getClass();
                    axbgVarArrJ = (axbg[]) objArrCopyOf;
                    this.d = axbgVarArrJ;
                }
            }
            int i2 = this.a;
            do {
                axbgVarG = axbgVarArrJ[i2];
                if (axbgVarG == null) {
                    axbgVarG = g();
                    axbgVarArrJ[i2] = axbgVarG;
                }
                i2++;
                if (i2 >= axbgVarArrJ.length) {
                    i2 = 0;
                }
            } while (!axbgVarG.a(this));
            this.a = i2;
            this.e++;
            axcgVar = this.b;
        }
        if (axcgVar != null) {
            axcgVar.m(1);
        }
        return axbgVarG;
    }

    protected final void l(axbg axbgVar) {
        axcg axcgVar;
        int i;
        awoq[] awoqVarArrB;
        synchronized (this) {
            int i2 = this.e - 1;
            this.e = i2;
            axcgVar = this.b;
            if (i2 == 0) {
                this.a = 0;
            }
            axbgVar.getClass();
            awoqVarArrB = axbgVar.b(this);
        }
        for (awoq awoqVar : awoqVarArrB) {
            if (awoqVar != null) {
                awoqVar.resumeWith(awmy.a);
            }
        }
        if (axcgVar != null) {
            axcgVar.m(-1);
        }
    }
}
