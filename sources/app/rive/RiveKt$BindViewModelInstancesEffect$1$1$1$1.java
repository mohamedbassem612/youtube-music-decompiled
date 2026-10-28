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
final class RiveKt$BindViewModelInstancesEffect$1$1$1$1 extends awpk implements awqk {
    final /* synthetic */ ViewModelInstance $instance;
    final /* synthetic */ Function0 $requestPausedFrame;
    final /* synthetic */ StateMachine $stateMachine;
    final /* synthetic */ long $stateMachineHandle;
    int label;

    /* JADX INFO: renamed from: app.rive.RiveKt$BindViewModelInstancesEffect$1$1$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass1 implements awzd {
        final /* synthetic */ ViewModelInstance $instance;
        final /* synthetic */ Function0 $requestPausedFrame;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ long $stateMachineHandle;

        public AnonymousClass1(StateMachine stateMachine, Function0 function0, ViewModelInstance viewModelInstance, long j) {
            this.$stateMachine = stateMachine;
            this.$requestPausedFrame = function0;
            this.$instance = viewModelInstance;
            this.$stateMachineHandle = j;
        }

        static final String emit$lambda$0(ViewModelInstance viewModelInstance, long j) {
            return "View model instance " + ViewModelInstanceHandle.m583toStringimpl(viewModelInstance.m325getInstanceHandleVPLto4w()) + " dirty, unsettling " + StateMachineHandle.m569toStringimpl(j);
        }

        @Override // defpackage.awzd
        public final Object emit(awmy awmyVar, awoq awoqVar) {
            final ViewModelInstance viewModelInstance = this.$instance;
            final long j = this.$stateMachineHandle;
            RiveLog.INSTANCE.getLogger().v(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0() { // from class: app.rive.RiveKt$BindViewModelInstancesEffect$1$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveKt$BindViewModelInstancesEffect$1$1$1$1.AnonymousClass1.emit$lambda$0(viewModelInstance, j);
                }
            });
            this.$stateMachine.unsettle$third_party_java_android_libs_rive_rive_android();
            this.$requestPausedFrame.invoke();
            return awmy.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$BindViewModelInstancesEffect$1$1$1$1(ViewModelInstance viewModelInstance, StateMachine stateMachine, Function0 function0, long j, awoq awoqVar) {
        super(2, awoqVar);
        this.$instance = viewModelInstance;
        this.$stateMachine = stateMachine;
        this.$requestPausedFrame = function0;
        this.$stateMachineHandle = j;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RiveKt$BindViewModelInstancesEffect$1$1$1$1(this.$instance, this.$stateMachine, this.$requestPausedFrame, this.$stateMachineHandle, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveKt$BindViewModelInstancesEffect$1$1$1$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i == 0) {
            atqp.j(obj);
            ViewModelInstance viewModelInstance = this.$instance;
            StateMachine stateMachine = this.$stateMachine;
            Function0 function0 = this.$requestPausedFrame;
            long j = this.$stateMachineHandle;
            axah dirtyFlow$third_party_java_android_libs_rive_rive_android = viewModelInstance.getDirtyFlow$third_party_java_android_libs_rive_rive_android();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(stateMachine, function0, viewModelInstance, j);
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
