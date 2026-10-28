package defpackage;

import android.app.Application;
import android.view.ViewParent;
import com.facebook.litho.ComponentTree;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gev {
    public final Object a;
    public final Object b;

    public gev(byte[] bArr) {
        this.b = new AtomicInteger(1);
        this.a = new HashMap();
    }

    public static void a(Map map, Map map2, String str) {
        List list = (List) map2.get(str);
        List list2 = (List) map.remove(str);
        if (list != null && list2 != null) {
            list2.removeAll(list);
        }
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        map.put(str, list2);
    }

    public static void j(String str, aero aeroVar, Map map) {
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(aeroVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized List l(String str) {
        List arrayList;
        ?? r0 = this.a;
        if (!r0.contains(str)) {
            r0.add(str);
        }
        ?? r1 = this.b;
        arrayList = (List) r1.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            r1.put(str, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    public final gev b() {
        gev gevVar = new gev();
        ?? r1 = this.a;
        if (!r1.isEmpty()) {
            for (String str : r1.keySet()) {
                gevVar.a.put(str, new ArrayList((Collection) r1.get(str)));
            }
            ?? r7 = this.b;
            for (String str2 : r7.keySet()) {
                gevVar.b.put(str2, new ArrayList((Collection) r7.get(str2)));
            }
        }
        return gevVar;
    }

    public final synchronized int c(String str) {
        Object obj = this.a;
        Integer num = (Integer) ((HashMap) obj).get(str);
        if (num != null) {
            return num.intValue();
        }
        int andIncrement = ((AtomicInteger) this.b).getAndIncrement();
        ((HashMap) obj).put(str, Integer.valueOf(andIncrement));
        return andIncrement;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    public final void d(fjw fjwVar) {
        ComponentTree componentTree = (ComponentTree) this.a;
        if (componentTree.k) {
            for (ViewParent parent = fjwVar.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof duc) {
                    duc ducVar = (duc) parent;
                    fiy fiyVar = new fiy(componentTree, ducVar);
                    try {
                        ducVar.e(fiyVar);
                    } catch (ConcurrentModificationException unused) {
                        dhr dhrVar = new dhr((Object) ducVar, (Object) fiyVar, 17, (char[]) null);
                        int i = bac.a;
                        ducVar.postOnAnimation(dhrVar);
                    }
                    this.b.add(fiyVar);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List e(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<jij> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (jij jijVar : list) {
                    if (jijVar.t(cls, cls2)) {
                        arrayList.add(jijVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List f(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<jij> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (jij jijVar : list) {
                    if (jijVar.t(cls, cls2)) {
                        Object obj = jijVar.c;
                        if (arrayList.contains(obj)) {
                            continue;
                        } else {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void g(String str, eua euaVar, Class cls, Class cls2) {
        l(str).add(new jij(cls, cls2, euaVar, (byte[]) null));
    }

    public final synchronized void h(String str, eua euaVar, Class cls, Class cls2) {
        l(str).add(0, new jij(cls, cls2, euaVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    @tcc
    void handleDeletePlaylistEvent(gsd gsdVar) {
        abvk abvkVar = (abvk) this.a;
        if (gsdVar.a.equals(abvkVar.m())) {
            if (abvkVar.X()) {
                abvkVar.aq(false, 31);
            }
            ((WatchWhileLayout) this.b.io()).z();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final synchronized void i(List list) {
        ?? r1 = this.a;
        ArrayList arrayList = new ArrayList((Collection) r1);
        r1.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r1.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                r1.add(str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final agcl k() {
        ?? Io = this.b.io();
        Io.getClass();
        avmb avmbVar = (avmb) this.a.io();
        avmbVar.getClass();
        return new agcl((aunn) Io, (Object) avmbVar);
    }

    public gev(aunn aunnVar, aunn aunnVar2) {
        this.a = aunnVar;
        this.b = aunnVar2;
    }

    public gev(Class cls, eth ethVar) {
        this.b = cls;
        this.a = ethVar;
    }

    public gev(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public gev(awmd awmdVar, awmd awmdVar2) {
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public gev(Set set, gfw gfwVar) {
        set.getClass();
        this.b = set;
        gfwVar.getClass();
        this.a = gfwVar;
    }

    public gev(jnm jnmVar) {
        this.a = jnmVar;
        this.b = (flw) jnmVar.b;
    }

    public gev(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new AtomicReference();
        this.a = new afv();
    }

    public gev() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public gev(aunn aunnVar, tqj tqjVar) {
        aunnVar.getClass();
        tqjVar.getClass();
        this.b = aunnVar;
        this.a = tqjVar;
    }

    public gev(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
        this.b = new HashMap();
    }

    public gev(Application application, aunn aunnVar) {
        aunnVar.getClass();
        this.b = application;
        this.a = aunnVar;
    }

    public gev(ComponentTree componentTree) {
        this.a = componentTree;
        this.b = new ArrayList(2);
    }

    public gev(aero aeroVar, aero aeroVar2) {
        this.b = aeroVar;
        this.a = aeroVar2;
    }
}
