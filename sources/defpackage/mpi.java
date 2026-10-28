package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mpi implements ntn {
    final /* synthetic */ ntq a;
    final /* synthetic */ nru b;
    final /* synthetic */ nsl c;
    final /* synthetic */ mpo d;
    final /* synthetic */ omj e;

    public mpi(mpo mpoVar, omj omjVar, ntq ntqVar, nru nruVar, nsl nslVar) {
        this.e = omjVar;
        this.a = ntqVar;
        this.b = nruVar;
        this.c = nslVar;
        this.d = mpoVar;
    }

    @Override // defpackage.ntn
    public final void a(View view, nxg nxgVar) {
        CommandOuterClass$Command commandOuterClass$CommandX = this.e.x();
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        mpo mpoVar = this.d;
        aslp aslpVarG = mpoVar.c ? mpo.g(view) : null;
        nry nryVar = mpoVar.b;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderStateH = mpo.h(nxgVar, displayMetrics, aslpVarG);
        ntq ntqVar = this.a;
        nru nruVar = this.b;
        nsl nslVar = this.c;
        mpoVar.i(nryVar.a(commandOuterClass$CommandX, mpo.j(view, null, 16, nxgVar, senderStateOuterClass$SenderStateH, ntqVar, nruVar, nslVar, null)).f(mpoVar.d.a(nslVar)).D(), nslVar);
    }
}
