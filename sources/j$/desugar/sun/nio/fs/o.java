package j$.desugar.sun.nio.fs;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.StringJoiner;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements Predicate, j$.time.temporal.l, Function, IntFunction, BiConsumer, BinaryOperator, Supplier {
    public final /* synthetic */ byte a;

    public /* synthetic */ o(byte b) {
        this.a = b;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                ((Collection) obj).add(obj2);
                break;
            case 17:
                ((List) obj).add(obj2);
                break;
            case 21:
                ((Set) obj).add(obj2);
                break;
            default:
                ((StringJoiner) obj).add((CharSequence) obj2);
                break;
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 15:
                break;
            case 18:
                break;
            case 22:
                break;
            case 25:
                break;
            default:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 15:
                Collection collection = (Collection) obj;
                Set set = Collectors.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 18:
                List list = (List) obj;
                Set set2 = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 22:
                List list2 = (List) obj;
                Set set3 = Collectors.a;
                list2.addAll((List) obj2);
                return list2;
            case 25:
                StringJoiner stringJoiner = (StringJoiner) obj;
                StringJoiner stringJoiner2 = (StringJoiner) obj2;
                stringJoiner.getClass();
                stringJoiner2.getClass();
                if (stringJoiner2.d == null) {
                    return stringJoiner;
                }
                stringJoiner2.a();
                return stringJoiner.add(stringJoiner2.d[0]);
            default:
                Set set4 = (Set) obj;
                Set set5 = (Set) obj2;
                Set set6 = Collectors.a;
                if (set4.size() < set5.size()) {
                    set5.addAll(set4);
                    return set5;
                }
                set4.addAll(set5);
                return set4;
        }
    }

    public final Object c(j$.time.temporal.k kVar) {
        ZoneId zoneId;
        byte b = this.a;
        o oVar = j$.time.temporal.o.a;
        switch (b) {
            case 1:
                return ZonedDateTime.r(kVar);
            case 2:
                zoneId = (ZoneId) kVar.w(oVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                break;
            case 3:
            default:
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_DAY;
                if (kVar.d(aVar)) {
                    return LocalTime.H(kVar.C(aVar));
                }
                return null;
            case 4:
                return (ZoneId) kVar.w(oVar);
            case 5:
                return (j$.time.chrono.a) kVar.w(j$.time.temporal.o.b);
            case 6:
                return (TemporalUnit) kVar.w(j$.time.temporal.o.c);
            case 7:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (kVar.d(aVar2)) {
                    return ZoneOffset.L(kVar.h(aVar2));
                }
                return null;
            case 8:
                zoneId = (ZoneId) kVar.w(oVar);
                if (zoneId == null) {
                    zoneId = (ZoneId) kVar.w(j$.time.temporal.o.d);
                }
                break;
            case 9:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (kVar.d(aVar3)) {
                    return LocalDate.ofEpochDay(kVar.C(aVar3));
                }
                return null;
        }
        return zoneId;
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 12:
                break;
            case 19:
                break;
            case 23:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 16:
                return new ArrayList();
            case 20:
                return new HashSet();
            case 28:
                return new HashMap();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo841negate() {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporal.a(temporal.l(aVar).d, aVar);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return true ^ ((String) obj).isEmpty();
            default:
                j$.com.android.tools.r8.a aVar = ConcurrentLinkedQueue.a;
                return true;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 4:
                return "ZoneId";
            case 5:
                return "Chronology";
            case 6:
                return "Precision";
            case 7:
                return "ZoneOffset";
            case 8:
                return "Zone";
            case 9:
                return "LocalDate";
            case 10:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 14:
                break;
            case 17:
                break;
            case 21:
                break;
            default:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        switch (this.a) {
            case 12:
                break;
            case 19:
                break;
            case 23:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 12:
                return obj;
            case 19:
                Set set = Collectors.a;
                return g.C(((List) obj).toArray());
            case 23:
                Set set2 = Collectors.a;
                return obj;
            default:
                return ((StringJoiner) obj).toString();
        }
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        return new Object[i];
    }
}
