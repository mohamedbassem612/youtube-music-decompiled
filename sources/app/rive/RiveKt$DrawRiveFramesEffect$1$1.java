package app.rive;

import app.rive.core.ArtboardHandle;
import app.rive.core.CommandQueue;
import app.rive.core.RiveSurface;
import app.rive.core.StateMachineHandle;
import defpackage.alh;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awrc;
import defpackage.awtl;
import defpackage.awtn;
import defpackage.awut;
import defpackage.bob;
import defpackage.boc;
import defpackage.bog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveKt$DrawRiveFramesEffect$1$1 extends awpk implements awqk {
    final /* synthetic */ long $artboardHandle;
    final /* synthetic */ int $backgroundColor;
    final /* synthetic */ Fit $fit;
    final /* synthetic */ boolean $focusEnabled;
    final /* synthetic */ RiveFrameRate $frameRate;
    final /* synthetic */ bog $lifecycleOwner;
    final /* synthetic */ boolean $playing;
    final /* synthetic */ CommandQueue $riveWorker;
    final /* synthetic */ boolean $semanticsEnabled;
    final /* synthetic */ StateMachine $stateMachine;
    final /* synthetic */ long $stateMachineHandle;
    final /* synthetic */ RiveSurface $surface;
    final /* synthetic */ int $surfaceHeight;
    final /* synthetic */ int $surfaceWidth;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$DrawRiveFramesEffect$1$1(RiveSurface riveSurface, boolean z, bog bogVar, boolean z2, CommandQueue commandQueue, long j, boolean z3, int i, int i2, StateMachine stateMachine, Fit fit, long j2, int i3, RiveFrameRate riveFrameRate, awoq awoqVar) {
        super(2, awoqVar);
        this.$surface = riveSurface;
        this.$playing = z;
        this.$lifecycleOwner = bogVar;
        this.$focusEnabled = z2;
        this.$riveWorker = commandQueue;
        this.$stateMachineHandle = j;
        this.$semanticsEnabled = z3;
        this.$surfaceWidth = i;
        this.$surfaceHeight = i2;
        this.$stateMachine = stateMachine;
        this.$fit = fit;
        this.$artboardHandle = j2;
        this.$backgroundColor = i3;
        this.$frameRate = riveFrameRate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0$0() {
        return "Surface is null, skipping drawing";
    }

    static final String invokeSuspend$lambda$1() {
        return "Surface is closed, skipping drawing";
    }

    static final String invokeSuspend$lambda$2() {
        return "Playing is false. Advancing by 0, drawing once, and skipping advancement loop.";
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        RiveKt$DrawRiveFramesEffect$1$1 riveKt$DrawRiveFramesEffect$1$1 = new RiveKt$DrawRiveFramesEffect$1$1(this.$surface, this.$playing, this.$lifecycleOwner, this.$focusEnabled, this.$riveWorker, this.$stateMachineHandle, this.$semanticsEnabled, this.$surfaceWidth, this.$surfaceHeight, this.$stateMachine, this.$fit, this.$artboardHandle, this.$backgroundColor, this.$frameRate, awoqVar);
        riveKt$DrawRiveFramesEffect$1$1.L$0 = obj;
        return riveKt$DrawRiveFramesEffect$1$1;
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveKt$DrawRiveFramesEffect$1$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i == 0) {
            atqp.j(obj);
            RiveSurface riveSurface = this.$surface;
            if (riveSurface == null) {
                RiveLog.INSTANCE.getLogger().d("Rive/UI/Draw", new Function0() { // from class: app.rive.RiveKt$DrawRiveFramesEffect$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RiveKt$DrawRiveFramesEffect$1$1.invokeSuspend$lambda$0$0();
                    }
                });
                return awmy.a;
            }
            if (riveSurface.getClosed()) {
                RiveLog.INSTANCE.getLogger().d("Rive/UI/Draw", new Function0() { // from class: app.rive.RiveKt$DrawRiveFramesEffect$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RiveKt$DrawRiveFramesEffect$1$1.invokeSuspend$lambda$1();
                    }
                });
                return awmy.a;
            }
            if (this.$playing) {
                bog bogVar = this.$lifecycleOwner;
                RiveFrameRate riveFrameRate = this.$frameRate;
                StateMachine stateMachine = this.$stateMachine;
                long j = this.$artboardHandle;
                long j2 = this.$stateMachineHandle;
                boolean z = this.$focusEnabled;
                CommandQueue commandQueue = this.$riveWorker;
                boolean z2 = this.$semanticsEnabled;
                int i2 = this.$surfaceWidth;
                int i3 = this.$surfaceHeight;
                Fit fit = this.$fit;
                int i4 = this.$backgroundColor;
                boc lifecycle = bogVar.getLifecycle();
                bob bobVar = bob.e;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(riveFrameRate, stateMachine, riveSurface, j, j2, z, commandQueue, z2, i2, i3, fit, i4, null);
                this.label = 1;
                if (alh.d(lifecycle, bobVar, anonymousClass4, this) == awoxVar) {
                    return awoxVar;
                }
            } else {
                RiveLog.INSTANCE.getLogger().d("Rive/UI/Draw", new Function0() { // from class: app.rive.RiveKt$DrawRiveFramesEffect$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RiveKt$DrawRiveFramesEffect$1$1.invokeSuspend$lambda$2();
                    }
                });
                boolean z3 = this.$focusEnabled;
                CommandQueue commandQueue2 = this.$riveWorker;
                long j3 = this.$stateMachineHandle;
                boolean z4 = this.$semanticsEnabled;
                int i5 = this.$surfaceWidth;
                int i6 = this.$surfaceHeight;
                StateMachine stateMachine2 = this.$stateMachine;
                Fit fit2 = this.$fit;
                long j4 = this.$artboardHandle;
                int i7 = this.$backgroundColor;
                int i8 = awtl.b;
                stateMachine2.m317advanceLRDsOJo(awrc.i(0, awtn.NANOSECONDS));
                if (z3) {
                    commandQueue2.m456pollFocusAkTCgDQ(j3);
                }
                if (z4 && i5 > 0 && i6 > 0) {
                    stateMachine2.drainSemanticsDiff(fit2, i5, i6);
                }
                commandQueue2.m424drawOcc3x_Y(j4, j3, riveSurface, fit2, i7);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$DrawRiveFramesEffect$1$1$4, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass4 extends awpk implements awqk {
        final /* synthetic */ RiveSurface $activeSurface;
        final /* synthetic */ long $artboardHandle;
        final /* synthetic */ int $backgroundColor;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ boolean $focusEnabled;
        final /* synthetic */ RiveFrameRate $frameRate;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ boolean $semanticsEnabled;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ long $stateMachineHandle;
        final /* synthetic */ int $surfaceHeight;
        final /* synthetic */ int $surfaceWidth;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RiveFrameRate riveFrameRate, StateMachine stateMachine, RiveSurface riveSurface, long j, long j2, boolean z, CommandQueue commandQueue, boolean z2, int i, int i2, Fit fit, int i3, awoq awoqVar) {
            super(2, awoqVar);
            this.$frameRate = riveFrameRate;
            this.$stateMachine = stateMachine;
            this.$activeSurface = riveSurface;
            this.$artboardHandle = j;
            this.$stateMachineHandle = j2;
            this.$focusEnabled = z;
            this.$riveWorker = commandQueue;
            this.$semanticsEnabled = z2;
            this.$surfaceWidth = i;
            this.$surfaceHeight = i2;
            this.$fit = fit;
            this.$backgroundColor = i3;
        }

        static final String invokeSuspend$lambda$0(long j, long j2) {
            return "Starting drawing with " + ArtboardHandle.m375toStringimpl(j) + " and " + StateMachineHandle.m569toStringimpl(j2);
        }

        static final String invokeSuspend$lambda$3() {
            return "Surface was released, stopping draw loop";
        }

        static final String invokeSuspend$lambda$5(long j, long j2) {
            return "Ending drawing with " + ArtboardHandle.m375toStringimpl(j) + " and " + StateMachineHandle.m569toStringimpl(j2);
        }

        @Override // defpackage.awpe
        public final awoq create(Object obj, awoq awoqVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$frameRate, this.$stateMachine, this.$activeSurface, this.$artboardHandle, this.$stateMachineHandle, this.$focusEnabled, this.$riveWorker, this.$semanticsEnabled, this.$surfaceWidth, this.$surfaceHeight, this.$fit, this.$backgroundColor, awoqVar);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // defpackage.awqk
        public final Object invoke(awut awutVar, awoq awoqVar) {
            return ((AnonymousClass4) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0079  */
        /* JADX WARN: Code duplicated, block: B:18:0x008b  */
        /* JADX WARN: Code duplicated, block: B:50:0x0191  */
        /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d8 -> B:14:0x0073). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00eb -> B:29:0x00ed). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.awpe
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.rive.RiveKt$DrawRiveFramesEffect$1$1.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final long invokeSuspend$lambda$2(long j) {
            return j;
        }
    }
}
