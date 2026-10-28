package app.rive.semantics;

import defpackage.awrc;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticNodeActions {
    public static final int $stable = 8;
    private final boolean canRequestFocus;
    private final Set semanticActions;

    public SemanticNodeActions(Set set, boolean z) {
        set.getClass();
        this.semanticActions = set;
        this.canRequestFocus = z;
    }

    public static /* synthetic */ SemanticNodeActions copy$default(SemanticNodeActions semanticNodeActions, Set set, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            set = semanticNodeActions.semanticActions;
        }
        if ((i & 2) != 0) {
            z = semanticNodeActions.canRequestFocus;
        }
        return semanticNodeActions.copy(set, z);
    }

    public final Set component1() {
        return this.semanticActions;
    }

    public final boolean component2() {
        return this.canRequestFocus;
    }

    public final SemanticNodeActions copy(Set set, boolean z) {
        set.getClass();
        return new SemanticNodeActions(set, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticNodeActions) {
            SemanticNodeActions semanticNodeActions = (SemanticNodeActions) obj;
            if (awrc.c(this.semanticActions, semanticNodeActions.semanticActions) && this.canRequestFocus == semanticNodeActions.canRequestFocus) {
                return true;
            }
        }
        return false;
    }

    public final boolean getCanRequestFocus() {
        return this.canRequestFocus;
    }

    public final Set getSemanticActions() {
        return this.semanticActions;
    }

    public int hashCode() {
        return (this.semanticActions.hashCode() * 31) + SemanticNodeActions$$ExternalSyntheticBackport0.m(this.canRequestFocus);
    }

    public String toString() {
        return "SemanticNodeActions(semanticActions=" + this.semanticActions + ", canRequestFocus=" + this.canRequestFocus + ')';
    }
}
