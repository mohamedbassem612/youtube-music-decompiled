package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pcu {
    public abstract plx a();

    public abstract int b();

    public final plx c() {
        if (b() - 1 != 0) {
            return null;
        }
        return a();
    }

    public final String d() {
        plx plxVarC = c();
        if (plxVarC != null) {
            return plxVarC.b;
        }
        return null;
    }
}
