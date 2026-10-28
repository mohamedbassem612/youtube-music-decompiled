package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aciu {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final acfs f;
    public final zgp g;

    public aciu(acfs acfsVar, long j, long j2, long j3, long j4, boolean z, zgp zgpVar) {
        this.f = acfsVar;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.g = zgpVar;
    }

    public final long a() {
        long j = this.a;
        if (j == -2) {
            j = 0;
        }
        return this.b - j;
    }

    public final wjf b() {
        return this.f.b();
    }

    public final abnp c() {
        return this.f.d();
    }

    public final String d() {
        return this.f.E();
    }

    public final boolean e() {
        return this.a == this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != aciu.class) {
            return false;
        }
        aciu aciuVar = (aciu) obj;
        if (this.b == aciuVar.b) {
            return TextUtils.equals(this.f.E(), aciuVar.f.E()) && Objects.equals(this.g, aciuVar.g) && this.e == aciuVar.e;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f.E().hashCode();
        long j = this.b;
        int i = ((((((int) (j >> 32)) + 527) * 31) + ((int) j)) * 31) + iHashCode;
        zgp zgpVar = this.g;
        return (((i * 31) + (true != this.e ? 1237 : 1231)) * 31) + (zgpVar != null ? zgpVar.hashCode() : 0);
    }

    public final String toString() {
        return "(startPos: " + this.a + ", transitionNextPosMillis: " + this.b + ", transitionAtEnd: " + this.e + ", minSegmentPositionMillis: " + this.c + ", maxSegmentPositionMillis: " + this.d + ", transitionEffect: " + String.valueOf(this.g) + ')';
    }
}
