package j$.util.concurrent;

import j$.nio.file.y;
import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface ConcurrentMap<K, V> extends Map<K, V> {

    /* JADX INFO: renamed from: j$.util.concurrent.ConcurrentMap$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$compute(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
            Object objApply;
            while (true) {
                Object objPutIfAbsent = concurrentMap.get(obj);
                do {
                    objApply = biFunction.apply(obj, objPutIfAbsent);
                    if (objApply != null) {
                        if (objPutIfAbsent == null) {
                            objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                        } else if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                            return objApply;
                        }
                    } else if (objPutIfAbsent == null || concurrentMap.remove(obj, objPutIfAbsent)) {
                        return null;
                    }
                } while (objPutIfAbsent != null);
                return objApply;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfAbsent(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Function function) {
            Object objApply;
            function.getClass();
            Object obj2 = concurrentMap.get(obj);
            if (obj2 != null || (objApply = function.apply(obj)) == null) {
                return obj2;
            }
            Object objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
            return objPutIfAbsent == null ? objApply : objPutIfAbsent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfPresent(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
            biFunction.getClass();
            while (true) {
                Object obj2 = concurrentMap.get(obj);
                if (obj2 == null) {
                    return null;
                }
                Object objApply = biFunction.apply(obj, obj2);
                if (objApply == null) {
                    if (concurrentMap.remove(obj, obj2)) {
                        return objApply;
                    }
                } else if (concurrentMap.replace(obj, obj2, objApply)) {
                    return objApply;
                }
            }
        }

        public static void $default$forEach(java.util.concurrent.ConcurrentMap concurrentMap, BiConsumer biConsumer) {
            biConsumer.getClass();
            for (java.util.Map.Entry<K, V> entry : concurrentMap.entrySet()) {
                try {
                    biConsumer.accept(entry.getKey(), entry.getValue());
                } catch (IllegalStateException unused) {
                }
            }
        }

        public static Object $default$getOrDefault(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Object obj2) {
            Object obj3 = concurrentMap.get(obj);
            return obj3 != null ? obj3 : obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$merge(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Object obj2, BiFunction biFunction) {
            biFunction.getClass();
            obj2.getClass();
            while (true) {
                Object objPutIfAbsent = concurrentMap.get(obj);
                while (objPutIfAbsent == null) {
                    objPutIfAbsent = concurrentMap.putIfAbsent(obj, obj2);
                    if (objPutIfAbsent == null) {
                        return obj2;
                    }
                }
                Object objApply = biFunction.apply(objPutIfAbsent, obj2);
                if (objApply != null) {
                    if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                        return objApply;
                    }
                } else if (concurrentMap.remove(obj, objPutIfAbsent)) {
                    return null;
                }
            }
        }

        public static void $default$replaceAll(java.util.concurrent.ConcurrentMap concurrentMap, BiFunction biFunction) {
            biFunction.getClass();
            EL.forEach(concurrentMap, new y((Object) concurrentMap, (Object) biFunction, (byte) 2));
        }
    }

    /* JADX INFO: renamed from: j$.util.concurrent.ConcurrentMap$-EL, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public final /* synthetic */ class EL {
        public static /* synthetic */ Object compute(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
            return concurrentMap instanceof ConcurrentMap ? ((ConcurrentMap) concurrentMap).compute(obj, biFunction) : CC.$default$compute(concurrentMap, obj, biFunction);
        }

        public static /* synthetic */ Object computeIfAbsent(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Function function) {
            return concurrentMap instanceof ConcurrentMap ? ((ConcurrentMap) concurrentMap).computeIfAbsent(obj, function) : CC.$default$computeIfAbsent(concurrentMap, obj, function);
        }

        public static /* synthetic */ Object computeIfPresent(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
            return concurrentMap instanceof ConcurrentMap ? ((ConcurrentMap) concurrentMap).computeIfPresent(obj, biFunction) : CC.$default$computeIfPresent(concurrentMap, obj, biFunction);
        }

        public static /* synthetic */ void forEach(java.util.concurrent.ConcurrentMap concurrentMap, BiConsumer biConsumer) {
            if (concurrentMap instanceof ConcurrentMap) {
                ((ConcurrentMap) concurrentMap).forEach(biConsumer);
            } else {
                CC.$default$forEach(concurrentMap, biConsumer);
            }
        }

        public static /* synthetic */ Object getOrDefault(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Object obj2) {
            return concurrentMap instanceof ConcurrentMap ? ((ConcurrentMap) concurrentMap).getOrDefault(obj, obj2) : CC.$default$getOrDefault(concurrentMap, obj, obj2);
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V computeIfAbsent(K k, Function<? super K, ? extends V> function);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map, java.util.HashMap
    void forEach(BiConsumer<? super K, ? super V> biConsumer);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map, java.util.HashMap
    V getOrDefault(Object obj, V v);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map, java.util.HashMap
    void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction);
}
