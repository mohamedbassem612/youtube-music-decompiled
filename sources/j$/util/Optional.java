package j$.util;

import defpackage.aaad;
import j$.util.stream.Stream;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class Optional<T> {
    public static final Optional b = new Optional();
    public final Object a;

    public Optional(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.a, ((Optional) obj).a);
        }
        return false;
    }

    public T get() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public void ifPresentOrElse(Consumer<? super T> consumer, Runnable runnable) {
        aaad aaadVar = (Object) this.a;
        if (aaadVar != null) {
            consumer.accept(aaadVar);
        } else {
            runnable.run();
        }
    }

    public boolean isEmpty() {
        return this.a == null;
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public Optional<T> or(Supplier<? extends Optional<? extends T>> supplier) {
        supplier.getClass();
        if (isPresent()) {
            return this;
        }
        Optional<? extends T> optional = supplier.get();
        optional.getClass();
        return optional;
    }

    public T orElse(T t) {
        T t2 = (T) this.a;
        return t2 != null ? t2 : t;
    }

    public T orElseThrow() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public Stream<T> stream() {
        return !isPresent() ? Stream.CC.empty() : Stream.CC.of(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }

    public Optional() {
        this.a = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws X {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw supplier.get();
    }
}
