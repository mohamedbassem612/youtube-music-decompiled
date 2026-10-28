package defpackage;

import app.rive.core.CommandQueue;
import app.rive.core.FrameTicker;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adro {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/rive/RiveWorkerPoller");
    public final awmi b;
    public final awut c;
    public awwd d;
    public int e;
    private final awmd f;
    private final awou g;

    public adro(awmd awmdVar, awou awouVar) {
        awmdVar.getClass();
        awouVar.getClass();
        this.f = awmdVar;
        this.g = awouVar;
        this.b = new awmp(new aoh(18));
        this.c = awrc.K(JniZero.u(new awxf(null), awouVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [adro] */
    /* JADX WARN: Type inference failed for: r11v1, types: [app.rive.core.CommandQueue] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v9, types: [app.rive.core.CommandQueue] */
    public static /* synthetic */ Object a(adro adroVar, boc bocVar, FrameTicker frameTicker, awoq awoqVar) throws Throwable {
        adrm adrmVar;
        if (awoqVar instanceof adrm) {
            adrmVar = (adrm) awoqVar;
            int i = adrmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adrmVar.c = i - Integer.MIN_VALUE;
            } else {
                adrmVar = new adrm(adroVar, awoqVar);
            }
        } else {
            adrmVar = new adrm(adroVar, awoqVar);
        }
        Object obj = adrmVar.a;
        awox awoxVar = awox.a;
        int i2 = adrmVar.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                Object objIo = ((adro) adroVar).f.io();
                objIo.getClass();
                CommandQueue commandQueue = (CommandQueue) objIo;
                adrmVar.d = commandQueue;
                adrmVar.c = 1;
                Object objBeginPolling = commandQueue.beginPolling(bocVar, frameTicker, adrmVar);
                adroVar = commandQueue;
                if (objBeginPolling == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CommandQueue commandQueue2 = adrmVar.d;
                atqp.j(obj);
                adroVar = commandQueue2;
            }
            try {
                adroVar.release("RiveWorkerPoller", "End");
            } catch (IllegalStateException e) {
                ((agrc) ((agrc) a.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveWorkerPoller", "pollSharedWorker", 115, "RiveWorkerPoller.kt")).t("Failed releasing the Rive worker when polling ended");
            }
            return awmy.a;
        } catch (Throwable th) {
            try {
                adroVar.release("RiveWorkerPoller", "End");
            } catch (IllegalStateException e2) {
                ((agrc) ((agrc) a.c()).j(e2).k("com/google/android/libraries/youtube/rendering/rive/RiveWorkerPoller", "pollSharedWorker", 115, "RiveWorkerPoller.kt")).t("Failed releasing the Rive worker when polling ended");
            }
            throw th;
        }
    }
}
