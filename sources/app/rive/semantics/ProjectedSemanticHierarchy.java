package app.rive.semantics;

import defpackage.awno;
import defpackage.awqx;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ProjectedSemanticHierarchy {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer activeModalNodeId;
    private final List activeNodeIds;
    private final Map childrenByNodeId;
    private final boolean hasDisjointActiveModals;
    private final Map parentByNodeId;
    private final List roots;

    private ProjectedSemanticHierarchy(List list, List list2, Integer num, boolean z, Map map, Map map2) {
        this.roots = list;
        this.activeNodeIds = list2;
        this.activeModalNodeId = num;
        this.hasDisjointActiveModals = z;
        this.parentByNodeId = map;
        this.childrenByNodeId = map2;
    }

    public final List childrenOf(int i) {
        List list = (List) this.childrenByNodeId.get(Integer.valueOf(i));
        return list == null ? awno.a : list;
    }

    public final boolean contains(int i) {
        return this.parentByNodeId.containsKey(Integer.valueOf(i));
    }

    public final Integer getActiveModalNodeId() {
        return this.activeModalNodeId;
    }

    public final List getActiveNodeIds() {
        return this.activeNodeIds;
    }

    public final boolean getHasDisjointActiveModals() {
        return this.hasDisjointActiveModals;
    }

    public final List getRoots() {
        return this.roots;
    }

    public final int getSize() {
        return this.activeNodeIds.size();
    }

    public final Integer parentOf(int i) {
        return (Integer) this.parentByNodeId.get(Integer.valueOf(i));
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public final ProjectedSemanticHierarchy from(SemanticTreeModel semanticTreeModel) {
            semanticTreeModel.getClass();
            ProjectedSemanticHierarchyData projectedSemanticHierarchyDataBuild = new ProjectedSemanticHierarchyBuilder(semanticTreeModel).build();
            return new ProjectedSemanticHierarchy(projectedSemanticHierarchyDataBuild.getRoots(), projectedSemanticHierarchyDataBuild.getActiveNodeIds(), projectedSemanticHierarchyDataBuild.getActiveModalNodeId(), projectedSemanticHierarchyDataBuild.getHasDisjointActiveModals(), projectedSemanticHierarchyDataBuild.getParentByNodeId(), projectedSemanticHierarchyDataBuild.getChildrenByNodeId(), null);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ ProjectedSemanticHierarchy(List list, List list2, Integer num, boolean z, Map map, Map map2, awqx awqxVar) {
        this(list, list2, num, z, map, map2);
    }
}
