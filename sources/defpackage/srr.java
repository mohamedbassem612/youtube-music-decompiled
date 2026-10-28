package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class srr implements zza {
    public Map a;
    private final vxe b;
    private final ttm c;
    private final xsc d;

    public srr(vxe vxeVar, xsc xscVar, ttm ttmVar) {
        this.b = vxeVar;
        xscVar.getClass();
        this.d = xscVar;
        ttmVar.getClass();
        this.c = ttmVar;
    }

    @Override // defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        alnj alnjVar = (alnj) obj;
        Iterator it = alnjVar.d.iterator();
        while (it.hasNext()) {
            this.d.V((alna) it.next(), null);
        }
        this.b.d(alnjVar.e, this.a);
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        this.c.e(toeVar);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
