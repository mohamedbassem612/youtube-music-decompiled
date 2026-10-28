package com.google.research.xeno.effect;

import android.content.Context;
import android.util.Log;
import defpackage.agrq;
import defpackage.ahfi;
import defpackage.atvy;
import defpackage.atvz;
import defpackage.atwb;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class RemoteAssetManager {
    public static final ExecutorService a;
    private static final Map e = new HashMap();
    public long b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: PG */
    public interface FetchCallback {
        void onCompletion(String str, String str2);
    }

    static {
        ahfi ahfiVar = new ahfi();
        ahfiVar.c("xeno-remote-asset-manager-thread-%d");
        a = Executors.newSingleThreadExecutor(ahfi.a(ahfiVar));
    }

    private RemoteAssetManager(Context context, atvy atvyVar) {
        File file;
        this.d = atvyVar.a;
        atwb atwbVar = atwb.a;
        synchronized (atwb.class) {
            if (atwb.a == null) {
                atwb.a = new atwb(context);
            }
            atwb atwbVar2 = atwb.a;
            if (atwbVar2.b == null) {
                atwbVar2.b = atwbVar2.a(context);
            }
        }
        atwb atwbVar3 = atwb.a;
        byte[] bArr = null;
        if (atwbVar3.b != null) {
            synchronized (atwb.class) {
                int i = atwbVar3.c + 1;
                atwbVar3.c = i;
                file = new File(atwbVar3.b, String.valueOf(i));
                if (!file.mkdir()) {
                    file = null;
                }
            }
        } else {
            file = null;
        }
        String path = file != null ? file.getPath() : null;
        this.c = path;
        if (path == null) {
            Log.e("RemoteAssetManager", "Failed to create sandbox");
        } else {
            a.execute(new agrq(this, atvyVar, 12, bArr));
        }
    }

    public static RemoteAssetManager a(Context context, atvy atvyVar) {
        RemoteAssetManager remoteAssetManager;
        synchronized (RemoteAssetManager.class) {
            String str = atvyVar.a;
            Map map = e;
            remoteAssetManager = (RemoteAssetManager) map.get(str);
            if (remoteAssetManager == null) {
                remoteAssetManager = new RemoteAssetManager(context, atvyVar);
                if (remoteAssetManager.c()) {
                    map.put(str, remoteAssetManager);
                }
            }
        }
        return remoteAssetManager;
    }

    public static native long nativeCreateRemoteAssetManager(String str, long j, AssetDownloader assetDownloader, String str2);

    public static native long nativeFetchAsset(long j, String str, FetchCallback fetchCallback);

    public static native String nativeGetExpectedCachedAssetPath(String str, String str2);

    public final void b(atvz atvzVar) {
        a.execute(new agrq(this, atvzVar, 11, (byte[]) null));
    }

    public final boolean c() {
        return this.c != null;
    }
}
