package app.rive;

import app.rive.core.CommandQueue;
import defpackage.ahk;
import defpackage.akq;
import defpackage.awqg;
import defpackage.awqk;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RiveKt$$ExternalSyntheticLambda14 implements awqk {
    public /* synthetic */ CommandQueue f$0;
    public /* synthetic */ RiveSurfaceState f$1;
    public /* synthetic */ Function0 f$10;
    public /* synthetic */ int f$11;
    public /* synthetic */ int f$12;
    public /* synthetic */ ReadyResources f$2;
    public /* synthetic */ akq f$3;
    public /* synthetic */ Fit f$4;
    public /* synthetic */ RivePointerInputMode f$5;
    public /* synthetic */ RiveFrameRate f$6;
    public /* synthetic */ boolean f$7;
    public /* synthetic */ boolean f$8;
    public /* synthetic */ awqg f$9;

    public /* synthetic */ RiveKt$$ExternalSyntheticLambda14(CommandQueue commandQueue, RiveSurfaceState riveSurfaceState, ReadyResources readyResources, akq akqVar, Fit fit, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, boolean z, boolean z2, awqg awqgVar, Function0 function0, int i, int i2) {
        this.f$0 = commandQueue;
        this.f$1 = riveSurfaceState;
        this.f$2 = readyResources;
        this.f$3 = akqVar;
        this.f$4 = fit;
        this.f$5 = rivePointerInputMode;
        this.f$6 = riveFrameRate;
        this.f$7 = z;
        this.f$8 = z2;
        this.f$9 = awqgVar;
        this.f$10 = function0;
        this.f$11 = i;
        this.f$12 = i2;
    }

    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        return RiveKt.RiveSurfaceHost$lambda$14(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, (ahk) obj, ((Integer) obj2).intValue());
    }
}
