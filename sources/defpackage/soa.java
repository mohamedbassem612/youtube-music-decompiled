package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class soa extends aavv {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/ads/ping/DeviceAdvertiserIdMacroConverter");
    private static final Pattern b = Pattern.compile("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID_FOR_CONVERSION_TRACKING)(?:\\]|%5D|%5d)");
    private static final Pattern c = Pattern.compile("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID)(?:\\]|%5D|%5d)");
    private static final Pattern d = Pattern.compile("(?:\\[|%5B|%5b)(DEVICE_LAT)(?:\\]|%5D|%5d)");
    private Pattern e;
    private Pattern f;
    private Pattern g;
    private final addn h;

    public soa(addn addnVar) {
        this.h = addnVar;
    }

    @Override // defpackage.aavv
    public final Uri a(Uri uri) {
        taq.c();
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            return uri;
        }
        boolean zB = b(string);
        boolean zC = c(string);
        boolean zD = d(string);
        if (!zB && !zC && !zD) {
            return uri;
        }
        try {
            jwa jwaVarF = this.h.f();
            boolean z = jwaVarF.b;
            if (zD) {
                string = string.replaceAll("(?:\\[|%5B|%5b)(DEVICE_LAT)(?:\\]|%5D|%5d)", z ? "1" : "0");
            }
            String str = jwaVarF.a;
            if (str != null) {
                if (zB && !z) {
                    string = string.replaceAll("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID)(?:\\]|%5D|%5d)", str);
                }
                if (zC) {
                    string = string.replaceAll("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID_FOR_CONVERSION_TRACKING)(?:\\]|%5D|%5d)", str);
                }
            }
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/ads/ping/DeviceAdvertiserIdMacroConverter", "convertMacro", (char) 164, "DeviceAdvertiserIdMacroConverter.java")).t("Failed to get advertising id");
            string = string;
        }
        try {
            return tyu.c(string);
        } catch (MalformedURLException unused) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/ads/ping/DeviceAdvertiserIdMacroConverter", "maybeConvertUri", 131, "DeviceAdvertiserIdMacroConverter.java")).w("Failed macro substitution for URI: %s", uri);
            return uri;
        }
    }

    public final boolean b(String str) {
        Pattern pattern = this.e;
        if (pattern == null) {
            pattern = c;
            this.e = pattern;
        }
        Matcher matcher = pattern.matcher(str);
        return matcher.find() && matcher.groupCount() == 1;
    }

    public final boolean c(String str) {
        Pattern pattern = this.g;
        if (pattern == null) {
            pattern = b;
            this.g = pattern;
        }
        Matcher matcher = pattern.matcher(str);
        return matcher.find() && matcher.groupCount() == 1;
    }

    public final boolean d(String str) {
        Pattern pattern = this.f;
        if (pattern == null) {
            pattern = d;
            this.f = pattern;
        }
        Matcher matcher = pattern.matcher(str);
        return matcher.find() && matcher.groupCount() == 1;
    }
}
