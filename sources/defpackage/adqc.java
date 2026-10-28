package defpackage;

import android.graphics.Rect;
import app.rive.Artboard;
import app.rive.RiveCanvasSession;
import app.rive.RiveFile;
import app.rive.StateMachine;
import app.rive.ViewModelInstance;
import app.rive.core.CommandQueue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqc {
    public final RiveFile b;
    public final ViewModelInstance c;
    public final RiveCanvasSession d;
    public awwd e;
    public boolean f;
    public Function0 g;
    public final awzc h;
    private final Artboard j;
    private final StateMachine k;
    private final CommandQueue l;
    public static final acfz i = new acfz(null);
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/rive/RiveNativeSession");

    public adqc(RiveFile riveFile, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, RiveCanvasSession riveCanvasSession, CommandQueue commandQueue) {
        commandQueue.getClass();
        this.b = riveFile;
        this.j = artboard;
        this.k = stateMachine;
        this.c = viewModelInstance;
        this.d = riveCanvasSession;
        this.l = commandQueue;
        this.h = riveCanvasSession.getFrameAvailable();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object a(adqc adqcVar, awoq awoqVar) throws Throwable {
        adqb adqbVar;
        if (awoqVar instanceof adqb) {
            adqbVar = (adqb) awoqVar;
            int i2 = adqbVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adqbVar.c = i2 - Integer.MIN_VALUE;
            } else {
                adqbVar = new adqb(adqcVar, awoqVar);
            }
        } else {
            adqbVar = new adqb(adqcVar, awoqVar);
        }
        Object obj = adqbVar.a;
        awox awoxVar = awox.a;
        int i3 = adqbVar.c;
        try {
            if (i3 == 0) {
                atqp.j(obj);
                if (!adqcVar.f) {
                    adqcVar.f = true;
                    awwd awwdVar = adqcVar.e;
                    if (awwdVar != null) {
                        adqbVar.d = adqcVar;
                        adqbVar.c = 1;
                        if (awro.x(awwdVar, adqbVar) == awoxVar) {
                            return awoxVar;
                        }
                    }
                }
                return awmy.a;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adqcVar = adqbVar.d;
            atqp.j(obj);
            CommandQueue commandQueue = adqcVar.l;
            if (!commandQueue.isDisposed()) {
                commandQueue.release("RiveNativeSession", "Cleanup");
            }
        } catch (Exception e) {
            ((agrc) ((agrc) a.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveNativeSession", "closeResources", 122, "RiveNativeSession.kt")).t("Failed releasing Rive worker during cleanup.");
        }
        acfz.af(adqcVar.c);
        acfz.af(adqcVar.k);
        acfz.af(adqcVar.j);
        acfz.af(adqcVar.b);
        return awmy.a;
    }

    public final void b() {
        acfz.af(this.d);
    }

    public final void c(Rect rect) {
        rect.getClass();
        if (rect.isEmpty()) {
            return;
        }
        this.d.setRegion(rect);
    }
}
