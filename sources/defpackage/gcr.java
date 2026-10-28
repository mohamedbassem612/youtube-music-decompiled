package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gcr implements Callable {
    protected final gbg a;
    protected final String b;
    protected final String c;
    protected final fxg d;
    protected Method e;
    protected final int f;
    protected final int g;

    public gcr(gbg gbgVar, String str, String str2, fxg fxgVar, int i, int i2) {
        getClass().getSimpleName();
        this.a = gbgVar;
        this.b = str;
        this.c = str2;
        this.d = fxgVar;
        this.f = i;
        this.g = i2;
    }

    protected abstract void a();

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            gbg gbgVar = this.a;
            Method methodC = gbgVar.c(this.b, this.c);
            this.e = methodC;
            if (methodC == null) {
                return null;
            }
            a();
            gak gakVar = gbgVar.j;
            if (gakVar == null || (i = this.f) == Integer.MIN_VALUE) {
                return null;
            }
            gakVar.a(this.g, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
