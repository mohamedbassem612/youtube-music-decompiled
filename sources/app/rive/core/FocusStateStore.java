package app.rive.core;

import app.rive.RiveFocusState;
import defpackage.axaf;
import defpackage.axag;
import defpackage.axat;
import defpackage.axaw;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class FocusStateStore {
    public static final int $stable = 8;
    private final Object lock;
    private final Function0 reserveNextRequestID;
    private final Map slots;

    /* JADX INFO: compiled from: PG */
    final class Slot {
        private final axat focusState;
        private final axat hasFocusNodes;
        private final axaf mutableFocusState;
        private final axaf mutableHasFocusNodes;
        private final axaf mutableReportedHasFocusNodes;
        private final axat reportedHasFocusNodes;
        private long requestIDBoundary;

        public Slot(long j) {
            this.requestIDBoundary = j;
            axaf axafVarA = axaw.a(RiveFocusState.Unfocused.INSTANCE);
            this.mutableFocusState = axafVarA;
            this.focusState = new axag(axafVarA, null);
            axaf axafVarA2 = axaw.a(Boolean.FALSE);
            this.mutableHasFocusNodes = axafVarA2;
            this.hasFocusNodes = new axag(axafVarA2, null);
            axaf axafVarA3 = axaw.a(null);
            this.mutableReportedHasFocusNodes = axafVarA3;
            this.reportedHasFocusNodes = new axag(axafVarA3, null);
        }

        public final axat getFocusState() {
            return this.focusState;
        }

        public final axat getHasFocusNodes() {
            return this.hasFocusNodes;
        }

        public final axaf getMutableFocusState() {
            return this.mutableFocusState;
        }

        public final axaf getMutableHasFocusNodes() {
            return this.mutableHasFocusNodes;
        }

        public final axaf getMutableReportedHasFocusNodes() {
            return this.mutableReportedHasFocusNodes;
        }

        public final axat getReportedHasFocusNodes() {
            return this.reportedHasFocusNodes;
        }

        public final long getRequestIDBoundary() {
            return this.requestIDBoundary;
        }

        public final void publishTerminalState() {
            this.mutableFocusState.d(RiveFocusState.Unfocused.INSTANCE);
            axaf axafVar = this.mutableHasFocusNodes;
            Boolean bool = Boolean.FALSE;
            axafVar.d(bool);
            this.mutableReportedHasFocusNodes.d(bool);
        }

        public final void setRequestIDBoundary(long j) {
            this.requestIDBoundary = j;
        }
    }

    public FocusStateStore(Function0 function0) {
        function0.getClass();
        this.reserveNextRequestID = function0;
        this.lock = new Object();
        this.slots = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: requireSlot-AkTCgDQ, reason: not valid java name */
    private final Slot m535requireSlotAkTCgDQ(long j) {
        Object obj = this.slots.get(StateMachineHandle.m564boximpl(j));
        if (obj != null) {
            return (Slot) obj;
        }
        throw new IllegalStateException("No focus state is registered for ".concat(StateMachineHandle.m569toStringimpl(j)));
    }

    /* JADX INFO: renamed from: applyFocusState--3uIp1w, reason: not valid java name */
    public final void m536applyFocusState3uIp1w(long j, long j2, RiveFocusState riveFocusState) {
        riveFocusState.getClass();
        synchronized (this.lock) {
            Slot slot = (Slot) this.slots.get(StateMachineHandle.m564boximpl(j2));
            if (slot != null && j > slot.getRequestIDBoundary()) {
                slot.getMutableFocusState().d(riveFocusState);
            }
        }
    }

    /* JADX INFO: renamed from: applyHasFocusNodes-OFH3VyA, reason: not valid java name */
    public final void m537applyHasFocusNodesOFH3VyA(long j, boolean z) {
        synchronized (this.lock) {
            Slot slot = (Slot) this.slots.get(StateMachineHandle.m564boximpl(j));
            if (slot != null) {
                axaf mutableHasFocusNodes = slot.getMutableHasFocusNodes();
                Boolean boolValueOf = Boolean.valueOf(z);
                mutableHasFocusNodes.d(boolValueOf);
                slot.getMutableReportedHasFocusNodes().d(boolValueOf);
            }
        }
    }

    public final void clear() {
        synchronized (this.lock) {
            Iterator it = this.slots.values().iterator();
            while (it.hasNext()) {
                ((Slot) it.next()).publishTerminalState();
            }
            this.slots.clear();
        }
    }

    /* JADX INFO: renamed from: focusState-AkTCgDQ, reason: not valid java name */
    public final axat m538focusStateAkTCgDQ(long j) {
        axat focusState;
        synchronized (this.lock) {
            focusState = m535requireSlotAkTCgDQ(j).getFocusState();
        }
        return focusState;
    }

    /* JADX INFO: renamed from: hasFocusNodes-AkTCgDQ, reason: not valid java name */
    public final axat m539hasFocusNodesAkTCgDQ(long j) {
        axat hasFocusNodes;
        synchronized (this.lock) {
            hasFocusNodes = m535requireSlotAkTCgDQ(j).getHasFocusNodes();
        }
        return hasFocusNodes;
    }

    /* JADX INFO: renamed from: invalidate-AkTCgDQ, reason: not valid java name */
    public final void m540invalidateAkTCgDQ(long j) {
        synchronized (this.lock) {
            Slot slot = (Slot) this.slots.get(StateMachineHandle.m564boximpl(j));
            if (slot != null) {
                slot.setRequestIDBoundary(((Number) this.reserveNextRequestID.invoke()).longValue());
            }
        }
    }

    /* JADX INFO: renamed from: register-AkTCgDQ, reason: not valid java name */
    public final void m541registerAkTCgDQ(long j) {
        synchronized (this.lock) {
            if (this.slots.containsKey(StateMachineHandle.m564boximpl(j))) {
                throw new IllegalStateException("Focus state is already registered for " + StateMachineHandle.m569toStringimpl(j));
            }
            this.slots.put(StateMachineHandle.m564boximpl(j), new Slot(((Number) this.reserveNextRequestID.invoke()).longValue()));
        }
    }

    /* JADX INFO: renamed from: reportedHasFocusNodes-AkTCgDQ, reason: not valid java name */
    public final axat m542reportedHasFocusNodesAkTCgDQ(long j) {
        axat reportedHasFocusNodes;
        synchronized (this.lock) {
            reportedHasFocusNodes = m535requireSlotAkTCgDQ(j).getReportedHasFocusNodes();
        }
        return reportedHasFocusNodes;
    }

    /* JADX INFO: renamed from: unregister-AkTCgDQ, reason: not valid java name */
    public final void m543unregisterAkTCgDQ(long j) {
        synchronized (this.lock) {
            Slot slot = (Slot) this.slots.remove(StateMachineHandle.m564boximpl(j));
            if (slot != null) {
                slot.publishTerminalState();
            }
        }
    }
}
