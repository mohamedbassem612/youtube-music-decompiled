package defpackage;

import android.app.Activity$ScreenCaptureCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class inj implements Activity$ScreenCaptureCallback {
    private final Function0 a;
    private final xeu b;

    public inj(Function0 function0, xeu xeuVar) {
        this.a = function0;
        this.b = xeuVar;
    }

    public final void onScreenCaptured() {
        int i;
        int iAY;
        aclj acljVar = (aclj) this.a.invoke();
        ajuj ajujVar = acljVar.a;
        if (ajujVar != null && (i = ajujVar.b) == 1 && i == 1 && ((iAY = a.aY(((Integer) ajujVar.c).intValue())) == 0 || iAY == 1)) {
            aiif.a();
        }
        int i2 = acljVar.b - 1;
        aihf aihfVarCreateBuilder = apcw.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        apcw apcwVar = (apcw) aihfVarCreateBuilder.instance;
        apcwVar.c = i2;
        apcwVar.b |= 1;
        if (ajujVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            apcw apcwVar2 = (apcw) aihfVarCreateBuilder.instance;
            apcwVar2.d = ajujVar;
            apcwVar2.b |= 2;
        }
        aihfVarCreateBuilder.getClass();
        xff xffVarA = this.b.a(aihfVarCreateBuilder, alot.RECAP_SCREENSHOT_EVENT);
        ztf ztfVar = xffVarA.k.e;
        xffVarA.l = ztfVar.a();
        ztfVar.k(xffVarA);
    }
}
