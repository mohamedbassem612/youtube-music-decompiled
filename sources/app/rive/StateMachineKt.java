package app.rive;

import defpackage.ahj;
import defpackage.ahk;
import defpackage.ahr;
import defpackage.ahs;
import defpackage.aie;
import defpackage.awqg;
import defpackage.awqk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class StateMachineKt {
    private static final String STATE_MACHINE_TAG = "Rive/StateMachine";

    public static final StateMachine rememberStateMachine(Artboard artboard, String str, ahk ahkVar, int i, int i2) {
        artboard.getClass();
        boolean z = (((i & 14) ^ 6) > 4 && ahkVar.t()) || (i & 6) == 4;
        if ((i2 & 2) != 0) {
            str = null;
        }
        boolean z2 = z | ((((i & 112) ^ 48) > 32 && ahkVar.t()) || (i & 48) == 32);
        Object objC = ahkVar.c();
        if (z2 || objC == ahj.a) {
            objC = StateMachine.Companion.fromArtboard(artboard, str);
            ahkVar.D();
        }
        final StateMachine stateMachine = (StateMachine) objC;
        boolean zV = ahkVar.v();
        Object objC2 = ahkVar.c();
        if (zV || objC2 == ahj.a) {
            objC2 = new awqg() { // from class: app.rive.StateMachineKt$$ExternalSyntheticLambda0
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return StateMachineKt.rememberStateMachine$lambda$1$0(stateMachine, (ahs) obj);
                }
            };
            ahkVar.D();
        }
        ahs.b(ahkVar);
        return stateMachine;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahr rememberStateMachine$lambda$1$0(final StateMachine stateMachine, ahs ahsVar) {
        ahsVar.getClass();
        return new ahr() { // from class: app.rive.StateMachineKt$rememberStateMachine$lambda$1$0$$inlined$onDispose$1
            public void dispose() {
                stateMachine.close();
            }
        };
    }

    public static final Result rememberStateMachineResult(Artboard artboard, String str, ahk ahkVar, int i, int i2) {
        artboard.getClass();
        ahkVar.F();
        ahkVar.z();
        int i3 = (i & 14) ^ 6;
        Result.Loading loading = Result.Loading.INSTANCE;
        boolean z = ((i3 > 4 && ahkVar.v()) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ahkVar.t()) || (i & 48) == 32);
        Object objC = ahkVar.c();
        if (z || objC == ahj.a) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            StateMachineKt$rememberStateMachineResult$1$1 stateMachineKt$rememberStateMachineResult$1$1 = new StateMachineKt$rememberStateMachineResult$1$1(artboard, str, null);
            ahkVar.D();
            objC = stateMachineKt$rememberStateMachineResult$1$1;
        }
        Result result = (Result) aie.d(loading, (awqk) objC, ahkVar).e();
        ahkVar.f();
        return result;
    }
}
