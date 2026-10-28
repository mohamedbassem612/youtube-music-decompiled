package com.google.android.libraries.performance.primes.metrics.crash;

import android.os.StrictMode;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.agev;
import defpackage.agfa;
import defpackage.agrc;
import defpackage.aigm;
import defpackage.aihf;
import defpackage.aior;
import defpackage.awmd;
import defpackage.axhq;
import defpackage.lph;
import defpackage.qcq;
import defpackage.qfv;
import defpackage.qfy;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class NativeCrashHandlerImpl {
    final CountDownLatch a = new CountDownLatch(1);
    final CountDownLatch b = new CountDownLatch(1);
    private boolean c;
    private final agev d;
    private final awmd e;
    private final awmd f;

    public NativeCrashHandlerImpl(agev agevVar, awmd awmdVar, awmd awmdVar2) {
        this.d = agevVar;
        this.e = awmdVar;
        this.f = awmdVar2;
    }

    private static native ByteBuffer awaitSignal();

    private static native boolean initializeSignalHandler(boolean z);

    private static native void unblockSignalHandler();

    public final synchronized void a(qfv qfvVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        Thread thread = new Thread(new lph(this, qfvVar, 9, (char[]) null), "Primes-nativecrash-sidecar");
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.start();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    public final /* synthetic */ void b(qfv qfvVar) {
        aihf aihfVarCreateBuilder;
        if (!((Boolean) ((agfa) this.d).a.io()).booleanValue()) {
            this.b.countDown();
            return;
        }
        try {
            System.loadLibrary("native_crash_handler_jni");
            if (!initializeSignalHandler(((Boolean) this.f.io()).booleanValue())) {
                ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 79, "NativeCrashHandlerImpl.java")).t("unable to initialize signal handler");
                return;
            }
            try {
                this.a.countDown();
                ByteBuffer byteBufferAwaitSignal = awaitSignal();
                if (byteBufferAwaitSignal != null) {
                    try {
                        aihfVarCreateBuilder = aior.a.createBuilder();
                        aihfVarCreateBuilder.mergeFrom(aigm.U(byteBufferAwaitSignal), ExtensionRegistryLite.a);
                    } catch (Throwable unused) {
                        aihfVarCreateBuilder = null;
                    }
                } else {
                    aihfVarCreateBuilder = null;
                }
                if (((Boolean) this.e.io()).booleanValue()) {
                    Thread.getAllStackTraces();
                }
                aior aiorVar = aihfVarCreateBuilder != null ? (aior) aihfVarCreateBuilder.build() : null;
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                aihf aihfVarA = ((qfy) qfvVar).f.a(((qfy) qfvVar).a);
                aihfVarA.copyOnWrite();
                axhq axhqVar = (axhq) aihfVarA.instance;
                axhq axhqVar2 = axhq.a;
                axhqVar.g = 5;
                axhqVar.b |= 16;
                if (aiorVar != null) {
                    aihfVarA.copyOnWrite();
                    axhq axhqVar3 = (axhq) aihfVarA.instance;
                    axhqVar3.j = aiorVar;
                    axhqVar3.b |= SemanticState.LiveRegion;
                }
                ((qfy) qfvVar).m((axhq) aihfVarA.build(), null);
            } finally {
                unblockSignalHandler();
            }
        } catch (UnsatisfiedLinkError e) {
            ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 'K', "NativeCrashHandlerImpl.java")).t("unable to load native_crash_handler_jni");
        }
    }
}
