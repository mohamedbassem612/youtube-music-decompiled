package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kpk {
    public final klq[] b;
    public final boolean c;
    public final int d;

    protected kpk(klq[] klqVarArr, boolean z, int i) {
        this.b = klqVarArr;
        boolean z2 = false;
        if (klqVarArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.d = i;
    }

    protected abstract void a(kmp kmpVar, kjc kjcVar);
}
