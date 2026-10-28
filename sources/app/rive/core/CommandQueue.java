package app.rive.core;

import android.os.Build;
import android.os.Looper;
import app.rive.Fit;
import app.rive.RenderBackend;
import app.rive.RenderBackendKt;
import app.rive.RiveArtboardException;
import app.rive.RiveAudioException;
import app.rive.RiveFileException;
import app.rive.RiveFocusDirection;
import app.rive.RiveFocusState;
import app.rive.RiveFocusStateKt;
import app.rive.RiveFontException;
import app.rive.RiveImageException;
import app.rive.RiveInitializationException;
import app.rive.RiveLog;
import app.rive.RiveResourceClosedException;
import app.rive.RiveShutdownException;
import app.rive.RiveStateMachineException;
import app.rive.RiveViewModelInstanceException;
import app.rive.ViewModelInstanceKt;
import app.rive.ViewModelInstanceSource;
import app.rive.ViewModelSource;
import app.rive.runtime.kotlin.core.ViewModel;
import app.rive.semantics.SemanticActionType;
import app.rive.semantics.SemanticState;
import app.rive.semantics.SemanticTreeModel;
import app.rive.semantics.SemanticsDiff;
import defpackage.a;
import defpackage.alh;
import defpackage.atqp;
import defpackage.atqq;
import defpackage.avkz;
import defpackage.awmj;
import defpackage.awmn;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awou;
import defpackage.awov;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqg;
import defpackage.awqk;
import defpackage.awql;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.awri;
import defpackage.awrm;
import defpackage.awro;
import defpackage.awtl;
import defpackage.awuc;
import defpackage.awud;
import defpackage.awuq;
import defpackage.awut;
import defpackage.awvi;
import defpackage.awwo;
import defpackage.axae;
import defpackage.axah;
import defpackage.axal;
import defpackage.axat;
import defpackage.axds;
import defpackage.bnu;
import defpackage.bob;
import defpackage.boc;
import defpackage.bog;
import internal.org.jni_zero.JniZero;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class CommandQueue implements RefCounted {
    public static final int MAX_CONCURRENT_SUBSCRIBERS = 32;
    private static final long SHUTDOWN_WATCHDOG_TIMEOUT_SECONDS = 10;
    private final axae _booleanPropertyFlow;
    private final axae _colorPropertyFlow;
    private final axae _enumPropertyFlow;
    private final axae _numberPropertyFlow;
    private final axae _stringPropertyFlow;
    private final axae _triggerPropertyFlow;
    private final axah booleanPropertyFlow;
    private final CommandQueueBridge bridge;
    private final axah colorPropertyFlow;
    private final RCPointer cppPointer;
    private final axah enumPropertyFlow;
    private final FocusStateStore focusStateStore;
    private Listeners listeners;
    private final AtomicLong nextRequestID;
    private final axah numberPropertyFlow;
    private final ConcurrentHashMap pendingContinuations;
    private final ConcurrentHashMap pendingResourceCleanups;
    private final RenderContext renderContext;
    private final Map semanticTrees;
    private final axah settledFlow;
    private final CountDownLatch shutdownComplete;
    private final StateMachineSettlingStore stateMachineSettlingStore;
    private final axah stringPropertyFlow;
    private final axah triggerPropertyFlow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AtomicLong nextShutdownThreadID = new AtomicLong();

    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RiveFocusDirection.values().length];
            try {
                iArr[RiveFocusDirection.Next.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RiveFocusDirection.Previous.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: app.rive.core.CommandQueue$beginPolling$2, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass2 extends awpk implements awqk {
        final /* synthetic */ boc $lifecycle;
        final /* synthetic */ FrameTicker $ticker;
        int label;

        /* JADX INFO: renamed from: app.rive.core.CommandQueue$beginPolling$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: PG */
        final class AnonymousClass1 extends awpk implements awqk {
            final /* synthetic */ FrameTicker $ticker;
            int I$0;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CommandQueue this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CommandQueue commandQueue, FrameTicker frameTicker, awoq awoqVar) {
                super(2, awoqVar);
                this.this$0 = commandQueue;
                this.$ticker = frameTicker;
            }

            static final String invokeSuspend$lambda$0() {
                return "Starting command queue polling";
            }

            static final String invokeSuspend$lambda$2() {
                return "Stopping command queue polling";
            }

            @Override // defpackage.awpe
            public final awoq create(Object obj, awoq awoqVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$ticker, awoqVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // defpackage.awqk
            public final Object invoke(awut awutVar, awoq awoqVar) {
                return ((AnonymousClass1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0039  */
            /* JADX WARN: Code duplicated, block: B:15:0x0055  */
            /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r4
              0x0033: PHI (r4v3 awut) = (r4v2 awut), (r4v4 awut) binds: [B:8:0x001d, B:22:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0055 -> B:27:0x0056). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.awpe
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    awox r0 = defpackage.awox.a
                    int r1 = r6.label
                    java.lang.String r2 = "Rive/CQ"
                    r3 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r3) goto L15
                    int r1 = r6.I$0
                    java.lang.Object r4 = r6.L$0
                    awut r4 = (defpackage.awut) r4
                    defpackage.atqp.j(r7)
                    goto L56
                L15:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1d:
                    defpackage.atqp.j(r7)
                    java.lang.Object r7 = r6.L$0
                    awut r7 = (defpackage.awut) r7
                    app.rive.core.CommandQueue$beginPolling$2$1$$ExternalSyntheticLambda0 r1 = new app.rive.core.CommandQueue$beginPolling$2$1$$ExternalSyntheticLambda0
                    r1.<init>()
                    app.rive.RiveLog r4 = app.rive.RiveLog.INSTANCE
                    app.rive.RiveLog$Logger r4 = r4.getLogger()
                    r4.d(r2, r1)
                    r4 = r7
                L33:
                    boolean r7 = defpackage.awrc.N(r4)
                    if (r7 == 0) goto L6a
                    app.rive.core.CommandQueue r7 = r6.this$0
                    boolean r7 = r7.isDisposed()
                    if (r7 != 0) goto L6a
                    app.rive.core.FrameTicker r7 = r6.$ticker
                    app.rive.core.CommandQueue$beginPolling$2$1$$ExternalSyntheticLambda1 r1 = new app.rive.core.CommandQueue$beginPolling$2$1$$ExternalSyntheticLambda1
                    r1.<init>()
                    r6.L$0 = r4
                    r5 = 0
                    r6.I$0 = r5
                    r6.label = r3
                    java.lang.Object r7 = r7.withFrame(r1, r6)
                    if (r7 == r0) goto L7a
                    r1 = r5
                L56:
                    app.rive.core.CommandQueue r7 = r6.this$0     // Catch: app.rive.RiveResourceClosedException -> L5c
                    r7.pollMessages()     // Catch: app.rive.RiveResourceClosedException -> L5c
                    goto L66
                L5c:
                    r7 = move-exception
                    app.rive.core.CommandQueue r1 = r6.this$0
                    int r1 = r1.getRefCount()
                    if (r1 > 0) goto L69
                    r1 = r3
                L66:
                    if (r1 != 0) goto L6a
                    goto L33
                L69:
                    throw r7
                L6a:
                    app.rive.core.CommandQueue$beginPolling$2$1$$ExternalSyntheticLambda2 r6 = new app.rive.core.CommandQueue$beginPolling$2$1$$ExternalSyntheticLambda2
                    r6.<init>()
                    app.rive.RiveLog r7 = app.rive.RiveLog.INSTANCE
                    app.rive.RiveLog$Logger r7 = r7.getLogger()
                    r7.d(r2, r6)
                    awmy r0 = defpackage.awmy.a
                L7a:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: app.rive.core.CommandQueue.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boc bocVar, FrameTicker frameTicker, awoq awoqVar) {
            super(2, awoqVar);
            this.$lifecycle = bocVar;
            this.$ticker = frameTicker;
        }

        @Override // defpackage.awpe
        public final awoq create(Object obj, awoq awoqVar) {
            return CommandQueue.this.new AnonymousClass2(this.$lifecycle, this.$ticker, awoqVar);
        }

        @Override // defpackage.awqk
        public final Object invoke(awut awutVar, awoq awoqVar) {
            return ((AnonymousClass2) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
        }

        @Override // defpackage.awpe
        public final Object invokeSuspend(Object obj) throws Throwable {
            awox awoxVar = awox.a;
            int i = this.label;
            if (i == 0) {
                atqp.j(obj);
                CommandQueue.this.checkOpen$third_party_java_android_libs_rive_rive_android();
                boc bocVar = this.$lifecycle;
                CommandQueue commandQueue = CommandQueue.this;
                FrameTicker frameTicker = this.$ticker;
                bob bobVar = bob.e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(commandQueue, frameTicker, null);
                this.label = 1;
                if (alh.d(bocVar, bobVar, anonymousClass1, this) == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
            return awmy.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.core.CommandQueue$suspendNativeRequest$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    public final class C00262 extends awpk implements awqk {
        final /* synthetic */ awqg $nativeFn;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00262(awqg awqgVar, awoq awoqVar) {
            super(2, awoqVar);
            this.$nativeFn = awqgVar;
        }

        @Override // defpackage.awpe
        public final awoq create(Object obj, awoq awoqVar) {
            awrc.e();
            return CommandQueue.this.new C00262(this.$nativeFn, awoqVar);
        }

        @Override // defpackage.awqk
        public final Object invoke(awut awutVar, awoq awoqVar) {
            return ((C00262) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
        }

        @Override // defpackage.awpe
        public final Object invokeSuspend(Object obj) throws Throwable {
            awox awoxVar = awox.a;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
                return obj;
            }
            atqp.j(obj);
            CommandQueue commandQueue = CommandQueue.this;
            awqg awqgVar = this.$nativeFn;
            this.L$0 = commandQueue;
            this.L$1 = awqgVar;
            this.label = 1;
            awud awudVar = new awud(JniZero.q(this), 1);
            awudVar.w();
            long andIncrement = commandQueue.nextRequestID.getAndIncrement();
            commandQueue.pendingContinuations.put(new Long(andIncrement), awudVar);
            awudVar.b(new CommandQueue$suspendNativeRequest$2$1$1(commandQueue, andIncrement));
            try {
                awqgVar.invoke(new Long(andIncrement));
                Object objJ = awudVar.j();
                return objJ == awoxVar ? awoxVar : objJ;
            } catch (Throwable th) {
                commandQueue.pendingContinuations.remove(new Long(andIncrement));
                throw th;
            }
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            awud awudVar = new awud(JniZero.q(this), 1);
            awudVar.w();
            CommandQueue commandQueue = CommandQueue.this;
            long andIncrement = commandQueue.nextRequestID.getAndIncrement();
            ConcurrentHashMap concurrentHashMap = commandQueue.pendingContinuations;
            Long lValueOf = Long.valueOf(andIncrement);
            concurrentHashMap.put(lValueOf, awudVar);
            awudVar.b(new CommandQueue$suspendNativeRequest$2$1$1(commandQueue, andIncrement));
            try {
                this.$nativeFn.invoke(lValueOf);
                return awudVar.j();
            } catch (Throwable th) {
                commandQueue.pendingContinuations.remove(Long.valueOf(andIncrement));
                throw th;
            }
        }
    }

    public CommandQueue(RenderContext renderContext, CommandQueueBridge commandQueueBridge, boolean z, boolean z2, long j, StateMachineSettlingStore stateMachineSettlingStore) {
        renderContext.getClass();
        commandQueueBridge.getClass();
        this.renderContext = renderContext;
        this.bridge = commandQueueBridge;
        this.shutdownComplete = new CountDownLatch(1);
        RCPointer rCPointer = new RCPointer(j, CommandQueueKt.COMMAND_QUEUE_TAG, new CommandQueue$cppPointer$1(this));
        this.cppPointer = rCPointer;
        this.listeners = commandQueueBridge.cppCreateListeners(rCPointer.getPointer(), this);
        setTracingEnabled(z);
        setDeferredEnabled(z2);
        stateMachineSettlingStore = stateMachineSettlingStore == null ? new StateMachineSettlingStore(new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(this.f$0.nextRequestID.getAndIncrement());
            }
        }) : stateMachineSettlingStore;
        this.stateMachineSettlingStore = stateMachineSettlingStore;
        this.focusStateStore = new FocusStateStore(new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(this.f$0.nextRequestID.getAndIncrement());
            }
        });
        this.semanticTrees = new LinkedHashMap();
        this.settledFlow = stateMachineSettlingStore.getAcceptedSettlements();
        axae axaeVarD = axal.d(0, 32, 2);
        this._numberPropertyFlow = axaeVarD;
        this.numberPropertyFlow = axaeVarD;
        axae axaeVarD2 = axal.d(0, 32, 2);
        this._stringPropertyFlow = axaeVarD2;
        this.stringPropertyFlow = axaeVarD2;
        axae axaeVarD3 = axal.d(0, 32, 2);
        this._booleanPropertyFlow = axaeVarD3;
        this.booleanPropertyFlow = axaeVarD3;
        axae axaeVarD4 = axal.d(0, 32, 2);
        this._enumPropertyFlow = axaeVarD4;
        this.enumPropertyFlow = axaeVarD4;
        axae axaeVarD5 = axal.d(0, 32, 2);
        this._colorPropertyFlow = axaeVarD5;
        this.colorPropertyFlow = axaeVarD5;
        axae axaeVarD6 = axal.d(0, 32, 2);
        this._triggerPropertyFlow = axaeVarD6;
        this.triggerPropertyFlow = axaeVarD6;
        RiveLog.INSTANCE.getLogger().d(CommandQueueKt.COMMAND_QUEUE_TAG, new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommandQueue._init_$lambda$0();
            }
        });
        this.pendingContinuations = new ConcurrentHashMap();
        this.pendingResourceCleanups = new ConcurrentHashMap();
        this.nextRequestID = new AtomicLong();
    }

    static final String _init_$lambda$0() {
        return "Creating command queue";
    }

    public static /* synthetic */ Object beginPolling$default(CommandQueue commandQueue, boc bocVar, FrameTicker frameTicker, awoq awoqVar, int i, Object obj) {
        if ((i & 2) != 0) {
            frameTicker = FrameTickerKt.getChoreographerFrameTicker();
        }
        return commandQueue.beginPolling(bocVar, frameTicker, awoqVar);
    }

    private final void cancelPendingContinuations() {
        Collection collectionValues = this.pendingContinuations.values();
        collectionValues.getClass();
        Iterator it = atqq.ap(collectionValues).iterator();
        while (it.hasNext()) {
            ((awuc) it.next()).f(new CancellationException("RiveWorker was disposed before operation could complete."));
        }
        this.pendingContinuations.clear();
        this.pendingResourceCleanups.clear();
    }

    /* JADX INFO: renamed from: checkViewModelInstanceSource-evklBmw, reason: not valid java name */
    private final void m386checkViewModelInstanceSourceevklBmw(long j, ViewModelInstanceSource viewModelInstanceSource) {
        checkOpen$third_party_java_android_libs_rive_rive_android();
        ViewModelInstanceKt.checkOpen(viewModelInstanceSource);
        ViewModelInstanceKt.m340requireCompatibleWithgj6um3I(viewModelInstanceSource, this, j);
    }

    static final awmy deleteArtboard_uiJWFY8$lambda$0(CommandQueue commandQueue, long j) {
        commandQueue.bridge.cppDeleteArtboard(commandQueue.requireNativePointer(), commandQueue.nextRequestID.getAndIncrement(), j);
        return awmy.a;
    }

    static final awmy deleteStateMachine_AkTCgDQ$lambda$0(CommandQueue commandQueue, long j) {
        commandQueue.bridge.cppDeleteStateMachine(commandQueue.requireNativePointer(), commandQueue.nextRequestID.getAndIncrement(), j);
        return awmy.a;
    }

    static final awmy deleteViewModelInstance_mBajs_U$lambda$0(CommandQueue commandQueue, long j) {
        commandQueue.bridge.cppDeleteViewModelInstance(commandQueue.requireNativePointer(), commandQueue.nextRequestID.getAndIncrement(), j);
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispose(final long j) {
        cancelPendingContinuations();
        this.stateMachineSettlingStore.clear();
        this.focusStateStore.clear();
        awuq awuqVar = awvi.a;
        awwo awwoVarJ = axds.a.j();
        awov awovVar = awov.a;
        if (awwoVarJ.fX(awovVar)) {
            awwoVarJ.a(awovVar, new Runnable() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.semanticTrees.clear();
                }
            });
        } else {
            this.semanticTrees.clear();
        }
        final String str = "RiveWorkerShutdown-" + nextShutdownThreadID.getAndIncrement();
        Thread thread = new Thread(new Runnable() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                CommandQueue.dispose$lambda$1(this.f$0, j, str);
            }
        }, str);
        Thread thread2 = new Thread(new Runnable() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                CommandQueue.dispose$lambda$2(this.f$0);
            }
        }, str.concat("-Watchdog"));
        thread2.setDaemon(true);
        thread2.start();
        thread.setDaemon(true);
        thread.start();
    }

    static final void dispose$lambda$1(CommandQueue commandQueue, long j, final String str) {
        long jNanoTime = System.nanoTime();
        try {
            RiveLog.INSTANCE.getLogger().d(CommandQueueKt.COMMAND_QUEUE_TAG, new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CommandQueue.dispose$lambda$1$0(str);
                }
            });
            commandQueue.bridge.cppDelete(j);
            try {
                commandQueue.listeners.close();
                commandQueue.renderContext.close();
                commandQueue.shutdownComplete.countDown();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                final long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
                RiveLog.INSTANCE.getLogger().d(CommandQueueKt.COMMAND_QUEUE_TAG, new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommandQueue.dispose$lambda$1$2(jNanoTime2);
                    }
                });
            } catch (Throwable th) {
                commandQueue.shutdownComplete.countDown();
                throw th;
            }
        } catch (Throwable th2) {
            RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th2, new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CommandQueue.dispose$lambda$1$1();
                }
            });
            commandQueue.shutdownComplete.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dispose$lambda$1$0(String str) {
        return "Starting command queue native shutdown on ".concat(String.valueOf(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dispose$lambda$1$1() {
        return "Command queue native shutdown failed. Listener and render context cleanup skipped.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dispose$lambda$1$2(long j) {
        return a.cf(j, "Command queue native shutdown completed in ", "ms");
    }

    static final void dispose$lambda$2(CommandQueue commandQueue) {
        if (commandQueue.shutdownComplete.await(SHUTDOWN_WATCHDOG_TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
            return;
        }
        RiveLog.INSTANCE.getLogger().w(CommandQueueKt.COMMAND_QUEUE_TAG, new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommandQueue.dispose$lambda$2$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dispose$lambda$2$0() {
        return "Command queue native shutdown is taking unusually long and has not completed after 10s";
    }

    /* JADX INFO: renamed from: draw-Occ3x_Y$default, reason: not valid java name */
    public static /* synthetic */ void m387drawOcc3x_Y$default(CommandQueue commandQueue, long j, long j2, RiveSurface riveSurface, Fit fit, int i, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        commandQueue.m424drawOcc3x_Y(j, j2, riveSurface, fit, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: drawToBuffer-fS7xHJs$default, reason: not valid java name */
    public static /* synthetic */ void m388drawToBufferfS7xHJs$default(CommandQueue commandQueue, long j, long j2, RiveSurface riveSurface, byte[] bArr, int i, int i2, Fit fit, int i3, int i4, Object obj) {
        if ((i4 & 64) != 0) {
            fit = new Fit.Contain(null, 1, 0 == true ? 1 : 0);
        }
        if ((i4 & SemanticState.Focused) != 0) {
            i3 = 0;
        }
        commandQueue.m425drawToBufferfS7xHJs(j, j2, riveSurface, bArr, i, i2, fit, i3);
    }

    /* JADX INFO: renamed from: enqueueFocusCommand--3uIp1w, reason: not valid java name */
    private final void m389enqueueFocusCommand3uIp1w(long j, long j2, awql awqlVar) {
        awqlVar.invoke(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(this.nextRequestID.getAndIncrement()));
        this.focusStateStore.m540invalidateAkTCgDQ(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: enqueueViewModelInstanceCreation-WT1fHeI, reason: not valid java name */
    public final long m390enqueueViewModelInstanceCreationWT1fHeI(long j, ViewModelInstanceSource viewModelInstanceSource, long j2) {
        int iSwitchDispatch = CommandQueue$$ExternalSyntheticTypeSwitchClass22.switchDispatch(viewModelInstanceSource, 0);
        if (iSwitchDispatch == 0) {
            ViewModelSource viewModelSourceM348unboximpl = ((ViewModelInstanceSource.Blank) viewModelInstanceSource).m348unboximpl();
            int iSwitchDispatch2 = CommandQueue$$ExternalSyntheticTypeSwitchClass23.switchDispatch(viewModelSourceM348unboximpl, 0);
            if (iSwitchDispatch2 == 0) {
                return this.bridge.cppNamedVMCreateBlankVMI(requireNativePointer(), j2, j, ((ViewModelSource.Named) viewModelSourceM348unboximpl).m369unboximpl());
            }
            if (iSwitchDispatch2 == 1) {
                return this.bridge.cppDefaultVMCreateBlankVMI(requireNativePointer(), j2, j, ((ViewModelSource.DefaultForArtboard) viewModelSourceM348unboximpl).m362unboximpl().m269getArtboardHandlenSTdbJo());
            }
            throw new awmj();
        }
        if (iSwitchDispatch == 1) {
            ViewModelSource viewModelSourceM355unboximpl = ((ViewModelInstanceSource.Default) viewModelInstanceSource).m355unboximpl();
            int iSwitchDispatch3 = CommandQueue$$ExternalSyntheticTypeSwitchClass23.switchDispatch(viewModelSourceM355unboximpl, 0);
            if (iSwitchDispatch3 == 0) {
                return this.bridge.cppNamedVMCreateDefaultVMI(requireNativePointer(), j2, j, ((ViewModelSource.Named) viewModelSourceM355unboximpl).m369unboximpl());
            }
            if (iSwitchDispatch3 == 1) {
                return this.bridge.cppDefaultVMCreateDefaultVMI(requireNativePointer(), j2, j, ((ViewModelSource.DefaultForArtboard) viewModelSourceM355unboximpl).m362unboximpl().m269getArtboardHandlenSTdbJo());
            }
            throw new awmj();
        }
        if (iSwitchDispatch != 2) {
            if (iSwitchDispatch == 3) {
                ViewModelInstanceSource.Reference reference = (ViewModelInstanceSource.Reference) viewModelInstanceSource;
                return this.bridge.cppReferenceNestedVMI(requireNativePointer(), j2, reference.getParentInstance().m325getInstanceHandleVPLto4w(), reference.getPath());
            }
            if (iSwitchDispatch != 4) {
                throw new awmj();
            }
            ViewModelInstanceSource.ReferenceListItem referenceListItem = (ViewModelInstanceSource.ReferenceListItem) viewModelInstanceSource;
            return this.bridge.cppReferenceListItemVMI(requireNativePointer(), j2, referenceListItem.getParentInstance().m325getInstanceHandleVPLto4w(), referenceListItem.getPathToList(), referenceListItem.getIndex());
        }
        ViewModelInstanceSource.Named named = (ViewModelInstanceSource.Named) viewModelInstanceSource;
        ViewModelSource vmSource = named.getVmSource();
        int iSwitchDispatch4 = CommandQueue$$ExternalSyntheticTypeSwitchClass23.switchDispatch(vmSource, 0);
        if (iSwitchDispatch4 == 0) {
            return this.bridge.cppNamedVMCreateNamedVMI(requireNativePointer(), j2, j, ((ViewModelSource.Named) vmSource).m369unboximpl(), named.getInstanceName());
        }
        if (iSwitchDispatch4 == 1) {
            return this.bridge.cppDefaultVMCreateNamedVMI(requireNativePointer(), j2, j, ((ViewModelSource.DefaultForArtboard) vmSource).m362unboximpl().m269getArtboardHandlenSTdbJo(), named.getInstanceName());
        }
        throw new awmj();
    }

    private final void failNativeRequest(long j, Throwable th) {
        ConcurrentHashMap concurrentHashMap = this.pendingResourceCleanups;
        Long lValueOf = Long.valueOf(j);
        concurrentHashMap.remove(lValueOf);
        awuc awucVar = (awuc) this.pendingContinuations.remove(lValueOf);
        if (awucVar != null) {
            awucVar.resumeWith(atqp.i(th));
        }
    }

    /* JADX INFO: renamed from: nextDrawKey-DhFih_o, reason: not valid java name */
    private final long m391nextDrawKeyDhFih_o() {
        return this.bridge.cppCreateDrawKey(requireNativePointer());
    }

    static final String onArtboardError$lambda$0(long j, String str) {
        return "Artboard error for request " + j + ": " + str;
    }

    static final String onFileError$lambda$0(long j, String str) {
        return "File error for request " + j + ": " + str;
    }

    /* JADX INFO: renamed from: onPropertyUpdated-UrmHyfM, reason: not valid java name */
    private final void m392onPropertyUpdatedUrmHyfM(long j, long j2, String str, Object obj, axae axaeVar) {
        axaeVar.b(new PropertyUpdate(j2, str, obj, null));
        awuc awucVar = (awuc) this.pendingContinuations.remove(Long.valueOf(j));
        if (awucVar != null) {
            obj.getClass();
            awucVar.resumeWith(obj);
        }
    }

    static final String onSemanticsDiffReceived_OFH3VyA$lambda$0(long j, SemanticsDiff semanticsDiff) {
        return "Semantics diff applied for " + StateMachineHandle.m569toStringimpl(j) + " (treeVersion=" + semanticsDiff.getTreeVersion() + ')';
    }

    static final String onStateMachineError$lambda$0(long j, String str) {
        return "State machine error for request " + j + ": " + str;
    }

    static final String onViewModelInstanceError$lambda$0(long j, String str) {
        return "View model instance error for request " + j + ": " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long requireNativePointer() {
        checkOpen$third_party_java_android_libs_rive_rive_android();
        return this.cppPointer.getPointer();
    }

    /* JADX INFO: renamed from: resizeArtboard-VFK_cXo$default, reason: not valid java name */
    public static /* synthetic */ void m393resizeArtboardVFK_cXo$default(CommandQueue commandQueue, long j, RiveSurface riveSurface, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        commandQueue.m467resizeArtboardVFK_cXo(j, riveSurface, f);
    }

    private final boolean resumeResourceRequest(long j, final Object obj) {
        ConcurrentHashMap concurrentHashMap = this.pendingResourceCleanups;
        Long lValueOf = Long.valueOf(j);
        final awqg awqgVar = (awqg) concurrentHashMap.remove(lValueOf);
        Object objRemove = this.pendingContinuations.remove(lValueOf);
        awuc awucVar = objRemove instanceof awuc ? (awuc) objRemove : null;
        if (awucVar != null) {
            awucVar.c(obj, new awqg() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda0
                @Override // defpackage.awqg
                public final Object invoke(Object obj2) {
                    return CommandQueue.resumeResourceRequest$lambda$0(awqgVar, obj, (Throwable) obj2);
                }
            });
            return true;
        }
        if (awqgVar != null) {
            awqgVar.invoke(obj);
        }
        return false;
    }

    static final awmy resumeResourceRequest$lambda$0(awqg awqgVar, Object obj, Throwable th) {
        th.getClass();
        if (awqgVar != null) {
            awqgVar.invoke(obj);
        }
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOrDispatchOnMain(awou awouVar, final awqg awqgVar, final Function0 function0) {
        try {
            awuq awuqVar = awvi.a;
            awwo awwoVarJ = axds.a.j();
            if (awwoVarJ.fX(awouVar)) {
                awwoVarJ.a(awouVar, new Runnable() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda16
                    @Override // java.lang.Runnable
                    public final void run() {
                        CommandQueue.runOrDispatchOnMain$lambda$0(function0, awqgVar);
                    }
                });
            } else {
                function0.invoke();
            }
        } catch (Throwable th) {
            awqgVar.invoke(th);
        }
    }

    static final void runOrDispatchOnMain$lambda$0(Function0 function0, awqg awqgVar) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            awqgVar.invoke(th);
        }
    }

    private final void setDeferredEnabled(boolean z) {
        this.bridge.cppSetDeferredEnabled(this.cppPointer.getPointer(), z);
    }

    private final /* synthetic */ Object suspendNativeRequest(awqg awqgVar, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        awwo awwoVarJ = axds.a.j();
        awrc.e();
        return awro.p(awwoVarJ, new C00262(awqgVar, null), awoqVar);
    }

    private final /* synthetic */ Object suspendNativeResourceRequest(final awqg awqgVar, final awqg awqgVar2, awoq awoqVar) {
        final awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        final long andIncrement = this.nextRequestID.getAndIncrement();
        final awrm awrmVar = new awrm();
        final awri awriVar = new awri();
        awrc.e();
        final awqg awqgVar3 = new awqg() { // from class: app.rive.core.CommandQueue$suspendNativeResourceRequest$2$cleanupOnce$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m519invoke(final Object obj) {
                obj.getClass();
                awou context = awudVar.getContext();
                final long j = andIncrement;
                awqg awqgVar4 = new awqg() { // from class: app.rive.core.CommandQueue$suspendNativeResourceRequest$2$cleanupOnce$1.1
                    public final void invoke(Throwable th) {
                        th.getClass();
                        final long j2 = j;
                        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th, new Function0() { // from class: app.rive.core.CommandQueue.suspendNativeResourceRequest.2.cleanupOnce.1.1.1
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Failed to clean up resource for cancelled request " + j2;
                            }
                        });
                    }

                    @Override // defpackage.awqg
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return awmy.a;
                    }
                };
                awrc.e();
                final awri awriVar2 = awriVar;
                final awqg awqgVar5 = awqgVar;
                this.this$0.runOrDispatchOnMain(context, awqgVar4, new Function0() { // from class: app.rive.core.CommandQueue$suspendNativeResourceRequest$2$cleanupOnce$1.2
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m520invoke() {
                        awri awriVar3 = awriVar2;
                        if (awriVar3.a) {
                            return;
                        }
                        awriVar3.a = true;
                        awqg awqgVar6 = awqgVar5;
                        Object obj2 = obj;
                        awrc.e();
                        awqgVar6.invoke(obj2);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m520invoke();
                        return awmy.a;
                    }
                });
            }

            @Override // defpackage.awqg
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m519invoke(obj);
                return awmy.a;
            }
        };
        awudVar.b(new CommandQueue$suspendNativeResourceRequest$2$1(this, awudVar, andIncrement, awrmVar, awqgVar3));
        runOrDispatchOnMain(awudVar.b, new CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1(this, andIncrement, awudVar), new Function0() { // from class: app.rive.core.CommandQueue$suspendNativeResourceRequest$2$2
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m518invoke() {
                if (awudVar.g()) {
                    return;
                }
                CommandQueue commandQueue = this;
                long j = andIncrement;
                awuc awucVar = awudVar;
                ConcurrentHashMap concurrentHashMap = commandQueue.pendingContinuations;
                Long lValueOf = Long.valueOf(j);
                awucVar.getClass();
                concurrentHashMap.put(lValueOf, awucVar);
                CommandQueue commandQueue2 = this;
                long j2 = andIncrement;
                commandQueue2.pendingResourceCleanups.put(Long.valueOf(j2), awqgVar3);
                awrmVar.a = awqgVar2.invoke(Long.valueOf(andIncrement));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m518invoke();
                return awmy.a;
            }
        });
        Object objJ = awudVar.j();
        if (objJ == awox.a) {
            awoqVar.getClass();
        }
        return objJ;
    }

    static final awmy unsubscribeFromProperty_iFQtAB8$lambda$0(CommandQueue commandQueue, long j, String str, ViewModel.PropertyDataType propertyDataType) {
        commandQueue.bridge.cppUnsubscribeFromProperty(commandQueue.requireNativePointer(), j, str, propertyDataType.getValue());
        return awmy.a;
    }

    static final awmy withLifecycle$lambda$0(bog bogVar, CommandQueue$withLifecycle$observer$1 commandQueue$withLifecycle$observer$1, awri awriVar, CommandQueue commandQueue, String str) {
        bogVar.getLifecycle().c(commandQueue$withLifecycle$observer$1);
        if (awriVar.a) {
            AudioEngine.INSTANCE.release();
            awriVar.a = false;
        }
        commandQueue.release(str, "Closed by withLifecycle");
        return awmy.a;
    }

    @Override // app.rive.core.RefCounted
    public void acquire(String str) {
        str.getClass();
        checkOpen$third_party_java_android_libs_rive_rive_android();
        this.cppPointer.acquire(str);
    }

    /* JADX INFO: renamed from: advanceStateMachine-DDXDRQI, reason: not valid java name */
    public final void m394advanceStateMachineDDXDRQI(long j, long j2) {
        this.bridge.cppAdvanceStateMachine(requireNativePointer(), this.nextRequestID.getAndIncrement(), j, awtl.c(j2));
    }

    /* JADX INFO: renamed from: appendToList-Y8k3COA, reason: not valid java name */
    public final void m395appendToListY8k3COA(long j, String str, long j2) {
        str.getClass();
        this.bridge.cppAppendToList(requireNativePointer(), j, str, j2);
    }

    public final boolean awaitShutdown$third_party_java_android_libs_rive_rive_android(long j) {
        return this.shutdownComplete.await(j, TimeUnit.MILLISECONDS);
    }

    public final Object beginPolling(boc bocVar, FrameTicker frameTicker, awoq awoqVar) throws Throwable {
        awuq awuqVar = awvi.a;
        Object objP = awro.p(axds.a.j(), new AnonymousClass2(bocVar, frameTicker, null), awoqVar);
        return objP != awox.a ? awmy.a : objP;
    }

    /* JADX INFO: renamed from: bind-AkTCgDQ, reason: not valid java name */
    public final void m396bindAkTCgDQ(long j) {
        this.bridge.cppBind(requireNativePointer(), this.nextRequestID.getAndIncrement(), j);
    }

    /* JADX INFO: renamed from: bindViewModelInstance-ei-yHz8, reason: not valid java name */
    public final void m397bindViewModelInstanceeiyHz8(long j, long j2) {
        m477setMainViewModelInstanceeiyHz8(j, j2);
        m396bindAkTCgDQ(j);
    }

    /* JADX INFO: renamed from: cancelDraw-RUTHeiE$third_party_java_android_libs_rive_rive_android, reason: not valid java name */
    public final void m398xea2bbd71(long j) {
        this.bridge.cppCancelDraw(requireNativePointer(), j);
    }

    public final void checkOpen$third_party_java_android_libs_rive_rive_android() {
        if (this.cppPointer.getRefCount() <= 0) {
            throw new RiveResourceClosedException("RiveWorker is disposed");
        }
    }

    /* JADX INFO: renamed from: clearFocus-AkTCgDQ, reason: not valid java name */
    public final void m399clearFocusAkTCgDQ(long j) {
        m389enqueueFocusCommand3uIp1w(requireNativePointer(), j, new CommandQueue$clearFocus$1(this.bridge));
        m463requestFocusStateAkTCgDQ(j);
    }

    /* JADX INFO: renamed from: clearGlobalViewModelInstance-OFH3VyA, reason: not valid java name */
    public final void m400clearGlobalViewModelInstanceOFH3VyA(long j, String str) {
        str.getClass();
        this.bridge.cppClearGlobalViewModelInstance(requireNativePointer(), this.nextRequestID.getAndIncrement(), j, str);
    }

    /* JADX INFO: renamed from: clearMainViewModelInstance-AkTCgDQ, reason: not valid java name */
    public final void m401clearMainViewModelInstanceAkTCgDQ(long j) {
        this.bridge.cppClearMainViewModelInstance(requireNativePointer(), this.nextRequestID.getAndIncrement(), j);
    }

    /* JADX INFO: renamed from: clearSemanticFocus-AkTCgDQ, reason: not valid java name */
    public final void m402clearSemanticFocusAkTCgDQ(long j) {
        this.bridge.cppClearSemanticFocus(requireNativePointer(), j);
    }

    /* JADX INFO: renamed from: createArtboardByName-2ZIOzHc, reason: not valid java name */
    public final long m403createArtboardByName2ZIOzHc(long j, String str) {
        str.getClass();
        return this.bridge.cppCreateArtboardByName(requireNativePointer(), this.nextRequestID.getAndIncrement(), j, str);
    }

    /* JADX INFO: renamed from: createArtboardByNameConfirmed-STqRd7c, reason: not valid java name */
    public final Object m404createArtboardByNameConfirmedSTqRd7c(final long j, final String str, awoq awoqVar) {
        final awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        final long andIncrement = this.nextRequestID.getAndIncrement();
        final awrm awrmVar = new awrm();
        final awri awriVar = new awri();
        final awqg awqgVar = new awqg() { // from class: app.rive.core.CommandQueue$createArtboardByNameConfirmed-STqRd7c$$inlined$suspendNativeResourceRequest$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m490invoke(final Object obj) {
                obj.getClass();
                awou context = awudVar.getContext();
                final long j2 = andIncrement;
                awqg awqgVar2 = new awqg() { // from class: app.rive.core.CommandQueue$createArtboardByNameConfirmed-STqRd7c$$inlined$suspendNativeResourceRequest$1.1
                    public final void invoke(Throwable th) {
                        th.getClass();
                        final long j3 = j2;
                        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th, new Function0() { // from class: app.rive.core.CommandQueue$createArtboardByNameConfirmed-STqRd7c$.inlined.suspendNativeResourceRequest.1.1.1
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Failed to clean up resource for cancelled request " + j3;
                            }
                        });
                    }

                    @Override // defpackage.awqg
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return awmy.a;
                    }
                };
                final CommandQueue commandQueue = this;
                final awri awriVar2 = awriVar;
                this.this$0.runOrDispatchOnMain(context, awqgVar2, new Function0() { // from class: app.rive.core.CommandQueue$createArtboardByNameConfirmed-STqRd7c$$inlined$suspendNativeResourceRequest$1.2
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m491invoke() {
                        awri awriVar3 = awriVar2;
                        if (awriVar3.a) {
                            return;
                        }
                        awriVar3.a = true;
                        Object obj2 = obj;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type app.rive.core.ArtboardHandle");
                        }
                        commandQueue.m416deleteArtboarduiJWFY8(((ArtboardHandle) obj2).m376unboximpl());
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m491invoke();
                        return awmy.a;
                    }
                });
            }

            @Override // defpackage.awqg
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m490invoke(obj);
                return awmy.a;
            }
        };
        awudVar.b(new CommandQueue$suspendNativeResourceRequest$2$1(this, awudVar, andIncrement, awrmVar, awqgVar));
        runOrDispatchOnMain(awudVar.b, new CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1(this, andIncrement, awudVar), new Function0() { // from class: app.rive.core.CommandQueue$createArtboardByNameConfirmed-STqRd7c$$inlined$suspendNativeResourceRequest$2
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m492invoke() {
                if (awudVar.g()) {
                    return;
                }
                CommandQueue commandQueue = this;
                long j2 = andIncrement;
                awuc awucVar = awudVar;
                ConcurrentHashMap concurrentHashMap = commandQueue.pendingContinuations;
                Long lValueOf = Long.valueOf(j2);
                awucVar.getClass();
                concurrentHashMap.put(lValueOf, awucVar);
                CommandQueue commandQueue2 = this;
                long j3 = andIncrement;
                commandQueue2.pendingResourceCleanups.put(Long.valueOf(j3), awqgVar);
                awrm awrmVar2 = awrmVar;
                long j4 = andIncrement;
                CommandQueue commandQueue3 = this;
                awrmVar2.a = ArtboardHandle.m370boximpl(commandQueue3.bridge.cppCreateArtboardByName(commandQueue3.requireNativePointer(), j4, j, str));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m492invoke();
                return awmy.a;
            }
        });
        Object objJ = awudVar.j();
        if (objJ == awox.a) {
            awoqVar.getClass();
        }
        return objJ;
    }

    /* JADX INFO: renamed from: createDefaultArtboard-6NrLy0M, reason: not valid java name */
    public final long m405createDefaultArtboard6NrLy0M(long j) {
        return this.bridge.cppCreateDefaultArtboard(requireNativePointer(), this.nextRequestID.getAndIncrement(), j);
    }

    /* JADX INFO: renamed from: createDefaultArtboardConfirmed-2ZIOzHc, reason: not valid java name */
    public final Object m406createDefaultArtboardConfirmed2ZIOzHc(final long j, awoq awoqVar) {
        final awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        final long andIncrement = this.nextRequestID.getAndIncrement();
        final awrm awrmVar = new awrm();
        final awri awriVar = new awri();
        final awqg awqgVar = new awqg() { // from class: app.rive.core.CommandQueue$createDefaultArtboardConfirmed-2ZIOzHc$$inlined$suspendNativeResourceRequest$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m493invoke(final Object obj) {
                obj.getClass();
                awou context = awudVar.getContext();
                final long j2 = andIncrement;
                awqg awqgVar2 = new awqg() { // from class: app.rive.core.CommandQueue$createDefaultArtboardConfirmed-2ZIOzHc$$inlined$suspendNativeResourceRequest$1.1
                    public final void invoke(Throwable th) {
                        th.getClass();
                        final long j3 = j2;
                        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th, new Function0() { // from class: app.rive.core.CommandQueue$createDefaultArtboardConfirmed-2ZIOzHc$.inlined.suspendNativeResourceRequest.1.1.1
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Failed to clean up resource for cancelled request " + j3;
                            }
                        });
                    }

                    @Override // defpackage.awqg
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return awmy.a;
                    }
                };
                final CommandQueue commandQueue = this;
                final awri awriVar2 = awriVar;
                this.this$0.runOrDispatchOnMain(context, awqgVar2, new Function0() { // from class: app.rive.core.CommandQueue$createDefaultArtboardConfirmed-2ZIOzHc$$inlined$suspendNativeResourceRequest$1.2
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m494invoke() {
                        awri awriVar3 = awriVar2;
                        if (awriVar3.a) {
                            return;
                        }
                        awriVar3.a = true;
                        Object obj2 = obj;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type app.rive.core.ArtboardHandle");
                        }
                        commandQueue.m416deleteArtboarduiJWFY8(((ArtboardHandle) obj2).m376unboximpl());
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m494invoke();
                        return awmy.a;
                    }
                });
            }

            @Override // defpackage.awqg
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m493invoke(obj);
                return awmy.a;
            }
        };
        awudVar.b(new CommandQueue$suspendNativeResourceRequest$2$1(this, awudVar, andIncrement, awrmVar, awqgVar));
        runOrDispatchOnMain(awudVar.b, new CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1(this, andIncrement, awudVar), new Function0() { // from class: app.rive.core.CommandQueue$createDefaultArtboardConfirmed-2ZIOzHc$$inlined$suspendNativeResourceRequest$2
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m495invoke() {
                if (awudVar.g()) {
                    return;
                }
                CommandQueue commandQueue = this;
                long j2 = andIncrement;
                awuc awucVar = awudVar;
                ConcurrentHashMap concurrentHashMap = commandQueue.pendingContinuations;
                Long lValueOf = Long.valueOf(j2);
                awucVar.getClass();
                concurrentHashMap.put(lValueOf, awucVar);
                CommandQueue commandQueue2 = this;
                long j3 = andIncrement;
                commandQueue2.pendingResourceCleanups.put(Long.valueOf(j3), awqgVar);
                awrm awrmVar2 = awrmVar;
                long j4 = andIncrement;
                CommandQueue commandQueue3 = this;
                awrmVar2.a = ArtboardHandle.m370boximpl(commandQueue3.bridge.cppCreateDefaultArtboard(commandQueue3.requireNativePointer(), j4, j));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m495invoke();
                return awmy.a;
            }
        });
        Object objJ = awudVar.j();
        if (objJ == awox.a) {
            awoqVar.getClass();
        }
        return objJ;
    }

    /* JADX INFO: renamed from: createDefaultStateMachine-xY8vNfM, reason: not valid java name */
    public final long m407createDefaultStateMachinexY8vNfM(long j) {
        long jCppCreateDefaultStateMachine = this.bridge.cppCreateDefaultStateMachine(requireNativePointer(), this.nextRequestID.getAndIncrement(), j);
        this.stateMachineSettlingStore.m572registerAkTCgDQ(jCppCreateDefaultStateMachine);
        this.focusStateStore.m541registerAkTCgDQ(jCppCreateDefaultStateMachine);
        return jCppCreateDefaultStateMachine;
    }

    /* JADX INFO: renamed from: createDefaultStateMachineConfirmed-ItmKBmM, reason: not valid java name */
    public final Object m408createDefaultStateMachineConfirmedItmKBmM(final long j, awoq awoqVar) {
        final awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        final long andIncrement = this.nextRequestID.getAndIncrement();
        final awrm awrmVar = new awrm();
        final awri awriVar = new awri();
        final awqg awqgVar = new awqg() { // from class: app.rive.core.CommandQueue$createDefaultStateMachineConfirmed-ItmKBmM$$inlined$suspendNativeResourceRequest$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m496invoke(final Object obj) {
                obj.getClass();
                awou context = awudVar.getContext();
                final long j2 = andIncrement;
                awqg awqgVar2 = new awqg() { // from class: app.rive.core.CommandQueue$createDefaultStateMachineConfirmed-ItmKBmM$$inlined$suspendNativeResourceRequest$1.1
                    public final void invoke(Throwable th) {
                        th.getClass();
                        final long j3 = j2;
                        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th, new Function0() { // from class: app.rive.core.CommandQueue$createDefaultStateMachineConfirmed-ItmKBmM$.inlined.suspendNativeResourceRequest.1.1.1
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Failed to clean up resource for cancelled request " + j3;
                            }
                        });
                    }

                    @Override // defpackage.awqg
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return awmy.a;
                    }
                };
                final CommandQueue commandQueue = this;
                final awri awriVar2 = awriVar;
                this.this$0.runOrDispatchOnMain(context, awqgVar2, new Function0() { // from class: app.rive.core.CommandQueue$createDefaultStateMachineConfirmed-ItmKBmM$$inlined$suspendNativeResourceRequest$1.2
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m497invoke() {
                        awri awriVar3 = awriVar2;
                        if (awriVar3.a) {
                            return;
                        }
                        awriVar3.a = true;
                        Object obj2 = obj;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type app.rive.core.StateMachineHandle");
                        }
                        commandQueue.m421deleteStateMachineAkTCgDQ(((StateMachineHandle) obj2).m570unboximpl());
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m497invoke();
                        return awmy.a;
                    }
                });
            }

            @Override // defpackage.awqg
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m496invoke(obj);
                return awmy.a;
            }
        };
        awudVar.b(new CommandQueue$suspendNativeResourceRequest$2$1(this, awudVar, andIncrement, awrmVar, awqgVar));
        runOrDispatchOnMain(awudVar.b, new CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1(this, andIncrement, awudVar), new Function0() { // from class: app.rive.core.CommandQueue$createDefaultStateMachineConfirmed-ItmKBmM$$inlined$suspendNativeResourceRequest$2
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m498invoke() {
                if (awudVar.g()) {
                    return;
                }
                CommandQueue commandQueue = this;
                long j2 = andIncrement;
                awuc awucVar = awudVar;
                ConcurrentHashMap concurrentHashMap = commandQueue.pendingContinuations;
                Long lValueOf = Long.valueOf(j2);
                awucVar.getClass();
                concurrentHashMap.put(lValueOf, awucVar);
                CommandQueue commandQueue2 = this;
                long j3 = andIncrement;
                commandQueue2.pendingResourceCleanups.put(Long.valueOf(j3), awqgVar);
                awrm awrmVar2 = awrmVar;
                long j4 = andIncrement;
                CommandQueue commandQueue3 = this;
                awrmVar2.a = StateMachineHandle.m564boximpl(commandQueue3.bridge.cppCreateDefaultStateMachine(commandQueue3.requireNativePointer(), j4, j));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m498invoke();
                return awmy.a;
            }
        });
        Object objJ = awudVar.j();
        if (objJ == awox.a) {
            awoqVar.getClass();
        }
        return objJ;
    }

    public final RiveSurface createImageSurface(int i, int i2) {
        return this.renderContext.mo558x25d34fc(i, i2, m391nextDrawKeyDhFih_o(), this);
    }

    public final RiveSurface createRiveSurface(CloseableSurface closeableSurface) {
        closeableSurface.getClass();
        try {
            return this.renderContext.mo559x4819e378(closeableSurface, m391nextDrawKeyDhFih_o(), this);
        } catch (Throwable th) {
            closeableSurface.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: createStateMachineByName-ItmKBmM, reason: not valid java name */
    public final long m409createStateMachineByNameItmKBmM(long j, String str) {
        str.getClass();
        long jCppCreateStateMachineByName = this.bridge.cppCreateStateMachineByName(requireNativePointer(), this.nextRequestID.getAndIncrement(), j, str);
        this.stateMachineSettlingStore.m572registerAkTCgDQ(jCppCreateStateMachineByName);
        this.focusStateStore.m541registerAkTCgDQ(jCppCreateStateMachineByName);
        return jCppCreateStateMachineByName;
    }

    /* JADX INFO: renamed from: createStateMachineByNameConfirmed-OHdLGcE, reason: not valid java name */
    public final Object m410createStateMachineByNameConfirmedOHdLGcE(final long j, final String str, awoq awoqVar) {
        final awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        final long andIncrement = this.nextRequestID.getAndIncrement();
        final awrm awrmVar = new awrm();
        final awri awriVar = new awri();
        final awqg awqgVar = new awqg() { // from class: app.rive.core.CommandQueue$createStateMachineByNameConfirmed-OHdLGcE$$inlined$suspendNativeResourceRequest$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m499invoke(final Object obj) {
                obj.getClass();
                awou context = awudVar.getContext();
                final long j2 = andIncrement;
                awqg awqgVar2 = new awqg() { // from class: app.rive.core.CommandQueue$createStateMachineByNameConfirmed-OHdLGcE$$inlined$suspendNativeResourceRequest$1.1
                    public final void invoke(Throwable th) {
                        th.getClass();
                        final long j3 = j2;
                        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th, new Function0() { // from class: app.rive.core.CommandQueue$createStateMachineByNameConfirmed-OHdLGcE$.inlined.suspendNativeResourceRequest.1.1.1
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Failed to clean up resource for cancelled request " + j3;
                            }
                        });
                    }

                    @Override // defpackage.awqg
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return awmy.a;
                    }
                };
                final CommandQueue commandQueue = this;
                final awri awriVar2 = awriVar;
                this.this$0.runOrDispatchOnMain(context, awqgVar2, new Function0() { // from class: app.rive.core.CommandQueue$createStateMachineByNameConfirmed-OHdLGcE$$inlined$suspendNativeResourceRequest$1.2
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m500invoke() {
                        awri awriVar3 = awriVar2;
                        if (awriVar3.a) {
                            return;
                        }
                        awriVar3.a = true;
                        Object obj2 = obj;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type app.rive.core.StateMachineHandle");
                        }
                        commandQueue.m421deleteStateMachineAkTCgDQ(((StateMachineHandle) obj2).m570unboximpl());
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m500invoke();
                        return awmy.a;
                    }
                });
            }

            @Override // defpackage.awqg
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m499invoke(obj);
                return awmy.a;
            }
        };
        awudVar.b(new CommandQueue$suspendNativeResourceRequest$2$1(this, awudVar, andIncrement, awrmVar, awqgVar));
        runOrDispatchOnMain(awudVar.b, new CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1(this, andIncrement, awudVar), new Function0() { // from class: app.rive.core.CommandQueue$createStateMachineByNameConfirmed-OHdLGcE$$inlined$suspendNativeResourceRequest$2
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m501invoke() {
                if (awudVar.g()) {
                    return;
                }
                CommandQueue commandQueue = this;
                long j2 = andIncrement;
                awuc awucVar = awudVar;
                ConcurrentHashMap concurrentHashMap = commandQueue.pendingContinuations;
                Long lValueOf = Long.valueOf(j2);
                awucVar.getClass();
                concurrentHashMap.put(lValueOf, awucVar);
                CommandQueue commandQueue2 = this;
                long j3 = andIncrement;
                commandQueue2.pendingResourceCleanups.put(Long.valueOf(j3), awqgVar);
                awrm awrmVar2 = awrmVar;
                long j4 = andIncrement;
                CommandQueue commandQueue3 = this;
                awrmVar2.a = StateMachineHandle.m564boximpl(commandQueue3.bridge.cppCreateStateMachineByName(commandQueue3.requireNativePointer(), j4, j, str));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m501invoke();
                return awmy.a;
            }
        });
        Object objJ = awudVar.j();
        if (objJ == awox.a) {
            awoqVar.getClass();
        }
        return objJ;
    }

    /* JADX INFO: renamed from: createViewModelInstance-j73Dd8U, reason: not valid java name */
    public final long m411createViewModelInstancej73Dd8U(long j, ViewModelInstanceSource viewModelInstanceSource) {
        viewModelInstanceSource.getClass();
        m386checkViewModelInstanceSourceevklBmw(j, viewModelInstanceSource);
        return m390enqueueViewModelInstanceCreationWT1fHeI(j, viewModelInstanceSource, this.nextRequestID.getAndIncrement());
    }

    /* JADX INFO: renamed from: createViewModelInstanceConfirmed-WT1fHeI, reason: not valid java name */
    public final Object m412createViewModelInstanceConfirmedWT1fHeI(final long j, final ViewModelInstanceSource viewModelInstanceSource, awoq awoqVar) {
        m386checkViewModelInstanceSourceevklBmw(j, viewModelInstanceSource);
        final awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        final long andIncrement = this.nextRequestID.getAndIncrement();
        final awrm awrmVar = new awrm();
        final awri awriVar = new awri();
        final awqg awqgVar = new awqg() { // from class: app.rive.core.CommandQueue$createViewModelInstanceConfirmed-WT1fHeI$$inlined$suspendNativeResourceRequest$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m502invoke(final Object obj) {
                obj.getClass();
                awou context = awudVar.getContext();
                final long j2 = andIncrement;
                awqg awqgVar2 = new awqg() { // from class: app.rive.core.CommandQueue$createViewModelInstanceConfirmed-WT1fHeI$$inlined$suspendNativeResourceRequest$1.1
                    public final void invoke(Throwable th) {
                        th.getClass();
                        final long j3 = j2;
                        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th, new Function0() { // from class: app.rive.core.CommandQueue$createViewModelInstanceConfirmed-WT1fHeI$.inlined.suspendNativeResourceRequest.1.1.1
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Failed to clean up resource for cancelled request " + j3;
                            }
                        });
                    }

                    @Override // defpackage.awqg
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return awmy.a;
                    }
                };
                final CommandQueue commandQueue = this;
                final awri awriVar2 = awriVar;
                this.this$0.runOrDispatchOnMain(context, awqgVar2, new Function0() { // from class: app.rive.core.CommandQueue$createViewModelInstanceConfirmed-WT1fHeI$$inlined$suspendNativeResourceRequest$1.2
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m503invoke() {
                        awri awriVar3 = awriVar2;
                        if (awriVar3.a) {
                            return;
                        }
                        awriVar3.a = true;
                        Object obj2 = obj;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type app.rive.core.ViewModelInstanceHandle");
                        }
                        commandQueue.m422deleteViewModelInstancemBajs_U(((ViewModelInstanceHandle) obj2).m584unboximpl());
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m503invoke();
                        return awmy.a;
                    }
                });
            }

            @Override // defpackage.awqg
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m502invoke(obj);
                return awmy.a;
            }
        };
        awudVar.b(new CommandQueue$suspendNativeResourceRequest$2$1(this, awudVar, andIncrement, awrmVar, awqgVar));
        runOrDispatchOnMain(awudVar.b, new CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1(this, andIncrement, awudVar), new Function0() { // from class: app.rive.core.CommandQueue$createViewModelInstanceConfirmed-WT1fHeI$$inlined$suspendNativeResourceRequest$2
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m504invoke() {
                if (awudVar.g()) {
                    return;
                }
                CommandQueue commandQueue = this;
                long j2 = andIncrement;
                awuc awucVar = awudVar;
                ConcurrentHashMap concurrentHashMap = commandQueue.pendingContinuations;
                Long lValueOf = Long.valueOf(j2);
                awucVar.getClass();
                concurrentHashMap.put(lValueOf, awucVar);
                CommandQueue commandQueue2 = this;
                long j3 = andIncrement;
                commandQueue2.pendingResourceCleanups.put(Long.valueOf(j3), awqgVar);
                awrmVar.a = ViewModelInstanceHandle.m578boximpl(this.m390enqueueViewModelInstanceCreationWT1fHeI(j, viewModelInstanceSource, andIncrement));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m504invoke();
                return awmy.a;
            }
        });
        Object objJ = awudVar.j();
        if (objJ == awox.a) {
            awoqVar.getClass();
        }
        return objJ;
    }

    /* JADX INFO: renamed from: decodeAudio-WLIIakE, reason: not valid java name */
    public final Object m413decodeAudioWLIIakE(final byte[] bArr, awoq awoqVar) {
        final awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        final long andIncrement = this.nextRequestID.getAndIncrement();
        final awrm awrmVar = new awrm();
        final awri awriVar = new awri();
        final awqg awqgVar = new awqg() { // from class: app.rive.core.CommandQueue$decodeAudio-WLIIakE$$inlined$suspendNativeResourceRequest$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m505invoke(final Object obj) {
                obj.getClass();
                awou context = awudVar.getContext();
                final long j = andIncrement;
                awqg awqgVar2 = new awqg() { // from class: app.rive.core.CommandQueue$decodeAudio-WLIIakE$$inlined$suspendNativeResourceRequest$1.1
                    public final void invoke(Throwable th) {
                        th.getClass();
                        final long j2 = j;
                        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th, new Function0() { // from class: app.rive.core.CommandQueue$decodeAudio-WLIIakE$.inlined.suspendNativeResourceRequest.1.1.1
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Failed to clean up resource for cancelled request " + j2;
                            }
                        });
                    }

                    @Override // defpackage.awqg
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return awmy.a;
                    }
                };
                final CommandQueue commandQueue = this;
                final awri awriVar2 = awriVar;
                this.this$0.runOrDispatchOnMain(context, awqgVar2, new Function0() { // from class: app.rive.core.CommandQueue$decodeAudio-WLIIakE$$inlined$suspendNativeResourceRequest$1.2
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m506invoke() {
                        awri awriVar3 = awriVar2;
                        if (awriVar3.a) {
                            return;
                        }
                        awriVar3.a = true;
                        Object obj2 = obj;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type app.rive.core.AudioHandle");
                        }
                        commandQueue.m417deleteAudioQAnvCWo(((AudioHandle) obj2).m383unboximpl());
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m506invoke();
                        return awmy.a;
                    }
                });
            }

            @Override // defpackage.awqg
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m505invoke(obj);
                return awmy.a;
            }
        };
        awudVar.b(new CommandQueue$suspendNativeResourceRequest$2$1(this, awudVar, andIncrement, awrmVar, awqgVar));
        runOrDispatchOnMain(awudVar.b, new CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1(this, andIncrement, awudVar), new Function0() { // from class: app.rive.core.CommandQueue$decodeAudio-WLIIakE$$inlined$suspendNativeResourceRequest$2
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m507invoke() {
                if (awudVar.g()) {
                    return;
                }
                CommandQueue commandQueue = this;
                long j = andIncrement;
                awuc awucVar = awudVar;
                ConcurrentHashMap concurrentHashMap = commandQueue.pendingContinuations;
                Long lValueOf = Long.valueOf(j);
                awucVar.getClass();
                concurrentHashMap.put(lValueOf, awucVar);
                CommandQueue commandQueue2 = this;
                long j2 = andIncrement;
                commandQueue2.pendingResourceCleanups.put(Long.valueOf(j2), awqgVar);
                awrm awrmVar2 = awrmVar;
                long j3 = andIncrement;
                CommandQueue commandQueue3 = this;
                awrmVar2.a = AudioHandle.m377boximpl(commandQueue3.bridge.cppDecodeAudio(commandQueue3.requireNativePointer(), j3, bArr));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m507invoke();
                return awmy.a;
            }
        });
        Object objJ = awudVar.j();
        if (objJ == awox.a) {
            awoqVar.getClass();
        }
        return objJ;
    }

    /* JADX INFO: renamed from: decodeFont-sOckvAc, reason: not valid java name */
    public final Object m414decodeFontsOckvAc(final byte[] bArr, awoq awoqVar) {
        final awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        final long andIncrement = this.nextRequestID.getAndIncrement();
        final awrm awrmVar = new awrm();
        final awri awriVar = new awri();
        final awqg awqgVar = new awqg() { // from class: app.rive.core.CommandQueue$decodeFont-sOckvAc$$inlined$suspendNativeResourceRequest$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m508invoke(final Object obj) {
                obj.getClass();
                awou context = awudVar.getContext();
                final long j = andIncrement;
                awqg awqgVar2 = new awqg() { // from class: app.rive.core.CommandQueue$decodeFont-sOckvAc$$inlined$suspendNativeResourceRequest$1.1
                    public final void invoke(Throwable th) {
                        th.getClass();
                        final long j2 = j;
                        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th, new Function0() { // from class: app.rive.core.CommandQueue$decodeFont-sOckvAc$.inlined.suspendNativeResourceRequest.1.1.1
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Failed to clean up resource for cancelled request " + j2;
                            }
                        });
                    }

                    @Override // defpackage.awqg
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return awmy.a;
                    }
                };
                final CommandQueue commandQueue = this;
                final awri awriVar2 = awriVar;
                this.this$0.runOrDispatchOnMain(context, awqgVar2, new Function0() { // from class: app.rive.core.CommandQueue$decodeFont-sOckvAc$$inlined$suspendNativeResourceRequest$1.2
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m509invoke() {
                        awri awriVar3 = awriVar2;
                        if (awriVar3.a) {
                            return;
                        }
                        awriVar3.a = true;
                        Object obj2 = obj;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type app.rive.core.FontHandle");
                        }
                        commandQueue.m419deleteFontwK5q9OY(((FontHandle) obj2).m550unboximpl());
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m509invoke();
                        return awmy.a;
                    }
                });
            }

            @Override // defpackage.awqg
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m508invoke(obj);
                return awmy.a;
            }
        };
        awudVar.b(new CommandQueue$suspendNativeResourceRequest$2$1(this, awudVar, andIncrement, awrmVar, awqgVar));
        runOrDispatchOnMain(awudVar.b, new CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1(this, andIncrement, awudVar), new Function0() { // from class: app.rive.core.CommandQueue$decodeFont-sOckvAc$$inlined$suspendNativeResourceRequest$2
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m510invoke() {
                if (awudVar.g()) {
                    return;
                }
                CommandQueue commandQueue = this;
                long j = andIncrement;
                awuc awucVar = awudVar;
                ConcurrentHashMap concurrentHashMap = commandQueue.pendingContinuations;
                Long lValueOf = Long.valueOf(j);
                awucVar.getClass();
                concurrentHashMap.put(lValueOf, awucVar);
                CommandQueue commandQueue2 = this;
                long j2 = andIncrement;
                commandQueue2.pendingResourceCleanups.put(Long.valueOf(j2), awqgVar);
                awrm awrmVar2 = awrmVar;
                long j3 = andIncrement;
                CommandQueue commandQueue3 = this;
                awrmVar2.a = FontHandle.m544boximpl(commandQueue3.bridge.cppDecodeFont(commandQueue3.requireNativePointer(), j3, bArr));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m510invoke();
                return awmy.a;
            }
        });
        Object objJ = awudVar.j();
        if (objJ == awox.a) {
            awoqVar.getClass();
        }
        return objJ;
    }

    /* JADX INFO: renamed from: decodeImage-f0BlWSU, reason: not valid java name */
    public final Object m415decodeImagef0BlWSU(final byte[] bArr, awoq awoqVar) {
        final awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        final long andIncrement = this.nextRequestID.getAndIncrement();
        final awrm awrmVar = new awrm();
        final awri awriVar = new awri();
        final awqg awqgVar = new awqg() { // from class: app.rive.core.CommandQueue$decodeImage-f0BlWSU$$inlined$suspendNativeResourceRequest$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m511invoke(final Object obj) {
                obj.getClass();
                awou context = awudVar.getContext();
                final long j = andIncrement;
                awqg awqgVar2 = new awqg() { // from class: app.rive.core.CommandQueue$decodeImage-f0BlWSU$$inlined$suspendNativeResourceRequest$1.1
                    public final void invoke(Throwable th) {
                        th.getClass();
                        final long j2 = j;
                        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th, new Function0() { // from class: app.rive.core.CommandQueue$decodeImage-f0BlWSU$.inlined.suspendNativeResourceRequest.1.1.1
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Failed to clean up resource for cancelled request " + j2;
                            }
                        });
                    }

                    @Override // defpackage.awqg
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return awmy.a;
                    }
                };
                final CommandQueue commandQueue = this;
                final awri awriVar2 = awriVar;
                this.this$0.runOrDispatchOnMain(context, awqgVar2, new Function0() { // from class: app.rive.core.CommandQueue$decodeImage-f0BlWSU$$inlined$suspendNativeResourceRequest$1.2
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m512invoke() {
                        awri awriVar3 = awriVar2;
                        if (awriVar3.a) {
                            return;
                        }
                        awriVar3.a = true;
                        Object obj2 = obj;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type app.rive.core.ImageHandle");
                        }
                        commandQueue.m420deleteImageJwfOFvA(((ImageHandle) obj2).m557unboximpl());
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m512invoke();
                        return awmy.a;
                    }
                });
            }

            @Override // defpackage.awqg
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m511invoke(obj);
                return awmy.a;
            }
        };
        awudVar.b(new CommandQueue$suspendNativeResourceRequest$2$1(this, awudVar, andIncrement, awrmVar, awqgVar));
        runOrDispatchOnMain(awudVar.b, new CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1(this, andIncrement, awudVar), new Function0() { // from class: app.rive.core.CommandQueue$decodeImage-f0BlWSU$$inlined$suspendNativeResourceRequest$2
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m513invoke() {
                if (awudVar.g()) {
                    return;
                }
                CommandQueue commandQueue = this;
                long j = andIncrement;
                awuc awucVar = awudVar;
                ConcurrentHashMap concurrentHashMap = commandQueue.pendingContinuations;
                Long lValueOf = Long.valueOf(j);
                awucVar.getClass();
                concurrentHashMap.put(lValueOf, awucVar);
                CommandQueue commandQueue2 = this;
                long j2 = andIncrement;
                commandQueue2.pendingResourceCleanups.put(Long.valueOf(j2), awqgVar);
                awrm awrmVar2 = awrmVar;
                long j3 = andIncrement;
                CommandQueue commandQueue3 = this;
                awrmVar2.a = ImageHandle.m551boximpl(commandQueue3.bridge.cppDecodeImage(commandQueue3.requireNativePointer(), j3, bArr));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m513invoke();
                return awmy.a;
            }
        });
        Object objJ = awudVar.j();
        if (objJ == awox.a) {
            awoqVar.getClass();
        }
        return objJ;
    }

    /* JADX INFO: renamed from: deleteArtboard-uiJWFY8, reason: not valid java name */
    public final void m416deleteArtboarduiJWFY8(final long j) {
        withCleanupReference$third_party_java_android_libs_rive_rive_android(new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommandQueue.deleteArtboard_uiJWFY8$lambda$0(this.f$0, j);
            }
        });
    }

    /* JADX INFO: renamed from: deleteAudio-QAnvCWo, reason: not valid java name */
    public final void m417deleteAudioQAnvCWo(long j) {
        this.bridge.cppDeleteAudio(requireNativePointer(), j);
    }

    /* JADX INFO: renamed from: deleteFile-dJ1Evnk, reason: not valid java name */
    public final void m418deleteFiledJ1Evnk(long j) {
        this.bridge.cppDeleteFile(requireNativePointer(), this.nextRequestID.getAndIncrement(), j);
    }

    /* JADX INFO: renamed from: deleteFont-wK5q9OY, reason: not valid java name */
    public final void m419deleteFontwK5q9OY(long j) {
        this.bridge.cppDeleteFont(requireNativePointer(), j);
    }

    /* JADX INFO: renamed from: deleteImage-JwfOFvA, reason: not valid java name */
    public final void m420deleteImageJwfOFvA(long j) {
        this.bridge.cppDeleteImage(requireNativePointer(), j);
    }

    /* JADX INFO: renamed from: deleteStateMachine-AkTCgDQ, reason: not valid java name */
    public final void m421deleteStateMachineAkTCgDQ(final long j) {
        withCleanupReference$third_party_java_android_libs_rive_rive_android(new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommandQueue.deleteStateMachine_AkTCgDQ$lambda$0(this.f$0, j);
            }
        });
        this.stateMachineSettlingStore.m575unregisterAkTCgDQ(j);
        this.focusStateStore.m543unregisterAkTCgDQ(j);
    }

    /* JADX INFO: renamed from: deleteViewModelInstance-mBajs_U, reason: not valid java name */
    public final void m422deleteViewModelInstancemBajs_U(final long j) {
        withCleanupReference$third_party_java_android_libs_rive_rive_android(new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommandQueue.deleteViewModelInstance_mBajs_U$lambda$0(this.f$0, j);
            }
        });
    }

    public final void destroyRiveSurface(RiveSurface riveSurface) {
        riveSurface.getClass();
        checkOpen$third_party_java_android_libs_rive_rive_android();
        riveSurface.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this);
        riveSurface.close();
    }

    /* JADX INFO: renamed from: drainSemanticsDiff-TORGcfM, reason: not valid java name */
    public final void m423drainSemanticsDiffTORGcfM(long j, Fit fit, float f, float f2) {
        fit.getClass();
        this.bridge.cppDrainSemanticsDiff(requireNativePointer(), j, fit.getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getAlignment().getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getScaleFactor(), f, f2);
    }

    /* JADX INFO: renamed from: draw-Occ3x_Y, reason: not valid java name */
    public final void m424drawOcc3x_Y(long j, long j2, RiveSurface riveSurface, Fit fit, int i) {
        riveSurface.getClass();
        fit.getClass();
        checkOpen$third_party_java_android_libs_rive_rive_android();
        long jRequireNativePointer$third_party_java_android_libs_rive_rive_android = riveSurface.requireNativePointer$third_party_java_android_libs_rive_rive_android();
        riveSurface.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this);
        RenderContext renderContext = this.renderContext;
        this.bridge.cppDraw(requireNativePointer(), renderContext.getNativeObjectPointer(), jRequireNativePointer$third_party_java_android_libs_rive_rive_android, riveSurface.m561getDrawKeyDhFih_o(), j, j2, riveSurface.getWidth(), riveSurface.getHeight(), fit.getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getAlignment().getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getScaleFactor(), i);
    }

    /* JADX INFO: renamed from: drawToBuffer-fS7xHJs, reason: not valid java name */
    public final void m425drawToBufferfS7xHJs(long j, long j2, RiveSurface riveSurface, byte[] bArr, int i, int i2, Fit fit, int i3) {
        riveSurface.getClass();
        bArr.getClass();
        fit.getClass();
        checkOpen$third_party_java_android_libs_rive_rive_android();
        long jRequireNativePointer$third_party_java_android_libs_rive_rive_android = riveSurface.requireNativePointer$third_party_java_android_libs_rive_rive_android();
        riveSurface.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this);
        RenderContext renderContext = this.renderContext;
        this.bridge.cppDrawToBuffer(requireNativePointer(), renderContext.getNativeObjectPointer(), jRequireNativePointer$third_party_java_android_libs_rive_rive_android, riveSurface.m561getDrawKeyDhFih_o(), j, j2, i, i2, fit.getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getAlignment().getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getScaleFactor(), i3, bArr);
    }

    /* JADX INFO: renamed from: enableSemantics-AkTCgDQ, reason: not valid java name */
    public final void m426enableSemanticsAkTCgDQ(long j) {
        this.bridge.cppEnableSemantics(requireNativePointer(), j);
    }

    /* JADX INFO: renamed from: fireSemanticAction-DFYt-xA, reason: not valid java name */
    public final void m427fireSemanticActionDFYtxA(long j, int i, SemanticActionType semanticActionType) {
        semanticActionType.getClass();
        this.bridge.cppFireSemanticAction(requireNativePointer(), j, i, semanticActionType.getValue$third_party_java_android_libs_rive_rive_android());
    }

    /* JADX INFO: renamed from: fireTriggerProperty-ippgHXQ, reason: not valid java name */
    public final void m428fireTriggerPropertyippgHXQ(long j, String str) {
        str.getClass();
        this.bridge.cppFireTriggerProperty(requireNativePointer(), j, str);
    }

    /* JADX INFO: renamed from: focusState-AkTCgDQ, reason: not valid java name */
    public final axat m429focusStateAkTCgDQ(long j) {
        return this.focusStateStore.m538focusStateAkTCgDQ(j);
    }

    /* JADX INFO: renamed from: getArtboardNames-evklBmw, reason: not valid java name */
    public final Object m430getArtboardNamesevklBmw(long j, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getArtboardNamesevklBmw$$inlined$suspendNativeRequest$1(this, null, this, j), awoqVar);
    }

    /* JADX INFO: renamed from: getArtboardVolume-b88yb0A, reason: not valid java name */
    public final Object m431getArtboardVolumeb88yb0A(long j, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getArtboardVolumeb88yb0A$$inlined$suspendNativeRequest$1(this, null, this, j), awoqVar);
    }

    /* JADX INFO: renamed from: getBooleanProperty-iFQtAB8, reason: not valid java name */
    public final Object m432getBooleanPropertyiFQtAB8(long j, String str, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getBooleanPropertyiFQtAB8$$inlined$suspendNativeRequest$1(this, null, this, j, str), awoqVar);
    }

    public final axah getBooleanPropertyFlow() {
        return this.booleanPropertyFlow;
    }

    /* JADX INFO: renamed from: getColorProperty-iFQtAB8, reason: not valid java name */
    public final Object m433getColorPropertyiFQtAB8(long j, String str, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getColorPropertyiFQtAB8$$inlined$suspendNativeRequest$1(this, null, this, j, str), awoqVar);
    }

    public final axah getColorPropertyFlow() {
        return this.colorPropertyFlow;
    }

    /* JADX INFO: renamed from: getDefaultViewModelInfo-tl3utA8, reason: not valid java name */
    public final Object m434getDefaultViewModelInfotl3utA8(long j, long j2, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getDefaultViewModelInfotl3utA8$$inlined$suspendNativeRequest$1(this, null, this, j, j2), awoqVar);
    }

    /* JADX INFO: renamed from: getEnumProperty-iFQtAB8, reason: not valid java name */
    public final Object m435getEnumPropertyiFQtAB8(long j, String str, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getEnumPropertyiFQtAB8$$inlined$suspendNativeRequest$1(this, null, this, j, str), awoqVar);
    }

    public final axah getEnumPropertyFlow() {
        return this.enumPropertyFlow;
    }

    /* JADX INFO: renamed from: getEnums-evklBmw, reason: not valid java name */
    public final Object m436getEnumsevklBmw(long j, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getEnumsevklBmw$$inlined$suspendNativeRequest$1(this, null, this, j), awoqVar);
    }

    /* JADX INFO: renamed from: getFileAssets-evklBmw, reason: not valid java name */
    public final Object m437getFileAssetsevklBmw(long j, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getFileAssetsevklBmw$$inlined$suspendNativeRequest$1(this, null, this, j), awoqVar);
    }

    /* JADX INFO: renamed from: getListSize-iFQtAB8, reason: not valid java name */
    public final Object m438getListSizeiFQtAB8(long j, String str, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getListSizeiFQtAB8$$inlined$suspendNativeRequest$1(this, null, this, j, str), awoqVar);
    }

    /* JADX INFO: renamed from: getNumberProperty-iFQtAB8, reason: not valid java name */
    public final Object m439getNumberPropertyiFQtAB8(long j, String str, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getNumberPropertyiFQtAB8$$inlined$suspendNativeRequest$1(this, null, this, j, str), awoqVar);
    }

    public final axah getNumberPropertyFlow() {
        return this.numberPropertyFlow;
    }

    @Override // app.rive.core.RefCounted
    public int getRefCount() {
        return this.cppPointer.getRefCount();
    }

    public final axah getSettledFlow() {
        return this.settledFlow;
    }

    /* JADX INFO: renamed from: getStateMachineNames-b88yb0A, reason: not valid java name */
    public final Object m440getStateMachineNamesb88yb0A(long j, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getStateMachineNamesb88yb0A$$inlined$suspendNativeRequest$1(this, null, this, j), awoqVar);
    }

    /* JADX INFO: renamed from: getStringProperty-iFQtAB8, reason: not valid java name */
    public final Object m441getStringPropertyiFQtAB8(long j, String str, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getStringPropertyiFQtAB8$$inlined$suspendNativeRequest$1(this, null, this, j, str), awoqVar);
    }

    public final axah getStringPropertyFlow() {
        return this.stringPropertyFlow;
    }

    public final axah getTriggerPropertyFlow() {
        return this.triggerPropertyFlow;
    }

    /* JADX INFO: renamed from: getViewModelInstanceName-ippgHXQ, reason: not valid java name */
    public final Object m442getViewModelInstanceNameippgHXQ(long j, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getViewModelInstanceNameippgHXQ$$inlined$suspendNativeRequest$1(this, null, this, j), awoqVar);
    }

    /* JADX INFO: renamed from: getViewModelInstanceNames-mgMojzc, reason: not valid java name */
    public final Object m443getViewModelInstanceNamesmgMojzc(long j, String str, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getViewModelInstanceNamesmgMojzc$$inlined$suspendNativeRequest$1(this, null, this, j, str), awoqVar);
    }

    /* JADX INFO: renamed from: getViewModelInstanceViewModelName-ippgHXQ, reason: not valid java name */
    public final Object m444getViewModelInstanceViewModelNameippgHXQ(long j, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getViewModelInstanceViewModelNameippgHXQ$$inlined$suspendNativeRequest$1(this, null, this, j), awoqVar);
    }

    /* JADX INFO: renamed from: getViewModelNames-evklBmw, reason: not valid java name */
    public final Object m445getViewModelNamesevklBmw(long j, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getViewModelNamesevklBmw$$inlined$suspendNativeRequest$1(this, null, this, j), awoqVar);
    }

    /* JADX INFO: renamed from: getViewModelProperties-mgMojzc, reason: not valid java name */
    public final Object m446getViewModelPropertiesmgMojzc(long j, String str, awoq awoqVar) {
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$getViewModelPropertiesmgMojzc$$inlined$suspendNativeRequest$1(this, null, this, j, str), awoqVar);
    }

    /* JADX INFO: renamed from: hasFocusNodes-AkTCgDQ, reason: not valid java name */
    public final axat m447hasFocusNodesAkTCgDQ(long j) {
        return this.focusStateStore.m539hasFocusNodesAkTCgDQ(j);
    }

    /* JADX INFO: renamed from: hasSemanticTree-AkTCgDQ$third_party_java_android_libs_rive_rive_android, reason: not valid java name */
    public final boolean m448xc6e29262(long j) {
        return this.semanticTrees.containsKey(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: insertToListAtIndex-4ua1WBo, reason: not valid java name */
    public final void m449insertToListAtIndex4ua1WBo(long j, String str, int i, long j2) {
        str.getClass();
        this.bridge.cppInsertToListAtIndex(requireNativePointer(), j, str, i, j2);
    }

    @Override // app.rive.core.RefCounted
    public boolean isDisposed() {
        return this.cppPointer.isDisposed();
    }

    /* JADX INFO: renamed from: loadFile-xVnc2tA, reason: not valid java name */
    public final Object m450loadFilexVnc2tA(final byte[] bArr, awoq awoqVar) {
        final awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        final long andIncrement = this.nextRequestID.getAndIncrement();
        final awrm awrmVar = new awrm();
        final awri awriVar = new awri();
        final awqg awqgVar = new awqg() { // from class: app.rive.core.CommandQueue$loadFile-xVnc2tA$$inlined$suspendNativeResourceRequest$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m514invoke(final Object obj) {
                obj.getClass();
                awou context = awudVar.getContext();
                final long j = andIncrement;
                awqg awqgVar2 = new awqg() { // from class: app.rive.core.CommandQueue$loadFile-xVnc2tA$$inlined$suspendNativeResourceRequest$1.1
                    public final void invoke(Throwable th) {
                        th.getClass();
                        final long j2 = j;
                        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th, new Function0() { // from class: app.rive.core.CommandQueue$loadFile-xVnc2tA$.inlined.suspendNativeResourceRequest.1.1.1
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Failed to clean up resource for cancelled request " + j2;
                            }
                        });
                    }

                    @Override // defpackage.awqg
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return awmy.a;
                    }
                };
                final CommandQueue commandQueue = this;
                final awri awriVar2 = awriVar;
                this.this$0.runOrDispatchOnMain(context, awqgVar2, new Function0() { // from class: app.rive.core.CommandQueue$loadFile-xVnc2tA$$inlined$suspendNativeResourceRequest$1.2
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m515invoke() {
                        awri awriVar3 = awriVar2;
                        if (awriVar3.a) {
                            return;
                        }
                        awriVar3.a = true;
                        Object obj2 = obj;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type app.rive.core.FileHandle");
                        }
                        commandQueue.m418deleteFiledJ1Evnk(((FileHandle) obj2).m534unboximpl());
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m515invoke();
                        return awmy.a;
                    }
                });
            }

            @Override // defpackage.awqg
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m514invoke(obj);
                return awmy.a;
            }
        };
        awudVar.b(new CommandQueue$suspendNativeResourceRequest$2$1(this, awudVar, andIncrement, awrmVar, awqgVar));
        runOrDispatchOnMain(awudVar.b, new CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1(this, andIncrement, awudVar), new Function0() { // from class: app.rive.core.CommandQueue$loadFile-xVnc2tA$$inlined$suspendNativeResourceRequest$2
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m516invoke() {
                if (awudVar.g()) {
                    return;
                }
                CommandQueue commandQueue = this;
                long j = andIncrement;
                awuc awucVar = awudVar;
                ConcurrentHashMap concurrentHashMap = commandQueue.pendingContinuations;
                Long lValueOf = Long.valueOf(j);
                awucVar.getClass();
                concurrentHashMap.put(lValueOf, awucVar);
                CommandQueue commandQueue2 = this;
                long j2 = andIncrement;
                commandQueue2.pendingResourceCleanups.put(Long.valueOf(j2), awqgVar);
                awrm awrmVar2 = awrmVar;
                long j3 = andIncrement;
                CommandQueue commandQueue3 = this;
                awrmVar2.a = FileHandle.m528boximpl(commandQueue3.bridge.cppLoadFile(commandQueue3.requireNativePointer(), j3, bArr));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m516invoke();
                return awmy.a;
            }
        });
        Object objJ = awudVar.j();
        if (objJ == awox.a) {
            awoqVar.getClass();
        }
        return objJ;
    }

    /* JADX INFO: renamed from: moveFocus-DFYt-xA, reason: not valid java name */
    public final Object m451moveFocusDFYtxA(long j, RiveFocusDirection riveFocusDirection, awoq awoqVar) {
        awql commandQueue$moveFocus$submitTraversal$1;
        long jRequireNativePointer = requireNativePointer();
        RiveFocusDirection riveFocusDirection2 = RiveFocusDirection.Next;
        int iOrdinal = riveFocusDirection.ordinal();
        if (iOrdinal == 0) {
            commandQueue$moveFocus$submitTraversal$1 = new CommandQueue$moveFocus$submitTraversal$1(this.bridge);
        } else {
            if (iOrdinal != 1) {
                throw new awmj();
            }
            commandQueue$moveFocus$submitTraversal$1 = new CommandQueue$moveFocus$submitTraversal$2(this.bridge);
        }
        m389enqueueFocusCommand3uIp1w(jRequireNativePointer, j, commandQueue$moveFocus$submitTraversal$1);
        awuq awuqVar = awvi.a;
        return awro.p(axds.a.j(), new CommandQueue$moveFocusDFYtxA$$inlined$suspendNativeRequest$1(this, null, this, jRequireNativePointer, j), awoqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onArtboardError(final long j, final String str) {
        str.getClass();
        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, null, new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommandQueue.onArtboardError$lambda$0(j, str);
            }
        });
        failNativeRequest(j, new RiveArtboardException("Artboard error: ".concat(str), null, 2, 0 == true ? 1 : 0));
    }

    public final void onArtboardInstantiated(long j, long j2) {
        resumeResourceRequest(j, ArtboardHandle.m370boximpl(j2));
    }

    public final void onArtboardVolumeReceived(long j, float f) {
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(Float.valueOf(f));
        }
    }

    public final void onArtboardsListed(long j, List list) {
        list.getClass();
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(list);
        }
    }

    public final void onAudioDecoded(long j, long j2) {
        resumeResourceRequest(j, AudioHandle.m377boximpl(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAudioError(long j, String str) {
        str.getClass();
        failNativeRequest(j, new RiveAudioException("Failed to decode audio: ".concat(str), null, 2, 0 == true ? 1 : 0));
    }

    public final void onBooleanPropertyUpdated(long j, long j2, String str, boolean z) {
        str.getClass();
        m392onPropertyUpdatedUrmHyfM(j, j2, str, Boolean.valueOf(z), this._booleanPropertyFlow);
    }

    public final void onColorPropertyUpdated(long j, long j2, String str, int i) {
        str.getClass();
        m392onPropertyUpdatedUrmHyfM(j, j2, str, Integer.valueOf(i), this._colorPropertyFlow);
    }

    public final void onDefaultViewModelInfoReceived(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(new DefaultViewModelInfo(str, str2));
        }
    }

    public final void onEnumPropertyUpdated(long j, long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        m392onPropertyUpdatedUrmHyfM(j, j2, str, str2, this._enumPropertyFlow);
    }

    public final void onEnumsListed(long j, List list) {
        list.getClass();
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(list);
        }
    }

    public final void onFileAssetsListed(long j, List list) {
        list.getClass();
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFileError(final long j, final String str) {
        str.getClass();
        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, null, new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommandQueue.onFileError$lambda$0(j, str);
            }
        });
        failNativeRequest(j, new RiveFileException("File error: ".concat(str), null, 2, 0 == true ? 1 : 0));
    }

    public final void onFileLoaded(long j, long j2) {
        resumeResourceRequest(j, FileHandle.m528boximpl(j2));
    }

    public final void onFocusStateReceived(long j, long j2, boolean z, boolean z2) {
        FocusStateStore focusStateStore = this.focusStateStore;
        RiveFocusState riveFocusStateRiveFocusStateOf = RiveFocusStateKt.riveFocusStateOf(z, z2);
        focusStateStore.m536applyFocusState3uIp1w(j, j2, riveFocusStateRiveFocusStateOf);
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(riveFocusStateRiveFocusStateOf);
        }
    }

    public final void onFontDecoded(long j, long j2) {
        resumeResourceRequest(j, FontHandle.m544boximpl(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFontError(long j, String str) {
        str.getClass();
        failNativeRequest(j, new RiveFontException("Failed to decode font: ".concat(str), null, 2, 0 == true ? 1 : 0));
    }

    public final void onHasFocusNodesReceived(long j, boolean z) {
        this.focusStateStore.m537applyHasFocusNodesOFH3VyA(j, z);
    }

    public final void onImageDecoded(long j, long j2) {
        resumeResourceRequest(j, ImageHandle.m551boximpl(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onImageError(long j, String str) {
        str.getClass();
        failNativeRequest(j, new RiveImageException("Failed to decode image: ".concat(str), null, 2, 0 == true ? 1 : 0));
    }

    public final void onNumberPropertyUpdated(long j, long j2, String str, float f) {
        str.getClass();
        m392onPropertyUpdatedUrmHyfM(j, j2, str, Float.valueOf(f), this._numberPropertyFlow);
    }

    public final void onSemanticsDiffReceived(final long j, final SemanticsDiff semanticsDiff) {
        semanticsDiff.getClass();
        m468semanticTreeAkTCgDQ(j).applyDiff$third_party_java_android_libs_rive_rive_android(semanticsDiff);
        RiveLog.INSTANCE.getLogger().v(CommandQueueKt.COMMAND_QUEUE_TAG, new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommandQueue.onSemanticsDiffReceived_OFH3VyA$lambda$0(j, semanticsDiff);
            }
        });
    }

    public final void onStateMachineDeleted(long j) {
        this.semanticTrees.remove(Long.valueOf(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStateMachineError(final long j, final String str) {
        str.getClass();
        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, null, new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommandQueue.onStateMachineError$lambda$0(j, str);
            }
        });
        failNativeRequest(j, new RiveStateMachineException("State machine error: ".concat(str), null, 2, 0 == true ? 1 : 0));
    }

    public final void onStateMachineInstantiated(long j, long j2) {
        boolean zContainsKey = this.pendingContinuations.containsKey(Long.valueOf(j));
        if (zContainsKey) {
            this.stateMachineSettlingStore.m572registerAkTCgDQ(j2);
            this.focusStateStore.m541registerAkTCgDQ(j2);
        }
        boolean zResumeResourceRequest = resumeResourceRequest(j, StateMachineHandle.m564boximpl(j2));
        if (!zContainsKey || zResumeResourceRequest) {
            return;
        }
        this.stateMachineSettlingStore.m575unregisterAkTCgDQ(j2);
        this.focusStateStore.m543unregisterAkTCgDQ(j2);
    }

    public final void onStateMachineSettled(long j, long j2) {
        this.stateMachineSettlingStore.m573settleS2xOzgc(j, j2);
    }

    public final void onStateMachinesListed(long j, List list) {
        list.getClass();
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(list);
        }
    }

    public final void onStringPropertyUpdated(long j, long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        m392onPropertyUpdatedUrmHyfM(j, j2, str, str2, this._stringPropertyFlow);
    }

    public final void onTriggerPropertyUpdated(long j, long j2, String str) {
        str.getClass();
        m392onPropertyUpdatedUrmHyfM(j, j2, str, awmy.a, this._triggerPropertyFlow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewModelInstanceError(final long j, final String str) {
        str.getClass();
        RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, null, new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommandQueue.onViewModelInstanceError$lambda$0(j, str);
            }
        });
        failNativeRequest(j, new RiveViewModelInstanceException("View model instance error: ".concat(str), null, 2, 0 == true ? 1 : 0));
    }

    public final void onViewModelInstanceInstantiated(long j, long j2) {
        resumeResourceRequest(j, ViewModelInstanceHandle.m578boximpl(j2));
    }

    public final void onViewModelInstanceNameReceived(long j, String str) {
        str.getClass();
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(str);
        }
    }

    public final void onViewModelInstanceViewModelNameReceived(long j, String str) {
        str.getClass();
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(str);
        }
    }

    public final void onViewModelInstancesListed(long j, List list) {
        list.getClass();
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(list);
        }
    }

    public final void onViewModelListSizeReceived(long j, int i) {
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(Integer.valueOf(i));
        }
    }

    public final void onViewModelPropertiesListed(long j, List list) {
        list.getClass();
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(list);
        }
    }

    public final void onViewModelsListed(long j, List list) {
        list.getClass();
        Object objRemove = this.pendingContinuations.remove(Long.valueOf(j));
        awoq awoqVar = objRemove instanceof awoq ? (awoq) objRemove : null;
        if (awoqVar != null) {
            awoqVar.resumeWith(list);
        }
    }

    /* JADX INFO: renamed from: pointerDown-iHGrxBs, reason: not valid java name */
    public final void m452pointerDowniHGrxBs(long j, Fit fit, float f, float f2, int i, float f3, float f4) {
        fit.getClass();
        this.bridge.cppPointerDown(requireNativePointer(), j, fit.getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getAlignment().getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getScaleFactor(), f, f2, i, f3, f4);
    }

    /* JADX INFO: renamed from: pointerExit-iHGrxBs, reason: not valid java name */
    public final void m453pointerExitiHGrxBs(long j, Fit fit, float f, float f2, int i, float f3, float f4) {
        fit.getClass();
        this.bridge.cppPointerExit(requireNativePointer(), j, fit.getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getAlignment().getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getScaleFactor(), f, f2, i, f3, f4);
    }

    /* JADX INFO: renamed from: pointerMove-iHGrxBs, reason: not valid java name */
    public final void m454pointerMoveiHGrxBs(long j, Fit fit, float f, float f2, int i, float f3, float f4) {
        fit.getClass();
        this.bridge.cppPointerMove(requireNativePointer(), j, fit.getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getAlignment().getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getScaleFactor(), f, f2, i, f3, f4);
    }

    /* JADX INFO: renamed from: pointerUp-iHGrxBs, reason: not valid java name */
    public final void m455pointerUpiHGrxBs(long j, Fit fit, float f, float f2, int i, float f3, float f4) {
        fit.getClass();
        this.bridge.cppPointerUp(requireNativePointer(), j, fit.getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getAlignment().getNativeMapping$third_party_java_android_libs_rive_rive_android(), fit.getScaleFactor(), f, f2, i, f3, f4);
    }

    /* JADX INFO: renamed from: pollFocus-AkTCgDQ, reason: not valid java name */
    public final void m456pollFocusAkTCgDQ(long j) {
        m464requestHasFocusNodesAkTCgDQ(j);
        m463requestFocusStateAkTCgDQ(j);
    }

    public final void pollMessages() {
        if (!awrc.c(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("CommandQueue.pollMessages must be called on the main thread.");
        }
        this.bridge.cppPollMessages(requireNativePointer());
    }

    /* JADX INFO: renamed from: registerAudio-4kKS7jM, reason: not valid java name */
    public final void m457registerAudio4kKS7jM(String str, long j) {
        str.getClass();
        this.bridge.cppRegisterAudio(requireNativePointer(), str, j);
    }

    /* JADX INFO: renamed from: registerFont-8-RWjZU, reason: not valid java name */
    public final void m458registerFont8RWjZU(String str, long j) {
        str.getClass();
        this.bridge.cppRegisterFont(requireNativePointer(), str, j);
    }

    /* JADX INFO: renamed from: registerImage-QieQ09U, reason: not valid java name */
    public final void m459registerImageQieQ09U(String str, long j) {
        str.getClass();
        this.bridge.cppRegisterImage(requireNativePointer(), str, j);
    }

    @Override // app.rive.core.RefCounted
    public void release(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (this.bridge.isCurrentThreadCommandServer(requireNativePointer())) {
            throw new IllegalStateException(a.ca(str2, str, "CommandQueue.release() cannot be called from the command server thread as then it may attempt to join itself. Source: ", ". Reason: "));
        }
        this.cppPointer.release(str, str2);
    }

    /* JADX INFO: renamed from: removeFromList-Y8k3COA, reason: not valid java name */
    public final void m460removeFromListY8k3COA(long j, String str, long j2) {
        str.getClass();
        this.bridge.cppRemoveFromList(requireNativePointer(), j, str, j2);
    }

    /* JADX INFO: renamed from: removeFromListAtIndex-iFQtAB8, reason: not valid java name */
    public final void m461removeFromListAtIndexiFQtAB8(long j, String str, int i) {
        str.getClass();
        this.bridge.cppRemoveFromListAtIndex(requireNativePointer(), j, str, i);
    }

    /* JADX INFO: renamed from: reportedHasFocusNodes-AkTCgDQ$third_party_java_android_libs_rive_rive_android, reason: not valid java name */
    public final axat m462xdf4bf704(long j) {
        return this.focusStateStore.m542reportedHasFocusNodesAkTCgDQ(j);
    }

    /* JADX INFO: renamed from: requestFocusState-AkTCgDQ, reason: not valid java name */
    public final void m463requestFocusStateAkTCgDQ(long j) {
        this.bridge.cppRequestFocusState(requireNativePointer(), j, this.nextRequestID.getAndIncrement());
    }

    /* JADX INFO: renamed from: requestHasFocusNodes-AkTCgDQ, reason: not valid java name */
    public final void m464requestHasFocusNodesAkTCgDQ(long j) {
        this.bridge.cppRequestHasFocusNodes(requireNativePointer(), j, this.nextRequestID.getAndIncrement());
    }

    /* JADX INFO: renamed from: requestSemanticFocus-OFH3VyA, reason: not valid java name */
    public final void m465requestSemanticFocusOFH3VyA(long j, int i) {
        this.bridge.cppRequestSemanticFocus(requireNativePointer(), j, i);
    }

    /* JADX INFO: renamed from: resetArtboardSize-uiJWFY8, reason: not valid java name */
    public final void m466resetArtboardSizeuiJWFY8(long j) {
        this.bridge.cppResetArtboardSize(requireNativePointer(), j);
    }

    /* JADX INFO: renamed from: resizeArtboard-VFK_cXo, reason: not valid java name */
    public final void m467resizeArtboardVFK_cXo(long j, RiveSurface riveSurface, float f) {
        riveSurface.getClass();
        checkOpen$third_party_java_android_libs_rive_rive_android();
        riveSurface.checkOpen$third_party_java_android_libs_rive_rive_android();
        riveSurface.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this);
        this.bridge.cppResizeArtboard(requireNativePointer(), j, riveSurface.getWidth(), riveSurface.getHeight(), f);
    }

    public final void runOnCommandServer$third_party_java_android_libs_rive_rive_android(Function0 function0) {
        function0.getClass();
        this.bridge.cppRunOnCommandServer(requireNativePointer(), function0);
    }

    /* JADX INFO: renamed from: semanticTree-AkTCgDQ, reason: not valid java name */
    public final SemanticTreeModel m468semanticTreeAkTCgDQ(long j) {
        Map map = this.semanticTrees;
        Long lValueOf = Long.valueOf(j);
        Object semanticTreeModel = map.get(lValueOf);
        if (semanticTreeModel == null) {
            semanticTreeModel = new SemanticTreeModel();
            map.put(lValueOf, semanticTreeModel);
        }
        return (SemanticTreeModel) semanticTreeModel;
    }

    /* JADX INFO: renamed from: setArtboardProperty-MFCOo3w, reason: not valid java name */
    public final void m469setArtboardPropertyMFCOo3w(long j, String str, ArtboardHandle artboardHandle) {
        str.getClass();
        this.bridge.cppSetArtboardProperty(requireNativePointer(), j, str, artboardHandle != null ? artboardHandle.m376unboximpl() : 0L);
    }

    /* JADX INFO: renamed from: setArtboardVolume-b88yb0A, reason: not valid java name */
    public final void m470setArtboardVolumeb88yb0A(long j, float f) {
        this.bridge.cppSetArtboardVolume(requireNativePointer(), this.nextRequestID.getAndIncrement(), j, f);
    }

    /* JADX INFO: renamed from: setBooleanProperty-iFQtAB8, reason: not valid java name */
    public final void m471setBooleanPropertyiFQtAB8(long j, String str, boolean z) {
        str.getClass();
        this.bridge.cppSetBooleanProperty(requireNativePointer(), j, str, z);
    }

    /* JADX INFO: renamed from: setColorProperty-iFQtAB8, reason: not valid java name */
    public final void m472setColorPropertyiFQtAB8(long j, String str, int i) {
        str.getClass();
        this.bridge.cppSetColorProperty(requireNativePointer(), j, str, i);
    }

    /* JADX INFO: renamed from: setEnumProperty-iFQtAB8, reason: not valid java name */
    public final void m473setEnumPropertyiFQtAB8(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.bridge.cppSetEnumProperty(requireNativePointer(), j, str, str2);
    }

    /* JADX INFO: renamed from: setFontProperty-po2uwC0, reason: not valid java name */
    public final void m474setFontPropertypo2uwC0(long j, String str, FontHandle fontHandle) {
        str.getClass();
        this.bridge.cppSetFontProperty(requireNativePointer(), j, str, fontHandle != null ? fontHandle.m550unboximpl() : 0L);
    }

    /* JADX INFO: renamed from: setGlobalViewModelInstance-XIoLTdw, reason: not valid java name */
    public final void m475setGlobalViewModelInstanceXIoLTdw(long j, String str, long j2) {
        str.getClass();
        this.bridge.cppSetGlobalViewModelInstance(requireNativePointer(), this.nextRequestID.getAndIncrement(), j, str, j2);
    }

    /* JADX INFO: renamed from: setImageProperty-uYCTyf4, reason: not valid java name */
    public final void m476setImagePropertyuYCTyf4(long j, String str, ImageHandle imageHandle) {
        str.getClass();
        this.bridge.cppSetImageProperty(requireNativePointer(), j, str, imageHandle != null ? imageHandle.m557unboximpl() : 0L);
    }

    /* JADX INFO: renamed from: setMainViewModelInstance-ei-yHz8, reason: not valid java name */
    public final void m477setMainViewModelInstanceeiyHz8(long j, long j2) {
        this.bridge.cppSetMainViewModelInstance(requireNativePointer(), this.nextRequestID.getAndIncrement(), j, j2);
    }

    /* JADX INFO: renamed from: setNumberProperty-iFQtAB8, reason: not valid java name */
    public final void m478setNumberPropertyiFQtAB8(long j, String str, float f) {
        str.getClass();
        this.bridge.cppSetNumberProperty(requireNativePointer(), j, str, f);
    }

    /* JADX INFO: renamed from: setStringProperty-iFQtAB8, reason: not valid java name */
    public final void m479setStringPropertyiFQtAB8(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.bridge.cppSetStringProperty(requireNativePointer(), j, str, str2);
    }

    public final void setTracingEnabled(boolean z) {
        this.bridge.cppSetTracingEnabled(requireNativePointer(), z);
    }

    /* JADX INFO: renamed from: setViewModelInstanceProperty-Y8k3COA, reason: not valid java name */
    public final void m480setViewModelInstancePropertyY8k3COA(long j, String str, long j2) {
        str.getClass();
        this.bridge.cppSetViewModelInstanceProperty(requireNativePointer(), j, str, j2);
    }

    /* JADX INFO: renamed from: stateMachineSettled-AkTCgDQ$third_party_java_android_libs_rive_rive_android, reason: not valid java name */
    public final axat m481x7094ea47(long j) {
        return this.stateMachineSettlingStore.m574settledAkTCgDQ(j);
    }

    /* JADX INFO: renamed from: subscribeToProperty-iFQtAB8, reason: not valid java name */
    public final void m482subscribeToPropertyiFQtAB8(long j, String str, ViewModel.PropertyDataType propertyDataType) {
        str.getClass();
        propertyDataType.getClass();
        this.bridge.cppSubscribeToProperty(requireNativePointer(), j, str, propertyDataType.getValue());
    }

    /* JADX INFO: renamed from: swapListItems-C5vwGj0, reason: not valid java name */
    public final void m483swapListItemsC5vwGj0(long j, String str, int i, int i2) {
        str.getClass();
        this.bridge.cppSwapListItems(requireNativePointer(), j, str, i, i2);
    }

    public final void unregisterAudio(String str) {
        str.getClass();
        this.bridge.cppUnregisterAudio(requireNativePointer(), str);
    }

    public final void unregisterFont(String str) {
        str.getClass();
        this.bridge.cppUnregisterFont(requireNativePointer(), str);
    }

    public final void unregisterImage(String str) {
        str.getClass();
        this.bridge.cppUnregisterImage(requireNativePointer(), str);
    }

    /* JADX INFO: renamed from: unsettleStateMachine-AkTCgDQ$third_party_java_android_libs_rive_rive_android, reason: not valid java name */
    public final void m484xdb2ce5de(long j) {
        this.stateMachineSettlingStore.m576unsettleAkTCgDQ(j);
    }

    /* JADX INFO: renamed from: unsubscribeFromProperty-iFQtAB8, reason: not valid java name */
    public final void m485unsubscribeFromPropertyiFQtAB8(final long j, final String str, final ViewModel.PropertyDataType propertyDataType) {
        str.getClass();
        propertyDataType.getClass();
        withCleanupReference$third_party_java_android_libs_rive_rive_android(new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommandQueue.unsubscribeFromProperty_iFQtAB8$lambda$0(this.f$0, j, str, propertyDataType);
            }
        });
    }

    public final void withCleanupReference$third_party_java_android_libs_rive_rive_android(Function0 function0) {
        function0.getClass();
        if (this.cppPointer.tryAcquire$third_party_java_android_libs_rive_rive_android("Resource cleanup")) {
            try {
                function0.invoke();
            } finally {
                release("Resource cleanup", "Cleanup submitted");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [app.rive.core.CommandQueue$withLifecycle$observer$1, bof] */
    public final AutoCloseable withLifecycle(final bog bogVar, final String str) {
        bogVar.getClass();
        str.getClass();
        checkOpen$third_party_java_android_libs_rive_rive_android();
        final awrm awrmVar = new awrm();
        final awri awriVar = new awri();
        final ?? r3 = new bnu() { // from class: app.rive.core.CommandQueue$withLifecycle$observer$1
            @Override // defpackage.bnu
            public /* synthetic */ void onCreate(bog bogVar2) {
                bogVar2.getClass();
            }

            @Override // defpackage.bnu
            public void onDestroy(bog bogVar2) {
                CloseOnce closeOnce;
                bogVar2.getClass();
                Object obj = awrmVar.a;
                if (obj == null) {
                    awrc.b("onClose");
                    closeOnce = null;
                } else {
                    closeOnce = (CloseOnce) obj;
                }
                closeOnce.close();
            }

            @Override // defpackage.bnu
            public void onPause(bog bogVar2) {
                bogVar2.getClass();
                if (awriVar.a) {
                    AudioEngine.INSTANCE.release();
                    awriVar.a = false;
                }
            }

            @Override // defpackage.bnu
            public void onResume(bog bogVar2) {
                bogVar2.getClass();
                if (awriVar.a) {
                    return;
                }
                AudioEngine.INSTANCE.acquire();
                awriVar.a = true;
            }

            @Override // defpackage.bnu
            public /* synthetic */ void onStart(bog bogVar2) {
                bogVar2.getClass();
            }

            @Override // defpackage.bnu
            public /* synthetic */ void onStop(bog bogVar2) {
                bogVar2.getClass();
            }
        };
        awrmVar.a = new CloseOnce("CommandQueue (withLifecycle)", new Function0() { // from class: app.rive.core.CommandQueue$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommandQueue.withLifecycle$lambda$0(bogVar, r3, awriVar, this, str);
            }
        });
        bogVar.getLifecycle().b(r3);
        if (bogVar.getLifecycle().a().a(bob.e)) {
            AudioEngine.INSTANCE.acquire();
            awriVar.a = true;
        }
        Object obj = awrmVar.a;
        if (obj != null) {
            return (CloseOnce) obj;
        }
        awrc.b("onClose");
        return null;
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {

        /* JADX INFO: compiled from: PG */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RenderBackend.values().length];
                try {
                    iArr[RenderBackend.Vulkan.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RenderBackend.OpenGL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public static /* synthetic */ CommandQueue createDeferred$third_party_java_android_libs_rive_rive_android$default(Companion companion, RenderBackend renderBackend, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                renderBackend = RenderBackend.OpenGL;
            }
            return companion.createDeferred$third_party_java_android_libs_rive_rive_android(renderBackend, ((i & 2) == 0) & z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long createNativeCommandQueue(RenderContext renderContext, CommandQueueBridge commandQueueBridge) throws RiveInitializationException {
            try {
                return commandQueueBridge.cppConstructor(renderContext.getNativeObjectPointer());
            } catch (RiveInitializationException e) {
                try {
                    renderContext.close();
                } catch (RiveShutdownException e2) {
                    avkz.d(e, e2);
                }
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NativeCommandQueueResources createNativeCommandQueueResources(RenderBackend renderBackend, CommandQueueBridge commandQueueBridge, int i, awqg awqgVar) throws Throwable {
            CommandQueueBridge commandQueueBridge2;
            Object objI;
            Object objI2;
            RenderBackend renderBackendEffectiveRenderBackend = RenderBackendKt.effectiveRenderBackend(renderBackend, i);
            RenderBackend renderBackend2 = RenderBackend.OpenGL;
            if (renderBackendEffectiveRenderBackend == renderBackend2) {
                return new NativeCommandQueueResources((RenderContext) awqgVar.invoke(renderBackend2), commandQueueBridge, 0L, 4, null);
            }
            try {
                try {
                    objI = new NativeCommandQueueResources((RenderContext) awqgVar.invoke(RenderBackend.Vulkan), commandQueueBridge, 0L, 4, null);
                    commandQueueBridge2 = commandQueueBridge;
                } catch (Throwable th) {
                    th = th;
                    commandQueueBridge2 = commandQueueBridge;
                    objI = atqp.i(th);
                }
            } catch (Throwable th2) {
                th = th2;
                commandQueueBridge2 = commandQueueBridge;
            }
            final Throwable thA = awmn.a(objI);
            if (thA == null) {
                return (NativeCommandQueueResources) objI;
            }
            RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, null, new Function0() { // from class: app.rive.core.CommandQueue$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return "Failed to initialize Vulkan render backend, falling back to OpenGL: ".concat(String.valueOf(thA.getMessage()));
                }
            });
            try {
                objI2 = new NativeCommandQueueResources((RenderContext) awqgVar.invoke(RenderBackend.OpenGL), commandQueueBridge2, 0L, 4, null);
            } catch (Throwable th3) {
                objI2 = atqp.i(th3);
            }
            Throwable thA2 = awmn.a(objI2);
            if (thA2 == null) {
                return (NativeCommandQueueResources) objI2;
            }
            avkz.d(thA2, thA);
            throw thA2;
        }

        static /* synthetic */ NativeCommandQueueResources createNativeCommandQueueResources$default(Companion companion, RenderBackend renderBackend, CommandQueueBridge commandQueueBridge, int i, awqg awqgVar, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = Build.VERSION.SDK_INT;
            }
            if ((i2 & 8) != 0) {
                awqgVar = new CommandQueue$Companion$createNativeCommandQueueResources$1(companion);
            }
            return companion.createNativeCommandQueueResources(renderBackend, commandQueueBridge, i, awqgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final RenderContext createRenderContext(RenderBackend renderBackend) {
            RenderBackend renderBackend2 = RenderBackend.Vulkan;
            int iOrdinal = renderBackend.ordinal();
            if (iOrdinal == 0) {
                return new RenderContextVulkan();
            }
            if (iOrdinal != 1) {
                throw new awmj();
            }
            return new RenderContextGL(null, null, null, 7, null);
        }

        public final CommandQueue createDeferred$third_party_java_android_libs_rive_rive_android(RenderBackend renderBackend, boolean z) {
            renderBackend.getClass();
            return new CommandQueue(createNativeCommandQueueResources$default(this, renderBackend, new CommandQueueJNIBridge(), 0, null, 12, null), z, true, (awqx) null);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class PropertyUpdate {
        public static final int $stable = 0;
        private final long handle;
        private final String propertyPath;
        private final Object value;

        private PropertyUpdate(long j, String str, Object obj) {
            str.getClass();
            this.handle = j;
            this.propertyPath = str;
            this.value = obj;
        }

        /* JADX INFO: renamed from: copy-iFQtAB8$default, reason: not valid java name */
        public static /* synthetic */ PropertyUpdate m486copyiFQtAB8$default(PropertyUpdate propertyUpdate, long j, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                j = propertyUpdate.handle;
            }
            if ((i & 2) != 0) {
                str = propertyUpdate.propertyPath;
            }
            if ((i & 4) != 0) {
                obj = propertyUpdate.value;
            }
            return propertyUpdate.m488copyiFQtAB8(j, str, obj);
        }

        /* JADX INFO: renamed from: component1-VPLto4w, reason: not valid java name */
        public final long m487component1VPLto4w() {
            return this.handle;
        }

        public final String component2() {
            return this.propertyPath;
        }

        public final Object component3() {
            return this.value;
        }

        /* JADX INFO: renamed from: copy-iFQtAB8, reason: not valid java name */
        public final PropertyUpdate m488copyiFQtAB8(long j, String str, Object obj) {
            str.getClass();
            return new PropertyUpdate(j, str, obj, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PropertyUpdate) {
                PropertyUpdate propertyUpdate = (PropertyUpdate) obj;
                if (ViewModelInstanceHandle.m581equalsimpl0(this.handle, propertyUpdate.handle) && awrc.c(this.propertyPath, propertyUpdate.propertyPath) && awrc.c(this.value, propertyUpdate.value)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: getHandle-VPLto4w, reason: not valid java name */
        public final long m489getHandleVPLto4w() {
            return this.handle;
        }

        public final String getPropertyPath() {
            return this.propertyPath;
        }

        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            int iM582hashCodeimpl = (ViewModelInstanceHandle.m582hashCodeimpl(this.handle) * 31) + this.propertyPath.hashCode();
            Object obj = this.value;
            return (iM582hashCodeimpl * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "PropertyUpdate(handle=" + ViewModelInstanceHandle.m583toStringimpl(this.handle) + ", propertyPath=" + this.propertyPath + ", value=" + this.value + ')';
        }

        public /* synthetic */ PropertyUpdate(long j, String str, Object obj, awqx awqxVar) {
            this(j, str, obj);
        }
    }

    /* JADX INFO: compiled from: PG */
    final class NativeCommandQueueResources {
        private final CommandQueueBridge bridge;
        private final long nativePointer;
        private final RenderContext renderContext;

        public NativeCommandQueueResources(RenderContext renderContext, CommandQueueBridge commandQueueBridge, long j) {
            renderContext.getClass();
            commandQueueBridge.getClass();
            this.renderContext = renderContext;
            this.bridge = commandQueueBridge;
            this.nativePointer = j;
        }

        public static /* synthetic */ NativeCommandQueueResources copy$default(NativeCommandQueueResources nativeCommandQueueResources, RenderContext renderContext, CommandQueueBridge commandQueueBridge, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                renderContext = nativeCommandQueueResources.renderContext;
            }
            if ((i & 2) != 0) {
                commandQueueBridge = nativeCommandQueueResources.bridge;
            }
            if ((i & 4) != 0) {
                j = nativeCommandQueueResources.nativePointer;
            }
            return nativeCommandQueueResources.copy(renderContext, commandQueueBridge, j);
        }

        public final RenderContext component1() {
            return this.renderContext;
        }

        public final CommandQueueBridge component2() {
            return this.bridge;
        }

        public final long component3() {
            return this.nativePointer;
        }

        public final NativeCommandQueueResources copy(RenderContext renderContext, CommandQueueBridge commandQueueBridge, long j) {
            renderContext.getClass();
            commandQueueBridge.getClass();
            return new NativeCommandQueueResources(renderContext, commandQueueBridge, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof NativeCommandQueueResources) {
                NativeCommandQueueResources nativeCommandQueueResources = (NativeCommandQueueResources) obj;
                if (awrc.c(this.renderContext, nativeCommandQueueResources.renderContext) && awrc.c(this.bridge, nativeCommandQueueResources.bridge) && this.nativePointer == nativeCommandQueueResources.nativePointer) {
                    return true;
                }
            }
            return false;
        }

        public final CommandQueueBridge getBridge() {
            return this.bridge;
        }

        public final long getNativePointer() {
            return this.nativePointer;
        }

        public final RenderContext getRenderContext() {
            return this.renderContext;
        }

        public int hashCode() {
            return (((this.renderContext.hashCode() * 31) + this.bridge.hashCode()) * 31) + CommandQueue$NativeCommandQueueResources$$ExternalSyntheticBackport0.m(this.nativePointer);
        }

        public String toString() {
            return "NativeCommandQueueResources(renderContext=" + this.renderContext + ", bridge=" + this.bridge + ", nativePointer=" + this.nativePointer + ')';
        }

        public /* synthetic */ NativeCommandQueueResources(RenderContext renderContext, CommandQueueBridge commandQueueBridge, long j, int i, awqx awqxVar) {
            this(renderContext, commandQueueBridge, (i & 4) != 0 ? CommandQueue.Companion.createNativeCommandQueue(renderContext, commandQueueBridge) : j);
        }
    }

    public static /* synthetic */ void getSettledFlow$annotations() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommandQueue(RenderBackend renderBackend, boolean z) {
        this(Companion.createNativeCommandQueueResources$default(Companion, renderBackend, new CommandQueueJNIBridge(), 0, null, 12, null), z, false);
        renderBackend.getClass();
    }

    public /* synthetic */ CommandQueue(NativeCommandQueueResources nativeCommandQueueResources, boolean z, boolean z2, awqx awqxVar) {
        this(nativeCommandQueueResources, z, z2);
    }

    public /* synthetic */ CommandQueue(RenderBackend renderBackend, boolean z, int i, awqx awqxVar) {
        this((i & 1) != 0 ? RenderBackend.OpenGL : renderBackend, ((i & 2) == 0) & z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommandQueue(RenderBackend renderBackend, boolean z, CommandQueueBridge commandQueueBridge, int i, awqg awqgVar) {
        this(Companion.createNativeCommandQueueResources(renderBackend, commandQueueBridge, i, awqgVar), z, false);
        renderBackend.getClass();
        commandQueueBridge.getClass();
        awqgVar.getClass();
    }

    public /* synthetic */ CommandQueue(RenderBackend renderBackend, boolean z, CommandQueueBridge commandQueueBridge, int i, awqg awqgVar, int i2, awqx awqxVar) {
        this(renderBackend, z & ((i2 & 2) == 0), commandQueueBridge, (i2 & 8) != 0 ? Build.VERSION.SDK_INT : i, awqgVar);
    }

    private CommandQueue(NativeCommandQueueResources nativeCommandQueueResources, boolean z, boolean z2) {
        this(nativeCommandQueueResources.getRenderContext(), nativeCommandQueueResources.getBridge(), z, z2, nativeCommandQueueResources.getNativePointer(), null, 32, null);
    }

    /* synthetic */ CommandQueue(NativeCommandQueueResources nativeCommandQueueResources, boolean z, boolean z2, int i, awqx awqxVar) {
        this(nativeCommandQueueResources, z, ((i & 4) == 0) & z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CommandQueue(RenderContext renderContext, CommandQueueBridge commandQueueBridge, boolean z, boolean z2, long j, StateMachineSettlingStore stateMachineSettlingStore, int i, awqx awqxVar) {
        commandQueueBridge = (i & 2) != 0 ? new CommandQueueJNIBridge() : commandQueueBridge;
        this(renderContext, commandQueueBridge, z & ((i & 4) == 0), z2 & ((i & 8) == 0), (i & 16) != 0 ? Companion.createNativeCommandQueue(renderContext, commandQueueBridge) : j, (i & 32) != 0 ? null : stateMachineSettlingStore);
    }
}
