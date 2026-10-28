package app.rive.semantics;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ProjectedSemanticHierarchyHitTestKt {
    private static final boolean containsPoint(SemanticNodeData semanticNodeData, float f, float f2) {
        return f >= Math.min(semanticNodeData.getMinX(), semanticNodeData.getMaxX()) && f < Math.max(semanticNodeData.getMinX(), semanticNodeData.getMaxX()) && f2 >= Math.min(semanticNodeData.getMinY(), semanticNodeData.getMaxY()) && f2 < Math.max(semanticNodeData.getMinY(), semanticNodeData.getMaxY());
    }

    public static final Integer hitTest(ProjectedSemanticHierarchy projectedSemanticHierarchy, SemanticTreeModel semanticTreeModel, float f, float f2) {
        projectedSemanticHierarchy.getClass();
        semanticTreeModel.getClass();
        if (Math.abs(f) <= Float.MAX_VALUE && Math.abs(f2) <= Float.MAX_VALUE) {
            Iterator it = projectedSemanticHierarchy.getRoots().iterator();
            while (it.hasNext()) {
                Integer numHitTestSubtree = hitTestSubtree(projectedSemanticHierarchy, semanticTreeModel, ((Number) it.next()).intValue(), f, f2);
                if (numHitTestSubtree != null) {
                    return Integer.valueOf(numHitTestSubtree.intValue());
                }
            }
        }
        return null;
    }

    private static final Integer hitTestSubtree(ProjectedSemanticHierarchy projectedSemanticHierarchy, SemanticTreeModel semanticTreeModel, int i, float f, float f2) {
        Iterator it = projectedSemanticHierarchy.childrenOf(i).iterator();
        while (it.hasNext()) {
            Integer numHitTestSubtree = hitTestSubtree(projectedSemanticHierarchy, semanticTreeModel, ((Number) it.next()).intValue(), f, f2);
            if (numHitTestSubtree != null) {
                return Integer.valueOf(numHitTestSubtree.intValue());
            }
        }
        SemanticNodeData semanticNodeDataNodeById = semanticTreeModel.nodeById(i);
        if (semanticNodeDataNodeById != null) {
            Integer numValueOf = Integer.valueOf(i);
            numValueOf.intValue();
            if (containsPoint(semanticNodeDataNodeById, f, f2)) {
                return numValueOf;
            }
        }
        return null;
    }
}
