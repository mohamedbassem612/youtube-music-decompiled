package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class arq extends arp {
    public int m;

    public arq(arx arxVar) {
        super(arxVar);
        this.l = true != (arxVar instanceof aru) ? 3 : 2;
    }

    @Override // defpackage.arp
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((arn) it.next()).f();
        }
    }
}
