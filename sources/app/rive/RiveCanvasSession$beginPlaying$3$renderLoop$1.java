package app.rive;

import app.rive.core.ArtboardHandle;
import app.rive.core.FrameTicker;
import app.rive.core.StateMachineHandle;
import defpackage.alh;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqg;
import defpackage.awqk;
import defpackage.awrc;
import defpackage.awri;
import defpackage.awrl;
import defpackage.awtl;
import defpackage.awtn;
import defpackage.awut;
import defpackage.bob;
import defpackage.boc;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveCanvasSession$beginPlaying$3$renderLoop$1 extends awpk implements awqk {
    final /* synthetic */ boc $lifecycle;
    final /* synthetic */ FrameTicker $ticker;
    int label;
    final /* synthetic */ RiveCanvasSession this$0;

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$3$renderLoop$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass1 extends awpk implements awqk {
        final /* synthetic */ FrameTicker $ticker;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ RiveCanvasSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RiveCanvasSession riveCanvasSession, FrameTicker frameTicker, awoq awoqVar) {
            super(2, awoqVar);
            this.this$0 = riveCanvasSession;
            this.$ticker = frameTicker;
        }

        static final String invokeSuspend$lambda$0(RiveCanvasSession riveCanvasSession) {
            return "Starting drawing with " + ArtboardHandle.m375toStringimpl(riveCanvasSession.artboard.m269getArtboardHandlenSTdbJo()) + " and " + StateMachineHandle.m569toStringimpl(riveCanvasSession.stateMachine.m318getStateMachineHandlea86gHUU());
        }

        static final awmy invokeSuspend$lambda$1(RiveCanvasSession riveCanvasSession, awrl awrlVar, awri awriVar, long j) throws InterruptedException, RiveRenderException {
            if (!riveCanvasSession.closer.getClosed()) {
                long j2 = awrlVar.a;
                long j3 = j2 != 0 ? j - j2 : 0L;
                awrlVar.a = j;
                HardwareRenderBuffer hardwareRenderBuffer = riveCanvasSession.renderBuffer;
                if (hardwareRenderBuffer != null) {
                    awriVar.a = false;
                    if (!((Boolean) riveCanvasSession.stateMachine.getSettled$third_party_java_android_libs_rive_rive_android().c()).booleanValue()) {
                        StateMachine stateMachine = riveCanvasSession.stateMachine;
                        int i = awtl.b;
                        stateMachine.m317advanceLRDsOJo(awrc.j(j3, awtn.NANOSECONDS));
                        if (riveCanvasSession.semanticsEnabled) {
                            riveCanvasSession.stateMachine.drainSemanticsDiff(riveCanvasSession.fit, hardwareRenderBuffer.getWidth(), hardwareRenderBuffer.getHeight());
                        }
                        hardwareRenderBuffer.render(riveCanvasSession.artboard, riveCanvasSession.stateMachine, riveCanvasSession.fit, riveCanvasSession.clearColor);
                    }
                } else if (!awriVar.a) {
                    RiveLog.INSTANCE.getLogger().w("Rive/CanvasSession", new Function0() { // from class: app.rive.RiveCanvasSession$beginPlaying$3$renderLoop$1$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RiveCanvasSession$beginPlaying$3$renderLoop$1.AnonymousClass1.invokeSuspend$lambda$1$0$0();
                        }
                    });
                    awriVar.a = true;
                }
            }
            return awmy.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$1$0$0() {
            return "No render buffer available; call setRegion(...) with a valid size before beginPlaying.";
        }

        static final String invokeSuspend$lambda$2(RiveCanvasSession riveCanvasSession) {
            return "Ending drawing with " + ArtboardHandle.m375toStringimpl(riveCanvasSession.artboard.m269getArtboardHandlenSTdbJo()) + " and " + StateMachineHandle.m569toStringimpl(riveCanvasSession.stateMachine.m318getStateMachineHandlea86gHUU());
        }

        @Override // defpackage.awpe
        public final awoq create(Object obj, awoq awoqVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$ticker, awoqVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.awqk
        public final Object invoke(awut awutVar, awoq awoqVar) {
            return ((AnonymousClass1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
        }

        @Override // defpackage.awpe
        public final Object invokeSuspend(Object obj) throws Throwable {
            awut awutVar;
            final awrl awrlVar;
            final awri awriVar;
            awox awoxVar = awox.a;
            int i = this.label;
            if (i == 0) {
                atqp.j(obj);
                awutVar = (awut) this.L$0;
                final RiveCanvasSession riveCanvasSession = this.this$0;
                RiveLog.INSTANCE.getLogger().d("Rive/CanvasSession", new Function0() { // from class: app.rive.RiveCanvasSession$beginPlaying$3$renderLoop$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RiveCanvasSession$beginPlaying$3$renderLoop$1.AnonymousClass1.invokeSuspend$lambda$0(riveCanvasSession);
                    }
                });
                awrlVar = new awrl();
                awriVar = new awri();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awriVar = (awri) this.L$2;
                awrlVar = (awrl) this.L$1;
                awutVar = (awut) this.L$0;
                atqp.j(obj);
            }
            while (awrc.N(awutVar) && !this.this$0.closer.getClosed()) {
                FrameTicker frameTicker = this.$ticker;
                final RiveCanvasSession riveCanvasSession2 = this.this$0;
                awqg awqgVar = new awqg() { // from class: app.rive.RiveCanvasSession$beginPlaying$3$renderLoop$1$1$$ExternalSyntheticLambda1
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj2) {
                        return RiveCanvasSession$beginPlaying$3$renderLoop$1.AnonymousClass1.invokeSuspend$lambda$1(riveCanvasSession2, awrlVar, awriVar, ((Long) obj2).longValue());
                    }
                };
                this.L$0 = awutVar;
                this.L$1 = awrlVar;
                this.L$2 = awriVar;
                this.label = 1;
                if (frameTicker.withFrame(awqgVar, this) == awoxVar) {
                    return awoxVar;
                }
            }
            final RiveCanvasSession riveCanvasSession3 = this.this$0;
            RiveLog.INSTANCE.getLogger().d("Rive/CanvasSession", new Function0() { // from class: app.rive.RiveCanvasSession$beginPlaying$3$renderLoop$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveCanvasSession$beginPlaying$3$renderLoop$1.AnonymousClass1.invokeSuspend$lambda$2(riveCanvasSession3);
                }
            });
            return awmy.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession$beginPlaying$3$renderLoop$1(boc bocVar, RiveCanvasSession riveCanvasSession, FrameTicker frameTicker, awoq awoqVar) {
        super(2, awoqVar);
        this.$lifecycle = bocVar;
        this.this$0 = riveCanvasSession;
        this.$ticker = frameTicker;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RiveCanvasSession$beginPlaying$3$renderLoop$1(this.$lifecycle, this.this$0, this.$ticker, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveCanvasSession$beginPlaying$3$renderLoop$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i == 0) {
            atqp.j(obj);
            boc bocVar = this.$lifecycle;
            RiveCanvasSession riveCanvasSession = this.this$0;
            FrameTicker frameTicker = this.$ticker;
            bob bobVar = bob.e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(riveCanvasSession, frameTicker, null);
            this.label = 1;
            if (alh.d(bocVar, bobVar, anonymousClass1, this) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }
}
