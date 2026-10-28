package app.rive.semantics;

import defpackage.awno;
import defpackage.awqx;
import defpackage.awrc;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticNodeData {
    public static final int $stable = 8;
    private final List children;
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
    private final int stateFlags;
    private final int traitFlags;
    private final String value;

    public /* synthetic */ SemanticNodeData(int i, int i2, int i3, String str, String str2, String str3, int i4, int i5, int i6, float f, float f2, float f3, float f4, List list, int i7, awqx awqxVar) {
        this(i, i2, i3, str, str2, str3, i4, i5, i6, f, f2, f3, f4, (i7 & SemanticState.Multiline) != 0 ? awno.a : list);
    }

    public final int component1() {
        return this.id;
    }

    public final float component10() {
        return this.minX;
    }

    public final float component11() {
        return this.minY;
    }

    public final float component12() {
        return this.maxX;
    }

    public final float component13() {
        return this.maxY;
    }

    public final List component14() {
        return this.children;
    }

    public final int component2() {
        return this.parentId;
    }

    public final int component3() {
        return this.role;
    }

    public final String component4() {
        return this.label;
    }

    public final String component5() {
        return this.value;
    }

    public final String component6() {
        return this.hint;
    }

    public final int component7() {
        return this.stateFlags;
    }

    public final int component8() {
        return this.traitFlags;
    }

    public final int component9() {
        return this.headingLevel;
    }

    public final SemanticNodeData copy(int i, int i2, int i3, String str, String str2, String str3, int i4, int i5, int i6, float f, float f2, float f3, float f4, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        return new SemanticNodeData(i, i2, i3, str, str2, str3, i4, i5, i6, f, f2, f3, f4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticNodeData) {
            SemanticNodeData semanticNodeData = (SemanticNodeData) obj;
            if (this.id == semanticNodeData.id && this.parentId == semanticNodeData.parentId && this.role == semanticNodeData.role && awrc.c(this.label, semanticNodeData.label) && awrc.c(this.value, semanticNodeData.value) && awrc.c(this.hint, semanticNodeData.hint) && this.stateFlags == semanticNodeData.stateFlags && this.traitFlags == semanticNodeData.traitFlags && this.headingLevel == semanticNodeData.headingLevel && Float.compare(this.minX, semanticNodeData.minX) == 0 && Float.compare(this.minY, semanticNodeData.minY) == 0 && Float.compare(this.maxX, semanticNodeData.maxX) == 0 && Float.compare(this.maxY, semanticNodeData.maxY) == 0 && awrc.c(this.children, semanticNodeData.children)) {
                return true;
            }
        }
        return false;
    }

    public final List getChildren() {
        return this.children;
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
        return (((((((((((((((((((((((((this.id * 31) + this.parentId) * 31) + this.role) * 31) + this.label.hashCode()) * 31) + this.value.hashCode()) * 31) + this.hint.hashCode()) * 31) + this.stateFlags) * 31) + this.traitFlags) * 31) + this.headingLevel) * 31) + Float.floatToIntBits(this.minX)) * 31) + Float.floatToIntBits(this.minY)) * 31) + Float.floatToIntBits(this.maxX)) * 31) + Float.floatToIntBits(this.maxY)) * 31) + this.children.hashCode();
    }

    public String toString() {
        return "SemanticNodeData(id=" + this.id + ", parentId=" + this.parentId + ", role=" + this.role + ", label=" + this.label + ", value=" + this.value + ", hint=" + this.hint + ", stateFlags=" + this.stateFlags + ", traitFlags=" + this.traitFlags + ", headingLevel=" + this.headingLevel + ", minX=" + this.minX + ", minY=" + this.minY + ", maxX=" + this.maxX + ", maxY=" + this.maxY + ", children=" + this.children + ')';
    }

    public SemanticNodeData(int i, int i2, int i3, String str, String str2, String str3, int i4, int i5, int i6, float f, float f2, float f3, float f4, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.id = i;
        this.parentId = i2;
        this.role = i3;
        this.label = str;
        this.value = str2;
        this.hint = str3;
        this.stateFlags = i4;
        this.traitFlags = i5;
        this.headingLevel = i6;
        this.minX = f;
        this.minY = f2;
        this.maxX = f3;
        this.maxY = f4;
        this.children = list;
    }
}
