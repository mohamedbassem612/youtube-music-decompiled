package defpackage;

import internal.org.jni_zero.JniZero;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dma {
    public abstract String a();

    public abstract void b(dpb dpbVar, Object obj);

    public final List c(dpt dptVar, Collection collection) throws Exception {
        dptVar.getClass();
        awoa awoaVar = new awoa(10);
        dpb dpbVarA = dptVar.a(a());
        try {
            for (Object obj : collection) {
                if (obj != null) {
                    b(dpbVarA, obj);
                    dpbVarA.l();
                    dpbVarA.j();
                    awoaVar.add(Long.valueOf(ape.o(dptVar)));
                } else {
                    awoaVar.add(-1L);
                }
            }
            JniZero.j(dpbVarA, null);
            return awoaVar.f();
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
        dpb dpbVarA = dptVar.a(a());
        try {
            b(dpbVarA, obj);
            dpbVarA.l();
            dpbVarA.close();
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
