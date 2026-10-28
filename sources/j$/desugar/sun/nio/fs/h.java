package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.w;
import j$.time.ZoneId;
import j$.util.DesugarCollections;
import j$.util.Spliterator;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.IntPredicate$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.g3;
import j$.util.stream.i2;
import j$.util.stream.j4;
import j$.util.stream.l4;
import j$.util.stream.u4;
import j$.util.stream.x3;
import j$.util.stream.y3;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements w, DirectoryStream.Filter, FileAttribute, j$.time.temporal.k, IntPredicate, Predicate, Supplier, Function, BinaryOperator, LongFunction, Consumer, BooleanSupplier, g3 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ h(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 11:
                ((g3) obj2).accept(obj);
                break;
            case 12:
                ((ArrayList) obj2).add(obj);
                break;
            default:
                ((x3) obj2).accept(obj);
                break;
        }
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 11:
                break;
            case 12:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Supplier supplier = (Supplier) this.b;
        Set set = Collectors.a;
        return supplier.get();
    }

    @Override // j$.nio.file.w
    public final boolean c(Path path) {
        return ((Pattern) this.b).matcher(path.toString()).matches();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return false;
    }

    public final void f(y3 y3Var) {
        ((EnumMap) this.b).put(y3Var, 1);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                return ((j$.util.stream.a) obj).p(0);
            default:
                return (Spliterator) obj;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 14:
                j4 j4Var = (j4) obj;
                return j4Var.d.tryAdvance(j4Var.e);
            case 15:
                l4 l4Var = (l4) obj;
                return l4Var.d.tryAdvance(l4Var.e);
            default:
                u4 u4Var = (u4) obj;
                return u4Var.d.tryAdvance(u4Var.e);
        }
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int h(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    public final /* synthetic */ IntPredicate negate() {
        return IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        return false;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public final Object value() {
        return DesugarCollections.unmodifiableSet((HashSet) this.b);
    }

    @Override // j$.time.temporal.k
    public final Object w(o oVar) {
        return oVar == j$.time.temporal.o.a ? (ZoneId) this.b : j$.time.temporal.o.c(this, oVar);
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public final /* synthetic */ Predicate mo841negate() {
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        ((j$.util.stream.n) this.b).accept(obj, obj2);
        return obj;
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        return !((IntPredicate) this.b).test(i);
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        return i2.u(j, (IntFunction) this.b);
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen, reason: collision with other method in class */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(long j) {
        i2.i();
        throw null;
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(int i) {
        i2.d();
        throw null;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* JADX INFO: renamed from: accept, reason: collision with other method in class */
    public final boolean mo839accept(Object obj) {
        return ((DirectoryStream.Filter) this.b).mo839accept(j$.nio.file.a.g(obj));
    }

    @Override // j$.util.stream.g3
    public final void p(long j) {
    }

    @Override // j$.util.stream.g3
    public final void end() {
    }
}
