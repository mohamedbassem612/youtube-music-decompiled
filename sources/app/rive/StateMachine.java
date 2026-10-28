package app.rive;

import app.rive.core.ArtboardHandle;
import app.rive.core.CheckableAutoCloseable;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.FileHandle;
import app.rive.core.StateMachineHandle;
import app.rive.core.ViewModelInstanceHandle;
import app.rive.semantics.SemanticActionType;
import app.rive.semantics.SemanticTreeModel;
import defpackage.atqp;
import defpackage.atqq;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.axat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class StateMachine implements CheckableAutoCloseable {
    private final long artboardHandle;
    private final Bindings bindings;
    private final CloseOnce closer;
    private final axat focusState;
    private final axat hasFocusNodes;
    private final String name;
    private final CommandQueue riveWorker;
    private final axat settled;
    private final long stateMachineHandle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private StateMachine(long j, CommandQueue commandQueue, long j2, String str) {
        commandQueue.getClass();
        this.stateMachineHandle = j;
        this.riveWorker = commandQueue;
        this.artboardHandle = j2;
        this.name = str;
        this.bindings = new Bindings(commandQueue, j, null);
        this.closer = new CloseOnce(StateMachineHandle.m569toStringimpl(j), new Function0() { // from class: app.rive.StateMachine$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateMachine.closer$lambda$0(this.f$0);
            }
        });
        this.settled = commandQueue.m481x7094ea47(j);
        this.focusState = commandQueue.m429focusStateAkTCgDQ(j);
        this.hasFocusNodes = commandQueue.m447hasFocusNodesAkTCgDQ(j);
    }

    static final awmy closer$lambda$0(final StateMachine stateMachine) {
        String str = stateMachine.name;
        final String strConcat = str != null ? "with name ".concat(str) : "(default)";
        RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new Function0() { // from class: app.rive.StateMachine$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateMachine.closer$lambda$0$1(this.f$0, strConcat);
            }
        });
        stateMachine.riveWorker.m421deleteStateMachineAkTCgDQ(stateMachine.stateMachineHandle);
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closer$lambda$0$1(StateMachine stateMachine, String str) {
        return "Deleting " + StateMachineHandle.m569toStringimpl(stateMachine.stateMachineHandle) + ' ' + str + " (" + ArtboardHandle.m375toStringimpl(stateMachine.artboardHandle) + ')';
    }

    /* JADX INFO: renamed from: advance-LRDsOJo, reason: not valid java name */
    public final void m317advanceLRDsOJo(long j) {
        this.closer.checkOpen();
        this.riveWorker.m394advanceStateMachineDDXDRQI(this.stateMachineHandle, j);
    }

    public final void bindViewModels$third_party_java_android_libs_rive_rive_android(ViewModelInstance viewModelInstance, Map map) {
        map.getClass();
        checkOpen$third_party_java_android_libs_rive_rive_android();
        if (this.bindings.apply(viewModelInstance, map)) {
            unsettle$third_party_java_android_libs_rive_rive_android();
        }
    }

    public final void checkOpen$third_party_java_android_libs_rive_rive_android() {
        this.closer.checkOpen();
    }

    public final void clearFocus() {
        this.closer.checkOpen();
        this.riveWorker.m399clearFocusAkTCgDQ(this.stateMachineHandle);
        unsettle$third_party_java_android_libs_rive_rive_android();
    }

    public final void clearSemanticFocus() {
        this.closer.checkOpen();
        this.riveWorker.m402clearSemanticFocusAkTCgDQ(this.stateMachineHandle);
        unsettle$third_party_java_android_libs_rive_rive_android();
    }

    public final void clearSemanticFocusForLifecycleCleanup$third_party_java_android_libs_rive_rive_android() {
        try {
            clearSemanticFocus();
        } catch (RiveResourceClosedException unused) {
        }
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final void drainSemanticsDiff(Fit fit, float f, float f2) {
        fit.getClass();
        this.closer.checkOpen();
        this.riveWorker.m423drainSemanticsDiffTORGcfM(this.stateMachineHandle, fit, f, f2);
    }

    public final void enableSemantics() {
        this.closer.checkOpen();
        this.riveWorker.m426enableSemanticsAkTCgDQ(this.stateMachineHandle);
        unsettle$third_party_java_android_libs_rive_rive_android();
    }

    public final void fireSemanticAction(int i, SemanticActionType semanticActionType) {
        semanticActionType.getClass();
        this.closer.checkOpen();
        this.riveWorker.m427fireSemanticActionDFYtxA(this.stateMachineHandle, i, semanticActionType);
        unsettle$third_party_java_android_libs_rive_rive_android();
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final axat getFocusState() {
        return this.focusState;
    }

    public final axat getHasFocusNodes() {
        return this.hasFocusNodes;
    }

    public final String getName() {
        return this.name;
    }

    public final SemanticTreeModel getSemanticTree() {
        this.closer.checkOpen();
        return this.riveWorker.m468semanticTreeAkTCgDQ(this.stateMachineHandle);
    }

    public final axat getSettled$third_party_java_android_libs_rive_rive_android() {
        return this.settled;
    }

    /* JADX INFO: renamed from: getStateMachineHandle-a86gHUU, reason: not valid java name */
    public final long m318getStateMachineHandlea86gHUU() {
        return this.stateMachineHandle;
    }

    public final Object moveFocus(RiveFocusDirection riveFocusDirection, awoq awoqVar) {
        this.closer.checkOpen();
        unsettle$third_party_java_android_libs_rive_rive_android();
        return this.riveWorker.m451moveFocusDFYtxA(this.stateMachineHandle, riveFocusDirection, awoqVar);
    }

    public final void pollFocus() {
        this.closer.checkOpen();
        this.riveWorker.m456pollFocusAkTCgDQ(this.stateMachineHandle);
    }

    public final void requestFocusState() {
        this.closer.checkOpen();
        this.riveWorker.m463requestFocusStateAkTCgDQ(this.stateMachineHandle);
    }

    public final void requestHasFocusNodes() {
        this.closer.checkOpen();
        this.riveWorker.m464requestHasFocusNodesAkTCgDQ(this.stateMachineHandle);
    }

    public final void requestSemanticFocus(int i) {
        this.closer.checkOpen();
        this.riveWorker.m465requestSemanticFocusOFH3VyA(this.stateMachineHandle, i);
        unsettle$third_party_java_android_libs_rive_rive_android();
    }

    public final void requireFromArtboard$third_party_java_android_libs_rive_rive_android(Artboard artboard) {
        artboard.getClass();
        if (this.riveWorker == artboard.getRiveWorker$third_party_java_android_libs_rive_rive_android() && ArtboardHandle.m373equalsimpl0(this.artboardHandle, artboard.m269getArtboardHandlenSTdbJo())) {
            return;
        }
        throw new RiveIncompatibleResourceException("StateMachine " + StateMachineHandle.m569toStringimpl(this.stateMachineHandle) + " was not created from Artboard " + ArtboardHandle.m375toStringimpl(artboard.m269getArtboardHandlenSTdbJo()));
    }

    public final void requireOwnedBy$third_party_java_android_libs_rive_rive_android(CommandQueue commandQueue) {
        commandQueue.getClass();
        if (this.riveWorker == commandQueue) {
            return;
        }
        throw new RiveIncompatibleResourceException("StateMachine " + StateMachineHandle.m569toStringimpl(this.stateMachineHandle) + " is not owned by the required RiveWorker");
    }

    public final void unsettle$third_party_java_android_libs_rive_rive_android() {
        this.closer.checkOpen();
        this.riveWorker.m484xdb2ce5de(this.stateMachineHandle);
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ Object create$default(Companion companion, Artboard artboard, String str, awoq awoqVar, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.create(artboard, str, awoqVar);
        }

        static final String create$lambda$1(String str, Artboard artboard) {
            return "Creating state machine " + str + " (" + ArtboardHandle.m375toStringimpl(artboard.m269getArtboardHandlenSTdbJo()) + "; " + FileHandle.m533toStringimpl(artboard.m270x3cbce2f1()) + ')';
        }

        static final String create$lambda$3(long j, String str, Artboard artboard) {
            return "Created " + StateMachineHandle.m569toStringimpl(j) + ' ' + str + " (" + ArtboardHandle.m375toStringimpl(artboard.m269getArtboardHandlenSTdbJo()) + "; " + FileHandle.m533toStringimpl(artboard.m270x3cbce2f1()) + ')';
        }

        static final String create$lambda$4(String str, Artboard artboard) {
            return "State machine creation was cancelled " + str + " (" + ArtboardHandle.m375toStringimpl(artboard.m269getArtboardHandlenSTdbJo()) + "; " + FileHandle.m533toStringimpl(artboard.m270x3cbce2f1()) + ')';
        }

        static final String create$lambda$5(String str, Artboard artboard) {
            return "Error creating state machine " + str + " (" + ArtboardHandle.m375toStringimpl(artboard.m269getArtboardHandlenSTdbJo()) + "; " + FileHandle.m533toStringimpl(artboard.m270x3cbce2f1()) + ')';
        }

        public static /* synthetic */ StateMachine fromArtboard$default(Companion companion, Artboard artboard, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.fromArtboard(artboard, str);
        }

        static final String fromArtboard$lambda$2(long j, String str, Artboard artboard) {
            return "Created " + StateMachineHandle.m569toStringimpl(j) + ' ' + str + " (" + ArtboardHandle.m375toStringimpl(artboard.m269getArtboardHandlenSTdbJo()) + "; " + FileHandle.m533toStringimpl(artboard.m270x3cbce2f1()) + ')';
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [app.rive.Artboard, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10, types: [app.rive.Artboard] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14, types: [app.rive.Artboard] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19, types: [app.rive.Artboard] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v9 */
        public final Object create(Artboard artboard, String str, awoq awoqVar) throws Exception {
            StateMachine$Companion$create$1 stateMachine$Companion$create$1;
            final ?? Concat;
            ?? r2;
            ?? r1;
            Object objM410createStateMachineByNameConfirmedOHdLGcE;
            ?? r3;
            ?? r4;
            Object objM408createDefaultStateMachineConfirmedItmKBmM;
            long jM570unboximpl;
            final ?? r5 = artboard;
            String str2 = str;
            if (awoqVar instanceof StateMachine$Companion$create$1) {
                stateMachine$Companion$create$1 = (StateMachine$Companion$create$1) awoqVar;
                int i = stateMachine$Companion$create$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    stateMachine$Companion$create$1.label = i - Integer.MIN_VALUE;
                } else {
                    stateMachine$Companion$create$1 = new StateMachine$Companion$create$1(this, awoqVar);
                }
            } else {
                stateMachine$Companion$create$1 = new StateMachine$Companion$create$1(this, awoqVar);
            }
            Object obj = stateMachine$Companion$create$1.result;
            awox awoxVar = awox.a;
            int i2 = stateMachine$Companion$create$1.label;
            if (i2 != 0) {
                try {
                    if (i2 == 1) {
                        String str3 = (String) stateMachine$Companion$create$1.L$2;
                        str2 = (String) stateMachine$Companion$create$1.L$1;
                        Artboard artboard2 = (Artboard) stateMachine$Companion$create$1.L$0;
                        atqp.j(obj);
                        r2 = str3;
                        r1 = artboard2;
                        objM410createStateMachineByNameConfirmedOHdLGcE = obj;
                        r1 = r5;
                        r2 = Concat;
                        jM570unboximpl = ((StateMachineHandle) objM410createStateMachineByNameConfirmedOHdLGcE).m570unboximpl();
                        r5 = r1;
                        Concat = r2;
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str4 = (String) stateMachine$Companion$create$1.L$2;
                        str2 = (String) stateMachine$Companion$create$1.L$1;
                        Artboard artboard3 = (Artboard) stateMachine$Companion$create$1.L$0;
                        atqp.j(obj);
                        r3 = str4;
                        r4 = artboard3;
                        objM408createDefaultStateMachineConfirmedItmKBmM = obj;
                        r4 = r5;
                        r3 = Concat;
                        jM570unboximpl = ((StateMachineHandle) objM408createDefaultStateMachineConfirmedItmKBmM).m570unboximpl();
                        r5 = r4;
                        Concat = r3;
                    }
                } catch (CancellationException e) {
                    e = e;
                    Concat = r5;
                    r5 = stateMachine$Companion$create$1;
                    RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new Function0() { // from class: app.rive.StateMachine$Companion$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StateMachine.Companion.create$lambda$4(Concat, r5);
                        }
                    });
                    throw e;
                } catch (Exception e2) {
                    e = e2;
                    Concat = r5;
                    r5 = stateMachine$Companion$create$1;
                    RiveLog.INSTANCE.getLogger().e("Rive/StateMachine", e, new Function0() { // from class: app.rive.StateMachine$Companion$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StateMachine.Companion.create$lambda$5(Concat, r5);
                        }
                    });
                    throw e;
                }
            } else {
                atqp.j(obj);
                Concat = str2 != null ? "with name ".concat(str2) : "(default)";
                RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new Function0() { // from class: app.rive.StateMachine$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StateMachine.Companion.create$lambda$1(Concat, r5);
                    }
                });
                try {
                    r5.checkOpen$third_party_java_android_libs_rive_rive_android();
                    if (str2 != null) {
                        CommandQueue riveWorker$third_party_java_android_libs_rive_rive_android = r5.getRiveWorker$third_party_java_android_libs_rive_rive_android();
                        long jM269getArtboardHandlenSTdbJo = r5.m269getArtboardHandlenSTdbJo();
                        stateMachine$Companion$create$1.L$0 = r5;
                        stateMachine$Companion$create$1.L$1 = str2;
                        stateMachine$Companion$create$1.L$2 = Concat;
                        stateMachine$Companion$create$1.label = 1;
                        objM410createStateMachineByNameConfirmedOHdLGcE = riveWorker$third_party_java_android_libs_rive_rive_android.m410createStateMachineByNameConfirmedOHdLGcE(jM269getArtboardHandlenSTdbJo, str2, stateMachine$Companion$create$1);
                        if (objM410createStateMachineByNameConfirmedOHdLGcE == awoxVar) {
                            r1 = r5;
                            r2 = Concat;
                            return awoxVar;
                        }
                        r1 = r5;
                        r2 = Concat;
                        jM570unboximpl = ((StateMachineHandle) objM410createStateMachineByNameConfirmedOHdLGcE).m570unboximpl();
                        r5 = r1;
                        Concat = r2;
                    } else {
                        CommandQueue riveWorker$third_party_java_android_libs_rive_rive_android2 = r5.getRiveWorker$third_party_java_android_libs_rive_rive_android();
                        long jM269getArtboardHandlenSTdbJo2 = r5.m269getArtboardHandlenSTdbJo();
                        stateMachine$Companion$create$1.L$0 = r5;
                        stateMachine$Companion$create$1.L$1 = null;
                        stateMachine$Companion$create$1.L$2 = Concat;
                        stateMachine$Companion$create$1.label = 2;
                        objM408createDefaultStateMachineConfirmedItmKBmM = riveWorker$third_party_java_android_libs_rive_rive_android2.m408createDefaultStateMachineConfirmedItmKBmM(jM269getArtboardHandlenSTdbJo2, stateMachine$Companion$create$1);
                        if (objM408createDefaultStateMachineConfirmedItmKBmM == awoxVar) {
                            r4 = r5;
                            r3 = Concat;
                            return awoxVar;
                        }
                        r4 = r5;
                        r3 = Concat;
                        jM570unboximpl = ((StateMachineHandle) objM408createDefaultStateMachineConfirmedItmKBmM).m570unboximpl();
                        r5 = r4;
                        Concat = r3;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new Function0() { // from class: app.rive.StateMachine$Companion$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StateMachine.Companion.create$lambda$4(Concat, r5);
                        }
                    });
                    throw e;
                } catch (Exception e4) {
                    e = e4;
                    RiveLog.INSTANCE.getLogger().e("Rive/StateMachine", e, new Function0() { // from class: app.rive.StateMachine$Companion$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StateMachine.Companion.create$lambda$5(Concat, r5);
                        }
                    });
                    throw e;
                }
            }
            String str5 = str2;
            final long j = jM570unboximpl;
            RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new Function0() { // from class: app.rive.StateMachine$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StateMachine.Companion.create$lambda$3(j, Concat, r5);
                }
            });
            return new StateMachine(j, r5.getRiveWorker$third_party_java_android_libs_rive_rive_android(), r5.m269getArtboardHandlenSTdbJo(), str5, null);
        }

        public final StateMachine fromArtboard(final Artboard artboard, String str) {
            long jM407createDefaultStateMachinexY8vNfM;
            final String strConcat;
            artboard.getClass();
            artboard.checkOpen$third_party_java_android_libs_rive_rive_android();
            if (str != null) {
                jM407createDefaultStateMachinexY8vNfM = artboard.getRiveWorker$third_party_java_android_libs_rive_rive_android().m409createStateMachineByNameItmKBmM(artboard.m269getArtboardHandlenSTdbJo(), str);
                strConcat = "with name ".concat(str);
            } else {
                jM407createDefaultStateMachinexY8vNfM = artboard.getRiveWorker$third_party_java_android_libs_rive_rive_android().m407createDefaultStateMachinexY8vNfM(artboard.m269getArtboardHandlenSTdbJo());
                strConcat = "(default)";
            }
            final long j = jM407createDefaultStateMachinexY8vNfM;
            RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new Function0() { // from class: app.rive.StateMachine$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StateMachine.Companion.fromArtboard$lambda$2(j, strConcat, artboard);
                }
            });
            return new StateMachine(j, artboard.getRiveWorker$third_party_java_android_libs_rive_rive_android(), artboard.m269getArtboardHandlenSTdbJo(), str, null);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: PG */
    final class Bindings {
        private BindingSnapshot applied;
        private final CommandQueue riveWorker;
        private final long stateMachineHandle;

        private Bindings(CommandQueue commandQueue, long j) {
            commandQueue.getClass();
            this.riveWorker = commandQueue;
            this.stateMachineHandle = j;
        }

        static final String apply$lambda$2(Bindings bindings, BindingSnapshot bindingSnapshot) {
            String strM569toStringimpl = StateMachineHandle.m569toStringimpl(bindings.stateMachineHandle);
            Object objM322getMainspIyslc = bindingSnapshot.m322getMainspIyslc();
            if (objM322getMainspIyslc == null) {
                objM322getMainspIyslc = "none";
            }
            return "Binding view models to " + strM569toStringimpl + ": main override=" + objM322getMainspIyslc + ", global overrides=" + bindingSnapshot.getGlobals().keySet();
        }

        public final synchronized boolean apply(ViewModelInstance viewModelInstance, Map map) {
            Map globals;
            Map globals2;
            Set setKeySet;
            map.getClass();
            Map mapD = atqq.D(map);
            if (viewModelInstance != null) {
                viewModelInstance.checkOpen$third_party_java_android_libs_rive_rive_android();
                viewModelInstance.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
            }
            for (ViewModelInstance viewModelInstance2 : mapD.values()) {
                viewModelInstance2.checkOpen$third_party_java_android_libs_rive_rive_android();
                viewModelInstance2.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
            }
            awqx awqxVar = null;
            ViewModelInstanceHandle viewModelInstanceHandleM578boximpl = viewModelInstance != null ? ViewModelInstanceHandle.m578boximpl(viewModelInstance.m325getInstanceHandleVPLto4w()) : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap(atqq.u(mapD.size()));
            for (Map.Entry entry : mapD.entrySet()) {
                linkedHashMap.put(entry.getKey(), ViewModelInstanceHandle.m578boximpl(((ViewModelInstance) entry.getValue()).m325getInstanceHandleVPLto4w()));
            }
            final BindingSnapshot bindingSnapshot = new BindingSnapshot(viewModelInstanceHandleM578boximpl, linkedHashMap, awqxVar);
            BindingSnapshot bindingSnapshot2 = this.applied;
            if (awrc.c(bindingSnapshot2, bindingSnapshot)) {
                return false;
            }
            RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new Function0() { // from class: app.rive.StateMachine$Bindings$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StateMachine.Bindings.apply$lambda$2(this.f$0, bindingSnapshot);
                }
            });
            if (!awrc.c(bindingSnapshot2 != null ? bindingSnapshot2.m322getMainspIyslc() : null, bindingSnapshot.m322getMainspIyslc())) {
                if (bindingSnapshot.m322getMainspIyslc() != null) {
                    this.riveWorker.m477setMainViewModelInstanceeiyHz8(this.stateMachineHandle, bindingSnapshot.m322getMainspIyslc().m584unboximpl());
                } else if (bindingSnapshot2 != null) {
                    this.riveWorker.m401clearMainViewModelInstanceAkTCgDQ(this.stateMachineHandle);
                }
            }
            if (bindingSnapshot2 != null && (globals2 = bindingSnapshot2.getGlobals()) != null && (setKeySet = globals2.keySet()) != null) {
                Iterator it = atqq.q(setKeySet, bindingSnapshot.getGlobals().keySet()).iterator();
                while (it.hasNext()) {
                    this.riveWorker.m400clearGlobalViewModelInstanceOFH3VyA(this.stateMachineHandle, (String) it.next());
                }
            }
            for (Map.Entry entry2 : bindingSnapshot.getGlobals().entrySet()) {
                String str = (String) entry2.getKey();
                long jM584unboximpl = ((ViewModelInstanceHandle) entry2.getValue()).m584unboximpl();
                ViewModelInstanceHandle viewModelInstanceHandle = (bindingSnapshot2 == null || (globals = bindingSnapshot2.getGlobals()) == null) ? null : (ViewModelInstanceHandle) globals.get(str);
                if (viewModelInstanceHandle == null || !ViewModelInstanceHandle.m581equalsimpl0(viewModelInstanceHandle.m584unboximpl(), jM584unboximpl)) {
                    this.riveWorker.m475setGlobalViewModelInstanceXIoLTdw(this.stateMachineHandle, str, jM584unboximpl);
                }
            }
            this.riveWorker.m396bindAkTCgDQ(this.stateMachineHandle);
            this.applied = bindingSnapshot;
            return true;
        }

        /* JADX INFO: compiled from: PG */
        final class BindingSnapshot {
            private final Map globals;
            private final ViewModelInstanceHandle main;

            private BindingSnapshot(ViewModelInstanceHandle viewModelInstanceHandle, Map map) {
                map.getClass();
                this.main = viewModelInstanceHandle;
                this.globals = map;
            }

            /* JADX INFO: renamed from: copy-3YpNlWA$default, reason: not valid java name */
            public static /* synthetic */ BindingSnapshot m319copy3YpNlWA$default(BindingSnapshot bindingSnapshot, ViewModelInstanceHandle viewModelInstanceHandle, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    viewModelInstanceHandle = bindingSnapshot.main;
                }
                if ((i & 2) != 0) {
                    map = bindingSnapshot.globals;
                }
                return bindingSnapshot.m321copy3YpNlWA(viewModelInstanceHandle, map);
            }

            /* JADX INFO: renamed from: component1-spIyslc, reason: not valid java name */
            public final ViewModelInstanceHandle m320component1spIyslc() {
                return this.main;
            }

            public final Map component2() {
                return this.globals;
            }

            /* JADX INFO: renamed from: copy-3YpNlWA, reason: not valid java name */
            public final BindingSnapshot m321copy3YpNlWA(ViewModelInstanceHandle viewModelInstanceHandle, Map map) {
                map.getClass();
                return new BindingSnapshot(viewModelInstanceHandle, map, null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof BindingSnapshot) {
                    BindingSnapshot bindingSnapshot = (BindingSnapshot) obj;
                    if (awrc.c(this.main, bindingSnapshot.main) && awrc.c(this.globals, bindingSnapshot.globals)) {
                        return true;
                    }
                }
                return false;
            }

            public final Map getGlobals() {
                return this.globals;
            }

            /* JADX INFO: renamed from: getMain-spIyslc, reason: not valid java name */
            public final ViewModelInstanceHandle m322getMainspIyslc() {
                return this.main;
            }

            public int hashCode() {
                ViewModelInstanceHandle viewModelInstanceHandle = this.main;
                return ((viewModelInstanceHandle == null ? 0 : ViewModelInstanceHandle.m582hashCodeimpl(viewModelInstanceHandle.m584unboximpl())) * 31) + this.globals.hashCode();
            }

            public String toString() {
                return "BindingSnapshot(main=" + this.main + ", globals=" + this.globals + ')';
            }

            public /* synthetic */ BindingSnapshot(ViewModelInstanceHandle viewModelInstanceHandle, Map map, awqx awqxVar) {
                this(viewModelInstanceHandle, map);
            }
        }

        public /* synthetic */ Bindings(CommandQueue commandQueue, long j, awqx awqxVar) {
            this(commandQueue, j);
        }
    }

    public static /* synthetic */ void getFocusState$annotations() {
    }

    public static /* synthetic */ void getHasFocusNodes$annotations() {
    }

    public static /* synthetic */ void getSemanticTree$annotations() {
    }

    public /* synthetic */ StateMachine(long j, CommandQueue commandQueue, long j2, String str, awqx awqxVar) {
        this(j, commandQueue, j2, str);
    }
}
