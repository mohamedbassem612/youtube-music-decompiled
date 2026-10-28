package app.rive;

import app.rive.core.CommandQueue;
import app.rive.core.RiveSurface;
import defpackage.ahk;
import defpackage.awqk;
import defpackage.bog;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RiveKt$$ExternalSyntheticLambda30 implements awqk {
    public /* synthetic */ CommandQueue f$0;
    public /* synthetic */ ReadyResources f$1;
    public /* synthetic */ int f$10;
    public /* synthetic */ int f$11;
    public /* synthetic */ int f$12;
    public /* synthetic */ Function0 f$13;
    public /* synthetic */ RiveTextureView f$14;
    public /* synthetic */ boolean f$15;
    public /* synthetic */ boolean f$16;
    public /* synthetic */ int f$17;
    public /* synthetic */ int f$18;
    public /* synthetic */ ViewModelInstance f$2;
    public /* synthetic */ Map f$3;
    public /* synthetic */ Fit f$4;
    public /* synthetic */ int f$5;
    public /* synthetic */ boolean f$6;
    public /* synthetic */ RiveFrameRate f$7;
    public /* synthetic */ bog f$8;
    public /* synthetic */ RiveSurface f$9;

    public /* synthetic */ RiveKt$$ExternalSyntheticLambda30(CommandQueue commandQueue, ReadyResources readyResources, ViewModelInstance viewModelInstance, Map map, Fit fit, int i, boolean z, RiveFrameRate riveFrameRate, bog bogVar, RiveSurface riveSurface, int i2, int i3, int i4, Function0 function0, RiveTextureView riveTextureView, boolean z2, boolean z3, int i5, int i6) {
        this.f$0 = commandQueue;
        this.f$1 = readyResources;
        this.f$2 = viewModelInstance;
        this.f$3 = map;
        this.f$4 = fit;
        this.f$5 = i;
        this.f$6 = z;
        this.f$7 = riveFrameRate;
        this.f$8 = bogVar;
        this.f$9 = riveSurface;
        this.f$10 = i2;
        this.f$11 = i3;
        this.f$12 = i4;
        this.f$13 = function0;
        this.f$14 = riveTextureView;
        this.f$15 = z2;
        this.f$16 = z3;
        this.f$17 = i5;
        this.f$18 = i6;
    }

    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        return RiveKt.RiveResourceEffects$lambda$0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, this.f$16, this.f$17, this.f$18, (ahk) obj, ((Integer) obj2).intValue());
    }
}
