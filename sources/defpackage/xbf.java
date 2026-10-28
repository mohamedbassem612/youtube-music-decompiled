package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class xbf implements wxm, twn, aeal {
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public final acxt O;
    public final acxt P;
    public final acxt Q;
    protected final vxz R;
    protected final aeiv S;
    public xxj T;
    protected final ci U;
    private TextWatcher V;
    private final InputFilter W;
    private TextWatcher X;
    private ImageView Y;
    private ImageView Z;
    public final Activity a;
    private ViewGroup aa;
    private boolean ab;
    private final acyx ae;
    private final abte af;
    private final xsc ag;
    private final zs ah;
    public final wxl b;
    public final xgn c;
    public final vxe d;
    protected final aduv e;
    public final wyz f;
    public final wys g;
    protected final tun h;
    public final aeaq i;
    public final mbc k;
    protected final boolean l;
    public wxl m;
    protected aktm n;
    public final aefv o;
    public final wxh p;
    public final boolean q;
    public final boolean r;
    public bp s;
    public Spanned t;
    public Spanned u;
    public int v;
    public int w;
    public ViewGroup x;
    public List y;
    public boolean j = false;
    public boolean z = false;
    public boolean A = false;
    public boolean B = true;
    public boolean N = false;
    private boolean ac = false;
    private final adly ad = new adly();

    public xbf(Activity activity, wxl wxlVar, aduv aduvVar, vxe vxeVar, xgn xgnVar, wyz wyzVar, wys wysVar, aeiv aeivVar, aeaq aeaqVar, zs zsVar, ci ciVar, aefv aefvVar, xsc xscVar, awmd awmdVar, acyx acyxVar, vxz vxzVar, abte abteVar, mbc mbcVar, tun tunVar, wxh wxhVar, vxz vxzVar2, vxz vxzVar3, boolean z) {
        this.a = activity;
        this.b = wxlVar;
        this.e = aduvVar;
        this.d = vxeVar;
        this.c = xgnVar;
        this.f = wyzVar;
        this.g = wysVar;
        this.S = aeivVar;
        this.i = aeaqVar;
        this.ah = zsVar;
        this.U = ciVar;
        this.o = aefvVar;
        this.ae = acyxVar;
        this.R = vxzVar;
        this.af = abteVar;
        this.k = mbcVar;
        this.h = tunVar;
        this.p = wxhVar;
        this.ag = xscVar;
        this.l = z;
        boolean zL = vxzVar2.l(329, 45801387L, false);
        this.q = zL;
        this.r = vxzVar3.l(42, 45821352L, false);
        this.W = new wzc();
        if (zL) {
            this.O = (acxt) awmdVar.io();
            this.Q = (acxt) awmdVar.io();
        } else {
            acxt acxtVar = (acxt) awmdVar.io();
            this.O = acxtVar;
            this.Q = acxtVar;
        }
        this.P = (acxt) awmdVar.io();
        this.E = R.attr.ytThemedBlue;
        this.H = R.attr.ytIconInactive;
        this.F = R.attr.ytIconDisabled;
        this.G = R.attr.ytTextPrimary;
    }

    public static final void S(View view, boolean z) {
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    private final View T(ViewGroup viewGroup, ajnf ajnfVar, int i) {
        int i2 = ajnfVar.e;
        if (i2 != 8) {
            return null;
        }
        View viewK = k(i2 == 8 ? (alja) ajnfVar.f : alja.a);
        aiqe aiqeVar = ajnfVar.v;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        if ((aiqeVar.b & 1) != 0) {
            aiqe aiqeVar2 = ajnfVar.v;
            if (aiqeVar2 == null) {
                aiqeVar2 = aiqe.a;
            }
            aiqd aiqdVar = aiqeVar2.c;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
            viewK.setContentDescription(aiqdVar.c);
        }
        viewK.setOnClickListener(new vqd((Object) this, (aihn) ajnfVar, 11));
        viewGroup.addView(viewK);
        viewK.setTag(i, ajnfVar.o);
        if ((ajnfVar.b & 2097152) != 0) {
            this.c.w(new xgj(ajnfVar.y, (amud) null), null);
        }
        yno.dA(this.a, viewK);
        return viewK;
    }

    private final ViewGroup U() {
        ViewGroup viewGroup = this.aa;
        if (viewGroup != null) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) n().findViewById(R.id.action_pills);
        this.aa = viewGroup2;
        return viewGroup2;
    }

    private final void V(ViewGroup viewGroup, amop amopVar, wyb wybVar) {
        if ((amopVar.b & 2) != 0) {
            alja aljaVar = amopVar.d;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            View viewK = k(aljaVar);
            aiqe aiqeVar = amopVar.f;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            if ((aiqeVar.b & 1) != 0) {
                aiqe aiqeVar2 = amopVar.f;
                if (aiqeVar2 == null) {
                    aiqeVar2 = aiqe.a;
                }
                aiqd aiqdVar = aiqeVar2.c;
                if (aiqdVar == null) {
                    aiqdVar = aiqd.a;
                }
                viewK.setContentDescription(aiqdVar.c);
            }
            TextView textViewD = D();
            if (textViewD == null || amopVar.h.isEmpty() || amopVar.g) {
                S(D(), false);
            } else {
                int iApplyDimension = (int) TypedValue.applyDimension(1, 1.0f, f().getResources().getDisplayMetrics());
                tuk.u(textViewD, amopVar.h);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(tzk.i(f(), R.attr.ytThemedBlue));
                gradientDrawable.setStroke(iApplyDimension, tzk.i(f(), R.attr.ytBrandBackgroundSolid));
                textViewD.setBackground(gradientDrawable);
            }
            xgj xgjVar = new xgj(amopVar.i, (amud) null);
            this.c.w(xgjVar, null);
            if (amopVar.g) {
                viewK.setOnClickListener(new vqd((Object) this, (aihn) amopVar, 7));
            } else if ((amopVar.b & SemanticState.Modal) != 0) {
                viewK.setOnClickListener(new vqd((Object) this, (aihn) amopVar, 9));
            } else if (wybVar != null) {
                viewK.setOnClickListener(new ivx(this, wybVar, xgjVar, 19));
            }
            viewK.setTag(R.id.live_chat_picker_toggle_button_tag, amopVar.c);
            viewGroup.addView(viewK);
            yno.dA(this.a, viewK);
            this.U.af(amopVar, viewK);
        }
    }

    private final void W(akrn akrnVar) {
        ViewGroup viewGroupS = s();
        if (viewGroupS == null || !this.A) {
            return;
        }
        viewGroupS.setVisibility(8);
        if (this.q) {
            this.P.b(null);
        }
        viewGroupS.removeAllViews();
        if (!this.A || this.l) {
            return;
        }
        S(viewGroupS, true);
        acxm acxmVarC = this.ae.c(akrnVar);
        acxt acxtVar = this.P;
        acxtVar.h(this.ad, acxmVarC, false, false);
        View viewA = acxtVar.a();
        if (viewA != null) {
            if (viewA.getParent() != null) {
                ((ViewGroup) viewA.getParent()).removeView(viewA);
            }
            viewGroupS.addView(viewA);
        }
    }

    private final void X(ajnf ajnfVar) {
        ViewGroup viewGroupW = w();
        if (viewGroupW == null || !this.z) {
            return;
        }
        viewGroupW.setVisibility(8);
        viewGroupW.removeAllViews();
        if (!this.z || this.l) {
            return;
        }
        S(viewGroupW, true);
        T(viewGroupW, ajnfVar, R.id.live_chat_shopping_button_tag);
    }

    private final void Y() {
        if (this.I) {
            y().setVisibility(0);
        } else if (y().getVisibility() == 0) {
            y().setVisibility(8);
        }
    }

    private final void Z(boolean z) {
        if (this.n == null) {
            if (this.ab) {
                return;
            }
            ab();
        } else {
            N(z);
            o().setOnClickListener(new vhv(this, 14));
            if (this.I) {
                return;
            }
            Y();
        }
    }

    private final void aa() {
        K(true);
        p().removeAllViews();
        ViewGroup viewGroupT = t();
        if (viewGroupT != null) {
            int childCount = viewGroupT.getChildCount();
            for (int i = 0; i < childCount; i++) {
                viewGroupT.getChildAt(i).setOnClickListener(null);
            }
            viewGroupT.removeAllViews();
        }
        ViewGroup viewGroupU = U();
        if (viewGroupU != null) {
            for (int i2 = 0; i2 < viewGroupU.getChildCount(); i2++) {
                viewGroupU.getChildAt(i2).setOnClickListener(null);
            }
            viewGroupU.removeAllViews();
        }
        if (this.q) {
            if (this.x != null) {
                this.Q.b(null);
                this.x.removeAllViews();
            }
            ViewGroup viewGroupR = r();
            if (viewGroupR != null) {
                this.O.b(null);
                viewGroupR.removeAllViews();
            }
            ViewGroup viewGroupS = s();
            if (viewGroupS != null) {
                this.P.b(null);
                viewGroupS.removeAllViews();
            }
        }
        this.n = null;
        o().setOnClickListener(null);
        m().setOnClickListener(null);
    }

    private final void ab() {
        this.g.d();
        y().setVisibility(0);
    }

    private final void ac(boolean z) {
        TextView textViewE = E();
        if (textViewE != null) {
            x().setVisibility(true != z ? 0 : 8);
            ViewGroup viewGroupT = t();
            int i = (!z || this.N) ? 0 : 8;
            int i2 = true != z ? 0 : 8;
            viewGroupT.setVisibility(i);
            ViewGroup viewGroupQ = q();
            if (viewGroupQ != null) {
                viewGroupQ.setVisibility(i2);
            }
            y().setVisibility(i2);
            o().setVisibility(i2);
            int i3 = true == z ? 0 : 8;
            textViewE.setVisibility(i3);
            A().setVisibility(i3);
            A().setBackground(z ? null : tuk.d(f(), 0));
            this.ab = z;
        }
    }

    private static boolean ad(alja aljaVar) {
        int i = aljaVar.c;
        aliz alizVarA = aliz.a(i);
        if (alizVarA == null) {
            alizVarA = aliz.UNKNOWN;
        }
        if (alizVarA != aliz.EMOJI) {
            aliz alizVarA2 = aliz.a(i);
            if (alizVarA2 == null) {
                alizVarA2 = aliz.UNKNOWN;
            }
            if (alizVarA2 != aliz.FACE_HAPPY_OUTLINE) {
                return false;
            }
        }
        return true;
    }

    public abstract ImageView A();

    public abstract ImageView B();

    protected TextView C() {
        throw null;
    }

    public abstract TextView D();

    public abstract TextView E();

    public abstract void F();

    protected final void G(ImageView imageView, boolean z) {
        if (imageView != null) {
            imageView.setImageTintList(z ? tzk.k(f(), this.E) : tzk.k(f(), this.F));
        }
    }

    protected abstract void H(int i, boolean z);

    public final void I() {
        aihf aihfVarCreateBuilder = aomh.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aomg.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aomg aomgVar = (aomg) aihfVarCreateBuilder2.instance;
        aomgVar.c = 1;
        aomgVar.b = 3;
        aihfVarCreateBuilder.copyOnWrite();
        aomh aomhVar = (aomh) aihfVarCreateBuilder.instance;
        aomg aomgVar2 = (aomg) aihfVarCreateBuilder2.build();
        aomgVar2.getClass();
        aomhVar.c = aomgVar2;
        aomhVar.b |= 2;
        aomh aomhVar2 = (aomh) aihfVarCreateBuilder.build();
        xfh xfhVar = new xfh(1, 28);
        aihf aihfVarCreateBuilder3 = akzk.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        akzk akzkVar = (akzk) aihfVarCreateBuilder3.instance;
        aomhVar2.getClass();
        akzkVar.j = aomhVar2;
        akzkVar.b |= 524288;
        xfhVar.a = (akzk) aihfVarCreateBuilder3.build();
        this.af.b(xfhVar, alai.FLOW_TYPE_PDG_BUY_FLOW);
    }

    public void J() {
        if (this.R.m(23, 45798386L) && this.ac) {
            return;
        }
        Editable editableG = g();
        if (this.m == null || TextUtils.isEmpty(editableG)) {
            return;
        }
        boolean zK = this.S.k();
        wxl wxlVar = this.m;
        if (zK) {
            wxlVar.p(this.g.a(editableG));
        } else {
            wxlVar.q(editableG.toString().trim());
        }
        zs zsVar = this.ah;
        aihf aihfVarCreateBuilder = amoj.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amoj amojVar = (amoj) aihfVarCreateBuilder.instance;
        amojVar.c = 1;
        amojVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        amoj amojVar2 = (amoj) aihfVarCreateBuilder.instance;
        amojVar2.d = 1;
        amojVar2.b |= 2;
        xeu xeuVar = (xeu) zsVar.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.LIVE_CHAT_MESSAGE_SENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            amoj amojVar3 = (amoj) aihfVarCreateBuilder.build();
            amojVar3.getClass();
            alouVar.d = amojVar3;
            alouVar.c = 225;
            aihn aihnVarBuild = alosVar.build();
            aihnVarBuild.getClass();
            xeuVar.b((alou) aihnVarBuild);
        }
        F();
        this.g.d();
        N(false);
    }

    public final void K(boolean z) {
        tym.h(l(), new tyl(true != z ? 0 : -2, 1), ViewGroup.LayoutParams.class);
    }

    public final void L(int i) {
        ViewGroup viewGroupU = U();
        if (viewGroupU != null) {
            for (int i2 = 0; i2 < viewGroupU.getChildCount(); i2++) {
                View childAt = viewGroupU.getChildAt(i2);
                if (childAt.getVisibility() != i) {
                    childAt.setVisibility(i);
                    Object tag = childAt.getTag();
                    if (i == 0 && (tag instanceof xgj)) {
                        this.c.w((xgj) tag, null);
                    }
                }
            }
        }
    }

    public abstract void M(aqmh aqmhVar);

    protected final void N(boolean z) {
        z().setContentDescription(f().getResources().getString(z ? R.string.close_emoji_picker_button_cd : R.string.open_emoji_picker_button_cd));
        z().setImageResource(true != z ? R.drawable.yt_outline_face_happy_vd_theme_24 : R.drawable.yt_fill_face_happy_grey600_24);
        z().setColorFilter(R(aliz.EMOJI));
    }

    protected final void O(boolean z) {
        int dimensionPixelOffset = f().getResources().getDimensionPixelOffset(R.dimen.live_chat_text_field_height);
        View viewM = m();
        viewM.setVisibility(true != z ? 8 : 0);
        viewM.setMinimumHeight(dimensionPixelOffset);
        ViewGroup viewGroupP = p();
        viewGroupP.setVisibility(true != z ? 0 : 8);
        viewGroupP.setMinimumHeight(dimensionPixelOffset);
    }

    public void P() {
        wys wysVar = this.g;
        boolean z = wysVar.e;
        wxl wxlVar = this.m;
        if (z) {
            if (wxlVar != null) {
                wxlVar.k(false);
            }
            wysVar.d();
            N(wysVar.e);
            return;
        }
        if (wxlVar != null) {
            wxlVar.k(true);
        }
        aktm aktmVar = this.n;
        aktmVar.getClass();
        wysVar.f((ViewGroup) n(), aktmVar, x(), this);
        N(wysVar.e);
        Y();
    }

    public final void Q() {
        ImageView imageViewB = B();
        if (imageViewB != null) {
            Editable editableG = g();
            boolean z = (editableG != null && editableG.length() != 0) && this.g.b(editableG, this.w) <= this.v && !this.ac;
            imageViewB.setEnabled(z);
            G(imageViewB, z);
        }
    }

    public final int R(aliz alizVar) {
        return tzk.n(f(), (alizVar == aliz.SUPER_CHAT_FOR_GOOD || !(alizVar == aliz.DOLLAR_SIGN_CONTAINER || alizVar == aliz.MONEY_FILL_JPY || alizVar == aliz.MONEY_HEART || alizVar == aliz.TROPHY_STAR || alizVar == aliz.MESSAGE_BUBBLE_LEFT_BOOST || alizVar == aliz.HEART_BOX || alizVar == aliz.MEDAL_STAR || alizVar == aliz.SUPERSTAR)) ? this.H : this.G).orElse(0);
    }

    @Override // defpackage.aeal
    public final void a() {
        if (this.B) {
            this.g.d();
            wxl wxlVar = this.m;
            if (wxlVar != null) {
                wxlVar.l();
            }
            x().requestFocus();
            tuk.m(x());
            Z(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x03da  */
    /* JADX WARN: Code duplicated, block: B:373:0x0723  */
    /* JADX WARN: Type inference failed for: r11v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v24, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [awmd, java.lang.Object] */
    @Override // defpackage.wxm
    public void b(amqj amqjVar) {
        alay alayVar;
        alay alayVar2;
        wyb wyaVar;
        boolean z;
        wyb wyaVar2;
        Drawable drawable;
        ajnf ajnfVar;
        adly adlyVar = this.ad;
        xgn xgnVar = this.c;
        adlyVar.a(xgnVar);
        aa();
        ab();
        int i = amqjVar.b;
        boolean z2 = true;
        if (i == 121323709) {
            ampl amplVar = (ampl) amqjVar.c;
            EditText editTextX = x();
            S(o(), true);
            tym.h(x(), new tyj(0, 0), ViewGroup.MarginLayoutParams.class);
            ac(false);
            O(true);
            if (this.I) {
                aqmh aqmhVar = amplVar.c;
                if (aqmhVar == null) {
                    aqmhVar = aqmh.a;
                }
                M(aqmhVar);
            }
            Y();
            if (amplVar != null && (amplVar.b & 32) != 0) {
                ampm ampmVar = amplVar.d;
                if (ampmVar == null) {
                    ampmVar = ampm.a;
                }
                amqy amqyVar = ampmVar.b == 121291266 ? (amqy) ampmVar.c : amqy.a;
                alay alayVar3 = amqyVar.b;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                this.t = ackj.k(null, alayVar3, null, false);
                alay alayVar4 = amqyVar.c;
                if (alayVar4 == null) {
                    alayVar4 = alay.a;
                }
                this.u = ackj.k(null, alayVar4, null, false);
                editTextX.getText().clear();
                S(v(), this.J);
                G(B(), false);
                editTextX.setEnabled(true);
                editTextX.setHint(j());
                this.v = amqyVar.d;
                this.w = amqyVar.e;
                editTextX.setFilters(new InputFilter[]{this.W});
                yno.dA(this.a, editTextX);
            }
            apji apjiVar = amplVar.l;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            ViewGroup viewGroupU = U();
            if (viewGroupU != null) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                    apjiVar.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                    ajnf ajnfVar2 = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    View viewInflate = LayoutInflater.from(f()).inflate(R.layout.live_chat_action_panel_pill, (ViewGroup) null);
                    if (((ajnfVar2.e == 8 ? (alja) ajnfVar2.f : alja.a).b & 1) != 0) {
                        aduv aduvVar = this.e;
                        aliz alizVarA = aliz.a((ajnfVar2.e == 8 ? (alja) ajnfVar2.f : alja.a).c);
                        if (alizVarA == null) {
                            alizVarA = aliz.UNKNOWN;
                        }
                        int iA = aduvVar.a(alizVarA);
                        if (iA != 0) {
                            ((ImageView) viewInflate.findViewById(R.id.pill_icon)).setImageDrawable(f().getDrawable(iA));
                        }
                    }
                    this.y = ajnfVar2.t;
                    TextView textView = (TextView) viewInflate.findViewById(R.id.pill_label);
                    alay alayVar5 = ajnfVar2.m;
                    if (alayVar5 == null) {
                        alayVar5 = alay.a;
                    }
                    textView.setText(ackj.k(null, alayVar5, null, false));
                    viewInflate.setTag(new xgj(ajnfVar2.y, (amud) null));
                    viewInflate.setOnClickListener(new ivx(this, viewInflate, ajnfVar2, 18));
                    viewInflate.setVisibility(4);
                    viewGroupU.addView(viewInflate);
                }
            }
            if (this.x != null) {
                if (this.q) {
                    this.Q.b(null);
                }
                this.x.removeAllViews();
                apji apjiVar2 = amplVar.o;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                if (apjiVar2 != null) {
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
                    apjiVar2.c(aihlVarCheckIsLite3);
                    if (apjiVar2.j.n(aihlVarCheckIsLite3.d)) {
                        acyx acyxVar = this.ae;
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(akrs.a);
                        apjiVar2.c(aihlVarCheckIsLite4);
                        Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite4.d);
                        acxm acxmVarC = acyxVar.c((akrn) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2)));
                        acxt acxtVar = this.Q;
                        acxtVar.h(adlyVar, acxmVarC, false, false);
                        this.x.addView(acxtVar.a());
                    }
                }
            }
            ViewGroup viewGroupT = t();
            if (viewGroupT != null) {
                viewGroupT.removeAllViews();
                ViewGroup viewGroupU2 = u();
                if (viewGroupU2 != null) {
                    viewGroupU2.setVisibility(8);
                    if (amplVar != null) {
                        this.z = (amplVar.b & SemanticState.Hidden) != 0;
                        ampi ampiVar = amplVar.i;
                        if (ampiVar == null) {
                            ampiVar = ampi.a;
                        }
                        X(ampiVar.b == 65153809 ? (ajnf) ampiVar.c : ajnf.a);
                        if ((amplVar.b & SemanticState.LiveRegion) != 0 || amplVar.g.size() > 0) {
                            this.j = true;
                            ViewGroup viewGroupR = r();
                            if (viewGroupR != null && this.j) {
                                viewGroupR.setVisibility(8);
                                if (this.q) {
                                    this.O.b(null);
                                }
                                viewGroupR.removeAllViews();
                                if (this.j && !this.l) {
                                    S(viewGroupR, true);
                                    ampi ampiVar2 = amplVar.j;
                                    if ((ampiVar2 == null ? ampi.a : ampiVar2).b == 153515154) {
                                        acyx acyxVar2 = this.ae;
                                        if (ampiVar2 == null) {
                                            ampiVar2 = ampi.a;
                                        }
                                        acxm acxmVarC2 = acyxVar2.c(ampiVar2.b == 153515154 ? (akrn) ampiVar2.c : akrn.a);
                                        acxt acxtVar2 = this.O;
                                        acxtVar2.h(adlyVar, acxmVarC2, false, false);
                                        viewGroupR.addView(acxtVar2.a());
                                    } else {
                                        if (ampiVar2 == null) {
                                            ampiVar2 = ampi.a;
                                        }
                                        if (ampiVar2.b == 65153809 || (amplVar.g.size() > 0 && ((ampi) amplVar.g.get(0)).b == 65153809)) {
                                            ampi ampiVar3 = amplVar.j;
                                            if ((ampiVar3 == null ? ampi.a : ampiVar3).b == 65153809) {
                                                if (ampiVar3 == null) {
                                                    ampiVar3 = ampi.a;
                                                }
                                                ajnfVar = ampiVar3.b == 65153809 ? (ajnf) ampiVar3.c : ajnf.a;
                                            } else {
                                                ampi ampiVar4 = (ampi) amplVar.g.get(0);
                                                ajnfVar = ampiVar4.b == 65153809 ? (ajnf) ampiVar4.c : ajnf.a;
                                            }
                                            View viewT = T(viewGroupR, ajnfVar, R.id.live_chat_jewels_button_tag);
                                            if (viewT != null) {
                                                this.U.af(ajnfVar, viewT);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        ampi ampiVar5 = amplVar.k;
                        if ((ampiVar5 == null ? ampi.a : ampiVar5).b == 153515154) {
                            this.A = true;
                            if (ampiVar5 == null) {
                                ampiVar5 = ampi.a;
                            }
                            W(ampiVar5.b == 153515154 ? (akrn) ampiVar5.c : akrn.a);
                        }
                        if ((this.z || this.j || this.A) && !this.l && amplVar.f.size() == 1) {
                            ampj ampjVar = (ampj) amplVar.f.get(0);
                            alja aljaVar = (ampjVar.b == 132562777 ? (amop) ampjVar.c : amop.a).d;
                            if (aljaVar == null) {
                                aljaVar = alja.a;
                            }
                            if (ad(aljaVar)) {
                                u().setVisibility(8);
                            }
                        }
                    }
                    if (amplVar.f.size() != 0) {
                        amop amopVar = null;
                        for (ampj ampjVar2 : amplVar.f) {
                            int i2 = ampjVar2.b;
                            if (i2 == 132562777) {
                                amop amopVar2 = (amop) ampjVar2.c;
                                if ((amopVar2.b & 2) != 0) {
                                    alja aljaVar2 = amopVar2.d;
                                    if (aljaVar2 == null) {
                                        aljaVar2 = alja.a;
                                    }
                                    if (ad(aljaVar2)) {
                                        amopVar = ampjVar2.b == 132562777 ? (amop) ampjVar2.c : amop.a;
                                        aduv aduvVar2 = this.e;
                                        alja aljaVar3 = amopVar.d;
                                        if (aljaVar3 == null) {
                                            aljaVar3 = alja.a;
                                        }
                                        aliz alizVarA2 = aliz.a(aljaVar3.c);
                                        if (alizVarA2 == null) {
                                            alizVarA2 = aliz.UNKNOWN;
                                        }
                                        int iA2 = aduvVar2.a(alizVarA2);
                                        if (iA2 != 0 && (drawable = f().getDrawable(iA2)) != null) {
                                            z().setImageDrawable(drawable);
                                        }
                                    }
                                }
                                alja aljaVar4 = (ampjVar2.b == 132562777 ? (amop) ampjVar2.c : amop.a).d;
                                if (aljaVar4 == null) {
                                    aljaVar4 = alja.a;
                                }
                                if (ad(aljaVar4)) {
                                    z = z2;
                                } else {
                                    this.N = z2;
                                    amop amopVar3 = ampjVar2.b == 132562777 ? (amop) ampjVar2.c : amop.a;
                                    ampk[] ampkVarArr = (ampk[]) amplVar.e.toArray(new ampk[0]);
                                    int length = ampkVarArr.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length) {
                                            z = z2;
                                            wyaVar2 = null;
                                            break;
                                        }
                                        ampk ampkVar = ampkVarArr[i3];
                                        z = z2;
                                        if (ampkVar != null) {
                                            int i4 = ampkVar.b;
                                            if (i4 == 129042058) {
                                                wyaVar2 = new wxz((amnw) ampkVar.c);
                                            } else if (i4 == 189846535) {
                                                wyaVar2 = new wya((amqd) ampkVar.c);
                                            } else {
                                                wyaVar2 = null;
                                            }
                                        } else {
                                            wyaVar2 = null;
                                        }
                                        if (wyaVar2 != null && (amopVar3.b & 1) != 0 && amopVar3.c.equals(wyaVar2.a()) && wyaVar2.b()) {
                                            break;
                                        }
                                        i3++;
                                        z2 = z;
                                    }
                                    V(viewGroupT, amopVar3, wyaVar2);
                                    S(v(), false);
                                }
                            } else {
                                z = z2;
                                if (i2 == 65153809) {
                                    ajnf ajnfVar3 = (ajnf) ampjVar2.c;
                                    if (!ad(ajnfVar3.e == 8 ? (alja) ajnfVar3.f : alja.a)) {
                                        T(viewGroupT, ampjVar2.b == 65153809 ? (ajnf) ampjVar2.c : ajnf.a, R.id.live_chat_picker_toggle_button_tag);
                                    }
                                }
                            }
                            boolean z3 = z;
                            S(viewGroupT, z3);
                            z2 = z3;
                        }
                        if (amopVar != null) {
                            yno.dA(this.a, o());
                            this.U.af(amopVar, z());
                        }
                    } else {
                        u().setVisibility(8);
                    }
                }
            }
            for (ampk ampkVar2 : amplVar.e) {
                int i5 = ampkVar2.b;
                if (i5 == 126326492) {
                    this.n = i5 == 126326492 ? (aktm) ampkVar2.c : aktm.a;
                    break;
                }
            }
            Z(false);
            if (this.S.k()) {
                TextWatcher textWatcherC = this.g.c(x());
                x().removeTextChangedListener(textWatcherC);
                x().addTextChangedListener(textWatcherC);
            }
            if (!this.l) {
                this.U.af(amplVar, x());
            }
        } else if (i == 132498670) {
            amqt amqtVar = (amqt) amqjVar.c;
            TextView textViewE = E();
            if (textViewE != null) {
                ac(true);
                if ((amqtVar.b & 2) != 0) {
                    alayVar2 = amqtVar.d;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                } else {
                    alayVar2 = null;
                }
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) ackj.k(null, alayVar2, null, false));
                TextView textViewE2 = E();
                if (textViewE2 != null && (amqtVar.b & 4) != 0) {
                    apji apjiVar3 = amqtVar.e;
                    if (apjiVar3 == null) {
                        apjiVar3 = apji.a;
                    }
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajnp.a);
                    apjiVar3.c(aihlVarCheckIsLite5);
                    Object objK3 = apjiVar3.j.k(aihlVarCheckIsLite5.d);
                    ajnf ajnfVar4 = (ajnf) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3));
                    alay alayVar6 = ajnfVar4.m;
                    if (alayVar6 == null) {
                        alayVar6 = alay.a;
                    }
                    if (alayVar6.c.size() > 0) {
                        alay alayVar7 = ajnfVar4.m;
                        if (alayVar7 == null) {
                            alayVar7 = alay.a;
                        }
                        Spanned spannedK = ackj.k(null, ackj.c(((alba) alayVar7.c.get(0)).c.replace(" ", " ")), null, false);
                        ajwo ajwoVar = ajnfVar4.s;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        agkj agkjVarJ = agkj.j("engagement_panel_id_key", "live-chat-item-section");
                        spannableStringBuilderAppend.append((CharSequence) "  •  ").append((CharSequence) spannedK).setSpan(new vxj(this.d, agkjVarJ, ajwoVar, false), spannableStringBuilderAppend.length() - spannedK.length(), spannableStringBuilderAppend.length(), 33);
                        spannableStringBuilderAppend.setSpan(new TextAppearanceSpan(f(), R.style.live_chat_members_only_upsell_button_style), spannableStringBuilderAppend.length() - spannedK.length(), spannableStringBuilderAppend.length(), 33);
                        textViewE2.setMovementMethod(LinkMovementMethod.getInstance());
                        bac.p(textViewE2, new xbd(this, ajwoVar, agkjVarJ));
                    }
                }
                textViewE.setText(spannableStringBuilderAppend);
                alja aljaVar5 = amqtVar.c;
                if (aljaVar5 == null) {
                    aljaVar5 = alja.a;
                }
                if ((aljaVar5.b & 1) != 0) {
                    Context contextF = f();
                    aduv aduvVar3 = this.e;
                    alja aljaVar6 = amqtVar.c;
                    if (aljaVar6 == null) {
                        aljaVar6 = alja.a;
                    }
                    aliz alizVarA3 = aliz.a(aljaVar6.c);
                    if (alizVarA3 == null) {
                        alizVarA3 = aliz.UNKNOWN;
                    }
                    Drawable drawableD = dl.d(contextF, aduvVar3.a(alizVarA3));
                    if (drawableD != null) {
                        drawableD.setTint(tzk.i(f(), R.attr.ytIconDisabled));
                        A().setImageDrawable(drawableD);
                    }
                }
                O(true);
                if ((amqtVar.b & 8) != 0) {
                    o().setClickable(false);
                    m().setOnClickListener(new vqd((Object) this, (aihn) amqtVar, 12));
                }
                S(v(), false);
                aiie<amqs> aiieVar = amqtVar.g;
                ViewGroup viewGroupT2 = t();
                for (amqs amqsVar : aiieVar) {
                    int i6 = amqsVar.b;
                    if (i6 == 65153809) {
                        xsc xscVar = this.ag;
                        Context context = (Context) xscVar.b.io();
                        context.getClass();
                        afip afipVar = (afip) xscVar.c.io();
                        afipVar.getClass();
                        aciz acizVar = (aciz) xscVar.a.io();
                        acizVar.getClass();
                        wwg wwgVar = new wwg(context, afipVar, acizVar);
                        ajnf ajnfVar5 = amqsVar.b == 65153809 ? (ajnf) amqsVar.c : ajnf.a;
                        wwgVar.hU(new adly(), ajnfVar5);
                        TextView textView2 = wwgVar.a;
                        if (ajnfVar5.e == 8) {
                            textView2.setTag(R.id.live_chat_picker_toggle_button_tag, ajnfVar5.o);
                            aliz alizVarA4 = aliz.a((ajnfVar5.e == 8 ? (alja) ajnfVar5.f : alja.a).c);
                            if (alizVarA4 == null) {
                                alizVarA4 = aliz.UNKNOWN;
                            }
                            int iR = R(alizVarA4);
                            Drawable drawable2 = textView2.getCompoundDrawables()[0];
                            if (drawable2 != null) {
                                ttk.a(drawable2, iR, PorterDuff.Mode.SRC_IN);
                            }
                        }
                        textView2.setOnClickListener(new vqd((Object) this, (aihn) ajnfVar5, 8));
                        viewGroupT2.addView(textView2);
                    } else if (i6 == 132562777) {
                        amop amopVar4 = (amop) amqsVar.c;
                        if ((amopVar4.b & 2) != 0) {
                            alja aljaVar7 = amopVar4.d;
                            if (aljaVar7 == null) {
                                aljaVar7 = alja.a;
                            }
                            aliz alizVarA5 = aliz.a(aljaVar7.c);
                            if (alizVarA5 == null) {
                                alizVarA5 = aliz.UNKNOWN;
                            }
                            if (alizVarA5 != aliz.UNKNOWN) {
                                amqu[] amquVarArr = (amqu[]) amqtVar.h.toArray(new amqu[0]);
                                int length2 = amquVarArr.length;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= length2) {
                                        wyaVar = null;
                                        break;
                                    }
                                    amqu amquVar = amquVarArr[i7];
                                    if (amquVar == null) {
                                        wyaVar = null;
                                    } else {
                                        int i8 = amquVar.b;
                                        if (i8 == 129042058) {
                                            wyaVar = new wxz((amnw) amquVar.c);
                                        } else if (i8 == 189846535) {
                                            wyaVar = new wya((amqd) amquVar.c);
                                        } else {
                                            wyaVar = null;
                                        }
                                    }
                                    if (wyaVar != null && (amopVar4.b & 1) != 0 && amopVar4.c.equals(wyaVar.a()) && wyaVar.b()) {
                                        break;
                                    } else {
                                        i7++;
                                    }
                                }
                                V(viewGroupT2, amopVar4, wyaVar);
                                S(viewGroupT2, true);
                            }
                        }
                    }
                }
                this.z = (amqtVar.b & 16) != 0;
                this.j = false;
                amqs amqsVar2 = amqtVar.i;
                if (amqsVar2 == null) {
                    amqsVar2 = amqs.a;
                }
                X(amqsVar2.b == 65153809 ? (ajnf) amqsVar2.c : ajnf.a);
                amqs amqsVar3 = amqtVar.k;
                if ((amqsVar3 == null ? amqs.a : amqsVar3).b == 153515154) {
                    this.A = true;
                    if (amqsVar3 == null) {
                        amqsVar3 = amqs.a;
                    }
                    W(amqsVar3.b == 153515154 ? (akrn) amqsVar3.c : akrn.a);
                }
                amqs amqsVar4 = amqtVar.j;
                if ((amqsVar4 == null ? amqs.a : amqsVar4).b == 153515154) {
                    this.j = true;
                    if (amqsVar4 == null) {
                        amqsVar4 = amqs.a;
                    }
                    akrn akrnVar = amqsVar4.b == 153515154 ? (akrn) amqsVar4.c : akrn.a;
                    ViewGroup viewGroupR2 = r();
                    if (viewGroupR2 != null && this.j) {
                        viewGroupR2.setVisibility(8);
                        if (this.q) {
                            this.O.b(null);
                        }
                        viewGroupR2.removeAllViews();
                        if (this.j && !this.l) {
                            S(viewGroupR2, true);
                            acxm acxmVarC3 = this.ae.c(akrnVar);
                            acxt acxtVar3 = this.O;
                            acxtVar3.h(adlyVar, acxmVarC3, false, false);
                            viewGroupR2.addView(acxtVar3.a());
                        }
                    }
                }
            }
        } else if (i == 58508690) {
            angn angnVar = (angn) amqjVar.c;
            O(false);
            ac(false);
            ajng ajngVar = angnVar.h;
            if (ajngVar == null) {
                ajngVar = ajng.a;
            }
            if ((ajngVar.b & 1) != 0) {
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(f());
                ViewGroup viewGroupP = p();
                Button button = (Button) layoutInflaterFrom.inflate(R.layout.live_chat_action_button_grey_dark, viewGroupP, false);
                button.setBackgroundResource(R.drawable.live_chat_classic_cta_button_background);
                button.setTextColor(tzk.i(f(), R.attr.ytTextPrimaryInverse));
                ajng ajngVar2 = angnVar.h;
                if (ajngVar2 == null) {
                    ajngVar2 = ajng.a;
                }
                ajnf ajnfVar6 = ajngVar2.c;
                if (ajnfVar6 == null) {
                    ajnfVar6 = ajnf.a;
                }
                if ((ajnfVar6.b & SemanticState.Obscured) != 0) {
                    ajwo ajwoVar2 = ajnfVar6.r;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    button.setOnClickListener(new vqd((Object) this, (aihn) ajwoVar2, 10));
                }
                if ((ajnfVar6.b & 64) != 0) {
                    alayVar = ajnfVar6.m;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                button.setText(ackj.k(null, alayVar, null, false));
                viewGroupP.addView(button, -1, f().getResources().getDimensionPixelOffset(R.dimen.live_chat_cta_button_height));
                angq angqVar = angnVar.f;
                if (angqVar == null) {
                    angqVar = angq.a;
                }
                angp angpVar = angqVar.c;
                if (angpVar == null) {
                    angpVar = angp.a;
                }
                if ((angpVar.b & 1) != 0) {
                    angq angqVar2 = angnVar.f;
                    if (angqVar2 == null) {
                        angqVar2 = angq.a;
                    }
                    angp angpVar2 = angqVar2.c;
                    if (angpVar2 == null) {
                        angpVar2 = angp.a;
                    }
                    alay alayVar8 = angpVar2.c;
                    if (alayVar8 == null) {
                        alayVar8 = alay.a;
                    }
                    Spanned spannedK2 = ackj.k(null, alayVar8, null, false);
                    TextView textView3 = (TextView) layoutInflaterFrom.inflate(R.layout.live_chat_button_subtext_light, viewGroupP, false);
                    textView3.setText(spannedK2);
                    viewGroupP.addView(textView3);
                }
            }
        }
        adlyVar.h();
        adlyVar.a(xgnVar);
        this.i.f = new xbc(this, 0);
    }

    @Override // defpackage.wxm
    public void c() {
        if (this.D) {
            return;
        }
        y().setVisibility(8);
        if (this.V == null) {
            this.V = new xbe(this);
        }
        EditText editTextX = x();
        editTextX.setRawInputType(1);
        editTextX.setOnEditorActionListener(new jly(this, 4));
        TextWatcher textWatcher = this.V;
        if (textWatcher != null) {
            editTextX.addTextChangedListener(textWatcher);
        }
        editTextX.setMaxLines(1);
        adsg adsgVar = new adsg(editTextX, f().getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) f().getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift));
        this.X = adsgVar;
        editTextX.addTextChangedListener(adsgVar);
        B().setOnClickListener(new vhv(this, 15));
        ViewGroup viewGroupU = U();
        if (viewGroupU != null) {
            viewGroupU.setOnClickListener(new vhv(this, 16));
        }
        if (this.x == null) {
            this.x = (ViewGroup) n().findViewById(R.id.action_panel_header_content);
        }
        K(false);
        this.g.d();
        this.D = true;
    }

    @Override // defpackage.wxm
    public void d() {
        throw null;
    }

    @Override // defpackage.wxm
    public void e(boolean z) {
        this.ac = z;
        Q();
    }

    public abstract Context f();

    public final Editable g() {
        return x().getText();
    }

    protected Spanned h() {
        return this.t;
    }

    @Override // defpackage.twn
    public final void i() {
        EditText editTextX = x();
        editTextX.setOnEditorActionListener(null);
        editTextX.removeTextChangedListener(this.V);
        editTextX.removeTextChangedListener(this.g.c(editTextX));
        editTextX.removeTextChangedListener(this.X);
        editTextX.setFilters(new InputFilter[0]);
        B().setOnClickListener(null);
        this.i.f = null;
        ab();
        aa();
    }

    protected Spanned j() {
        return this.u;
    }

    public abstract View k(alja aljaVar);

    public abstract View l();

    public abstract View m();

    public abstract View n();

    public abstract View o();

    public abstract ViewGroup p();

    public abstract ViewGroup q();

    public abstract ViewGroup r();

    public abstract ViewGroup s();

    public abstract ViewGroup t();

    public abstract ViewGroup u();

    public abstract ViewGroup v();

    public abstract ViewGroup w();

    public abstract EditText x();

    protected final ImageView y() {
        ImageView imageView = this.Y;
        if (imageView != null) {
            return imageView;
        }
        ImageView imageView2 = (ImageView) n().findViewById(R.id.user_thumbnail);
        this.Y = imageView2;
        return imageView2;
    }

    protected final ImageView z() {
        ImageView imageView = this.Z;
        if (imageView != null) {
            return imageView;
        }
        ImageView imageView2 = (ImageView) n().findViewById(R.id.emoji_picker_icon);
        this.Z = imageView2;
        return imageView2;
    }
}
