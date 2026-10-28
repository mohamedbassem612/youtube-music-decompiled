package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class awks {
    public abstract int a();

    public final boolean c(axsp[] axspVarArr) {
        int iA = a();
        int length = axspVarArr.length;
        if (length == iA) {
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.bQ(length, iA, "parallelism = ", ", subscribers = "));
        for (axsp axspVar : axspVarArr) {
            awjx.f(illegalArgumentException, axspVar);
        }
        return false;
    }
}
