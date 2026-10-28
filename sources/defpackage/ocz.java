package defpackage;

import app.rive.semantics.SemanticState;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ocz extends odl {
    public ocz(fxg fxgVar, ocu ocuVar, omj omjVar) {
        super("JJ4KrwFHkV1ukdS2bZ7MUShG75S4Q+6p6IAUhLVaho16LfjWT/gWuchTnsiKt5hw", "+20BpoCG4bEdW2TguzLdWbDouqNomyRYIOWwyiuBbZ0=", fxgVar, ocuVar, omjVar.h(114));
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) {
        synchronized (fxgVar) {
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.b |= 1;
            fxlVar.f = "E";
            fxgVar.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar.instance;
            fxlVar3.c |= 32;
            fxlVar3.G = 0L;
            fxgVar.copyOnWrite();
            fxl fxlVar4 = (fxl) fxgVar.instance;
            fxlVar4.d |= SemanticState.ReadOnly;
            fxlVar4.ad = "D";
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (fxgVar) {
            String str = (String) objArr[0];
            fxgVar.copyOnWrite();
            fxl fxlVar5 = (fxl) fxgVar.instance;
            str.getClass();
            fxlVar5.b |= 1;
            fxlVar5.f = str;
            long jLongValue = ((Long) objArr[1]).longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar6 = (fxl) fxgVar.instance;
            fxlVar6.c |= 32;
            fxlVar6.G = jLongValue;
            String str2 = (String) objArr[2];
            fxgVar.copyOnWrite();
            fxl fxlVar7 = (fxl) fxgVar.instance;
            str2.getClass();
            fxlVar7.d |= SemanticState.ReadOnly;
            fxlVar7.ad = str2;
        }
    }
}
