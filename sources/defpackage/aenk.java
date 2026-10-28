package defpackage;

import j$.util.Map;
import java.util.LinkedHashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aenk extends LinkedHashMap implements Map {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aenl a;

    public aenk(aenl aenlVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = aenlVar;
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return this.$cid != 0 ? Map.CC.$default$compute(this, obj, biFunction) : Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return this.$cid != 0 ? Map.CC.$default$computeIfAbsent(this, obj, function) : Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return this.$cid != 0 ? Map.CC.$default$computeIfPresent(this, obj, biFunction) : Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (this.$cid != 0) {
            if (obj instanceof String) {
                return super.containsKey((String) obj);
            }
            return false;
        }
        if (obj instanceof String) {
            return super.containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (this.$cid != 0) {
            if (obj instanceof aenr) {
                return super.containsValue((aenr) obj);
            }
            return false;
        }
        if (obj instanceof Boolean) {
            return super.containsValue((Boolean) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        if (this.$cid != 0) {
            Map.CC.$default$forEach(this, biConsumer);
        } else {
            Map.CC.$default$forEach(this, biConsumer);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (this.$cid != 0) {
            if (obj instanceof String) {
                return (aenr) super.get((String) obj);
            }
            return null;
        }
        if (obj instanceof String) {
            return (Boolean) super.get((String) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map, j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return obj instanceof String ? (aenr) Map.CC.$default$getOrDefault(this, (String) obj, (aenr) obj2) : obj2;
        }
        return obj instanceof String ? (Boolean) Map.CC.$default$getOrDefault(this, (String) obj, (Boolean) obj2) : obj2;
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return this.$cid != 0 ? Map.CC.$default$merge(this, obj, obj2, biFunction) : Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return this.$cid != 0 ? Map.CC.$default$putIfAbsent(this, obj, obj2) : Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        if (this.$cid != 0) {
            if ((obj instanceof String) && (obj2 instanceof aenr)) {
                return Map.CC.$default$remove(this, (String) obj, (aenr) obj2);
            }
            return false;
        }
        if ((obj instanceof String) && (obj2 instanceof Boolean)) {
            return Map.CC.$default$remove(this, (String) obj, (Boolean) obj2);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry entry) {
        if (this.$cid != 0) {
            entry.getClass();
            if (super.size() > this.a.c) {
                return true;
            }
        } else {
            entry.getClass();
            if (super.size() > this.a.c) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return this.$cid != 0 ? Map.CC.$default$replace(this, obj, obj2) : Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        if (this.$cid != 0) {
            Map.CC.$default$replaceAll(this, biFunction);
        } else {
            Map.CC.$default$replaceAll(this, biFunction);
        }
    }

    public aenk(aenl aenlVar, int i) {
        this.$cid = i;
        this.a = aenlVar;
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return this.$cid != 0 ? Map.CC.$default$replace(this, obj, obj2, obj3) : Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        if (this.$cid != 0) {
            if (obj instanceof String) {
                return (aenr) super.remove((String) obj);
            }
            return null;
        }
        if (obj instanceof String) {
            return (Boolean) super.remove((String) obj);
        }
        return null;
    }
}
