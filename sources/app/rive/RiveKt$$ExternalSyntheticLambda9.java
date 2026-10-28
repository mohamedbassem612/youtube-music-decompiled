package app.rive;

import app.rive.core.CommandQueue;
import app.rive.core.RiveSurface;
import defpackage.ahk;
import defpackage.awqk;
import defpackage.bog;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RiveKt$$ExternalSyntheticLambda9 implements awqk {
    public /* synthetic */ CommandQueue f$0;
    public /* synthetic */ bog f$1;
    public /* synthetic */ RiveFrameRate f$10;
    public /* synthetic */ int f$11;
    public /* synthetic */ int f$12;
    public /* synthetic */ int f$13;
    public /* synthetic */ boolean f$14;
    public /* synthetic */ boolean f$15;
    public /* synthetic */ int f$16;
    public /* synthetic */ int f$17;
    public /* synthetic */ RiveSurface f$2;
    public /* synthetic */ Artboard f$3;
    public /* synthetic */ StateMachine f$4;
    public /* synthetic */ ViewModelInstance f$5;
    public /* synthetic */ Map f$6;
    public /* synthetic */ Fit f$7;
    public /* synthetic */ int f$8;
    public /* synthetic */ boolean f$9;

    public /* synthetic */ RiveKt$$ExternalSyntheticLambda9(CommandQueue commandQueue, bog bogVar, RiveSurface riveSurface, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Map map, Fit fit, int i, boolean z, RiveFrameRate riveFrameRate, int i2, int i3, int i4, boolean z2, boolean z3, int i5, int i6) {
        this.f$0 = commandQueue;
        this.f$1 = bogVar;
        this.f$2 = riveSurface;
        this.f$3 = artboard;
        this.f$4 = stateMachine;
        this.f$5 = viewModelInstance;
        this.f$6 = map;
        this.f$7 = fit;
        this.f$8 = i;
        this.f$9 = z;
        this.f$10 = riveFrameRate;
        this.f$11 = i2;
        this.f$12 = i3;
        this.f$13 = i4;
        this.f$14 = z2;
        this.f$15 = z3;
        this.f$16 = i5;
        this.f$17 = i6;
    }

    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        return RiveKt.DrawRiveFramesEffect$lambda$1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, this.f$16, this.f$17, (ahk) obj, ((Integer) obj2).intValue());
    }
}
