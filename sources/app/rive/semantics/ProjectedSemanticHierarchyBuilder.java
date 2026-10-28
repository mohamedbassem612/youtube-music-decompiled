package app.rive.semantics;

import app.rive.RiveLog;
import defpackage.atqq;
import defpackage.awmj;
import defpackage.awno;
import defpackage.awnq;
import defpackage.awqx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ProjectedSemanticHierarchyBuilder {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "Rive/Semantics";
    private final List activeNodeIds;
    private final Map childrenByNodeId;
    private final LinkedHashMap parentByNodeId;
    private final SemanticTreeModel tree;
    private final Set visitedNodeIds;

    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SemanticNodeProjection.values().length];
            try {
                iArr[SemanticNodeProjection.PruneSubtree.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SemanticNodeProjection.PromoteChildren.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SemanticNodeProjection.ExportContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SemanticNodeProjection.ExportLeaf.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProjectedSemanticHierarchyBuilder(SemanticTreeModel semanticTreeModel) {
        semanticTreeModel.getClass();
        this.tree = semanticTreeModel;
        this.activeNodeIds = new ArrayList();
        this.parentByNodeId = new LinkedHashMap();
        this.childrenByNodeId = new LinkedHashMap();
        this.visitedNodeIds = new LinkedHashSet();
    }

    static final String build$lambda$0(ModalSelection modalSelection) {
        return "Multiple disjoint Rive semantic modals are active; using authored modal " + modalSelection.getNodeId() + '.';
    }

    private final void exportNode(int i, Integer num, List list) {
        Integer numValueOf = Integer.valueOf(i);
        list.add(numValueOf);
        this.activeNodeIds.add(numValueOf);
        this.parentByNodeId.put(numValueOf, num);
    }

    private final ModalSelection findActiveModal() {
        List<ModalCandidate> listH;
        ArrayList<ModalCandidate> arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = this.tree.getRoots().iterator();
        while (it.hasNext()) {
            findActiveModal$visit(linkedHashSet, this, arrayList, ((Number) it.next()).intValue(), 0, awnq.a);
        }
        boolean z = false;
        if (arrayList.isEmpty()) {
            return new ModalSelection(null, false);
        }
        Object objX = atqq.X(arrayList);
        int size = arrayList.size() - 1;
        if (size <= 0) {
            listH = awno.a;
        } else if (size == 1) {
            listH = atqq.H(atqq.ab(arrayList));
        } else {
            ArrayList arrayList2 = new ArrayList(size);
            int size2 = arrayList.size();
            for (int i = 1; i < size2; i++) {
                arrayList2.add(arrayList.get(i));
            }
            listH = arrayList2;
        }
        for (ModalCandidate modalCandidate : listH) {
            if (modalCandidate.getDepth() > ((ModalCandidate) objX).getDepth()) {
                objX = modalCandidate;
            }
        }
        if (!arrayList.isEmpty()) {
            for (ModalCandidate modalCandidate2 : arrayList) {
                ModalCandidate modalCandidate3 = (ModalCandidate) objX;
                if (modalCandidate2.getNodeId() != modalCandidate3.getNodeId() && !modalCandidate3.getAncestorNodeIds().contains(Integer.valueOf(modalCandidate2.getNodeId())) && !modalCandidate2.getAncestorNodeIds().contains(Integer.valueOf(modalCandidate3.getNodeId()))) {
                    z = true;
                    break;
                }
            }
        }
        return new ModalSelection(Integer.valueOf(((ModalCandidate) objX).getNodeId()), z);
    }

    private static final void findActiveModal$visit(Set set, ProjectedSemanticHierarchyBuilder projectedSemanticHierarchyBuilder, List list, int i, int i2, Set set2) {
        SemanticNodeData semanticNodeDataNodeById;
        Integer numValueOf = Integer.valueOf(i);
        if (!set.add(numValueOf) || (semanticNodeDataNodeById = projectedSemanticHierarchyBuilder.tree.nodeById(i)) == null) {
            return;
        }
        SemanticRole semanticRoleFromValue = SemanticRole.Companion.fromValue(semanticNodeDataNodeById.getRole());
        SemanticNodeState semanticNodeStateMapSemanticNodeState = SemanticNodeClassificationKt.mapSemanticNodeState(semanticNodeDataNodeById.getTraitFlags(), semanticNodeDataNodeById.getStateFlags());
        SemanticNodeProjection semanticNodeProjectionClassifySemanticNodeProjection = SemanticNodeClassificationKt.classifySemanticNodeProjection(semanticRoleFromValue, SemanticNodeClassificationKt.mapSemanticNodeContent(semanticRoleFromValue, semanticNodeDataNodeById.getLabel(), semanticNodeDataNodeById.getValue(), semanticNodeDataNodeById.getHint(), semanticNodeStateMapSemanticNodeState), semanticNodeStateMapSemanticNodeState, semanticNodeDataNodeById.getMinX(), semanticNodeDataNodeById.getMinY(), semanticNodeDataNodeById.getMaxX(), semanticNodeDataNodeById.getMaxY());
        if (semanticNodeProjectionClassifySemanticNodeProjection != SemanticNodeProjection.PruneSubtree) {
            if (semanticNodeProjectionClassifySemanticNodeProjection == SemanticNodeProjection.ExportContainer && SemanticNodeClassificationKt.isActiveModal(semanticRoleFromValue, semanticNodeStateMapSemanticNodeState)) {
                list.add(new ModalCandidate(i, i2, set2));
            }
            if (semanticNodeProjectionClassifySemanticNodeProjection != SemanticNodeProjection.ExportLeaf) {
                Set setS = atqq.s(set2, numValueOf);
                Iterator it = semanticNodeDataNodeById.getChildren().iterator();
                while (it.hasNext()) {
                    findActiveModal$visit(set, projectedSemanticHierarchyBuilder, list, ((Number) it.next()).intValue(), i2 + 1, setS);
                }
            }
        }
    }

    private final void projectNode(int i, Integer num, List list) {
        SemanticNodeData semanticNodeDataNodeById;
        if (!this.visitedNodeIds.add(Integer.valueOf(i)) || (semanticNodeDataNodeById = this.tree.nodeById(i)) == null) {
            return;
        }
        SemanticRole semanticRoleFromValue = SemanticRole.Companion.fromValue(semanticNodeDataNodeById.getRole());
        SemanticNodeState semanticNodeStateMapSemanticNodeState = SemanticNodeClassificationKt.mapSemanticNodeState(semanticNodeDataNodeById.getTraitFlags(), semanticNodeDataNodeById.getStateFlags());
        SemanticNodeProjection semanticNodeProjectionClassifySemanticNodeProjection = SemanticNodeClassificationKt.classifySemanticNodeProjection(semanticRoleFromValue, SemanticNodeClassificationKt.mapSemanticNodeContent(semanticRoleFromValue, semanticNodeDataNodeById.getLabel(), semanticNodeDataNodeById.getValue(), semanticNodeDataNodeById.getHint(), semanticNodeStateMapSemanticNodeState), semanticNodeStateMapSemanticNodeState, semanticNodeDataNodeById.getMinX(), semanticNodeDataNodeById.getMinY(), semanticNodeDataNodeById.getMaxX(), semanticNodeDataNodeById.getMaxY());
        SemanticNodeProjection semanticNodeProjection = SemanticNodeProjection.PruneSubtree;
        int iOrdinal = semanticNodeProjectionClassifySemanticNodeProjection.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                Iterator it = semanticNodeDataNodeById.getChildren().iterator();
                while (it.hasNext()) {
                    projectNode(((Number) it.next()).intValue(), num, list);
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new awmj();
                }
                exportNode(i, num, list);
            } else {
                exportNode(i, num, list);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = semanticNodeDataNodeById.getChildren().iterator();
                while (it2.hasNext()) {
                    projectNode(((Number) it2.next()).intValue(), Integer.valueOf(i), arrayList);
                }
                this.childrenByNodeId.put(Integer.valueOf(i), ProjectedSemanticHierarchyKt.toUnmodifiableList(arrayList));
            }
        }
    }

    public final ProjectedSemanticHierarchyData build() {
        final ModalSelection modalSelectionFindActiveModal = findActiveModal();
        if (modalSelectionFindActiveModal.getHasDisjointCandidates()) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0() { // from class: app.rive.semantics.ProjectedSemanticHierarchyBuilder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProjectedSemanticHierarchyBuilder.build$lambda$0(modalSelectionFindActiveModal);
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        Integer nodeId = modalSelectionFindActiveModal.getNodeId();
        if (nodeId != null) {
            projectNode(nodeId.intValue(), null, arrayList);
        } else {
            Iterator it = this.tree.getRoots().iterator();
            while (it.hasNext()) {
                projectNode(((Number) it.next()).intValue(), null, arrayList);
            }
        }
        return new ProjectedSemanticHierarchyData(ProjectedSemanticHierarchyKt.toUnmodifiableList(arrayList), ProjectedSemanticHierarchyKt.toUnmodifiableList(this.activeNodeIds), nodeId, modalSelectionFindActiveModal.getHasDisjointCandidates(), atqq.D(this.parentByNodeId), atqq.D(this.childrenByNodeId));
    }

    /* JADX INFO: compiled from: PG */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
