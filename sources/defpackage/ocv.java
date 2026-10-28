package defpackage;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ocv extends odl {
    private final Activity a;
    private final View b;

    public ocv(fxg fxgVar, ocu ocuVar, View view, Activity activity, omj omjVar) {
        super("T47lOCc433ScbabO/oYhFOBK3Nr5G3x8jGK9yjRkNujf5x/Na3ZhrCzVhd1Tl/xi", "JYSAUkxi+o3sEei2UmJqdRnylADpDuN4tFF71qo+leg=", fxgVar, ocuVar, omjVar.h(111));
        this.b = view;
        this.a = activity;
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) {
        Object[] objArr = (Object[]) method.invoke("", this.b, this.a);
        objArr.getClass();
        synchronized (fxgVar) {
            long jLongValue = ((Long) objArr[0]).longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.c |= 67108864;
            fxlVar.Y = jLongValue;
            long jLongValue2 = ((Long) objArr[1]).longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar.instance;
            fxlVar3.c |= 134217728;
            fxlVar3.Z = jLongValue2;
            String str = (String) objArr[2];
            fxgVar.copyOnWrite();
            fxl fxlVar4 = (fxl) fxgVar.instance;
            str.getClass();
            fxlVar4.c |= 268435456;
            fxlVar4.aa = str;
        }
    }
}
