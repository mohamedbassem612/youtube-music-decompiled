package defpackage;

import android.app.Activity;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gbo extends gcr {
    private final Activity h;
    private final View i;

    public gbo(gbg gbgVar, fxg fxgVar, int i, View view, Activity activity) {
        super(gbgVar, "U1WTFZjV3eK/ha6YDRO5wxJp0upAq2qFL5B5WugYKvwWYyw3LbunlDSDs+tJ/YaG", "zztgoRPRBv9ey9qLWmMxj7GgYFgxpVCi5Pwi6+ZK9k8=", fxgVar, i, 62);
        this.i = view;
        this.h = activity;
    }

    @Override // defpackage.gcr
    protected final void a() {
        View view = this.i;
        if (view != null) {
            Boolean bool = (Boolean) jwp.l.d();
            boolean zBooleanValue = bool.booleanValue();
            Object[] objArr = (Object[]) this.e.invoke(null, view, this.h, bool);
            fxg fxgVar = this.d;
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
                if (zBooleanValue) {
                    String str = (String) objArr[2];
                    fxgVar.copyOnWrite();
                    fxl fxlVar4 = (fxl) fxgVar.instance;
                    str.getClass();
                    fxlVar4.c |= 268435456;
                    fxlVar4.aa = str;
                }
            }
        }
    }
}
