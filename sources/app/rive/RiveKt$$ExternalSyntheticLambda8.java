package app.rive;

import app.rive.core.CommandQueue;
import defpackage.ahk;
import defpackage.awqk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RiveKt$$ExternalSyntheticLambda8 implements awqk {
    public /* synthetic */ CommandQueue f$0;
    public /* synthetic */ StateMachine f$1;
    public /* synthetic */ Fit f$2;
    public /* synthetic */ int f$3;
    public /* synthetic */ int f$4;

    public /* synthetic */ RiveKt$$ExternalSyntheticLambda8(CommandQueue commandQueue, StateMachine stateMachine, Fit fit, int i, int i2) {
        this.f$0 = commandQueue;
        this.f$1 = stateMachine;
        this.f$2 = fit;
        this.f$3 = i;
        this.f$4 = i2;
    }

    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        return RiveKt.UnsettleOnPresentationChangeEffect$lambda$1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (ahk) obj, ((Integer) obj2).intValue());
    }
}
