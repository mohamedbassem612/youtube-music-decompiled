package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fmn extends fml {
    private final List a;
    private final fmk b;
    private final HashSet c = new HashSet();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private hhb g;

    public fmn(List list) {
        this.a = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty binding parallel");
        }
        this.b = new fmm(this);
    }

    @Override // defpackage.fmj
    public final void c(ArrayList arrayList) {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((fmj) list.get(i)).c(arrayList);
        }
    }

    @Override // defpackage.fmj
    public final void f() {
        if (this.f) {
            this.f = false;
            this.g = null;
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                fmj fmjVar = (fmj) list.get(i);
                if (fmjVar.g()) {
                    fmjVar.f();
                }
            }
        }
    }

    @Override // defpackage.fmj
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.fmj
    public final void h(hhb hhbVar) {
        if (this.e) {
            throw new RuntimeException("Starting binding multiple times");
        }
        this.e = true;
        this.g = hhbVar;
        if (!l()) {
            i();
            return;
        }
        k();
        this.f = true;
        List list = this.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((fmj) it.next()).b(this.b);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((fmj) list.get(i)).h(this.g);
        }
        list.size();
    }

    public final void m(fmj fmjVar) {
        HashSet hashSet = this.c;
        if (hashSet.contains(fmjVar)) {
            throw new RuntimeException("Binding unexpectedly completed twice");
        }
        hashSet.add(fmjVar);
        this.d++;
        fmjVar.d(this.b);
        if (this.d >= this.a.size()) {
            this.f = false;
            j();
        }
    }
}
