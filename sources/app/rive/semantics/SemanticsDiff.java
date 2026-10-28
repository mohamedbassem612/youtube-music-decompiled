package app.rive.semantics;

import defpackage.awqx;
import defpackage.awrc;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsDiff {
    private final SemanticsDiffNode[] added;
    private final SemanticsChildrenUpdate[] childrenUpdated;
    private final long frameNumber;
    private final SemanticsDiffNode[] moved;
    private final int[] removed;
    private final int rootId;
    private final long treeVersion;
    private final SemanticsBoundsUpdate[] updatedGeometry;
    private final SemanticsDiffNode[] updatedSemantic;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final SemanticsDiff Empty = new SemanticsDiff(0, 0, 0, new int[0], new SemanticsDiffNode[0], new SemanticsDiffNode[0], new SemanticsChildrenUpdate[0], new SemanticsDiffNode[0], new SemanticsBoundsUpdate[0]);

    public SemanticsDiff(long j, long j2, int i, int[] iArr, SemanticsDiffNode[] semanticsDiffNodeArr, SemanticsDiffNode[] semanticsDiffNodeArr2, SemanticsChildrenUpdate[] semanticsChildrenUpdateArr, SemanticsDiffNode[] semanticsDiffNodeArr3, SemanticsBoundsUpdate[] semanticsBoundsUpdateArr) {
        iArr.getClass();
        semanticsDiffNodeArr.getClass();
        semanticsDiffNodeArr2.getClass();
        semanticsChildrenUpdateArr.getClass();
        semanticsDiffNodeArr3.getClass();
        semanticsBoundsUpdateArr.getClass();
        this.treeVersion = j;
        this.frameNumber = j2;
        this.rootId = i;
        this.removed = iArr;
        this.added = semanticsDiffNodeArr;
        this.moved = semanticsDiffNodeArr2;
        this.childrenUpdated = semanticsChildrenUpdateArr;
        this.updatedSemantic = semanticsDiffNodeArr3;
        this.updatedGeometry = semanticsBoundsUpdateArr;
    }

    public static /* synthetic */ SemanticsDiff copy$default(SemanticsDiff semanticsDiff, long j, long j2, int i, int[] iArr, SemanticsDiffNode[] semanticsDiffNodeArr, SemanticsDiffNode[] semanticsDiffNodeArr2, SemanticsChildrenUpdate[] semanticsChildrenUpdateArr, SemanticsDiffNode[] semanticsDiffNodeArr3, SemanticsBoundsUpdate[] semanticsBoundsUpdateArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = semanticsDiff.treeVersion;
        }
        if ((i2 & 2) != 0) {
            j2 = semanticsDiff.frameNumber;
        }
        if ((i2 & 4) != 0) {
            i = semanticsDiff.rootId;
        }
        if ((i2 & 8) != 0) {
            iArr = semanticsDiff.removed;
        }
        if ((i2 & 16) != 0) {
            semanticsDiffNodeArr = semanticsDiff.added;
        }
        if ((i2 & 32) != 0) {
            semanticsDiffNodeArr2 = semanticsDiff.moved;
        }
        if ((i2 & 64) != 0) {
            semanticsChildrenUpdateArr = semanticsDiff.childrenUpdated;
        }
        if ((i2 & SemanticState.Focused) != 0) {
            semanticsDiffNodeArr3 = semanticsDiff.updatedSemantic;
        }
        if ((i2 & SemanticState.Hidden) != 0) {
            semanticsBoundsUpdateArr = semanticsDiff.updatedGeometry;
        }
        return semanticsDiff.copy(j, j2, i, iArr, semanticsDiffNodeArr, semanticsDiffNodeArr2, semanticsChildrenUpdateArr, semanticsDiffNodeArr3, semanticsBoundsUpdateArr);
    }

    public final long component1() {
        return this.treeVersion;
    }

    public final long component2() {
        return this.frameNumber;
    }

    public final int component3() {
        return this.rootId;
    }

    public final int[] component4() {
        return this.removed;
    }

    public final SemanticsDiffNode[] component5() {
        return this.added;
    }

    public final SemanticsDiffNode[] component6() {
        return this.moved;
    }

    public final SemanticsChildrenUpdate[] component7() {
        return this.childrenUpdated;
    }

    public final SemanticsDiffNode[] component8() {
        return this.updatedSemantic;
    }

    public final SemanticsBoundsUpdate[] component9() {
        return this.updatedGeometry;
    }

    public final SemanticsDiff copy(long j, long j2, int i, int[] iArr, SemanticsDiffNode[] semanticsDiffNodeArr, SemanticsDiffNode[] semanticsDiffNodeArr2, SemanticsChildrenUpdate[] semanticsChildrenUpdateArr, SemanticsDiffNode[] semanticsDiffNodeArr3, SemanticsBoundsUpdate[] semanticsBoundsUpdateArr) {
        iArr.getClass();
        semanticsDiffNodeArr.getClass();
        semanticsDiffNodeArr2.getClass();
        semanticsChildrenUpdateArr.getClass();
        semanticsDiffNodeArr3.getClass();
        semanticsBoundsUpdateArr.getClass();
        return new SemanticsDiff(j, j2, i, iArr, semanticsDiffNodeArr, semanticsDiffNodeArr2, semanticsChildrenUpdateArr, semanticsDiffNodeArr3, semanticsBoundsUpdateArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticsDiff) {
            SemanticsDiff semanticsDiff = (SemanticsDiff) obj;
            if (this.treeVersion == semanticsDiff.treeVersion && this.frameNumber == semanticsDiff.frameNumber && this.rootId == semanticsDiff.rootId && awrc.c(this.removed, semanticsDiff.removed) && awrc.c(this.added, semanticsDiff.added) && awrc.c(this.moved, semanticsDiff.moved) && awrc.c(this.childrenUpdated, semanticsDiff.childrenUpdated) && awrc.c(this.updatedSemantic, semanticsDiff.updatedSemantic) && awrc.c(this.updatedGeometry, semanticsDiff.updatedGeometry)) {
                return true;
            }
        }
        return false;
    }

    public final SemanticsDiffNode[] getAdded() {
        return this.added;
    }

    public final SemanticsChildrenUpdate[] getChildrenUpdated() {
        return this.childrenUpdated;
    }

    public final long getFrameNumber() {
        return this.frameNumber;
    }

    public final SemanticsDiffNode[] getMoved() {
        return this.moved;
    }

    public final int[] getRemoved() {
        return this.removed;
    }

    public final int getRootId() {
        return this.rootId;
    }

    public final long getTreeVersion() {
        return this.treeVersion;
    }

    public final SemanticsBoundsUpdate[] getUpdatedGeometry() {
        return this.updatedGeometry;
    }

    public final SemanticsDiffNode[] getUpdatedSemantic() {
        return this.updatedSemantic;
    }

    public int hashCode() {
        return (((((((((((((((SemanticsDiff$$ExternalSyntheticBackport0.m(this.treeVersion) * 31) + SemanticsDiff$$ExternalSyntheticBackport0.m(this.frameNumber)) * 31) + this.rootId) * 31) + Arrays.hashCode(this.removed)) * 31) + Arrays.hashCode(this.added)) * 31) + Arrays.hashCode(this.moved)) * 31) + Arrays.hashCode(this.childrenUpdated)) * 31) + Arrays.hashCode(this.updatedSemantic)) * 31) + Arrays.hashCode(this.updatedGeometry);
    }

    public final boolean isEmpty() {
        return this.removed.length == 0 && this.added.length == 0 && this.moved.length == 0 && this.childrenUpdated.length == 0 && this.updatedSemantic.length == 0 && this.updatedGeometry.length == 0;
    }

    public String toString() {
        SemanticsBoundsUpdate[] semanticsBoundsUpdateArr = this.updatedGeometry;
        SemanticsDiffNode[] semanticsDiffNodeArr = this.updatedSemantic;
        SemanticsChildrenUpdate[] semanticsChildrenUpdateArr = this.childrenUpdated;
        SemanticsDiffNode[] semanticsDiffNodeArr2 = this.moved;
        SemanticsDiffNode[] semanticsDiffNodeArr3 = this.added;
        return "SemanticsDiff(treeVersion=" + this.treeVersion + ", frameNumber=" + this.frameNumber + ", rootId=" + this.rootId + ", removed=" + Arrays.toString(this.removed) + ", added=" + Arrays.toString(semanticsDiffNodeArr3) + ", moved=" + Arrays.toString(semanticsDiffNodeArr2) + ", childrenUpdated=" + Arrays.toString(semanticsChildrenUpdateArr) + ", updatedSemantic=" + Arrays.toString(semanticsDiffNodeArr) + ", updatedGeometry=" + Arrays.toString(semanticsBoundsUpdateArr) + ')';
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public final SemanticsDiff getEmpty() {
            return SemanticsDiff.Empty;
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
