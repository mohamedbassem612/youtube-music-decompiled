package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class odl implements odk {
    private final String a;
    private final String b;
    private final fxg c;
    private final ofb d;
    private final ocu e;

    public odl(String str, String str2, fxg fxgVar, ocu ocuVar, ofb ofbVar) {
        this.a = str;
        this.b = str2;
        this.c = fxgVar;
        this.e = ocuVar;
        this.d = ofbVar;
    }

    protected abstract void a(Method method, fxg fxgVar);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            this.d.c();
            Method methodA = this.e.a(this.a, this.b);
            if (methodA != null) {
                a(methodA, this.c);
            }
            this.d.a();
            return null;
        } catch (Throwable th) {
            try {
                this.d.b(th);
                throw th;
            } catch (Throwable th2) {
                this.d.a();
                throw th2;
            }
        }
    }
}
