package defpackage;

import android.webkit.JavascriptInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ydm {
    public final /* synthetic */ Object a;

    public /* synthetic */ ydm(Object obj) {
        this.a = obj;
    }

    @JavascriptInterface
    public void consentFlowCompleted(boolean z) {
        ajwo ajwoVar;
        ajwo ajwoVar2;
        ydn ydnVar = (ydn) this.a;
        ydnVar.b = true;
        ydnVar.e.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(z ? xhb.b(36385) : xhb.b(36386)), yno.cO(yno.cP(ydnVar.m), ydnVar.q));
        if (z) {
            apzk apzkVar = ydnVar.n;
            if (apzkVar == null || (apzkVar.c & 16) == 0) {
                ajwoVar2 = null;
            } else {
                ajwoVar2 = apzkVar.d;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
            }
            if (ydnVar.n == null) {
                ydnVar.o.a(ydnVar.k, "completed");
            }
            ydnVar.a(0, null, ajwoVar2);
            return;
        }
        apzk apzkVar2 = ydnVar.n;
        if (apzkVar2 == null || (apzkVar2.c & 32) == 0) {
            ajwoVar = null;
        } else {
            ajwoVar = apzkVar2.e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        }
        if (ydnVar.n == null) {
            ydnVar.o.a(ydnVar.k, "denied");
        }
        ydnVar.a(1, null, ajwoVar);
    }

    public ydm(ydn ydnVar) {
        this.a = ydnVar;
    }
}
