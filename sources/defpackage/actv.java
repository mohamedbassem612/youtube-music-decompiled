package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class actv extends acii {
    public final awlo a;
    public final acts b;
    final Set c;
    private final hno d;

    public actv(hno hnoVar, acts actsVar) {
        super(0);
        this.a = new awlo();
        this.c = Collections.newSetFromMap(new WeakHashMap());
        this.d = hnoVar;
        this.b = actsVar;
    }

    public final void A(ajwo ajwoVar, alqc alqcVar, boolean z) {
        E(new acsn(ajwoVar, alqcVar, z));
    }

    public final void B(ajwo ajwoVar, alqc alqcVar, boolean z) {
        E(new acso(ajwoVar, alqcVar, z));
    }

    public final void C(ajwo ajwoVar, alqc alqcVar) {
        E(new acsp(ajwoVar, alqcVar));
    }

    public final void D(String str, toe toeVar, ajwo ajwoVar) {
        E(new acsq(str, toeVar, ajwoVar));
    }

    public final void E(acsu acsuVar) {
        ArrayList arrayList;
        if (this.d.ab()) {
            this.a.kk(acsuVar);
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList(this.c);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((actu) arrayList.get(i)).l(acsuVar);
        }
    }

    public final void F(actu actuVar) {
        if (this.d.ab()) {
            return;
        }
        synchronized (this) {
            this.c.remove(actuVar);
        }
    }

    @Override // defpackage.acii
    public final void K(aaxt aaxtVar, wjf wjfVar, String str) {
        E(new acsm(aaxtVar, wjfVar, str));
    }

    public final void z(actu actuVar) {
        if (this.d.ab()) {
            return;
        }
        synchronized (this) {
            this.c.add(actuVar);
        }
    }
}
