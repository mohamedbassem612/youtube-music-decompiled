package defpackage;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsy implements Comparator, jso {
    private final long a;
    private final TreeSet b = new TreeSet(this);
    private long c;

    public jsy(long j) {
        this.a = j;
    }

    private final void i(jsk jskVar, long j) {
        while (this.c + j > this.a) {
            TreeSet treeSet = this.b;
            if (treeSet.isEmpty()) {
                return;
            } else {
                try {
                    jskVar.m((jsp) treeSet.first());
                } catch (jsi unused) {
                }
            }
        }
    }

    @Override // defpackage.jsj
    public final void a(jsk jskVar, jsp jspVar) {
        this.b.add(jspVar);
        this.c += jspVar.c;
        i(jskVar, 0L);
    }

    @Override // defpackage.jsj
    public final void b(jsk jskVar, jsp jspVar, jsp jspVar2) {
        c(jspVar);
        a(jskVar, jspVar2);
    }

    @Override // defpackage.jsj
    public final void c(jsp jspVar) {
        this.b.remove(jspVar);
        this.c -= jspVar.c;
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
        return this.c;
    }

    @Override // defpackage.jso
    public final long e() {
        return this.a;
    }

    @Override // defpackage.jso
    public final boolean g() {
        return true;
    }

    @Override // defpackage.jso
    public final void h(jsk jskVar, long j) {
        if (j != -1) {
            i(jskVar, j);
        }
    }

    @Override // defpackage.jso
    public final void f() {
    }
}
