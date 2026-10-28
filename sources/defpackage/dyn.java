package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyn {
    public static final dyn a = new dyn();
    public final efo b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    public final int j;

    public dyn(dyn dynVar) {
        dynVar.getClass();
        this.c = dynVar.c;
        this.d = dynVar.d;
        this.b = dynVar.b;
        this.j = dynVar.j;
        this.e = dynVar.e;
        this.f = dynVar.f;
        this.i = dynVar.i;
        this.g = dynVar.g;
        this.h = dynVar.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.b;
    }

    public final boolean b() {
        return !this.i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && awrc.c(getClass(), obj.getClass())) {
            dyn dynVar = (dyn) obj;
            if (this.c == dynVar.c && this.d == dynVar.d && this.e == dynVar.e && this.f == dynVar.f && this.g == dynVar.g && this.h == dynVar.h && awrc.c(a(), dynVar.a()) && this.j == dynVar.j) {
                return awrc.c(this.i, dynVar.i);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.j * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        long j = this.h;
        long j2 = this.g;
        int iHashCode = ((((((((i + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.i.hashCode();
        NetworkRequest networkRequestA = a();
        return (iHashCode * 31) + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + ((Object) bbl.e(this.j)) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public dyn() {
        awnq awnqVar = awnq.a;
        this.b = new efo(null);
        this.j = 1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = awnqVar;
    }

    public dyn(efo efoVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        efoVar.getClass();
        if (i == 0) {
            throw null;
        }
        this.b = efoVar;
        this.j = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = j2;
        this.i = set;
    }
}
