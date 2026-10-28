package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lct extends lbc {
    public String a;
    public final long b;
    public List c;
    public String d;
    private String e;
    private String f;
    private int g;
    private String h;
    private long i;
    private final long j;
    private String k;
    private final String l;
    private int m;
    private String n;
    private String o;
    private long p;

    public lct(ldr ldrVar, long j, long j2, String str) {
        super(ldrVar);
        this.p = 0L;
        this.d = null;
        this.j = j;
        this.b = j2;
        this.l = str;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:44:0x0103  */
    /* JADX WARN: Code duplicated, block: B:45:0x010f  */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:51:0x013c A[Catch: IllegalStateException -> 0x016f, TryCatch #1 {IllegalStateException -> 0x016f, blocks: (B:49:0x0134, B:51:0x013c, B:53:0x014c, B:54:0x0150, B:55:0x0154, B:58:0x015b, B:60:0x015f), top: B:82:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x014c A[Catch: IllegalStateException -> 0x016f, TryCatch #1 {IllegalStateException -> 0x016f, blocks: (B:49:0x0134, B:51:0x013c, B:53:0x014c, B:54:0x0150, B:55:0x0154, B:58:0x015b, B:60:0x015f), top: B:82:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x015a  */
    /* JADX WARN: Code duplicated, block: B:60:0x015f A[Catch: IllegalStateException -> 0x016f, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x016f, blocks: (B:49:0x0134, B:51:0x013c, B:53:0x014c, B:54:0x0150, B:55:0x0154, B:58:0x015b, B:60:0x015f), top: B:82:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x018c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0192  */
    /* JADX WARN: Code duplicated, block: B:69:0x019e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bb A[EDGE_INSN: B:75:0x01bb->B:76:0x01bd BREAK  A[LOOP:0: B:70:0x01a2->B:90:?]] */
    /* JADX WARN: Code duplicated, block: B:77:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bb A[SYNTHETIC] */
    @Override // defpackage.lbc
    protected final void d() {
        String str;
        String string;
        ldr ldrVar;
        int iA;
        List listY;
        Iterator it;
        String strW;
        Context contextAS;
        String strU;
        aT().k.c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.b), Long.valueOf(this.j));
        String packageName = aS().getPackageName();
        PackageManager packageManager = aS().getPackageManager();
        int i = Integer.MIN_VALUE;
        String str2 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    aT().c.b("Error retrieving app installer package name. appId", lcz.a(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(aS().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str2 = packageInfo.versionName;
                            i = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str2;
                            str2 = string;
                            aT().c.c("Error retrieving package info. appId, appName", lcz.a(packageName), str2);
                            string = str2;
                            str2 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.e = packageName;
                this.h = installerPackageName;
                this.f = str2;
                this.g = i;
                this.a = string;
                this.i = 0L;
                ldrVar = this.t;
                iA = ldrVar.a();
                if (iA != 0) {
                    aT().k.a("App measurement collection enabled");
                } else if (iA != 1) {
                    aT().i.a("App measurement deactivated via the manifest");
                } else if (iA != 3) {
                    aT().i.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iA != 4) {
                    aT().i.a("App measurement disabled via the manifest");
                } else if (iA != 6) {
                    aT().h.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iA != 7) {
                    aT().i.a("App measurement disabled via the global data collection setting");
                } else if (iA != 8) {
                    aT().i.a("App measurement disabled");
                    aT().d.a("Invalid scion state in identity");
                } else {
                    aT().i.a("App measurement disabled due to denied storage consent");
                }
                this.n = "";
                strW = this.l;
                if (TextUtils.isEmpty(strW)) {
                    contextAS = aS();
                    strU = ldrVar.j;
                    Resources resources = contextAS.getResources();
                    if (TextUtils.isEmpty(strU)) {
                        strU = mda.u(contextAS);
                    }
                    strW = mda.w(resources, strU);
                }
                this.n = TextUtils.isEmpty(strW) ? "" : strW;
                if (iA == 0) {
                    aT().k.c("App measurement enabled for app package, google app id", this.e, this.n);
                }
                this.c = null;
                listY = G().y();
                if (listY == null) {
                    if (listY.isEmpty()) {
                        it = listY.iterator();
                        do {
                            if (it.hasNext()) {
                                this.c = listY;
                                break;
                            }
                        } while (L().ag("safelisted event", (String) it.next()));
                    } else {
                        aT().h.a("Safelisted event list is empty. Ignoring");
                    }
                } else {
                    this.c = listY;
                    break;
                }
                if (packageManager != null) {
                    this.m = ksy.c(aS()) ? 1 : 0;
                } else {
                    this.m = 0;
                }
            }
            aT().c.b("PackageManager is null, app identity information might be inaccurate. appId", lcz.a(packageName));
            strW = this.l;
            if (TextUtils.isEmpty(strW)) {
                contextAS = aS();
                strU = ldrVar.j;
                Resources resources2 = contextAS.getResources();
                if (TextUtils.isEmpty(strU)) {
                    strU = mda.u(contextAS);
                }
                strW = mda.w(resources2, strU);
            }
            this.n = TextUtils.isEmpty(strW) ? "" : strW;
            if (iA == 0) {
                aT().k.c("App measurement enabled for app package, google app id", this.e, this.n);
            }
        } catch (IllegalStateException e) {
            aT().c.c("Fetching Google App Id failed with exception. appId", lcz.a(packageName), e);
        }
        string = "Unknown";
        this.e = packageName;
        this.h = installerPackageName;
        this.f = str2;
        this.g = i;
        this.a = string;
        this.i = 0L;
        ldrVar = this.t;
        iA = ldrVar.a();
        if (iA != 0) {
            aT().k.a("App measurement collection enabled");
        } else if (iA != 1) {
            aT().i.a("App measurement deactivated via the manifest");
        } else if (iA != 3) {
            aT().i.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iA != 4) {
            aT().i.a("App measurement disabled via the manifest");
        } else if (iA != 6) {
            aT().h.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iA != 7) {
            aT().i.a("App measurement disabled via the global data collection setting");
        } else if (iA != 8) {
            aT().i.a("App measurement disabled");
            aT().d.a("Invalid scion state in identity");
        } else {
            aT().i.a("App measurement disabled due to denied storage consent");
        }
        this.n = "";
        this.c = null;
        listY = G().y();
        if (listY == null) {
            if (listY.isEmpty()) {
                it = listY.iterator();
                do {
                    if (it.hasNext()) {
                        this.c = listY;
                        break;
                    }
                } while (L().ag("safelisted event", (String) it.next()));
            } else {
                aT().h.a("Safelisted event list is empty. Ignoring");
            }
        } else {
            this.c = listY;
            break;
        }
        if (packageManager != null) {
            this.m = ksy.c(aS()) ? 1 : 0;
        } else {
            this.m = 0;
        }
    }

    @Override // defpackage.lbc
    protected final boolean f() {
        return true;
    }

    final int s() {
        a();
        return this.m;
    }

    final int t() {
        a();
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x016d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x0219  */
    /* JADX WARN: Code duplicated, block: B:80:0x023a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0241  */
    /* JADX WARN: Code duplicated, block: B:86:0x0256 A[Catch: NameNotFoundException -> 0x025d, TRY_LEAVE, TryCatch #5 {NameNotFoundException -> 0x025d, blocks: (B:84:0x0249, B:86:0x0256), top: B:115:0x0249 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0259  */
    /* JADX WARN: Code duplicated, block: B:97:0x029e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public final lbg u(String str) {
        boolean z;
        String str2;
        String str3;
        String str4;
        ldr ldrVar;
        long jA;
        long jMin;
        boolean z2;
        String strX;
        String str5;
        String str6;
        lga lgaVarL;
        String strV;
        int i;
        long j;
        ApplicationInfo applicationInfoF;
        int extensionVersion;
        o();
        String strV2 = v();
        String strW = w();
        a();
        String str7 = this.f;
        long jT = t();
        a();
        String str8 = this.h;
        if (str8 == null) {
            throw new NullPointerException("null reference");
        }
        a();
        o();
        long j2 = this.i;
        if (j2 == 0) {
            lga lgaVarL2 = this.t.l();
            Context contextAS = aS();
            String packageName = aS().getPackageName();
            lgaVarL2.o();
            kro.i(packageName);
            PackageManager packageManager = contextAS.getPackageManager();
            MessageDigest messageDigestA = lga.A();
            long jL = -1;
            if (messageDigestA == null) {
                lgaVarL2.aT().c.a("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (lgaVarL2.al(contextAS, packageName)) {
                            jL = 0;
                        } else {
                            PackageInfo packageInfoG = kte.a.a(contextAS).g(lgaVarL2.aS().getPackageName(), 64);
                            if (packageInfoG.signatures == null || packageInfoG.signatures.length <= 0) {
                                lgaVarL2.aT().f.a("Could not get signatures");
                            } else {
                                jL = lga.l(messageDigestA.digest(packageInfoG.signatures[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        lgaVarL2.aT().c.b("Package name not found", e);
                        j2 = 0;
                    }
                }
                j2 = 0;
                this.i = j2;
            }
            j2 = jL;
            this.i = j2;
        }
        ldr ldrVar2 = this.t;
        boolean zW = ldrVar2.w();
        boolean z3 = !J().m;
        o();
        if (ldrVar2.w()) {
            auts.a.io();
            z = false;
            if (G().F(null, lcl.aI)) {
                aT().k.a("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = aS().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            str2 = strV2;
                            try {
                                str3 = null;
                                try {
                                    Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, aS());
                                    if (objInvoke != null) {
                                        try {
                                            str4 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                        } catch (Exception unused) {
                                            aT().h.a("Failed to retrieve Firebase Instance Id");
                                            str4 = str3;
                                        }
                                    } else {
                                        str4 = str3;
                                    }
                                } catch (Exception unused2) {
                                    aT().g.a("Failed to obtain Firebase Analytics instance");
                                }
                            } catch (Exception unused3) {
                                str3 = null;
                                aT().g.a("Failed to obtain Firebase Analytics instance");
                                str4 = str3;
                                ldrVar = this.t;
                                jA = ldrVar.g().d.a();
                                if (jA == 0) {
                                    jMin = ldrVar.v;
                                } else {
                                    jMin = Math.min(ldrVar.v, jA);
                                }
                                int iS = s();
                                boolean zM = G().m();
                                ldl ldlVarJ = J();
                                ldlVarJ.o();
                                String str9 = str4;
                                boolean z4 = ldlVarJ.b().getBoolean("deferred_analytics_collection", z);
                                if (G().k("google_analytics_default_allow_ad_personalization_signals", true) != lge.GRANTED) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                long j3 = this.j;
                                Boolean boolValueOf = Boolean.valueOf(z2);
                                List list = this.c;
                                String strL = J().f().l();
                                strX = this.k;
                                if (strX == null) {
                                    strX = L().x();
                                    this.k = strX;
                                }
                                if (J().f().o()) {
                                    o();
                                    if (this.p == 0) {
                                        str5 = strX;
                                    } else {
                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.p;
                                        str5 = strX;
                                        if (this.o != null) {
                                            x();
                                        }
                                    }
                                    if (this.o == null) {
                                        x();
                                    }
                                    str6 = this.o;
                                } else {
                                    str5 = strX;
                                    str6 = null;
                                }
                                boolean zT = G().t();
                                lgaVarL = L();
                                String str10 = str6;
                                strV = v();
                                if (lgaVarL.aS().getPackageManager() == null) {
                                    j = 0;
                                } else {
                                    try {
                                        try {
                                            applicationInfoF = kte.a.a(lgaVarL.aS()).f(strV, 0);
                                            if (applicationInfoF != null) {
                                                i = applicationInfoF.targetSdkVersion;
                                            } else {
                                                i = 0;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            lgaVarL.aT().i.b("PackageManager failed to find running app: app_id", strV);
                                            i = 0;
                                        }
                                    } catch (PackageManager.NameNotFoundException unused5) {
                                    }
                                    j = i;
                                }
                                int i2 = J().f().d;
                                String str11 = J().d().c;
                                L();
                                long j4 = j;
                                if (Build.VERSION.SDK_INT >= 30) {
                                    extensionVersion = 0;
                                } else {
                                    extensionVersion = 0;
                                }
                                L().o();
                                String str12 = G().a;
                                String strValueOf = String.valueOf(lgh.a((lge) new kjc(G().k("google_analytics_default_allow_ad_personalization_signals", true)).a));
                                ldr ldrVar3 = this.t;
                                return new lbg(str2, strW, str7, jT, str8, 192008L, j2, str, zW, z3, str9, jMin, iS, zM, z4, boolValueOf, j3, list, strL, str5, str10, zT, j4, i2, str11, extensionVersion, 0L, str12, strValueOf, ldrVar3.v, n().u().m, ldrVar3.w, J().k.a(), m().v(), J().g.a());
                            }
                        } catch (Exception unused6) {
                            str2 = strV2;
                        }
                    }
                } catch (ClassNotFoundException unused7) {
                    str2 = strV2;
                    str3 = null;
                }
            }
            str2 = strV2;
            str4 = null;
        } else {
            str2 = strV2;
            str4 = null;
            z = false;
        }
        ldrVar = this.t;
        jA = ldrVar.g().d.a();
        if (jA == 0) {
            jMin = ldrVar.v;
        } else {
            jMin = Math.min(ldrVar.v, jA);
        }
        int iS2 = s();
        boolean zM2 = G().m();
        ldl ldlVarJ2 = J();
        ldlVarJ2.o();
        String str13 = str4;
        boolean z5 = ldlVarJ2.b().getBoolean("deferred_analytics_collection", z);
        if (G().k("google_analytics_default_allow_ad_personalization_signals", true) != lge.GRANTED) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j5 = this.j;
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        List list2 = this.c;
        String strL2 = J().f().l();
        strX = this.k;
        if (strX == null) {
            strX = L().x();
            this.k = strX;
        }
        if (J().f().o()) {
            str5 = strX;
            str6 = null;
        } else {
            o();
            if (this.p == 0) {
                str5 = strX;
            } else {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.p;
                str5 = strX;
                if (this.o != null && jCurrentTimeMillis2 > 86400000 && this.d == null) {
                    x();
                }
            }
            if (this.o == null) {
                x();
            }
            str6 = this.o;
        }
        boolean zT2 = G().t();
        lgaVarL = L();
        String str14 = str6;
        strV = v();
        if (lgaVarL.aS().getPackageManager() == null) {
            j = 0;
        } else {
            applicationInfoF = kte.a.a(lgaVarL.aS()).f(strV, 0);
            if (applicationInfoF != null) {
                i = applicationInfoF.targetSdkVersion;
            } else {
                i = 0;
            }
            j = i;
        }
        int i3 = J().f().d;
        String str15 = J().d().c;
        L();
        long j6 = j;
        if (Build.VERSION.SDK_INT >= 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            extensionVersion = 0;
        } else {
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
        }
        L().o();
        String str16 = G().a;
        String strValueOf2 = String.valueOf(lgh.a((lge) new kjc(G().k("google_analytics_default_allow_ad_personalization_signals", true)).a));
        ldr ldrVar4 = this.t;
        return new lbg(str2, strW, str7, jT, str8, 192008L, j2, str, zW, z3, str13, jMin, iS2, zM2, z5, boolValueOf2, j5, list2, strL2, str5, str14, zT2, j6, i3, str15, extensionVersion, 0L, str16, strValueOf2, ldrVar4.v, n().u().m, ldrVar4.w, J().k.a(), m().v(), J().g.a());
    }

    public final String v() {
        a();
        String str = this.e;
        if (str != null) {
            return str;
        }
        throw new NullPointerException("null reference");
    }

    final String w() {
        o();
        a();
        String str = this.n;
        if (str != null) {
            return str;
        }
        throw new NullPointerException("null reference");
    }

    public final void x() {
        String str;
        o();
        if (J().f().n(lgg.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            L().B().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            aT().j.a("Analytics Storage consent is not granted");
            str = null;
        }
        aT().j.a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.o = str;
        this.p = System.currentTimeMillis();
    }
}
