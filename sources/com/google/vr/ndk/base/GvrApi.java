package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;
import defpackage.aujm;
import defpackage.aujt;
import defpackage.aujv;
import defpackage.aujw;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class GvrApi {

    /* JADX INFO: compiled from: PG */
    interface IdleListener {
        void onIdleChanged(boolean z);
    }

    /* JADX INFO: compiled from: PG */
    public interface PoseTracker {
        void getHeadPoseInStartSpace(float[] fArr, long j);
    }

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            aujt.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static native long nativeGetUserPrefs(long j);

    private static native boolean nativeIsFeatureSupported(long j, int i);

    public static native boolean nativeUserPrefsIsFeatureEnabled(long j, int i);

    private static void requestFeatures(Context context, long j, int[] iArr, int[] iArr2, PendingIntent pendingIntent) {
        aujv[] aujvVarArrA = aujv.a(iArr);
        aujv[] aujvVarArrA2 = aujv.a(iArr2);
        aujw aujwVar = new aujw(nativeGetUserPrefs(j));
        Intent flags = new Intent("com.google.intent.action.vr.REQUEST_FEATURE").setComponent(aujm.a).setFlags(268435456);
        ArrayList arrayList = new ArrayList();
        for (aujv aujvVar : aujvVarArrA) {
            if (nativeIsFeatureSupported(j, aujvVar.c) && !aujwVar.a(aujvVar)) {
                arrayList.add(aujvVar.d);
            }
        }
        if (!arrayList.isEmpty()) {
            flags.putExtra("required_features", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        ArrayList arrayList2 = new ArrayList();
        for (aujv aujvVar2 : aujvVarArrA2) {
            if (nativeIsFeatureSupported(j, aujvVar2.c) && !aujwVar.a(aujvVar2)) {
                arrayList2.add(aujvVar2.d);
            }
        }
        if (!arrayList2.isEmpty()) {
            flags.putExtra("optional_features", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        if (flags.getExtras() != null) {
            flags.putExtra("pending_intent", pendingIntent);
            context.startActivity(flags);
        }
    }

    public long getNativeGvrContext() {
        throw null;
    }
}
