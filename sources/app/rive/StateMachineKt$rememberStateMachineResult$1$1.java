package app.rive;

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
final class StateMachineKt$rememberStateMachineResult$1$1 extends awpk implements awqk {
    final /* synthetic */ Artboard $artboard;
    final /* synthetic */ String $stateMachineName;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachineKt$rememberStateMachineResult$1$1(Artboard artboard, String str, awoq awoqVar) {
        super(2, awoqVar);
        this.$artboard = artboard;
        this.$stateMachineName = str;
    }

    static final awmy invokeSuspend$lambda$0(StateMachine stateMachine) {
        stateMachine.close();
        return awmy.a;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        StateMachineKt$rememberStateMachineResult$1$1 stateMachineKt$rememberStateMachineResult$1$1 = new StateMachineKt$rememberStateMachineResult$1$1(this.$artboard, this.$stateMachineName, awoqVar);
        stateMachineKt$rememberStateMachineResult$1$1.L$0 = obj;
        return stateMachineKt$rememberStateMachineResult$1$1;
    }

    @Override // defpackage.awqk
    public final Object invoke(aif aifVar, awoq awoqVar) {
        return ((StateMachineKt$rememberStateMachineResult$1$1) create(aifVar, awoqVar)).invokeSuspend(awmy.a);
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
            StateMachine.Companion companion = StateMachine.Companion;
            Artboard artboard = this.$artboard;
            String str = this.$stateMachineName;
            this.L$0 = aifVar2;
            this.label = 1;
            obj = companion.create(artboard, str, this);
            r1 = aifVar2;
            if (obj == awoxVar) {
                return awoxVar;
            }
            final StateMachine stateMachine = (StateMachine) obj;
            r1.f(new Result.Success(stateMachine));
            Function0 function0 = new Function0() { // from class: app.rive.StateMachineKt$rememberStateMachineResult$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StateMachineKt$rememberStateMachineResult$1$1.invokeSuspend$lambda$0(stateMachine);
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
