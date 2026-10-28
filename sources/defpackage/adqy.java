package defpackage;

import android.graphics.Rect;
import app.rive.RiveFile;
import app.rive.ViewModelInstance;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adqy extends awpk implements awqk {
    int a;
    int b;
    final /* synthetic */ adqc c;
    final /* synthetic */ adrf d;
    final /* synthetic */ awut e;
    final /* synthetic */ awqg f;
    final /* synthetic */ Map g;
    final /* synthetic */ boolean h;
    final /* synthetic */ awrm i;
    final /* synthetic */ boc j;
    final /* synthetic */ adql k;
    final /* synthetic */ adrj l;
    final /* synthetic */ xir m;
    final /* synthetic */ awri n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqy(adqc adqcVar, adrf adrfVar, awut awutVar, awqg awqgVar, Map map, boolean z, awrm awrmVar, boc bocVar, adql adqlVar, adrj adrjVar, xir xirVar, awri awriVar, awoq awoqVar) {
        super(2, awoqVar);
        this.c = adqcVar;
        this.d = adrfVar;
        this.e = awutVar;
        this.f = awqgVar;
        this.g = map;
        this.h = z;
        this.i = awrmVar;
        this.j = bocVar;
        this.k = adqlVar;
        this.l = adrjVar;
        this.m = xirVar;
        this.n = awriVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new adqy(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((adqy) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df A[Catch: Exception -> 0x00e5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e5, blocks: (B:45:0x00db, B:47:0x00df), top: B:59:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Function0 function0;
        adrf adrfVar;
        Rect rect;
        awwd awwdVarF;
        adqj adqjVar;
        adqt adqqVar;
        xir xirVar;
        adrf adrfVar2;
        awqg awqgVar;
        boc bocVar;
        awox awoxVar = awox.a;
        int i2 = this.b;
        try {
            if (i2 != 0) {
                i = this.a;
                atqp.j(obj);
                if (i2 == 1) {
                }
                boolean z = this.g.isEmpty() || this.h || ((Boolean) obj).booleanValue();
                if ((i == 0 || z) && (function0 = this.d.m) != null) {
                    function0.invoke();
                }
                adrfVar = this.d;
                rect = adrfVar.l;
                if (!rect.isEmpty()) {
                    ((adqc) this.i.a).c(rect);
                }
                if (adrfVar.q) {
                    bocVar = this.j;
                    if (bocVar.a().a(bob.e)) {
                        awwdVarF = adrfVar.f((adqc) this.i.a, bocVar, this.e);
                    } else {
                        awwdVarF = null;
                    }
                } else {
                    awwdVarF = null;
                }
                adqjVar = new adqj(this.k, this.l, (adqc) this.i.a, this.f, null);
                if (awwdVarF == null && awwdVarF.q()) {
                    adqqVar = adqjVar.a(this.e, awwdVarF);
                } else {
                    adqqVar = new adqq(adqjVar);
                }
                adrfVar.f = adqqVar;
                awqgVar = adrfVar.n;
                if (awqgVar != null) {
                    awqgVar.invoke(this.c);
                }
                xirVar = this.m;
                if (xirVar != null) {
                    xirVar.n("aft");
                }
                adrfVar2 = this.d;
                if (adrfVar2.g == xirVar) {
                    adrfVar2.g = null;
                }
                this.n.a = true;
                return awmy.a;
            }
            atqp.j(obj);
            adqc adqcVar = this.c;
            adrf adrfVar3 = this.d;
            adqcVar.g = adrfVar3.e();
            adqh adqhVar = adrfVar3.h;
            ViewModelInstance viewModelInstance = adqcVar.c;
            int i3 = (adqhVar.l(viewModelInstance) || !adqhVar.k()) ? 0 : 1;
            RiveFile riveFile = adqcVar.b;
            this.a = i3;
            this.b = 1;
            if (adqh.a(adqhVar, viewModelInstance, riveFile, this) == awoxVar) {
                return awoxVar;
            }
            i = i3;
            awqgVar = adrfVar.n;
            if (awqgVar != null) {
                awqgVar.invoke(this.c);
            }
        } catch (Exception e) {
            ((agrc) ((agrc) adrf.a.b()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveSession", "mount$<anonymous>$<anonymous>", 336, "RiveSession.kt")).t("Error invoking onSessionLoaded during mount");
        }
        adrf adrfVar4 = this.d;
        adqc adqcVar2 = this.c;
        adps adpsVar = adrfVar4.i;
        RiveFile riveFile2 = adqcVar2.b;
        adpsVar.c(riveFile2);
        adrfVar4.j.d(riveFile2);
        awut awutVar = this.e;
        awqg awqgVar2 = this.f;
        this.a = i;
        this.b = 2;
        obj = adrfVar4.c(awutVar, awqgVar2, this);
        if (obj == awoxVar) {
            return awoxVar;
        }
        if (this.g.isEmpty()) {
        }
        if (i == 0) {
            function0.invoke();
        } else {
            function0.invoke();
        }
        adrfVar = this.d;
        rect = adrfVar.l;
        if (!rect.isEmpty()) {
            ((adqc) this.i.a).c(rect);
        }
        if (adrfVar.q) {
            bocVar = this.j;
            if (bocVar.a().a(bob.e)) {
                awwdVarF = adrfVar.f((adqc) this.i.a, bocVar, this.e);
            } else {
                awwdVarF = null;
            }
        } else {
            awwdVarF = null;
        }
        adqjVar = new adqj(this.k, this.l, (adqc) this.i.a, this.f, null);
        if (awwdVarF == null) {
            adqqVar = new adqq(adqjVar);
        } else {
            adqqVar = new adqq(adqjVar);
        }
        adrfVar.f = adqqVar;
        xirVar = this.m;
        if (xirVar != null) {
            xirVar.n("aft");
        }
        adrfVar2 = this.d;
        if (adrfVar2.g == xirVar) {
            adrfVar2.g = null;
        }
        this.n.a = true;
        return awmy.a;
    }
}
