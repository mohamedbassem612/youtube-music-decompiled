package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class adkt implements admh {
    public final List a;
    private final Map c;
    private final aeod d;

    public adkt(Map map, Map map2) {
        if (!map.isEmpty() && !map2.isEmpty()) {
            agpn agpnVar = (agpn) map;
            agpn agpnVar2 = (agpn) map2;
            agkz agkzVarKeySet = agpnVar.d < agpnVar2.d ? agpnVar.keySet() : agpnVar2.keySet();
            agkz agkzVarKeySet2 = agpnVar.d >= agpnVar2.d ? agpnVar.keySet() : agpnVar2.keySet();
            LinkedHashSet linkedHashSet = new LinkedHashSet(agkzVarKeySet);
            linkedHashSet.retainAll(agkzVarKeySet2);
            if (!linkedHashSet.isEmpty()) {
                throw new IllegalStateException("Duplicate keys are not allowed in the maps provided to BasePresenterViewPool.Repeated entries: ".concat(String.valueOf(linkedHashSet.toString())));
            }
        }
        this.d = new aeod(map, map2);
        agpn agpnVar3 = (agpn) map2;
        agpn agpnVar4 = (agpn) map;
        int iMax = Math.max(agpnVar3.d + agpnVar4.d, 16);
        this.c = new HashMap(iMax);
        this.a = new ArrayList(iMax);
        agqr it = ((agpl) agpnVar3.keySet()).iterator();
        while (it.hasNext()) {
            f((Class) it.next());
        }
        agqr it2 = ((agpl) agpnVar4.keySet()).iterator();
        while (it2.hasNext()) {
            f((Class) it2.next());
        }
    }

    private final void f(Class cls) {
        Map map = this.c;
        if (map.containsKey(cls)) {
            throw new IllegalStateException();
        }
        map.put(cls, Integer.valueOf(b()));
        this.a.add(cls);
    }

    @Override // defpackage.admh
    public final int a(Object obj) {
        if (obj != null) {
            Class<?> superclass = obj.getClass();
            if (superclass.getSimpleName().startsWith("AutoValue_")) {
                superclass = superclass.getSuperclass();
                superclass.getClass();
            }
            Integer num = (Integer) this.c.get(superclass);
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }

    @Override // defpackage.admh
    public final int b() {
        return this.a.size();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.admh
    public final adma c(int i, ViewGroup viewGroup) {
        if (i < 0 || i > b()) {
            return null;
        }
        adma admaVarG = g(i);
        if (admaVarG != null) {
            return admaVarG;
        }
        aeod aeodVar = this.d;
        Class cls = (Class) this.a.get(i);
        ?? r4 = aeodVar.c;
        if (r4.containsKey(cls)) {
            return (adma) ((awmd) r4.get(cls)).io();
        }
        adme admeVarC = aeodVar.c(cls);
        if (admeVarC != null) {
            return admeVarC.a(viewGroup);
        }
        return null;
    }

    @Override // defpackage.admh
    public final void d(Class cls, adme admeVar) {
        if (!this.c.containsKey(cls)) {
            f(cls);
            ((aha) this.d.a).put(cls, admeVar);
            return;
        }
        adme admeVarC = this.d.c(cls);
        boolean z = false;
        if (admeVarC != null && admeVarC.getClass().isInstance(admeVar)) {
            z = true;
        }
        ahno.V(z, "Attempted to register a presenter factory with the same model type twice.model=%s  registered=%s  new=%s", cls, admeVarC.getClass(), admeVar.getClass());
    }

    protected abstract adma g(int i);
}
