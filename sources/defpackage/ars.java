package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ars extends arx {
    public ars(ard ardVar) {
        super(ardVar);
        ardVar.h.d();
        ardVar.i.d();
        this.f = ((arg) ardVar).ar;
    }

    private final void g(arp arpVar) {
        arp arpVar2 = this.h;
        arpVar2.j.add(arpVar);
        arpVar.k.add(arpVar2);
    }

    @Override // defpackage.arx
    public final void b() {
        ard ardVar = this.d;
        arg argVar = (arg) ardVar;
        int i = argVar.b;
        int i2 = argVar.c;
        float f = argVar.a;
        if (argVar.ar == 1) {
            if (i != -1) {
                arp arpVar = this.h;
                arpVar.k.add(ardVar.U.h.h);
                this.d.U.h.h.j.add(arpVar);
                arpVar.e = i;
            } else {
                arp arpVar2 = this.h;
                if (i2 != -1) {
                    arpVar2.k.add(ardVar.U.h.i);
                    this.d.U.h.i.j.add(arpVar2);
                    arpVar2.e = -i2;
                } else {
                    arpVar2.b = true;
                    arpVar2.k.add(ardVar.U.h.i);
                    this.d.U.h.i.j.add(arpVar2);
                }
            }
            g(this.d.h.h);
            g(this.d.h.i);
            return;
        }
        if (i != -1) {
            arp arpVar3 = this.h;
            arpVar3.k.add(ardVar.U.i.h);
            this.d.U.i.h.j.add(arpVar3);
            arpVar3.e = i;
        } else {
            arp arpVar4 = this.h;
            if (i2 != -1) {
                arpVar4.k.add(ardVar.U.i.i);
                this.d.U.i.i.j.add(arpVar4);
                arpVar4.e = -i2;
            } else {
                arpVar4.b = true;
                arpVar4.k.add(ardVar.U.i.i);
                this.d.U.i.i.j.add(arpVar4);
            }
        }
        g(this.d.i.h);
        g(this.d.i.i);
    }

    @Override // defpackage.arx
    public final void c() {
        ard ardVar = this.d;
        int i = ((arg) ardVar).ar;
        arp arpVar = this.h;
        if (i == 1) {
            ardVar.Z = arpVar.f;
        } else {
            ardVar.aa = arpVar.f;
        }
    }

    @Override // defpackage.arx
    public final void d() {
        this.h.b();
    }

    @Override // defpackage.arx
    public final boolean e() {
        return false;
    }

    @Override // defpackage.arx, defpackage.arn
    public final void f() {
        arp arpVar = this.h;
        if (!arpVar.c || arpVar.i) {
            return;
        }
        arpVar.c((int) ((((arp) arpVar.k.get(0)).f * ((arg) this.d).a) + 0.5f));
    }
}
