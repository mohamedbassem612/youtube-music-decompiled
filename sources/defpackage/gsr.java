package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gsr extends gut implements sxt {
    private final Activity a;
    private final vxe b;
    private final vyo c;
    private ajew d;
    private Object e;
    private final mgk f;
    private final ovo g;
    private final abuz h;

    public gsr(abuz abuzVar, Activity activity, ovo ovoVar, vxe vxeVar, mgk mgkVar, vyo vyoVar) {
        this.h = abuzVar;
        activity.getClass();
        this.a = activity;
        ovoVar.getClass();
        this.g = ovoVar;
        this.b = vxeVar;
        this.c = vyoVar;
        this.f = mgkVar;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:118:0x030e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        String str;
        ?? Ordinal;
        int i;
        String str2;
        String str3;
        ?? r27;
        String str4 = "com.google.android.finsky.transparentmainactivity.TransparentMainActivity";
        String str5 = "com.google.android.finsky.activities.MarketDeepLinkHandlerActivity";
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        this.e = objS;
        abuz abuzVar = this.h;
        if (abuzVar != null) {
            abuzVar.o(objS, ajbf.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL);
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajex.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajex.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        ajew ajewVar = (ajew) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        this.d = ajewVar;
        Activity activity = this.a;
        String strConcat = ajewVar.b;
        String str6 = ajewVar.c;
        strConcat = ajewVar.d;
        String packageName = ajewVar.e;
        boolean z = ajewVar.f;
        vyo vyoVar = this.c;
        boolean z2 = afxw.e(vyoVar).Y;
        int i2 = afxw.e(vyoVar).Z;
        ovo ovoVar = this.g;
        ?? r12 = ovoVar.b;
        if (r12 == 0 || r12.isEmpty()) {
            ovoVar.b = new ArrayList();
            aizq aizqVarD = ovoVar.d();
            if (aizqVarD != null) {
                for (ajcl ajclVar : aizqVarD.c) {
                    ?? r14 = ovoVar.b;
                    ajck ajckVarA = ajck.a(ajclVar.b);
                    if (ajckVarA == null) {
                        ajckVarA = ajck.ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_UNKNOWN;
                    }
                    r14.add(ajckVarA);
                }
            }
        }
        ?? r11 = ovoVar.b;
        mgk mgkVar = this.f;
        agrf agrfVar = sxy.a;
        if (packageName == null || packageName.isEmpty()) {
            packageName = activity.getApplication().getPackageName();
        }
        String str7 = "market://details?id=";
        if (strConcat == null || strConcat.isEmpty()) {
            if (z2) {
                ((agrc) ((agrc) ((agrc) sxy.a.c()).h(i2)).k("com/google/android/libraries/youtube/common/async/ExternalIntents", "createDeepLinkUrl", 350, "ExternalIntents.java")).w("Android intent handling fallback createDeepLinkUrl for app id: %s", strConcat);
            }
            strConcat = "market://details?id=".concat(String.valueOf(strConcat));
            if (str6 != null) {
                strConcat = strConcat + "&referrer=" + str6;
            }
        } else {
            i2 = i2;
            z2 = z2;
        }
        String str8 = "referrer";
        String str9 = "docid";
        String str10 = "com.android.finsky.APP_DETAILS_DIALOG";
        String str11 = "com/google/android/libraries/youtube/common/async/ExternalIntents";
        String str12 = "installApp";
        if (r11 == 0 || r11.isEmpty()) {
            int i3 = i2;
            strConcat.getClass();
            if (z2) {
                ((agrc) ((agrc) ((agrc) sxy.a.c()).h(i3)).k(str11, str12, 195, "ExternalIntents.java")).w("Android intent handling fallback triggered for app id: %s", strConcat);
            }
            try {
                if (activity.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode >= 80300024) {
                    Intent intent = new Intent("com.android.finsky.APP_DETAILS_DIALOG");
                    intent.putExtra("docid", strConcat);
                    if (str6 != null) {
                        intent.putExtra("referrer", str6);
                    }
                    intent.setPackage("com.android.vending");
                    sxy.g(activity, intent, mgkVar, this);
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            sxy.d(activity, strConcat, str6);
            return;
        }
        ?? r13 = r11;
        ?? r15 = str10;
        for (ajck ajckVar : r11) {
            String str13 = str6;
            try {
                Ordinal = ajckVar.ordinal();
                try {
                    if (Ordinal != 0) {
                        String str14 = str8;
                        if (Ordinal != 1) {
                            if (Ordinal == 2) {
                                str2 = strConcat;
                                strConcat = strConcat;
                                str3 = str9;
                                str = str7;
                                r27 = r15;
                                try {
                                    if (r13.contains(ajck.ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_FINSKY) && activity.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode >= 80300024) {
                                        Ordinal = r27;
                                        try {
                                            Intent intent2 = new Intent((String) Ordinal);
                                            strConcat = str2;
                                            str8 = str3;
                                            try {
                                                intent2.putExtra(str8, strConcat);
                                                if (str13 != null) {
                                                    intent2.putExtra(str14, str13);
                                                }
                                                intent2.setPackage("com.android.vending");
                                                sxy.g(activity, intent2, mgkVar, this);
                                                return;
                                            } catch (Exception unused2) {
                                            }
                                        } catch (Exception unused3) {
                                            str9 = str13;
                                            str7 = str14;
                                            strConcat = str2;
                                            str8 = str3;
                                            if (z2) {
                                                i = i2;
                                                String str15 = str4;
                                                String str16 = str11;
                                                String str17 = str12;
                                                ((agrc) ((agrc) ((agrc) sxy.a.c()).h(i)).k(str16, str17, 325, "ExternalIntents.java")).A("Android intent handling failure for app id: %s, intentType: %s", strConcat, ajckVar.e);
                                                str5 = str5;
                                                r13 = r13;
                                                z = z;
                                                str12 = str17;
                                                str11 = str16;
                                                str4 = str15;
                                            } else {
                                                i = i2;
                                                str4 = str4;
                                            }
                                            packageName = packageName;
                                            i2 = i;
                                            r15 = Ordinal;
                                            str6 = str9;
                                            str9 = str8;
                                            str8 = str7;
                                            str7 = str;
                                            r13 = r13;
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException | Exception unused4) {
                                }
                                str9 = str13;
                                str7 = str14;
                                strConcat = str2;
                                str8 = str3;
                                Ordinal = r27;
                            } else if (Ordinal != 3) {
                                strConcat = strConcat;
                                str8 = str9;
                                str = str7;
                                Ordinal = r15;
                                str9 = str13;
                                str7 = str14;
                                strConcat = strConcat;
                            } else {
                                try {
                                    try {
                                        if (r13.contains(ajck.ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_ALLEY_OOP) && activity.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode >= 80710000 && packageName != null) {
                                            strConcat = strConcat;
                                            if (strConcat.startsWith(str7)) {
                                                str = str7;
                                                try {
                                                    Intent intent3 = new Intent("android.intent.action.VIEW");
                                                    intent3.setPackage("com.android.vending");
                                                    str2 = strConcat;
                                                    try {
                                                        intent3.setData(Uri.parse(strConcat));
                                                        intent3.putExtra("overlay", z);
                                                        intent3.putExtra("callerId", packageName);
                                                        str3 = str9;
                                                        try {
                                                            if (activity.getPackageManager().getComponentEnabledSetting(new ComponentName("com.android.vending", str5)) != 2) {
                                                                intent3.setComponent(new ComponentName("com.android.vending", str5));
                                                                intent3.setAction("android.intent.action.VIEW");
                                                                intent3.addCategory("android.intent.category.DEFAULT");
                                                                if (intent3.resolveActivity(activity.getPackageManager()) != null) {
                                                                    sxy.g(activity, intent3, mgkVar, this);
                                                                    return;
                                                                }
                                                            } else if (activity.getPackageManager().getComponentEnabledSetting(new ComponentName("com.android.vending", str4)) != 2) {
                                                                intent3.setComponent(new ComponentName("com.android.vending", str4));
                                                                intent3.setAction("android.intent.action.VIEW");
                                                                intent3.addCategory("android.intent.category.DEFAULT");
                                                                if (intent3.resolveActivity(activity.getPackageManager()) != null) {
                                                                    sxy.g(activity, intent3, mgkVar, this);
                                                                    return;
                                                                }
                                                            }
                                                        } catch (Exception unused5) {
                                                            Ordinal = r15;
                                                            str9 = str13;
                                                            str7 = str14;
                                                            strConcat = str2;
                                                            str8 = str3;
                                                            if (z2) {
                                                                i = i2;
                                                                String str18 = str4;
                                                                String str19 = str11;
                                                                String str110 = str12;
                                                                ((agrc) ((agrc) ((agrc) sxy.a.c()).h(i)).k(str19, str110, 325, "ExternalIntents.java")).A("Android intent handling failure for app id: %s, intentType: %s", strConcat, ajckVar.e);
                                                                str5 = str5;
                                                                r13 = r13;
                                                                z = z;
                                                                str12 = str110;
                                                                str11 = str19;
                                                                str4 = str18;
                                                            } else {
                                                                i = i2;
                                                                str4 = str4;
                                                            }
                                                            packageName = packageName;
                                                            i2 = i;
                                                            r15 = Ordinal;
                                                            str6 = str9;
                                                            str9 = str8;
                                                            str8 = str7;
                                                            str7 = str;
                                                            r13 = r13;
                                                        }
                                                    } catch (Exception unused6) {
                                                        str8 = str9;
                                                        Ordinal = r15;
                                                        str9 = str13;
                                                        str7 = str14;
                                                        strConcat = str2;
                                                    }
                                                } catch (Exception unused7) {
                                                    strConcat = strConcat;
                                                    str8 = str9;
                                                    Ordinal = r15;
                                                    str9 = str13;
                                                    str7 = str14;
                                                }
                                            }
                                            Intent intent4 = new Intent("android.intent.action.VIEW");
                                            intent4.setPackage("com.android.vending");
                                            intent4.setData(Uri.parse(strConcat));
                                            intent4.putExtra("overlay", z);
                                            intent4.putExtra("callerId", packageName);
                                            sxy.g(activity, intent4, mgkVar, this);
                                            return;
                                        }
                                        strConcat = strConcat;
                                        str = str7;
                                    } catch (PackageManager.NameNotFoundException unused8) {
                                        str2 = strConcat;
                                        strConcat = strConcat;
                                        str3 = str9;
                                        str = str7;
                                        r27 = r15;
                                        str9 = str13;
                                        str7 = str14;
                                        strConcat = str2;
                                        str8 = str3;
                                        Ordinal = r27;
                                    }
                                } catch (Exception unused9) {
                                }
                                strConcat = strConcat;
                                str8 = str9;
                                Ordinal = r15;
                                str9 = str13;
                                str7 = str14;
                            }
                            if (z2) {
                                i = i2;
                                String str111 = str4;
                                String str112 = str11;
                                String str113 = str12;
                                ((agrc) ((agrc) ((agrc) sxy.a.c()).h(i)).k(str112, str113, 325, "ExternalIntents.java")).A("Android intent handling failure for app id: %s, intentType: %s", strConcat, ajckVar.e);
                                str5 = str5;
                                r13 = r13;
                                z = z;
                                str12 = str113;
                                str11 = str112;
                                str4 = str111;
                            } else {
                                i = i2;
                                str4 = str4;
                            }
                            packageName = packageName;
                            i2 = i;
                            r15 = Ordinal;
                            str6 = str9;
                            str9 = str8;
                            str8 = str7;
                            str7 = str;
                            r13 = r13;
                        }
                    }
                    sxy.d(activity, strConcat, str13);
                    return;
                } catch (Exception unused10) {
                }
            } catch (Exception unused11) {
                strConcat = strConcat;
                str = str7;
                Ordinal = r15;
                strConcat = strConcat;
                str7 = str8;
                str8 = str9;
                str9 = str13;
            }
        }
    }

    @Override // defpackage.sxt
    public final boolean d(int i, int i2, Intent intent) {
        ajew ajewVar;
        if (i != 907) {
            return false;
        }
        if (i2 == 0 && (ajewVar = this.d) != null) {
            this.b.e(ajewVar.g, this.e);
        }
        return true;
    }
}
