package defpackage;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class odh extends odl {
    private final Context a;

    public odh(fxg fxgVar, ocu ocuVar, Context context, omj omjVar) {
        super("wtOutrKD3hWMm3gJP3P1SgIQgTxxRfDThny9MWuCT8MUJ7KZ3ksYwnJllDow24H/", "sCpbqDzM57omH4iujdDxzg9yfO2HvEUDj0KumxP4qk4=", fxgVar, ocuVar, omjVar.h(119));
        this.a = context;
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) {
        Object[] objArr = (Object[]) method.invoke("", this.a);
        objArr.getClass();
        synchronized (fxgVar) {
            long jLongValue = ((Long) objArr[0]).longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.b |= 4;
            fxlVar.h = jLongValue;
            long jLongValue2 = ((Long) objArr[1]).longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar.instance;
            fxlVar3.c |= 4194304;
            fxlVar3.V = jLongValue2;
        }
    }
}
