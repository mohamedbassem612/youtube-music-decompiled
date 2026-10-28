package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import defpackage.a;
import defpackage.axjk;
import internal.J.N;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ApkInfo {
    private static volatile ApkInfo a;
    private static final Object b = new Object();
    private static String c;
    private final IApkInfo d;

    private ApkInfo() {
        Long lValueOf;
        String strA;
        String strA2;
        String strA3;
        String strA4;
        String str;
        String strCl;
        String[] packagesForUid;
        IApkInfo iApkInfo = new IApkInfo();
        this.d = iApkInfo;
        Context context = JniAndroid.a;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        CommandLine commandLine = CommandLine.a;
        PackageInfo packageInfo = null;
        if (commandLine.b != 0) {
            strA = commandLine.a("host-package-name");
            strA2 = commandLine.a("host-package-label");
            strA3 = commandLine.a("package-name");
            strA4 = commandLine.a("package-version-name");
            String strA5 = commandLine.a("host-version-code");
            lValueOf = strA5 != null ? Long.valueOf(Long.parseLong(strA5)) : null;
        } else {
            lValueOf = null;
            strA = null;
            strA2 = null;
            strA3 = null;
            strA4 = null;
        }
        boolean z = (strA == null || strA2 == null || lValueOf == null || strA3 == null || strA4 == null) ? false : true;
        iApkInfo.e = (applicationInfo.flags & 2) != 0;
        iApkInfo.f = 1 == (applicationInfo.flags & 1);
        if (z) {
            iApkInfo.b = strA;
            iApkInfo.a = strA2;
            iApkInfo.c = String.valueOf(lValueOf);
            iApkInfo.i = strA4;
            iApkInfo.h = iApkInfo.c;
            iApkInfo.g = strA3;
        } else {
            if (!JniAndroid.a() || (packagesForUid = packageManager.getPackagesForUid(Process.myUid() - 10000)) == null || packagesForUid.length <= 0) {
                str = packageName;
                strCl = str;
            } else {
                str = packagesForUid[0];
                strCl = a.cl(str, (byte) 58, packageName);
            }
            iApkInfo.b = strCl;
            iApkInfo.a = b(packageManager.getApplicationLabel(applicationInfo));
            int i = axjk.a;
            try {
                packageInfo = JniAndroid.a.getPackageManager().getPackageInfo(str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            IApkInfo iApkInfo2 = this.d;
            iApkInfo2.g = packageName;
            iApkInfo2.h = String.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
            IApkInfo iApkInfo3 = this.d;
            iApkInfo3.c = iApkInfo3.h;
            iApkInfo3.i = b(packageInfo.versionName);
            packageName = str;
        }
        this.d.d = b(packageManager.getInstallerPackageName(packageName));
        IApkInfo iApkInfo4 = this.d;
        iApkInfo4.j = "Not Enabled";
        iApkInfo4.k = applicationInfo.targetSdkVersion;
    }

    public static ApkInfo a() {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = new ApkInfo();
                }
            }
        }
        return a;
    }

    private static String b(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    public static String getHostSigningCertSha256() {
        String strB;
        synchronized (b) {
            strB = c;
            if (strB == null) {
                strB = axjk.b(a().d.b);
                if (strB == null) {
                    strB = "";
                }
                c = strB;
            }
        }
        return strB;
    }

    private static void nativeReadyForFields() {
        IApkInfo iApkInfo = a().d;
        N.MOh5qbSu(iApkInfo.b, iApkInfo.c, iApkInfo.a, iApkInfo.h, iApkInfo.i, iApkInfo.g, iApkInfo.j, iApkInfo.d, iApkInfo.e, iApkInfo.f, iApkInfo.k);
    }
}
