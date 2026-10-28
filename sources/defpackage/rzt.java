package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rzt implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rzt(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, utu] */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.$cid) {
            case 0:
                return Arrays.asList((smr) ((adz) this.a).b);
            case 1:
                return Arrays.asList((smr) this.a);
            case 2:
                return Arrays.asList((smr) ((eqq) this.a).a);
            case 3:
                int i = sdi.a;
                return ((rzw) this.a).a(null);
            case 4:
                return ((tnm) this.a).e();
            case 5:
            case 7:
                return this.a;
            case 6:
                return ((tne) this.a).a;
            case 8:
                return ((tmu) this.a).b;
            case 9:
                return ((tnm) this.a).e();
            case 10:
                return this.a;
            case 11:
                StringBuilder sb = new StringBuilder("Could not find graphical segment with ID ");
                ?? r5 = this.a;
                sb.append(((uue) r5).a);
                return new utw(new IllegalArgumentException(sb.toString()), (utu) r5);
            case 12:
                uyq uyqVar = ((vae) this.a).e;
                return Boolean.FALSE;
            case 13:
                uyq uyqVar2 = ((vae) this.a).e;
                throw null;
            case 14:
                vae vaeVar = (vae) this.a;
                List list = vaeVar.i;
                return uxp.a(null, vaeVar.t());
            case 15:
                return ((aifs) this.a).toByteString();
            case 16:
                Object obj = this.a;
                xgn xgnVar = ((vmz) obj).e;
                vnr vnrVar = (vnr) obj;
                return vnrVar.E.K(vnrVar, xgnVar);
            case 17:
                Object obj2 = this.a;
                xgn xgnVar2 = ((vmz) obj2).e;
                vnr vnrVar2 = (vnr) obj2;
                return vnrVar2.x.b(vnrVar2.a(), xgnVar2);
            case 18:
                Object obj3 = this.a;
                xgn xgnVar3 = ((vmz) obj3).e;
                vnr vnrVar3 = (vnr) obj3;
                return vnrVar3.d.a(vnrVar3.a(), xgnVar3);
            case 19:
                Object obj4 = this.a;
                xgn xgnVar4 = ((vmz) obj4).e;
                vnr vnrVar4 = (vnr) obj4;
                return vnrVar4.A.h(vnrVar4.b, xgnVar4);
            default:
                Object obj5 = this.a;
                return ((vnr) obj5).D.ac(((vmz) obj5).e);
        }
    }
}
