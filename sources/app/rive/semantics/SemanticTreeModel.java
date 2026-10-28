package app.rive.semantics;

import defpackage.atqq;
import defpackage.awno;
import defpackage.awrc;
import defpackage.awro;
import defpackage.axaf;
import defpackage.axat;
import defpackage.axaw;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticTreeModel {
    public static final int $stable = 8;
    private final axaf _versionFlow;
    private final Map nodesById = new LinkedHashMap();
    private List rootIds = awno.a;
    private final axat versionFlow;

    public SemanticTreeModel() {
        axaf axafVarA = axaw.a(0);
        this._versionFlow = axafVarA;
        this.versionFlow = axafVarA;
    }

    private final List childIds(int i) {
        if (i < 0) {
            return this.rootIds;
        }
        SemanticNodeData semanticNodeData = (SemanticNodeData) this.nodesById.get(Integer.valueOf(i));
        List children = semanticNodeData != null ? semanticNodeData.getChildren() : null;
        return children == null ? awno.a : children;
    }

    private final boolean detach(int i) {
        Map map = this.nodesById;
        Integer numValueOf = Integer.valueOf(i);
        SemanticNodeData semanticNodeData = (SemanticNodeData) map.get(numValueOf);
        if (semanticNodeData != null) {
            List listChildIds = childIds(semanticNodeData.getParentId());
            if (listChildIds.contains(numValueOf)) {
                int parentId = semanticNodeData.getParentId();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listChildIds) {
                    if (((Number) obj).intValue() != i) {
                        arrayList.add(obj);
                    }
                }
                replaceChildIds(parentId, arrayList);
                return true;
            }
        }
        return false;
    }

    private final List immutableIds(Collection collection) {
        if (collection.isEmpty()) {
            return awno.a;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(collection));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    private final boolean relocate(int i, int i2, int i3) {
        SemanticNodeData semanticNodeData = (SemanticNodeData) this.nodesById.get(Integer.valueOf(i));
        if (semanticNodeData == null) {
            return false;
        }
        int i4 = (i2 < 0 || !this.nodesById.containsKey(Integer.valueOf(i2))) ? -1 : i2;
        int parentId = semanticNodeData.getParentId();
        if (parentId != i4) {
            detach(i);
        }
        List listChildIds = childIds(i4);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listChildIds) {
            if (((Number) obj).intValue() != i) {
                arrayList.add(obj);
            }
        }
        List listAr = atqq.ar(arrayList);
        int iH = awro.h(i3, 0, listAr.size());
        Integer numValueOf = Integer.valueOf(i);
        listAr.add(iH, numValueOf);
        boolean zC = awrc.c(listChildIds, listAr);
        if (!zC) {
            replaceChildIds(i4, listAr);
        }
        if (parentId != i4) {
            Map map = this.nodesById;
            SemanticNodeData semanticNodeData2 = (SemanticNodeData) atqq.x(map, numValueOf);
            map.put(numValueOf, semanticNodeData2.copy((16381 & 1) != 0 ? semanticNodeData2.id : 0, (16381 & 2) != 0 ? semanticNodeData2.parentId : i4, (16381 & 4) != 0 ? semanticNodeData2.role : 0, (16381 & 8) != 0 ? semanticNodeData2.label : null, (16381 & 16) != 0 ? semanticNodeData2.value : null, (16381 & 32) != 0 ? semanticNodeData2.hint : null, (16381 & 64) != 0 ? semanticNodeData2.stateFlags : 0, (16381 & SemanticState.Focused) != 0 ? semanticNodeData2.traitFlags : 0, (16381 & SemanticState.Hidden) != 0 ? semanticNodeData2.headingLevel : 0, (16381 & SemanticState.LiveRegion) != 0 ? semanticNodeData2.minX : 0.0f, (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData2.minY : 0.0f, (16381 & SemanticState.Modal) != 0 ? semanticNodeData2.maxX : 0.0f, (16381 & SemanticState.Obscured) != 0 ? semanticNodeData2.maxY : 0.0f, (16381 & SemanticState.Multiline) != 0 ? semanticNodeData2.children : null));
        } else if (zC) {
            return false;
        }
        return true;
    }

    private final void removeSubtree(int i) {
        SemanticNodeData semanticNodeData = (SemanticNodeData) this.nodesById.get(Integer.valueOf(i));
        if (semanticNodeData != null) {
            Iterator it = semanticNodeData.getChildren().iterator();
            while (it.hasNext()) {
                removeSubtree(((Number) it.next()).intValue());
            }
            detach(i);
            this.nodesById.remove(Integer.valueOf(i));
        }
    }

    private final void replaceChildIds(int i, Collection collection) {
        List listImmutableIds = immutableIds(collection);
        if (i < 0) {
            this.rootIds = listImmutableIds;
            return;
        }
        Map map = this.nodesById;
        Integer numValueOf = Integer.valueOf(i);
        SemanticNodeData semanticNodeData = (SemanticNodeData) map.get(numValueOf);
        if (semanticNodeData != null) {
            this.nodesById.put(numValueOf, semanticNodeData.copy((16381 & 1) != 0 ? semanticNodeData.id : 0, (16381 & 2) != 0 ? semanticNodeData.parentId : 0, (16381 & 4) != 0 ? semanticNodeData.role : 0, (16381 & 8) != 0 ? semanticNodeData.label : null, (16381 & 16) != 0 ? semanticNodeData.value : null, (16381 & 32) != 0 ? semanticNodeData.hint : null, (16381 & 64) != 0 ? semanticNodeData.stateFlags : 0, (16381 & SemanticState.Focused) != 0 ? semanticNodeData.traitFlags : 0, (16381 & SemanticState.Hidden) != 0 ? semanticNodeData.headingLevel : 0, (16381 & SemanticState.LiveRegion) != 0 ? semanticNodeData.minX : 0.0f, (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData.minY : 0.0f, (16381 & SemanticState.Modal) != 0 ? semanticNodeData.maxX : 0.0f, (16381 & SemanticState.Obscured) != 0 ? semanticNodeData.maxY : 0.0f, (16381 & SemanticState.Multiline) != 0 ? semanticNodeData.children : listImmutableIds));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00f2  */
    public final void applyDiff$third_party_java_android_libs_rive_rive_android(SemanticsDiff semanticsDiff) {
        semanticsDiff.getClass();
        if (semanticsDiff.isEmpty()) {
            return;
        }
        boolean z = false;
        for (int i : semanticsDiff.getRemoved()) {
            if (this.nodesById.containsKey(Integer.valueOf(i))) {
                removeSubtree(i);
                z = true;
            }
        }
        for (SemanticsDiffNode semanticsDiffNode : semanticsDiff.getAdded()) {
            SemanticNodeData semanticNodeData = (SemanticNodeData) this.nodesById.get(Integer.valueOf(semanticsDiffNode.getId()));
            if (semanticNodeData == null) {
                this.nodesById.put(Integer.valueOf(semanticsDiffNode.getId()), new SemanticNodeData(semanticsDiffNode.getId(), -1, semanticsDiffNode.getRole(), semanticsDiffNode.getLabel(), semanticsDiffNode.getValue(), semanticsDiffNode.getHint(), semanticsDiffNode.getStateFlags(), semanticsDiffNode.getTraitFlags(), semanticsDiffNode.getHeadingLevel(), semanticsDiffNode.getMinX(), semanticsDiffNode.getMinY(), semanticsDiffNode.getMaxX(), semanticsDiffNode.getMaxY(), null, SemanticState.Multiline, null));
            } else {
                SemanticNodeData semanticNodeDataCopy = semanticNodeData.copy((16381 & 1) != 0 ? semanticNodeData.id : 0, (16381 & 2) != 0 ? semanticNodeData.parentId : 0, (16381 & 4) != 0 ? semanticNodeData.role : semanticsDiffNode.getRole(), (16381 & 8) != 0 ? semanticNodeData.label : semanticsDiffNode.getLabel(), (16381 & 16) != 0 ? semanticNodeData.value : semanticsDiffNode.getValue(), (16381 & 32) != 0 ? semanticNodeData.hint : semanticsDiffNode.getHint(), (16381 & 64) != 0 ? semanticNodeData.stateFlags : semanticsDiffNode.getStateFlags(), (16381 & SemanticState.Focused) != 0 ? semanticNodeData.traitFlags : semanticsDiffNode.getTraitFlags(), (16381 & SemanticState.Hidden) != 0 ? semanticNodeData.headingLevel : semanticsDiffNode.getHeadingLevel(), (16381 & SemanticState.LiveRegion) != 0 ? semanticNodeData.minX : semanticsDiffNode.getMinX(), (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData.minY : semanticsDiffNode.getMinY(), (16381 & SemanticState.Modal) != 0 ? semanticNodeData.maxX : semanticsDiffNode.getMaxX(), (16381 & SemanticState.Obscured) != 0 ? semanticNodeData.maxY : semanticsDiffNode.getMaxY(), (16381 & SemanticState.Multiline) != 0 ? semanticNodeData.children : null);
                if (!awrc.c(semanticNodeData, semanticNodeDataCopy)) {
                    this.nodesById.put(Integer.valueOf(semanticsDiffNode.getId()), semanticNodeDataCopy);
                }
                if (!relocate(semanticsDiffNode.getId(), semanticsDiffNode.getParentId(), semanticsDiffNode.getSiblingIndex()) || z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            z = true;
            if (relocate(semanticsDiffNode.getId(), semanticsDiffNode.getParentId(), semanticsDiffNode.getSiblingIndex())) {
                z = true;
            } else {
                z = true;
            }
        }
        for (SemanticsDiffNode semanticsDiffNode2 : semanticsDiff.getMoved()) {
            SemanticNodeData semanticNodeData2 = (SemanticNodeData) this.nodesById.get(Integer.valueOf(semanticsDiffNode2.getId()));
            if (semanticNodeData2 != null) {
                SemanticNodeData semanticNodeDataCopy2 = semanticNodeData2.copy((16381 & 1) != 0 ? semanticNodeData2.id : 0, (16381 & 2) != 0 ? semanticNodeData2.parentId : 0, (16381 & 4) != 0 ? semanticNodeData2.role : 0, (16381 & 8) != 0 ? semanticNodeData2.label : null, (16381 & 16) != 0 ? semanticNodeData2.value : null, (16381 & 32) != 0 ? semanticNodeData2.hint : null, (16381 & 64) != 0 ? semanticNodeData2.stateFlags : 0, (16381 & SemanticState.Focused) != 0 ? semanticNodeData2.traitFlags : 0, (16381 & SemanticState.Hidden) != 0 ? semanticNodeData2.headingLevel : 0, (16381 & SemanticState.LiveRegion) != 0 ? semanticNodeData2.minX : semanticsDiffNode2.getMinX(), (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData2.minY : semanticsDiffNode2.getMinY(), (16381 & SemanticState.Modal) != 0 ? semanticNodeData2.maxX : semanticsDiffNode2.getMaxX(), (16381 & SemanticState.Obscured) != 0 ? semanticNodeData2.maxY : semanticsDiffNode2.getMaxY(), (16381 & SemanticState.Multiline) != 0 ? semanticNodeData2.children : null);
                if (!awrc.c(semanticNodeData2, semanticNodeDataCopy2)) {
                    this.nodesById.put(Integer.valueOf(semanticsDiffNode2.getId()), semanticNodeDataCopy2);
                }
                relocate(semanticsDiffNode2.getId(), semanticsDiffNode2.getParentId(), semanticsDiffNode2.getSiblingIndex());
                z = true;
            }
        }
        for (SemanticsChildrenUpdate semanticsChildrenUpdate : semanticsDiff.getChildrenUpdated()) {
            if (semanticsChildrenUpdate.getParentId() < 0) {
                int[] childIds = semanticsChildrenUpdate.getChildIds();
                Collection arrayList = new ArrayList();
                for (int i2 : childIds) {
                    Map map = this.nodesById;
                    Integer numValueOf = Integer.valueOf(i2);
                    if (map.containsKey(numValueOf)) {
                        arrayList.add(numValueOf);
                    }
                }
                if (!awrc.c(this.rootIds, arrayList)) {
                    replaceChildIds(-1, arrayList);
                    Iterator it = this.rootIds.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        Map map2 = this.nodesById;
                        Integer numValueOf2 = Integer.valueOf(iIntValue);
                        SemanticNodeData semanticNodeData3 = (SemanticNodeData) map2.get(numValueOf2);
                        if (semanticNodeData3 != null && semanticNodeData3.getParentId() >= 0) {
                            this.nodesById.put(numValueOf2, semanticNodeData3.copy((16381 & 1) != 0 ? semanticNodeData3.id : 0, (16381 & 2) != 0 ? semanticNodeData3.parentId : -1, (16381 & 4) != 0 ? semanticNodeData3.role : 0, (16381 & 8) != 0 ? semanticNodeData3.label : null, (16381 & 16) != 0 ? semanticNodeData3.value : null, (16381 & 32) != 0 ? semanticNodeData3.hint : null, (16381 & 64) != 0 ? semanticNodeData3.stateFlags : 0, (16381 & SemanticState.Focused) != 0 ? semanticNodeData3.traitFlags : 0, (16381 & SemanticState.Hidden) != 0 ? semanticNodeData3.headingLevel : 0, (16381 & SemanticState.LiveRegion) != 0 ? semanticNodeData3.minX : 0.0f, (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData3.minY : 0.0f, (16381 & SemanticState.Modal) != 0 ? semanticNodeData3.maxX : 0.0f, (16381 & SemanticState.Obscured) != 0 ? semanticNodeData3.maxY : 0.0f, (16381 & SemanticState.Multiline) != 0 ? semanticNodeData3.children : null));
                        }
                    }
                    z = true;
                }
            } else {
                SemanticNodeData semanticNodeData4 = (SemanticNodeData) this.nodesById.get(Integer.valueOf(semanticsChildrenUpdate.getParentId()));
                if (semanticNodeData4 != null) {
                    int[] childIds2 = semanticsChildrenUpdate.getChildIds();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 : childIds2) {
                        Map map3 = this.nodesById;
                        Integer numValueOf3 = Integer.valueOf(i3);
                        if (map3.containsKey(numValueOf3)) {
                            arrayList2.add(numValueOf3);
                        }
                    }
                    if (!awrc.c(semanticNodeData4.getChildren(), arrayList2)) {
                        replaceChildIds(semanticsChildrenUpdate.getParentId(), arrayList2);
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            int iIntValue2 = ((Number) it2.next()).intValue();
                            Map map4 = this.nodesById;
                            Integer numValueOf4 = Integer.valueOf(iIntValue2);
                            SemanticNodeData semanticNodeData5 = (SemanticNodeData) map4.get(numValueOf4);
                            if (semanticNodeData5 != null && semanticNodeData5.getParentId() != semanticsChildrenUpdate.getParentId()) {
                                this.nodesById.put(numValueOf4, semanticNodeData5.copy((16381 & 1) != 0 ? semanticNodeData5.id : 0, (16381 & 2) != 0 ? semanticNodeData5.parentId : semanticsChildrenUpdate.getParentId(), (16381 & 4) != 0 ? semanticNodeData5.role : 0, (16381 & 8) != 0 ? semanticNodeData5.label : null, (16381 & 16) != 0 ? semanticNodeData5.value : null, (16381 & 32) != 0 ? semanticNodeData5.hint : null, (16381 & 64) != 0 ? semanticNodeData5.stateFlags : 0, (16381 & SemanticState.Focused) != 0 ? semanticNodeData5.traitFlags : 0, (16381 & SemanticState.Hidden) != 0 ? semanticNodeData5.headingLevel : 0, (16381 & SemanticState.LiveRegion) != 0 ? semanticNodeData5.minX : 0.0f, (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData5.minY : 0.0f, (16381 & SemanticState.Modal) != 0 ? semanticNodeData5.maxX : 0.0f, (16381 & SemanticState.Obscured) != 0 ? semanticNodeData5.maxY : 0.0f, (16381 & SemanticState.Multiline) != 0 ? semanticNodeData5.children : null));
                            }
                        }
                        z = true;
                    }
                }
            }
        }
        for (SemanticsDiffNode semanticsDiffNode3 : semanticsDiff.getUpdatedSemantic()) {
            SemanticNodeData semanticNodeData6 = (SemanticNodeData) this.nodesById.get(Integer.valueOf(semanticsDiffNode3.getId()));
            if (semanticNodeData6 != null && (semanticNodeData6.getRole() != semanticsDiffNode3.getRole() || !awrc.c(semanticNodeData6.getLabel(), semanticsDiffNode3.getLabel()) || !awrc.c(semanticNodeData6.getValue(), semanticsDiffNode3.getValue()) || !awrc.c(semanticNodeData6.getHint(), semanticsDiffNode3.getHint()) || semanticNodeData6.getStateFlags() != semanticsDiffNode3.getStateFlags() || semanticNodeData6.getTraitFlags() != semanticsDiffNode3.getTraitFlags() || semanticNodeData6.getHeadingLevel() != semanticsDiffNode3.getHeadingLevel())) {
                this.nodesById.put(Integer.valueOf(semanticsDiffNode3.getId()), semanticNodeData6.copy((16381 & 1) != 0 ? semanticNodeData6.id : 0, (16381 & 2) != 0 ? semanticNodeData6.parentId : 0, (16381 & 4) != 0 ? semanticNodeData6.role : semanticsDiffNode3.getRole(), (16381 & 8) != 0 ? semanticNodeData6.label : semanticsDiffNode3.getLabel(), (16381 & 16) != 0 ? semanticNodeData6.value : semanticsDiffNode3.getValue(), (16381 & 32) != 0 ? semanticNodeData6.hint : semanticsDiffNode3.getHint(), (16381 & 64) != 0 ? semanticNodeData6.stateFlags : semanticsDiffNode3.getStateFlags(), (16381 & SemanticState.Focused) != 0 ? semanticNodeData6.traitFlags : semanticsDiffNode3.getTraitFlags(), (16381 & SemanticState.Hidden) != 0 ? semanticNodeData6.headingLevel : semanticsDiffNode3.getHeadingLevel(), (16381 & SemanticState.LiveRegion) != 0 ? semanticNodeData6.minX : 0.0f, (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData6.minY : 0.0f, (16381 & SemanticState.Modal) != 0 ? semanticNodeData6.maxX : 0.0f, (16381 & SemanticState.Obscured) != 0 ? semanticNodeData6.maxY : 0.0f, (16381 & SemanticState.Multiline) != 0 ? semanticNodeData6.children : null));
                z = true;
            }
        }
        for (SemanticsBoundsUpdate semanticsBoundsUpdate : semanticsDiff.getUpdatedGeometry()) {
            SemanticNodeData semanticNodeData7 = (SemanticNodeData) this.nodesById.get(Integer.valueOf(semanticsBoundsUpdate.getId()));
            if (semanticNodeData7 != null && (semanticNodeData7.getMinX() != semanticsBoundsUpdate.getMinX() || semanticNodeData7.getMinY() != semanticsBoundsUpdate.getMinY() || semanticNodeData7.getMaxX() != semanticsBoundsUpdate.getMaxX() || semanticNodeData7.getMaxY() != semanticsBoundsUpdate.getMaxY())) {
                this.nodesById.put(Integer.valueOf(semanticsBoundsUpdate.getId()), semanticNodeData7.copy((16381 & 1) != 0 ? semanticNodeData7.id : 0, (16381 & 2) != 0 ? semanticNodeData7.parentId : 0, (16381 & 4) != 0 ? semanticNodeData7.role : 0, (16381 & 8) != 0 ? semanticNodeData7.label : null, (16381 & 16) != 0 ? semanticNodeData7.value : null, (16381 & 32) != 0 ? semanticNodeData7.hint : null, (16381 & 64) != 0 ? semanticNodeData7.stateFlags : 0, (16381 & SemanticState.Focused) != 0 ? semanticNodeData7.traitFlags : 0, (16381 & SemanticState.Hidden) != 0 ? semanticNodeData7.headingLevel : 0, (16381 & SemanticState.LiveRegion) != 0 ? semanticNodeData7.minX : semanticsBoundsUpdate.getMinX(), (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData7.minY : semanticsBoundsUpdate.getMinY(), (16381 & SemanticState.Modal) != 0 ? semanticNodeData7.maxX : semanticsBoundsUpdate.getMaxX(), (16381 & SemanticState.Obscured) != 0 ? semanticNodeData7.maxY : semanticsBoundsUpdate.getMaxY(), (16381 & SemanticState.Multiline) != 0 ? semanticNodeData7.children : null));
                z = true;
            }
        }
        if (z) {
            axaf axafVar = this._versionFlow;
            axafVar.d(Integer.valueOf(((Number) axafVar.c()).intValue() + 1));
        }
    }

    public final void clear$third_party_java_android_libs_rive_rive_android() {
        if (this.nodesById.isEmpty() && this.rootIds.isEmpty()) {
            return;
        }
        this.nodesById.clear();
        this.rootIds = awno.a;
        axaf axafVar = this._versionFlow;
        axafVar.d(Integer.valueOf(((Number) axafVar.c()).intValue() + 1));
    }

    public final int getNodeCount() {
        return this.nodesById.size();
    }

    public final List getRoots() {
        return this.rootIds;
    }

    public final int getVersion() {
        return ((Number) this._versionFlow.c()).intValue();
    }

    public final axat getVersionFlow() {
        return this.versionFlow;
    }

    public final SemanticNodeData nodeById(int i) {
        return (SemanticNodeData) this.nodesById.get(Integer.valueOf(i));
    }
}
