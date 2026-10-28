package com.google.cardboard.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import app.rive.semantics.SemanticState;
import defpackage.kmm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class PackageUtils {
    private PackageUtils() {
    }

    public static boolean isGooglePackage(Context context, String str) {
        if (context == null || str == null) {
            return false;
        }
        return kmm.a(context).b(str);
    }

    public static boolean isSystemPackage(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            int i = applicationInfo != null ? applicationInfo.flags : 0;
            return ((i & 1) == 0 && (i & SemanticState.Focused) == 0) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
