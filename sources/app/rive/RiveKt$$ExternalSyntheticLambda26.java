package app.rive;

import app.rive.core.CommandQueue;
import defpackage.ahk;
import defpackage.awqk;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RiveKt$$ExternalSyntheticLambda26 implements awqk {
    public /* synthetic */ CommandQueue f$0;
    public /* synthetic */ StateMachine f$1;
    public /* synthetic */ ViewModelInstance f$2;
    public /* synthetic */ Map f$3;
    public /* synthetic */ Function0 f$4;
    public /* synthetic */ int f$5;

    public /* synthetic */ RiveKt$$ExternalSyntheticLambda26(CommandQueue commandQueue, StateMachine stateMachine, ViewModelInstance viewModelInstance, Map map, Function0 function0, int i) {
        this.f$0 = commandQueue;
        this.f$1 = stateMachine;
        this.f$2 = viewModelInstance;
        this.f$3 = map;
        this.f$4 = function0;
        this.f$5 = i;
    }

    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        return RiveKt.BindViewModelInstancesEffect$lambda$1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (ahk) obj, ((Integer) obj2).intValue());
    }
}
