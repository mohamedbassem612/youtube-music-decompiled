package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class byn extends agja {
    private final Map a;

    public byn(Map map) {
        this.a = map;
    }

    @Override // defpackage.agja, defpackage.agjb
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.agja
    protected final Map b() {
        return this.a;
    }

    @Override // defpackage.agja, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // defpackage.agja, java.util.Map
    public final boolean containsValue(Object obj) {
        agny agnyVar = new agny(entrySet().iterator());
        if (obj == null) {
            while (agnyVar.hasNext()) {
                if (agnyVar.next() == null) {
                    return true;
                }
            }
        } else {
            while (agnyVar.hasNext()) {
                if (obj.equals(agnyVar.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.agja, java.util.Map
    public final Set entrySet() {
        return ahng.ai(super.entrySet(), new bym(1));
    }

    @Override // defpackage.agja, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && aguu.q(this, obj);
    }

    @Override // defpackage.agja, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // defpackage.agja, java.util.Map
    public final int hashCode() {
        return ahng.ab(entrySet());
    }

    @Override // defpackage.agja, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // defpackage.agja, java.util.Map
    public final Set keySet() {
        return ahng.ai(super.keySet(), new bym(0));
    }

    @Override // defpackage.agja, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
