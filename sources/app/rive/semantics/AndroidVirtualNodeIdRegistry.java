package app.rive.semantics;

import defpackage.atqq;
import defpackage.awqx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidVirtualNodeIdRegistry {
    public static final int $stable = 8;
    private final AndroidVirtualNodeIdAllocator allocator;
    private final Map riveIdsByVirtualId;
    private final Map virtualIdsByRiveId;

    public AndroidVirtualNodeIdRegistry(AndroidVirtualNodeIdAllocator androidVirtualNodeIdAllocator) {
        androidVirtualNodeIdAllocator.getClass();
        this.allocator = androidVirtualNodeIdAllocator;
        this.virtualIdsByRiveId = new LinkedHashMap();
        this.riveIdsByVirtualId = new LinkedHashMap();
    }

    public final void clear() {
        this.virtualIdsByRiveId.clear();
        this.riveIdsByVirtualId.clear();
    }

    public final int getSize() {
        return this.virtualIdsByRiveId.size();
    }

    public final void reconcile(Collection collection) {
        collection.getClass();
        Map map = this.virtualIdsByRiveId;
        Set setAw = atqq.aw(collection);
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!setAw.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) this.virtualIdsByRiveId.remove(Integer.valueOf(((Number) it.next()).intValue()));
            if (num != null) {
                Map map2 = this.riveIdsByVirtualId;
                num.intValue();
                map2.remove(num);
            }
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            Map map3 = this.virtualIdsByRiveId;
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (!map3.containsKey(numValueOf)) {
                AndroidVirtualNodeIdAllocator androidVirtualNodeIdAllocator = this.allocator;
                Map map4 = this.virtualIdsByRiveId;
                Integer numValueOf2 = Integer.valueOf(androidVirtualNodeIdAllocator.allocate());
                map4.put(numValueOf, numValueOf2);
                this.riveIdsByVirtualId.put(numValueOf2, numValueOf);
            }
        }
    }

    public final Integer riveNodeIdForVirtualNode(int i) {
        return (Integer) this.riveIdsByVirtualId.get(Integer.valueOf(i));
    }

    public final Integer virtualIdForRiveNode(int i) {
        return (Integer) this.virtualIdsByRiveId.get(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidVirtualNodeIdRegistry() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AndroidVirtualNodeIdRegistry(AndroidVirtualNodeIdAllocator androidVirtualNodeIdAllocator, int i, awqx awqxVar) {
        this((i & 1) != 0 ? new AndroidVirtualNodeIdAllocator() : androidVirtualNodeIdAllocator);
    }

    public final void reconcile(ProjectedSemanticHierarchy projectedSemanticHierarchy) {
        projectedSemanticHierarchy.getClass();
        reconcile(projectedSemanticHierarchy.getActiveNodeIds());
    }
}
