package app.rive.semantics;

import defpackage.awrc;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsChildrenUpdate {
    public static final int $stable = 8;
    private final int[] childIds;
    private final int parentId;

    public SemanticsChildrenUpdate(int i, int[] iArr) {
        iArr.getClass();
        this.parentId = i;
        this.childIds = iArr;
    }

    public static /* synthetic */ SemanticsChildrenUpdate copy$default(SemanticsChildrenUpdate semanticsChildrenUpdate, int i, int[] iArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = semanticsChildrenUpdate.parentId;
        }
        if ((i2 & 2) != 0) {
            iArr = semanticsChildrenUpdate.childIds;
        }
        return semanticsChildrenUpdate.copy(i, iArr);
    }

    public final int component1() {
        return this.parentId;
    }

    public final int[] component2() {
        return this.childIds;
    }

    public final SemanticsChildrenUpdate copy(int i, int[] iArr) {
        iArr.getClass();
        return new SemanticsChildrenUpdate(i, iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticsChildrenUpdate) {
            SemanticsChildrenUpdate semanticsChildrenUpdate = (SemanticsChildrenUpdate) obj;
            if (this.parentId == semanticsChildrenUpdate.parentId && awrc.c(this.childIds, semanticsChildrenUpdate.childIds)) {
                return true;
            }
        }
        return false;
    }

    public final int[] getChildIds() {
        return this.childIds;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public int hashCode() {
        return (this.parentId * 31) + Arrays.hashCode(this.childIds);
    }

    public String toString() {
        return "SemanticsChildrenUpdate(parentId=" + this.parentId + ", childIds=" + Arrays.toString(this.childIds) + ')';
    }
}
