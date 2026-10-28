package app.rive.core;

import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqg;
import defpackage.awqk;
import defpackage.awud;
import defpackage.awut;
import internal.org.jni_zero.JniZero;

/* JADX INFO: renamed from: app.rive.core.CommandQueue$getNumberProperty-iFQtAB8$$inlined$suspendNativeRequest$1, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class CommandQueue$getNumberPropertyiFQtAB8$$inlined$suspendNativeRequest$1 extends awpk implements awqk {
    final /* synthetic */ String $propertyPath$inlined;
    final /* synthetic */ long $viewModelInstanceHandle$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CommandQueue this$0;
    final /* synthetic */ CommandQueue this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandQueue$getNumberPropertyiFQtAB8$$inlined$suspendNativeRequest$1(CommandQueue commandQueue, awoq awoqVar, CommandQueue commandQueue2, long j, String str) {
        super(2, awoqVar);
        this.this$0$inline_fun = commandQueue;
        this.this$0 = commandQueue2;
        this.$viewModelInstanceHandle$inlined = j;
        this.$propertyPath$inlined = str;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new CommandQueue$getNumberPropertyiFQtAB8$$inlined$suspendNativeRequest$1(this.this$0$inline_fun, awoqVar, this.this$0, this.$viewModelInstanceHandle$inlined, this.$propertyPath$inlined);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((CommandQueue$getNumberPropertyiFQtAB8$$inlined$suspendNativeRequest$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
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
        final CommandQueue commandQueue = this.this$0$inline_fun;
        this.L$0 = commandQueue;
        this.label = 1;
        awud awudVar = new awud(JniZero.q(this), 1);
        awudVar.w();
        final long andIncrement = commandQueue.nextRequestID.getAndIncrement();
        commandQueue.pendingContinuations.put(new Long(andIncrement), awudVar);
        awudVar.b(new awqg() { // from class: app.rive.core.CommandQueue$getNumberProperty-iFQtAB8$$inlined$suspendNativeRequest$1.1
            public final void invoke(Throwable th) {
                commandQueue.pendingContinuations.remove(Long.valueOf(andIncrement));
            }

            @Override // defpackage.awqg
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((Throwable) obj2);
                return awmy.a;
            }
        });
        try {
            this.this$0.bridge.cppGetNumberProperty(this.this$0.requireNativePointer(), andIncrement, this.$viewModelInstanceHandle$inlined, this.$propertyPath$inlined);
            Object objJ = awudVar.j();
            return objJ == awoxVar ? awoxVar : objJ;
        } catch (Throwable th) {
            commandQueue.pendingContinuations.remove(new Long(andIncrement));
            throw th;
        }
    }
}
