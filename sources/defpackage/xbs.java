package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.livechat.input.KeyPressAwareEditText;
import j$.time.Duration;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class xbs implements DialogInterface.OnDismissListener, wyw, wxl {
    private final ahgb A;
    public xcb a;
    public Dialog b;
    public aefv c;
    public final ScheduledExecutorService d;
    public final boolean e;
    public wxl f;
    public boolean g;
    public xci h;
    public final vxz i;
    private wyc j;
    private final Context k;
    private final Activity l;
    private final awmd m;
    private final vxe n;
    private final xcc o;
    private final wxi p;
    private final awmd q;
    private final mbc r;
    private final tun s;
    private amqj t;
    private Editable u;
    private boolean v;
    private boolean w = false;
    private final wyx x;
    private final vxz y;
    private final xpl z;

    public xbs(Context context, wxi wxiVar, awmd awmdVar, Activity activity, wyx wyxVar, tbt tbtVar, vxe vxeVar, ahgb ahgbVar, xcc xccVar, awmd awmdVar2, mbc mbcVar, tun tunVar, xpl xplVar, vxz vxzVar, xsc xscVar, ScheduledExecutorService scheduledExecutorService, vxz vxzVar2) {
        this.k = context;
        this.p = wxiVar;
        this.m = awmdVar;
        this.l = activity;
        this.x = wyxVar;
        this.n = vxeVar;
        this.A = ahgbVar;
        this.o = xccVar;
        this.q = awmdVar2;
        this.c = (aefv) awmdVar2.io();
        this.r = mbcVar;
        this.s = tunVar;
        this.z = xplVar;
        this.y = vxzVar;
        Object obj = xscVar.c;
        this.d = scheduledExecutorService;
        this.i = vxzVar2;
        this.j = wyc.a();
        tbtVar.g(this, xbs.class);
        this.e = Build.VERSION.SDK_INT >= 36;
    }

    private final void A(Window window, boolean z) {
        int i;
        xcb xcbVar;
        EditText editTextX;
        if (window != null) {
            if (z) {
                i = this.e ? 53 : 21;
            } else {
                i = 51;
            }
            window.setSoftInputMode(i);
            if (z || (xcbVar = this.a) == null || (editTextX = xcbVar.x()) == null) {
                return;
            }
            tuk.i(editTextX);
        }
    }

    @Override // defpackage.wyw
    public final int a() {
        return 2;
    }

    @Override // defpackage.wxl
    public final void d() {
        Dialog dialog;
        Activity activity = this.l;
        if (activity.isFinishing() || activity.isDestroyed() || (dialog = this.b) == null || !dialog.isShowing()) {
            return;
        }
        w();
    }

    @Override // defpackage.wxl
    public final void e() {
        wxl wxlVar = this.f;
        if (wxlVar != null) {
            wxlVar.e();
        }
    }

    @Override // defpackage.wxl
    public final void h(ajnf ajnfVar) {
        int i = ajnfVar.b;
        if ((i & SemanticState.Multiline) == 0) {
            if ((i & SemanticState.Focused) != 0) {
                tuk.o(this.k, ajnfVar.n, 0);
            }
        } else {
            vxe vxeVar = this.n;
            ajwo ajwoVar = ajnfVar.s;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
    }

    @tcc
    public void handlePlayerGeometryEvent(aaxo aaxoVar) {
        abnr abnrVar = aaxoVar.a;
        abnr abnrVar2 = abnr.FULLSCREEN;
        if (abnrVar != abnrVar2 && abnrVar != abnr.DEFAULT && abnrVar != abnr.REMOTE) {
            w();
        }
        if (this.z.g() || abnrVar != abnrVar2) {
            return;
        }
        w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.wyw
    public final void i() {
        Activity activity;
        Dialog dialog = this.b;
        xcb xcbVar = this.a;
        if (dialog == null || xcbVar == null || (activity = this.l) == null || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        A(dialog.getWindow(), !this.g);
        xcb xcbVar2 = this.a;
        View view = xcbVar2 != null ? xcbVar2.W : null;
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        Object[] objArr = 0;
        if (view != null && decorView != null) {
            tuk.v(decorView, true).az().al(new xbo(view, objArr == true ? 1 : 0), new xbo(view, 2));
        }
        dialog.show();
        if (this.t != null) {
            xcbVar.c();
            xcbVar.b(this.t);
            if (this.y.m(23, 45798386L)) {
                wxl wxlVar = this.f;
                xcbVar.e(wxlVar != null ? wxlVar.t() : false);
            }
        }
        xcbVar.x().setHint(xcbVar.t);
        Editable editable = this.u;
        if (editable != null) {
            xcbVar.x().setText(editable);
            xcbVar.x().setSelection(editable.length());
        }
        if (this.g) {
            xcbVar.P();
        } else {
            xcbVar.x().requestFocus();
        }
        amqj amqjVar = this.t;
        int i = amqjVar.b;
        if (i == 121323709) {
            if (((i == 121323709 ? (ampl) amqjVar.c : ampl.a).b & 16384) != 0) {
                amqj amqjVar2 = this.t;
                ajwo ajwoVar = (amqjVar2.b == 121323709 ? (ampl) amqjVar2.c : ampl.a).m;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                xcb xcbVar3 = this.a;
                if (this.w || xcbVar3 == null) {
                    return;
                }
                this.w = true;
                aihl aihlVar = apyk.a;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    apyj apyjVar = (apyj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    apji apjiVar = apyjVar.b;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aqog.a);
                    apjiVar.c(aihlVarCheckIsLite3);
                    if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                        apji apjiVar2 = apyjVar.b;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aqog.a);
                        apjiVar2.c(aihlVarCheckIsLite4);
                        Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite4.d);
                        aqof aqofVar = (aqof) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                        if ("live-chat-message-input".equals(aqofVar.l)) {
                            this.d.schedule(afwl.i(new vwh(this, aqofVar, xcbVar3, 5, (short[]) null)), 500L, TimeUnit.MILLISECONDS);
                            if (twb.c(this.k)) {
                                xcbVar3.x().setAccessibilityDelegate(new xbr(xcbVar3, aqofVar));
                                return;
                            }
                            return;
                        }
                    }
                }
                this.A.k(agke.q(ajwoVar), this.p, true);
            }
        }
    }

    @Override // defpackage.wxl
    public final void j(List list) {
        if (this.v) {
            return;
        }
        this.v = true;
        this.n.b(list);
    }

    @Override // defpackage.wyw
    public final void jm() {
        w();
    }

    @Override // defpackage.wxl
    public final void k(boolean z) {
        this.g = z;
        Dialog dialog = this.b;
        if (dialog != null) {
            A(dialog.getWindow(), !z);
        }
        if (z) {
            return;
        }
        w();
    }

    @Override // defpackage.wxl
    public final void l() {
        this.g = false;
        Dialog dialog = this.b;
        if (dialog != null) {
            A(dialog.getWindow(), true);
        }
    }

    @Override // defpackage.wxl
    public final void m() {
        xcb xcbVar = this.a;
        if (xcbVar != null) {
            xcbVar.x().setText((CharSequence) null);
        }
        this.v = false;
        y();
    }

    public final void n() {
        Dialog dialog;
        View decorView;
        if (!a.aN() || this.g || (dialog = this.b) == null) {
            w();
            return;
        }
        Window window = dialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            int i = bac.a;
            bbn bbnVarA = azt.a(decorView);
            if (bbnVarA != null && !bbnVarA.x()) {
                w();
                return;
            }
        }
        Dialog dialog2 = this.b;
        if (dialog2 != null) {
            A(dialog2.getWindow(), false);
        }
    }

    @Override // defpackage.wxl
    public final void o(ajwo ajwoVar) {
        wxl wxlVar = this.f;
        if (wxlVar != null) {
            wxlVar.o(ajwoVar);
            n();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        xci xciVar;
        xcb xcbVar = this.a;
        if (xcbVar != null && (xciVar = this.h) != null) {
            Editable editableG = xcbVar.g();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editableG);
            xciVar.ad.setVisibility(0);
            xciVar.ag = spannableStringBuilder;
            xciVar.ae.setText(editableG);
            xciVar.ae.setMaxLines(1);
            xciVar.ae.setEllipsize(TextUtils.TruncateAt.END);
            xciVar.ae.setHorizontallyScrolling(true);
            xciVar.ae.setKeyListener(null);
        }
        this.x.a(this);
    }

    @Override // defpackage.wxl
    public final void p(amqw amqwVar) {
        wxl wxlVar = this.f;
        if (wxlVar != null) {
            wxlVar.p(amqwVar);
            n();
        }
    }

    @Override // defpackage.wxl
    public final void q(CharSequence charSequence) {
        wxl wxlVar = this.f;
        if (wxlVar != null) {
            wxlVar.q(charSequence);
            n();
        }
    }

    @Override // defpackage.wxl
    public final boolean t() {
        throw null;
    }

    @Override // defpackage.wxl
    public final boolean u() {
        return false;
    }

    public final void w() {
        this.c.g();
        this.p.c();
        Activity activity = this.l;
        Dialog dialog = this.b;
        if (activity.isFinishing() || activity.isDestroyed() || dialog == null || !dialog.isShowing()) {
            return;
        }
        A(dialog.getWindow(), false);
        dialog.dismiss();
    }

    public void x(View view, wyc wycVar) {
        if (!this.j.equals(wycVar)) {
            this.j = wycVar;
        }
        Context context = this.k;
        Dialog dialog = new Dialog(context, R.style.action_panel_dialog_theme);
        this.b = dialog;
        dialog.setOnDismissListener(this);
        view.findViewById(R.id.action_panel_dialog).setOnClickListener(new vhv(this, 18));
        xcc xccVar = this.o;
        xgn xgnVar = ((wwn) this.m.io()).l;
        Context context2 = (Context) xccVar.a.io();
        context2.getClass();
        ((Context) xccVar.b.io()).getClass();
        Activity activity = (Activity) xccVar.c.io();
        activity.getClass();
        wxl wxlVar = (wxl) xccVar.d.io();
        wxlVar.getClass();
        adhv adhvVar = (adhv) xccVar.e.io();
        adhvVar.getClass();
        ((advb) xccVar.f.io()).getClass();
        aduv aduvVar = (aduv) xccVar.g.io();
        aduvVar.getClass();
        vxe vxeVar = (vxe) xccVar.h.io();
        vxeVar.getClass();
        wyz wyzVar = (wyz) xccVar.i.io();
        wyzVar.getClass();
        wys wysVar = (wys) xccVar.j.io();
        wysVar.getClass();
        aeiv aeivVar = (aeiv) xccVar.k.io();
        aeivVar.getClass();
        aeaq aeaqVar = (aeaq) xccVar.l.io();
        aeaqVar.getClass();
        zs zsVar = (zs) xccVar.m.io();
        zsVar.getClass();
        tza tzaVar = (tza) xccVar.n.io();
        tzaVar.getClass();
        ci ciVar = (ci) xccVar.o.io();
        ciVar.getClass();
        aefv aefvVar = (aefv) xccVar.p.io();
        aefvVar.getClass();
        ((yno) xccVar.q.io()).getClass();
        xsc xscVar = (xsc) xccVar.r.io();
        xscVar.getClass();
        acyx acyxVar = (acyx) xccVar.t.io();
        acyxVar.getClass();
        ((vxz) xccVar.u.io()).getClass();
        vxz vxzVar = (vxz) xccVar.v.io();
        vxzVar.getClass();
        Object objIo = xccVar.w.io();
        awmd awmdVar = xccVar.s;
        abte abteVar = (abte) objIo;
        abteVar.getClass();
        mbc mbcVar = (mbc) xccVar.x.io();
        mbcVar.getClass();
        tun tunVar = (tun) xccVar.y.io();
        tunVar.getClass();
        wxh wxhVar = (wxh) xccVar.z.io();
        wxhVar.getClass();
        aeda aedaVar = (aeda) xccVar.A.io();
        aedaVar.getClass();
        Context context3 = (Context) xccVar.B.io();
        context3.getClass();
        ((Context) xccVar.C.io()).getClass();
        vxz vxzVar2 = (vxz) xccVar.D.io();
        vxzVar2.getClass();
        vxz vxzVar3 = (vxz) xccVar.E.io();
        vxzVar3.getClass();
        view.getClass();
        xgnVar.getClass();
        xcb xcbVar = new xcb(context2, activity, wxlVar, adhvVar, aduvVar, vxeVar, wyzVar, wysVar, aeivVar, aeaqVar, zsVar, tzaVar, ciVar, aefvVar, xscVar, awmdVar, acyxVar, vxzVar, abteVar, mbcVar, tunVar, wxhVar, aedaVar, context3, vxzVar2, vxzVar3, view, true, xgnVar);
        this.a = xcbVar;
        EditText editTextX = xcbVar.x();
        if (editTextX instanceof KeyPressAwareEditText) {
            ((KeyPressAwareEditText) editTextX).a = new xxj(this, null);
        }
        aefv aefvVar2 = (aefv) this.q.io();
        this.c = aefvVar2;
        aefvVar2.h(view);
        dialog.setContentView(xcbVar.W);
        yno.dz(dialog.getWindow(), this.r, this.s);
        Window window = dialog.getWindow();
        if (window != null) {
            if (a.aN()) {
                if (this.e) {
                    window.getDecorView();
                    azz.c(window, false);
                    window.setStatusBarColor(0);
                    window.setNavigationBarColor(0);
                    if (Build.VERSION.SDK_INT >= 28) {
                        int i = Build.VERSION.SDK_INT >= 30 ? 3 : 1;
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        if (attributes.layoutInDisplayCutoutMode != i) {
                            attributes.layoutInDisplayCutoutMode = i;
                            window.setAttributes(attributes);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        window.setStatusBarContrastEnforced(false);
                        window.setNavigationBarContrastEnforced(false);
                    }
                    xcb xcbVar2 = this.a;
                    if (xcbVar2 != null) {
                        xbp xbpVar = new xbp(0);
                        View view2 = xcbVar2.W;
                        int i2 = bac.a;
                        azs.c(view2, xbpVar);
                    }
                }
                View decorView = window.getDecorView();
                if (decorView != null) {
                    decorView.setWindowInsetsAnimationCallback(new xbq(this, decorView));
                }
            }
            window.setSoftInputMode(16);
            window.setLayout(-1, -2);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            attributes2.gravity = 80;
            attributes2.dimAmount = 0.0f;
            window.setAttributes(attributes2);
        }
        xcbVar.C = true;
        wyc wycVar2 = this.j;
        xcbVar.E = wycVar2.b;
        xcbVar.F = wycVar2.c;
        xcbVar.G = wycVar2.d;
        xcbVar.H = wycVar2.e;
        xcbVar.I = true;
        xcbVar.M = wycVar2.f;
        int i3 = wycVar2.g;
        int i4 = wycVar2.h;
        xcbVar.K = i3;
        xcbVar.L = i4;
        xcbVar.V = wycVar2.a;
        xcbVar.J = true;
        if (wycVar2.i) {
            tym.h(xcbVar.u(), new tyi(context.getResources().getDimensionPixelOffset(R.dimen.live_chat_immersive_general_margin), 0), ViewGroup.MarginLayoutParams.class);
            tym.h(xcbVar.m(), new tyi(context.getResources().getDimensionPixelOffset(R.dimen.live_chat_input_bar_margin_horizontal), 0), ViewGroup.MarginLayoutParams.class);
            tym.h(xcbVar.B(), new tyl(context.getResources().getDimensionPixelOffset(R.dimen.live_chat_send_icon_width), 0), ViewGroup.MarginLayoutParams.class);
        }
    }

    public final void y() {
        this.w = false;
        xcb xcbVar = this.a;
        if (xcbVar != null) {
            xcbVar.x().setAccessibilityDelegate(null);
        }
    }

    public final void z(amqj amqjVar, Editable editable, boolean z) {
        this.t = amqjVar;
        this.u = editable;
        this.g = z;
        this.x.b(this);
    }

    @Override // defpackage.wxl
    public final void b() {
    }

    @Override // defpackage.wxl
    public final void c() {
    }

    @Override // defpackage.wxl
    public final void g() {
    }

    @Override // defpackage.wxl
    public final void s() {
    }

    @Override // defpackage.wxl
    public final void f(amqj amqjVar) {
    }

    @Override // defpackage.wxl
    public final void jl(wxm wxmVar) {
    }

    @Override // defpackage.wxl
    public final void r(Duration duration) {
    }

    @Override // defpackage.wxl
    public final void v(wwn wwnVar) {
    }
}
