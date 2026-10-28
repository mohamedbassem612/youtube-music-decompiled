package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejt {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;

    public ejt() {
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public final Bundle a(String str, Bundle bundle) {
        Object obj = this.c;
        return bundle != null ? (Bundle) ((HashMap) obj).put(str, bundle) : (Bundle) ((HashMap) obj).remove(str);
    }

    public final cc b(String str) {
        afjq afjqVar = (afjq) ((HashMap) this.b).get(str);
        if (afjqVar != null) {
            return (cc) afjqVar.d;
        }
        return null;
    }

    public final cc c(String str) {
        cc ccVarFindFragmentByWho;
        for (afjq afjqVar : ((HashMap) this.b).values()) {
            if (afjqVar != null && (ccVarFindFragmentByWho = ((cc) afjqVar.d).findFragmentByWho(str)) != null) {
                return ccVarFindFragmentByWho;
            }
        }
        return null;
    }

    public final List d() {
        ArrayList arrayList = new ArrayList();
        for (afjq afjqVar : ((HashMap) this.b).values()) {
            if (afjqVar != null) {
                arrayList.add(afjqVar);
            }
        }
        return arrayList;
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        for (afjq afjqVar : ((HashMap) this.b).values()) {
            if (afjqVar != null) {
                arrayList.add(afjqVar.d);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public final List f() {
        ArrayList arrayList;
        ?? r1 = this.a;
        if (((ArrayList) r1).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (r1) {
            arrayList = new ArrayList((Collection) r1);
        }
        return arrayList;
    }

    public final void g(cc ccVar) {
        Object obj = this.a;
        if (((ArrayList) obj).contains(ccVar)) {
            Objects.toString(ccVar);
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(ccVar)));
        }
        synchronized (obj) {
            ((ArrayList) obj).add(ccVar);
        }
        ccVar.mAdded = true;
    }

    public final void h() {
        ((HashMap) this.b).values().removeAll(Collections.singleton(null));
    }

    public final void i(cc ccVar) {
        Object obj = this.a;
        synchronized (obj) {
            ((ArrayList) obj).remove(ccVar);
        }
        ccVar.mAdded = false;
    }

    public final boolean j(String str) {
        return ((HashMap) this.b).get(str) != null;
    }

    public final afjq k(String str) {
        return (afjq) ((HashMap) this.b).get(str);
    }

    public final void l(afjq afjqVar) {
        Object obj = afjqVar.d;
        cc ccVar = (cc) obj;
        if (j(ccVar.mWho)) {
            return;
        }
        ((HashMap) this.b).put(ccVar.mWho, afjqVar);
        if (ccVar.mRetainInstanceChangedWhileDetached) {
            boolean z = ccVar.mRetainInstance;
            Object obj2 = this.d;
            if (z) {
                ((dg) obj2).a(ccVar);
            } else {
                ((dg) obj2).e(ccVar);
            }
            ccVar.mRetainInstanceChangedWhileDetached = false;
        }
        if (dd.aa(2)) {
            Objects.toString(obj);
        }
    }

    public final void m(afjq afjqVar) {
        Object obj = afjqVar.d;
        cc ccVar = (cc) obj;
        if (ccVar.mRetainInstance) {
            ((dg) this.d).e(ccVar);
        }
        HashMap map = (HashMap) this.b;
        if (map.get(ccVar.mWho) == afjqVar && ((afjq) map.put(ccVar.mWho, null)) != null && dd.aa(2)) {
            Objects.toString(obj);
        }
    }

    public ejt(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
