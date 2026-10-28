package defpackage;

import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mof extends HashMap {
    final /* synthetic */ mog a;

    public mof(mog mogVar) {
        this.a = mogVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final moe get(Object obj) {
        mog mogVar;
        moh mohVar;
        moe moeVar;
        if (FlowLayoutManager.e && (mohVar = (mogVar = this.a).d) != null && mohVar.e == 1 && (obj instanceof Integer)) {
            Integer num = (Integer) obj;
            int iIntValue = (num.intValue() - mogVar.a) - (FlowLayoutManager.m ? mogVar.g : 0);
            if (iIntValue >= 0) {
                List list = mogVar.e;
                if (iIntValue < list.size() && (moeVar = (moe) list.get(iIntValue)) != null && moeVar.a() == num.intValue()) {
                    return moeVar;
                }
            }
        }
        return (moe) super.get(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final moe remove(Object obj) {
        moh mohVar;
        if (FlowLayoutManager.j && FlowLayoutManager.e && (mohVar = this.a.d) != null && mohVar.e == 1) {
            return null;
        }
        return (moe) super.remove(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        mog mogVar;
        moh mohVar;
        moe moeVar;
        if (FlowLayoutManager.e && (mohVar = (mogVar = this.a).d) != null && mohVar.e == 1 && (obj instanceof Integer)) {
            Integer num = (Integer) obj;
            int iIntValue = (num.intValue() - mogVar.a) - (FlowLayoutManager.m ? mogVar.g : 0);
            if (iIntValue >= 0) {
                List list = mogVar.e;
                if (iIntValue < list.size() && (moeVar = (moe) list.get(iIntValue)) != null && moeVar.a() == num.intValue()) {
                    return true;
                }
            }
        }
        return super.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        moh mohVar;
        Integer num = (Integer) obj;
        moe moeVar = (moe) obj2;
        if (FlowLayoutManager.j && FlowLayoutManager.e && (mohVar = this.a.d) != null && mohVar.e == 1) {
            return null;
        }
        return (moe) super.put(num, moeVar);
    }
}
