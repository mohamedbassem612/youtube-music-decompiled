package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abpm implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ abpm(abps abpsVar, String str, abri abriVar, wlo wloVar, long j, int i) {
        this.$cid = i;
        this.b = abpsVar;
        this.c = str;
        this.d = abriVar;
        this.e = wloVar;
        this.a = j;
    }

    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        Instant instantMinusSeconds;
        if (this.$cid != 0) {
            if (((Boolean) obj).booleanValue()) {
                return aher.a;
            }
            return ((xgg) this.c).t((oip) this.b, (oin) this.e, (oiz) this.d, this.a);
        }
        tnx tnxVar = (tnx) obj;
        abmw abmwVar = abmw.MEDIASESSION;
        Object obj2 = this.c;
        String.valueOf(obj2);
        String str = ((abri) this.d).a;
        tnxVar.h();
        if (tnxVar.h()) {
            tnxVar.c();
        }
        ((tmn) this.e).q();
        if (!tnxVar.h()) {
            return ahng.m(tnxVar.a().a);
        }
        abrk abrkVarA = ((abps) this.b).d.A((String) obj2, this.a);
        tnw tnwVarC = tnxVar.c();
        Object obj3 = tnwVarC.a;
        alvt alvtVar = obj3 != null ? (alvt) obj3 : alvt.a;
        alvtVar.getClass();
        String str2 = abrkVarA.d;
        alvw alvwVar = alvtVar.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        String str3 = alvwVar.c;
        tmt tmtVar = tnwVarC.b;
        wjg wjgVar = new wjg();
        wjgVar.b = alvtVar;
        if (tmtVar == null) {
            instantMinusSeconds = abrkVarA.a.a();
        } else {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(tmtVar.g);
            alop alopVar = alvtVar.d;
            if (alopVar == null) {
                alopVar = alop.a;
            }
            instantMinusSeconds = instantOfEpochMilli.minusSeconds(alopVar.e);
        }
        wjgVar.c = instantMinusSeconds;
        wjgVar.b(abrkVarA.e);
        wjgVar.h = abrkVarA.b;
        wjgVar.e = tnwVarC.c;
        wjgVar.a = tnwVarC.d;
        wji wjiVarA = wjgVar.a();
        for (wjw wjwVar : abrkVarA.c) {
            if (wjwVar != null) {
                wjwVar.a(wjiVarA);
            }
        }
        return ahng.n(wjiVarA);
    }

    public /* synthetic */ abpm(xgg xggVar, oip oipVar, oin oinVar, oiz oizVar, long j, int i) {
        this.$cid = i;
        this.c = xggVar;
        this.b = oipVar;
        this.e = oinVar;
        this.d = oizVar;
        this.a = j;
    }
}
