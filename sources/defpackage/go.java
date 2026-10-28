package defpackage;

import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class go implements ja {
    private final /* synthetic */ int $cid;
    final /* synthetic */ gp a;

    public go(gp gpVar, int i) {
        this.$cid = i;
        this.a = gpVar;
    }

    @Override // defpackage.ja
    public final void a(iq iqVar, boolean z) {
        if (this.$cid != 0) {
            this.a.K(iqVar);
            return;
        }
        iq iqVarA = iqVar.a();
        iq iqVar2 = iqVarA != iqVar ? iqVarA : iqVar;
        gp gpVar = this.a;
        gn gnVarF = gpVar.F(iqVar2);
        if (gnVarF != null) {
            if (iqVarA == iqVar) {
                gpVar.L(gnVarF, z);
            } else {
                gpVar.J(gnVarF.a, gnVarF, iqVarA);
                gpVar.L(gnVarF, true);
            }
        }
    }

    @Override // defpackage.ja
    public final boolean b(iq iqVar) {
        Window.Callback callbackH;
        if (this.$cid != 0) {
            Window.Callback callbackH2 = this.a.H();
            if (callbackH2 != null) {
                callbackH2.onMenuOpened(108, iqVar);
            }
        } else if (iqVar == iqVar.a()) {
            gp gpVar = this.a;
            if (gpVar.v && (callbackH = gpVar.H()) != null && !gpVar.B) {
                callbackH.onMenuOpened(108, iqVar);
            }
        }
        return true;
    }
}
