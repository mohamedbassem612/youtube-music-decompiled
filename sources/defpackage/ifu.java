package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ifu implements avno {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ifu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, wfl] */
    /* JADX WARN: Type inference failed for: r3v12, types: [awqg, java.lang.Object] */
    @Override // defpackage.avno
    public final boolean a(Object obj) {
        switch (this.$cid) {
            case 0:
                return a.n(this.a, obj);
            case 1:
                String str = ((weo) obj).a;
                agrf agrfVar = hqg.a;
                if (this.a != hpv.a.get(Integer.valueOf(wfs.b(str)))) {
                    return false;
                }
                break;
            case 2:
                if (((iwl) obj).equals(((jny) this.a).l)) {
                    return false;
                }
                break;
            case 3:
                aaxa aaxaVar = (aaxa) obj;
                rts rtsVar = (rts) this.a;
                if (rtsVar.M.booleanValue() || rtsVar.E.ao() || afxw.e(rtsVar.D).aR) {
                    return rtsVar.l(aaxaVar);
                }
                yvs yvsVar = rtsVar.G;
                yvs yvsVar2 = aaxaVar.a;
                if (!rts.m(yvsVar, yvsVar2)) {
                    return false;
                }
                rtsVar.G = yvsVar2;
                break;
                break;
            case 4:
                ((hed) this.a).a.a("EMP", "Error while persisting entity mutations");
                break;
            case 5:
                return a.n(this.a, obj);
            case 6:
                return TextUtils.equals(((tub) obj).h(), ((adsr) this.a).S);
            default:
                aecu aecuVar = (aecu) obj;
                if (!TextUtils.equals(aecuVar.d(), ((adsr) this.a).S)) {
                    return false;
                }
                aecuVar.f();
                break;
                break;
        }
        return true;
    }
}
