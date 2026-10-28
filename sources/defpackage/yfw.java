package defpackage;

import java.io.File;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yfw implements Comparator, jso {
    final long a;
    private final TreeSet b;
    private final agfr c;
    private final long d;
    private final float e;
    private final long f;
    private final long g;
    private final float h;
    private boolean i;
    private long j;

    public yfw(agfr agfrVar, akwi akwiVar, akwi akwiVar2) {
        boolean z = false;
        if (akwiVar != null && akwiVar2 != null && akwiVar.c > 0 && akwiVar2.c > 0) {
            z = true;
        }
        this.c = agfrVar;
        this.a = z ? akwiVar.b : 1073741824L;
        this.d = z ? akwiVar.c : 5368709120L;
        this.e = z ? akwiVar.d : 0.2f;
        this.f = z ? akwiVar2.b : 33554432L;
        this.g = z ? akwiVar2.c : 1073741824L;
        this.h = z ? akwiVar2.d : 0.15f;
        this.b = new TreeSet(this);
    }

    private final void i(jsk jskVar) {
        long jE = e();
        while (true) {
            long j = this.j;
            if (j <= 0 || j <= jE) {
                return;
            } else {
                try {
                    jskVar.m((jsp) this.b.first());
                } catch (jsi unused) {
                }
            }
        }
    }

    @Override // defpackage.jsj
    public final void a(jsk jskVar, jsp jspVar) {
        this.b.add(jspVar);
        this.j += jspVar.c;
        if (this.i) {
            i(jskVar);
        }
    }

    @Override // defpackage.jsj
    public final void b(jsk jskVar, jsp jspVar, jsp jspVar2) {
        c(jspVar);
        a(jskVar, jspVar2);
    }

    @Override // defpackage.jsj
    public final void c(jsp jspVar) {
        this.b.remove(jspVar);
        this.j -= jspVar.c;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        jsp jspVar = (jsp) obj;
        jsp jspVar2 = (jsp) obj2;
        long j = jspVar.f;
        long j2 = jspVar2.f;
        if (j - j2 == 0) {
            return jspVar.compareTo(jspVar2);
        }
        return j >= j2 ? 1 : -1;
    }

    @Override // defpackage.jso
    public final long d() {
        return this.j;
    }

    @Override // defpackage.jso
    public final long e() {
        if (!this.i) {
            return this.f;
        }
        File file = (File) this.c.io();
        long usableSpace = file.getUsableSpace();
        return Math.max(Math.min(this.g, Float.valueOf(this.h * Math.max(0L, (usableSpace - Math.max(this.a, Math.min(this.d, Float.valueOf((file.getTotalSpace() - (file.getFreeSpace() - usableSpace)) * this.e).longValue()))) + this.j)).longValue()), this.f);
    }

    @Override // defpackage.jso
    public final void f() {
        this.i = true;
    }

    @Override // defpackage.jso
    public final boolean g() {
        return true;
    }

    @Override // defpackage.jso
    public final void h(jsk jskVar, long j) {
        if (this.i) {
            i(jskVar);
        }
    }
}
