package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uhr extends uhw {
    private uhp k;
    private uhq l;
    private View m;
    private qcb n;

    private final void m(ImageView imageView, int i) {
        Drawable drawable;
        Context contextRequireContext = requireContext();
        try {
            drawable = contextRequireContext.getDrawable(i);
        } catch (Resources.NotFoundException unused) {
            drawable = null;
        }
        if (drawable == null) {
            imageView.setImageResource(i);
            return;
        }
        new ttk(contextRequireContext);
        ttk.b(drawable, tzk.i(contextRequireContext, R.attr.ytStaticBrandWhite));
        imageView.setImageDrawable(drawable);
    }

    private final void r() {
        View view = this.m;
        uhp uhpVarA = this.k;
        if (uhpVarA == null && getArguments() != null) {
            Bundle bundleRequireArguments = requireArguments();
            uho uhoVarA = uhp.a();
            uhoVarA.e(bundleRequireArguments.getInt("arg_reshoot_icon", -1));
            uhoVarA.f(bundleRequireArguments.getInt("arg_reshoot_text", -1));
            uhoVarA.b(bundleRequireArguments.getInt("arg_exit_icon", -1));
            uhoVarA.c(bundleRequireArguments.getInt("arg_exit_text", -1));
            uhoVarA.d(bundleRequireArguments.getBoolean("arg_immersive", true));
            uhpVarA = uhoVarA.a();
        }
        qcb qcbVarT = t();
        uhq uhqVar = this.l;
        if (view == null || uhpVarA == null || qcbVarT == null || uhqVar == null) {
            if (view != null) {
                if (qcbVarT == null || uhqVar == null) {
                    iN();
                    return;
                }
                return;
            }
            return;
        }
        if (uhpVarA.c()) {
            Context contextRequireContext = requireContext();
            View viewFindViewById = view.findViewById(R.id.close_bottom_sheet_reshoot);
            int i = uhpVarA.b;
            viewFindViewById.setContentDescription(contextRequireContext.getText(i));
            ((TextView) view.findViewById(R.id.close_bottom_sheet_reshoot_text)).setText(contextRequireContext.getText(i));
            viewFindViewById.setOnClickListener(new rnx(qcbVarT, 18));
            viewFindViewById.setVisibility(0);
            int i2 = uhpVarA.a;
            if (i2 != 0 && i2 != -1) {
                ImageView imageView = (ImageView) view.findViewById(R.id.close_bottom_sheet_reshoot_icon);
                imageView.getClass();
                m(imageView, i2);
            }
        } else {
            s(view, R.id.close_bottom_sheet_reshoot);
        }
        if (!uhpVarA.b()) {
            s(view, R.id.close_bottom_sheet_exit);
            return;
        }
        Context contextRequireContext2 = requireContext();
        View viewFindViewById2 = view.findViewById(R.id.close_bottom_sheet_exit);
        int i3 = uhpVarA.d;
        viewFindViewById2.setContentDescription(contextRequireContext2.getText(i3));
        ((TextView) view.findViewById(R.id.close_bottom_sheet_exit_text)).setText(contextRequireContext2.getText(i3));
        viewFindViewById2.setOnClickListener(new iks(6));
        viewFindViewById2.setVisibility(0);
        int i4 = uhpVarA.c;
        if (i4 == 0 || i4 == -1) {
            return;
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.close_bottom_sheet_exit_icon);
        imageView2.getClass();
        m(imageView2, i4);
    }

    private static final void s(View view, int i) {
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    private final qcb t() {
        qcb qcbVar = this.n;
        if (qcbVar != null) {
            return qcbVar;
        }
        getContext();
        return null;
    }

    public final void i(uhp uhpVar, qcb qcbVar, adxj adxjVar, uhq uhqVar) {
        adxjVar.getClass();
        this.k = uhpVar;
        this.n = qcbVar;
        this.l = uhqVar;
        r();
    }

    @Override // defpackage.adyw
    protected final Optional n() {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.close_confirmation_bottom_sheet_layout, (ViewGroup) null);
        this.m = viewInflate;
        return Optional.of(viewInflate);
    }

    @Override // defpackage.adyw
    protected final Optional o() {
        return Optional.empty();
    }

    @Override // defpackage.adyw, defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onCancel(dialogInterface);
        qcb qcbVarT = t();
        uhq uhqVar = this.l;
        if (qcbVarT == null || uhqVar == null) {
            return;
        }
        uhqVar.d();
    }

    @Override // defpackage.adyw, defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.m;
        ViewParent parent = view != null ? view.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.m);
        }
        this.m = null;
        this.n = null;
        this.l = null;
    }

    @Override // defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        r();
    }

    @Override // defpackage.adyw
    protected final Optional p() {
        return Optional.empty();
    }

    @Override // defpackage.adyw
    protected final Optional q() {
        return Optional.empty();
    }
}
