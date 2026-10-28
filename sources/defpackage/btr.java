package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class btr {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public agke i;
    public agke j;
    public agke k;
    public agke l;
    public agke m;
    public int n;
    public int o;
    public agke p;
    public btq q;
    public agke r;
    public boolean s;
    public agke t;
    public HashMap u;
    public HashSet v;

    public btr() {
        this.a = Alert.DURATION_SHOW_INDEFINITELY;
        this.b = Alert.DURATION_SHOW_INDEFINITELY;
        this.c = Alert.DURATION_SHOW_INDEFINITELY;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = Alert.DURATION_SHOW_INDEFINITELY;
        this.f = Alert.DURATION_SHOW_INDEFINITELY;
        this.g = true;
        this.h = true;
        agke agkeVar = agpi.a;
        this.i = agkeVar;
        this.j = agkeVar;
        this.k = agkeVar;
        this.l = agkeVar;
        this.m = agkeVar;
        this.n = Alert.DURATION_SHOW_INDEFINITELY;
        this.o = Alert.DURATION_SHOW_INDEFINITELY;
        this.p = agkeVar;
        this.q = btq.a;
        this.r = agkeVar;
        this.s = true;
        this.t = agkeVar;
        this.u = new HashMap();
        this.v = new HashSet();
    }

    public bts a() {
        return new bts(this);
    }

    public final void b(bts btsVar) {
        this.a = btsVar.b;
        this.b = btsVar.c;
        this.c = btsVar.d;
        this.d = btsVar.e;
        int i = btsVar.f;
        int i2 = btsVar.g;
        int i3 = btsVar.h;
        int i4 = btsVar.i;
        this.e = btsVar.j;
        this.f = btsVar.k;
        this.g = btsVar.l;
        this.h = btsVar.m;
        this.j = btsVar.o;
        this.i = btsVar.n;
        this.k = btsVar.p;
        int i5 = btsVar.q;
        this.l = btsVar.r;
        int i6 = btsVar.t;
        this.m = btsVar.s;
        this.n = btsVar.u;
        this.o = btsVar.v;
        this.p = btsVar.w;
        this.q = btsVar.x;
        boolean z = btsVar.y;
        this.r = btsVar.z;
        int i7 = btsVar.B;
        this.s = btsVar.C;
        this.t = btsVar.A;
        int i8 = btsVar.D;
        boolean z2 = btsVar.E;
        boolean z3 = btsVar.F;
        boolean z4 = btsVar.G;
        boolean z5 = btsVar.H;
        this.v = new HashSet(btsVar.J);
        this.u = new HashMap(btsVar.I);
    }

    public final void c(Set set) {
        this.v.clear();
        this.v.addAll(set);
    }

    protected btr(bts btsVar) {
        b(btsVar);
    }
}
