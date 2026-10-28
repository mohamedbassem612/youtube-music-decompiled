package app.rive;

import app.rive.core.CommandQueue;
import defpackage.ahk;
import defpackage.awqk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RiveKt$$ExternalSyntheticLambda28 implements awqk {
    public /* synthetic */ CommandQueue f$0;
    public /* synthetic */ StateMachine f$1;
    public /* synthetic */ boolean f$2;
    public /* synthetic */ int f$3;

    public /* synthetic */ RiveKt$$ExternalSyntheticLambda28(CommandQueue commandQueue, StateMachine stateMachine, boolean z, int i) {
        this.f$0 = commandQueue;
        this.f$1 = stateMachine;
        this.f$2 = z;
        this.f$3 = i;
    }

    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        return RiveKt.UnsettleOnPlaybackStartEffect$lambda$1(this.f$0, this.f$1, this.f$2, this.f$3, (ahk) obj, ((Integer) obj2).intValue());
    }
}
