package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aekt extends adsv implements aeks {
    public final vxe a;
    public final aqso b;
    public final admu c;
    private final Context d;

    public aekt(aqso aqsoVar, Context context, vxe vxeVar) {
        this.d = context;
        this.a = vxeVar;
        this.b = aqsoVar;
        admu admuVar = new admu();
        this.c = admuVar;
        admuVar.add(aqsoVar);
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.c;
    }

    @Override // defpackage.aeks
    public final void c(admh admhVar) {
        admhVar.d(aqso.class, new jcx(this.d, this, 12));
    }

    @Override // defpackage.aeks
    public final void b(List list) {
    }
}
