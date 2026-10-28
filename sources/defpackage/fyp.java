package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fyp implements fyy {
    private final boolean a;

    public fyp(Boolean bool) {
        this.a = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.fyy
    public final fyy d() {
        return new fyp(Boolean.valueOf(this.a));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof fyp) && this.a == ((fyp) obj).a;
        }
        return true;
    }

    @Override // defpackage.fyy
    public final Boolean g() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.fyy
    public final fyy gR(String str, kwq kwqVar, List list) {
        if ("toString".equals(str)) {
            return new fzb(i());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", i(), str));
    }

    @Override // defpackage.fyy
    public final Double h() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    @Override // defpackage.fyy
    public final String i() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.fyy
    public final Iterator l() {
        return null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
