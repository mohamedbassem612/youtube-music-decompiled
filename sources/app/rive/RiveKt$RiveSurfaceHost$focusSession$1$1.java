package app.rive;

import defpackage.awoq;
import defpackage.awqk;
import defpackage.awrb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class RiveKt$RiveSurfaceHost$focusSession$1$1 extends awrb implements awqk {
    public RiveKt$RiveSurfaceHost$focusSession$1$1(Object obj) {
        super(2, obj, StateMachine.class, "moveFocus", "moveFocus(Lapp/rive/RiveFocusDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.awqk
    public final Object invoke(RiveFocusDirection riveFocusDirection, awoq awoqVar) {
        return ((StateMachine) this.receiver).moveFocus(riveFocusDirection, awoqVar);
    }
}
