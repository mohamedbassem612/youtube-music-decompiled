package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rpl implements adma {
    private final axlj A;
    public final Activity a;
    public final tts b;
    public final zwb c;
    public final rre d;
    public final wnw e;
    final admj f;
    public final tfq g;
    public final rqa h;
    public final rql i;
    public final xsc j;
    private final adhv k;
    private final View l;
    private final View m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final TextView q;
    private final TextView r;
    private final ImageView s;
    private final ImageView t;
    private final adhr u;
    private final View v;
    private final LinearLayout w;
    private final aduv x;
    private final xgn y;
    private final vxz z;

    public rpl(Activity activity, rql rqlVar, xsc xscVar, adhv adhvVar, tfq tfqVar, zwb zwbVar, awmd awmdVar, tts ttsVar, rre rreVar, rqa rqaVar, wnw wnwVar, axlj axljVar, aduv aduvVar, xgm xgmVar, vxz vxzVar) {
        rqlVar.getClass();
        this.f = new admj(awmdVar);
        activity.getClass();
        this.a = activity;
        this.j = xscVar;
        adhvVar.getClass();
        this.k = adhvVar;
        tfqVar.getClass();
        this.g = tfqVar;
        ttsVar.getClass();
        this.b = ttsVar;
        this.c = zwbVar;
        this.d = rreVar;
        this.h = rqaVar;
        this.e = wnwVar;
        this.A = axljVar;
        this.x = aduvVar;
        this.z = vxzVar;
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.music_active_account_header, (ViewGroup) null);
        this.l = viewInflate;
        this.s = (ImageView) viewInflate.findViewById(R.id.account_thumbnail);
        this.n = (TextView) viewInflate.findViewById(R.id.account_name);
        this.o = (TextView) viewInflate.findViewById(R.id.email);
        this.p = (TextView) viewInflate.findViewById(R.id.channel_handle);
        TextView textView = (TextView) viewInflate.findViewById(R.id.manage_account);
        this.q = textView;
        this.t = (ImageView) viewInflate.findViewById(R.id.switch_account);
        this.r = (TextView) viewInflate.findViewById(R.id.status_text);
        this.m = viewInflate.findViewById(R.id.separator);
        this.w = (LinearLayout) viewInflate.findViewById(R.id.compact_links);
        adhq adhqVar = new adhq(adhvVar.d());
        adhqVar.c(R.drawable.missing_avatar);
        this.u = adhqVar.a();
        this.v = viewInflate.findViewById(R.id.account_container);
        this.i = rqlVar;
        textView.setOnClickListener(new rnx(xscVar, 6));
        this.y = xgmVar.hB();
    }

    @Override // defpackage.adma
    public final View a() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b5  */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        xgn xgnVar;
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        airk airkVar = (airk) obj;
        if (adlyVar == null || (xgnVar = adlyVar.b) == xgn.l) {
            xgnVar = this.y;
        }
        final xgn xgnVar2 = xgnVar;
        xgnVar2.w(new xgj(airkVar.n, (amud) null), null);
        if ((airkVar.b & 1) != 0) {
            alayVar = airkVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        TextView textView = this.n;
        textView.setText(spannedK);
        Activity activity = this.a;
        textView.setContentDescription(activity.getString(R.string.account_switcher_accessibility_label, new Object[]{spannedK}));
        int i = airkVar.b & 2;
        if (i != 0) {
            if (i != 0) {
                alayVar3 = airkVar.d;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
            } else {
                alayVar3 = null;
            }
            Spanned spannedK2 = ackj.k(null, alayVar3, null, false);
            TextView textView2 = this.o;
            textView2.setText(spannedK2);
            textView2.setVisibility(0);
        } else {
            this.o.setVisibility(8);
        }
        TextView textView3 = this.p;
        if (textView3 != null) {
            if ((airkVar.b & 4) != 0) {
                alay alayVar4 = airkVar.e;
                if (alayVar4 == null) {
                    alayVar4 = alay.a;
                }
                textView3.setText(ackj.k(null, alayVar4, null, false));
                textView3.setTextColor(tzk.i(activity, R.attr.ytTextPrimary));
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(8);
            }
        }
        zwb zwbVar = this.c;
        zwa zwaVarE = zwbVar.e();
        if (((zwaVarE instanceof rlt) && ((rlt) zwaVarE).f()) || (airkVar.b & 64) == 0) {
            alayVar2 = airkVar.g;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            this.q.setText(ackj.k(null, alayVar2, null, false));
        } else {
            apji apjiVar = airkVar.h;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                axlj axljVar = this.A;
                TextView textView4 = this.q;
                adzx adzxVarQ = axljVar.q(textView4);
                apji apjiVar2 = airkVar.h;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                final ajnf ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                alay alayVar5 = ajnfVar.m;
                if (alayVar5 == null) {
                    alayVar5 = alay.a;
                }
                textView4.setText(ackj.k(null, alayVar5, null, false));
                adzxVarQ.c = new adzw() { // from class: rpk
                    @Override // defpackage.adzw
                    public final void iP(aihh aihhVar) {
                        xgnVar2.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(ajnfVar.y, (amud) null), null);
                        this.a.j.ad();
                    }
                };
                adzxVarQ.a(ajnfVar, xgnVar2, null);
            } else {
                alayVar2 = airkVar.g;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
                this.q.setText(ackj.k(null, alayVar2, null, false));
            }
        }
        textView.setTextColor(tzk.i(activity, R.attr.ytTextPrimary));
        this.o.setTextColor(tzk.i(activity, R.attr.ytTextPrimary));
        if (!rmp.f(zwbVar.e())) {
            this.v.setOnClickListener(new upl(this, adlyVar, xgnVar2, airkVar, 1));
            if ((airkVar.b & 32768) == 0) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, tuk.w(activity, R.drawable.yt_outline_chevron_down_black_24), (Drawable) null);
                this.t.setVisibility(8);
            } else {
                apji apjiVar3 = airkVar.m;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
                apjiVar3.c(aihlVarCheckIsLite3);
                if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                    axlj axljVar2 = this.A;
                    ImageView imageView = this.t;
                    adzx adzxVarQ2 = axljVar2.q(imageView);
                    apji apjiVar4 = airkVar.m;
                    if (apjiVar4 == null) {
                        apjiVar4 = apji.a;
                    }
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
                    apjiVar4.c(aihlVarCheckIsLite4);
                    Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                    ajnf ajnfVar2 = (ajnf) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                    Context context = imageView.getContext();
                    aduv aduvVar = this.x;
                    aliz alizVarA = aliz.a((ajnfVar2.e == 8 ? (alja) ajnfVar2.f : alja.a).c);
                    if (alizVarA == null) {
                        alizVarA = aliz.UNKNOWN;
                    }
                    Drawable drawableW = tuk.w(context, aduvVar.a(alizVarA));
                    drawableW.setAutoMirrored(true);
                    imageView.setImageDrawable(drawableW);
                    adzxVarQ2.a(ajnfVar2, xgnVar2, null);
                    imageView.setVisibility(0);
                } else {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, tuk.w(activity, R.drawable.yt_outline_chevron_down_black_24), (Drawable) null);
                    this.t.setVisibility(8);
                }
            }
        }
        adhv adhvVar = this.k;
        ImageView imageView2 = this.s;
        aqmh aqmhVar = airkVar.f;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        adhvVar.j(imageView2, aqmhVar, this.u);
        Spanned spannedK3 = airkVar.i.size() > 0 ? ackj.k(null, (alay) airkVar.i.get(0), null, false) : null;
        TextView textView5 = this.r;
        tuk.u(textView5, spannedK3);
        textView5.setContentDescription(spannedK3);
        if (this.z.l(19, 45355594L, false) || !TextUtils.isEmpty(spannedK3)) {
            this.m.setVisibility(8);
        }
        if ((airkVar.b & SemanticState.Obscured) != 0) {
            apji apjiVar5 = airkVar.j;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            aihl aihlVar = akbh.a;
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar);
            apjiVar5.c(aihlVarCheckIsLite5);
            if (apjiVar5.j.n(aihlVarCheckIsLite5.d)) {
                admj admjVar = this.f;
                LinearLayout linearLayout = this.w;
                rpo rpoVar = (rpo) admjVar.a(linearLayout);
                apji apjiVar6 = airkVar.j;
                if (apjiVar6 == null) {
                    apjiVar6 = apji.a;
                }
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar);
                apjiVar6.c(aihlVarCheckIsLite6);
                Object objK3 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
                rpoVar.hU(adlyVar, (akbg) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3)));
                linearLayout.addView(rpoVar.b);
            }
        }
        if ((airkVar.b & 16384) != 0) {
            apji apjiVar7 = airkVar.l;
            if (apjiVar7 == null) {
                apjiVar7 = apji.a;
            }
            aihl aihlVar2 = akbh.a;
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar2);
            apjiVar7.c(aihlVarCheckIsLite7);
            if (apjiVar7.j.n(aihlVarCheckIsLite7.d)) {
                admj admjVar2 = this.f;
                LinearLayout linearLayout2 = this.w;
                rpo rpoVar2 = (rpo) admjVar2.a(linearLayout2);
                apji apjiVar8 = airkVar.l;
                if (apjiVar8 == null) {
                    apjiVar8 = apji.a;
                }
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar2);
                apjiVar8.c(aihlVarCheckIsLite8);
                Object objK4 = apjiVar8.j.k(aihlVarCheckIsLite8.d);
                rpoVar2.hU(adlyVar, (akbg) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4)));
                linearLayout2.addView(rpoVar2.b);
            }
        }
        if ((airkVar.b & SemanticState.Multiline) != 0) {
            apji apjiVar9 = airkVar.k;
            if (apjiVar9 == null) {
                apjiVar9 = apji.a;
            }
            aihl aihlVar3 = akbh.a;
            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar3);
            apjiVar9.c(aihlVarCheckIsLite9);
            if (apjiVar9.j.n(aihlVarCheckIsLite9.d)) {
                admj admjVar3 = this.f;
                LinearLayout linearLayout3 = this.w;
                rpo rpoVar3 = (rpo) admjVar3.a(linearLayout3);
                apji apjiVar10 = airkVar.k;
                if (apjiVar10 == null) {
                    apjiVar10 = apji.a;
                }
                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aihlVar3);
                apjiVar10.c(aihlVarCheckIsLite10);
                Object objK5 = apjiVar10.j.k(aihlVarCheckIsLite10.d);
                akbg akbgVar = (akbg) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5));
                rpoVar3.hU(adlyVar, akbgVar);
                if (akbgVar.c != 4) {
                    rpoVar3.b.setOnClickListener(new ivx(this, akbgVar, xgnVar2, 8, (int[]) null));
                }
                linearLayout3.addView(rpoVar3.b);
            }
        }
        if (this.w.getChildCount() > 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, twm.c(activity.getResources().getDisplayMetrics(), 8));
        }
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
