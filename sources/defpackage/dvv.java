package defpackage;

import android.content.pm.PackageInfo;
import android.webkit.WebView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dvv extends dve {
    public dvv() {
        super("USER_AGENT_METADATA_FORM_FACTORS", "USER_AGENT_METADATA_FORM_FACTORS");
    }

    @Override // defpackage.dvl
    public final boolean d() {
        if (super.d()) {
            return true;
        }
        if (dvy.d.d()) {
            int i = dva.a;
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                long jD = aty.d(currentWebViewPackage);
                if (jD >= 636700000 && jD < 808300000) {
                    return true;
                }
            }
        }
        return false;
    }
}
