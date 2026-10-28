package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class qlj implements qmc {
    public final String a;
    public final String b;
    public final qmj c;

    public qlj(String str, String str2, qmj qmjVar) {
        this.a = str;
        this.b = str2;
        this.c = qmjVar;
    }

    protected abstract Object b(Object obj);

    protected abstract Object c(String str);

    protected Object e() {
        return null;
    }

    protected abstract Object f(qkh qkhVar);

    protected boolean h() {
        return false;
    }

    @Override // defpackage.qmc, defpackage.agfr
    public final Object io() {
        AtomicReference atomicReference = qkh.a;
        qkj.c = true;
        if (qkj.d == null) {
            qkj.d = new qki();
        }
        Context context = (Context) qkh.a.get();
        if (context != null) {
            Object objF = f(qkh.a(context));
            objF.getClass();
            return objF;
        }
        synchronized (qkj.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // defpackage.qmc
    public final Object ip(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Object objF = f(qkh.a(applicationContext));
        objF.getClass();
        return objF;
    }

    protected final Object iq(String str) {
        try {
            return c(str);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
            return null;
        }
    }
}
