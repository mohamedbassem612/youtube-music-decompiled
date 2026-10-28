package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class qk extends qj {
    @Override // defpackage.qi, defpackage.qo
    public void a(qx qxVar, qx qxVar2, Window window, View view, boolean z, boolean z2) {
        azz.c(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        zf zfVar = new zf(window, view);
        zfVar.d(!z);
        zfVar.c(!z2);
    }
}
