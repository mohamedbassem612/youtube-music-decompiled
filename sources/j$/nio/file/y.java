package j$.nio.file;

import j$.time.format.TextStyle;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collectors;
import j$.util.stream.a4;
import j$.util.stream.a5;
import j$.util.stream.h4;
import j$.util.stream.z3;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class y implements e0, BiConsumer, BiFunction, Consumer, Supplier, a5 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public y(Map map) {
        this.a = (byte) 1;
        this.b = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l = (Long) entry2.getKey();
                j$.time.format.u uVar = j$.time.format.a.b;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, j$.time.format.a.b);
            map2.put((TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, j$.time.format.a.b);
        this.c = map2;
    }

    @Override // j$.util.stream.a5
    public final Object a(j$.util.stream.a aVar, Spliterator spliterator) {
        j$.util.stream.f0 f0Var = (j$.util.stream.f0) ((Supplier) this.c).get();
        aVar.s(spliterator, f0Var);
        return Boolean.valueOf(f0Var.b);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 2:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                break;
            case 3:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                break;
            case 4:
            case 5:
            default:
                BiConsumer biConsumer = (BiConsumer) obj4;
                j$.util.stream.k kVar = (j$.util.stream.k) obj;
                Set set = Collectors.a;
                biConsumer.accept(((Predicate) obj3).test(obj2) ? kVar.a : kVar.b, obj2);
                break;
            case 6:
                Set set2 = Collectors.a;
                ((BiConsumer) obj4).accept(obj, ((Function) obj3).apply(obj2));
                break;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 2:
                break;
            case 3:
                break;
            case 4:
            case 5:
            default:
                break;
            case 6:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((Function) this.c).apply(((BiFunction) this.b).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.a5
    public final Object b(j$.util.stream.a aVar, Spliterator spliterator) {
        return (Boolean) new j$.util.stream.h0(this, aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.a5
    public final int c() {
        return z3.u | z3.r;
    }

    public final String d(long j, TextStyle textStyle) {
        Map map = (Map) ((Map) this.b).get(textStyle);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        byte b = this.a;
        Object obj = this.c;
        j$.util.stream.g0 g0Var = (j$.util.stream.g0) this.b;
        switch (b) {
            case 9:
                return new j$.util.stream.e0(g0Var, (IntPredicate) obj);
            default:
                return new j$.util.stream.d0(g0Var, (Predicate) obj);
        }
    }

    @Override // j$.nio.file.e0
    public final String name() {
        return (String) this.b;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    @Override // j$.nio.file.e0
    public final Class type() {
        return (Class) this.c;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 5:
                break;
            case 8:
                break;
            case 12:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 5:
                ((Consumer) obj3).r(obj);
                ((Consumer) obj2).r(obj);
                break;
            case 8:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj == null) {
                    atomicBoolean.set(true);
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                }
                break;
            case 12:
                ((BiConsumer) obj3).accept(obj2, obj);
                break;
            default:
                Consumer consumer = (Consumer) obj2;
                if (((h4) obj3).b.putIfAbsent(obj != null ? obj : h4.d, Boolean.TRUE) == null) {
                    consumer.r(obj);
                }
                break;
        }
    }

    public y(a4 a4Var, j$.util.stream.g0 g0Var, Supplier supplier) {
        this.a = (byte) 11;
        this.b = g0Var;
        this.c = supplier;
    }

    public /* synthetic */ y(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
