package defpackage;

import android.os.Build;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vnn implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vnn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, vrp] */
    /* JADX WARN: Type inference failed for: r4v56, types: [java.lang.Object, ywj] */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.$cid) {
            case 0:
                Object obj = this.a;
                vnr vnrVar = (vnr) obj;
                vnrVar.y.q(vnrVar.a, ((vmz) obj).e, (vnb) obj);
                return vnrVar.C.r();
            case 1:
                return this.a;
            case 2:
                Object obj2 = this.a;
                xgn xgnVar = ((vmz) obj2).e;
                vnr vnrVar2 = (vnr) obj2;
                return vnrVar2.E.K(vnrVar2, xgnVar);
            case 3:
                Object obj3 = this.a;
                xgn xgnVar2 = ((vmz) obj3).e;
                vnr vnrVar3 = (vnr) obj3;
                return vnrVar3.x.b(vnrVar3.a(), xgnVar2);
            case 4:
                Object obj4 = this.a;
                xgn xgnVar3 = ((vmz) obj4).e;
                vnr vnrVar4 = (vnr) obj4;
                return vnrVar4.d.a(vnrVar4.a(), xgnVar3);
            case 5:
                Object obj5 = this.a;
                xgn xgnVar4 = ((vmz) obj5).e;
                vnr vnrVar5 = (vnr) obj5;
                return vnrVar5.A.h(vnrVar5.b, xgnVar4);
            case 6:
                Object obj6 = this.a;
                return ((vnr) obj6).D.ac(((vmz) obj6).e);
            case 7:
                vro vroVarA = this.a.c().a();
                vroVarA.getClass();
                return vroVarA;
            case 8:
                aihl aihlVarCheckIsLite = aihn.checkIsLite(appe.b);
                aihi aihiVar = (aihi) this.a;
                aihiVar.c(aihlVarCheckIsLite);
                if (!aihiVar.j.n(aihlVarCheckIsLite.d)) {
                    return Optional.empty();
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(appe.b);
                aihiVar.c(aihlVarCheckIsLite2);
                Object objK = aihiVar.j.k(aihlVarCheckIsLite2.d);
                return Optional.of(new wnx((appe) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))));
            case 9:
                return xpc.g((dii) this.a);
            case 10:
                Optional optionalOfNullable = Optional.ofNullable(((ycj) this.a).A);
                return true == optionalOfNullable.isPresent() ? Optional.ofNullable(((ycr) optionalOfNullable.get()).e()) : optionalOfNullable;
            case 11:
                return Long.valueOf(((zcf) this.a).g);
            case 12:
                return Integer.valueOf(((wiu) this.a).q());
            case 13:
                return this.a.b();
            case 14:
                zoz zozVar = ((zpb) this.a).d;
                int lineCount = zozVar.getLineCount();
                if (Build.VERSION.SDK_INT >= 29 && (zozVar.getText() == null || zozVar.getText().length() == 0)) {
                    lineCount = zow.a(zozVar);
                }
                return zozVar.f(lineCount, zozVar.getLineHeight());
            case 15:
                zpr zprVar = ((zpb) this.a).m;
                if (zprVar != null) {
                    zprVar.e();
                }
                return aher.a;
            case 16:
            case 17:
            case 18:
                return this.a;
            case 19:
                return (ListenableFuture) ((Pair) this.a).first;
            default:
                return this.a;
        }
    }
}
