package app.rive.semantics;

import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticAccessibilityFocusTransition {
    public static final int $stable = 0;
    private final Integer currentNodeId;
    private final Integer previousNodeId;

    public SemanticAccessibilityFocusTransition(Integer num, Integer num2) {
        this.previousNodeId = num;
        this.currentNodeId = num2;
    }

    public static /* synthetic */ SemanticAccessibilityFocusTransition copy$default(SemanticAccessibilityFocusTransition semanticAccessibilityFocusTransition, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = semanticAccessibilityFocusTransition.previousNodeId;
        }
        if ((i & 2) != 0) {
            num2 = semanticAccessibilityFocusTransition.currentNodeId;
        }
        return semanticAccessibilityFocusTransition.copy(num, num2);
    }

    public final Integer component1() {
        return this.previousNodeId;
    }

    public final Integer component2() {
        return this.currentNodeId;
    }

    public final SemanticAccessibilityFocusTransition copy(Integer num, Integer num2) {
        return new SemanticAccessibilityFocusTransition(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticAccessibilityFocusTransition) {
            SemanticAccessibilityFocusTransition semanticAccessibilityFocusTransition = (SemanticAccessibilityFocusTransition) obj;
            if (awrc.c(this.previousNodeId, semanticAccessibilityFocusTransition.previousNodeId) && awrc.c(this.currentNodeId, semanticAccessibilityFocusTransition.currentNodeId)) {
                return true;
            }
        }
        return false;
    }

    public final Integer getCurrentNodeId() {
        return this.currentNodeId;
    }

    public final Integer getPreviousNodeId() {
        return this.previousNodeId;
    }

    public int hashCode() {
        Integer num = this.previousNodeId;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.currentNodeId;
        return (iHashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "SemanticAccessibilityFocusTransition(previousNodeId=" + this.previousNodeId + ", currentNodeId=" + this.currentNodeId + ')';
    }
}
