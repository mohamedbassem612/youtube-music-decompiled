package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class agmr implements Iterator {
    int a;
    int b = -1;
    agmw c;
    AtomicReferenceArray d;
    agms e;
    agnv f;
    agnv g;
    final /* synthetic */ agnw h;

    public agmr(agnw agnwVar) {
        this.h = agnwVar;
        this.a = agnwVar.d.length - 1;
        b();
    }

    final agnv a() {
        agnv agnvVar = this.f;
        if (agnvVar == null) {
            throw new NoSuchElementException();
        }
        this.g = agnvVar;
        b();
        return this.g;
    }

    final void b() {
        this.f = null;
        if (d() || e()) {
            return;
        }
        while (true) {
            int i = this.a;
            if (i < 0) {
                return;
            }
            agnw agnwVar = this.h;
            this.a = i - 1;
            agmw agmwVar = agnwVar.d[i];
            this.c = agmwVar;
            if (agmwVar.b != 0) {
                AtomicReferenceArray atomicReferenceArray = this.c.e;
                this.d = atomicReferenceArray;
                this.b = atomicReferenceArray.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    final boolean c(agms agmsVar) {
        boolean z;
        try {
            Object objC = agmsVar.c();
            Object objD = agmsVar.c() == null ? null : agmsVar.d();
            if (objD != null) {
                this.f = new agnv(this.h, objC, objD);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.c.i();
        }
    }

    final boolean d() {
        agms agmsVar = this.e;
        if (agmsVar != null) {
            while (true) {
                this.e = agmsVar.b();
                agms agmsVar2 = this.e;
                if (agmsVar2 == null) {
                    break;
                }
                if (c(agmsVar2)) {
                    return true;
                }
                agmsVar = this.e;
            }
        }
        return false;
    }

    final boolean e() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            agms agmsVar = (agms) atomicReferenceArray.get(i);
            this.e = agmsVar;
            if (agmsVar != null && (c(agmsVar) || d())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ahno.P(this.g != null, "no calls to next() since the last call to remove()");
        this.h.remove(this.g.getKey());
        this.g = null;
    }
}
