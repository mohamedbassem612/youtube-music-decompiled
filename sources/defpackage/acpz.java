package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acpz extends acrp {
    public final boolean s;
    private final View y;
    private final TextView z;

    public acpz(tqj tqjVar, aenu aenuVar, ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        super(tqjVar, aenuVar, (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(true != z ? R.layout.reel_player_end_page : R.layout.reel_player_end_page_vert, viewGroup, false));
        View viewFindViewById = this.a.findViewById(R.id.reel_end_page_spinner_vertical);
        this.y = viewFindViewById;
        TextView textView = (TextView) this.a.findViewById(R.id.reel_end_page_label_vertical);
        this.z = textView;
        this.s = z2;
        if (!z2 && z && z3) {
            acfz.I(viewFindViewById, false);
            acfz.I(textView, true);
            return;
        }
        if (textView != null && z2) {
            textView.setText("");
        }
        acfz.I(viewFindViewById, true);
        acfz.I(textView, false);
    }

    @Override // defpackage.aenw
    protected final boolean E() {
        int i = tqr.a;
        return !this.A.k(1073830292);
    }

    @Override // defpackage.acrp
    public final boolean F() {
        return false;
    }

    @Override // defpackage.acrp
    public final void D() {
    }

    @Override // defpackage.acrp
    protected final void C(acra acraVar) {
    }
}
