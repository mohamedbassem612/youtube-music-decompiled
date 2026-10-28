package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xsu extends xti {
    public xsh k;
    public aeez l;
    public aefd m;
    public aeda n;
    public adxj o;
    public vxz p;
    public zdj q;
    private Drawable r;
    private Drawable s;
    private Drawable t;
    private Drawable u;
    private Drawable v;

    private final Drawable m(xvq xvqVar) {
        int iA = xvqVar.a();
        if (iA == 1) {
            return this.s;
        }
        if (iA != 2) {
            return xvqVar.n() ? this.u : this.r;
        }
        return this.t;
    }

    @Override // defpackage.adyw
    protected final Optional n() {
        int i;
        Context context = getContext();
        if (context == null) {
            return Optional.empty();
        }
        View viewInflate = View.inflate(context, R.layout.mdx_device_picker_overflow_menu, null);
        View viewFindViewById = viewInflate.findViewById(R.id.disconnect_overflow_menu_item_root);
        if (this.k.f() || this.p.l(110, 45620291L, false)) {
            viewFindViewById.setVisibility(0);
            xvq xvqVar = this.k.c.q;
            YouTubeTextView youTubeTextView = (YouTubeTextView) viewInflate.findViewById(R.id.disconnect_overflow_menu_item_text);
            int iA = xvqVar.a();
            if (iA == 1) {
                i = R.string.overflow_disconnect_tv_text;
            } else if (iA != 2) {
                i = xvqVar.n() ? R.string.overflow_disconnect_speaker_group_text : R.string.overflow_disconnect_cast_text;
            } else {
                i = R.string.overflow_disconnect_speaker_text;
            }
            youTubeTextView.setText(i);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.disconnect_overflow_menu_item_icon);
            if (m(xvqVar) != null) {
                imageView.setImageDrawable(m(xvqVar));
            }
            viewFindViewById.setOnClickListener(new xpr(this, 13));
        } else {
            viewFindViewById.setVisibility(8);
        }
        View viewFindViewById2 = viewInflate.findViewById(R.id.bug_report_overflow_menu_item_root);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.bug_report_overflow_menu_item_icon);
        Drawable drawable = this.v;
        if (drawable != null) {
            imageView2.setImageDrawable(drawable);
        }
        if (this.p.l(254, 45835026L, false) || !(this.k.f() || this.p.l(131, 45634818L, false))) {
            viewFindViewById2.setVisibility(8);
        } else {
            viewFindViewById2.setVisibility(0);
            viewFindViewById2.setOnClickListener(new xpr(this, 12));
        }
        return Optional.of(viewInflate);
    }

    @Override // defpackage.adyw
    protected final Optional o() {
        return Optional.empty();
    }

    @Override // defpackage.xti, defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_MediaRouter);
        aeda aedaVar = this.n;
        if (aedaVar == null || this.o == null || !aedaVar.s()) {
            this.s = yno.db(contextThemeWrapper, contextThemeWrapper.getDrawable(R.drawable.yt_outline_tv_off_vd_theme_24));
            this.t = yno.db(contextThemeWrapper, contextThemeWrapper.getDrawable(R.drawable.yt_outline_speaker_off_vd_theme_24));
            this.u = yno.db(contextThemeWrapper, contextThemeWrapper.getDrawable(R.drawable.yt_outline_speaker_group_off_vd_theme_24));
            this.v = yno.db(contextThemeWrapper, contextThemeWrapper.getDrawable(R.drawable.yt_outline_message_bubble_alert_vd_theme_24));
        } else {
            this.s = yno.db(contextThemeWrapper, this.o.d(contextThemeWrapper, arqz.oh));
            this.t = yno.db(contextThemeWrapper, this.o.d(contextThemeWrapper, arqz.mV));
            this.u = yno.db(contextThemeWrapper, this.o.d(contextThemeWrapper, arqz.mW));
            this.v = yno.db(contextThemeWrapper, this.o.d(contextThemeWrapper, arqz.dZ));
        }
        this.r = this.s;
        this.H = true;
        super.onAttach(contextThemeWrapper);
    }

    @Override // defpackage.adyw, defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.k.c.h();
    }

    @Override // defpackage.adyw, defpackage.cc
    public final void onPause() {
        super.onPause();
        if (isAdded() && isVisible()) {
            this.k.b(getActivity());
        }
        this.k.e(false);
    }

    @Override // defpackage.cc
    public final void onResume() {
        xgt xgtVarA;
        super.onResume();
        xsh xshVar = this.k;
        if (xshVar != null) {
            xshVar.e(true);
            xsj xsjVar = this.k.c;
            xgn xgnVar = xsjVar.x;
            if (xgnVar != null && (xgtVarA = xgnVar.a()) != null) {
                xsjVar.I = new xgx(xgtVarA, xhb.b(210362));
                xgnVar.l(xsjVar.I);
            }
            xsj xsjVar2 = this.k.c;
            xgx xgxVarB = xsjVar2.b(xsjVar2.J, xhb.b(210363));
            if (xgxVarB != null) {
                xsjVar2.J = xgxVarB;
            }
            if (this.p.l(254, 45835026L, false)) {
                return;
            }
            xsj xsjVar3 = this.k.c;
            xgx xgxVarB2 = xsjVar3.b(xsjVar3.K, xhb.b(210364));
            if (xgxVarB2 != null) {
                xsjVar3.K = xgxVarB2;
            }
        }
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStop() {
        super.onStop();
        if (this.p.l(254, 45835026L, false)) {
            return;
        }
        this.q.c();
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
