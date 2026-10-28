package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fyq implements fyy {
    public final fyy a;
    public final String b;

    public fyq() {
        this.a = f;
        this.b = "return";
    }

    @Override // defpackage.fyy
    public final fyy d() {
        return new fyq(this.b, this.a.d());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fyq) {
            fyq fyqVar = (fyq) obj;
            if (this.b.equals(fyqVar.b) && this.a.equals(fyqVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fyy
    public final Boolean g() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.fyy
    public final fyy gR(String str, kwq kwqVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // defpackage.fyy
    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.fyy
    public final String i() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.fyy
    public final Iterator l() {
        return null;
    }

    public fyq(String str) {
        this.a = f;
        this.b = str;
    }

    public fyq(String str, fyy fyyVar) {
        this.a = fyyVar;
        this.b = str;
    }
}
