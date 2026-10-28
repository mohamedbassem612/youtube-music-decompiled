package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oan implements aupn {
    private final /* synthetic */ int $cid;
    private final Object a;

    public oan(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [aupr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [aupr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [aupr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [aupr, java.lang.Object] */
    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        Object ocdVar;
        switch (this.$cid) {
            case 0:
                ahex ahexVarA = MoreExecutors.a((ExecutorService) ((aupo) this.a).b);
                ahexVarA.getClass();
                return ahexVarA;
            case 1:
                File dir = ((Context) ((aupo) this.a).b).getDir("yqzdkcache", 0);
                dir.getClass();
                return dir;
            case 2:
                DisplayMetrics displayMetrics = ((Context) ((aupo) this.a).b).getResources().getDisplayMetrics();
                displayMetrics.getClass();
                return displayMetrics;
            case 3:
                ocdVar = new ocd((omj) this.a.io());
                break;
            case 4:
                obq obqVar = (obq) new aerj((oat) ((oar) this.a).io().a).b.io();
                obqVar.getClass();
                return obqVar;
            case 5:
                oat oatVar = (oat) ((oas) this.a).io().a;
                aupr auprVar = oatVar.n;
                aupr auprVar2 = oatVar.d;
                aupr auprVar3 = oatVar.b;
                aupr auprVarC = aupm.c(new oec(auprVar3, auprVar2, auprVar, 1));
                aupr auprVarC2 = aupm.c(new oeb(auprVar3, auprVarC));
                aupr auprVar4 = oatVar.k;
                aupr auprVar5 = oatVar.c;
                aupr auprVar6 = oatVar.v;
                aupr auprVarC3 = aupm.c(new oea(auprVarC2, auprVar6, auprVar5, auprVar4, 2, (char[]) null));
                aupr auprVarC4 = aupm.c(new oec(aupm.c(new oec(auprVar3, auprVarC2, auprVar6, 0)), auprVar2, auprVar6, 3, (short[]) null));
                aupr auprVarC5 = aupm.c(new oek(oatVar.K));
                aupr auprVarC6 = aupm.c(oed.a);
                obq obqVar2 = (obq) aupm.c(new oea(aupm.c(new oeg(auprVarC3, aupm.c(new oej(auprVar3, auprVarC2, auprVarC4, auprVar6, auprVar2, aupm.c(new oec(auprVarC5, auprVarC6, auprVar6, 2, (char[]) null)), auprVarC)), auprVarC4, auprVar6, oatVar.l, auprVar4, 1, null)), aupm.c(new oeg(aupm.c(new oee(auprVar3, aupm.c(new oea(auprVar3, auprVar4, oatVar.G, auprVar6, 0)), auprVarC, auprVarC6, auprVar4)), auprVarC4, auprVarC3, auprVar6, auprVar2, auprVar4, 0)), auprVarC4, auprVar4, 1, (byte[]) null)).io();
                obqVar2.getClass();
                return obqVar2;
            case 6:
                return new oex();
            case 7:
                return ((oml) this.a).a;
            case 8:
                Object obj = ((oml) this.a).b;
                obj.getClass();
                return obj;
            case 9:
                return ((omm) this.a).b;
            case 10:
                return ((omm) this.a).a;
            case 11:
                return ((omn) this.a).c;
            case 12:
                return ((omn) this.a).k;
            case 13:
                return ((old) this.a).io();
            case 14:
                return ((omn) this.a).h;
            case 15:
                return ((omn) this.a).e;
            case 16:
                Object obj2 = ((omn) this.a).b;
                obj2.getClass();
                return obj2;
            case 17:
                return ((olf) this.a).io();
            case 18:
                return ((omn) this.a).f;
            case 19:
                Object obj3 = ((omn) this.a).a;
                obj3.getClass();
                return obj3;
            default:
                ocdVar = new omj((mbc) this.a.io());
                break;
        }
        return ocdVar;
    }
}
