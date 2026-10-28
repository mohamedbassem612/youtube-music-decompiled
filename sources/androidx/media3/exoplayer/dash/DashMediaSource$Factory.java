package androidx.media3.exoplayer.dash;

import defpackage.ave;
import defpackage.bsp;
import defpackage.bss;
import defpackage.byd;
import defpackage.chz;
import defpackage.ciq;
import defpackage.cmh;
import defpackage.cno;
import defpackage.cnu;
import defpackage.crh;
import defpackage.crj;
import defpackage.dbl;
import defpackage.eol;
import defpackage.fsz;
import defpackage.ovo;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class DashMediaSource$Factory implements cnu {
    private final byd a;
    private final eol g;
    private final ovo e = new ovo();
    private final crj d = new crh();
    private final ave f = new ave();

    public DashMediaSource$Factory(byd bydVar) {
        this.g = new eol(bydVar);
        this.a = bydVar;
        c(true);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ cno a(bss bssVar) {
        bsp bspVar = bssVar.c;
        bspVar.getClass();
        ciq ciqVar = new ciq();
        List list = bspVar.e;
        return new chz(bssVar, this.a, !list.isEmpty() ? new cmh(ciqVar, list) : ciqVar, this.g, this.e.c(bssVar), this.d);
    }

    @Override // defpackage.cnl
    @Deprecated
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(boolean z) {
        ((fsz) this.g.a).a = z;
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void d(dbl dblVar) {
        dblVar.getClass();
        ((fsz) this.g.a).b = dblVar;
    }
}
