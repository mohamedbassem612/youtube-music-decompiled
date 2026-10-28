package app.rive.semantics;

import android.view.View;
import defpackage.atqq;
import defpackage.bbz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidSemanticNodeHierarchyKt {
    public static final boolean applySemanticNodeHierarchy(bbz bbzVar, View view, int i, ProjectedSemanticHierarchy projectedSemanticHierarchy, AndroidVirtualNodeIdRegistry androidVirtualNodeIdRegistry) {
        Integer numVirtualIdForRiveNode;
        bbzVar.getClass();
        view.getClass();
        projectedSemanticHierarchy.getClass();
        androidVirtualNodeIdRegistry.getClass();
        if (!projectedSemanticHierarchy.contains(i) || androidVirtualNodeIdRegistry.virtualIdForRiveNode(i) == null) {
            return false;
        }
        Integer numParentOf = projectedSemanticHierarchy.parentOf(i);
        if (numParentOf != null) {
            numVirtualIdForRiveNode = androidVirtualNodeIdRegistry.virtualIdForRiveNode(numParentOf.intValue());
            if (numVirtualIdForRiveNode == null) {
                return false;
            }
            numVirtualIdForRiveNode.intValue();
        } else {
            numVirtualIdForRiveNode = null;
        }
        List listChildrenOf = projectedSemanticHierarchy.childrenOf(i);
        ArrayList arrayList = new ArrayList(atqq.N(listChildrenOf, 10));
        Iterator it = listChildrenOf.iterator();
        while (it.hasNext()) {
            Integer numVirtualIdForRiveNode2 = androidVirtualNodeIdRegistry.virtualIdForRiveNode(((Number) it.next()).intValue());
            if (numVirtualIdForRiveNode2 == null) {
                return false;
            }
            numVirtualIdForRiveNode2.intValue();
            arrayList.add(numVirtualIdForRiveNode2);
        }
        if (numVirtualIdForRiveNode != null) {
            bbzVar.J(view, numVirtualIdForRiveNode.intValue());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bbzVar.l(view, ((Number) it2.next()).intValue());
        }
        return true;
    }
}
