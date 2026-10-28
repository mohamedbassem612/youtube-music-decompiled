package app.rive;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import app.rive.core.CheckableAutoCloseable;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.FrameTicker;
import app.rive.core.FrameTickerKt;
import app.rive.core.RenderingDefaults;
import app.rive.core.StateMachineHandle;
import app.rive.core.ViewModelInstanceHandle;
import app.rive.semantics.AndroidAccessibilityStateProvider;
import app.rive.semantics.RiveSemanticsModeController;
import app.rive.semantics.SemanticState;
import defpackage.a;
import defpackage.atqp;
import defpackage.atqq;
import defpackage.awmy;
import defpackage.awnp;
import defpackage.awoa;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpg;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awqp;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.awro;
import defpackage.awuj;
import defpackage.awuk;
import defpackage.awut;
import defpackage.awwd;
import defpackage.axae;
import defpackage.axaf;
import defpackage.axah;
import defpackage.axal;
import defpackage.axaw;
import defpackage.boc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveCanvasSession implements CheckableAutoCloseable {
    private static final String TAG = "Rive/CanvasSession";
    private final axae _frameAvailable;
    private final Artboard artboard;
    private final List boundViewModelInstances;
    private final int clearColor;
    private final Paint clearPaint;
    private final awuj closeSignal;
    private final CloseOnce closer;
    private final Fit fit;
    private final axah frameAvailable;
    private final Map globalViewModelInstancesSnapshot;
    private boolean isPlaying;
    private Bitmap latestBitmap;
    private final awqp pointerDownFn;
    private final awqp pointerExitFn;
    private final awqp pointerMoveFn;
    private final awqp pointerUpFn;
    private HardwareRenderBuffer renderBuffer;
    private final axaf renderBufferState;
    private final Rect renderRegion;
    private final CommandQueue riveWorker;
    private boolean semanticsEnabled;
    private final RiveSemanticsModeController semanticsModeController;
    private final StateMachine stateMachine;
    private final ViewModelInstance viewModelInstance;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass1 extends awpg {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(awoq awoqVar) {
            super(awoqVar);
        }

        @Override // defpackage.awpe
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RiveCanvasSession.this.beginPlaying(null, null, this);
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$3, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass3 extends awpk implements awqk {
        final /* synthetic */ boc $lifecycle;
        final /* synthetic */ FrameTicker $ticker;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boc bocVar, FrameTicker frameTicker, awoq awoqVar) {
            super(2, awoqVar);
            this.$lifecycle = bocVar;
            this.$ticker = frameTicker;
        }

        @Override // defpackage.awpe
        public final awoq create(Object obj, awoq awoqVar) {
            AnonymousClass3 anonymousClass3 = RiveCanvasSession.this.new AnonymousClass3(this.$lifecycle, this.$ticker, awoqVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.awqk
        public final Object invoke(awut awutVar, awoq awoqVar) {
            return ((AnonymousClass3) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:32:0x010a  */
        /* JADX WARN: Code duplicated, block: B:40:0x0132  */
        /* JADX WARN: Code duplicated, block: B:46:0x014f  */
        /* JADX WARN: Code duplicated, block: B:56:0x0164 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:44:0x0149->B:58:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x0164 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:1: B:30:0x0104->B:62:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
        @Override // defpackage.awpe
        public final Object invokeSuspend(Object obj) throws Throwable {
            List arrayList;
            awwd awwdVarT;
            awwd awwdVarT2;
            awwd awwdVar;
            Throwable th;
            awwd awwdVar2;
            List list;
            awwd awwdVar3;
            List list2;
            Iterator it;
            awwd awwdVar4;
            Throwable th2;
            Iterator it2;
            awwd awwdVar5;
            awox awoxVar = awox.a;
            switch (this.label) {
                case 0:
                    atqp.j(obj);
                    awut awutVar = (awut) this.L$0;
                    RiveCanvasSession riveCanvasSession = RiveCanvasSession.this;
                    List list3 = riveCanvasSession.boundViewModelInstances;
                    arrayList = new ArrayList(atqq.N(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(awro.t(awutVar, null, 0, new RiveCanvasSession$beginPlaying$3$viewModelDirtyCollectors$1$1((ViewModelInstance) it3.next(), riveCanvasSession, null), 3));
                    }
                    awwdVarT = awro.t(awutVar, null, 0, new RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1(RiveCanvasSession.this, null), 3);
                    awwd awwdVarT3 = awro.t(awutVar, null, 0, new RiveCanvasSession$beginPlaying$3$renderLoop$1(this.$lifecycle, RiveCanvasSession.this, this.$ticker, null), 3);
                    awwdVarT2 = awro.t(awutVar, null, 0, new RiveCanvasSession$beginPlaying$3$closeWatcher$1(RiveCanvasSession.this, awwdVarT3, null), 3);
                    try {
                        this.L$0 = arrayList;
                        this.L$1 = awwdVarT;
                        this.L$2 = awwdVarT2;
                        this.label = 1;
                        if (awwdVarT3.l(this) == awoxVar) {
                            return awoxVar;
                        }
                        this.L$0 = arrayList;
                        this.L$1 = awwdVarT;
                        this.L$2 = null;
                        this.label = 2;
                        if (awro.x(awwdVarT2, this) != awoxVar) {
                            return awoxVar;
                        }
                        awwdVar3 = awwdVarT;
                        list2 = arrayList;
                        this.L$0 = list2;
                        this.L$1 = null;
                        this.label = 3;
                        if (awro.x(awwdVar3, this) == awoxVar) {
                            return awoxVar;
                        }
                        it = list2.iterator();
                        while (it.hasNext()) {
                            awwdVar4 = (awwd) it.next();
                            this.L$0 = it;
                            this.label = 4;
                            if (awro.x(awwdVar4, this) == awoxVar) {
                                return awoxVar;
                            }
                        }
                        return awmy.a;
                    } catch (Throwable th3) {
                        awwdVar = awwdVarT;
                        th = th3;
                        this.L$0 = arrayList;
                        this.L$1 = awwdVar;
                        this.L$2 = th;
                        this.label = 5;
                        if (awro.x(awwdVarT2, this) != awoxVar) {
                            return awoxVar;
                        }
                        awwdVar2 = awwdVar;
                        list = arrayList;
                        this.L$0 = list;
                        this.L$1 = th;
                        this.L$2 = null;
                        this.label = 6;
                        if (awro.x(awwdVar2, this) == awoxVar) {
                            return awoxVar;
                        }
                        Iterator it4 = list.iterator();
                        th2 = th;
                        it2 = it4;
                        while (it2.hasNext()) {
                            awwdVar5 = (awwd) it2.next();
                            this.L$0 = th2;
                            this.L$1 = it2;
                            this.label = 7;
                            if (awro.x(awwdVar5, this) == awoxVar) {
                                return awoxVar;
                            }
                        }
                        throw th2;
                    }
                case 1:
                    awwd awwdVar6 = (awwd) this.L$2;
                    awwd awwdVar7 = (awwd) this.L$1;
                    arrayList = (List) this.L$0;
                    try {
                        atqp.j(obj);
                        awwdVarT2 = awwdVar6;
                        awwdVarT = awwdVar7;
                        this.L$0 = arrayList;
                        this.L$1 = awwdVarT;
                        this.L$2 = null;
                        this.label = 2;
                        if (awro.x(awwdVarT2, this) != awoxVar) {
                            return awoxVar;
                        }
                        awwdVar3 = awwdVarT;
                        list2 = arrayList;
                        this.L$0 = list2;
                        this.L$1 = null;
                        this.label = 3;
                        if (awro.x(awwdVar3, this) == awoxVar) {
                            return awoxVar;
                        }
                        it = list2.iterator();
                        while (it.hasNext()) {
                            awwdVar4 = (awwd) it.next();
                            this.L$0 = it;
                            this.label = 4;
                            if (awro.x(awwdVar4, this) == awoxVar) {
                                return awoxVar;
                            }
                        }
                        return awmy.a;
                    } catch (Throwable th4) {
                        th = th4;
                        awwdVarT2 = awwdVar6;
                        awwdVar = awwdVar7;
                        this.L$0 = arrayList;
                        this.L$1 = awwdVar;
                        this.L$2 = th;
                        this.label = 5;
                        if (awro.x(awwdVarT2, this) != awoxVar) {
                            return awoxVar;
                        }
                        awwdVar2 = awwdVar;
                        list = arrayList;
                        this.L$0 = list;
                        this.L$1 = th;
                        this.L$2 = null;
                        this.label = 6;
                        if (awro.x(awwdVar2, this) == awoxVar) {
                            return awoxVar;
                        }
                        Iterator it5 = list.iterator();
                        th2 = th;
                        it2 = it5;
                        while (it2.hasNext()) {
                            awwdVar5 = (awwd) it2.next();
                            this.L$0 = th2;
                            this.L$1 = it2;
                            this.label = 7;
                            if (awro.x(awwdVar5, this) == awoxVar) {
                                return awoxVar;
                            }
                        }
                        throw th2;
                    }
                case 2:
                    awwd awwdVar8 = (awwd) this.L$1;
                    List list4 = (List) this.L$0;
                    atqp.j(obj);
                    awwdVar3 = awwdVar8;
                    list2 = list4;
                    this.L$0 = list2;
                    this.L$1 = null;
                    this.label = 3;
                    if (awro.x(awwdVar3, this) == awoxVar) {
                        return awoxVar;
                    }
                    it = list2.iterator();
                    while (it.hasNext()) {
                        awwdVar4 = (awwd) it.next();
                        this.L$0 = it;
                        this.label = 4;
                        if (awro.x(awwdVar4, this) == awoxVar) {
                            return awoxVar;
                        }
                    }
                    return awmy.a;
                case 3:
                    list2 = (List) this.L$0;
                    atqp.j(obj);
                    it = list2.iterator();
                    while (it.hasNext()) {
                        awwdVar4 = (awwd) it.next();
                        this.L$0 = it;
                        this.label = 4;
                        if (awro.x(awwdVar4, this) == awoxVar) {
                            return awoxVar;
                        }
                    }
                    return awmy.a;
                case 4:
                    it = (Iterator) this.L$0;
                    atqp.j(obj);
                    while (it.hasNext()) {
                        awwdVar4 = (awwd) it.next();
                        this.L$0 = it;
                        this.label = 4;
                        if (awro.x(awwdVar4, this) == awoxVar) {
                            return awoxVar;
                        }
                    }
                    return awmy.a;
                case 5:
                    th = (Throwable) this.L$2;
                    awwd awwdVar9 = (awwd) this.L$1;
                    List list5 = (List) this.L$0;
                    atqp.j(obj);
                    awwdVar2 = awwdVar9;
                    list = list5;
                    this.L$0 = list;
                    this.L$1 = th;
                    this.L$2 = null;
                    this.label = 6;
                    if (awro.x(awwdVar2, this) == awoxVar) {
                        return awoxVar;
                    }
                    Iterator it6 = list.iterator();
                    th2 = th;
                    it2 = it6;
                    while (it2.hasNext()) {
                        awwdVar5 = (awwd) it2.next();
                        this.L$0 = th2;
                        this.L$1 = it2;
                        this.label = 7;
                        if (awro.x(awwdVar5, this) == awoxVar) {
                            return awoxVar;
                        }
                    }
                    throw th2;
                case 6:
                    th = (Throwable) this.L$1;
                    list = (List) this.L$0;
                    atqp.j(obj);
                    Iterator it7 = list.iterator();
                    th2 = th;
                    it2 = it7;
                    while (it2.hasNext()) {
                        awwdVar5 = (awwd) it2.next();
                        this.L$0 = th2;
                        this.L$1 = it2;
                        this.label = 7;
                        if (awro.x(awwdVar5, this) == awoxVar) {
                            return awoxVar;
                        }
                    }
                    throw th2;
                case 7:
                    it2 = (Iterator) this.L$1;
                    th2 = (Throwable) this.L$0;
                    atqp.j(obj);
                    while (it2.hasNext()) {
                        awwdVar5 = (awwd) it2.next();
                        this.L$0 = th2;
                        this.L$1 = it2;
                        this.label = 7;
                        if (awro.x(awwdVar5, this) == awoxVar) {
                            return awoxVar;
                        }
                    }
                    throw th2;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private RiveCanvasSession(Context context, CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RiveSemanticsMode riveSemanticsMode, Map map, awmy awmyVar) {
        this.riveWorker = commandQueue;
        this.artboard = artboard;
        this.stateMachine = stateMachine;
        this.viewModelInstance = viewModelInstance;
        this.fit = fit;
        this.clearColor = i;
        Map mapD = atqq.D(map);
        this.globalViewModelInstancesSnapshot = mapD;
        awoa awoaVar = new awoa(10);
        if (viewModelInstance != null) {
            awoaVar.add(viewModelInstance);
        }
        awoaVar.addAll(mapD.values());
        List listF = awoaVar.f();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = ((awoa) listF).listIterator(0);
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if (hashSet.add(ViewModelInstanceHandle.m578boximpl(((ViewModelInstance) next).m325getInstanceHandleVPLto4w()))) {
                arrayList.add(next);
            }
        }
        this.boundViewModelInstances = arrayList;
        this.riveWorker.checkOpen$third_party_java_android_libs_rive_rive_android();
        this.artboard.checkOpen$third_party_java_android_libs_rive_rive_android();
        this.stateMachine.checkOpen$third_party_java_android_libs_rive_rive_android();
        ViewModelInstance viewModelInstance2 = this.viewModelInstance;
        if (viewModelInstance2 != null) {
            viewModelInstance2.checkOpen$third_party_java_android_libs_rive_rive_android();
        }
        Iterator it = this.globalViewModelInstancesSnapshot.values().iterator();
        while (it.hasNext()) {
            ((ViewModelInstance) it.next()).checkOpen$third_party_java_android_libs_rive_rive_android();
        }
        this.artboard.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
        this.stateMachine.requireFromArtboard$third_party_java_android_libs_rive_rive_android(this.artboard);
        ViewModelInstance viewModelInstance3 = this.viewModelInstance;
        if (viewModelInstance3 != null) {
            viewModelInstance3.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
        }
        Iterator it2 = this.globalViewModelInstancesSnapshot.values().iterator();
        while (it2.hasNext()) {
            ((ViewModelInstance) it2.next()).requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
        }
        if (!Companion.isSupported()) {
            throw new IllegalStateException("RiveCanvasSession requires API 29+ hardware bitmap support");
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.RiveCanvasSession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveCanvasSession._init_$lambda$2(this.f$0);
            }
        });
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.clearColor);
        this.clearPaint = paint;
        CommandQueue commandQueue2 = this.riveWorker;
        this.pointerDownFn = new RiveCanvasSession$pointerDownFn$1(commandQueue2);
        this.pointerMoveFn = new RiveCanvasSession$pointerMoveFn$1(commandQueue2);
        this.pointerUpFn = new RiveCanvasSession$pointerUpFn$1(commandQueue2);
        this.pointerExitFn = new RiveCanvasSession$pointerExitFn$1(commandQueue2);
        this.closeSignal = new awuk();
        this.closer = new CloseOnce("RiveCanvasSession", new Function0() { // from class: app.rive.RiveCanvasSession$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveCanvasSession.closer$lambda$0(this.f$0);
            }
        });
        this.renderBufferState = axaw.a(null);
        axae axaeVarD = axal.d(0, 1, 2);
        this._frameAvailable = axaeVarD;
        this.frameAvailable = axaeVarD;
        this.renderRegion = new Rect();
        this.stateMachine.bindViewModels$third_party_java_android_libs_rive_rive_android(this.viewModelInstance, this.globalViewModelInstancesSnapshot);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.semanticsModeController = new RiveSemanticsModeController(riveSemanticsMode, new AndroidAccessibilityStateProvider(applicationContext), new RiveCanvasSession$semanticsModeController$1(this));
    }

    static final String _init_$lambda$2(RiveCanvasSession riveCanvasSession) {
        return "Creating RiveCanvasSession with artboard '" + riveCanvasSession.artboard.getName() + "' and state machine '" + riveCanvasSession.stateMachine.getName() + '\'';
    }

    public static /* synthetic */ Object beginPlaying$default(RiveCanvasSession riveCanvasSession, boc bocVar, FrameTicker frameTicker, awoq awoqVar, int i, Object obj) {
        if ((i & 2) != 0) {
            frameTicker = FrameTickerKt.getChoreographerFrameTicker();
        }
        return riveCanvasSession.beginPlaying(bocVar, frameTicker, awoqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static final awmy closer$lambda$0(RiveCanvasSession riveCanvasSession) {
        awmy awmyVar;
        try {
            riveCanvasSession.semanticsModeController.close();
            if (riveCanvasSession.semanticsEnabled) {
                riveCanvasSession.stateMachine.clearSemanticFocusForLifecycleCleanup$third_party_java_android_libs_rive_rive_android();
            }
            return awmyVar;
        } finally {
            riveCanvasSession.closeSignal.a(awmy.a);
            riveCanvasSession.renderBufferState.d(null);
            HardwareRenderBuffer hardwareRenderBuffer = riveCanvasSession.renderBuffer;
            riveCanvasSession.renderBuffer = null;
            if (hardwareRenderBuffer != null) {
                hardwareRenderBuffer.close();
            }
            riveCanvasSession.latestBitmap = null;
            riveCanvasSession.renderRegion.setEmpty();
            riveCanvasSession.isPlaying = false;
        }
    }

    private static final boolean onTouchEvent$containsInRegion(RiveCanvasSession riveCanvasSession, float f, float f2) {
        return f >= ((float) riveCanvasSession.renderRegion.left) && f < ((float) riveCanvasSession.renderRegion.right) && f2 >= ((float) riveCanvasSession.renderRegion.top) && f2 < ((float) riveCanvasSession.renderRegion.bottom);
    }

    private static final void onTouchEvent$dispatchPointer(MotionEvent motionEvent, RiveCanvasSession riveCanvasSession, float f, float f2, int i, awqp awqpVar) {
        awqpVar.invoke(StateMachineHandle.m564boximpl(riveCanvasSession.stateMachine.m318getStateMachineHandlea86gHUU()), riveCanvasSession.fit, Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(motionEvent.getPointerId(i)), Float.valueOf(motionEvent.getX(i) - riveCanvasSession.renderRegion.left), Float.valueOf(motionEvent.getY(i) - riveCanvasSession.renderRegion.top));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSemanticsEnabled(boolean z) {
        if (this.semanticsEnabled != z) {
            StateMachine stateMachine = this.stateMachine;
            if (z) {
                stateMachine.enableSemantics();
            } else {
                stateMachine.clearSemanticFocusForLifecycleCleanup$third_party_java_android_libs_rive_rive_android();
            }
            this.semanticsEnabled = z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object beginPlaying(boc bocVar, FrameTicker frameTicker, awoq awoqVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (awoqVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) awoqVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(awoqVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(awoqVar);
        }
        Object obj = anonymousClass1.result;
        awox awoxVar = awox.a;
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                this.closer.checkOpen();
                if (this.isPlaying) {
                    throw new IllegalStateException("beginPlaying() is already running for this RiveCanvasSession");
                }
                this.isPlaying = true;
                this.stateMachine.unsettle$third_party_java_android_libs_rive_rive_android();
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(bocVar, frameTicker, null);
                anonymousClass1.label = 1;
                if (awrc.J(anonymousClass3, anonymousClass1) == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
            this.isPlaying = false;
            return awmy.a;
        } catch (Throwable th) {
            this.isPlaying = false;
            throw th;
        }
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final void draw(Canvas canvas) {
        canvas.getClass();
        this.closer.checkOpen();
        if (!canvas.isHardwareAccelerated()) {
            throw new IllegalArgumentException("RiveCanvasSession requires a hardware-accelerated canvas to draw hardware bitmaps");
        }
        if (this.renderRegion.isEmpty()) {
            return;
        }
        canvas.drawRect(this.renderRegion, this.clearPaint);
        Bitmap bitmap = this.latestBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.renderRegion, (Paint) null);
        }
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final axah getFrameAvailable() {
        return this.frameAvailable;
    }

    public final RiveSemanticsMode getSemantics() {
        return this.semanticsModeController.getMode();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        this.closer.checkOpen();
        boolean z = false;
        if (!this.renderRegion.isEmpty()) {
            float fWidth = this.renderRegion.width();
            float fHeight = this.renderRegion.height();
            RiveCanvasSession riveCanvasSession = this;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 5:
                    if (onTouchEvent$containsInRegion(riveCanvasSession, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()))) {
                        onTouchEvent$dispatchPointer(motionEvent, riveCanvasSession, fWidth, fHeight, motionEvent.getActionIndex(), riveCanvasSession.pointerDownFn);
                        z = true;
                    }
                    break;
                case 1:
                case 6:
                    onTouchEvent$dispatchPointer(motionEvent, riveCanvasSession, fWidth, fHeight, motionEvent.getActionIndex(), riveCanvasSession.pointerUpFn);
                    onTouchEvent$dispatchPointer(motionEvent, riveCanvasSession, fWidth, fHeight, motionEvent.getActionIndex(), riveCanvasSession.pointerExitFn);
                    z = true;
                    break;
                case 2:
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i = 0; i < pointerCount; i++) {
                        onTouchEvent$dispatchPointer(motionEvent, riveCanvasSession, fWidth, fHeight, i, onTouchEvent$containsInRegion(riveCanvasSession, motionEvent.getX(i), motionEvent.getY(i)) ? riveCanvasSession.pointerMoveFn : riveCanvasSession.pointerExitFn);
                    }
                    z = true;
                    break;
                case 3:
                case 4:
                    int pointerCount2 = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount2; i2++) {
                        onTouchEvent$dispatchPointer(motionEvent, this, fWidth, fHeight, i2, this.pointerExitFn);
                    }
                    riveCanvasSession = this;
                    z = true;
                    break;
            }
            if (z) {
                riveCanvasSession.stateMachine.unsettle$third_party_java_android_libs_rive_rive_android();
            }
        }
        return z;
    }

    public final void setRegion(final Rect rect) {
        rect.getClass();
        this.closer.checkOpen();
        if (rect.width() < 0 || rect.height() < 0) {
            Objects.toString(rect);
            throw new IllegalArgumentException("Region must have non-negative dimensions: ".concat(rect.toString()));
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (iWidth == 0 || iHeight == 0) {
            if (awrc.c(this.renderRegion, rect) && this.renderBuffer == null && this.latestBitmap == null) {
                return;
            }
            RiveLog.INSTANCE.getLogger().v(TAG, new Function0() { // from class: app.rive.RiveCanvasSession$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.bV(rect, "Render region has a 0 dimension: ", "; clearing render state");
                }
            });
            this.renderRegion.set(rect);
            this.renderBufferState.d(null);
            HardwareRenderBuffer hardwareRenderBuffer = this.renderBuffer;
            this.renderBuffer = null;
            if (hardwareRenderBuffer != null) {
                hardwareRenderBuffer.close();
            }
            this.latestBitmap = null;
            this.stateMachine.unsettle$third_party_java_android_libs_rive_rive_android();
            return;
        }
        if (awrc.c(this.renderRegion, rect)) {
            return;
        }
        boolean z = true;
        if (this.renderRegion.width() == iWidth && this.renderRegion.height() == iHeight) {
            z = false;
        }
        if (z) {
            RiveLog.INSTANCE.getLogger().i(TAG, new Function0() { // from class: app.rive.RiveCanvasSession$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.bV(rect, "Updating render region to ", "; recreating render buffer and unsettling state machine");
                }
            });
        }
        HardwareRenderBuffer hardwareRenderBuffer2 = this.renderBuffer;
        HardwareRenderBuffer hardwareRenderBuffer3 = z ? new HardwareRenderBuffer(iWidth, iHeight, this.riveWorker) : hardwareRenderBuffer2;
        this.renderBuffer = hardwareRenderBuffer3;
        this.renderBufferState.d(hardwareRenderBuffer3);
        this.renderRegion.set(rect);
        if (z) {
            if (this.fit instanceof Fit.Layout) {
                this.artboard.resizeArtboard(hardwareRenderBuffer3.getSurface(), ((Fit.Layout) this.fit).getScaleFactor());
            }
            this.stateMachine.unsettle$third_party_java_android_libs_rive_rive_android();
            this.latestBitmap = null;
        }
        if (hardwareRenderBuffer2 == null || hardwareRenderBuffer2 == hardwareRenderBuffer3) {
            return;
        }
        hardwareRenderBuffer2.close();
    }

    public final void setSemantics(RiveSemanticsMode riveSemanticsMode) {
        riveSemanticsMode.getClass();
        this.closer.checkOpen();
        this.semanticsModeController.setMode(riveSemanticsMode);
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public final boolean isSupported() {
            return HardwareRenderBuffer.Companion.isSupported();
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public static /* synthetic */ void getSemantics$annotations() {
    }

    public /* synthetic */ RiveCanvasSession(Context context, CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RiveSemanticsMode riveSemanticsMode, int i2, awqx awqxVar) {
        this(context, commandQueue, artboard, stateMachine, (i2 & 16) != 0 ? null : viewModelInstance, (i2 & 32) != 0 ? RenderingDefaults.INSTANCE.defaultFit() : fit, (i2 & 64) != 0 ? 0 : i, (i2 & SemanticState.Focused) != 0 ? RiveSemanticsMode.Off : riveSemanticsMode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession(Context context, CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RiveSemanticsMode riveSemanticsMode, Map map) {
        this(context, commandQueue, artboard, stateMachine, viewModelInstance, fit, i, riveSemanticsMode, map, awmy.a);
        context.getClass();
        commandQueue.getClass();
        artboard.getClass();
        stateMachine.getClass();
        fit.getClass();
        riveSemanticsMode.getClass();
        map.getClass();
    }

    public /* synthetic */ RiveCanvasSession(Context context, CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RiveSemanticsMode riveSemanticsMode, Map map, int i2, awqx awqxVar) {
        this(context, commandQueue, artboard, stateMachine, (i2 & 16) != 0 ? null : viewModelInstance, (i2 & 32) != 0 ? RenderingDefaults.INSTANCE.defaultFit() : fit, (i2 & 64) != 0 ? 0 : i, (i2 & SemanticState.Focused) != 0 ? RiveSemanticsMode.Off : riveSemanticsMode, map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession(Context context, CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RiveSemanticsMode riveSemanticsMode) {
        this(context, commandQueue, artboard, stateMachine, viewModelInstance, fit, i, riveSemanticsMode, awnp.a, awmy.a);
        context.getClass();
        commandQueue.getClass();
        artboard.getClass();
        stateMachine.getClass();
        fit.getClass();
        riveSemanticsMode.getClass();
    }
}
