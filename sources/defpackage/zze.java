package defpackage;

import android.util.Pair;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zze implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zze(aahg aahgVar, wcn wcnVar, int i) {
        this.$cid = i;
        this.a = aahgVar;
        this.b = wcnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [abvn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, wek] */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aobh aobhVarA = aobh.a(((aobm) obj).c);
            if (aobhVarA == null) {
                aobhVarA = aobh.UNRECOGNIZED;
            }
            Object obj2 = this.a;
            Object obj3 = this.b;
            return aobhVarA == aobh.NETWORK_QUALITY_BUCKET_OFFLINE ? avlh.ab(((vxz) obj3).c(51, 45778122L, 5L), TimeUnit.SECONDS, (avmb) obj2) : avlh.ab(((vxz) obj3).c(50, 45778121L, 5L), TimeUnit.SECONDS, (avmb) obj2);
        }
        if (i == 1) {
            return ((vux) obj).ordinal() != 1 ? this.a : this.b;
        }
        if (i == 2) {
            weo weoVarB = (weo) obj;
            wfn wfnVarC = wfs.c(weoVarB.a);
            String str = wfnVarC.a;
            aaha aahaVarE = aahb.e();
            aahaVarE.b(str);
            aahaVarE.c(wfnVarC.b);
            aahaVarE.a = aahc.a(weoVarB);
            aahg aahgVar = (aahg) this.a;
            if (aahgVar.f.l(224, 45831962L, false)) {
                weh wehVar = weoVarB.c;
                if (wehVar instanceof aoop) {
                    ?? r7 = this.b;
                    aaun aaunVar = new aaun(weoVarB);
                    aaunVar.b = aahgVar.k((aoop) wehVar).I((wek) r7);
                    weoVarB = aaunVar.b();
                }
            }
            aahaVarE.b = weoVarB;
            return aahaVarE.a();
        }
        if (i == 3) {
            abmt abmtVar = ((abge) ((aber) this.b).a).B;
            aboe aboeVar = (aboe) obj;
            acip acipVarA = null;
            if (abmtVar != null && abmtVar.aD() && aboeVar.b != null) {
                acipVarA = this.a.q().a(aboeVar.b);
            }
            return Pair.create(acipVarA, aboeVar);
        }
        if (((Boolean) obj).booleanValue()) {
            int i2 = avlh.a;
            avlh avlhVar = avtj.b;
            avnn avnnVar = atqp.j;
            return avlhVar;
        }
        long j = ((adsr) this.b).u;
        if (j > 0) {
            return avlh.ab(j, TimeUnit.MILLISECONDS, (avmb) this.a);
        }
        int i3 = avlh.a;
        avuu avuuVar = new avuu(0L);
        avnn avnnVar2 = atqp.j;
        return avuuVar;
    }

    public /* synthetic */ zze(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
