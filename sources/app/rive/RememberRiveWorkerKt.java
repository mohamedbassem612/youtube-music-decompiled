package app.rive;

import app.rive.core.CommandQueue;
import defpackage.ahj;
import defpackage.ahk;
import defpackage.ahr;
import defpackage.ahs;
import defpackage.aia;
import defpackage.aid;
import defpackage.aii;
import defpackage.atqp;
import defpackage.awmm;
import defpackage.awmn;
import defpackage.awqg;
import defpackage.bog;
import defpackage.bpq;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RememberRiveWorkerKt {
    public static final String RIVE_WORKER_TAG = "Rive/Worker";

    private static final CommandQueue createRiveWorker(RenderBackend renderBackend, boolean z, boolean z2) {
        return z2 ? CommandQueue.Companion.createDeferred$third_party_java_android_libs_rive_rive_android(renderBackend, z) : new CommandQueue(renderBackend, z);
    }

    public static final CommandQueue rememberDeferredRiveWorker(boolean z, boolean z2, RenderBackend renderBackend, ahk ahkVar, int i, int i2) throws RiveInitializationException {
        if ((i2 & 4) != 0) {
            renderBackend = RenderBackend.OpenGL;
        }
        RenderBackend renderBackend2 = renderBackend;
        Object objC = ahkVar.c();
        if (objC == ahj.a) {
            aid aidVar = new aid(null, aii.c);
            ahkVar.D();
            objC = aidVar;
        }
        boolean z3 = ((i2 & 2) == 0) & z2;
        int i3 = (i2 & 1) | (z ? 1 : 0);
        int i4 = i << 3;
        aia aiaVar = (aia) objC;
        CommandQueue commandQueueRememberRiveWorkerImpl = rememberRiveWorkerImpl(aiaVar, 1 == i3, z3, true, renderBackend2, ahkVar, (i4 & 112) | 3078 | (i4 & 896) | ((i << 6) & 57344));
        if (commandQueueRememberRiveWorkerImpl != null) {
            return commandQueueRememberRiveWorkerImpl;
        }
        throw new RiveInitializationException("Failed to create Rive worker", (Throwable) aiaVar.e());
    }

    public static final CommandQueue rememberRiveWorker(boolean z, boolean z2, RenderBackend renderBackend, ahk ahkVar, int i, int i2) throws RiveInitializationException {
        if ((i2 & 4) != 0) {
            renderBackend = RenderBackend.OpenGL;
        }
        RenderBackend renderBackend2 = renderBackend;
        Object objC = ahkVar.c();
        if (objC == ahj.a) {
            aid aidVar = new aid(null, aii.c);
            ahkVar.D();
            objC = aidVar;
        }
        boolean z3 = ((i2 & 2) == 0) & z2;
        int i3 = i << 3;
        aia aiaVar = (aia) objC;
        CommandQueue commandQueueRememberRiveWorkerOrNull = rememberRiveWorkerOrNull(aiaVar, 1 == ((i2 & 1) | (z ? 1 : 0)), z3, renderBackend2, ahkVar, (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168), 0);
        if (commandQueueRememberRiveWorkerOrNull != null) {
            return commandQueueRememberRiveWorkerOrNull;
        }
        throw new RiveInitializationException("Failed to create Rive worker", (Throwable) aiaVar.e());
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    private static final CommandQueue rememberRiveWorkerImpl(aia aiaVar, boolean z, boolean z2, boolean z3, RenderBackend renderBackend, ahk ahkVar, int i) {
        boolean z4;
        Object objI;
        int i2 = bpq.a;
        bog bogVar = (bog) ahkVar.w();
        if (((57344 & i) ^ 24576) > 16384) {
            renderBackend.ordinal();
            if (ahkVar.r()) {
                z4 = true;
            } else if ((i & 24576) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else if ((i & 24576) == 16384) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z5 = z4 | ((((i & 7168) ^ 3072) > 2048 && ahkVar.u()) || (i & 3072) == 2048);
        Object objC = ahkVar.c();
        if (z5 || objC == ahj.a) {
            try {
                objI = createRiveWorker(renderBackend, z2, z3);
            } catch (Throwable th) {
                objI = atqp.i(th);
            }
            final Throwable thA = awmn.a(objI);
            if (thA != null) {
                if (aiaVar.e() == null) {
                    aiaVar.f(thA);
                }
                RiveLog.INSTANCE.getLogger().e(RIVE_WORKER_TAG, null, new Function0() { // from class: app.rive.RememberRiveWorkerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RememberRiveWorkerKt.rememberRiveWorkerImpl$lambda$0$1$0(thA);
                    }
                });
            }
            if (true == (objI instanceof awmm)) {
                objI = null;
            }
            objC = (CommandQueue) objI;
            ahkVar.D();
        }
        final CommandQueue commandQueue = (CommandQueue) objC;
        boolean zV = ahkVar.v() | ((((i & 896) ^ 384) > 256 && ahkVar.u()) || (i & 384) == 256);
        Object objC2 = ahkVar.c();
        if (zV || objC2 == ahj.a) {
            objC2 = new RememberRiveWorkerKt$rememberRiveWorkerImpl$1$1(commandQueue, z2, null);
            ahkVar.D();
        }
        CommandQueue.Companion companion = CommandQueue.Companion;
        ahs.f(ahkVar);
        boolean zV2 = ahkVar.v() | ((((i & 112) ^ 48) > 32 && ahkVar.u()) || (i & 48) == 32) | ahkVar.v();
        Object objC3 = ahkVar.c();
        if (zV2 || objC3 == ahj.a) {
            objC3 = new RememberRiveWorkerKt$rememberRiveWorkerImpl$2$1(commandQueue, z, bogVar, null);
            ahkVar.D();
        }
        ahs.e(ahkVar);
        boolean zV3 = ahkVar.v() | ahkVar.v();
        Object objC4 = ahkVar.c();
        if (zV3 || objC4 == ahj.a) {
            objC4 = new RememberRiveWorkerKt$rememberRiveWorkerImpl$3$1(commandQueue, bogVar, null);
            ahkVar.D();
        }
        ahs.f(ahkVar);
        boolean zV4 = ahkVar.v();
        Object objC5 = ahkVar.c();
        if (zV4 || objC5 == ahj.a) {
            objC5 = new awqg() { // from class: app.rive.RememberRiveWorkerKt$$ExternalSyntheticLambda1
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return RememberRiveWorkerKt.rememberRiveWorkerImpl$lambda$4$0(commandQueue, (ahs) obj);
                }
            };
            ahkVar.D();
        }
        ahs.b(ahkVar);
        return commandQueue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rememberRiveWorkerImpl$lambda$0$1$0(Throwable th) {
        return "Failed to create Rive worker: ".concat(String.valueOf(th.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahr rememberRiveWorkerImpl$lambda$4$0(final CommandQueue commandQueue, ahs ahsVar) {
        ahsVar.getClass();
        return commandQueue == null ? new ahr() { // from class: app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$lambda$4$0$$inlined$onDispose$1
            public void dispose() {
            }
        } : new ahr() { // from class: app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$lambda$4$0$$inlined$onDispose$2
            public void dispose() {
                commandQueue.release(RememberRiveWorkerKt.RIVE_WORKER_TAG, "Compose dispose");
            }
        };
    }

    public static final CommandQueue rememberRiveWorkerOrNull(aia aiaVar, boolean z, boolean z2, RenderBackend renderBackend, ahk ahkVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            aiaVar = new aid(null, aii.c);
        }
        boolean z3 = z | (!((i2 & 2) == 0));
        boolean z4 = z2 & ((i2 & 4) == 0);
        if ((i2 & 8) != 0) {
            renderBackend = RenderBackend.OpenGL;
        }
        return rememberRiveWorkerImpl(aiaVar, z3, z4, false, renderBackend, ahkVar, (i & 14) | 3072 | (i & 112) | (i & 896) | ((i << 3) & 57344));
    }
}
