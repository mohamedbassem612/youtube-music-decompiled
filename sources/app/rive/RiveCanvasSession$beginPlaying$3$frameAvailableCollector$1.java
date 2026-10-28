package app.rive;

import android.graphics.Bitmap;
import defpackage.atqp;
import defpackage.awmh;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awqx;
import defpackage.awut;
import defpackage.awzd;
import defpackage.axaf;
import defpackage.axah;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1 extends awpk implements awqk {
    int label;
    final /* synthetic */ RiveCanvasSession this$0;

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass1 extends awpk implements awqk {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RiveCanvasSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RiveCanvasSession riveCanvasSession, awoq awoqVar) {
            super(2, awoqVar);
            this.this$0 = riveCanvasSession;
        }

        @Override // defpackage.awpe
        public final awoq create(Object obj, awoq awoqVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, awoqVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.awqk
        public final Object invoke(HardwareRenderBuffer hardwareRenderBuffer, awoq awoqVar) {
            return ((AnonymousClass1) create(hardwareRenderBuffer, awoqVar)).invokeSuspend(awmy.a);
        }

        @Override // defpackage.awpe
        public final Object invokeSuspend(Object obj) throws Throwable {
            awox awoxVar = awox.a;
            int i = this.label;
            if (i == 0) {
                atqp.j(obj);
                final HardwareRenderBuffer hardwareRenderBuffer = (HardwareRenderBuffer) this.L$0;
                if (hardwareRenderBuffer == null) {
                    return awmy.a;
                }
                final RiveCanvasSession riveCanvasSession = this.this$0;
                axah frameAvailable = hardwareRenderBuffer.getFrameAvailable();
                awzd awzdVar = new awzd() { // from class: app.rive.RiveCanvasSession.beginPlaying.3.frameAvailableCollector.1.1.1
                    @Override // defpackage.awzd
                    public final Object emit(awmy awmyVar, awoq awoqVar) throws RiveRenderException {
                        HardwareRenderBuffer hardwareRenderBuffer2 = hardwareRenderBuffer;
                        RiveCanvasSession riveCanvasSession2 = riveCanvasSession;
                        Bitmap bitmapConsumeLatestBitmap = hardwareRenderBuffer2.consumeLatestBitmap();
                        if (bitmapConsumeLatestBitmap != null && riveCanvasSession2.latestBitmap != bitmapConsumeLatestBitmap) {
                            riveCanvasSession2.latestBitmap = bitmapConsumeLatestBitmap;
                            riveCanvasSession2._frameAvailable.b(awmy.a);
                        }
                        return awmy.a;
                    }
                };
                this.label = 1;
                if (frameAvailable.collect(awzdVar, this) == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
            throw new awmh();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1(RiveCanvasSession riveCanvasSession, awoq awoqVar) {
        super(2, awoqVar);
        this.this$0 = riveCanvasSession;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1(this.this$0, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i == 0) {
            atqp.j(obj);
            RiveCanvasSession riveCanvasSession = this.this$0;
            axaf axafVar = riveCanvasSession.renderBufferState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(riveCanvasSession, null);
            axafVar.getClass();
            this.label = 1;
            if (awqx.w(axafVar, anonymousClass1, this) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        throw new IllegalStateException("SharedFlow never completes, this call should never return.");
    }
}
