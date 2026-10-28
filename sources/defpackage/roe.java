package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class roe extends admr implements ror {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/account/inlineauth/ModalFirstTimeUnicornPasswordInlineAuthPresenter");
    private final View A;
    private final View B;
    private Long C;
    private final vxz D;
    private final afip E;
    private final tld F;
    public final rnp b;
    public rlt c;
    public final Executor d;
    public final Executor e;
    public final vxe f;
    public final xgn g;
    public final View h;
    public final EditText i;
    public final ImageView j;
    public ViewTreeObserver.OnGlobalLayoutListener k;
    public final Activity m;
    public View.OnLayoutChangeListener n;
    public final omj p;
    private final adia q;
    private final aduv s;
    private final YouTubeAppCompatTextView t;
    private final YouTubeAppCompatTextView u;
    private final CircularImageView v;
    private final YouTubeAppCompatTextView w;
    private final YouTubeAppCompatTextView x;
    private final YouTubeAppCompatTextView y;
    private final TextView z;
    public final AtomicBoolean o = new AtomicBoolean(false);
    public boolean l = false;

    public roe(Context context, tld tldVar, Activity activity, xgn xgnVar, afip afipVar, Executor executor, Executor executor2, rnp rnpVar, omj omjVar, aciz acizVar, adhv adhvVar, aduv aduvVar, vxe vxeVar, vxz vxzVar, ViewGroup viewGroup) {
        this.b = rnpVar;
        this.g = xgnVar;
        this.d = executor;
        this.e = executor2;
        this.F = tldVar;
        this.p = omjVar;
        this.E = afipVar;
        this.s = aduvVar;
        this.f = vxeVar;
        this.D = vxzVar;
        this.m = activity;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.modal_unicorn_password_auth_layout_modern_type, viewGroup, false);
        this.h = viewInflate;
        CircularImageView circularImageView = (CircularImageView) viewInflate.findViewById(R.id.avatar);
        this.v = circularImageView;
        this.q = adul.l(adhvVar, circularImageView);
        YouTubeAppCompatTextView youTubeAppCompatTextView = (YouTubeAppCompatTextView) viewInflate.findViewById(R.id.dialog_title);
        this.t = youTubeAppCompatTextView;
        aedu aeduVarA = aedv.a();
        aeduVarA.a = 2;
        aeduVarA.b = 3;
        aeduVarA.d = 1;
        acizVar.B(aeduVarA.a(), context, youTubeAppCompatTextView);
        YouTubeAppCompatTextView youTubeAppCompatTextView2 = (YouTubeAppCompatTextView) viewInflate.findViewById(R.id.dialog_description);
        this.u = youTubeAppCompatTextView2;
        aedu aeduVarA2 = aedv.a();
        aeduVarA2.a = 3;
        aeduVarA2.b = 3;
        aeduVarA2.d = 1;
        acizVar.B(aeduVarA2.a(), context, youTubeAppCompatTextView2);
        YouTubeAppCompatTextView youTubeAppCompatTextView3 = (YouTubeAppCompatTextView) viewInflate.findViewById(R.id.title);
        this.w = youTubeAppCompatTextView3;
        aedu aeduVarA3 = aedv.a();
        aeduVarA3.a = 3;
        aeduVarA3.b = 4;
        aeduVarA3.d = 2;
        acizVar.B(aeduVarA3.a(), context, youTubeAppCompatTextView3);
        YouTubeAppCompatTextView youTubeAppCompatTextView4 = (YouTubeAppCompatTextView) viewInflate.findViewById(R.id.description);
        this.x = youTubeAppCompatTextView4;
        aedu aeduVarA4 = aedv.a();
        aeduVarA4.a = 3;
        aeduVarA4.b = 2;
        aeduVarA4.d = 1;
        acizVar.B(aeduVarA4.a(), context, youTubeAppCompatTextView4);
        this.j = (ImageView) viewInflate.findViewById(R.id.password_visibility_icon);
        this.B = viewInflate.findViewById(R.id.password_container);
        YouTubeAppCompatTextView youTubeAppCompatTextView5 = (YouTubeAppCompatTextView) viewInflate.findViewById(R.id.password_title);
        this.y = youTubeAppCompatTextView5;
        aedu aeduVarA5 = aedv.a();
        aeduVarA5.a = 3;
        aeduVarA5.b = 2;
        aeduVarA5.d = 2;
        acizVar.B(aeduVarA5.a(), context, youTubeAppCompatTextView5);
        EditText editText = (EditText) viewInflate.findViewById(R.id.password_field);
        this.i = editText;
        editText.addTextChangedListener(new gxv(this, 8));
        this.A = viewInflate.findViewById(R.id.error_container);
        TextView textView = (TextView) viewInflate.findViewById(R.id.error_message_field);
        this.z = textView;
        aedu aeduVarA6 = aedv.a();
        aeduVarA6.a = 3;
        aeduVarA6.b = 2;
        aeduVarA6.d = 1;
        acizVar.B(aeduVarA6.a(), context, (YouTubeAppCompatTextView) textView);
        YouTubeAppCompatTextView youTubeAppCompatTextView6 = (YouTubeAppCompatTextView) viewInflate.findViewById(R.id.forgot_password_field);
        aedu aeduVarA7 = aedv.a();
        aeduVarA7.a = 4;
        aeduVarA7.b = 3;
        aeduVarA7.d = 1;
        acizVar.B(aeduVarA7.a(), context, youTubeAppCompatTextView6);
        viewInflate.addOnAttachStateChangeListener(new jh(this, 4));
    }

    private final void p() {
        this.i.setText("");
        m(false);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.h;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        p();
        m(false);
    }

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
    @Override // defpackage.admr
    protected final /* synthetic */ void d(adly adlyVar, Object obj) {
        akza akzaVar = (akza) obj;
        xgn xgnVar = this.g;
        xgnVar.b(xhb.a(281332), null, null);
        xgj xgjVar = new xgj(xhb.b(281329));
        xgnVar.l(xgjVar);
        xgj xgjVar2 = new xgj(xhb.b(281328));
        xgnVar.l(xgjVar2);
        xgj xgjVar3 = new xgj(xhb.b(281327));
        xgnVar.l(xgjVar3);
        apji apjiVar = akzaVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(airp.b);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        airb airbVar = (airb) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        apji apjiVar2 = akzaVar.f;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apcv.b);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        apcv apcvVar = (apcv) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
        ajue ajueVar = akzaVar.c;
        if (ajueVar == null) {
            ajueVar = ajue.b;
        }
        this.c = rlt.a(ajueVar);
        int i = 0;
        int i2 = 8;
        if (this.D.l(88, 45852567L, false) || (akzaVar.b & 8) != 0) {
            this.C = Long.valueOf(akzaVar.e);
            taf.i(this.p.K(new rhk(this.c.a, 5)), this.d, new ijj(this, 20), new itt(this, akzaVar, i2), null);
        } else {
            this.h.setVisibility(0);
        }
        View view = this.h;
        ImageView imageView = (ImageView) view.findViewById(R.id.google_logo);
        alja aljaVar = apcvVar.c;
        if (aljaVar == null) {
            aljaVar = alja.a;
        }
        aliz alizVarA = aliz.a(aljaVar.c);
        if (alizVarA == null) {
            alizVarA = aliz.UNKNOWN;
        }
        n(alizVarA, imageView);
        YouTubeAppCompatTextView youTubeAppCompatTextView = this.t;
        alay alayVar = apcvVar.d;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        youTubeAppCompatTextView.setText(ackj.k(null, alayVar, null, false));
        YouTubeAppCompatTextView youTubeAppCompatTextView2 = this.u;
        alay alayVar2 = apcvVar.e;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        youTubeAppCompatTextView2.setText(ackj.k(null, alayVar2, null, false));
        adia adiaVar = this.q;
        aqmh aqmhVar = airbVar.g;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        adiaVar.f(aqmhVar, null);
        YouTubeAppCompatTextView youTubeAppCompatTextView3 = this.w;
        alay alayVar3 = airbVar.d;
        if (alayVar3 == null) {
            alayVar3 = alay.a;
        }
        youTubeAppCompatTextView3.setText(ackj.k(null, alayVar3, null, false));
        YouTubeAppCompatTextView youTubeAppCompatTextView4 = this.x;
        alay alayVar4 = airbVar.f;
        if (alayVar4 == null) {
            alayVar4 = alay.a;
        }
        youTubeAppCompatTextView4.setText(ackj.k(null, alayVar4, null, false));
        YouTubeAppCompatTextView youTubeAppCompatTextView5 = this.y;
        alay alayVar5 = apcvVar.f;
        if (alayVar5 == null) {
            alayVar5 = alay.a;
        }
        youTubeAppCompatTextView5.setText(ackj.k(null, alayVar5, null, false));
        p();
        alja aljaVar2 = apcvVar.g;
        if (aljaVar2 == null) {
            aljaVar2 = alja.a;
        }
        final alja aljaVar3 = apcvVar.h;
        if (aljaVar3 == null) {
            aljaVar3 = alja.a;
        }
        int i3 = 1;
        if ((aljaVar2.b & 1) == 0 || (aljaVar3.b & 1) == 0) {
            this.j.setVisibility(8);
        } else {
            ImageView imageView2 = this.j;
            imageView2.setVisibility(0);
            aliz alizVarA2 = aliz.a(aljaVar2.c);
            if (alizVarA2 == null) {
                alizVarA2 = aliz.UNKNOWN;
            }
            n(alizVarA2, imageView2);
            alay alayVar6 = apcvVar.n;
            if (alayVar6 == null) {
                alayVar6 = alay.a;
            }
            final Spanned spannedK = ackj.k(null, alayVar6, null, false);
            alay alayVar7 = apcvVar.o;
            if (alayVar7 == null) {
                alayVar7 = alay.a;
            }
            final Spanned spannedK2 = ackj.k(null, alayVar7, null, false);
            imageView2.setContentDescription(spannedK);
            final alja aljaVar4 = aljaVar2;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: rob
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    roe roeVar = this.a;
                    boolean z = roeVar.l;
                    roeVar.l = !z;
                    if (z) {
                        alja aljaVar5 = aljaVar4;
                        roeVar.i.setInputType(129);
                        aliz alizVarA3 = aliz.a(aljaVar5.c);
                        if (alizVarA3 == null) {
                            alizVarA3 = aliz.UNKNOWN;
                        }
                        CharSequence charSequence = spannedK;
                        ImageView imageView3 = roeVar.j;
                        roeVar.n(alizVarA3, imageView3);
                        imageView3.setContentDescription(charSequence);
                    } else {
                        alja aljaVar6 = aljaVar3;
                        roeVar.i.setInputType(145);
                        aliz alizVarA4 = aliz.a(aljaVar6.c);
                        if (alizVarA4 == null) {
                            alizVarA4 = aliz.UNKNOWN;
                        }
                        CharSequence charSequence2 = spannedK2;
                        ImageView imageView4 = roeVar.j;
                        roeVar.n(alizVarA4, imageView4);
                        imageView4.setContentDescription(charSequence2);
                    }
                    EditText editText = roeVar.i;
                    editText.setSelection(editText.getText().length());
                }
            });
        }
        this.i.setOnEditorActionListener(new ron(this, xgjVar3, i3));
        YouTubeAppCompatTextView youTubeAppCompatTextView6 = (YouTubeAppCompatTextView) view.findViewById(R.id.forgot_password_field);
        apji apjiVar3 = apcvVar.i;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
        apjiVar3.c(aihlVarCheckIsLite3);
        Object objK3 = apjiVar3.j.k(aihlVarCheckIsLite3.d);
        Object objC = objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3);
        afip afipVar = this.E;
        ajnf ajnfVar = (ajnf) objC;
        afipVar.d(youTubeAppCompatTextView6).a(ajnfVar, null, null);
        alay alayVar8 = ajnfVar.m;
        if (alayVar8 == null) {
            alayVar8 = alay.a;
        }
        if (alayVar8.c.size() > 0) {
            alay alayVar9 = ajnfVar.m;
            if (alayVar9 == null) {
                alayVar9 = alay.a;
            }
            SpannableString spannableString = new SpannableString(((alba) alayVar9.c.get(0)).c);
            alay alayVar10 = ajnfVar.m;
            if (alayVar10 == null) {
                alayVar10 = alay.a;
            }
            if (((alba) alayVar10.c.get(0)).h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            }
            youTubeAppCompatTextView6.setText(spannableString);
        } else {
            alay alayVar11 = ajnfVar.m;
            if (alayVar11 == null) {
                alayVar11 = alay.a;
            }
            youTubeAppCompatTextView6.setText(alayVar11.d);
        }
        youTubeAppCompatTextView6.setOnClickListener(new ivx((Object) this, (Object) xgjVar, (Object) ajnfVar, 7, (byte[]) null));
        TextView textView = this.z;
        alay alayVar12 = apcvVar.k;
        if (alayVar12 == null) {
            alayVar12 = alay.a;
        }
        textView.setText(ackj.k(null, alayVar12, null, false));
        ImageView imageView3 = (ImageView) view.findViewById(R.id.error_icon);
        imageView3.setColorFilter(tzk.i(view.getContext(), R.attr.ytErrorIndicator));
        alja aljaVar5 = apcvVar.j;
        if (aljaVar5 == null) {
            aljaVar5 = alja.a;
        }
        aliz alizVarA3 = aliz.a(aljaVar5.c);
        if (alizVarA3 == null) {
            alizVarA3 = aliz.UNKNOWN;
        }
        n(alizVarA3, imageView3);
        aeaa aeaaVarD = afipVar.d((TextView) view.findViewById(R.id.cancel_button));
        apji apjiVar4 = apcvVar.l;
        if (apjiVar4 == null) {
            apjiVar4 = apji.a;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
        apjiVar4.c(aihlVarCheckIsLite4);
        Object objK4 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
        aeaaVarD.a((ajnf) (objK4 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK4)), null, null);
        aeaaVarD.c = new roa(this, xgjVar2, i3);
        aeaa aeaaVarD2 = afipVar.d((TextView) view.findViewById(R.id.confirm_button));
        apji apjiVar5 = apcvVar.m;
        if (apjiVar5 == null) {
            apjiVar5 = apji.a;
        }
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajnp.a);
        apjiVar5.c(aihlVarCheckIsLite5);
        Object objK5 = apjiVar5.j.k(aihlVarCheckIsLite5.d);
        aeaaVarD2.a((ajnf) (objK5 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK5)), null, null);
        aeaaVarD2.c = new roa(this, xgjVar3, i);
        mrt mrtVar = new mrt(this, view, 3);
        this.n = mrtVar;
        view.addOnLayoutChangeListener(mrtVar);
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.unicorn_password_auth_scroll_view);
        View viewFindViewById = view.findViewById(R.id.divider_view);
        if (scrollView == null || viewFindViewById == null) {
            return;
        }
        this.k = new uoy(scrollView, viewFindViewById, 1);
        ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.k;
        onGlobalLayoutListener.getClass();
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }

    public final void g() {
        EditText editText = this.i;
        String string = editText.getText().toString();
        if (string.length() > 0) {
            this.F.g(string, this.c, this);
        }
        editText.setText("");
    }

    public final void i(xgj xgjVar) {
        this.g.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar, null);
    }

    @Override // defpackage.ror
    public final void j() {
        this.b.j(2);
    }

    @Override // defpackage.ror
    public final void k() {
        this.g.l(new xgj(xhb.b(281330)));
        this.d.execute(new rno(this, 2));
    }

    @Override // defpackage.ror
    public final void l() {
        this.g.l(new xgj(xhb.b(281331)));
        int i = 1;
        this.b.j(1);
        Long l = this.C;
        if (l != null) {
            taf.i(this.p.L(new sdj(this.c.a, l.longValue(), i)), this.e, new iul(7), new gpq(17), null);
        }
        o(false);
    }

    public final void m(boolean z) {
        this.B.setBackgroundResource(z ? R.drawable.text_field_border_error : R.drawable.text_field_border);
        this.A.setVisibility(true != z ? 8 : 0);
        if (z) {
            tuk.i(this.i);
            this.z.requestFocus();
        }
    }

    public final void n(aliz alizVar, ImageView imageView) {
        if (alizVar == aliz.GOOGLE_LOGO) {
            imageView.setImageResource(R.drawable.product_logo_googleg_color_48);
            return;
        }
        int iA = this.s.a(alizVar);
        if (iA != 0) {
            imageView.setImageResource(iA);
        }
    }

    public final void o(boolean z) {
        int i = 0;
        if (this.o.compareAndSet(false, true)) {
            omj omjVar = this.p;
            String str = this.c.a;
            typ.f(str);
            taf.i(omjVar.K(new rhk(str, 8)), this.e, new roc(this, i), new rod(this, z, i), null);
        }
    }
}
