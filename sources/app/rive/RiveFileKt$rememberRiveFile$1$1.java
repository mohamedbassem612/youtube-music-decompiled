package app.rive;

import app.rive.core.CommandQueue;
import defpackage.aif;
import defpackage.atqp;
import defpackage.awmh;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveFileKt$rememberRiveFile$1$1 extends awpk implements awqk {
    final /* synthetic */ CommandQueue $riveWorker;
    final /* synthetic */ RiveFileSource $source;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFileKt$rememberRiveFile$1$1(RiveFileSource riveFileSource, CommandQueue commandQueue, awoq awoqVar) {
        super(2, awoqVar);
        this.$source = riveFileSource;
        this.$riveWorker = commandQueue;
    }

    static final awmy invokeSuspend$lambda$0(RiveFile riveFile) {
        riveFile.close();
        return awmy.a;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        RiveFileKt$rememberRiveFile$1$1 riveFileKt$rememberRiveFile$1$1 = new RiveFileKt$rememberRiveFile$1$1(this.$source, this.$riveWorker, awoqVar);
        riveFileKt$rememberRiveFile$1$1.L$0 = obj;
        return riveFileKt$rememberRiveFile$1$1;
    }

    @Override // defpackage.awqk
    public final Object invoke(aif aifVar, awoq awoqVar) {
        return ((RiveFileKt$rememberRiveFile$1$1) create(aifVar, awoqVar)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aif] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aif] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        ?? r1 = this.label;
        try {
            if (r1 != 0) {
                if (r1 == 1) {
                    aif aifVar = (aif) this.L$0;
                    atqp.j(obj);
                    r1 = aifVar;
                } else {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atqp.j(obj);
                }
                throw new awmh();
            }
            atqp.j(obj);
            aif aifVar2 = (aif) this.L$0;
            RiveFile.Companion companion = RiveFile.Companion;
            RiveFileSource riveFileSource = this.$source;
            CommandQueue commandQueue = this.$riveWorker;
            this.L$0 = aifVar2;
            this.label = 1;
            obj = companion.load(riveFileSource, commandQueue, this);
            r1 = aifVar2;
            if (obj == awoxVar) {
                return awoxVar;
            }
            final RiveFile riveFile = (RiveFile) obj;
            r1.f(new Result.Success(riveFile));
            Function0 function0 = new Function0() { // from class: app.rive.RiveFileKt$rememberRiveFile$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileKt$rememberRiveFile$1$1.invokeSuspend$lambda$0(riveFile);
                }
            };
            this.L$0 = null;
            this.label = 2;
            if (r1.a(function0, this) == awoxVar) {
                return awoxVar;
            }
            throw new awmh();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            r1.f(new Result.Error(e2));
            return awmy.a;
        }
    }
}
