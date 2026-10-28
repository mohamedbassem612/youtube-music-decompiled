package app.rive;

import defpackage.ahk;
import defpackage.awqk;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RiveKt$$ExternalSyntheticLambda25 implements awqk {
    public /* synthetic */ StateMachine f$0;
    public /* synthetic */ RiveTextureView f$1;
    public /* synthetic */ boolean f$2;
    public /* synthetic */ Function0 f$3;
    public /* synthetic */ int f$4;

    public /* synthetic */ RiveKt$$ExternalSyntheticLambda25(StateMachine stateMachine, RiveTextureView riveTextureView, boolean z, Function0 function0, int i) {
        this.f$0 = stateMachine;
        this.f$1 = riveTextureView;
        this.f$2 = z;
        this.f$3 = function0;
        this.f$4 = i;
    }

    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        return RiveKt.RiveSemanticsEffects$lambda$4(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (ahk) obj, ((Integer) obj2).intValue());
    }
}
