package defpackage;

import android.provider.Settings;
import app.rive.semantics.SemanticState;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbq extends gcr {
    public gbq(gbg gbgVar, fxg fxgVar, int i) {
        super(gbgVar, "QA7zVYavovZ2AEzQyRQiGwEQUcwsVlOx5OO6/35YPAs6pFVOgxk0TwEnQaKMcSO6", "aZeKeu7f+oV5IqidcZvLxJS9j27lggYHaH2Nx3dcwu4=", fxgVar, i, 49);
    }

    @Override // defpackage.gcr
    protected final void a() throws InvocationTargetException {
        fxg fxgVar = this.d;
        fxgVar.copyOnWrite();
        fxl fxlVar = (fxl) fxgVar.instance;
        fxl fxlVar2 = fxl.a;
        fxlVar.L = 2;
        fxlVar.c |= SemanticState.Modal;
        try {
            int i = true != ((Boolean) this.e.invoke(null, this.a.a)).booleanValue() ? 1 : 2;
            fxgVar.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar.instance;
            fxlVar3.L = i - 1;
            fxlVar3.c |= SemanticState.Modal;
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
