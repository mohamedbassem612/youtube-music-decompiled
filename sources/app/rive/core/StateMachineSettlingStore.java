package app.rive.core;

import defpackage.axae;
import defpackage.axaf;
import defpackage.axag;
import defpackage.axah;
import defpackage.axal;
import defpackage.axat;
import defpackage.axaw;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class StateMachineSettlingStore {
    public static final int $stable = 8;
    private final axae _acceptedSettlements;
    private final axah acceptedSettlements;
    private final Object lock;
    private final Function0 reserveNextRequestID;
    private final Map slots;

    /* JADX INFO: compiled from: PG */
    final class Slot {
        private final axaf mutableSettled;
        private long requestIDBoundary;
        private final axat settled;

        public Slot(long j) {
            this.requestIDBoundary = j;
            axaf axafVarA = axaw.a(Boolean.FALSE);
            this.mutableSettled = axafVarA;
            this.settled = new axag(axafVarA, null);
        }

        public final axaf getMutableSettled() {
            return this.mutableSettled;
        }

        public final long getRequestIDBoundary() {
            return this.requestIDBoundary;
        }

        public final axat getSettled() {
            return this.settled;
        }

        public final void setRequestIDBoundary(long j) {
            this.requestIDBoundary = j;
        }
    }

    public StateMachineSettlingStore(Function0 function0) {
        function0.getClass();
        this.reserveNextRequestID = function0;
        this.lock = new Object();
        this.slots = new LinkedHashMap();
        axae axaeVarD = axal.d(0, 32, 2);
        this._acceptedSettlements = axaeVarD;
        this.acceptedSettlements = axaeVarD;
    }

    /* JADX INFO: renamed from: requireSlot-AkTCgDQ, reason: not valid java name */
    private final Slot m571requireSlotAkTCgDQ(long j) {
        Object obj = this.slots.get(StateMachineHandle.m564boximpl(j));
        if (obj != null) {
            return (Slot) obj;
        }
        throw new IllegalStateException("No settled state is registered for ".concat(StateMachineHandle.m569toStringimpl(j)));
    }

    public final void clear() {
        synchronized (this.lock) {
            Iterator it = this.slots.values().iterator();
            while (it.hasNext()) {
                ((Slot) it.next()).getMutableSettled().d(Boolean.TRUE);
            }
            this.slots.clear();
        }
    }

    public final axah getAcceptedSettlements() {
        return this.acceptedSettlements;
    }

    /* JADX INFO: renamed from: register-AkTCgDQ, reason: not valid java name */
    public final void m572registerAkTCgDQ(long j) {
        synchronized (this.lock) {
            if (this.slots.containsKey(StateMachineHandle.m564boximpl(j))) {
                throw new IllegalStateException("Settled state is already registered for " + StateMachineHandle.m569toStringimpl(j));
            }
            this.slots.put(StateMachineHandle.m564boximpl(j), new Slot(((Number) this.reserveNextRequestID.invoke()).longValue()));
        }
    }

    /* JADX INFO: renamed from: settle-S2xOzgc, reason: not valid java name */
    public final void m573settleS2xOzgc(long j, long j2) {
        synchronized (this.lock) {
            Slot slot = (Slot) this.slots.get(StateMachineHandle.m564boximpl(j2));
            if (slot != null && j > slot.getRequestIDBoundary() && !((Boolean) slot.getMutableSettled().c()).booleanValue()) {
                slot.getMutableSettled().d(Boolean.TRUE);
                this._acceptedSettlements.b(StateMachineHandle.m564boximpl(j2));
            }
        }
    }

    /* JADX INFO: renamed from: settled-AkTCgDQ, reason: not valid java name */
    public final axat m574settledAkTCgDQ(long j) {
        axat settled;
        synchronized (this.lock) {
            settled = m571requireSlotAkTCgDQ(j).getSettled();
        }
        return settled;
    }

    /* JADX INFO: renamed from: unregister-AkTCgDQ, reason: not valid java name */
    public final void m575unregisterAkTCgDQ(long j) {
        axaf mutableSettled;
        synchronized (this.lock) {
            Slot slot = (Slot) this.slots.get(StateMachineHandle.m564boximpl(j));
            if (slot != null && (mutableSettled = slot.getMutableSettled()) != null) {
                mutableSettled.d(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: unsettle-AkTCgDQ, reason: not valid java name */
    public final void m576unsettleAkTCgDQ(long j) {
        synchronized (this.lock) {
            Slot slotM571requireSlotAkTCgDQ = m571requireSlotAkTCgDQ(j);
            slotM571requireSlotAkTCgDQ.setRequestIDBoundary(((Number) this.reserveNextRequestID.invoke()).longValue());
            slotM571requireSlotAkTCgDQ.getMutableSettled().d(Boolean.FALSE);
        }
    }
}
