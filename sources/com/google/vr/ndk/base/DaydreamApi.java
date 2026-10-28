package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.util.Log;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import defpackage.a;
import defpackage.aujn;
import defpackage.aujo;
import defpackage.aujp;
import defpackage.aujr;
import defpackage.aujs;
import defpackage.auke;
import defpackage.aukf;
import defpackage.auki;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class DaydreamApi implements AutoCloseable {
    private static volatile Boolean g;
    public final Context a;
    public int c;
    public auki e;
    public aukf f;
    private boolean h;
    public final ArrayList b = new ArrayList();
    private final AtomicInteger i = new AtomicInteger();
    public final ServiceConnection d = new aujn(this);

    protected DaydreamApi(Context context) {
        this.a = context;
    }

    private final void b(Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            throw new ActivityNotFoundException("No activity is available to handle intent: ".concat(intent.toString()));
        }
    }

    private final void c() {
        if (this.h) {
            throw new IllegalStateException("DaydreamApi object is closed and can no longer be used.");
        }
    }

    public static DaydreamApi create(Context context) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("DaydreamApi must only be used from the main thread.");
        }
        if (!context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return null;
        }
        DaydreamApi daydreamApi = new DaydreamApi(context);
        try {
            Context applicationContext = daydreamApi.a;
            int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(applicationContext);
            daydreamApi.c = vrCoreClientApiVersion;
            if (vrCoreClientApiVersion < 8) {
                Log.e("DaydreamApi", a.bP(vrCoreClientApiVersion, "VrCore out of date, current version: ", ", required version: 8"));
            } else {
                Intent intent = new Intent("com.google.vr.vrcore.BIND_SDK_SERVICE");
                intent.setPackage("com.google.vr.vrcore");
                if (applicationContext.getApplicationContext() != null) {
                    applicationContext = applicationContext.getApplicationContext();
                }
                if (applicationContext.bindService(intent, daydreamApi.d, 1)) {
                    return daydreamApi;
                }
                Log.e("DaydreamApi", "Unable to bind to VrCoreSdkService");
            }
        } catch (auke e) {
            Log.e("DaydreamApi", "VrCore not available: ".concat(e.toString()));
        }
        Log.w("DaydreamApi", "Failed to initialize DaydreamApi object.");
        return null;
    }

    public static Intent createVrIntent(ComponentName componentName) {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        setupVrIntent(intent);
        return intent;
    }

    private final void d(PendingIntent pendingIntent, ComponentName componentName) {
        a(new aujs(this, pendingIntent, componentName, 1));
    }

    public static Intent setupVrIntent(Intent intent) {
        intent.addCategory("com.google.intent.category.DAYDREAM");
        intent.addFlags(335609856);
        return intent;
    }

    protected final void a(Runnable runnable) {
        if (this.e != null) {
            runnable.run();
        } else {
            this.b.add(runnable);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        a(new aujp(this, 1));
    }

    public void exitFromVr(Activity activity, int i, Intent intent) {
        c();
        if (intent == null) {
            intent = new Intent();
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(i, intent, 1073741824);
        a(new aujs(this, new aujp(pendingIntentCreatePendingResult, 2), pendingIntentCreatePendingResult, 0));
    }

    public void launchInVr(Intent intent) {
        c();
        if (intent == null) {
            throw new IllegalArgumentException("Null argument 'intent' passed to launchInVr");
        }
        b(intent);
        d(PendingIntent.getActivity(this.a, this.i.incrementAndGet(), intent, 1207959552), intent.getComponent());
    }

    public void launchInVrForResult(Activity activity, PendingIntent pendingIntent, int i) {
        c();
        a(new aujo(this, new aujr(activity, pendingIntent, i)));
    }

    public void launchVrHomescreen() {
        c();
        a(new aujp(this, 0));
    }

    public void launchInVr(ComponentName componentName) {
        c();
        if (componentName != null) {
            Intent intentCreateVrIntent = createVrIntent(componentName);
            b(intentCreateVrIntent);
            d(PendingIntent.getActivity(this.a, 0, intentCreateVrIntent, 1073741824), intentCreateVrIntent.getComponent());
            return;
        }
        throw new IllegalArgumentException("Null argument 'componentName' passed to launchInVr");
    }

    public void launchInVr(PendingIntent pendingIntent) {
        c();
        d(pendingIntent, null);
    }
}
