package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class avg {
    public static int c(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new auy(context).c() ? 0 : -1;
    }

    public static ColorStateList d(Context context, int i) {
        return avt.a(context.getResources(), i, context.getTheme());
    }

    public static Executor e(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? context.getMainExecutor() : new wh(new Handler(context.getMainLooper()), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (defpackage.api.c(r6, r1, r2, r3, r4) != 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent f(android.content.Context r6, android.content.BroadcastReceiver r7, android.content.IntentFilter r8, java.lang.String r9, int r10) {
        /*
            r1 = r10 & 1
            if (r1 == 0) goto L14
            r1 = r10 & 4
            if (r1 != 0) goto Lc
            r1 = r10 | 2
            r5 = r1
            goto L15
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED"
            r0.<init>(r1)
            throw r0
        L14:
            r5 = r10
        L15:
            r1 = r5 & 4
            r2 = r5 & 2
            if (r2 != 0) goto L25
            if (r1 != 0) goto L27
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required"
            r0.<init>(r1)
            throw r0
        L25:
            if (r1 != 0) goto La3
        L27:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 >= r3) goto L99
            if (r1 == 0) goto L8d
            if (r9 != 0) goto L8d
            android.content.Context r1 = r6.getApplicationContext()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = android.os.Process.myPid()
            int r3 = android.os.Process.myUid()
            java.lang.String r4 = r6.getPackageName()
            java.lang.String r5 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            java.lang.String r1 = r1.concat(r5)
            int r2 = defpackage.api.c(r6, r1, r2, r3, r4)
            if (r2 == 0) goto L87
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L79
            java.lang.String r1 = defpackage.alj$$ExternalSyntheticApiModelOutline0.m(r6)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = android.os.Process.myPid()
            int r3 = android.os.Process.myUid()
            java.lang.String r4 = r6.getPackageName()
            java.lang.String r1 = r1.concat(r5)
            int r2 = defpackage.api.c(r6, r1, r2, r3, r4)
            if (r2 == 0) goto L87
        L79:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Permission "
            java.lang.String r3 = " is required by your application to receive broadcasts, please add it to your manifest"
            java.lang.String r1 = defpackage.a.bT(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L87:
            r2 = 0
            android.content.Intent r0 = r6.registerReceiver(r7, r8, r1, r2)
            goto La2
        L8d:
            r4 = 0
            r5 = r5 & 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            android.content.Intent r0 = defpackage.bd$$ExternalSyntheticApiModelOutline1.m(r0, r1, r2, r3, r4, r5)
            goto La2
        L99:
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            android.content.Intent r0 = defpackage.bd$$ExternalSyntheticApiModelOutline1.m(r0, r1, r2, r3, r4, r5)
        La2:
            return r0
        La3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avg.f(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, java.lang.String, int):android.content.Intent");
    }
}
