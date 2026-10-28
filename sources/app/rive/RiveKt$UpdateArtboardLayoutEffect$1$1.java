package app.rive;

import app.rive.core.RiveSurface;
import defpackage.a;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awut;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveKt$UpdateArtboardLayoutEffect$1$1 extends awpk implements awqk {
    final /* synthetic */ Artboard $artboard;
    final /* synthetic */ Fit $fit;
    final /* synthetic */ StateMachine $stateMachine;
    final /* synthetic */ RiveSurface $surface;
    final /* synthetic */ int $surfaceHeight;
    final /* synthetic */ int $surfaceWidth;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$UpdateArtboardLayoutEffect$1$1(RiveSurface riveSurface, Fit fit, StateMachine stateMachine, Artboard artboard, int i, int i2, awoq awoqVar) {
        super(2, awoqVar);
        this.$surface = riveSurface;
        this.$fit = fit;
        this.$stateMachine = stateMachine;
        this.$artboard = artboard;
        this.$surfaceWidth = i;
        this.$surfaceHeight = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0$0(int i, int i2) {
        return a.bQ(i2, i, "Resizing artboard to ", " x ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$1$0() {
        return "Resetting artboard size";
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RiveKt$UpdateArtboardLayoutEffect$1$1(this.$surface, this.$fit, this.$stateMachine, this.$artboard, this.$surfaceWidth, this.$surfaceHeight, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveKt$UpdateArtboardLayoutEffect$1$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(obj);
        RiveSurface riveSurface = this.$surface;
        if (riveSurface == null) {
            return awmy.a;
        }
        Fit fit = this.$fit;
        boolean z = fit instanceof Fit.Layout;
        Artboard artboard = this.$artboard;
        if (z) {
            final int i = this.$surfaceWidth;
            final int i2 = this.$surfaceHeight;
            RiveLog.INSTANCE.getLogger().d("Rive/UI", new Function0() { // from class: app.rive.RiveKt$UpdateArtboardLayoutEffect$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveKt$UpdateArtboardLayoutEffect$1$1.invokeSuspend$lambda$0$0(i, i2);
                }
            });
            artboard.resizeArtboard(riveSurface, ((Fit.Layout) fit).getScaleFactor());
        } else {
            RiveLog.INSTANCE.getLogger().d("Rive/UI", new Function0() { // from class: app.rive.RiveKt$UpdateArtboardLayoutEffect$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveKt$UpdateArtboardLayoutEffect$1$1.invokeSuspend$lambda$1$0();
                }
            });
            artboard.resetArtboardSize();
        }
        this.$stateMachine.unsettle$third_party_java_android_libs_rive_rive_android();
        return awmy.a;
    }
}
