package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahoq implements ahol, ahqg {
    private static final ahrs c = new ahpm(1);
    private final List f;
    private final ahov h;
    private final ahon i;
    public final Map a = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private Set g = new HashSet();
    public final AtomicReference b = new AtomicReference();

    public ahoq(Executor executor, Iterable iterable, Collection collection, ahon ahonVar) {
        ahov ahovVar = new ahov(executor);
        this.h = ahovVar;
        this.i = ahonVar;
        ArrayList<ahok> arrayList = new ArrayList();
        int i = 2;
        int i2 = 0;
        ahoj ahojVar = new ahoj(ahov.class, ahqy.class, ahqx.class);
        ahojVar.b = new ahoi(ahovVar, i2);
        arrayList.add(ahojVar.a());
        ahoj ahojVar2 = new ahoj(ahqg.class, new Class[0]);
        ahojVar2.b = new ahoi(this, i2);
        arrayList.add(ahojVar2.a());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ahok ahokVar = (ahok) it.next();
            if (ahokVar != null) {
                arrayList.add(ahokVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ahrs) it3.next()).a();
                    if (componentRegistrar != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (ahok ahokVar2 : componentRegistrar.getComponents()) {
                            String str = ahokVar2.a;
                            if (str != null) {
                                ahokVar2 = new ahok(str, ahokVar2.b, ahokVar2.c, ahokVar2.d, ahokVar2.e, new ahoi(ahokVar2, 4), ahokVar2.g);
                            }
                            arrayList4.add(ahokVar2);
                        }
                        arrayList.addAll(arrayList4);
                        it3.remove();
                    }
                } catch (ahow e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((ahok) it4.next()).b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.g.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.g.add(obj.toString());
                    }
                }
            }
            if (this.a.isEmpty()) {
                ahno.c(arrayList);
            } else {
                ArrayList arrayList5 = new ArrayList(this.a.keySet());
                arrayList5.addAll(arrayList);
                ahno.c(arrayList5);
            }
            for (ahok ahokVar3 : arrayList) {
                this.a.put(ahokVar3, new ahox(new ahoo(this, ahokVar3, i2)));
            }
            ArrayList arrayList6 = new ArrayList();
            for (ahok ahokVar4 : arrayList) {
                if (ahokVar4.b()) {
                    ahrs ahrsVar = (ahrs) this.a.get(ahokVar4);
                    for (ahpd ahpdVar : ahokVar4.b) {
                        boolean zContainsKey = this.d.containsKey(ahpdVar);
                        Map map = this.d;
                        if (zContainsKey) {
                            arrayList6.add(new agrq((ahrs) map.get(ahpdVar), ahrsVar, i));
                        } else {
                            map.put(ahpdVar, ahrsVar);
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            ArrayList arrayList7 = new ArrayList();
            HashMap map2 = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                ahok ahokVar5 = (ahok) entry.getKey();
                if (!ahokVar5.b()) {
                    ahrs ahrsVar2 = (ahrs) entry.getValue();
                    for (ahpd ahpdVar2 : ahokVar5.b) {
                        if (!map2.containsKey(ahpdVar2)) {
                            map2.put(ahpdVar2, new HashSet());
                        }
                        ((Set) map2.get(ahpdVar2)).add(ahrsVar2);
                    }
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean zContainsKey2 = this.e.containsKey(entry2.getKey());
                Map map3 = this.e;
                if (zContainsKey2) {
                    ahoy ahoyVar = (ahoy) map3.get(entry2.getKey());
                    Iterator it5 = ((Set) entry2.getValue()).iterator();
                    while (it5.hasNext()) {
                        arrayList7.add(new agrq((Object) ahoyVar, (ahrs) it5.next(), 3));
                    }
                } else {
                    map3.put((ahpd) entry2.getKey(), new ahoy((Set) ((Collection) entry2.getValue())));
                }
            }
            arrayList3.addAll(arrayList7);
            for (ahok ahokVar6 : this.a.keySet()) {
                for (ahos ahosVar : ahokVar6.c) {
                    if (ahosVar.b() && !this.e.containsKey(ahosVar.a)) {
                        this.e.put(ahosVar.a, new ahoy(Collections.EMPTY_SET));
                    } else if (this.d.containsKey(ahosVar.a)) {
                        continue;
                    } else {
                        if (ahosVar.b == 1) {
                            throw new ahoz(String.format("Unsatisfied dependency for component %s: %s", ahokVar6, ahosVar.a));
                        }
                        if (!ahosVar.b()) {
                            this.d.put(ahosVar.a, new ahpb(ahpb.a));
                        }
                    }
                }
            }
        }
        int size = arrayList3.size();
        while (i2 < size) {
            ((Runnable) arrayList3.get(i2)).run();
            i2++;
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            g(this.a, bool.booleanValue());
        }
    }

    @Override // defpackage.ahol
    public final synchronized ahrs a(ahpd ahpdVar) {
        try {
            if (ahpdVar == null) {
                throw new NullPointerException("Null interface requested.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ahrs) this.d.get(ahpdVar);
    }

    @Override // defpackage.ahol
    public final /* synthetic */ ahrs b(Class cls) {
        return a(new ahpd(ahpc.class, cls));
    }

    @Override // defpackage.ahol
    public final synchronized ahrs c(ahpd ahpdVar) {
        ahrs ahrsVar;
        ahrsVar = (ahoy) this.e.get(ahpdVar);
        if (ahrsVar == null) {
            ahrsVar = c;
        }
        return ahrsVar;
    }

    @Override // defpackage.ahol
    public final /* synthetic */ Object d(ahpd ahpdVar) {
        return ahno.b(this, ahpdVar);
    }

    @Override // defpackage.ahol
    public final /* synthetic */ Object e(Class cls) {
        return ahno.b(this, new ahpd(ahpc.class, cls));
    }

    @Override // defpackage.ahol
    public final /* synthetic */ Set f(ahpd ahpdVar) {
        throw null;
    }

    public final void g(Map map, boolean z) {
        Queue<ahqv> queue;
        for (Map.Entry entry : map.entrySet()) {
            ahok ahokVar = (ahok) entry.getKey();
            ahrs ahrsVar = (ahrs) entry.getValue();
            int i = ahokVar.d;
            if (i == 1 || (i == 2 && z)) {
                ahrsVar.a();
            }
        }
        ahov ahovVar = this.h;
        synchronized (ahovVar) {
            queue = ahovVar.a;
            if (queue != null) {
                ahovVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (ahqv ahqvVar : queue) {
                ahqvVar.getClass();
                synchronized (ahovVar) {
                    Queue queue2 = ahovVar.a;
                    if (queue2 != null) {
                        queue2.add(ahqvVar);
                    } else {
                        for (Map.Entry entry2 : ahovVar.c()) {
                            ((Executor) entry2.getValue()).execute(new afjc(entry2, 9));
                        }
                    }
                }
            }
        }
    }
}
