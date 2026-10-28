package defpackage;

import app.rive.semantics.SemanticState;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gbz extends gcr {
    public gbz(gbg gbgVar, fxg fxgVar, int i) {
        super(gbgVar, "5xIXMAHz6N7CNfb6WZiqMvRQI+37ZQA0jQzIsbF092mLHsi5SPwU/YAI1rnZXIZ7", "2m+QIUuy4BFXaCQU2XlXQM6dPTje1Sr/WU2uJI+z4gY=", fxgVar, i, 108);
    }

    @Override // defpackage.gcr
    protected final void a() {
        fxg fxgVar = this.d;
        fxgVar.copyOnWrite();
        fxl fxlVar = (fxl) fxgVar.instance;
        fxl fxlVar2 = fxl.a;
        fxlVar.ao = 2;
        fxlVar.e |= SemanticState.ReadOnly;
        try {
            int iAX = kro.aX(((Integer) this.e.invoke(null, this.a.a)).intValue());
            if (iAX == 0) {
                iAX = 3;
            }
            fxgVar.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar.instance;
            fxlVar3.ao = iAX - 1;
            fxlVar3.e |= SemanticState.ReadOnly;
        } catch (InvocationTargetException unused) {
            fxg fxgVar2 = this.d;
            fxgVar2.copyOnWrite();
            fxl fxlVar4 = (fxl) fxgVar2.instance;
            fxlVar4.ao = 2;
            fxlVar4.e |= SemanticState.ReadOnly;
        }
    }
}
