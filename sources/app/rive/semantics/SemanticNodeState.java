package app.rive.semantics;

import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticNodeState {
    public static final int $stable = 0;
    private final Boolean enabled;
    private final Boolean expanded;
    private final Boolean focused;
    private final boolean hidden;
    private final boolean liveRegion;
    private final boolean modal;
    private final boolean multiline;
    private final boolean obscured;
    private final boolean readOnly;
    private final Boolean required;
    private final Boolean selected;
    private final SemanticToggleState toggleState;

    public SemanticNodeState(Boolean bool, Boolean bool2, SemanticToggleState semanticToggleState, Boolean bool3, Boolean bool4, Boolean bool5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.expanded = bool;
        this.selected = bool2;
        this.toggleState = semanticToggleState;
        this.required = bool3;
        this.enabled = bool4;
        this.focused = bool5;
        this.hidden = z;
        this.liveRegion = z2;
        this.readOnly = z3;
        this.modal = z4;
        this.obscured = z5;
        this.multiline = z6;
    }

    public static /* synthetic */ SemanticNodeState copy$default(SemanticNodeState semanticNodeState, Boolean bool, Boolean bool2, SemanticToggleState semanticToggleState, Boolean bool3, Boolean bool4, Boolean bool5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = semanticNodeState.expanded;
        }
        if ((i & 2) != 0) {
            bool2 = semanticNodeState.selected;
        }
        if ((i & 4) != 0) {
            semanticToggleState = semanticNodeState.toggleState;
        }
        if ((i & 8) != 0) {
            bool3 = semanticNodeState.required;
        }
        if ((i & 16) != 0) {
            bool4 = semanticNodeState.enabled;
        }
        if ((i & 32) != 0) {
            bool5 = semanticNodeState.focused;
        }
        if ((i & 64) != 0) {
            z = semanticNodeState.hidden;
        }
        if ((i & SemanticState.Focused) != 0) {
            z2 = semanticNodeState.liveRegion;
        }
        if ((i & SemanticState.Hidden) != 0) {
            z3 = semanticNodeState.readOnly;
        }
        if ((i & SemanticState.LiveRegion) != 0) {
            z4 = semanticNodeState.modal;
        }
        if ((i & SemanticState.ReadOnly) != 0) {
            z5 = semanticNodeState.obscured;
        }
        if ((i & SemanticState.Modal) != 0) {
            z6 = semanticNodeState.multiline;
        }
        return semanticNodeState.copy(bool, bool2, semanticToggleState, bool3, bool4, bool5, z, z2, z3, z4, z5, z6);
    }

    public final Boolean component1() {
        return this.expanded;
    }

    public final boolean component10() {
        return this.modal;
    }

    public final boolean component11() {
        return this.obscured;
    }

    public final boolean component12() {
        return this.multiline;
    }

    public final Boolean component2() {
        return this.selected;
    }

    public final SemanticToggleState component3() {
        return this.toggleState;
    }

    public final Boolean component4() {
        return this.required;
    }

    public final Boolean component5() {
        return this.enabled;
    }

    public final Boolean component6() {
        return this.focused;
    }

    public final boolean component7() {
        return this.hidden;
    }

    public final boolean component8() {
        return this.liveRegion;
    }

    public final boolean component9() {
        return this.readOnly;
    }

    public final SemanticNodeState copy(Boolean bool, Boolean bool2, SemanticToggleState semanticToggleState, Boolean bool3, Boolean bool4, Boolean bool5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return new SemanticNodeState(bool, bool2, semanticToggleState, bool3, bool4, bool5, z, z2, z3, z4, z5, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticNodeState) {
            SemanticNodeState semanticNodeState = (SemanticNodeState) obj;
            if (awrc.c(this.expanded, semanticNodeState.expanded) && awrc.c(this.selected, semanticNodeState.selected) && this.toggleState == semanticNodeState.toggleState && awrc.c(this.required, semanticNodeState.required) && awrc.c(this.enabled, semanticNodeState.enabled) && awrc.c(this.focused, semanticNodeState.focused) && this.hidden == semanticNodeState.hidden && this.liveRegion == semanticNodeState.liveRegion && this.readOnly == semanticNodeState.readOnly && this.modal == semanticNodeState.modal && this.obscured == semanticNodeState.obscured && this.multiline == semanticNodeState.multiline) {
                return true;
            }
        }
        return false;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Boolean getExpanded() {
        return this.expanded;
    }

    public final Boolean getFocused() {
        return this.focused;
    }

    public final boolean getHidden() {
        return this.hidden;
    }

    public final boolean getLiveRegion() {
        return this.liveRegion;
    }

    public final boolean getModal() {
        return this.modal;
    }

    public final boolean getMultiline() {
        return this.multiline;
    }

    public final boolean getObscured() {
        return this.obscured;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final Boolean getRequired() {
        return this.required;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final SemanticToggleState getToggleState() {
        return this.toggleState;
    }

    public int hashCode() {
        Boolean bool = this.expanded;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.selected;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        int i = iHashCode * 31;
        SemanticToggleState semanticToggleState = this.toggleState;
        int iHashCode3 = (((i + iHashCode2) * 31) + (semanticToggleState == null ? 0 : semanticToggleState.hashCode())) * 31;
        Boolean bool3 = this.required;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.enabled;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.focused;
        return ((((((((((((iHashCode5 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + SemanticNodeState$$ExternalSyntheticBackport0.m(this.hidden)) * 31) + SemanticNodeState$$ExternalSyntheticBackport0.m(this.liveRegion)) * 31) + SemanticNodeState$$ExternalSyntheticBackport0.m(this.readOnly)) * 31) + SemanticNodeState$$ExternalSyntheticBackport0.m(this.modal)) * 31) + SemanticNodeState$$ExternalSyntheticBackport0.m(this.obscured)) * 31) + SemanticNodeState$$ExternalSyntheticBackport0.m(this.multiline);
    }

    public String toString() {
        return "SemanticNodeState(expanded=" + this.expanded + ", selected=" + this.selected + ", toggleState=" + this.toggleState + ", required=" + this.required + ", enabled=" + this.enabled + ", focused=" + this.focused + ", hidden=" + this.hidden + ", liveRegion=" + this.liveRegion + ", readOnly=" + this.readOnly + ", modal=" + this.modal + ", obscured=" + this.obscured + ", multiline=" + this.multiline + ')';
    }
}
