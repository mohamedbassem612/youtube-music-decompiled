package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeki extends adsv implements aeks {
    public final aqry a;
    public final aekz b;
    private final Context c;
    private final vxe d;
    private final xgn e;
    private final aeky f;
    private final admu g;
    private final ci h;

    public aeki(aqry aqryVar, Context context, vxe vxeVar, ci ciVar, xgn xgnVar, aeky aekyVar, aekz aekzVar) {
        aqryVar.getClass();
        this.a = aqryVar;
        this.c = context;
        this.d = vxeVar;
        this.h = ciVar;
        this.e = xgnVar;
        this.f = aekyVar;
        this.b = aekzVar;
        admu admuVar = new admu();
        this.g = admuVar;
        admuVar.add(aqryVar);
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.g;
    }

    @Override // defpackage.aeks
    public final void c(admh admhVar) {
        admhVar.d(aqry.class, new swo(this.c, this.d, this.h, this.e, new aehz(this.f, 19), this, 2));
    }

    @Override // defpackage.aeks
    public final void b(List list) {
    }
}
