package app.rive;

import app.rive.core.StateMachineHandle;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awut;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveKt$UnsettleOnPresentationChangeEffect$1$1 extends awpk implements awqk {
    final /* synthetic */ StateMachine $stateMachine;
    final /* synthetic */ long $stateMachineHandle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$UnsettleOnPresentationChangeEffect$1$1(StateMachine stateMachine, long j, awoq awoqVar) {
        super(2, awoqVar);
        this.$stateMachine = stateMachine;
        this.$stateMachineHandle = j;
    }

    static final String invokeSuspend$lambda$0(long j) {
        return "State machine " + StateMachineHandle.m569toStringimpl(j) + " unsettled due to parameter change";
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RiveKt$UnsettleOnPresentationChangeEffect$1$1(this.$stateMachine, this.$stateMachineHandle, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveKt$UnsettleOnPresentationChangeEffect$1$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(obj);
        final long j = this.$stateMachineHandle;
        RiveLog.INSTANCE.getLogger().d("Rive/UI/SM", new Function0() { // from class: app.rive.RiveKt$UnsettleOnPresentationChangeEffect$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveKt$UnsettleOnPresentationChangeEffect$1$1.invokeSuspend$lambda$0(j);
            }
        });
        this.$stateMachine.unsettle$third_party_java_android_libs_rive_rive_android();
        return awmy.a;
    }
}
