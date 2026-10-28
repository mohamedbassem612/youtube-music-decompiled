package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ocx implements aupn {
    private final /* synthetic */ int $cid;
    private final aupr a;
    private final aupr b;
    private final aupr c;
    private final aupr d;

    public ocx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, int i) {
        this.$cid = i;
        this.a = auprVar;
        this.b = auprVar2;
        this.c = auprVar3;
        this.d = auprVar4;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        switch (this.$cid) {
            case 0:
                return new ocw((fxg) ((aupo) this.a).b, (Map) ((aupo) this.b).b, (oaq) ((aupo) this.c).b, (omj) this.d.io());
            case 1:
                Object obj = ((aupo) this.c).b;
                aupr auprVar = this.a;
                return new obj(aupm.b(this.b), aupm.b(auprVar), (ExecutorService) obj, aupm.b(this.d));
            case 2:
                Object obj2 = ((aupo) this.b).b;
                return new odb((fxg) obj2, (ocu) this.c.io(), (Context) ((aupo) this.a).b, (omj) this.d.io());
            case 3:
                Object obj3 = ((aupo) this.b).b;
                return new odc((fxg) obj3, (ocu) this.a.io(), (oaq) ((aupo) this.c).b, (omj) this.d.io());
            case 4:
                Object obj4 = ((aupo) this.c).b;
                return new odf((fxg) obj4, (ocu) this.a.io(), (Map) ((aupo) this.b).b, (omj) this.d.io());
            case 5:
                Object obj5 = ((aupo) this.c).b;
                return new odg((fxg) obj5, (ocu) this.a.io(), (Map) ((aupo) this.b).b, (omj) this.d.io());
            case 6:
                Object obj6 = ((aupo) this.b).b;
                return new odh((fxg) obj6, (ocu) this.c.io(), (Context) ((aupo) this.a).b, (omj) this.d.io());
            case 7:
                return new odp((Context) ((aupo) this.a).b, (omj) this.d.io(), (ocd) this.c.io(), (oaq) ((aupo) this.b).b);
            default:
                Object obj7 = ((aupo) this.a).b;
                return new oeo((Context) obj7, (omj) this.d.io(), (oaq) ((aupo) this.b).b, (ahex) this.c.io());
        }
    }

    public ocx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, int i, byte[] bArr) {
        this.$cid = i;
        this.b = auprVar;
        this.a = auprVar2;
        this.c = auprVar3;
        this.d = auprVar4;
    }

    public ocx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, int i, char[] cArr) {
        this.$cid = i;
        this.b = auprVar;
        this.c = auprVar2;
        this.a = auprVar3;
        this.d = auprVar4;
    }

    public ocx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, int i, int[] iArr) {
        this.$cid = i;
        this.c = auprVar;
        this.a = auprVar2;
        this.b = auprVar3;
        this.d = auprVar4;
    }

    public ocx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, int i, byte[][] bArr) {
        this.$cid = i;
        this.a = auprVar;
        this.d = auprVar2;
        this.c = auprVar3;
        this.b = auprVar4;
    }

    public ocx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, int i, char[][] cArr) {
        this.$cid = i;
        this.a = auprVar;
        this.d = auprVar2;
        this.b = auprVar3;
        this.c = auprVar4;
    }
}
