package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nph implements axo {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nph(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.axo
    public final void accept(Object obj) {
        asro asroVar;
        int i = this.$cid;
        if (i == 0) {
            int i2 = npi.a;
            Object objJ = ((fhu) ((Pair) obj).second).j();
            if (objJ instanceof npg) {
                Object obj2 = this.b;
                ?? r10 = this.a;
                npg npgVar = (npg) objJ;
                ArrayList<npg> arrayList = npgVar.d;
                if (arrayList.isEmpty()) {
                    String strZ = ahno.Z(npgVar.c);
                    if (r10.add(strZ)) {
                        ((agkh) obj2).e(strZ, objJ);
                        return;
                    }
                    return;
                }
                for (npg npgVar2 : arrayList) {
                    if (npgVar2 != null) {
                        String strZ2 = ahno.Z(npgVar2.c);
                        if (r10.add(strZ2)) {
                            ((agkh) obj2).e(strZ2, npgVar2);
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i != 1) {
            Object obj3 = this.b;
            Object obj4 = this.a;
            ((yyv) obj4).k.post(new yag(obj4, obj3, (zhz) obj, 7));
            return;
        }
        Pair pair = (Pair) obj;
        int i3 = npb.e;
        int[] iArr = (int[]) pair.first;
        fhu fhuVar = (fhu) pair.second;
        Object objJ2 = fhuVar.j();
        boolean z = objJ2 instanceof npg;
        Object obj5 = this.a;
        if (z) {
            npg npgVar3 = (npg) objJ2;
            ArrayList<npg> arrayList2 = npgVar3.d;
            if (arrayList2.isEmpty()) {
                ((aihf) obj5).cE(npgVar3.a());
            } else {
                for (npg npgVar4 : arrayList2) {
                    if (npgVar4 != null) {
                        ((aihf) obj5).cE(npgVar4.a());
                    }
                }
            }
        }
        String strL = fhuVar.l();
        if (strL == null) {
            asroVar = null;
        } else {
            aihf aihfVarCreateBuilder = asro.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            asro asroVar2 = (asro) aihfVarCreateBuilder.instance;
            asroVar2.b |= 1;
            asroVar2.c = strL;
            Rect rectA = fhuVar.a();
            aihf aihfVarCreateBuilder2 = asrk.a.createBuilder();
            int i4 = iArr[0] + rectA.left;
            aihfVarCreateBuilder2.copyOnWrite();
            asrk asrkVar = (asrk) aihfVarCreateBuilder2.instance;
            asrkVar.b |= 1;
            asrkVar.c = i4;
            int i5 = iArr[1] + rectA.top;
            aihfVarCreateBuilder2.copyOnWrite();
            asrk asrkVar2 = (asrk) aihfVarCreateBuilder2.instance;
            asrkVar2.b |= 2;
            asrkVar2.d = i5;
            float fWidth = rectA.width();
            aihfVarCreateBuilder2.copyOnWrite();
            asrk asrkVar3 = (asrk) aihfVarCreateBuilder2.instance;
            asrkVar3.b |= 4;
            asrkVar3.e = fWidth;
            float fHeight = rectA.height();
            aihfVarCreateBuilder2.copyOnWrite();
            asrk asrkVar4 = (asrk) aihfVarCreateBuilder2.instance;
            asrkVar4.b |= 8;
            asrkVar4.f = fHeight;
            asrk asrkVar5 = (asrk) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            asro asroVar3 = (asro) aihfVarCreateBuilder.instance;
            asrkVar5.getClass();
            asroVar3.d = asrkVar5;
            asroVar3.b |= 2;
            fwo fwoVarI = fhuVar.i();
            asrn asrnVarD = npb.d(fwoVarI.k(1), fwoVarI.k(2), fwoVarI.k(3), fwoVarI.k(4));
            if (asrnVarD != null) {
                aihfVarCreateBuilder.copyOnWrite();
                asro asroVar4 = (asro) aihfVarCreateBuilder.instance;
                asroVar4.e = asrnVarD;
                asroVar4.b |= 8;
            }
            asrn asrnVarD2 = npb.d(fwoVarI.j(1), fwoVarI.j(2), fwoVarI.j(3), fwoVarI.j(4));
            if (asrnVarD2 != null) {
                aihfVarCreateBuilder.copyOnWrite();
                asro asroVar5 = (asro) aihfVarCreateBuilder.instance;
                asroVar5.f = asrnVarD2;
                asroVar5.b |= 16;
            }
            asrn asrnVarD3 = npb.d(fwoVarI.l(1), fwoVarI.l(2), fwoVarI.l(3), fwoVarI.l(4));
            if (asrnVarD3 != null) {
                aihfVarCreateBuilder.copyOnWrite();
                asro asroVar6 = (asro) aihfVarCreateBuilder.instance;
                asroVar6.g = asrnVarD3;
                asroVar6.b |= 32;
            }
            double d = ((DisplayMetrics) this.b).density;
            aihfVarCreateBuilder.copyOnWrite();
            asro asroVar7 = (asro) aihfVarCreateBuilder.instance;
            asroVar7.b |= 64;
            asroVar7.h = d;
            asroVar = (asro) aihfVarCreateBuilder.build();
        }
        if (asroVar != null) {
            aihf aihfVar = (aihf) obj5;
            aihfVar.copyOnWrite();
            asrp asrpVar = (asrp) aihfVar.instance;
            asrp asrpVar2 = asrp.a;
            aiie aiieVar = asrpVar.e;
            if (!aiieVar.c()) {
                asrpVar.e = aihn.mutableCopy(aiieVar);
            }
            asrpVar.e.add(asroVar);
        }
    }
}
