package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adc {
    final Set a;
    final Set b;
    final Set c;
    int d;
    int e;
    int f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    adg k;

    public adc(add addVar) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        HashSet hashSet2 = new HashSet();
        this.b = hashSet2;
        HashSet hashSet3 = new HashSet();
        this.c = hashSet3;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = 0;
        this.j = false;
        this.k = adg.b;
        addVar.getClass();
        this.d = addVar.b;
        this.e = addVar.c;
        this.f = addVar.d;
        this.k = addVar.i;
        hashSet.addAll(addVar.j);
        hashSet2.addAll(addVar.k);
        hashSet3.addAll(addVar.l);
        this.g = addVar.e;
        this.h = addVar.f;
        this.i = addVar.g;
        this.j = addVar.h;
    }

    public final void a(int i) {
        this.c.add(Integer.valueOf(i));
    }

    public final void b() {
        this.e = 1;
    }

    public final void c() {
        this.g = true;
    }

    public final void d() {
        this.j = true;
    }

    public adc() {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = new HashSet();
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = 0;
        this.j = false;
        this.k = adg.b;
    }
}
