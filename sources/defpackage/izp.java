package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class izp extends aevy {
    public advb k;
    protected ViewGroup l;
    public Object m;
    public ahek n;

    @Override // defpackage.aevy, defpackage.gs, defpackage.bp
    public final Dialog iH(Bundle bundle) {
        if (this.m == null) {
            dismiss();
        }
        aevw aevwVar = new aevw(requireContext(), 0);
        ViewGroup viewGroup = (ViewGroup) View.inflate(requireContext(), k(), null);
        this.l = viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.bottom_sheet_list);
        recyclerView.ah(new LinearLayoutManager(recyclerView.getContext()));
        adlq adlqVar = new adlq(false);
        adkz adkzVarM = m();
        if (adkzVarM != null) {
            adlqVar.m(-1, adkzVarM, true);
        }
        adlqVar.m(-1, l(), true);
        admh admhVar = (admh) this.k.io();
        admo admoVarD = this.n.d(admhVar);
        admoVarD.jR(n());
        admoVarD.D(adlqVar, null);
        p(admhVar, admoVarD);
        recyclerView.ad(admoVarD);
        aevwVar.setContentView(this.l);
        aevwVar.setCancelable(true);
        BottomSheetBehavior bottomSheetBehaviorX = BottomSheetBehavior.x((FrameLayout) aevwVar.findViewById(R.id.design_bottom_sheet));
        bottomSheetBehaviorX.D = true;
        if (twb.e(requireContext())) {
            bottomSheetBehaviorX.I(3);
        } else {
            bottomSheetBehaviorX.Q((int) (((double) requireActivity().getWindow().getDecorView().getHeight()) * 0.75d));
        }
        return aevwVar;
    }

    protected abstract int k();

    protected abstract adkz l();

    protected adkz m() {
        return null;
    }

    protected adlz n() {
        throw null;
    }

    protected void o(Dialog dialog) {
        Window window;
        int i;
        int i2;
        Context contextRequireContext = requireContext();
        if ((twm.u(contextRequireContext) || twm.v(contextRequireContext)) && (window = dialog.getWindow()) != null) {
            Context contextRequireContext2 = requireContext();
            TypedArray typedArrayObtainStyledAttributes = contextRequireContext2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.actionBarSize});
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            int i3 = twm.i(contextRequireContext2);
            if (twm.u(contextRequireContext2)) {
                i2 = dimension << 2;
            } else {
                if (twm.v(contextRequireContext2)) {
                    i2 = dimension << 1;
                } else {
                    i = -1;
                }
                window.setLayout(i, -1);
            }
            i = i3 - i2;
            window.setLayout(i, -1);
        }
        dialog.findViewById(R.id.container).setFitsSystemWindows(false);
        dialog.findViewById(R.id.coordinator).setFitsSystemWindows(false);
        final View viewFindViewById = dialog.findViewById(R.id.design_bottom_sheet);
        final View viewFindViewById2 = dialog.findViewById(R.id.container);
        ayx ayxVar = new ayx() { // from class: izo
            @Override // defpackage.ayx
            public final bbn a(View view, bbn bbnVar) {
                int iB;
                int iC;
                int iB2;
                int iC2;
                boolean zQ = this.a.q();
                if (zQ) {
                    iB = bbnVar.b();
                    iC = bbnVar.c();
                } else {
                    iB = 0;
                    iC = 0;
                }
                viewFindViewById.setPadding(iB, 0, iC, bbnVar.a());
                if (zQ) {
                    iB2 = 0;
                    iC2 = 0;
                } else {
                    iB2 = bbnVar.b();
                    iC2 = bbnVar.c();
                }
                viewFindViewById2.setPadding(iB2, 0, iC2, 0);
                return bbnVar;
            }
        };
        int i4 = bac.a;
        azs.c(viewFindViewById, ayxVar);
        viewFindViewById.addOnAttachStateChangeListener(new jld(viewFindViewById, 0));
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        RecyclerView recyclerView;
        Dialog dialog = this.f;
        if (dialog != null && (recyclerView = (RecyclerView) dialog.findViewById(R.id.bottom_sheet_list)) != null) {
            recyclerView.ad(null);
        }
        super.onDestroyView();
    }

    @Override // defpackage.bp, defpackage.cc
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f;
        if (dialog != null) {
            o(dialog);
        }
    }

    protected boolean q() {
        return false;
    }

    protected void p(admh admhVar, admo admoVar) {
    }
}
