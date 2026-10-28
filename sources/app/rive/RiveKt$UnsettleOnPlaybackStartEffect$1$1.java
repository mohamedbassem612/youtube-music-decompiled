package app.rive;

import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awut;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveKt$UnsettleOnPlaybackStartEffect$1$1 extends awpk implements awqk {
    final /* synthetic */ boolean $playing;
    final /* synthetic */ StateMachine $stateMachine;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$UnsettleOnPlaybackStartEffect$1$1(boolean z, StateMachine stateMachine, awoq awoqVar) {
        super(2, awoqVar);
        this.$playing = z;
        this.$stateMachine = stateMachine;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RiveKt$UnsettleOnPlaybackStartEffect$1$1(this.$playing, this.$stateMachine, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveKt$UnsettleOnPlaybackStartEffect$1$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(obj);
        if (this.$playing) {
            this.$stateMachine.unsettle$third_party_java_android_libs_rive_rive_android();
        }
        return awmy.a;
    }
}
