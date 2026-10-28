package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fyl {
    public fyk a;
    public fyk b;
    public final List c;

    public fyl() {
        this.a = new fyk("", 0L, null);
        this.b = new fyk("", 0L, null);
        this.c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        fyl fylVar = new fyl(this.a.clone());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            fylVar.c.add(((fyk) it.next()).clone());
        }
        return fylVar;
    }

    public fyl(fyk fykVar) {
        this.a = fykVar;
        this.b = fykVar.clone();
        this.c = new ArrayList();
    }
}
