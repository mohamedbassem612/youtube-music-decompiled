package defpackage;

import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adfy {
    public final atqd a;
    public final AtomicInteger b;
    public final IntersectionCriteria c;
    public final IntersectionCriteria d;
    public final AtomicLong e;
    private final long f;

    public adfy(atqd atqdVar, AtomicInteger atomicInteger, IntersectionCriteria intersectionCriteria, IntersectionCriteria intersectionCriteria2, long j, AtomicLong atomicLong) {
        if (atqdVar == null) {
            throw new NullPointerException("Null criteria");
        }
        this.a = atqdVar;
        this.b = atomicInteger;
        this.c = intersectionCriteria;
        this.d = intersectionCriteria2;
        this.f = j;
        this.e = atomicLong;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adfy) {
            adfy adfyVar = (adfy) obj;
            if (this.a.equals(adfyVar.a) && this.b.equals(adfyVar.b) && this.c.equals(adfyVar.c) && this.d.equals(adfyVar.d) && this.f == adfyVar.f && this.e.equals(adfyVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ ((int) this.f)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        AtomicLong atomicLong = this.e;
        IntersectionCriteria intersectionCriteria = this.d;
        IntersectionCriteria intersectionCriteria2 = this.c;
        AtomicInteger atomicInteger = this.b;
        return "FvlObserverSpec{criteria=" + this.a.toString() + ", state=" + atomicInteger.toString() + ", enterCriteria=" + intersectionCriteria2.toString() + ", exitCriteria=" + intersectionCriteria.toString() + ", delayInMs=" + this.f + ", lastShownTime=" + atomicLong.toString() + '}';
    }

    public adfy() {
        throw null;
    }
}
