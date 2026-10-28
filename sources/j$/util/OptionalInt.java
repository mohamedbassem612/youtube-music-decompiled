package j$.util;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class OptionalInt {
    public static final OptionalInt c = new OptionalInt();
    public final boolean a;
    public final int b;

    public OptionalInt() {
        this.a = false;
        this.b = 0;
    }

    public static OptionalInt empty() {
        return c;
    }

    public static OptionalInt of(int i) {
        return new OptionalInt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OptionalInt) {
            OptionalInt optionalInt = (OptionalInt) obj;
            boolean z = optionalInt.a;
            boolean z2 = this.a;
            if (z2 && z) {
                if (this.b == optionalInt.b) {
                    return true;
                }
            } else if (z2 == z) {
                return true;
            }
        }
        return false;
    }

    public int getAsInt() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public void ifPresent(IntConsumer intConsumer) {
        if (this.a) {
            intConsumer.accept(this.b);
        }
    }

    public boolean isEmpty() {
        return !this.a;
    }

    public boolean isPresent() {
        return this.a;
    }

    public int orElse(int i) {
        return this.a ? this.b : i;
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.b + "]";
    }

    public OptionalInt(int i) {
        this.a = true;
        this.b = i;
    }
}
