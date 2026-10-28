package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xce extends xbn {
    public final View A;
    public final xdi B;
    public View C;
    public xdh D;
    public final vxz E;
    private final adbv F;
    private final ntu G;
    private final awmd H;
    private final awmd I;
    private RecyclerView J;
    private View K;
    private RecyclerView L;
    private advz M;
    private final mlo N;
    private xby O;
    private final vxz P;
    private final afip Q;
    private final aaok R;
    public final xgm z;

    public xce(Context context, advb advbVar, ahek ahekVar, xgm xgmVar, mlo mloVar, adbv adbvVar, vxz vxzVar, ntu ntuVar, awmd awmdVar, awmd awmdVar2, xpl xplVar, vxz vxzVar2, vxz vxzVar3, aaok aaokVar, afip afipVar, tqj tqjVar, xdi xdiVar, View view) {
        super(context, advbVar, ahekVar, xgmVar.hB(), xplVar, vxzVar2, vxzVar3, tqjVar);
        this.P = vxzVar;
        this.H = awmdVar;
        this.I = awmdVar2;
        this.A = view;
        this.z = xgmVar;
        this.N = mloVar;
        this.F = adbvVar;
        this.G = ntuVar;
        this.E = vxzVar3;
        this.R = aaokVar;
        this.Q = afipVar;
        this.B = xdiVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    @Override // defpackage.xbn, defpackage.wxr
    public final xby p() {
        xby xbyVar = this.O;
        if (xbyVar != null) {
            return xbyVar;
        }
        aaok aaokVar = this.R;
        View view = this.A;
        xgm xgmVar = this.z;
        ?? r2 = aaokVar.b;
        xgn xgnVarHB = xgmVar.hB();
        Context context = (Context) r2.io();
        context.getClass();
        advb advbVar = (advb) aaokVar.d.io();
        advbVar.getClass();
        ahey aheyVar = (ahey) aaokVar.a.io();
        aheyVar.getClass();
        ahek ahekVar = (ahek) aaokVar.c.io();
        ahekVar.getClass();
        view.getClass();
        xgnVarHB.getClass();
        xby xbyVar2 = new xby(context, advbVar, aheyVar, ahekVar, view, xgnVarHB);
        this.O = xbyVar2;
        return xbyVar2;
    }

    @Override // defpackage.xbn
    public final RecyclerView q() {
        RecyclerView recyclerView = this.J;
        if (recyclerView != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) this.A.findViewById(R.id.conversation_list);
        this.J = recyclerView2;
        return recyclerView2;
    }

    @Override // defpackage.xbn
    public final RecyclerView r() {
        if (this.L == null) {
            RecyclerView recyclerView = (RecyclerView) this.A.findViewById(R.id.ticker);
            this.L = recyclerView;
            recyclerView.setOnTouchListener(new vsl(2));
        }
        return this.L;
    }

    @Override // defpackage.xbn
    public final View s() {
        View view = this.K;
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.A.findViewById(R.id.more_comments_icon);
        this.K = viewFindViewById;
        return viewFindViewById;
    }

    @Override // defpackage.xbn
    public final advz t() {
        if (this.M == null) {
            adbv adbvVar = this.F;
            adbvVar.a();
            mlo mloVar = this.N;
            xgm xgmVar = this.z;
            vxz vxzVar = this.P;
            xgn xgnVarHB = xgmVar.hB();
            adcd adcdVar = (adcd) ((adbt) adbvVar.a()).a.get(adcb.LIVE_CHAT);
            adcdVar.getClass();
            this.M = new aebi(mloVar, xgnVarHB, adbvVar, vxzVar, adcdVar, this.G, this.Q, this.H, this.I);
        }
        return this.M;
    }
}
