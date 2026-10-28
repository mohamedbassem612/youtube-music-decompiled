package com.google.research.xeno.effect;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import defpackage.adab;
import defpackage.agev;
import defpackage.ahub;
import defpackage.atso;
import defpackage.atsw;
import defpackage.atsz;
import defpackage.atta;
import defpackage.atte;
import defpackage.attg;
import defpackage.atvg;
import defpackage.atvh;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class Effect implements atvg {
    public static final ahub d = new ahub((int[]) null);
    public long a;
    public final Map b;
    public final ReentrantReadWriteLock c = new ReentrantReadWriteLock();

    /* JADX INFO: compiled from: PG */
    public interface NativeLoadCallback {
        void onCompletion(long j, String str);
    }

    public Effect(long j) {
        this.a = j;
        this.b = nativeGetControls(j);
        nativeGetAuxOutputStreamNames(j);
        String str = attg.a;
        try {
        } catch (Exception e) {
            Log.e(attg.a, "Exception occurred: ".concat(String.valueOf(e.getMessage())));
        }
        d.u(nativeGetEffectAddress(j), this);
    }

    public static void c(atta attaVar, Effect effect, String str, ExecutorService executorService) {
        adab adabVar = new adab(attaVar, effect, str, 18, (char[]) null);
        if (executorService != null) {
            executorService.execute(adabVar);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            adabVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(adabVar);
        }
    }

    public static void d(atso atsoVar, RemoteAssetManager remoteAssetManager, CapabilitiesManifest capabilitiesManifest, ExecutorService executorService, atta attaVar) {
        String str = remoteAssetManager.c;
        if (str == null) {
            c(attaVar, null, "RemoteAssetManager sandbox failed to initialize", executorService);
            return;
        }
        if (capabilitiesManifest == null) {
            capabilitiesManifest = new CapabilitiesManifest(CapabilitiesManifest.nativeLoadDefaultCapabilitiesManifest());
        }
        remoteAssetManager.b(new atsz(attaVar, executorService, capabilitiesManifest, atsoVar, str));
    }

    public static void f(atte atteVar, RemoteAssetManager remoteAssetManager, atta attaVar) {
        String str = remoteAssetManager.c;
        if (str == null) {
            c(attaVar, null, "RemoteAssetManager sandbox failed to initialize", null);
        } else {
            remoteAssetManager.b(new atsw(attaVar, atteVar, str, 1));
        }
    }

    private native List nativeGetAuxOutputStreamNames(long j);

    private native Map nativeGetControls(long j);

    public static native long nativeGetEffectAddress(long j);

    private native byte[] nativeGetLoadedSerializedEffect(long j);

    private native String nativeGetName(long j);

    public static native void nativeLoadCapabilityWithRemoteAssetManager(byte[] bArr, long j, long j2, String str, NativeLoadCallback nativeLoadCallback);

    public static native void nativeLoadChoreoWithRemoteAssetManager(byte[] bArr, long j, String str, NativeLoadCallback nativeLoadCallback);

    public static native void nativeLoadLocal(byte[] bArr, NativeLoadCallback nativeLoadCallback);

    public static native void nativeLoadWithRemoteAssetManager(byte[] bArr, long j, String str, NativeLoadCallback nativeLoadCallback);

    public final agev b() {
        return agev.h(nativeGetName(this.a));
    }

    public final byte[] e() {
        return nativeGetLoadedSerializedEffect(this.a);
    }

    @Override // defpackage.atvg
    public final void iD(atvh atvhVar) {
        this.c.readLock().lock();
        try {
            atvhVar.a(this.a);
        } finally {
            this.c.readLock().unlock();
        }
    }

    public native byte[] nativeGetSerializedProcessingMetadata(long j);

    public native void nativeRelease(long j);

    public native void nativeSetName(long j, String str);
}
