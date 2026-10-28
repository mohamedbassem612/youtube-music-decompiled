package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgi {
    public final Map a;

    public lgi(Map map) {
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }

    public final int a() {
        try {
            String str = (String) this.a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle b() {
        Bundle bundle;
        Map map = this.a;
        if ("1".equals(map.get("gdprApplies")) && "1".equals(map.get("EnableAdvertiserConsentMode"))) {
            String str = "denied";
            if (map.get("Version") == null) {
                if (!"1".equals(map.get("GoogleConsent"))) {
                    return Bundle.EMPTY;
                }
                int iA = a();
                if (iA < 0) {
                    return Bundle.EMPTY;
                }
                String str2 = (String) map.get("PurposeConsents");
                if (TextUtils.isEmpty(str2)) {
                    return Bundle.EMPTY;
                }
                bundle = new Bundle();
                if (str2.length() > 0) {
                    bundle.putString(lgg.AD_STORAGE.e, str2.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str2.length() > 3) {
                    bundle.putString(lgg.AD_PERSONALIZATION.e, (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str2.length() > 6 && iA >= 4) {
                    String str3 = lgg.AD_USER_DATA.e;
                    if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                        str = "granted";
                    }
                    bundle.putString(str3, str);
                }
            } else if (a() >= 0) {
                bundle = new Bundle();
                bundle.putString(lgg.AD_STORAGE.e, true != Objects.equals(map.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle.putString(lgg.AD_PERSONALIZATION.e, (Objects.equals(map.get("AuthorizePurpose3"), "1") && Objects.equals(map.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (a() >= 4) {
                    String str4 = lgg.AD_USER_DATA.e;
                    if (Objects.equals(map.get("AuthorizePurpose1"), "1") && Objects.equals(map.get("AuthorizePurpose7"), "1")) {
                        str = "granted";
                    }
                    bundle.putString(str4, str);
                }
            }
            return bundle;
        }
        return Bundle.EMPTY;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        agke agkeVar = lgk.a;
        int i = ((agpi) agkeVar).d;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) agkeVar.get(i2);
            Map map = this.a;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(';');
                }
                sb.append(str);
                sb.append('=');
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lgi) {
            return c().equalsIgnoreCase(((lgi) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final String toString() {
        return c();
    }
}
