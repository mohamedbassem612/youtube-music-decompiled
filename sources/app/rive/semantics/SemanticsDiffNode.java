package app.rive.semantics;

import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsDiffNode {
    public static final int $stable = 0;
    private final int headingLevel;
    private final String hint;
    private final int id;
    private final String label;
    private final float maxX;
    private final float maxY;
    private final float minX;
    private final float minY;
    private final int parentId;
    private final int role;
    private final int siblingIndex;
    private final int stateFlags;
    private final int traitFlags;
    private final String value;

    public SemanticsDiffNode(int i, int i2, String str, String str2, String str3, int i3, int i4, int i5, float f, float f2, float f3, float f4, int i6, int i7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.id = i;
        this.role = i2;
        this.label = str;
        this.value = str2;
        this.hint = str3;
        this.stateFlags = i3;
        this.traitFlags = i4;
        this.headingLevel = i5;
        this.minX = f;
        this.minY = f2;
        this.maxX = f3;
        this.maxY = f4;
        this.parentId = i6;
        this.siblingIndex = i7;
    }

    public final int component1() {
        return this.id;
    }

    public final float component10() {
        return this.minY;
    }

    public final float component11() {
        return this.maxX;
    }

    public final float component12() {
        return this.maxY;
    }

    public final int component13() {
        return this.parentId;
    }

    public final int component14() {
        return this.siblingIndex;
    }

    public final int component2() {
        return this.role;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.value;
    }

    public final String component5() {
        return this.hint;
    }

    public final int component6() {
        return this.stateFlags;
    }

    public final int component7() {
        return this.traitFlags;
    }

    public final int component8() {
        return this.headingLevel;
    }

    public final float component9() {
        return this.minX;
    }

    public final SemanticsDiffNode copy(int i, int i2, String str, String str2, String str3, int i3, int i4, int i5, float f, float f2, float f3, float f4, int i6, int i7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new SemanticsDiffNode(i, i2, str, str2, str3, i3, i4, i5, f, f2, f3, f4, i6, i7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticsDiffNode) {
            SemanticsDiffNode semanticsDiffNode = (SemanticsDiffNode) obj;
            if (this.id == semanticsDiffNode.id && this.role == semanticsDiffNode.role && awrc.c(this.label, semanticsDiffNode.label) && awrc.c(this.value, semanticsDiffNode.value) && awrc.c(this.hint, semanticsDiffNode.hint) && this.stateFlags == semanticsDiffNode.stateFlags && this.traitFlags == semanticsDiffNode.traitFlags && this.headingLevel == semanticsDiffNode.headingLevel && Float.compare(this.minX, semanticsDiffNode.minX) == 0 && Float.compare(this.minY, semanticsDiffNode.minY) == 0 && Float.compare(this.maxX, semanticsDiffNode.maxX) == 0 && Float.compare(this.maxY, semanticsDiffNode.maxY) == 0 && this.parentId == semanticsDiffNode.parentId && this.siblingIndex == semanticsDiffNode.siblingIndex) {
                return true;
            }
        }
        return false;
    }

    public final int getHeadingLevel() {
        return this.headingLevel;
    }

    public final String getHint() {
        return this.hint;
    }

    public final int getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final float getMaxX() {
        return this.maxX;
    }

    public final float getMaxY() {
        return this.maxY;
    }

    public final float getMinX() {
        return this.minX;
    }

    public final float getMinY() {
        return this.minY;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public final int getRole() {
        return this.role;
    }

    public final int getSiblingIndex() {
        return this.siblingIndex;
    }

    public final int getStateFlags() {
        return this.stateFlags;
    }

    public final int getTraitFlags() {
        return this.traitFlags;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.id * 31) + this.role) * 31) + this.label.hashCode()) * 31) + this.value.hashCode()) * 31) + this.hint.hashCode()) * 31) + this.stateFlags) * 31) + this.traitFlags) * 31) + this.headingLevel) * 31) + Float.floatToIntBits(this.minX)) * 31) + Float.floatToIntBits(this.minY)) * 31) + Float.floatToIntBits(this.maxX)) * 31) + Float.floatToIntBits(this.maxY)) * 31) + this.parentId) * 31) + this.siblingIndex;
    }

    public String toString() {
        return "SemanticsDiffNode(id=" + this.id + ", role=" + this.role + ", label=" + this.label + ", value=" + this.value + ", hint=" + this.hint + ", stateFlags=" + this.stateFlags + ", traitFlags=" + this.traitFlags + ", headingLevel=" + this.headingLevel + ", minX=" + this.minX + ", minY=" + this.minY + ", maxX=" + this.maxX + ", maxY=" + this.maxY + ", parentId=" + this.parentId + ", siblingIndex=" + this.siblingIndex + ')';
    }
}
