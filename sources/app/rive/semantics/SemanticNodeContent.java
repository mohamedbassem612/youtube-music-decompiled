package app.rive.semantics;

import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticNodeContent {
    public static final int $stable = 0;
    private final String hint;
    private final boolean isMultiline;
    private final boolean isObscured;
    private final boolean isReadOnly;
    private final SemanticNodeContentKind kind;
    private final String label;
    private final String value;

    public SemanticNodeContent(SemanticNodeContentKind semanticNodeContentKind, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        semanticNodeContentKind.getClass();
        this.kind = semanticNodeContentKind;
        this.label = str;
        this.value = str2;
        this.hint = str3;
        this.isReadOnly = z;
        this.isObscured = z2;
        this.isMultiline = z3;
    }

    public static /* synthetic */ SemanticNodeContent copy$default(SemanticNodeContent semanticNodeContent, SemanticNodeContentKind semanticNodeContentKind, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            semanticNodeContentKind = semanticNodeContent.kind;
        }
        if ((i & 2) != 0) {
            str = semanticNodeContent.label;
        }
        if ((i & 4) != 0) {
            str2 = semanticNodeContent.value;
        }
        if ((i & 8) != 0) {
            str3 = semanticNodeContent.hint;
        }
        if ((i & 16) != 0) {
            z = semanticNodeContent.isReadOnly;
        }
        if ((i & 32) != 0) {
            z2 = semanticNodeContent.isObscured;
        }
        if ((i & 64) != 0) {
            z3 = semanticNodeContent.isMultiline;
        }
        return semanticNodeContent.copy(semanticNodeContentKind, str, str2, str3, z, z2, z3);
    }

    public final SemanticNodeContentKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.value;
    }

    public final String component4() {
        return this.hint;
    }

    public final boolean component5() {
        return this.isReadOnly;
    }

    public final boolean component6() {
        return this.isObscured;
    }

    public final boolean component7() {
        return this.isMultiline;
    }

    public final SemanticNodeContent copy(SemanticNodeContentKind semanticNodeContentKind, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        semanticNodeContentKind.getClass();
        return new SemanticNodeContent(semanticNodeContentKind, str, str2, str3, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticNodeContent) {
            SemanticNodeContent semanticNodeContent = (SemanticNodeContent) obj;
            if (this.kind == semanticNodeContent.kind && awrc.c(this.label, semanticNodeContent.label) && awrc.c(this.value, semanticNodeContent.value) && awrc.c(this.hint, semanticNodeContent.hint) && this.isReadOnly == semanticNodeContent.isReadOnly && this.isObscured == semanticNodeContent.isObscured && this.isMultiline == semanticNodeContent.isMultiline) {
                return true;
            }
        }
        return false;
    }

    public final String getHint() {
        return this.hint;
    }

    public final SemanticNodeContentKind getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.kind.hashCode() * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        return ((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + SemanticNodeContent$$ExternalSyntheticBackport0.m(this.isReadOnly)) * 31) + SemanticNodeContent$$ExternalSyntheticBackport0.m(this.isObscured)) * 31) + SemanticNodeContent$$ExternalSyntheticBackport0.m(this.isMultiline);
    }

    public final boolean isMultiline() {
        return this.isMultiline;
    }

    public final boolean isObscured() {
        return this.isObscured;
    }

    public final boolean isReadOnly() {
        return this.isReadOnly;
    }

    public String toString() {
        return "SemanticNodeContent(kind=" + this.kind + ", label=" + this.label + ", value=" + this.value + ", hint=" + this.hint + ", isReadOnly=" + this.isReadOnly + ", isObscured=" + this.isObscured + ", isMultiline=" + this.isMultiline + ')';
    }
}
