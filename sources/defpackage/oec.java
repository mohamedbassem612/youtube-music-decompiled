package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oec implements aupn {
    private final /* synthetic */ int $cid;
    private final aupr a;
    private final aupr b;
    private final aupr c;

    public oec(aupr auprVar, aupr auprVar2, aupr auprVar3, int i) {
        this.$cid = i;
        this.a = auprVar;
        this.b = auprVar2;
        this.c = auprVar3;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        int i = this.$cid;
        if (i == 0) {
            aupr auprVar = this.c;
            Context context = (Context) ((aupo) this.a).b;
            return new ahgb(context, context.getSharedPreferences("pcvmspf2", 0), aupm.b(this.b), (omj) auprVar.io());
        }
        if (i == 1) {
            return new ody((Context) ((aupo) this.a).b, (ExecutorService) ((aupo) this.b).b, (obk) this.c.io());
        }
        if (i == 2) {
            return new xsc((File) this.a.io(), (kto) this.c.io(), (omj) this.b.io(), (boolean[]) null);
        }
        return new xsc((ahgb) this.b.io(), (ExecutorService) ((aupo) this.a).b, (omj) this.c.io(), (boolean[]) null);
    }

    public oec(aupr auprVar, aupr auprVar2, aupr auprVar3, int i, char[] cArr) {
        this.$cid = i;
        this.a = auprVar;
        this.c = auprVar2;
        this.b = auprVar3;
    }

    public oec(aupr auprVar, aupr auprVar2, aupr auprVar3, int i, short[] sArr) {
        this.$cid = i;
        this.b = auprVar;
        this.a = auprVar2;
        this.c = auprVar3;
    }
}
