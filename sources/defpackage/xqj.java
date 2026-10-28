package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.mdx.manualpairing.TvCodeEditText;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xqj extends xqb {
    public xqi a;

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        xqi xqiVar = this.a;
        View viewInflate = layoutInflater.inflate(R.layout.mdx_use_tv_code_fragment, viewGroup, false);
        Context context = viewInflate.getContext();
        TypedValue typedValue = new TypedValue();
        boolean z = context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
        if (((viewInflate.getResources().getConfiguration().uiMode & 48) == 16) ^ z) {
            ((fx) xqiVar.a).getDelegate().t(true != z ? 2 : 1);
        }
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(amzf.a, amze.a);
        ajwo ajwoVar = (ajwo) aihhVar.build();
        xgn xgnVar = xqiVar.b;
        xgnVar.b(xhb.a(27854), ajwoVar, null);
        xqiVar.g = (TextInputLayout) viewInflate.findViewById(R.id.tv_code_layout);
        xqiVar.l = new uoy(xqiVar, viewInflate, 2);
        xqiVar.g.getViewTreeObserver().addOnGlobalLayoutListener(xqiVar.l);
        int integer = context.getResources().getInteger(R.integer.mdx_use_tv_code_max_length);
        xqiVar.i = context.getResources().getInteger(R.integer.mdx_use_tv_code_full_code_length);
        xqiVar.h = (TvCodeEditText) viewInflate.findViewById(R.id.tv_code);
        TvCodeEditText tvCodeEditText = xqiVar.h;
        xqh xqhVar = new xqh(xqiVar, tvCodeEditText, integer, xqiVar.i);
        tvCodeEditText.addTextChangedListener(xqhVar);
        xqiVar.h.setOnKeyListener(xqhVar);
        xqiVar.h.setOnTouchListener(xqhVar);
        xqiVar.h.requestFocus();
        xqiVar.j = (Button) viewInflate.findViewById(R.id.connect);
        xqiVar.k = (TextView) viewInflate.findViewById(R.id.connect_pill);
        lqa lqaVar = xqiVar.o;
        if (lqaVar.P()) {
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.connect_pill_container);
            xqiVar.j.setVisibility(8);
            linearLayout.setVisibility(0);
            if (xqiVar.p.D()) {
                xqiVar.k.setVisibility(8);
                xqiVar.k = (TextView) viewInflate.findViewById(R.id.connect_pill_modern_type);
                xqiVar.k.setVisibility(0);
            }
            xqiVar.e = xqiVar.n.d(xqiVar.k);
            xqiVar.d(true);
            xqiVar.k.setOnClickListener(new xpr(xqiVar, 7));
        } else {
            Drawable background = xqiVar.j.getBackground();
            cf cfVar = xqiVar.a;
            background.setColorFilter(tzk.i(cfVar, R.attr.ytIconDisabled), PorterDuff.Mode.MULTIPLY);
            xqiVar.j.setText(xqiVar.a());
            xqiVar.j.setTextColor(tzk.i(cfVar, R.attr.ytTextDisabled));
            if (lqaVar.O()) {
                xqiVar.j.setAllCaps(false);
            }
            xqiVar.j.setOnClickListener(new xpr(xqiVar, 7));
        }
        xgnVar.l(new xgj(xhb.b(27855)));
        YouTubeAppCompatTextView youTubeAppCompatTextView = (YouTubeAppCompatTextView) viewInflate.findViewById(R.id.learn_more);
        xqiVar.f = xqiVar.n.d(youTubeAppCompatTextView);
        aeaa aeaaVar = xqiVar.f;
        aihh aihhVar2 = (aihh) ajnf.a.createBuilder();
        aihhVar2.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar2.instance;
        ajnfVar.d = 13;
        ajnfVar.c = 1;
        aihhVar2.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar2.instance;
        ajnfVar2.k = 1;
        ajnfVar2.b |= 2;
        aeaaVar.a((ajnf) aihhVar2.build(), null, null);
        if (lqaVar.O()) {
            youTubeAppCompatTextView.setText(R.string.mdx_pref_use_tv_code_learn_more_sentence_case);
        } else {
            youTubeAppCompatTextView.setText(R.string.mdx_pref_use_tv_code_learn_more);
        }
        youTubeAppCompatTextView.setOnClickListener(new xpr(xqiVar, 8));
        xgnVar.l(new xgj(xhb.b(27856)));
        return viewInflate;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        bundle.putString("extraTvCode", String.valueOf(this.a.h.getText()));
    }

    @Override // defpackage.cc
    public final void onStart() {
        super.onStart();
        this.a.d.L();
    }

    @Override // defpackage.cc
    public final void onStop() {
        super.onStop();
        xqi xqiVar = this.a;
        xqiVar.d.M();
        if (xqiVar.l != null) {
            xqiVar.g.getViewTreeObserver().removeOnGlobalLayoutListener(xqiVar.l);
        }
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onViewStateRestored */
    public final void m674lambda$restoreViewState$0$androidsupportv4appFragment(Bundle bundle) {
        super.m674lambda$restoreViewState$0$androidsupportv4appFragment(bundle);
        xqi xqiVar = this.a;
        cf cfVar = xqiVar.a;
        if (!twb.c(cfVar)) {
            xqiVar.h.requestFocus();
        }
        InputMethodManager inputMethodManager = (InputMethodManager) cfVar.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(xqiVar.h, 1);
        }
        if (bundle != null) {
            xqiVar.h.setText(bundle.getString("extraTvCode"));
        }
    }
}
