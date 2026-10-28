package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dlz {
    protected abstract String a();

    protected abstract void b(dpb dpbVar, Object obj);

    public final int c(dpt dptVar, Iterable iterable) throws Exception {
        dptVar.getClass();
        dpb dpbVarA = dptVar.a(a());
        try {
            int iN = 0;
            for (Object obj : iterable) {
                if (obj != null) {
                    b(dpbVarA, obj);
                    dpbVarA.l();
                    dpbVarA.j();
                    iN += ape.n(dptVar);
                }
            }
            JniZero.j(dpbVarA, null);
            return iN;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.j(dpbVarA, th);
                throw th2;
            }
        }
    }

    public final void d(dpt dptVar, Object obj) throws Exception {
        dptVar.getClass();
        dpb dpbVarA = dptVar.a(a());
        try {
            b(dpbVarA, obj);
            dpbVarA.l();
            dpbVarA.close();
            ape.n(dptVar);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    dpbVarA.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }
}
