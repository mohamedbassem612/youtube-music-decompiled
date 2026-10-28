package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class afv extends aha implements Map, j$.util.Map {
    afp a;
    afr b;
    aft c;

    public afv(aha ahaVar) {
        super(0);
        if (ahaVar != null) {
            i(ahaVar);
        }
    }

    public final boolean a(Collection collection) {
        int i = this.d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(d(i2))) {
                e(i2);
            }
        }
        return i != this.d;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        afp afpVar = this.a;
        if (afpVar != null) {
            return afpVar;
        }
        afp afpVar2 = new afp(this);
        this.a = afpVar2;
        return afpVar2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Set keySet() {
        afr afrVar = this.b;
        if (afrVar != null) {
            return afrVar;
        }
        afr afrVar2 = new afr(this);
        this.b = afrVar2;
        return afrVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        h(this.d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        aft aftVar = this.c;
        if (aftVar != null) {
            return aftVar;
        }
        aft aftVar2 = new aft(this);
        this.c = aftVar2;
        return aftVar2;
    }

    public afv() {
        super(0);
    }
}
