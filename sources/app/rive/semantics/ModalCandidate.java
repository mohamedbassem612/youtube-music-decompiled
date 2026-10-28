package app.rive.semantics;

import defpackage.awrc;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ModalCandidate {
    private final Set ancestorNodeIds;
    private final int depth;
    private final int nodeId;

    public ModalCandidate(int i, int i2, Set set) {
        set.getClass();
        this.nodeId = i;
        this.depth = i2;
        this.ancestorNodeIds = set;
    }

    public static /* synthetic */ ModalCandidate copy$default(ModalCandidate modalCandidate, int i, int i2, Set set, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = modalCandidate.nodeId;
        }
        if ((i3 & 2) != 0) {
            i2 = modalCandidate.depth;
        }
        if ((i3 & 4) != 0) {
            set = modalCandidate.ancestorNodeIds;
        }
        return modalCandidate.copy(i, i2, set);
    }

    public final int component1() {
        return this.nodeId;
    }

    public final int component2() {
        return this.depth;
    }

    public final Set component3() {
        return this.ancestorNodeIds;
    }

    public final ModalCandidate copy(int i, int i2, Set set) {
        set.getClass();
        return new ModalCandidate(i, i2, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ModalCandidate) {
            ModalCandidate modalCandidate = (ModalCandidate) obj;
            if (this.nodeId == modalCandidate.nodeId && this.depth == modalCandidate.depth && awrc.c(this.ancestorNodeIds, modalCandidate.ancestorNodeIds)) {
                return true;
            }
        }
        return false;
    }

    public final Set getAncestorNodeIds() {
        return this.ancestorNodeIds;
    }

    public final int getDepth() {
        return this.depth;
    }

    public final int getNodeId() {
        return this.nodeId;
    }

    public int hashCode() {
        return (((this.nodeId * 31) + this.depth) * 31) + this.ancestorNodeIds.hashCode();
    }

    public String toString() {
        return "ModalCandidate(nodeId=" + this.nodeId + ", depth=" + this.depth + ", ancestorNodeIds=" + this.ancestorNodeIds + ')';
    }
}
