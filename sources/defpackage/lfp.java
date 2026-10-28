package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lfp extends lfk {
    final Random a;
    private Map b;
    private String c;

    public lfp(lfv lfvVar) {
        super(lfvVar);
        this.b = null;
        this.c = null;
        this.a = new Random();
    }

    public static final boolean d(String str) {
        String str2 = (String) lcl.t.b(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    private final String h(String str) {
        String strG = s().g(str);
        if (TextUtils.isEmpty(strG)) {
            return (String) lcl.r.b(null);
        }
        Uri uri = Uri.parse((String) lcl.r.b(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strG + '.' + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    final boolean a(String str) {
        o();
        return g(str).d == lho.SGTM_CLIENT;
    }

    final boolean c(String str) {
        o();
        String str2 = (String) lcl.u.b(null);
        if (TextUtils.isEmpty(str2)) {
            this.b = null;
            this.c = null;
            return false;
        }
        if (g(str).d != lho.SGTM_CLIENT) {
            return false;
        }
        if (!str2.equals(this.c)) {
            o();
            HashMap map = new HashMap();
            for (String str3 : str2.split(",")) {
                String[] strArrSplit = str3.split(":");
                if (strArrSplit.length != 2) {
                    aT().f.b("[sgtm] Invalid format in sgtmRealtimeAppsList", str3);
                } else {
                    String strTrim = strArrSplit[0].trim();
                    if (!strTrim.isEmpty()) {
                        try {
                            int i = Integer.parseInt(strArrSplit[1].trim());
                            if (i < 0 || i > 100) {
                                aT().f.b("[sgtm] Percentage out of range in sgtmRealtimeAppsList", str3);
                            } else {
                                map.put(strTrim, Integer.valueOf(i));
                            }
                        } catch (NumberFormatException unused) {
                            aT().f.b("[sgtm] Failed to parse realtime percentage for app", strTrim);
                        }
                    }
                }
            }
            this.b = map;
            this.c = str2;
        }
        Map map2 = this.b;
        if (map2 == null) {
            return false;
        }
        Integer num = (Integer) map2.get(str);
        if (num == null) {
            num = (Integer) this.b.get("*");
        }
        return num != null && this.a.nextInt(100) < num.intValue();
    }

    public final sdo e(String str, boolean z) {
        sdo sdoVar;
        String strG = s().g(str);
        if (TextUtils.isEmpty(strG)) {
            sdoVar = new sdo((String) lcl.s.b(null), z ? lho.GOOGLE_SIGNAL_PENDING : lho.GOOGLE_SIGNAL);
        } else {
            Uri uri = Uri.parse((String) lcl.s.b(null));
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.authority(strG + '.' + uri.getAuthority());
            sdoVar = new sdo(builderBuildUpon.build().toString(), z ? lho.GOOGLE_SIGNAL_PENDING : lho.GOOGLE_SIGNAL);
        }
        return sdoVar;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r2 < r4.d) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sdo g(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfp.g(java.lang.String):sdo");
    }
}
