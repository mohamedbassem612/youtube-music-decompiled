package defpackage;

import android.app.Dialog;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class wyu extends bp {
    public mbc k;
    public tun l;
    private boolean m;

    @Override // defpackage.bp, defpackage.cc
    public void onStart() {
        super.onStart();
        if (this.m) {
            return;
        }
        Dialog dialog = this.f;
        if (dialog != null) {
            Window window = dialog.getWindow();
            mbc mbcVar = this.k;
            tun tunVar = null;
            if (mbcVar == null) {
                awrc.b("clock");
                mbcVar = null;
            }
            tun tunVar2 = this.l;
            if (tunVar2 == null) {
                awrc.b("userPresenceTracker");
            } else {
                tunVar = tunVar2;
            }
            yno.dz(window, mbcVar, tunVar);
        }
        this.m = true;
    }
}
