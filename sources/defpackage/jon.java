package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jon {
    public final jbo a;
    public final jer b;
    public final xgn c;
    public final aunn d;
    public final Context e;
    final TextView f;
    final TextView g;
    final ViewGroup h;
    public final ViewGroup i;
    public final ViewGroup j;
    public final View k;
    public final String l;
    public final String m;
    public jbw n;
    public final joa o;
    public jbm p;
    public volatile anvo q;
    private final aunn r;
    private final Executor s;
    private boolean t = false;
    private boolean u;
    private final jnj v;
    private final jij w;
    private final kjc x;

    public jon(xgn xgnVar, aunn aunnVar, Context context, jnj jnjVar, aunn aunnVar2, jij jijVar, Executor executor, hhb hhbVar, vwt vwtVar, hfn hfnVar, avmb avmbVar, kjc kjcVar, View view, jbo jboVar, jer jerVar) {
        this.c = xgnVar;
        this.a = jboVar;
        this.k = view;
        this.w = jijVar;
        this.b = jerVar;
        this.d = aunnVar;
        this.e = context;
        this.v = jnjVar;
        this.r = aunnVar2;
        this.s = executor;
        this.x = kjcVar;
        this.f = (TextView) view.findViewById(R.id.header_title);
        TextView textView = (TextView) view.findViewById(R.id.header_subtitle);
        this.g = textView;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.sub_header_layout);
        this.i = viewGroup;
        this.j = (ViewGroup) view.findViewById(R.id.sub_header_chips);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.header_action);
        this.h = viewGroup2;
        this.l = context.getString(R.string.queue_header_title);
        this.m = context.getString(R.string.queue_header_default_name);
        if (((vxz) aunnVar2.io()).l(120, 45824268L, false)) {
            textView.setTextSize(0, context.getResources().getDimension(R.dimen.large_font_size));
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.queue_header_action_margin_end));
                viewGroup2.setLayoutParams(marginLayoutParams);
            }
        }
        this.o = hhbVar.m(viewGroup, null);
        vwtVar.F(new iqb(this, hfnVar, avmbVar, 5));
    }

    public final void a() {
        View view = this.k;
        kro.Z(view, 0, 0);
        Context context = this.e;
        int iX = (jku.c(context) && this.x.n()) ? -1 : jnj.x(context);
        adly adlyVar = new adly();
        adlyVar.f("pagePadding", Integer.valueOf(iX));
        kro.T(view, adlyVar);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    public final void b(adly adlyVar, Optional optional, Optional optional2, Optional optional3, ixi ixiVar) {
        Object obj;
        boolean z;
        View view;
        alay alayVar;
        anvo anvoVar;
        if (!this.t) {
            this.t = true;
            this.s.execute(afwl.i(new ixe(this, 12)));
        }
        hly hlyVar = new hly(this, 6);
        byte[] bArr = null;
        if (true != optional.isPresent()) {
            jon jonVar = (jon) hlyVar.a;
            anvoVar = jonVar.q;
            if (anvoVar == null) {
                obj = anvoVar;
                anvo anvoVarH = hna.h(jonVar.e, jonVar.l, jonVar.m, null);
                jonVar.q = anvoVarH;
                obj = anvoVarH;
            }
        } else {
            obj = optional.get();
        }
        obj = anvoVar;
        anvo anvoVar2 = (anvo) obj;
        apji apjiVar = !anvoVar2.e.isEmpty() ? (apji) anvoVar2.e.get(0) : null;
        if (apjiVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.u = z;
        if (z) {
            jbm jbmVarA = this.p;
            if (jbmVarA == null) {
                jbmVarA = this.w.a(LayoutInflater.from(this.e).inflate(R.layout.generic_button_text_item, (ViewGroup) null), null, null, null, false);
                this.p = jbmVarA;
            }
            view = jbmVarA.a;
        } else {
            view = this.a.a;
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup.getChildCount() != 1 || viewGroup.getChildAt(0) != view) {
            viewGroup.removeAllViews();
            viewGroup.addView(view);
        }
        if (anvoVar2.f.d() > 0) {
            this.c.w(new xgj(anvoVar2.f, (amud) null), null);
        }
        alay alayVar2 = anvoVar2.c;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        Spanned spannedK = ackj.k(null, alayVar2, new jdc(this, 5), false);
        boolean zIsEmpty = TextUtils.isEmpty(spannedK);
        TextView textView = this.f;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(spannedK);
            textView.setVisibility(0);
        }
        TextView textView2 = this.g;
        if ((anvoVar2.b & 2) != 0) {
            alayVar = anvoVar2.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        textView2.setText(ackj.k(null, alayVar, new jdc(this, 6), false));
        if (apjiVar != null) {
            adlyVar.a(this.c);
            if (this.u) {
                if (((vxz) this.r.io()).l(120, 45824268L, false)) {
                    adlyVar.f("buttonDrawableGravity", 17);
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                ajnf ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                jbm jbmVar = this.p;
                if (jbmVar != null) {
                    jbmVar.hU(adlyVar, ajnfVar);
                }
            } else {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajtd.b);
                apjiVar.c(aihlVarCheckIsLite3);
                Object objK2 = apjiVar.j.k(aihlVarCheckIsLite3.d);
                this.a.hU(adlyVar, (ajsy) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2)));
            }
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
        if (optional3.isPresent()) {
            Object obj2 = optional3.get();
            this.i.setVisibility(0);
            joa joaVar = this.o;
            joaVar.c();
            joaVar.b((akrn) obj2, true);
        } else {
            this.i.setVisibility(8);
            ixiVar.f();
            hqc hqcVar = new hqc(this, ixiVar, 13, bArr);
            if (true == optional2.isPresent()) {
                Object obj3 = optional2.get();
                Object obj4 = hqcVar.b;
                Object obj5 = hqcVar.a;
                if (!((ajta) obj3).c.isEmpty()) {
                    jon jonVar2 = (jon) obj4;
                    if (jonVar2.n == null) {
                        jonVar2.n = (jbw) adul.e(jonVar2.b.a, obj3, null);
                    }
                    adly adlyVar2 = new adly();
                    adlyVar2.a(jonVar2.c);
                    adlyVar2.f("backgroundColor", Integer.valueOf(jonVar2.k.getContext().getColor(android.R.color.transparent)));
                    adlyVar2.f("chipCloudController", obj5);
                    jbw jbwVar = jonVar2.n;
                    if (jbwVar != null) {
                        jbwVar.hU(adlyVar2, obj3);
                        ViewGroup viewGroup2 = jonVar2.j;
                        if (viewGroup2.indexOfChild(jonVar2.n.a()) < 0) {
                            viewGroup2.addView(jonVar2.n.a());
                        }
                    }
                    jonVar2.i.setVisibility(0);
                }
            }
        }
        if (this.v.r()) {
            TextView textView3 = this.f;
            textView3.setFocusable(true);
            textView3.setFocusableInTouchMode(false);
            textView2.setFocusable(true);
            textView2.setFocusableInTouchMode(false);
        }
        a();
    }
}
