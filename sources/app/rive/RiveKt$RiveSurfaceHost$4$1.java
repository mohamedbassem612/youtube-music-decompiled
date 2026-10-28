package app.rive;

import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awut;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveKt$RiveSurfaceHost$4$1 extends awpk implements awqk {
    final /* synthetic */ boolean $focusAttached;
    final /* synthetic */ RiveFocusSession $focusSession;
    final /* synthetic */ RiveFocusState $polledFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$RiveSurfaceHost$4$1(boolean z, RiveFocusState riveFocusState, RiveFocusSession riveFocusSession, awoq awoqVar) {
        super(2, awoqVar);
        this.$focusAttached = z;
        this.$polledFocus = riveFocusState;
        this.$focusSession = riveFocusSession;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RiveKt$RiveSurfaceHost$4$1(this.$focusAttached, this.$polledFocus, this.$focusSession, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveKt$RiveSurfaceHost$4$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        RiveFocusState riveFocusState;
        RiveFocusSession riveFocusSession;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(obj);
        if (this.$focusAttached && (riveFocusState = this.$polledFocus) != null && (riveFocusSession = this.$focusSession) != null) {
            riveFocusSession.onRiveFocusChanged(riveFocusState instanceof RiveFocusState.Focused);
        }
        return awmy.a;
    }
}
