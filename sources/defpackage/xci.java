package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xci extends xcb {
    public View ad;
    public EditText ae;
    public amqj af;
    public Editable ag;
    public final xbs ah;
    private View ai;
    private final Context aj;
    private final vxz ak;

    public xci(Context context, Activity activity, adhv adhvVar, aduv aduvVar, vxe vxeVar, wyz wyzVar, wys wysVar, tza tzaVar, aeiv aeivVar, aeaq aeaqVar, zs zsVar, ci ciVar, aefv aefvVar, yno ynoVar, xsc xscVar, awmd awmdVar, acyx acyxVar, vxz vxzVar, vxz vxzVar2, abte abteVar, mbc mbcVar, tun tunVar, wxh wxhVar, aeda aedaVar, Context context2, vxz vxzVar3, vxz vxzVar4, vxz vxzVar5, wwq wwqVar, xcn xcnVar, View view, xgn xgnVar) {
        super(context, activity, wwqVar, adhvVar, aduvVar, vxeVar, wyzVar, wysVar, aeivVar, aeaqVar, zsVar, tzaVar, ciVar, aefvVar, xscVar, awmdVar, acyxVar, vxzVar2, abteVar, mbcVar, tunVar, wxhVar, aedaVar, context2, vxzVar4, vxzVar5, view, false, xgnVar);
        this.ah = xcnVar;
        this.aj = true == aedaVar.i() ? context2 : context;
        this.ak = vxzVar3;
        W();
        z().setVisibility(4);
        o().setImportantForAccessibility(4);
        View viewFindViewById = ((xcb) this).W.findViewById(R.id.user_thumbnail_container);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    private final void W() {
        this.ai = LayoutInflater.from(this.aj).inflate(R.layout.live_chat_action_panel_dialog, (ViewGroup) null, false);
        EditText editTextX = x();
        editTextX.getClass();
        this.ae = editTextX;
        View viewL = l();
        viewL.getClass();
        this.ad = viewL;
        this.ae.setOnClickListener(new vhv(this, 19));
        this.ae.setLongClickable(false);
        this.ae.setFocusable(false);
        this.ae.setMaxLines(1);
        this.ae.setEllipsize(TextUtils.TruncateAt.END);
        this.ae.setHorizontallyScrolling(true);
        this.ae.setKeyListener(null);
        this.ad.setVisibility(0);
    }

    @Override // defpackage.xbf
    public final void J() {
        this.ag = null;
        super.J();
    }

    @Override // defpackage.xbf
    public final void P() {
        wxl wxlVar = this.b;
        if (wxlVar.u()) {
            wxlVar.g();
            return;
        }
        this.ah.z(this.af, this.ag, true);
        if (V()) {
            l().setVisibility(4);
        } else {
            l().setVisibility(8);
        }
    }

    public final boolean V() {
        return this.ak.l(314, 45763779L, false);
    }

    @Override // defpackage.xbf, defpackage.wxm
    public final void b(amqj amqjVar) {
        super.b(amqjVar);
        this.af = amqjVar;
        this.ah.y();
    }

    @Override // defpackage.xbf, defpackage.wxm
    public final void c() {
        if (!this.D) {
            if (this.ai.getParent() != null) {
                ((ViewGroup) this.ai.getParent()).removeView(this.ai);
            }
            this.ah.x(this.ai, wyc.a());
        }
        this.ah.h = this;
        this.J = false;
        this.F = R.attr.ytIconDisabled;
        this.I = false;
        this.H = R.attr.ytTextPrimary;
        this.E = R.attr.ytTextPrimary;
        if (q() != null) {
            int dimensionPixelOffset = f().getResources().getDimensionPixelOffset(R.dimen.live_chat_input_bar_margin_horizontal);
            tym.h(m(), new tye(new tyj(dimensionPixelOffset, 0), new tyi(dimensionPixelOffset, 0)), ViewGroup.MarginLayoutParams.class);
            tym.h(u(), new tyi(0, 0), ViewGroup.MarginLayoutParams.class);
            tym.h(t(), new tyi(f().getResources().getDimensionPixelOffset(R.dimen.live_chat_immersive_general_margin), 0), ViewGroup.MarginLayoutParams.class);
            tym.h(B(), new tyl(f().getResources().getDimensionPixelOffset(R.dimen.live_chat_send_icon_width), 0), ViewGroup.MarginLayoutParams.class);
        }
        super.c();
    }

    @Override // defpackage.xbf, defpackage.wxm
    public final void d() {
        ViewGroup viewGroupT = t();
        if (viewGroupT != null) {
            viewGroupT.removeAllViews();
            xbf.S(viewGroupT, true);
        }
        ViewGroup viewGroupW = w();
        if (viewGroupW != null) {
            viewGroupW.removeAllViews();
            xbf.S(viewGroupW, false);
        }
        ViewGroup viewGroupR = r();
        if (viewGroupR != null) {
            if (this.q) {
                this.O.b(null);
            }
            viewGroupR.removeAllViews();
            xbf.S(viewGroupR, false);
        }
        ViewGroup viewGroupS = s();
        if (viewGroupS != null) {
            if (this.q) {
                this.P.b(null);
            }
            viewGroupS.removeAllViews();
            xbf.S(viewGroupS, false);
        }
        if (this.q && this.x != null) {
            this.Q.b(null);
            this.x.removeAllViews();
        }
        K(false);
        xbf.S(v(), false);
        if (this.r) {
            xbf.S(q(), false);
        }
        TextView textViewE = E();
        if (textViewE != null) {
            textViewE.setText((CharSequence) null);
        }
        if (A() != null) {
            A().setVisibility(8);
        }
        this.N = false;
        this.D = false;
        this.j = false;
        this.A = false;
        this.z = false;
        this.ah.m();
        this.ag = null;
    }

    @Override // defpackage.xbf, defpackage.wxm
    public final void e(boolean z) {
        super.e(z);
        xcb xcbVar = this.ah.a;
        if (xcbVar != null) {
            xcbVar.e(z);
        }
    }

    @Override // defpackage.xbf
    protected final Spanned h() {
        return j();
    }

    @Override // defpackage.xbf
    protected final Spanned j() {
        return !TextUtils.isEmpty(this.ag) ? this.ag : this.u;
    }

    public xci(Context context, Activity activity, wwi wwiVar, adhv adhvVar, aduv aduvVar, vxe vxeVar, wyz wyzVar, wys wysVar, tza tzaVar, aeiv aeivVar, aeaq aeaqVar, zs zsVar, xbs xbsVar, ci ciVar, aefv aefvVar, yno ynoVar, xsc xscVar, awmd awmdVar, acyx acyxVar, vxz vxzVar, vxz vxzVar2, abte abteVar, mbc mbcVar, tun tunVar, wxh wxhVar, aeda aedaVar, Context context2, vxz vxzVar3, vxz vxzVar4, vxz vxzVar5, View view, xgn xgnVar) {
        super(context, activity, wwiVar, adhvVar, aduvVar, vxeVar, wyzVar, wysVar, aeivVar, aeaqVar, zsVar, tzaVar, ciVar, aefvVar, xscVar, awmdVar, acyxVar, vxzVar2, abteVar, mbcVar, tunVar, wxhVar, aedaVar, context2, vxzVar4, vxzVar5, view, false, xgnVar);
        this.ah = xbsVar;
        this.aj = true == aedaVar.i() ? context2 : context;
        this.ak = vxzVar3;
        W();
    }
}
