package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class arc {
    public int b;
    public boolean c;
    public final ard d;
    public arc e;
    public aqy h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public arc(ard ardVar, int i) {
        this.d = ardVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        arc arcVar;
        if (this.d.ah == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (arcVar = this.e) == null || arcVar.d.ah != 8) ? this.f : i;
    }

    public final void c(int i, ArrayList arrayList, arw arwVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                zi.c(((arc) it.next()).d, i, arrayList, arwVar);
            }
        }
    }

    public final void d() {
        HashSet hashSet;
        arc arcVar = this.e;
        if (arcVar != null && (hashSet = arcVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void e(int i) {
        this.b = i;
        this.c = true;
    }

    public final boolean f() {
        arc arcVar;
        HashSet<arc> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        for (arc arcVar2 : hashSet) {
            int i = arcVar2.i - 1;
            if (i == 1) {
                arcVar = arcVar2.d.L;
            } else if (i == 2) {
                arcVar = arcVar2.d.M;
            } else if (i != 3) {
                arcVar = i != 4 ? null : arcVar2.d.K;
            } else {
                arcVar = arcVar2.d.J;
            }
            if (arcVar.h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean h() {
        return this.e != null;
    }

    public final void i() {
        aqy aqyVar = this.h;
        if (aqyVar == null) {
            this.h = new aqy(1);
        } else {
            aqyVar.c();
        }
    }

    public final void j(arc arcVar, int i, int i2) {
        if (arcVar == null) {
            d();
            return;
        }
        this.e = arcVar;
        if (arcVar.a == null) {
            arcVar.a = new HashSet();
        }
        HashSet hashSet = this.e.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f = i;
        this.g = i2;
    }

    public final String toString() {
        return this.d.ai + ':' + a.c(this.i);
    }
}
