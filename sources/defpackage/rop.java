package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rop extends admr implements ror {
    private final TextView A;
    private final xsc B;
    public final Context a;
    public final Resources b;
    public final rnp c;
    public final Handler d;
    public final ImageView e;
    public final View f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public int j;
    public boolean k;
    private rlt l;
    private final aeaa m;
    private final vxe n;
    private final zwb o;
    private final rmw p;
    private final adhv q;
    private final TextView s;
    private final TextView t;
    private final TextView u;
    private final TextView v;
    private final TextView w;
    private final CheckBox x;
    private final View y;
    private final ImageView z;

    public rop(Context context, tld tldVar, zwb zwbVar, rmw rmwVar, adhv adhvVar, xsc xscVar, Activity activity, afip afipVar, vxe vxeVar, Handler handler, aciz acizVar, rnp rnpVar, ViewGroup viewGroup) {
        this.a = context;
        this.b = activity.getResources();
        this.c = rnpVar;
        this.l = (rlt) zwbVar.e();
        this.d = handler;
        this.o = zwbVar;
        this.p = rmwVar;
        this.q = adhvVar;
        this.B = xscVar;
        View viewInflate = LayoutInflater.from(context).inflate(true != acizVar.D() ? R.layout.modal_password_auth_layout : R.layout.modal_password_auth_layout_modern_type, viewGroup, false);
        this.f = viewInflate;
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.reauth_opt_out);
        this.x = checkBox;
        checkBox.setOnCheckedChangeListener(new dlm(rnpVar, 6));
        viewInflate.findViewById(R.id.close_button).setOnClickListener(new rnx(rnpVar, 5));
        this.s = (TextView) viewInflate.findViewById(R.id.title);
        this.t = (TextView) viewInflate.findViewById(R.id.description);
        this.u = (TextView) viewInflate.findViewById(R.id.other_methods_field);
        this.g = (TextView) viewInflate.findViewById(R.id.password_title);
        TextView textView = (TextView) viewInflate.findViewById(R.id.password_field);
        this.h = textView;
        this.v = (TextView) viewInflate.findViewById(R.id.account_email_field);
        this.w = (TextView) viewInflate.findViewById(R.id.forgot_password_field);
        this.y = viewInflate.findViewById(R.id.account_container);
        this.z = (ImageView) viewInflate.findViewById(R.id.account_thumbnail);
        this.A = (TextView) viewInflate.findViewById(R.id.email);
        this.e = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.i = (TextView) viewInflate.findViewById(R.id.error_message_field);
        aeaa aeaaVarD = afipVar.d((TextView) viewInflate.findViewById(R.id.confirm_button));
        this.m = aeaaVarD;
        aeaaVarD.c = new roa(this, tldVar, 2);
        textView.setOnEditorActionListener(new ron(this, tldVar, 0));
        this.n = vxeVar;
        n(R.string.other_methods_suffix);
        n(R.string.use_fingerprint_suffix);
    }

    private final void m() {
        this.g.setTextColor(tzk.n(this.a, R.attr.ytThemedBlue).orElse(0));
        this.h.setText("");
        tuk.l(this.i, false);
    }

    private final void n(int i) {
        Resources resources = this.b;
        String string = resources.getString(i);
        String string2 = resources.getString(R.string.password_other_methods_prefix, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new roo(this, i), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.f;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        m();
        tuk.l(this.i, false);
        this.j = 0;
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        h((aoma) obj);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aoma) obj).i.G();
    }

    public final void g(aoma aomaVar, rlt rltVar) {
        rlt rltVarA;
        alay alayVar;
        alay alayVar2;
        SpannableStringBuilder spannableStringBuilder;
        alay alayVar3;
        airb airbVar;
        String string;
        abuz abuzVar;
        if (rltVar != null) {
            rltVarA = rltVar;
        } else if ((aomaVar.c & SemanticState.Hidden) != 0) {
            ajue ajueVar = aomaVar.k;
            if (ajueVar == null) {
                ajueVar = ajue.b;
            }
            rltVarA = rlt.a(ajueVar);
        } else {
            rltVarA = (rlt) this.o.e();
        }
        this.l = rltVarA;
        rmv rmvVarD = this.p.d(rltVarA);
        if (rmvVarD == null) {
            rmvVarD = rmv.a;
        }
        TextView textView = this.s;
        aqmh aqmhVar = null;
        if ((aomaVar.c & 1) != 0) {
            alayVar = aomaVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        CheckBox checkBox = this.x;
        if ((aomaVar.c & SemanticState.Focused) != 0) {
            alayVar2 = aomaVar.j;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        vxe vxeVar = this.n;
        tuk.u(checkBox, vxl.a(null, alayVar2, vxeVar, false));
        TextView textView2 = this.t;
        aiie<alay> aiieVar = aomaVar.e;
        if (aiieVar.isEmpty()) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            boolean z = true;
            for (alay alayVar4 : aiieVar) {
                if (!z) {
                    spannableStringBuilder.append((CharSequence) System.getProperty("line.separator"));
                }
                spannableStringBuilder.append((CharSequence) vxl.a(null, alayVar4, vxeVar, true));
                z = false;
            }
        }
        tuk.u(textView2, spannableStringBuilder);
        TextView textView3 = this.w;
        if ((aomaVar.c & 8) != 0) {
            alayVar3 = aomaVar.g;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        tuk.u(textView3, vxl.a(null, alayVar3, vxeVar, false));
        this.j = aomaVar.f - 1;
        this.k = (aomaVar.c & 2) != 0;
        alay alayVar5 = aomaVar.h;
        if (alayVar5 == null) {
            alayVar5 = alay.a;
        }
        aihh aihhVar = (aihh) ajnf.a.createBuilder();
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        alayVar5.getClass();
        ajnfVar.m = alayVar5;
        ajnfVar.b |= 64;
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        ajnfVar2.d = 2;
        ajnfVar2.c = 1;
        this.m.a((ajnf) aihhVar.build(), null, null);
        m();
        if ((aomaVar.c & SemanticState.LiveRegion) != 0) {
            apji apjiVar = aomaVar.l;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(airp.b);
            apjiVar.c(aihlVarCheckIsLite);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
            airbVar = (airb) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        } else {
            airbVar = null;
        }
        if (airbVar != null) {
            alay alayVar6 = airbVar.d;
            if (alayVar6 == null) {
                alayVar6 = alay.a;
            }
            string = ackj.k(null, alayVar6, null, false).toString();
        } else {
            string = rmvVarD.b;
        }
        TextView textView4 = this.v;
        textView4.setText(string);
        aqmh aqmhVarL = ((rltVar == null && (aomaVar.c & SemanticState.Hidden) == 0) || (abuzVar = rmvVarD.g) == null || !abuzVar.m()) ? null : abuzVar.l();
        if (aqmhVarL != null) {
            aqmhVar = aqmhVarL;
        } else if (airbVar != null && (aqmhVar = airbVar.g) == null) {
            aqmhVar = aqmh.a;
        }
        if (aqmhVar != null) {
            this.q.h(this.z, aqmhVar);
            this.A.setText(string);
            tuk.l(this.y, true);
            tuk.l(textView4, false);
        }
        if (rltVar == null && (aomaVar.c & SemanticState.Hidden) == 0 && aqmhVar == null) {
            tuk.u(this.u, this.b.getString(R.string.use_password_only));
        } else {
            tuk.l(this.u, false);
        }
    }

    protected final void h(aoma aomaVar) {
        ajhs ajhsVarA = ajhs.a(aomaVar.m);
        if (ajhsVarA == null) {
            ajhsVarA = ajhs.AUTH_CASE_ENUMS_UNKNOWN;
        }
        ListenableFuture listenableFutureAe = this.B.ae(ajhsVarA);
        if (listenableFutureAe != null) {
            taf.i(listenableFutureAe, MoreExecutors.directExecutor(), new iul(8), new itt(this, aomaVar, 9), null);
        } else {
            g(aomaVar, null);
        }
    }

    public final void i(tld tldVar) {
        String string = this.h.getText().toString();
        if (string.length() > 0) {
            tldVar.g(string, this.l, this);
        }
    }

    @Override // defpackage.ror
    public final void j() {
        this.c.j(2);
    }

    @Override // defpackage.ror
    public final void k() {
        this.d.post(new rno(this, 3));
    }

    @Override // defpackage.ror
    public final void l() {
        this.c.j(1);
    }
}
