package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class qi extends qn {
    @Override // defpackage.qo
    public void a(qx qxVar, qx qxVar2, Window window, View view, boolean z, boolean z2) {
        azz.c(window, false);
        window.setStatusBarColor(qxVar.a(z));
        window.setNavigationBarColor(qxVar2.a(z2));
        zf zfVar = new zf(window, view);
        zfVar.d(!z);
        zfVar.c(!z2);
    }
}
