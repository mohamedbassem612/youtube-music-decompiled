package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oej implements aupn {
    private final aupr a;
    private final aupr b;
    private final aupr c;
    private final aupr d;
    private final aupr e;
    private final aupr f;
    private final aupr g;

    public oej(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, aupr auprVar7) {
        this.a = auprVar;
        this.b = auprVar2;
        this.c = auprVar3;
        this.d = auprVar4;
        this.e = auprVar5;
        this.f = auprVar6;
        this.g = auprVar7;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* bridge */ /* synthetic */ Object io() {
        return new aczl((Context) ((aupo) this.a).b, aupm.b(this.b), (xsc) this.c.io(), (omj) this.d.io(), (ExecutorService) ((aupo) this.e).b, (xsc) this.f.io(), (kwc) this.g.io());
    }
}
