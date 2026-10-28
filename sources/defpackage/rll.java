package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rll implements adma {
    public final rpq a;
    public final rps b;
    public final xgn c;
    public xgx d;
    private final aduv e;
    private final afvq f;
    private final Context g;
    private final adhv h;
    private final View i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final View n;
    private final View o;
    private final View p;
    private final View q;
    private final ImageView r;
    private final ImageView s;
    private final afip t;
    private final axlj u;
    private final lqa v;

    public rll(Context context, adhv adhvVar, xgn xgnVar, rpq rpqVar, rps rpsVar, aduv aduvVar, axlj axljVar, afip afipVar, lqa lqaVar, afvq afvqVar, vxz vxzVar) {
        View viewInflate;
        this.g = context;
        this.h = adhvVar;
        this.c = xgnVar;
        this.e = aduvVar;
        this.u = axljVar;
        this.t = afipVar;
        this.v = lqaVar;
        this.a = rpqVar;
        this.b = rpsVar;
        this.f = afvqVar;
        if (vxzVar.m(56, 45750297L)) {
            viewInflate = LayoutInflater.from(context).inflate(R.layout.fusion_account_item_layout, (ViewGroup) null);
            this.i = viewInflate;
        } else {
            viewInflate = LayoutInflater.from(context).inflate(R.layout.fusion_account_item_layout_old, (ViewGroup) null);
            this.i = viewInflate;
        }
        this.j = (TextView) viewInflate.findViewById(R.id.name);
        this.k = (TextView) viewInflate.findViewById(R.id.channel_handle);
        this.l = (TextView) viewInflate.findViewById(R.id.byline);
        this.n = viewInflate.findViewById(R.id.selection_checkmark);
        this.o = viewInflate.findViewById(R.id.arrow_up_right_app_redirection_icon);
        this.p = viewInflate.findViewById(R.id.offline_icon);
        this.q = viewInflate.findViewById(R.id.selection_highlight);
        this.r = (ImageView) viewInflate.findViewById(R.id.thumbnail);
        this.s = (ImageView) viewInflate.findViewById(R.id.icon);
        this.m = (TextView) viewInflate.findViewById(R.id.edit_channel);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00df  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:34:0x0101  */
    /* JADX WARN: Code duplicated, block: B:35:0x0105  */
    /* JADX WARN: Code duplicated, block: B:36:0x0109  */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0119  */
    /* JADX WARN: Code duplicated, block: B:41:0x0122  */
    /* JADX WARN: Code duplicated, block: B:43:0x0135  */
    /* JADX WARN: Code duplicated, block: B:46:0x014b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0152  */
    /* JADX WARN: Code duplicated, block: B:50:0x0161  */
    /* JADX WARN: Code duplicated, block: B:51:0x0168  */
    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Code duplicated, block: B:57:0x019a  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:70:0x023a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0240  */
    /* JADX WARN: Code duplicated, block: B:75:0x0257  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x019a, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        int dimensionPixelSize;
        boolean z;
        xgn xgnVar;
        TextView textView;
        Spanned spannedB;
        boolean zIsEmpty;
        TextView textView2;
        Spanned spannedC;
        boolean zIsEmpty2;
        TextView textView3;
        View view;
        View view2;
        View view3;
        ViewGroup.LayoutParams layoutParams;
        CharSequence charSequenceC;
        Context context;
        int iP;
        int i;
        int i2;
        int iB;
        argn argnVarG;
        wnq wnqVar = (wnq) obj;
        if (!wnqVar.l()) {
            this.i.setOnClickListener(new aena(this.f, new jip(this, wnqVar, 8), 2));
        }
        abuz abuzVarQ = wnqVar.q();
        int i3 = (abuzVarQ == null || !abuzVarQ.m()) ? 0 : abuzVarQ.k().a;
        int i4 = 1;
        if (i3 != 48) {
            if (i3 == 36) {
                Context context2 = this.g;
                dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.names_inactive_account_thumbnail_size);
                this.j.setTextAppearance(context2, R.style.TextAppearance_YouTube_Spec_Body2a);
                this.q.setBackground(context2.getDrawable(R.drawable.fusion_selected_account_background));
            } else {
                z = false;
            }
            xgnVar = this.c;
            if (xgnVar.a() != null && wnqVar.p() != 0) {
                iP = wnqVar.p();
                i = iP - 1;
                if (iP != 0) {
                    throw null;
                }
                switch (i) {
                    case 1:
                        i2 = 273767;
                        break;
                    case 2:
                        i2 = 273770;
                        break;
                    case 3:
                        i2 = 273771;
                        break;
                    case 4:
                        i2 = 283663;
                        break;
                    case 5:
                        i2 = 283664;
                        break;
                    case 6:
                        i2 = 283665;
                        break;
                    case 7:
                        i2 = 283666;
                        break;
                    case 8:
                        i2 = 292933;
                        break;
                    case 9:
                        i2 = 292934;
                        break;
                    case 10:
                        i2 = 326114;
                        break;
                    case 11:
                        i2 = 329466;
                        break;
                    default:
                        i2 = 7116;
                        break;
                }
                iB = adlyVar.b("position", -1);
                if (iB >= 0) {
                    argnVarG = xgnVar.h(wnqVar, xhb.b(i2), iB);
                } else {
                    argnVarG = xgnVar.g(wnqVar, xhb.b(i2));
                }
                xgx xgxVar = new xgx(argnVarG);
                this.d = xgxVar;
                xgnVar.l(xgxVar);
            }
            Spanned spannedA = wnqVar.a();
            textView = this.j;
            textView.setText(spannedA);
            spannedB = wnqVar.b();
            zIsEmpty = TextUtils.isEmpty(spannedB);
            textView2 = this.l;
            if (zIsEmpty) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(spannedB);
                textView2.setVisibility(0);
            }
            spannedC = wnqVar.c();
            zIsEmpty2 = TextUtils.isEmpty(spannedC);
            textView3 = this.k;
            if (zIsEmpty2) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(spannedC);
                textView3.setVisibility(0);
            }
            if (wnqVar.q() != null) {
                this.h.h(this.r, wnqVar.q().l());
            }
            view = this.n;
            view.setVisibility(8);
            this.q.setSelected(false);
            view2 = this.o;
            view2.setVisibility(8);
            view3 = this.p;
            view3.setVisibility(8);
            if (wnqVar.n()) {
                view.setVisibility(0);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = wnqVar.a();
                if (TextUtils.isEmpty(wnqVar.c())) {
                    charSequenceC = "";
                } else {
                    charSequenceC = wnqVar.c();
                }
                charSequenceArr[1] = charSequenceC;
                charSequenceArr[2] = TextUtils.isEmpty(wnqVar.b()) ? "" : wnqVar.b();
                String strJoin = TextUtils.join(",", Arrays.asList(charSequenceArr));
                View view4 = this.i;
                context = this.g;
                view4.setContentDescription(context.getString(R.string.account_switcher_selected_account_label, strJoin));
                if (!z) {
                    textView.setTypeface(ackm.ROBOTO_MEDIUM.c(context, 0));
                }
            } else if (wnqVar.l()) {
                view3.setVisibility(0);
                View view5 = this.i;
                Context context3 = this.g;
                view5.setContentDescription(context3.getString(R.string.account_switcher_offline_account));
                textView.setTextColor(tzk.i(context3, R.attr.ytTextDisabled));
                this.k.setTextColor(tzk.i(context3, R.attr.ytTextDisabled));
                this.l.setTextColor(tzk.i(context3, R.attr.ytTextDisabled));
                this.r.setAlpha(0.75f);
                view3.setAlpha(0.5f);
                bac.p(view5, new rlj());
            } else if (wnqVar.a.n) {
                view2.setVisibility(0);
                this.i.setContentDescription(this.g.getString(R.string.account_switcher_app_redirect));
            }
            if (wnqVar.e() != null) {
                ImageView imageView = this.s;
                imageView.setImageResource(this.e.a(wnqVar.e()));
                imageView.setVisibility(0);
            }
            if (wnqVar.f() != null || !z) {
                this.m.setVisibility(8);
            }
            adzx adzxVarD = this.v.P() ? this.t.d(this.m) : this.u.q(this.m);
            apji apjiVarF = wnqVar.f();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVarF.c(aihlVarCheckIsLite);
            Object objK = apjiVarF.j.k(aihlVarCheckIsLite.d);
            ajnf ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            alay alayVar = ajnfVar.m;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar, null, false);
            TextView textView4 = this.m;
            textView4.setText(spannedK);
            adzxVarD.c = new sug(this, i4);
            adzxVarD.a(ajnfVar, xgnVar, null);
            if (textView4 == null || (layoutParams = textView4.getLayoutParams()) == null || layoutParams.height <= 0) {
                return;
            }
            textView4.setMinHeight(Math.max(textView4.getMinHeight(), layoutParams.height));
            tym.h(textView4, new tyl(-2, 1), ViewGroup.MarginLayoutParams.class);
            return;
        }
        Context context4 = this.g;
        dimensionPixelSize = context4.getResources().getDimensionPixelSize(R.dimen.names_active_account_thumbnail_size);
        this.j.setTextAppearance(context4, R.style.TextAppearance_YouTube_Spec_Title2);
        this.q.setBackground(context4.getDrawable(R.drawable.names_selected_account_background));
        ImageView imageView2 = this.r;
        imageView2.getLayoutParams().height = dimensionPixelSize;
        imageView2.getLayoutParams().width = dimensionPixelSize;
        imageView2.requestLayout();
        TextView textView5 = this.k;
        Context context5 = this.g;
        textView5.setTextAppearance(context5, R.style.TextAppearance_YouTube_Spec_Body1a);
        textView5.setTextColor(tzk.i(context5, R.attr.ytTextSecondary));
        TextView textView6 = this.l;
        textView6.setTextAppearance(context5, R.style.TextAppearance_YouTube_Spec_Body1a);
        textView6.setTextColor(tzk.i(context5, R.attr.ytTextSecondary));
        tym.h(this.q, new tyi(context5.getResources().getDimensionPixelSize(R.dimen.names_account_thumbnail_margin_end), 0), ViewGroup.MarginLayoutParams.class);
        z = true;
        xgnVar = this.c;
        if (xgnVar.a() != null) {
            iP = wnqVar.p();
            i = iP - 1;
            if (iP != 0) {
                throw null;
            }
            switch (i) {
                case 1:
                    i2 = 273767;
                    break;
                case 2:
                    i2 = 273770;
                    break;
                case 3:
                    i2 = 273771;
                    break;
                case 4:
                    i2 = 283663;
                    break;
                case 5:
                    i2 = 283664;
                    break;
                case 6:
                    i2 = 283665;
                    break;
                case 7:
                    i2 = 283666;
                    break;
                case 8:
                    i2 = 292933;
                    break;
                case 9:
                    i2 = 292934;
                    break;
                case 10:
                    i2 = 326114;
                    break;
                case 11:
                    i2 = 329466;
                    break;
                default:
                    i2 = 7116;
                    break;
            }
            iB = adlyVar.b("position", -1);
            if (iB >= 0) {
                argnVarG = xgnVar.h(wnqVar, xhb.b(i2), iB);
            } else {
                argnVarG = xgnVar.g(wnqVar, xhb.b(i2));
            }
            xgx xgxVar2 = new xgx(argnVarG);
            this.d = xgxVar2;
            xgnVar.l(xgxVar2);
        }
        Spanned spannedA2 = wnqVar.a();
        textView = this.j;
        textView.setText(spannedA2);
        spannedB = wnqVar.b();
        zIsEmpty = TextUtils.isEmpty(spannedB);
        textView2 = this.l;
        if (zIsEmpty) {
            textView2.setText(spannedB);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        spannedC = wnqVar.c();
        zIsEmpty2 = TextUtils.isEmpty(spannedC);
        textView3 = this.k;
        if (zIsEmpty2) {
            textView3.setText(spannedC);
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        if (wnqVar.q() != null) {
            this.h.h(this.r, wnqVar.q().l());
        }
        view = this.n;
        view.setVisibility(8);
        this.q.setSelected(false);
        view2 = this.o;
        view2.setVisibility(8);
        view3 = this.p;
        view3.setVisibility(8);
        if (wnqVar.n()) {
            view.setVisibility(0);
            CharSequence[] charSequenceArr2 = new CharSequence[3];
            charSequenceArr2[0] = wnqVar.a();
            if (TextUtils.isEmpty(wnqVar.c())) {
                charSequenceC = "";
            } else {
                charSequenceC = wnqVar.c();
            }
            charSequenceArr2[1] = charSequenceC;
            charSequenceArr2[2] = TextUtils.isEmpty(wnqVar.b()) ? "" : wnqVar.b();
            String strJoin2 = TextUtils.join(",", Arrays.asList(charSequenceArr2));
            View view6 = this.i;
            context = this.g;
            view6.setContentDescription(context.getString(R.string.account_switcher_selected_account_label, strJoin2));
            if (!z) {
                textView.setTypeface(ackm.ROBOTO_MEDIUM.c(context, 0));
            }
        } else if (wnqVar.l()) {
            view3.setVisibility(0);
            View view7 = this.i;
            Context context6 = this.g;
            view7.setContentDescription(context6.getString(R.string.account_switcher_offline_account));
            textView.setTextColor(tzk.i(context6, R.attr.ytTextDisabled));
            this.k.setTextColor(tzk.i(context6, R.attr.ytTextDisabled));
            this.l.setTextColor(tzk.i(context6, R.attr.ytTextDisabled));
            this.r.setAlpha(0.75f);
            view3.setAlpha(0.5f);
            bac.p(view7, new rlj());
        } else if (wnqVar.a.n) {
            view2.setVisibility(0);
            this.i.setContentDescription(this.g.getString(R.string.account_switcher_app_redirect));
        }
        if (wnqVar.e() != null) {
            ImageView imageView3 = this.s;
            imageView3.setImageResource(this.e.a(wnqVar.e()));
            imageView3.setVisibility(0);
        }
        if (wnqVar.f() != null) {
        }
        this.m.setVisibility(8);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
