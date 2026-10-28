package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ode extends odl {
    private static volatile Long a;
    private static final Object b = new Object();

    public ode(fxg fxgVar, ocu ocuVar, omj omjVar) {
        super("R64IbQ+Acj3SXeG3OKTuHk8afjJvVJqheDOoeCeCiSyiMKb+sJPKZH5aCeuEiO+b", "z+ZYM6cHxnORj3V7OG1dd8cDd1Vbe6h8vm6Z8GBlGUk=", fxgVar, ocuVar, omjVar.h(117));
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    Long l = (Long) method.invoke("", null);
                    l.getClass();
                    a = l;
                }
            }
        }
        synchronized (fxgVar) {
            if (a != null) {
                long jLongValue = a.longValue();
                fxgVar.copyOnWrite();
                fxl fxlVar = (fxl) fxgVar.instance;
                fxl fxlVar2 = fxl.a;
                fxlVar.b |= 1048576;
                fxlVar.r = jLongValue;
            }
        }
    }
}
