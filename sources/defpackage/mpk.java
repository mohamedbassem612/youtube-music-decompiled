package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mpk implements ntl {
    final /* synthetic */ ntq a;
    final /* synthetic */ nru b;
    final /* synthetic */ nsl c;
    final /* synthetic */ mpo d;
    final /* synthetic */ omj e;

    public mpk(mpo mpoVar, omj omjVar, ntq ntqVar, nru nruVar, nsl nslVar) {
        this.e = omjVar;
        this.a = ntqVar;
        this.b = nruVar;
        this.c = nslVar;
        this.d = mpoVar;
    }

    @Override // defpackage.ntl
    public final void a(View view, nxg nxgVar, MotionEvent motionEvent) {
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = null;
        if (view != null && nxgVar != null) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            aslo asloVarF = mpo.f(view, nxgVar, iArr[0], iArr[1]);
            aslp aslpVarG = mpo.g(view);
            aihf aihfVarCreateBuilder = aslu.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aslu asluVar = (aslu) aihfVarCreateBuilder.instance;
            asloVarF.getClass();
            asluVar.d = asloVarF;
            asluVar.c |= 1;
            aslu asluVar2 = (aslu) aihfVarCreateBuilder.build();
            aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
            aihhVar.e(aslu.b, asluVar2);
            aihhVar.e(aslp.b, aslpVarG);
            senderStateOuterClass$SenderState = (SenderStateOuterClass$SenderState) aihhVar.build();
        }
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = senderStateOuterClass$SenderState;
        mpo mpoVar = this.d;
        omj omjVar = this.e;
        ntq ntqVar = this.a;
        nru nruVar = this.b;
        nsl nslVar = this.c;
        mpoVar.i(mpoVar.b.a(omjVar.x(), mpo.j(view, null, 1, nxgVar, senderStateOuterClass$SenderState2, ntqVar, nruVar, nslVar, motionEvent)).f(mpoVar.d.a(nslVar)).D(), nslVar);
    }
}
