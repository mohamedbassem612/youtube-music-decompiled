package com.google.vr.vrcore.base.api;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import app.rive.semantics.SemanticState;
import defpackage.auke;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class VrCoreUtils {
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:22:0x006c->B:41:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r6.getPackageManager().getApplicationInfo("com.google.vr.vrcore", app.rive.semantics.SemanticState.Multiline).enabled != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r6) {
        /*
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r1 = "com.google.vr.vrcore"
            boolean r0 = r1.equals(r0)
            r2 = 0
            if (r0 != 0) goto L94
            r0 = 1
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            boolean r3 = r3.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            if (r3 == 0) goto L45
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            r4 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            android.content.pm.Signature[] r4 = new android.content.pm.Signature[r0]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            android.content.pm.Signature r5 = defpackage.aukd.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            r4[r2] = r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            boolean r4 = defpackage.aukd.a(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            if (r4 != 0) goto L94
            boolean r4 = internal.org.jni_zero.CommonApis.t(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            if (r4 == 0) goto L42
            android.content.pm.Signature[] r4 = new android.content.pm.Signature[r0]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            android.content.pm.Signature r5 = defpackage.aukd.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            r4[r2] = r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            boolean r6 = defpackage.aukd.a(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            if (r6 != 0) goto L94
        L42:
            r2 = 9
            goto L94
        L45:
            r2 = 2
            goto L94
        L47:
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch: java.lang.RuntimeException -> L54
            android.content.pm.PackageInstaller r2 = r2.getPackageInstaller()     // Catch: java.lang.RuntimeException -> L54
            java.util.List r2 = r2.getAllSessions()     // Catch: java.lang.RuntimeException -> L54
            goto L65
        L54:
            r2 = move-exception
            java.lang.String r3 = "Failure querying package installer sessions: "
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "VrCoreUtils"
            android.util.Log.w(r3, r2)
            r2 = 0
        L65:
            r3 = 3
            if (r2 == 0) goto L83
            java.util.Iterator r2 = r2.iterator()
        L6c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r2.next()
            android.content.pm.PackageInstaller$SessionInfo r4 = (android.content.pm.PackageInstaller.SessionInfo) r4
            java.lang.String r4 = r4.getAppPackageName()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L6c
            goto L91
        L83:
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            r2 = 8192(0x2000, float:1.148E-41)
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L93
            boolean r6 = r6.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L93
            if (r6 == 0) goto L93
        L91:
            r2 = r3
            goto L94
        L93:
            r2 = r0
        L94:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.vrcore.base.api.VrCoreUtils.a(android.content.Context):int");
    }

    public static int getVrCoreClientApiVersion(Context context) {
        int iA = a(context);
        if (iA != 0) {
            throw new auke(iA);
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", SemanticState.Focused);
            if (applicationInfo.metaData != null) {
                return applicationInfo.metaData.getInt("com.google.vr.vrcore.ClientApiVersion", 0);
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            throw new auke(1);
        }
    }
}
