package defpackage;

import android.os.Handler;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class rnp {
    private static final boolean[][] h = {new boolean[]{false, false, false, true, false, false, true, true, true, true}, new boolean[]{false, false, false, true, false, false, false, false, false, false}, new boolean[]{false, false, false, true, false, false, false, false, false, false}, new boolean[]{false, false, true, true, false, false, false, false, false, false}, new boolean[]{false, false, false, true, false, true, true, true, false, false}, new boolean[]{false, false, false, true, false, false, false, false, false, false}, new boolean[]{false, true, true, true, true, true, false, true, false, false}, new boolean[]{false, true, true, true, true, true, true, false, false, false}, new boolean[]{false, true, true, true, false, true, false, false, false, false}, new boolean[]{false, true, true, true, false, true, false, false, false, false}};
    public final vxe b;
    akza f;
    aomb g;
    private final Handler i;
    private boolean k = false;
    private final Set j = Collections.newSetFromMap(new WeakHashMap());
    public alkk c = null;
    int a = 0;
    public akyy d = null;
    public aoma e = null;

    public rnp(vxe vxeVar, Handler handler) {
        this.b = vxeVar;
        this.i = handler;
    }

    public final void a(rnv rnvVar) {
        this.j.add(rnvVar);
    }

    public abstract void b();

    protected void c(int i) {
        for (rnv rnvVar : this.j) {
        }
        alkk alkkVar = this.c;
        if (alkkVar == null || (alkkVar.c & 2) == 0) {
            return;
        }
        vxe vxeVar = this.b;
        ajwo ajwoVar = alkkVar.e;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        vxeVar.c(ajwoVar, null);
    }

    protected void d(int i) {
        if (this.k) {
            vxe vxeVar = this.b;
            ajwo ajwoVar = this.c.j;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.c(ajwoVar, null);
        }
        for (rnv rnvVar : this.j) {
            if (rnvVar != null) {
                rnvVar.b();
            }
        }
        alkk alkkVar = this.c;
        if (alkkVar == null || (alkkVar.c & 1) == 0) {
            return;
        }
        vxe vxeVar2 = this.b;
        ajwo ajwoVar2 = alkkVar.d;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        vxeVar2.c(ajwoVar2, null);
    }

    public abstract void e(akyy akyyVar);

    public abstract void f(roq roqVar);

    public abstract void g(aoma aomaVar);

    protected abstract void h(aomb aombVar);

    protected abstract void i(akza akzaVar);

    public final void j(int i) {
        int i2 = this.a;
        this.a = i;
        if (!h[i2][i]) {
            j(3);
        }
        int i3 = 0;
        int i4 = 1;
        switch (i) {
            case 1:
                if (i2 == 8) {
                    d(2);
                } else if (i2 == 9) {
                    d(3);
                } else if (i2 == 6) {
                    d(1);
                } else {
                    d(0);
                }
                break;
            case 2:
                if (i2 == 8) {
                    c(2);
                } else if (i2 == 9) {
                    c(3);
                } else if (i2 == 6) {
                    c(1);
                } else {
                    c(0);
                }
                break;
            case 3:
                for (rnv rnvVar : this.j) {
                }
                j(2);
                break;
            case 4:
                this.i.post(new rhl(this, 18));
                break;
            case 5:
                for (rnv rnvVar2 : this.j) {
                    if (rnvVar2 != null) {
                        rnvVar2.a();
                    }
                }
                alkk alkkVar = this.c;
                if ((alkkVar.c & 8) != 0) {
                    vxe vxeVar = this.b;
                    ajwo ajwoVar = alkkVar.g;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    vxeVar.c(ajwoVar, null);
                }
                break;
            case 6:
                this.i.post(new rhl(this, 19));
                break;
            case 7:
                this.i.post(new rhl(this, 20));
                break;
            case 8:
                this.i.post(new rno(this, i4));
                break;
            default:
                this.i.post(new rno(this, i3));
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    public final void k(alkk alkkVar) {
        boolean z;
        boolean z2;
        if (this.a != 0) {
            j(3);
            return;
        }
        this.c = alkkVar;
        if (alkkVar.i.size() != 0) {
            apji apjiVar = (apji) alkkVar.i.get(0);
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akzb.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (alkkVar.i.size() != 0) {
            apji apjiVar2 = (apji) alkkVar.i.get(0);
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aomb.b);
            apjiVar2.c(aihlVarCheckIsLite2);
            z2 = apjiVar2.j.n(aihlVarCheckIsLite2.d);
        }
        apji apjiVar3 = alkkVar.h;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aoma.b);
        apjiVar3.c(aihlVarCheckIsLite3);
        if (!apjiVar3.j.n(aihlVarCheckIsLite3.d) && !z && !z2) {
            if ((alkkVar.c & 8) != 0) {
                vxe vxeVar = this.b;
                ajwo ajwoVar = alkkVar.g;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.c(ajwoVar, null);
            }
            j(3);
            return;
        }
        apji apjiVar4 = alkkVar.h;
        if (apjiVar4 == null) {
            apjiVar4 = apji.a;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aoma.b);
        apjiVar4.c(aihlVarCheckIsLite4);
        if (apjiVar4.j.n(aihlVarCheckIsLite4.d)) {
            apji apjiVar5 = alkkVar.h;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aoma.b);
            apjiVar5.c(aihlVarCheckIsLite5);
            Object objK = apjiVar5.j.k(aihlVarCheckIsLite5.d);
            this.e = (aoma) (objK == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK));
        }
        if ((alkkVar.c & 4) != 0) {
            vxe vxeVar2 = this.b;
            ajwo ajwoVar2 = alkkVar.f;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            vxeVar2.c(ajwoVar2, null);
        }
        if (alkkVar.i.size() == 0) {
            j(7);
            return;
        }
        apji apjiVar6 = (apji) alkkVar.i.get(0);
        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(akyy.b);
        apjiVar6.c(aihlVarCheckIsLite6);
        if (apjiVar6.j.n(aihlVarCheckIsLite6.d)) {
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(akyy.b);
            apjiVar6.c(aihlVarCheckIsLite7);
            Object objK2 = apjiVar6.j.k(aihlVarCheckIsLite7.d);
            this.d = (akyy) (objK2 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK2));
        } else {
            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aoma.b);
            apjiVar6.c(aihlVarCheckIsLite8);
            if (apjiVar6.j.n(aihlVarCheckIsLite8.d)) {
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aoma.b);
                apjiVar6.c(aihlVarCheckIsLite9);
                Object objK3 = apjiVar6.j.k(aihlVarCheckIsLite9.d);
                this.e = (aoma) (objK3 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK3));
            } else {
                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(akzb.a);
                apjiVar6.c(aihlVarCheckIsLite10);
                if (apjiVar6.j.n(aihlVarCheckIsLite10.d)) {
                    aihl aihlVarCheckIsLite11 = aihn.checkIsLite(akzb.a);
                    apjiVar6.c(aihlVarCheckIsLite11);
                    Object objK4 = apjiVar6.j.k(aihlVarCheckIsLite11.d);
                    this.f = (akza) (objK4 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK4));
                } else {
                    aihl aihlVar = aomb.b;
                    aihl aihlVarCheckIsLite12 = aihn.checkIsLite(aihlVar);
                    apjiVar6.c(aihlVarCheckIsLite12);
                    if (apjiVar6.j.n(aihlVarCheckIsLite12.d)) {
                        aihl aihlVarCheckIsLite13 = aihn.checkIsLite(aihlVar);
                        apjiVar6.c(aihlVarCheckIsLite13);
                        Object objK5 = apjiVar6.j.k(aihlVarCheckIsLite13.d);
                        this.g = (aomb) (objK5 == null ? aihlVarCheckIsLite13.b : aihlVarCheckIsLite13.c(objK5));
                    }
                }
            }
        }
        if (this.f != null) {
            j(8);
        } else if (this.g != null) {
            j(9);
        } else {
            j(7);
        }
    }

    public final void l() {
        this.k = true;
    }
}
