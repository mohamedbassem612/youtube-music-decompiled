package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sb {
    private final String c;
    public String a = "";
    private ArrayList d = new ArrayList();
    public LinkedHashSet b = new LinkedHashSet();
    private final Set e = new afx(0);
    private boolean f = false;

    public sb(String str) {
        azs.l(str);
        this.c = str;
    }

    public final sl a() {
        this.f = true;
        return new sl(this.c, this.d, new ArrayList(this.b), this.a);
    }

    public final void b() {
        if (this.f) {
            this.d = new ArrayList(this.d);
            this.b = new LinkedHashSet(this.b);
            this.f = false;
        }
    }

    public final void c(si siVar) {
        b();
        Set set = this.e;
        String strG = siVar.g();
        if (!set.add(strG)) {
            throw new tt("Property defined more than once: ".concat(strG));
        }
        this.d.add(siVar.a);
    }
}
