package app.rive.semantics;

import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ModalSelection {
    private final boolean hasDisjointCandidates;
    private final Integer nodeId;

    public ModalSelection(Integer num, boolean z) {
        this.nodeId = num;
        this.hasDisjointCandidates = z;
    }

    public static /* synthetic */ ModalSelection copy$default(ModalSelection modalSelection, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = modalSelection.nodeId;
        }
        if ((i & 2) != 0) {
            z = modalSelection.hasDisjointCandidates;
        }
        return modalSelection.copy(num, z);
    }

    public final Integer component1() {
        return this.nodeId;
    }

    public final boolean component2() {
        return this.hasDisjointCandidates;
    }

    public final ModalSelection copy(Integer num, boolean z) {
        return new ModalSelection(num, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ModalSelection) {
            ModalSelection modalSelection = (ModalSelection) obj;
            if (awrc.c(this.nodeId, modalSelection.nodeId) && this.hasDisjointCandidates == modalSelection.hasDisjointCandidates) {
                return true;
            }
        }
        return false;
    }

    public final boolean getHasDisjointCandidates() {
        return this.hasDisjointCandidates;
    }

    public final Integer getNodeId() {
        return this.nodeId;
    }

    public int hashCode() {
        Integer num = this.nodeId;
        return ((num == null ? 0 : num.hashCode()) * 31) + ModalSelection$$ExternalSyntheticBackport0.m(this.hasDisjointCandidates);
    }

    public String toString() {
        return "ModalSelection(nodeId=" + this.nodeId + ", hasDisjointCandidates=" + this.hasDisjointCandidates + ')';
    }
}
