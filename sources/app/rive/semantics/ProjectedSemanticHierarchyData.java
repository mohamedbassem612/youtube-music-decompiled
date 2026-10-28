package app.rive.semantics;

import defpackage.awrc;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ProjectedSemanticHierarchyData {
    private final Integer activeModalNodeId;
    private final List activeNodeIds;
    private final Map childrenByNodeId;
    private final boolean hasDisjointActiveModals;
    private final Map parentByNodeId;
    private final List roots;

    public ProjectedSemanticHierarchyData(List list, List list2, Integer num, boolean z, Map map, Map map2) {
        list.getClass();
        list2.getClass();
        map.getClass();
        map2.getClass();
        this.roots = list;
        this.activeNodeIds = list2;
        this.activeModalNodeId = num;
        this.hasDisjointActiveModals = z;
        this.parentByNodeId = map;
        this.childrenByNodeId = map2;
    }

    public static /* synthetic */ ProjectedSemanticHierarchyData copy$default(ProjectedSemanticHierarchyData projectedSemanticHierarchyData, List list, List list2, Integer num, boolean z, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = projectedSemanticHierarchyData.roots;
        }
        if ((i & 2) != 0) {
            list2 = projectedSemanticHierarchyData.activeNodeIds;
        }
        if ((i & 4) != 0) {
            num = projectedSemanticHierarchyData.activeModalNodeId;
        }
        if ((i & 8) != 0) {
            z = projectedSemanticHierarchyData.hasDisjointActiveModals;
        }
        if ((i & 16) != 0) {
            map = projectedSemanticHierarchyData.parentByNodeId;
        }
        if ((i & 32) != 0) {
            map2 = projectedSemanticHierarchyData.childrenByNodeId;
        }
        return projectedSemanticHierarchyData.copy(list, list2, num, z, map, map2);
    }

    public final List component1() {
        return this.roots;
    }

    public final List component2() {
        return this.activeNodeIds;
    }

    public final Integer component3() {
        return this.activeModalNodeId;
    }

    public final boolean component4() {
        return this.hasDisjointActiveModals;
    }

    public final Map component5() {
        return this.parentByNodeId;
    }

    public final Map component6() {
        return this.childrenByNodeId;
    }

    public final ProjectedSemanticHierarchyData copy(List list, List list2, Integer num, boolean z, Map map, Map map2) {
        list.getClass();
        list2.getClass();
        map.getClass();
        map2.getClass();
        return new ProjectedSemanticHierarchyData(list, list2, num, z, map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProjectedSemanticHierarchyData) {
            ProjectedSemanticHierarchyData projectedSemanticHierarchyData = (ProjectedSemanticHierarchyData) obj;
            if (awrc.c(this.roots, projectedSemanticHierarchyData.roots) && awrc.c(this.activeNodeIds, projectedSemanticHierarchyData.activeNodeIds) && awrc.c(this.activeModalNodeId, projectedSemanticHierarchyData.activeModalNodeId) && this.hasDisjointActiveModals == projectedSemanticHierarchyData.hasDisjointActiveModals && awrc.c(this.parentByNodeId, projectedSemanticHierarchyData.parentByNodeId) && awrc.c(this.childrenByNodeId, projectedSemanticHierarchyData.childrenByNodeId)) {
                return true;
            }
        }
        return false;
    }

    public final Integer getActiveModalNodeId() {
        return this.activeModalNodeId;
    }

    public final List getActiveNodeIds() {
        return this.activeNodeIds;
    }

    public final Map getChildrenByNodeId() {
        return this.childrenByNodeId;
    }

    public final boolean getHasDisjointActiveModals() {
        return this.hasDisjointActiveModals;
    }

    public final Map getParentByNodeId() {
        return this.parentByNodeId;
    }

    public final List getRoots() {
        return this.roots;
    }

    public int hashCode() {
        int iHashCode = (this.roots.hashCode() * 31) + this.activeNodeIds.hashCode();
        Integer num = this.activeModalNodeId;
        return (((((((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + ProjectedSemanticHierarchyData$$ExternalSyntheticBackport0.m(this.hasDisjointActiveModals)) * 31) + this.parentByNodeId.hashCode()) * 31) + this.childrenByNodeId.hashCode();
    }

    public String toString() {
        return "ProjectedSemanticHierarchyData(roots=" + this.roots + ", activeNodeIds=" + this.activeNodeIds + ", activeModalNodeId=" + this.activeModalNodeId + ", hasDisjointActiveModals=" + this.hasDisjointActiveModals + ", parentByNodeId=" + this.parentByNodeId + ", childrenByNodeId=" + this.childrenByNodeId + ')';
    }
}
