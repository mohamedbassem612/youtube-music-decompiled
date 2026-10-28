package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class acrp extends aenw {
    public static final /* synthetic */ int x = 0;
    public final ViewGroup t;
    public final ViewGroup u;
    public final View v;
    public acra w;

    public acrp(tqj tqjVar, aenu aenuVar, View view) {
        super(tqjVar, aenuVar, view);
        view.setTag(this);
        this.t = (ViewGroup) view.findViewById(R.id.reel_player_page_error);
        this.u = (ViewGroup) view.findViewById(R.id.reel_player_page_content);
        this.v = view.findViewById(R.id.reel_player_page_frame0);
    }

    protected abstract void C(acra acraVar);

    protected abstract void D();

    public abstract boolean F();

    @Override // defpackage.aenw
    protected final int G() {
        acra acraVar = this.w;
        if (acraVar != null) {
            return acok.a(acraVar.f);
        }
        return 83769;
    }

    public acvv H() {
        return null;
    }

    public Optional I() {
        return Optional.empty();
    }

    public Optional J() {
        return Optional.empty();
    }

    public final void K(acra acraVar) {
        if (this.w != acraVar) {
            this.w = acraVar;
            acraVar.i = this;
            String strE = acraVar.e();
            ajwo ajwoVar = acraVar.f;
            if (super.V() && E()) {
                if (super.U() && !Objects.equals(this.F, strE)) {
                    this.H = null;
                    this.G = null;
                }
                this.F = strE;
                this.E = ajwoVar;
                if (!super.U()) {
                    aeno aenoVarR = R();
                    if (aenoVarR != null) {
                        aenu aenuVar = this.B;
                        aenuVar.h(new aens(aenoVarR, aent.CREATED), null);
                        this.G = aenuVar.c(strE);
                        this.C = true;
                    }
                } else if (this.G != null) {
                    this.C = true;
                } else {
                    aeno aenoVarR2 = R();
                    if (aenoVarR2 != null) {
                        this.G = this.B.b(aenoVarR2);
                        this.C = true;
                    }
                }
            }
            C(acraVar);
        }
    }

    public final void L() {
        aenr aenrVarS;
        if (super.V() && E()) {
            tqj tqjVar = this.A;
            int i = tqr.a;
            if (!tqjVar.k(1073829816) || this.F == null || (aenrVarS = S()) == null) {
                return;
            }
            this.B.h(new aens(aenrVarS.c, aent.DESTROYED), aenrVarS);
        }
    }

    public final void M() {
        aenr aenrVarS;
        if (super.V() && E() && this.F != null && (aenrVarS = S()) != null) {
            aeno aenoVar = aenrVarS.c;
            if (this.D) {
                this.B.h(new aens(aenoVar, aent.HIDDEN), aenrVarS);
                this.D = false;
            }
            if (this.C) {
                this.B.h(new aens(aenoVar, aent.CLOSED), aenrVarS);
                this.C = false;
            }
            this.E = null;
        }
        D();
        ViewGroup viewGroup = this.t;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(8);
        }
        acra acraVar = this.w;
        if (acraVar != null) {
            acraVar.i = null;
            acraVar.g();
            this.w = null;
        }
    }

    public void O(boolean z) {
        aenr aenrVarS;
        aeno aenoVarR;
        if (super.V() && E() && this.F != null) {
            tqj tqjVar = this.A;
            int i = tqr.a;
            if (tqjVar.k(1073830265)) {
                aenrVarS = this.B.c(this.F);
                this.G = aenrVarS;
            } else {
                aenrVarS = S();
            }
            if (aenrVarS == null && (aenoVarR = R()) != null) {
                boolean zU = super.U();
                aenu aenuVar = this.B;
                aenrVarS = zU ? aenuVar.b(aenoVarR) : aenuVar.a(aenoVarR);
                this.G = aenrVarS;
            }
            aeno aenoVar = aenrVarS.c;
            if (super.W() && !super.T()) {
                this.B.h(new aens(aenoVar, aent.REQUESTED), aenrVarS);
            }
            if (!this.C) {
                if (!tqjVar.k(1073830253)) {
                    aenu aenuVar2 = this.B;
                    aenuVar2.h(new aens(aenoVar, aent.CREATED), null);
                    aenrVarS = aenuVar2.c(this.F);
                    this.G = aenrVarS;
                }
                this.C = true;
            }
            if (super.W() && super.T()) {
                aenrVarS = this.B.d(aenoVar);
                this.G = aenrVarS;
            }
            if (!super.U() || aenrVarS == null) {
                this.B.k(this.F, G());
            } else {
                aenrVarS.c(G());
            }
            this.B.h(new aens(aenoVar, aent.ACTIVE), aenrVarS);
            this.D = true;
        }
    }

    public void P() {
        aenr aenrVarS;
        if (!super.V() || !E() || this.F == null || (aenrVarS = S()) == null) {
            return;
        }
        aenu aenuVar = this.B;
        aeno aenoVar = aenrVarS.c;
        aenuVar.h(new aens(aenoVar, aent.HIDDEN), aenrVarS);
        this.D = false;
        aenuVar.h(new aens(aenoVar, aent.CLOSED), aenrVarS);
        this.C = false;
    }

    public void N(aazn aaznVar) {
    }
}
