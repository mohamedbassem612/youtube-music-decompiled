package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dvu extends dvk {
    private final Pattern b = Pattern.compile("\\A\\d+");

    @Override // defpackage.dvl
    public final boolean d() {
        boolean zD = super.d();
        if (!zD || Build.VERSION.SDK_INT >= 29) {
            return zD;
        }
        int i = dva.a;
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage != null) {
            Matcher matcher = this.b.matcher(currentWebViewPackage.versionName);
            if (matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
