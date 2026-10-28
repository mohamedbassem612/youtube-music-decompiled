package app.rive;

import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awpk;
import defpackage.awqk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveKt$DrawRiveFramesEffect$1$1$4$2$1 extends awpk implements awqk {
    /* synthetic */ boolean Z$0;
    int label;

    public RiveKt$DrawRiveFramesEffect$1$1$4$2$1(awoq awoqVar) {
        super(2, awoqVar);
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        RiveKt$DrawRiveFramesEffect$1$1$4$2$1 riveKt$DrawRiveFramesEffect$1$1$4$2$1 = new RiveKt$DrawRiveFramesEffect$1$1$4$2$1(awoqVar);
        riveKt$DrawRiveFramesEffect$1$1$4$2$1.Z$0 = ((Boolean) obj).booleanValue();
        return riveKt$DrawRiveFramesEffect$1$1$4$2$1;
    }

    public final Object invoke(boolean z, awoq awoqVar) {
        return ((RiveKt$DrawRiveFramesEffect$1$1$4$2$1) create(Boolean.valueOf(z), awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(obj);
        return Boolean.valueOf(!this.Z$0);
    }

    @Override // defpackage.awqk
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (awoq) obj2);
    }
}
