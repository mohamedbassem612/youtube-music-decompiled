package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeku extends adsv implements aeks, aemu {
    private final Context a;
    private final vxe b;
    private final admu c;

    public aeku(aqsq aqsqVar, Context context, vxe vxeVar) {
        this.a = context;
        this.b = vxeVar;
        admu admuVar = new admu();
        this.c = admuVar;
        aqsqVar.getClass();
        admuVar.add(aqsqVar);
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.c;
    }

    @Override // defpackage.aeks
    public final void c(admh admhVar) {
        admhVar.d(aqsq.class, new jcx(this.a, this.b, 13));
    }

    @Override // defpackage.aemu
    public final void e(alay alayVar) {
        admu admuVar = this.c;
        aihf builder = ((aqsq) admuVar.get(0)).toBuilder();
        builder.copyOnWrite();
        aqsq aqsqVar = (aqsq) builder.instance;
        alayVar.getClass();
        aqsqVar.d = alayVar;
        aqsqVar.b |= 2;
        admuVar.set(0, builder.build());
        admuVar.m();
    }

    @Override // defpackage.aeks
    public final void b(List list) {
    }
}
