package app.rive;

import app.rive.core.CommandQueue;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class Artboard$stateMachineNamesCache$1 extends awpk implements awqg {
    int label;
    final /* synthetic */ Artboard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Artboard$stateMachineNamesCache$1(Artboard artboard, awoq awoqVar) {
        super(1, awoqVar);
        this.this$0 = artboard;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new Artboard$stateMachineNamesCache$1(this.this$0, awoqVar);
    }

    @Override // defpackage.awqg
    public final Object invoke(awoq awoqVar) {
        return ((Artboard$stateMachineNamesCache$1) create(awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
            return obj;
        }
        atqp.j(obj);
        Artboard artboard = this.this$0;
        CommandQueue riveWorker$third_party_java_android_libs_rive_rive_android = artboard.getRiveWorker$third_party_java_android_libs_rive_rive_android();
        long jM269getArtboardHandlenSTdbJo = artboard.m269getArtboardHandlenSTdbJo();
        this.label = 1;
        Object objM440getStateMachineNamesb88yb0A = riveWorker$third_party_java_android_libs_rive_rive_android.m440getStateMachineNamesb88yb0A(jM269getArtboardHandlenSTdbJo, this);
        return objM440getStateMachineNamesb88yb0A == awoxVar ? awoxVar : objM440getStateMachineNamesb88yb0A;
    }
}
