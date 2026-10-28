package app.rive.semantics;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import defpackage.a;
import defpackage.awmy;
import defpackage.awog;
import defpackage.awqg;
import defpackage.awqk;
import defpackage.awqx;
import defpackage.awrb;
import defpackage.awrc;
import defpackage.bbz;
import defpackage.bcc;
import defpackage.bdl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveExploreByTouchHelper extends bdl {
    public static final int $stable = 8;
    private final AccessibilityManager accessibilityManager;
    private String activeModalPaneTitle;
    private bcc filteringProvider;
    private ProjectedSemanticHierarchy hierarchy;
    private final View host;
    private final AndroidVirtualNodeIdRegistry idRegistry;
    private boolean isInstalled;
    private boolean isPopulatingProjectedSnapshot;
    private boolean isSynchronizingWithTree;
    private final awqg onAccessibilityFocusChanged;
    private final awqk onSemanticAction;
    private final Function0 onSemanticFocusCleared;
    private final awqg onSemanticFocusRequested;
    private Integer preModalAccessibilityFocusedNodeId;
    private Map projectedNodeSnapshots;
    private int projectedTreeVersion;
    private final SemanticTreeModel tree;

    /* JADX INFO: renamed from: app.rive.semantics.RiveExploreByTouchHelper$getAccessibilityNodeProvider$3, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class AnonymousClass3 extends awrb implements Function0 {
        public AnonymousClass3(Object obj) {
            super(0, obj, RiveExploreByTouchHelper.class, "getAccessibilityFocusedVirtualViewId", "getAccessibilityFocusedVirtualViewId()I", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(((RiveExploreByTouchHelper) this.receiver).getAccessibilityFocusedVirtualViewId());
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.RiveExploreByTouchHelper$getAccessibilityNodeProvider$4, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class AnonymousClass4 extends awrb implements Function0 {
        public AnonymousClass4(Object obj) {
            super(0, obj, RiveExploreByTouchHelper.class, "getKeyboardFocusedVirtualViewId", "getKeyboardFocusedVirtualViewId()I", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(((RiveExploreByTouchHelper) this.receiver).getKeyboardFocusedVirtualViewId());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveExploreByTouchHelper(View view, SemanticTreeModel semanticTreeModel, awqk awqkVar, awqg awqgVar, awqg awqgVar2, Function0 function0, AndroidVirtualNodeIdRegistry androidVirtualNodeIdRegistry) {
        super(view);
        view.getClass();
        semanticTreeModel.getClass();
        awqkVar.getClass();
        awqgVar.getClass();
        awqgVar2.getClass();
        function0.getClass();
        androidVirtualNodeIdRegistry.getClass();
        this.host = view;
        this.tree = semanticTreeModel;
        this.onSemanticAction = awqkVar;
        this.onAccessibilityFocusChanged = awqgVar;
        this.onSemanticFocusRequested = awqgVar2;
        this.onSemanticFocusCleared = function0;
        this.idRegistry = androidVirtualNodeIdRegistry;
        ProjectedSemanticHierarchy projectedSemanticHierarchyFrom = ProjectedSemanticHierarchy.Companion.from(semanticTreeModel);
        this.hierarchy = projectedSemanticHierarchyFrom;
        this.projectedNodeSnapshots = snapshotProjectedNodes(projectedSemanticHierarchyFrom);
        this.projectedTreeVersion = semanticTreeModel.getVersion();
        this.activeModalPaneTitle = modalPaneTitle(this.hierarchy.getActiveModalNodeId());
        Object systemService = view.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.accessibilityManager = (AccessibilityManager) systemService;
        androidVirtualNodeIdRegistry.reconcile(this.hierarchy);
    }

    static final awmy _init_$lambda$0(SemanticAccessibilityFocusTransition semanticAccessibilityFocusTransition) {
        semanticAccessibilityFocusTransition.getClass();
        return awmy.a;
    }

    private final void announceModalAppeared(int i) {
        sendModalPaneEvent(Integer.valueOf(i), 16);
    }

    private final void announceModalDisappeared() {
        sendModalPaneEvent(this.hierarchy.getActiveModalNodeId(), 32);
    }

    private final void announceModalTitleChanged(int i) {
        sendModalPaneEvent(Integer.valueOf(i), 8);
    }

    private final boolean canRequestSemanticFocus(int i) {
        SemanticNodeData semanticNodeDataNodeById = this.tree.nodeById(i);
        if (semanticNodeDataNodeById == null) {
            return false;
        }
        return SemanticNodeClassificationKt.mapSemanticNodeActions(SemanticRole.Companion.fromValue(semanticNodeDataNodeById.getRole()), SemanticNodeClassificationKt.mapSemanticNodeState(semanticNodeDataNodeById.getTraitFlags(), semanticNodeDataNodeById.getStateFlags())).getCanRequestFocus();
    }

    private final boolean clearAccessibilityFocus() {
        int accessibilityFocusedVirtualViewId = getAccessibilityFocusedVirtualViewId();
        if (accessibilityFocusedVirtualViewId == Integer.MIN_VALUE) {
            return false;
        }
        boolean z = this.isPopulatingProjectedSnapshot;
        this.isPopulatingProjectedSnapshot = true;
        try {
            return getAccessibilityNodeProvider(this.host).performAction(accessibilityFocusedVirtualViewId, SemanticState.Focused, null);
        } finally {
            this.isPopulatingProjectedSnapshot = z;
        }
    }

    static final boolean getAccessibilityNodeProvider$lambda$1(RiveExploreByTouchHelper riveExploreByTouchHelper, int i) {
        return riveExploreByTouchHelper.idRegistry.riveNodeIdForVirtualNode(i) != null;
    }

    static final awmy getAccessibilityNodeProvider$lambda$2(RiveExploreByTouchHelper riveExploreByTouchHelper, int i, int i2) {
        riveExploreByTouchHelper.handleAccessibilityFocusChanged(i, i2);
        return awmy.a;
    }

    private final void handleAccessibilityFocusChanged(int i, int i2) {
        SemanticAccessibilityFocusTransition semanticAccessibilityFocusTransition = new SemanticAccessibilityFocusTransition(toActiveRiveNodeIdOrNull(i), toActiveRiveNodeIdOrNull(i2));
        Integer currentNodeId = semanticAccessibilityFocusTransition.getCurrentNodeId();
        if (currentNodeId == null) {
            this.onSemanticFocusCleared.invoke();
        } else if (canRequestSemanticFocus(currentNodeId.intValue())) {
            this.onSemanticFocusRequested.invoke(currentNodeId);
        }
        this.onAccessibilityFocusChanged.invoke(semanticAccessibilityFocusTransition);
    }

    private final Integer modalFocusTarget(ProjectedSemanticHierarchy projectedSemanticHierarchy) {
        Integer activeModalNodeId = projectedSemanticHierarchy.getActiveModalNodeId();
        Object obj = null;
        if (activeModalNodeId == null) {
            return null;
        }
        int iIntValue = activeModalNodeId.intValue();
        for (Object obj2 : projectedSemanticHierarchy.getActiveNodeIds()) {
            if (((Number) obj2).intValue() != iIntValue) {
                obj = obj2;
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    private final String modalPaneTitle(Integer num) {
        SemanticNodeData semanticNodeDataNodeById;
        if (num == null || (semanticNodeDataNodeById = this.tree.nodeById(num.intValue())) == null) {
            return null;
        }
        String label = semanticNodeDataNodeById.getLabel();
        if (label.length() <= 0) {
            label = null;
        }
        if (label == null) {
            label = semanticNodeDataNodeById.getValue();
            if (label.length() <= 0) {
                label = null;
            }
            if (label == null) {
                String hint = semanticNodeDataNodeById.getHint();
                if (hint.length() > 0) {
                    return hint;
                }
                return null;
            }
        }
        return label;
    }

    private final SemanticNodeData nodeDataForPopulation(int i) {
        SemanticNodeData semanticNodeDataNodeById = this.tree.nodeById(i);
        if (semanticNodeDataNodeById != null) {
            return semanticNodeDataNodeById;
        }
        if (this.isPopulatingProjectedSnapshot) {
            return (SemanticNodeData) this.projectedNodeSnapshots.get(Integer.valueOf(i));
        }
        return null;
    }

    private final boolean requestAccessibilityFocus(Integer num) {
        Integer numVirtualIdForRiveNode;
        if (num == null || (numVirtualIdForRiveNode = this.idRegistry.virtualIdForRiveNode(num.intValue())) == null) {
            return false;
        }
        return getAccessibilityNodeProvider(this.host).performAction(numVirtualIdForRiveNode.intValue(), 64, null);
    }

    private final void sendModalPaneEvent(Integer num, int i) {
        ViewParent parent;
        if (!this.accessibilityManager.isEnabled() || (parent = this.host.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(32);
        accessibilityEventObtain.setContentChangeTypes(i);
        accessibilityEventObtain.setClassName(this.host.getClass().getName());
        accessibilityEventObtain.setPackageName(this.host.getContext().getPackageName());
        accessibilityEventObtain.setEnabled(this.host.isEnabled());
        String str = this.activeModalPaneTitle;
        if (str != null) {
            accessibilityEventObtain.getText().add(str);
            accessibilityEventObtain.setContentDescription(str);
        }
        Integer numVirtualIdForRiveNode = num != null ? this.idRegistry.virtualIdForRiveNode(num.intValue()) : null;
        View view = this.host;
        if (numVirtualIdForRiveNode == null) {
            accessibilityEventObtain.setSource(view);
        } else {
            accessibilityEventObtain.setSource(view, numVirtualIdForRiveNode.intValue());
        }
        parent.requestSendAccessibilityEvent(this.host, accessibilityEventObtain);
    }

    private final Map snapshotProjectedNodes(ProjectedSemanticHierarchy projectedSemanticHierarchy) {
        awog awogVar = new awog(8);
        Iterator it = projectedSemanticHierarchy.getActiveNodeIds().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            SemanticNodeData semanticNodeDataNodeById = this.tree.nodeById(iIntValue);
            if (semanticNodeDataNodeById != null) {
            }
        }
        return awogVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void synchronizeBeforeAccessibilityOperation() {
        if (synchronizeWithTree()) {
            invalidateRoot();
        }
    }

    private final void synchronizeChangedTree() {
        Integer numModalFocusTarget;
        ProjectedSemanticHierarchy projectedSemanticHierarchyFrom = ProjectedSemanticHierarchy.Companion.from(this.tree);
        Map mapSnapshotProjectedNodes = snapshotProjectedNodes(projectedSemanticHierarchyFrom);
        Integer activeModalNodeId = this.hierarchy.getActiveModalNodeId();
        Integer activeModalNodeId2 = projectedSemanticHierarchyFrom.getActiveModalNodeId();
        String strModalPaneTitle = modalPaneTitle(activeModalNodeId2);
        Integer numRiveNodeIdForVirtualNode = this.idRegistry.riveNodeIdForVirtualNode(getAccessibilityFocusedVirtualViewId());
        boolean zC = awrc.c(activeModalNodeId, activeModalNodeId2);
        if (activeModalNodeId == null && activeModalNodeId2 != null) {
            this.preModalAccessibilityFocusedNodeId = numRiveNodeIdForVirtualNode;
        }
        if (activeModalNodeId2 != null) {
            activeModalNodeId2.intValue();
            numModalFocusTarget = modalFocusTarget(projectedSemanticHierarchyFrom);
        } else {
            numModalFocusTarget = null;
        }
        boolean z = false;
        if (!zC && numModalFocusTarget != null) {
            boolean z2 = this.isPopulatingProjectedSnapshot;
            this.isPopulatingProjectedSnapshot = true;
            try {
                boolean zRequestAccessibilityFocus = requestAccessibilityFocus(numModalFocusTarget);
                this.isPopulatingProjectedSnapshot = z2;
                z = zRequestAccessibilityFocus;
            } catch (Throwable th) {
                this.isPopulatingProjectedSnapshot = z2;
                throw th;
            }
        }
        if (numRiveNodeIdForVirtualNode != null && !projectedSemanticHierarchyFrom.contains(numRiveNodeIdForVirtualNode.intValue()) && !z) {
            clearAccessibilityFocus();
        }
        if (!zC && activeModalNodeId != null) {
            announceModalDisappeared();
        }
        this.idRegistry.reconcile(projectedSemanticHierarchyFrom);
        this.hierarchy = projectedSemanticHierarchyFrom;
        this.projectedNodeSnapshots = mapSnapshotProjectedNodes;
        this.projectedTreeVersion = this.tree.getVersion();
        boolean zC2 = awrc.c(this.activeModalPaneTitle, strModalPaneTitle);
        this.activeModalPaneTitle = strModalPaneTitle;
        if (activeModalNodeId2 != null && !zC) {
            if (!z) {
                requestAccessibilityFocus(numModalFocusTarget);
            }
            announceModalAppeared(activeModalNodeId2.intValue());
        } else {
            if (activeModalNodeId == null || activeModalNodeId2 != null) {
                if (activeModalNodeId2 == null || zC2) {
                    return;
                }
                announceModalTitleChanged(activeModalNodeId2.intValue());
                return;
            }
            Integer num = this.preModalAccessibilityFocusedNodeId;
            this.preModalAccessibilityFocusedNodeId = null;
            if (num == null || !this.hierarchy.contains(num.intValue())) {
                return;
            }
            requestAccessibilityFocus(num);
        }
    }

    private final Integer toActiveRiveNodeIdOrNull(int i) {
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        return this.idRegistry.riveNodeIdForVirtualNode(i);
    }

    private final Object withProjectedSnapshotPopulation(Function0 function0) {
        boolean z = this.isPopulatingProjectedSnapshot;
        this.isPopulatingProjectedSnapshot = true;
        try {
            return function0.invoke();
        } finally {
            this.isPopulatingProjectedSnapshot = z;
        }
    }

    public final void dispose() {
        if (this.isInstalled && this.hierarchy.getActiveModalNodeId() != null) {
            announceModalDisappeared();
        }
        this.isInstalled = false;
        clearAccessibilityFocus();
        this.preModalAccessibilityFocusedNodeId = null;
        this.idRegistry.clear();
    }

    @Override // defpackage.bdl, defpackage.axx
    public bcc getAccessibilityNodeProvider(View view) {
        view.getClass();
        bcc activeSemanticNodeProvider = this.filteringProvider;
        if (activeSemanticNodeProvider == null) {
            bcc accessibilityNodeProvider = super.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider == null) {
                throw new IllegalStateException("Required value was null.");
            }
            activeSemanticNodeProvider = new ActiveSemanticNodeProvider(accessibilityNodeProvider, new awqg() { // from class: app.rive.semantics.RiveExploreByTouchHelper$$ExternalSyntheticLambda0
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(RiveExploreByTouchHelper.getAccessibilityNodeProvider$lambda$1(this.f$0, ((Integer) obj).intValue()));
                }
            }, new AnonymousClass3(this), new AnonymousClass4(this), new AnonymousClass5(this), new awqk() { // from class: app.rive.semantics.RiveExploreByTouchHelper$$ExternalSyntheticLambda1
                @Override // defpackage.awqk
                public final Object invoke(Object obj, Object obj2) {
                    return RiveExploreByTouchHelper.getAccessibilityNodeProvider$lambda$2(this.f$0, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.filteringProvider = activeSemanticNodeProvider;
        }
        return activeSemanticNodeProvider;
    }

    @Override // defpackage.bdl
    protected int getVirtualViewAt(float f, float f2) {
        Integer numHitTest;
        Integer numVirtualIdForRiveNode;
        synchronizeBeforeAccessibilityOperation();
        if (f < 0.0f || f2 < 0.0f || f >= this.host.getWidth() || f2 >= this.host.getHeight() || (numHitTest = ProjectedSemanticHierarchyHitTestKt.hitTest(this.hierarchy, this.tree, f, f2)) == null || (numVirtualIdForRiveNode = this.idRegistry.virtualIdForRiveNode(numHitTest.intValue())) == null) {
            return Integer.MIN_VALUE;
        }
        return numVirtualIdForRiveNode.intValue();
    }

    @Override // defpackage.bdl
    protected void getVisibleVirtualViews(List list) {
        list.getClass();
        Iterator it = this.hierarchy.getRoots().iterator();
        while (it.hasNext()) {
            Integer numVirtualIdForRiveNode = this.idRegistry.virtualIdForRiveNode(((Number) it.next()).intValue());
            if (numVirtualIdForRiveNode != null) {
                list.add(Integer.valueOf(numVirtualIdForRiveNode.intValue()));
            }
        }
    }

    public final void onInstalled() {
        if (this.isInstalled) {
            return;
        }
        this.isInstalled = true;
        Integer activeModalNodeId = this.hierarchy.getActiveModalNodeId();
        if (activeModalNodeId != null) {
            announceModalAppeared(activeModalNodeId.intValue());
            requestAccessibilityFocus(modalFocusTarget(this.hierarchy));
        }
    }

    @Override // defpackage.bdl
    protected boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        SemanticNodeData semanticNodeDataNodeById;
        Object next;
        Integer numRiveNodeIdForVirtualNode = this.idRegistry.riveNodeIdForVirtualNode(i);
        if (numRiveNodeIdForVirtualNode != null && (semanticNodeDataNodeById = this.tree.nodeById(numRiveNodeIdForVirtualNode.intValue())) != null) {
            Iterator it = SemanticNodeClassificationKt.mapSemanticNodeActions(SemanticRole.Companion.fromValue(semanticNodeDataNodeById.getRole()), SemanticNodeClassificationKt.mapSemanticNodeState(semanticNodeDataNodeById.getTraitFlags(), semanticNodeDataNodeById.getStateFlags())).getSemanticActions().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (AndroidSemanticNodeMappingKt.toAndroidAccessibilityActionId((SemanticActionType) next) != i2);
            SemanticActionType semanticActionType = (SemanticActionType) next;
            if (semanticActionType != null) {
                this.onSemanticAction.invoke(numRiveNodeIdForVirtualNode, semanticActionType);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bdl
    protected void onPopulateNodeForVirtualView(int i, bbz bbzVar) {
        bbzVar.getClass();
        Integer numRiveNodeIdForVirtualNode = this.idRegistry.riveNodeIdForVirtualNode(i);
        if (numRiveNodeIdForVirtualNode == null) {
            throw new IllegalStateException(a.bR(i, "Cannot populate inactive virtual accessibility node "));
        }
        int iIntValue = numRiveNodeIdForVirtualNode.intValue();
        SemanticNodeData semanticNodeDataNodeDataForPopulation = nodeDataForPopulation(iIntValue);
        if (semanticNodeDataNodeDataForPopulation == null) {
            throw new IllegalStateException(a.bR(iIntValue, "Cannot populate missing Rive semantic node "));
        }
        SemanticRole semanticRoleFromValue = SemanticRole.Companion.fromValue(semanticNodeDataNodeDataForPopulation.getRole());
        SemanticNodeState semanticNodeStateMapSemanticNodeState = SemanticNodeClassificationKt.mapSemanticNodeState(semanticNodeDataNodeDataForPopulation.getTraitFlags(), semanticNodeDataNodeDataForPopulation.getStateFlags());
        SemanticNodeContent semanticNodeContentMapSemanticNodeContent = SemanticNodeClassificationKt.mapSemanticNodeContent(semanticRoleFromValue, semanticNodeDataNodeDataForPopulation.getLabel(), semanticNodeDataNodeDataForPopulation.getValue(), semanticNodeDataNodeDataForPopulation.getHint(), semanticNodeStateMapSemanticNodeState);
        if (!AndroidSemanticNodeHierarchyKt.applySemanticNodeHierarchy(bbzVar, this.host, iIntValue, this.hierarchy, this.idRegistry)) {
            throw new IllegalStateException(a.bR(iIntValue, "Cannot populate inconsistent Rive semantic node "));
        }
        AndroidSemanticNodeMappingKt.applySemanticNodeRole(bbzVar, semanticRoleFromValue);
        AndroidSemanticNodeMappingKt.applySemanticNodeHeading(bbzVar, semanticNodeDataNodeDataForPopulation.getHeadingLevel());
        AndroidSemanticNodeMappingKt.applySemanticNodeState(bbzVar, semanticNodeStateMapSemanticNodeState);
        AndroidSemanticNodeMappingKt.applySemanticNodeActions(bbzVar, SemanticNodeClassificationKt.mapSemanticNodeActions(semanticRoleFromValue, semanticNodeStateMapSemanticNodeState));
        AndroidSemanticNodeMappingKt.applySemanticNodeContent(bbzVar, semanticNodeContentMapSemanticNodeContent);
        Integer activeModalNodeId = this.hierarchy.getActiveModalNodeId();
        if (activeModalNodeId != null && iIntValue == activeModalNodeId.intValue()) {
            bbzVar.I(this.activeModalPaneTitle);
        }
        Integer numParentOf = this.hierarchy.parentOf(iIntValue);
        AndroidSemanticNodeBoundsKt.applySemanticNodeBounds(bbzVar, AndroidSemanticNodeBoundsKt.toAndroidAccessibilityBounds(semanticNodeDataNodeDataForPopulation, numParentOf != null ? nodeDataForPopulation(numParentOf.intValue()) : null));
        if (bbzVar.g() == null && bbzVar.f() == null) {
            bbzVar.z("");
        }
        bbzVar.C(false);
    }

    public final boolean synchronizeWithTree() {
        if (this.isSynchronizingWithTree || this.projectedTreeVersion == this.tree.getVersion()) {
            return false;
        }
        this.isSynchronizingWithTree = true;
        try {
            synchronizeChangedTree();
            return true;
        } finally {
            this.isSynchronizingWithTree = false;
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.RiveExploreByTouchHelper$getAccessibilityNodeProvider$5, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class AnonymousClass5 extends awrb implements Function0 {
        public AnonymousClass5(Object obj) {
            super(0, obj, RiveExploreByTouchHelper.class, "synchronizeBeforeAccessibilityOperation", "synchronizeBeforeAccessibilityOperation()V", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m598invoke() {
            ((RiveExploreByTouchHelper) this.receiver).synchronizeBeforeAccessibilityOperation();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m598invoke();
            return awmy.a;
        }
    }

    public /* synthetic */ RiveExploreByTouchHelper(View view, SemanticTreeModel semanticTreeModel, awqk awqkVar, awqg awqgVar, awqg awqgVar2, Function0 function0, AndroidVirtualNodeIdRegistry androidVirtualNodeIdRegistry, int i, awqx awqxVar) {
        this(view, semanticTreeModel, awqkVar, (i & 8) != 0 ? new awqg() { // from class: app.rive.semantics.RiveExploreByTouchHelper$$ExternalSyntheticLambda2
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return RiveExploreByTouchHelper._init_$lambda$0((SemanticAccessibilityFocusTransition) obj);
            }
        } : awqgVar, (i & 16) != 0 ? new awqg() { // from class: app.rive.semantics.RiveExploreByTouchHelper$$ExternalSyntheticLambda3
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return awmy.a;
            }
        } : awqgVar2, (i & 32) != 0 ? new Function0() { // from class: app.rive.semantics.RiveExploreByTouchHelper$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return awmy.a;
            }
        } : function0, (i & 64) != 0 ? new AndroidVirtualNodeIdRegistry(null, 1, null) : androidVirtualNodeIdRegistry);
    }
}
