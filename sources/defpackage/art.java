package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class art extends arx {
    private final void g(arp arpVar) {
        arp arpVar2 = this.h;
        arpVar2.j.add(arpVar);
        arpVar.k.add(arpVar2);
    }

    @Override // defpackage.arx
    public final void b() {
        ard ardVar = this.d;
        if (ardVar instanceof ara) {
            arp arpVar = this.h;
            arpVar.b = true;
            ara araVar = (ara) ardVar;
            int i = araVar.a;
            boolean z = araVar.b;
            int i2 = 0;
            if (i == 0) {
                arpVar.l = 4;
                while (i2 < araVar.as) {
                    ard ardVar2 = araVar.ar[i2];
                    if (z || ardVar2.ah != 8) {
                        arp arpVar2 = ardVar2.h.h;
                        arpVar2.j.add(arpVar);
                        arpVar.k.add(arpVar2);
                    }
                    i2++;
                }
                g(this.d.h.h);
                g(this.d.h.i);
                return;
            }
            if (i == 1) {
                arpVar.l = 5;
                while (i2 < araVar.as) {
                    ard ardVar3 = araVar.ar[i2];
                    if (z || ardVar3.ah != 8) {
                        arp arpVar3 = ardVar3.h.i;
                        arpVar3.j.add(arpVar);
                        arpVar.k.add(arpVar3);
                    }
                    i2++;
                }
                g(this.d.h.h);
                g(this.d.h.i);
                return;
            }
            if (i == 2) {
                arpVar.l = 6;
                while (i2 < araVar.as) {
                    ard ardVar4 = araVar.ar[i2];
                    if (z || ardVar4.ah != 8) {
                        arp arpVar4 = ardVar4.i.h;
                        arpVar4.j.add(arpVar);
                        arpVar.k.add(arpVar4);
                    }
                    i2++;
                }
                g(this.d.i.h);
                g(this.d.i.i);
                return;
            }
            if (i == 3) {
                arpVar.l = 7;
                while (i2 < araVar.as) {
                    ard ardVar5 = araVar.ar[i2];
                    if (z || ardVar5.ah != 8) {
                        arp arpVar5 = ardVar5.i.i;
                        arpVar5.j.add(arpVar);
                        arpVar.k.add(arpVar5);
                    }
                    i2++;
                }
                g(this.d.i.h);
                g(this.d.i.i);
            }
        }
    }

    @Override // defpackage.arx
    public final void c() {
        ard ardVar = this.d;
        if (ardVar instanceof ara) {
            int i = ((ara) ardVar).a;
            if (i == 0 || i == 1) {
                ardVar.Z = this.h.f;
            } else {
                ardVar.aa = this.h.f;
            }
        }
    }

    @Override // defpackage.arx
    public final void d() {
        this.l = null;
        this.h.b();
    }

    @Override // defpackage.arx
    public final boolean e() {
        return false;
    }

    @Override // defpackage.arx, defpackage.arn
    public final void f() {
        ara araVar = (ara) this.d;
        int i = araVar.a;
        arp arpVar = this.h;
        Iterator it = arpVar.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((arp) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            arpVar.c(i3 + araVar.c);
        } else {
            arpVar.c(i2 + araVar.c);
        }
    }
}
