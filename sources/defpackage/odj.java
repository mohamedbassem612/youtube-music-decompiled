package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class odj extends odl {
    private static final Long a = -1L;
    private final obb b;
    private final Context c;
    private final Map d;

    public odj(fxg fxgVar, ocu ocuVar, obb obbVar, Context context, Map map, omj omjVar) {
        super("uaRdl4l7lbt5laDuma33BeC1gWmdyH8hgI5dc4sXqvxjv21uyRobpLaWA9nfWeim", "83McyTo46jCEa8S46soNz7XvsXjaEF7RCdA7XYc9UZk=", fxgVar, ocuVar, omjVar.h(121));
        this.b = obbVar;
        this.c = context;
        this.d = map;
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) {
        obb obbVar = this.b;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(obbVar.ordinal()), this.c, ahno.ad(this.d.get("up"), Boolean.TRUE));
        objArr.getClass();
        synchronized (fxgVar) {
            if (obbVar == obb.a) {
                Object obj = objArr[0];
                Long l = a;
                long jLongValue = ((Long) ahno.ad(obj, l)).longValue();
                fxgVar.copyOnWrite();
                fxl fxlVar = (fxl) fxgVar.instance;
                fxl fxlVar2 = fxl.a;
                fxlVar.b |= 33554432;
                fxlVar.v = jLongValue;
                long jLongValue2 = ((Long) ahno.ad(objArr[1], l)).longValue();
                fxgVar.copyOnWrite();
                fxl fxlVar3 = (fxl) fxgVar.instance;
                fxlVar3.b |= 67108864;
                fxlVar3.w = jLongValue2;
            }
            long jLongValue3 = ((Long) objArr[2]).longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar4 = (fxl) fxgVar.instance;
            fxl fxlVar5 = fxl.a;
            fxlVar4.b |= SemanticState.Modal;
            fxlVar4.l = jLongValue3;
            long jLongValue4 = ((Long) objArr[3]).longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar6 = (fxl) fxgVar.instance;
            fxlVar6.c |= 8388608;
            fxlVar6.W = jLongValue4;
        }
    }
}
