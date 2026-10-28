package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jms implements jlf {
    private static final ajwo e;
    public int d;
    private final Context f;
    private final abvn g;
    private final aunn h;
    private final awmd i;
    private final vxe j;
    private final jng k;
    private boolean m;
    private final vxz n;
    private final hfn p;
    private final hzo o = new hzo(this);
    private final avmm l = new avmm();
    public Optional a = Optional.empty();
    public hww b = hww.a;
    public boolean c = true;

    static {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(alhg.b, alhg.a);
        e = (ajwo) aihhVar.build();
    }

    public jms(Context context, abvn abvnVar, aunn aunnVar, awmd awmdVar, vxe vxeVar, hfn hfnVar, jng jngVar, vxz vxzVar) {
        this.f = context;
        this.g = abvnVar;
        this.h = aunnVar;
        this.i = awmdVar;
        this.j = vxeVar;
        this.p = hfnVar;
        this.k = jngVar;
        this.n = vxzVar;
    }

    @Override // defpackage.jlf
    public final void a() {
        this.l.b();
    }

    @Override // defpackage.jlf
    public final void b() {
        abvn abvnVar = this.g;
        avlh avlhVarI = ((avlh) abvnVar.r().a).i(new abwr(1));
        hzo hzoVar = this.o;
        avmn[] avmnVarArr = {avlhVarI.al(new iho(hzoVar, 17), new ihp(9)), ((avlh) abvnVar.r().n).i(new abwr(1)).al(new iho(hzoVar, 18), new ihp(9))};
        avmm avmmVar = this.l;
        avmmVar.e(avmnVarArr);
        avmmVar.e(this.p.y().i(new abwr(1)).al(new iho(this, 15), new ihp(8)), this.k.b.P().p().i(new abwr(1)).al(new iho(this, 16), new ihp(8)));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    public final void c(int i, hww hwwVar, boolean z) {
        int iBw;
        jni jniVar;
        jol jolVar;
        boolean z2;
        if (hwwVar == hww.a) {
            this.m = false;
        }
        if (this.a.isPresent() && (iBw = acfz.bw(((anih) this.a.get()).b)) != 0 && iBw == 5 && i == 2) {
            if (hww.c(hwwVar)) {
                if (this.n.m(157, 45638079L)) {
                    this.j.a(e);
                }
                if (this.d == 2) {
                    agrx agrxVar = agso.a;
                    ((WatchWhileLayout) this.i.io()).L(true);
                    jniVar = this.k.c;
                    if (jniVar != null) {
                        jolVar = (jol) jniVar.a;
                        if (jolVar.o()) {
                            jolVar.m(jolVar.y);
                        }
                    }
                } else {
                    agrx agrxVar2 = agso.a;
                    ((WatchWhileLayout) this.i.io()).L(true);
                    jniVar = this.k.c;
                    if (jniVar != null) {
                        jolVar = (jol) jniVar.a;
                        if (jolVar.o()) {
                            jolVar.m(jolVar.y);
                        }
                    }
                }
            } else {
                Context context = this.f;
                if (!hfn.G(context) || !hwwVar.b(hww.c, hww.e)) {
                    z2 = z;
                } else if (z) {
                    z2 = true;
                } else {
                    if (this.n.m(157, 45638079L)) {
                        this.j.a(e);
                    }
                    if (this.d == 2 || !this.b.e()) {
                        agrx agrxVar3 = agso.a;
                        ((WatchWhileLayout) this.i.io()).L(true);
                        jniVar = this.k.c;
                        if (jniVar != null) {
                            jolVar = (jol) jniVar.a;
                            if (jolVar.o()) {
                                jolVar.m(jolVar.y);
                            }
                        }
                    } else {
                        ((abvk) this.h.io()).ap(false, 19);
                        if (!this.m) {
                            agrx agrxVar4 = agso.a;
                            vxe vxeVar = this.j;
                            ajwo ajwoVar = ((anih) this.a.get()).c;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            vxeVar.c(ajwoVar, null);
                            this.m = true;
                        }
                    }
                }
                if (!hfn.G(context) && hwwVar.b(hww.e) && !z2) {
                    if (this.n.m(157, 45638079L)) {
                        this.j.a(e);
                    }
                    if (this.d == 2) {
                        agrx agrxVar5 = agso.a;
                        ((WatchWhileLayout) this.i.io()).L(true);
                        jniVar = this.k.c;
                        if (jniVar != null) {
                            jolVar = (jol) jniVar.a;
                            if (jolVar.o()) {
                                jolVar.m(jolVar.y);
                            }
                        }
                    } else {
                        agrx agrxVar6 = agso.a;
                        ((WatchWhileLayout) this.i.io()).L(true);
                        jniVar = this.k.c;
                        if (jniVar != null) {
                            jolVar = (jol) jniVar.a;
                            if (jolVar.o()) {
                                jolVar.m(jolVar.y);
                            }
                        }
                    }
                }
            }
            i = 2;
        }
        this.d = i;
        this.b = hwwVar;
        this.c = z;
    }
}
