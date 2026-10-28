package app.rive;

import defpackage.atqp;
import defpackage.avkz;
import defpackage.awmj;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awpl;
import defpackage.awqg;
import defpackage.awqk;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.awro;
import defpackage.awtl;
import defpackage.awtn;
import defpackage.awut;
import defpackage.awwd;
import internal.org.jni_zero.JniZero;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveFocusSession {
    private static final long TRAVERSAL_TIMEOUT;
    private final Function0 clearFocus;
    private final awqg handOff;
    private FocusPhase phase;
    private final Function0 requestFrame;
    private final awut scope;
    private boolean surfaceFocused;
    private awwd traversal;
    private final awqk traverse;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: PG */
    public enum FocusPhase {
        Ready,
        Focused,
        Released;

        private static final /* synthetic */ awpl $ENTRIES = JniZero.m(values());

        public static awpl getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveFocusSession$startTraversal$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass1 extends awpk implements awqk {
        final /* synthetic */ RiveFocusDirection $direction;
        final /* synthetic */ boolean $entering;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, RiveFocusDirection riveFocusDirection, awoq awoqVar) {
            super(2, awoqVar);
            this.$entering = z;
            this.$direction = riveFocusDirection;
        }

        @Override // defpackage.awpe
        public final awoq create(Object obj, awoq awoqVar) {
            return RiveFocusSession.this.new AnonymousClass1(this.$entering, this.$direction, awoqVar);
        }

        @Override // defpackage.awqk
        public final Object invoke(awut awutVar, awoq awoqVar) {
            return ((AnonymousClass1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
        }

        @Override // defpackage.awpe
        public final Object invokeSuspend(Object obj) throws Throwable {
            RiveFocusState riveFocusState;
            FocusPhase phase;
            awox awoxVar = awox.a;
            int i = this.label;
            try {
                if (i == 0) {
                    atqp.j(obj);
                    long j = RiveFocusSession.TRAVERSAL_TIMEOUT;
                    RiveFocusSession$startTraversal$1$focusState$1 riveFocusSession$startTraversal$1$focusState$1 = new RiveFocusSession$startTraversal$1$focusState$1(RiveFocusSession.this, this.$direction, null);
                    this.label = 1;
                    obj = avkz.s(j, riveFocusSession$startTraversal$1$focusState$1, this);
                    if (obj == awoxVar) {
                        return awoxVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atqp.j(obj);
                }
                riveFocusState = (RiveFocusState) obj;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                riveFocusState = RiveFocusState.Unfocused.INSTANCE;
            }
            RiveFocusSession.this.traversal = null;
            if (riveFocusState != null) {
                boolean z = this.$entering;
                RiveFocusSession riveFocusSession = RiveFocusSession.this;
                if (z) {
                    if (riveFocusState instanceof RiveFocusState.Focused) {
                        phase = FocusPhase.Focused;
                    } else {
                        phase = riveFocusSession.getPhase() == FocusPhase.Focused ? FocusPhase.Ready : RiveFocusSession.this.getPhase();
                    }
                    riveFocusSession.phase = phase;
                    RiveFocusSession.this.requestFrame.invoke();
                } else {
                    riveFocusSession.onTraversalResult(this.$direction, riveFocusState);
                }
            }
            return awmy.a;
        }
    }

    static {
        int i = awtl.b;
        TRAVERSAL_TIMEOUT = awrc.i(1, awtn.SECONDS);
    }

    public RiveFocusSession(awut awutVar, awqk awqkVar, awqg awqgVar, Function0 function0, Function0 function1) {
        awutVar.getClass();
        awqkVar.getClass();
        awqgVar.getClass();
        function0.getClass();
        function1.getClass();
        this.scope = awutVar;
        this.traverse = awqkVar;
        this.handOff = awqgVar;
        this.clearFocus = function0;
        this.requestFrame = function1;
        this.phase = FocusPhase.Ready;
    }

    private final void dropFocus(boolean z) {
        boolean traversing = getTraversing();
        awwd awwdVar = this.traversal;
        if (awwdVar != null) {
            awwdVar.p(null);
        }
        if (z || this.phase == FocusPhase.Focused || traversing) {
            this.clearFocus.invoke();
            if (this.phase == FocusPhase.Focused) {
                this.phase = FocusPhase.Ready;
            }
            this.requestFrame.invoke();
        }
    }

    public static /* synthetic */ void onSurfaceFocusChanged$default(RiveFocusSession riveFocusSession, boolean z, RiveFocusDirection riveFocusDirection, int i, Object obj) {
        if ((i & 2) != 0) {
            riveFocusDirection = null;
        }
        riveFocusSession.onSurfaceFocusChanged(z, riveFocusDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTraversalResult(RiveFocusDirection riveFocusDirection, RiveFocusState riveFocusState) {
        FocusPhase focusPhase;
        if (riveFocusState instanceof RiveFocusState.Focused) {
            focusPhase = FocusPhase.Focused;
        } else {
            if (!awrc.c(riveFocusState, RiveFocusState.Unfocused.INSTANCE)) {
                throw new awmj();
            }
            focusPhase = FocusPhase.Released;
        }
        this.phase = focusPhase;
        this.requestFrame.invoke();
        if (this.phase == FocusPhase.Released && this.surfaceFocused && !((Boolean) this.handOff.invoke(riveFocusDirection)).booleanValue()) {
            this.phase = FocusPhase.Ready;
        }
    }

    private final void startTraversal(RiveFocusDirection riveFocusDirection, boolean z) {
        this.traversal = awro.t(this.scope, null, 4, new AnonymousClass1(z, riveFocusDirection, null), 1);
    }

    public final void dispose() {
        dropFocus(this.surfaceFocused);
    }

    public final FocusPhase getPhase() {
        return this.phase;
    }

    public final boolean getSurfaceFocused() {
        return this.surfaceFocused;
    }

    public final boolean getTraversing() {
        awwd awwdVar = this.traversal;
        return awwdVar != null && awwdVar.q();
    }

    public final void onRiveFocusChanged(boolean z) {
        if (z) {
            this.phase = FocusPhase.Focused;
        } else if (this.phase == FocusPhase.Focused) {
            this.phase = FocusPhase.Released;
        }
    }

    public final void onSurfaceFocusChanged(boolean z, RiveFocusDirection riveFocusDirection) {
        if (z != this.surfaceFocused) {
            this.surfaceFocused = z;
            if (!z) {
                dropFocus(true);
                return;
            }
            if (this.phase == FocusPhase.Released) {
                this.phase = FocusPhase.Ready;
            }
            if (riveFocusDirection == null || this.phase == FocusPhase.Focused) {
                return;
            }
            startTraversal(riveFocusDirection, true);
        }
    }

    public final boolean onTraversalKey(RiveFocusDirection riveFocusDirection) {
        riveFocusDirection.getClass();
        if (!this.surfaceFocused || this.phase == FocusPhase.Released) {
            return false;
        }
        if (!getTraversing()) {
            startTraversal(riveFocusDirection, false);
        }
        return true;
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
