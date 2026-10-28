package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mpn implements ntk {
    final /* synthetic */ ntq a;
    final /* synthetic */ nru b;
    final /* synthetic */ nsl c;
    final /* synthetic */ mpo d;
    final /* synthetic */ omj e;

    public mpn(mpo mpoVar, omj omjVar, ntq ntqVar, nru nruVar, nsl nslVar) {
        this.e = omjVar;
        this.a = ntqVar;
        this.b = nruVar;
        this.c = nslVar;
        this.d = mpoVar;
    }

    @Override // defpackage.ntk
    public final void a(View view, nxg nxgVar, nxg nxgVar2, float f, float f2) {
        if (nxgVar != null) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            aslp aslpVarG = mpo.g(view);
            aslo asloVarF = mpo.f(view, nxgVar, iArr[0], iArr[1]);
            aslo asloVarF2 = mpo.f(view, nxgVar2, iArr[0], iArr[1]);
            aihf aihfVarCreateBuilder = asob.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            asob asobVar = (asob) aihfVarCreateBuilder.instance;
            asobVar.b |= 1;
            asobVar.c = f;
            aihfVarCreateBuilder.copyOnWrite();
            asob asobVar2 = (asob) aihfVarCreateBuilder.instance;
            asobVar2.b |= 2;
            asobVar2.d = f2;
            asob asobVar3 = (asob) aihfVarCreateBuilder.build();
            aihf aihfVarCreateBuilder2 = aslt.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aslt asltVar = (aslt) aihfVarCreateBuilder2.instance;
            asloVarF.getClass();
            asltVar.d = asloVarF;
            asltVar.c |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            aslt asltVar2 = (aslt) aihfVarCreateBuilder2.instance;
            asloVarF2.getClass();
            asltVar2.e = asloVarF2;
            asltVar2.c |= 2;
            aihfVarCreateBuilder2.copyOnWrite();
            aslt asltVar3 = (aslt) aihfVarCreateBuilder2.instance;
            asobVar3.getClass();
            asltVar3.f = asobVar3;
            asltVar3.c |= 4;
            aslt asltVar4 = (aslt) aihfVarCreateBuilder2.build();
            aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
            aihhVar.e(aslt.b, asltVar4);
            aihhVar.e(aslp.b, aslpVarG);
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = (SenderStateOuterClass$SenderState) aihhVar.build();
            mpo mpoVar = this.d;
            omj omjVar = this.e;
            ntq ntqVar = this.a;
            nru nruVar = this.b;
            nsl nslVar = this.c;
            mpoVar.i(mpoVar.b.a(omjVar.x(), mpo.j(view, null, 7, nxgVar, senderStateOuterClass$SenderState, ntqVar, nruVar, nslVar, null)).f(mpoVar.d.a(nslVar)).D(), nslVar);
        }
    }
}
