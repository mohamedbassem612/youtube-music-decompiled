package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bpz extends bop {
    public final int i;
    public final bqg j;
    public bqa k;
    private bog l;

    public bpz(int i, bqg bqgVar) {
        this.i = i;
        this.j = bqgVar;
        if (bqgVar.j != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        bqgVar.j = this;
        bqgVar.c = i;
    }

    @Override // defpackage.boo
    protected final void e() {
        if (bpy.c(2)) {
            toString();
        }
        bqg bqgVar = this.j;
        bqgVar.e = true;
        bqgVar.g = false;
        bqgVar.f = false;
        bqgVar.l();
    }

    @Override // defpackage.boo
    protected final void f() {
        if (bpy.c(2)) {
            toString();
        }
        bqg bqgVar = this.j;
        bqgVar.e = false;
        bqgVar.m();
    }

    @Override // defpackage.boo
    public final void g(boq boqVar) {
        super.g(boqVar);
        this.l = null;
        this.k = null;
    }

    public final void j() {
        bog bogVar = this.l;
        bqa bqaVar = this.k;
        if (bogVar == null || bqaVar == null) {
            return;
        }
        super.g(bqaVar);
        c(bogVar, bqaVar);
    }

    public final void k() {
        if (bpy.c(3)) {
            toString();
        }
        bqg bqgVar = this.j;
        bqgVar.h();
        bqgVar.f = true;
        bqa bqaVar = this.k;
        if (bqaVar != null) {
            g(bqaVar);
            if (bqaVar.c) {
                if (bpy.c(2)) {
                    Objects.toString(bqaVar.a);
                }
                bqaVar.b.c();
            }
        }
        bpz bpzVar = bqgVar.j;
        if (bpzVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bpzVar != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        bqgVar.j = null;
        bqgVar.k();
        bqgVar.g = true;
        bqgVar.e = false;
        bqgVar.f = false;
        bqgVar.h = false;
        bqgVar.i = false;
    }

    final void l(bog bogVar, bpx bpxVar) {
        bqa bqaVar = new bqa(this.j, bpxVar);
        c(bogVar, bqaVar);
        boq boqVar = this.k;
        if (boqVar != null) {
            g(boqVar);
        }
        this.l = bogVar;
        this.k = bqaVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.i);
        sb.append(" : ");
        bqg bqgVar = this.j;
        sb.append(bqgVar.getClass().getSimpleName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(bqgVar)));
        sb.append("}}");
        return sb.toString();
    }
}
