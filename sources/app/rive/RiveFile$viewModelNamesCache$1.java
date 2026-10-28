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
final class RiveFile$viewModelNamesCache$1 extends awpk implements awqg {
    int label;
    final /* synthetic */ RiveFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFile$viewModelNamesCache$1(RiveFile riveFile, awoq awoqVar) {
        super(1, awoqVar);
        this.this$0 = riveFile;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new RiveFile$viewModelNamesCache$1(this.this$0, awoqVar);
    }

    @Override // defpackage.awqg
    public final Object invoke(awoq awoqVar) {
        return ((RiveFile$viewModelNamesCache$1) create(awoqVar)).invokeSuspend(awmy.a);
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
        RiveFile riveFile = this.this$0;
        CommandQueue riveWorker = riveFile.getRiveWorker();
        long jM289getFileHandleENT3xMk = riveFile.m289getFileHandleENT3xMk();
        this.label = 1;
        Object objM445getViewModelNamesevklBmw = riveWorker.m445getViewModelNamesevklBmw(jM289getFileHandleENT3xMk, this);
        return objM445getViewModelNamesevklBmw == awoxVar ? awoxVar : objM445getViewModelNamesevklBmw;
    }
}
