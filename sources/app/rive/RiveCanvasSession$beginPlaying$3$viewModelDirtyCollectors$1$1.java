package app.rive;

import app.rive.core.StateMachineHandle;
import app.rive.core.ViewModelInstanceHandle;
import defpackage.atqp;
import defpackage.awmh;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awut;
import defpackage.awzd;
import defpackage.axah;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveCanvasSession$beginPlaying$3$viewModelDirtyCollectors$1$1 extends awpk implements awqk {
    final /* synthetic */ ViewModelInstance $instance;
    int label;
    final /* synthetic */ RiveCanvasSession this$0;

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$3$viewModelDirtyCollectors$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass1 implements awzd {
        final /* synthetic */ ViewModelInstance $instance;
        final /* synthetic */ RiveCanvasSession this$0;

        public AnonymousClass1(RiveCanvasSession riveCanvasSession, ViewModelInstance viewModelInstance) {
            this.this$0 = riveCanvasSession;
            this.$instance = viewModelInstance;
        }

        static final String emit$lambda$0(ViewModelInstance viewModelInstance, RiveCanvasSession riveCanvasSession) {
            return "View model instance " + ViewModelInstanceHandle.m583toStringimpl(viewModelInstance.m325getInstanceHandleVPLto4w()) + " dirty, unsettling " + StateMachineHandle.m569toStringimpl(riveCanvasSession.stateMachine.m318getStateMachineHandlea86gHUU());
        }

        @Override // defpackage.awzd
        public final Object emit(awmy awmyVar, awoq awoqVar) {
            final ViewModelInstance viewModelInstance = this.$instance;
            final RiveCanvasSession riveCanvasSession = this.this$0;
            RiveLog.INSTANCE.getLogger().v("Rive/CanvasSession", new Function0() { // from class: app.rive.RiveCanvasSession$beginPlaying$3$viewModelDirtyCollectors$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveCanvasSession$beginPlaying$3$viewModelDirtyCollectors$1$1.AnonymousClass1.emit$lambda$0(viewModelInstance, riveCanvasSession);
                }
            });
            this.this$0.stateMachine.unsettle$third_party_java_android_libs_rive_rive_android();
            return awmy.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession$beginPlaying$3$viewModelDirtyCollectors$1$1(ViewModelInstance viewModelInstance, RiveCanvasSession riveCanvasSession, awoq awoqVar) {
        super(2, awoqVar);
        this.$instance = viewModelInstance;
        this.this$0 = riveCanvasSession;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RiveCanvasSession$beginPlaying$3$viewModelDirtyCollectors$1$1(this.$instance, this.this$0, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveCanvasSession$beginPlaying$3$viewModelDirtyCollectors$1$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i == 0) {
            atqp.j(obj);
            ViewModelInstance viewModelInstance = this.$instance;
            RiveCanvasSession riveCanvasSession = this.this$0;
            axah dirtyFlow$third_party_java_android_libs_rive_rive_android = viewModelInstance.getDirtyFlow$third_party_java_android_libs_rive_rive_android();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(riveCanvasSession, viewModelInstance);
            this.label = 1;
            if (dirtyFlow$third_party_java_android_libs_rive_rive_android.collect(anonymousClass1, this) == awoxVar) {
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
