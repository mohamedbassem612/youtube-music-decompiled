package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gci extends gcr {
    private List h;
    private final Context i;

    public gci(gbg gbgVar, fxg fxgVar, int i, Context context) {
        super(gbgVar, "cXzUdzxKtIyji4oAmpSjOYTQ3anLJ3eo/8xUl9XwGDh45bgvLwQ83uH3LY+YcmTJ", "ma9IuiJAqmU0vJcLG+v6NkuHqnizjljXOQYoaA01iC0=", fxgVar, i, 31);
        this.h = null;
        this.i = context;
    }

    @Override // defpackage.gcr
    protected final void a() {
        fxg fxgVar = this.d;
        fxgVar.copyOnWrite();
        fxl fxlVar = (fxl) fxgVar.instance;
        fxl fxlVar2 = fxl.a;
        fxlVar.b |= 33554432;
        fxlVar.v = -1L;
        fxgVar.copyOnWrite();
        fxl fxlVar3 = (fxl) fxgVar.instance;
        fxlVar3.b |= 67108864;
        fxlVar3.w = -1L;
        Context context = this.i;
        if (context == null) {
            context = this.a.a;
        }
        List list = this.h;
        if (list == null) {
            list = (List) this.e.invoke(null, context);
            this.h = list;
        }
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (fxgVar) {
            long jLongValue = ((Long) this.h.get(0)).longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar4 = (fxl) fxgVar.instance;
            fxlVar4.b |= 33554432;
            fxlVar4.v = jLongValue;
            long jLongValue2 = ((Long) this.h.get(1)).longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar5 = (fxl) fxgVar.instance;
            fxlVar5.b |= 67108864;
            fxlVar5.w = jLongValue2;
        }
    }
}
