package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatSwipeableContainerLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class xbw implements wxo, wyw {
    private final ImageButton A;
    private final ImageView B;
    private final ImageView C;
    private final TextView D;
    private final TextView E;
    private final SpannableStringBuilder F;
    private agev G;
    private final adsc I;
    private final ahgb J;
    private final aduv a;
    public final Context b;
    public final vxe c;
    public final wxi d;
    public final xgn e;
    public final adsa f;
    public final ahey i;
    public final LiveChatSwipeableContainerLayout j;
    public final TextView k;
    public final ViewGroup l;
    protected final ViewStub m;
    public final View n;
    public final View o;
    public ahew p;
    public amnd q;
    public aowk r;
    public ObjectAnimator s;
    public boolean t;
    public boolean u;
    public final wyx v;
    public final vxz w;
    public final ci x;
    private final adhv y;
    private final wbz z;
    public final List g = new ArrayList();
    public final Runnable h = new wvr(this, 15);
    private agev H = agdf.a;

    public xbw(Context context, aduv aduvVar, adhv adhvVar, vxe vxeVar, ahey aheyVar, wxi wxiVar, ci ciVar, wyx wyxVar, wbz wbzVar, ahgb ahgbVar, adsa adsaVar, vxz vxzVar, View view, xgn xgnVar) {
        if (vxzVar.m(12, 45756228L)) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, R.style.Themed_YouTube_LiveChat_Dark_DarkerPalette);
        }
        this.a = aduvVar;
        this.y = adhvVar;
        this.c = vxeVar;
        this.i = aheyVar;
        this.d = wxiVar;
        this.x = ciVar;
        this.v = wyxVar;
        this.z = wbzVar;
        this.w = vxzVar;
        this.o = view;
        this.J = ahgbVar;
        this.e = xgnVar;
        this.f = adsaVar;
        o();
        LiveChatSwipeableContainerLayout liveChatSwipeableContainerLayoutM = m();
        this.j = liveChatSwipeableContainerLayoutM;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.live_chat_poll);
        this.m = viewStub;
        View viewInflate = viewStub.inflate();
        this.n = viewInflate;
        viewInflate.setBackground(dl.d(context, n().a));
        ImageButton imageButtonE = e();
        this.A = imageButtonE;
        imageButtonE.setColorFilter(tzk.i(context, n().d));
        TextView textViewJ = j();
        this.k = textViewJ;
        textViewJ.setTextColor(tzk.i(context, n().c));
        this.B = h();
        this.C = g();
        TextView textViewL = l();
        this.D = textViewL;
        textViewL.setTextColor(tzk.i(context, n().b));
        this.E = k();
        this.l = d();
        p();
        this.F = new SpannableStringBuilder();
        this.I = new adsc(context, adsaVar, true, new adse(textViewL), true);
        liveChatSwipeableContainerLayoutM.e(true);
        liveChatSwipeableContainerLayoutM.f = new xbt(this, 0);
    }

    private final void v() {
        if (!ahno.aa((String) this.H.f())) {
            avnr.b((AtomicReference) this.G.c());
        }
        agdf agdfVar = agdf.a;
        this.H = agdfVar;
        this.G = agdfVar;
    }

    public int a() {
        throw null;
    }

    @Override // defpackage.wxo
    public final void b(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.s;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ahew ahewVar = this.p;
            if (ahewVar != null) {
                ahewVar.cancel(false);
            }
            LiveChatSwipeableContainerLayout liveChatSwipeableContainerLayout = this.j;
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(liveChatSwipeableContainerLayout, (Property<LiveChatSwipeableContainerLayout, Float>) View.TRANSLATION_Y, liveChatSwipeableContainerLayout.getTranslationY(), liveChatSwipeableContainerLayout.getHeight());
                this.s = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(300L);
                this.s.setInterpolator(aedd.a);
                this.s.addListener(new xbu(this, z2, z3));
                this.s.start();
                return;
            }
            liveChatSwipeableContainerLayout.setVisibility(8);
            this.u = false;
            if (z2) {
                q();
            }
            if (z3) {
                return;
            }
            r();
        }
    }

    @Override // defpackage.wxo
    public final void c(aowk aowkVar) {
        ahew ahewVar;
        if (u(aowkVar)) {
            if ((aowkVar.b & 2) != 0) {
                apji apjiVar = aowkVar.e;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aowl.b);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aowl.b);
                    apjiVar.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                    t((aowj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)), false);
                }
            }
            if (this.t && (ahewVar = this.p) != null) {
                ahewVar.cancel(false);
            }
            for (int i = 0; i < aowkVar.f.size(); i++) {
                ((xcp) this.g.get(i)).a((aowi) aowkVar.f.get(i), Boolean.valueOf(this.t));
            }
            s(aowkVar);
        }
    }

    protected abstract ViewGroup d();

    protected abstract ImageButton e();

    protected abstract ImageView g();

    protected abstract ImageView h();

    @Override // defpackage.wyw
    public final void i() {
        LiveChatSwipeableContainerLayout liveChatSwipeableContainerLayout = this.j;
        liveChatSwipeableContainerLayout.setVisibility(4);
        liveChatSwipeableContainerLayout.post(new wvr(this, 14));
    }

    protected abstract TextView j();

    @Override // defpackage.wyw
    public final void jm() {
        b(true, false, false);
    }

    protected abstract TextView k();

    protected abstract TextView l();

    protected abstract LiveChatSwipeableContainerLayout m();

    protected abstract xcs n();

    protected abstract void o();

    protected abstract void p();

    public final void q() {
        List list = this.g;
        list.clear();
        this.l.removeAllViews();
        list.clear();
    }

    public final void r() {
        amnd amndVar = this.q;
        if ((amndVar.b & 16) != 0) {
            ajwo ajwoVar = amndVar.e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            this.J.k(agke.q(ajwoVar), this.d, true);
        }
    }

    public final void s(aowk aowkVar) {
        if ((aowkVar.b & 16384) == 0) {
            v();
            return;
        }
        String str = aowkVar.i;
        if (Objects.equals(this.H.f(), str)) {
            return;
        }
        v();
        agev agevVarI = agev.i(str);
        this.H = agevVarI;
        if (ahno.aa((String) agevVarI.f())) {
            return;
        }
        this.G = agev.i(this.z.c().j((String) this.H.c(), true).B(new sqj(17)).K(new xdx(1)).h(ampz.class).O(avmh.a()).af(new xbo(this, 3)));
    }

    public final void t(aowj aowjVar, boolean z) {
        aowj aowjVar2;
        aiqd aiqdVar;
        if ((aowjVar.b & 32) != 0) {
            apji apjiVar = aowjVar.h;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = aowjVar.h;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                ajnf ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                int i = ajnfVar.e;
                if (i == 8) {
                    ImageButton imageButton = this.A;
                    Context context = this.b;
                    aduv aduvVar = this.a;
                    aliz alizVarA = aliz.a((i == 8 ? (alja) ajnfVar.f : alja.a).c);
                    if (alizVarA == null) {
                        alizVarA = aliz.UNKNOWN;
                    }
                    imageButton.setImageDrawable(context.getDrawable(aduvVar.a(alizVarA)));
                }
                if ((ajnfVar.b & 262144) != 0) {
                    aiqe aiqeVar = ajnfVar.v;
                    if (aiqeVar == null) {
                        aiqeVar = aiqe.a;
                    }
                    aiqdVar = aiqeVar.c;
                    if (aiqdVar == null) {
                        aiqdVar = aiqd.a;
                    }
                } else {
                    aiqdVar = ajnfVar.u;
                    if (aiqdVar == null) {
                        aiqdVar = aiqd.a;
                    }
                }
                if ((ajnfVar.b & SemanticState.Multiline) != 0) {
                    this.A.setOnClickListener(new vqd((Object) this, (aihn) ajnfVar, 13));
                }
                if (!aiqdVar.c.isEmpty()) {
                    this.A.setContentDescription(aiqdVar.c);
                }
            }
        }
        if ((aowjVar.b & 2) != 0) {
            adhv adhvVar = this.y;
            ImageView imageView = this.B;
            aqmh aqmhVar = aowjVar.d;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            adhvVar.h(imageView, aqmhVar);
            imageView.setVisibility(0);
        } else if (z) {
            this.B.setVisibility(8);
        }
        if ((aowjVar.b & 4) != 0) {
            adhv adhvVar2 = this.y;
            ImageView imageView2 = this.C;
            aqmh aqmhVar2 = aowjVar.e;
            if (aqmhVar2 == null) {
                aqmhVar2 = aqmh.a;
            }
            adhvVar2.h(imageView2, aqmhVar2);
            imageView2.setVisibility(0);
        } else if (z) {
            this.C.setVisibility(8);
        }
        if ((aowjVar.b & 1) != 0) {
            SpannableStringBuilder spannableStringBuilder = this.F;
            spannableStringBuilder.clear();
            alay alayVar = aowjVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar, null, false);
            spannableStringBuilder.append((CharSequence) spannedK);
            adsc adscVar = this.I;
            alay alayVar2 = aowjVar.c;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            alay alayVar3 = alayVar2;
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) spannableStringBuilder);
            TextView textView = this.D;
            aowjVar2 = aowjVar;
            adscVar.f(alayVar3, spannedK, spannableStringBuilder, sb, aowjVar2, textView.getId());
            tuk.u(textView, spannableStringBuilder);
        } else {
            aowjVar2 = aowjVar;
            if (z) {
                this.D.setVisibility(8);
            }
        }
        if ((aowjVar2.b & 8) != 0) {
            TextView textView2 = this.k;
            alay alayVar4 = aowjVar2.f;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
            tuk.u(textView2, ackj.k(null, alayVar4, null, false));
        } else if (z) {
            this.k.setVisibility(8);
        }
        if ((aowjVar2.b & 16) == 0) {
            if (z) {
                this.E.setVisibility(8);
            }
        } else {
            TextView textView3 = this.E;
            alay alayVar5 = aowjVar2.g;
            if (alayVar5 == null) {
                alayVar5 = alay.a;
            }
            tuk.u(textView3, ackj.k(null, alayVar5, null, false));
            textView3.setVisibility(0);
        }
    }

    public final boolean u(aowk aowkVar) {
        aowk aowkVar2;
        if (aowkVar != null && (aowkVar2 = this.r) != null) {
            if (TextUtils.equals(aowkVar2.c == 13 ? (String) aowkVar2.d : "", aowkVar.c == 13 ? (String) aowkVar.d : "") && this.g.size() == aowkVar.f.size()) {
                return true;
            }
        }
        return false;
    }
}
