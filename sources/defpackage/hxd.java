package defpackage;

import java.util.Observer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxd {
    public final aunn a;
    public boolean b;
    private final awmd c;
    private final tun d;
    private final Observer e = new hxc(this);
    private final aunn f;
    private final aunn g;
    private final aunn h;

    public hxd(awmd awmdVar, tun tunVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4) {
        this.c = awmdVar;
        this.d = tunVar;
        this.f = aunnVar;
        this.a = aunnVar2;
        this.g = aunnVar3;
        this.h = aunnVar4;
    }

    public final void a() {
        if (((vxz) this.h.io()).l(230, 45776742L, false)) {
            ((idk) this.f.io()).m();
        }
        this.b = true;
        this.d.addObserver(this.e);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [acey, java.lang.Object] */
    public final void b() {
        if (this.b) {
            this.d.deleteObserver(this.e);
            this.b = false;
            abvk abvkVar = (abvk) this.c.io();
            jrj jrjVar = jrj.AUDIO_ROUTE_MUSIC;
            ?? r1 = abvkVar.o.d;
            if (r1 != 0) {
                r1.S(jrjVar);
            }
            if (((vxz) this.h.io()).l(230, 45776742L, false)) {
                ((abjp) this.g.io()).r();
                afwl.i(new hgx(this, 12)).run();
                ((idk) this.f.io()).l();
            }
        }
    }
}
