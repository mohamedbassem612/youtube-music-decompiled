package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class odb extends odl {
    private final Context a;

    public odb(fxg fxgVar, ocu ocuVar, Context context, omj omjVar) {
        super("vuRc5gv6qT2CEWHNWhZP7S2O3rAKRDBQl1C5dAi6sy4N/MyItpNkO8gyWgzJ2AmF", "lmRx+mF8MCYuWADZY0Lffq6s/pVPiSOyaI3sVfaTEz8=", fxgVar, ocuVar, omjVar.h(115));
        this.a = context;
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) {
        Object[] objArr = (Object[]) method.invoke("", this.a);
        objArr.getClass();
        synchronized (fxgVar) {
            long jIntValue = ((Integer) objArr[0]).intValue();
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.c |= 2097152;
            fxlVar.U = jIntValue;
            long jIntValue2 = ((Integer) objArr[1]).intValue();
            fxgVar.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar.instance;
            fxlVar3.b |= 16;
            fxlVar3.i = jIntValue2;
            long jIntValue3 = ((Integer) objArr[2]).intValue();
            fxgVar.copyOnWrite();
            fxl fxlVar4 = (fxl) fxgVar.instance;
            fxlVar4.b |= 32;
            fxlVar4.j = jIntValue3;
            long jIntValue4 = ((Integer) objArr[3]).intValue();
            fxgVar.copyOnWrite();
            fxl fxlVar5 = (fxl) fxgVar.instance;
            fxlVar5.d |= 8388608;
            fxlVar5.ak = jIntValue4;
            Boolean bool = (Boolean) objArr[4];
            if (bool == null) {
                fxgVar.copyOnWrite();
                fxl fxlVar6 = (fxl) fxgVar.instance;
                fxlVar6.L = 2;
                fxlVar6.c |= SemanticState.Modal;
            } else {
                int i = true != bool.booleanValue() ? 1 : 2;
                fxgVar.copyOnWrite();
                fxl fxlVar7 = (fxl) fxgVar.instance;
                fxlVar7.L = i - 1;
                fxlVar7.c |= SemanticState.Modal;
            }
            Boolean bool2 = (Boolean) objArr[5];
            if (bool2 == null) {
                fxgVar.copyOnWrite();
                fxl fxlVar8 = (fxl) fxgVar.instance;
                fxlVar8.K = 2;
                fxlVar8.c |= SemanticState.ReadOnly;
            } else {
                int i2 = true == bool2.booleanValue() ? 2 : 1;
                fxgVar.copyOnWrite();
                fxl fxlVar9 = (fxl) fxgVar.instance;
                fxlVar9.K = i2 - 1;
                fxlVar9.c |= SemanticState.ReadOnly;
            }
        }
    }
}
