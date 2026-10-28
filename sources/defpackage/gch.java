package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gch extends gcr {
    public gch(gbg gbgVar, fxg fxgVar, int i) {
        super(gbgVar, "6HTNPwLYYCxo5NT9ZKcDgPZtw9ukLMVqovi//h8BPLRGmMHxXO8yqWjjbF2L/Jwr", "D+MW4XiWP8LFJQYW7bM90WiSFOpPurq+FfzW3bxBHJs=", fxgVar, i, 73);
    }

    @Override // defpackage.gcr
    protected final void a() {
        try {
            boolean zBooleanValue = ((Boolean) this.e.invoke(null, this.a.a)).booleanValue();
            fxg fxgVar = this.d;
            int i = true == zBooleanValue ? 2 : 1;
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.ab = i - 1;
            fxlVar.d |= 16;
        } catch (InvocationTargetException unused) {
            fxg fxgVar2 = this.d;
            fxgVar2.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar2.instance;
            fxl fxlVar4 = fxl.a;
            fxlVar3.ab = 2;
            fxlVar3.d |= 16;
        }
    }
}
