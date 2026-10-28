package app.rive;

import app.rive.core.CommandQueue;
import app.rive.core.RiveSurface;
import defpackage.ahk;
import defpackage.awqk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RiveKt$$ExternalSyntheticLambda31 implements awqk {
    public /* synthetic */ CommandQueue f$0;
    public /* synthetic */ Artboard f$1;
    public /* synthetic */ StateMachine f$2;
    public /* synthetic */ Fit f$3;
    public /* synthetic */ RiveSurface f$4;
    public /* synthetic */ int f$5;
    public /* synthetic */ int f$6;
    public /* synthetic */ int f$7;

    public /* synthetic */ RiveKt$$ExternalSyntheticLambda31(CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, Fit fit, RiveSurface riveSurface, int i, int i2, int i3) {
        this.f$0 = commandQueue;
        this.f$1 = artboard;
        this.f$2 = stateMachine;
        this.f$3 = fit;
        this.f$4 = riveSurface;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$7 = i3;
    }

    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        return RiveKt.UpdateArtboardLayoutEffect$lambda$1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (ahk) obj, ((Integer) obj2).intValue());
    }
}
