package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxg extends aihf implements aiis {
    public fxg() {
        super(fxl.a);
    }

    public final void a(fxj fxjVar) {
        copyOnWrite();
        fxl fxlVar = (fxl) this.instance;
        fxl fxlVar2 = fxl.a;
        fxjVar.getClass();
        aiie aiieVar = fxlVar.R;
        if (!aiieVar.c()) {
            fxlVar.R = aihn.mutableCopy(aiieVar);
        }
        fxlVar.R.add(fxjVar);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        axfz axfzVar = (axfz) this.instance;
        axfz axfzVar2 = axfz.a;
        aiie aiieVar = axfzVar.c;
        if (!aiieVar.c()) {
            axfzVar.c = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, axfzVar.c);
    }

    public final void c(Iterable iterable) {
        copyOnWrite();
        axfz axfzVar = (axfz) this.instance;
        axfz axfzVar2 = axfz.a;
        aiie aiieVar = axfzVar.d;
        if (!aiieVar.c()) {
            axfzVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, axfzVar.d);
    }

    public final axgd d(int i) {
        return (axgd) ((axge) this.instance).m.get(i);
    }

    public final axgd e(int i) {
        return (axgd) ((axge) this.instance).o.get(i);
    }

    public final axgd f(int i) {
        return (axgd) ((axge) this.instance).l.get(i);
    }

    public final axgd g(int i) {
        return (axgd) ((axge) this.instance).k.get(i);
    }

    public final axgd h(int i) {
        return (axgd) ((axge) this.instance).h.get(i);
    }

    public final axgd i(int i) {
        return (axgd) ((axge) this.instance).i.get(i);
    }

    public final axgd j(int i) {
        return (axgd) ((axge) this.instance).j.get(i);
    }

    public final void k(Iterable iterable) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgeVar.a();
        aifs.addAll(iterable, axgeVar.m);
    }

    public final void l(Iterable iterable) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgeVar.b();
        aifs.addAll(iterable, axgeVar.o);
    }

    public final void m(Iterable iterable) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        aiie aiieVar = axgeVar.r;
        if (!aiieVar.c()) {
            axgeVar.r = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, axgeVar.r);
    }

    public final void n(Iterable iterable) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        aiie aiieVar = axgeVar.q;
        if (!aiieVar.c()) {
            axgeVar.q = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, axgeVar.q);
    }

    public final void o(Iterable iterable) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgeVar.c();
        aifs.addAll(iterable, axgeVar.l);
    }

    public final void p(Iterable iterable) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgeVar.d();
        aifs.addAll(iterable, axgeVar.k);
    }

    public final void q(Iterable iterable) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgeVar.e();
        aifs.addAll(iterable, axgeVar.h);
    }

    public final void r(Iterable iterable) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgeVar.f();
        aifs.addAll(iterable, axgeVar.i);
    }

    public final void s(Iterable iterable) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgeVar.g();
        aifs.addAll(iterable, axgeVar.j);
    }

    public final void t(int i, axgd axgdVar) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgdVar.getClass();
        axgeVar.a();
        axgeVar.m.set(i, axgdVar);
    }

    public final void u(int i, axgd axgdVar) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgdVar.getClass();
        axgeVar.b();
        axgeVar.o.set(i, axgdVar);
    }

    public final void v(int i, axgd axgdVar) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgdVar.getClass();
        axgeVar.c();
        axgeVar.l.set(i, axgdVar);
    }

    public final void w(int i, axgd axgdVar) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgdVar.getClass();
        axgeVar.d();
        axgeVar.k.set(i, axgdVar);
    }

    public final void x(int i, axgd axgdVar) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgdVar.getClass();
        axgeVar.e();
        axgeVar.h.set(i, axgdVar);
    }

    public final void y(int i, axgd axgdVar) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgdVar.getClass();
        axgeVar.f();
        axgeVar.i.set(i, axgdVar);
    }

    public final void z(int i, axgd axgdVar) {
        copyOnWrite();
        axge axgeVar = (axge) this.instance;
        axge axgeVar2 = axge.a;
        axgdVar.getClass();
        axgeVar.g();
        axgeVar.j.set(i, axgdVar);
    }

    public fxg(byte[] bArr) {
        super(axfz.a);
    }

    public fxg(char[] cArr) {
        super(axge.a);
    }
}
