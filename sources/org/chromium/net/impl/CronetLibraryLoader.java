package org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import defpackage.a;
import defpackage.axjt;
import defpackage.axkl;
import defpackage.axle;
import defpackage.axlg;
import defpackage.axli;
import defpackage.axlp;
import defpackage.axlq;
import defpackage.axnh;
import defpackage.axnm;
import defpackage.axok;
import defpackage.axos;
import defpackage.axpo;
import defpackage.axqd;
import defpackage.axqs;
import defpackage.gkz;
import internal.J.N;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.chromium.base.CommandLine;
import org.chromium.base.JniAndroid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class CronetLibraryLoader {
    private static boolean d;
    private static boolean f;
    private static final Object c = new Object();
    private static final String e = "cronet.".concat(ImplVersion.getCronetVersion());
    private static final HandlerThread g = new HandlerThread("CronetInit");
    public static final ConditionVariable a = new ConditionVariable();
    public static final ConditionVariable b = new ConditionVariable();

    public static void a() {
        f = true;
        try {
            System.loadLibrary(e);
        } catch (UnsatisfiedLinkError unused) {
            System.loadLibrary("cronet");
        }
    }

    public static void b(Runnable runnable) {
        HandlerThread handlerThread = g;
        if (handlerThread.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(handlerThread.getLooper()).post(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x000b, B:6:0x000f, B:8:0x0011, B:10:0x0026, B:14:0x003c, B:15:0x003d, B:17:0x0041, B:21:0x004d, B:22:0x004e, B:24:0x0068, B:30:0x0099, B:32:0x00aa, B:33:0x00ce, B:36:0x00d1, B:37:0x00e8, B:39:0x00ea, B:41:0x00ec, B:25:0x006f, B:27:0x0087, B:29:0x008f, B:23:0x0055, B:11:0x002d, B:18:0x0048), top: B:54:0x000b, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004e A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x000b, B:6:0x000f, B:8:0x0011, B:10:0x0026, B:14:0x003c, B:15:0x003d, B:17:0x0041, B:21:0x004d, B:22:0x004e, B:24:0x0068, B:30:0x0099, B:32:0x00aa, B:33:0x00ce, B:36:0x00d1, B:37:0x00e8, B:39:0x00ea, B:41:0x00ec, B:25:0x006f, B:27:0x0087, B:29:0x008f, B:23:0x0055, B:11:0x002d, B:18:0x0048), top: B:54:0x000b, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0087 A[Catch: all -> 0x00e9, TryCatch #0 {, blocks: (B:25:0x006f, B:27:0x0087, B:29:0x008f), top: B:46:0x006f, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x008f A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #0 {, blocks: (B:25:0x006f, B:27:0x0087, B:29:0x008f), top: B:46:0x006f, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa A[Catch: all -> 0x00ef, TryCatch #4 {, blocks: (B:4:0x000b, B:6:0x000f, B:8:0x0011, B:10:0x0026, B:14:0x003c, B:15:0x003d, B:17:0x0041, B:21:0x004d, B:22:0x004e, B:24:0x0068, B:30:0x0099, B:32:0x00aa, B:33:0x00ce, B:36:0x00d1, B:37:0x00e8, B:39:0x00ea, B:41:0x00ec, B:25:0x006f, B:27:0x0087, B:29:0x008f, B:23:0x0055, B:11:0x002d, B:18:0x0048), top: B:54:0x000b, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1 A[Catch: all -> 0x00ef, TryCatch #4 {, blocks: (B:4:0x000b, B:6:0x000f, B:8:0x0011, B:10:0x0026, B:14:0x003c, B:15:0x003d, B:17:0x0041, B:21:0x004d, B:22:0x004e, B:24:0x0068, B:30:0x0099, B:32:0x00aa, B:33:0x00ce, B:36:0x00d1, B:37:0x00e8, B:39:0x00ea, B:41:0x00ec, B:25:0x006f, B:27:0x0087, B:29:0x008f, B:23:0x0055, B:11:0x002d, B:18:0x0048), top: B:54:0x000b, inners: #0, #1, #2, #3 }] */
    public static boolean c(Context context) {
        axnh axnhVar;
        axlq axlqVar;
        String cronetVersion;
        String strD;
        new axjt("CronetLibraryLoader#ensureInitialized", 0);
        synchronized (c) {
            if (d) {
                return false;
            }
            CommandLine.a.c(new String[]{"cronet"});
            JniAndroid.a = context;
            HandlerThread handlerThread = g;
            if (handlerThread.isAlive()) {
                if (!f) {
                    new axjt("CronetLibraryLoader#ensureInitialized calling nativeInit", 0);
                    CommandLine.a.d();
                    N.MAuYp$hS(axnm.a(context).getBoolean("android.net.http.UsePerfetto", true));
                    new axjt("CronetLibraryLoader#ensureInitialized calling CronetUmaRecorder#initialize", 0);
                    axnhVar = axok.q;
                    axlqVar = (axlq) axlp.a(context, false, axnm.b(context, axnhVar)).d().get("Cronet_CronetUmaAllowList");
                    if (axlqVar != null) {
                        strD = axlqVar.d();
                        if (CronetUmaRecorder.a == null) {
                            CronetUmaRecorder.a = new CronetUmaRecorder(context, axnhVar);
                            N.M859bvA1(strD);
                        }
                    }
                    cronetVersion = ImplVersion.getCronetVersion();
                    if (cronetVersion.equals((String) N.M6xubM8G())) {
                        throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", cronetVersion, (String) N.M6xubM8G()));
                    }
                    String.format(Locale.US, "Cronet version: %s, arch: %s, source: %s", "156.0.8078.25", System.getProperty("os.arch"), axok.q);
                    N.MFFzPOVw();
                    a.open();
                    d = true;
                    return true;
                }
                new axjt("CronetLibraryLoader#ensureInitialized loading native library", 0);
                a();
                new axjt("CronetLibraryLoader#ensureInitialized calling nativeInit", 0);
                CommandLine.a.d();
                N.MAuYp$hS(axnm.a(context).getBoolean("android.net.http.UsePerfetto", true));
                new axjt("CronetLibraryLoader#ensureInitialized calling CronetUmaRecorder#initialize", 0);
                axnhVar = axok.q;
                axlqVar = (axlq) axlp.a(context, false, axnm.b(context, axnhVar)).d().get("Cronet_CronetUmaAllowList");
                if (axlqVar != null) {
                    strD = axlqVar.d();
                    if (CronetUmaRecorder.a == null) {
                        CronetUmaRecorder.a = new CronetUmaRecorder(context, axnhVar);
                        N.M859bvA1(strD);
                    }
                }
                cronetVersion = ImplVersion.getCronetVersion();
                if (cronetVersion.equals((String) N.M6xubM8G())) {
                    throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", cronetVersion, (String) N.M6xubM8G()));
                }
                String.format(Locale.US, "Cronet version: %s, arch: %s, source: %s", "156.0.8078.25", System.getProperty("os.arch"), axok.q);
                N.MFFzPOVw();
                a.open();
                d = true;
                return true;
            }
            new axjt("CronetLibraryLoader#ensureInitialized starting init thread", 0);
            handlerThread.start();
            b(new gkz(14));
            if (!f) {
                new axjt("CronetLibraryLoader#ensureInitialized calling nativeInit", 0);
                CommandLine.a.d();
                N.MAuYp$hS(axnm.a(context).getBoolean("android.net.http.UsePerfetto", true));
                new axjt("CronetLibraryLoader#ensureInitialized calling CronetUmaRecorder#initialize", 0);
                axnhVar = axok.q;
                axlqVar = (axlq) axlp.a(context, false, axnm.b(context, axnhVar)).d().get("Cronet_CronetUmaAllowList");
                if (axlqVar != null) {
                    strD = axlqVar.d();
                    if (CronetUmaRecorder.a == null) {
                        CronetUmaRecorder.a = new CronetUmaRecorder(context, axnhVar);
                        N.M859bvA1(strD);
                    }
                }
                cronetVersion = ImplVersion.getCronetVersion();
                if (cronetVersion.equals((String) N.M6xubM8G())) {
                    throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", cronetVersion, (String) N.M6xubM8G()));
                }
                String.format(Locale.US, "Cronet version: %s, arch: %s, source: %s", "156.0.8078.25", System.getProperty("os.arch"), axok.q);
                N.MFFzPOVw();
                a.open();
                d = true;
                return true;
            }
            new axjt("CronetLibraryLoader#ensureInitialized loading native library", 0);
            a();
            new axjt("CronetLibraryLoader#ensureInitialized calling nativeInit", 0);
            CommandLine.a.d();
            N.MAuYp$hS(axnm.a(context).getBoolean("android.net.http.UsePerfetto", true));
            new axjt("CronetLibraryLoader#ensureInitialized calling CronetUmaRecorder#initialize", 0);
            axnhVar = axok.q;
            axlqVar = (axlq) axlp.a(context, false, axnm.b(context, axnhVar)).d().get("Cronet_CronetUmaAllowList");
            if (axlqVar != null) {
                strD = axlqVar.d();
                if (CronetUmaRecorder.a == null) {
                    CronetUmaRecorder.a = new CronetUmaRecorder(context, axnhVar);
                    N.M859bvA1(strD);
                }
            }
            cronetVersion = ImplVersion.getCronetVersion();
            if (cronetVersion.equals((String) N.M6xubM8G())) {
                throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", cronetVersion, (String) N.M6xubM8G()));
            }
            String.format(Locale.US, "Cronet version: %s, arch: %s, source: %s", "156.0.8078.25", System.getProperty("os.arch"), axok.q);
            N.MFFzPOVw();
            a.open();
            d = true;
            return true;
            throw th;
        }
    }

    private static void ensureInitializedFromNative() {
        c(JniAndroid.a);
    }

    private static byte[] getBaseFeatureOverrides() {
        axle axleVar;
        axpo axpoVarH;
        Context context = JniAndroid.a;
        axkl axklVarA = axlp.a(context, false, axnm.b(context, axok.q));
        HashMap map = new HashMap();
        for (Map.Entry entry : axklVarA.d().entrySet()) {
            try {
                String str = (String) entry.getKey();
                axlq axlqVar = (axlq) entry.getValue();
                if (str.startsWith("ChromiumBaseFeature_")) {
                    String strSubstring = str.substring(20);
                    axle axleVar2 = new axle();
                    int iIndexOf = strSubstring.indexOf("_PARAM_");
                    if (iIndexOf < 0) {
                        axleVar2.a = strSubstring;
                    } else {
                        axleVar2.a = strSubstring.substring(0, iIndexOf);
                        axleVar2.b = strSubstring.substring(iIndexOf + 7);
                    }
                    axleVar = axleVar2;
                } else {
                    axleVar = null;
                }
                if (axleVar != null) {
                    axqd axqdVarI = (axqd) map.get(axleVar.a);
                    if (axqdVarI == null) {
                        axqdVarI = axlg.DEFAULT_INSTANCE.i();
                        map.put(axleVar.a, axqdVarI);
                    }
                    Object obj = axleVar.b;
                    if (obj == null) {
                        int iB = axlqVar.b();
                        if (iB != 0) {
                            throw new IllegalArgumentException(a.bP(iB, "HTTP flag has type ", ", but only boolean flags are supported as base::Feature overrides"));
                        }
                        boolean zF = axlqVar.f();
                        axqdVarI.f();
                        axlg axlgVar = (axlg) axqdVarI.b;
                        int i = axlg.ENABLED_FIELD_NUMBER;
                        axlgVar.bitField0_ |= 1;
                        axlgVar.enabled_ = zF;
                    } else {
                        int iB2 = axlqVar.b();
                        if (iB2 == 0) {
                            axpoVarH = axpo.h(true == axlqVar.f() ? "true" : "false", StandardCharsets.UTF_8);
                        } else if (iB2 == 1) {
                            axpoVarH = axpo.h(Long.toString(axlqVar.c(), 10), StandardCharsets.UTF_8);
                        } else if (iB2 == 2) {
                            axpoVarH = axpo.h(Float.toString(axlqVar.a()), StandardCharsets.UTF_8);
                        } else if (iB2 != 3) {
                            axlqVar.e(4);
                            axpoVarH = (axpo) axlqVar.a;
                        } else {
                            axpoVarH = axpo.h(axlqVar.d(), StandardCharsets.UTF_8);
                        }
                        axpoVarH.getClass();
                        axqdVarI.f();
                        axlg axlgVar2 = (axlg) axqdVarI.b;
                        int i2 = axlg.ENABLED_FIELD_NUMBER;
                        axqs axqsVar = axlgVar2.params_;
                        if (!axqsVar.b) {
                            axlgVar2.params_ = axqsVar.a();
                        }
                        axlgVar2.params_.put(obj, axpoVarH);
                    }
                }
            } catch (RuntimeException e2) {
                throw new IllegalArgumentException("Could not parse HTTP flag `" + ((String) entry.getKey()) + "` as a base::Feature override", e2);
            }
        }
        axqd axqdVarI2 = axli.DEFAULT_INSTANCE.i();
        for (Map.Entry entry2 : map.entrySet()) {
            String str2 = (String) entry2.getKey();
            axlg axlgVar3 = (axlg) ((axqd) entry2.getValue()).c();
            str2.getClass();
            axlgVar3.getClass();
            axqdVarI2.f();
            axli axliVar = (axli) axqdVarI2.b;
            axqs axqsVar2 = axliVar.featureStates_;
            if (!axqsVar2.b) {
                axliVar.featureStates_ = axqsVar2.a();
            }
            axliVar.featureStates_.put(str2, axlgVar3);
        }
        return ((axli) axqdVarI2.c()).d();
    }

    private static String getDefaultUserAgent() {
        return axos.a(JniAndroid.a, axok.q, ImplVersion.getCronetVersion());
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Process.setThreadPriority(i);
    }
}
