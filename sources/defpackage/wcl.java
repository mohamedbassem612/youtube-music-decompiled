package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wcl {
    public volatile boolean a;
    private final int b;
    private int c;
    private final dov d;

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    public wcl(vxu vxuVar, dov dovVar) {
        boolean z;
        int i;
        this.d = dovVar;
        if (vxuVar == null) {
            z = false;
        } else {
            anim animVar = vxuVar.c().n;
            akvj akvjVar = (animVar == null ? anim.a : animVar).d;
            if ((akvjVar == null ? akvj.a : akvjVar).b) {
                z = true;
            } else {
                z = false;
            }
        }
        this.a = z;
        if (vxuVar != null) {
            anim animVar2 = vxuVar.c().n;
            akvj akvjVar2 = (animVar2 == null ? anim.a : animVar2).d;
            i = (akvjVar2 == null ? akvj.a : akvjVar2).c;
        } else {
            i = 0;
        }
        this.b = i;
        this.c = 0;
    }

    public final void a(akuy akuyVar) {
        int i;
        if (!this.a || ((i = this.b) != 0 && this.c >= i)) {
            this.a = false;
            return;
        }
        dov dovVar = this.d;
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        akuyVar.getClass();
        alouVar.d = akuyVar;
        alouVar.c = 286;
        dovVar.R((alou) alosVar.build());
        this.c++;
    }
}
