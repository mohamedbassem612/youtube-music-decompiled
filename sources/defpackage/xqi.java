package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;
import com.google.android.libraries.youtube.mdx.manualpairing.TvCodeEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xqi {
    public final cf a;
    public final xgn b;
    public final xrd c;
    public final xru d;
    public aeaa e;
    public aeaa f;
    public TextInputLayout g;
    public TvCodeEditText h;
    public int i;
    public Button j;
    public TextView k;
    public ViewTreeObserver.OnGlobalLayoutListener l;
    public final yar m;
    public final afip n;
    public final lqa o;
    public final aciz p;
    private final vxz q;

    public xqi(cf cfVar, xgn xgnVar, xrd xrdVar, yar yarVar, xru xruVar, afip afipVar, lqa lqaVar, aciz acizVar, vxz vxzVar) {
        this.a = cfVar;
        this.b = xgnVar;
        this.c = xrdVar;
        this.m = yarVar;
        this.d = xruVar;
        this.n = afipVar;
        this.o = lqaVar;
        this.p = acizVar;
        this.q = vxzVar;
    }

    public final int a() {
        if (this.q.l(208, 45757733L, false)) {
            return R.string.mdx_pref_pair_with_tv_link_button_add_a_device_case;
        }
        return this.o.O() ? R.string.mdx_pref_pair_with_tv_link_button_sentence_case : R.string.mdx_pref_pair_with_tv_link_button;
    }

    public final void b() {
        dii diiVar;
        xvr xvrVarC;
        xvr xvrVarB = this.m.b(String.valueOf(this.o.P() ? this.k.getTag(R.id.device_id_from_button_tag) : this.j.getTag(R.id.device_id_from_button_tag)));
        if (xvrVarB != null) {
            vxz vxzVar = this.q;
            if (vxzVar.l(208, 45757733L, false)) {
                tuk.n(this.a.getBaseContext(), R.string.mdx_newly_added_device_toast_msg, 1);
            } else {
                xru xruVar = this.d;
                xqg xqgVar = new xqg(0);
                taq.d();
                if ((xvrVarB instanceof xvn) || (xvrVarB instanceof xvk)) {
                    agrx agrxVar = agso.a;
                    Iterator it = dij.i().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            diiVar = null;
                            break;
                        }
                        diiVar = (dii) it.next();
                        if (xsa.h(diiVar) && diiVar.s != null && (xvrVarC = ((yar) xruVar.d.io()).c(diiVar.s)) != null && xvrVarB.d().equals(xvrVarC.d())) {
                            break;
                        }
                    }
                    if (diiVar == null) {
                        xruVar.k = xvrVarB;
                        xruVar.l = xqgVar;
                    } else {
                        xruVar.J(diiVar);
                        xqgVar.b(xvrVarB, Boolean.TRUE);
                    }
                } else {
                    new IllegalArgumentException("screen must be DIAL or MdxCloudScreen");
                }
            }
            cf cfVar = this.a;
            if (cfVar instanceof PairWithTvActivity) {
                ((PairWithTvActivity) cfVar).h(!vxzVar.l(208, 45757733L, false));
            }
        }
    }

    public final void c() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/youtube/answer/3230451"));
        try {
            afwl.m(this.a, intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.a, R.string.mdx_use_tv_code_help_page_error, 1).show();
        }
    }

    public final void d(boolean z) {
        aeaa aeaaVar = this.e;
        if (aeaaVar != null) {
            aihh aihhVar = (aihh) ajnf.a.createBuilder();
            int i = z ? 10 : 3;
            aihhVar.copyOnWrite();
            ajnf ajnfVar = (ajnf) aihhVar.instance;
            ajnfVar.d = Integer.valueOf(i - 1);
            ajnfVar.c = 1;
            aihhVar.copyOnWrite();
            ajnf ajnfVar2 = (ajnf) aihhVar.instance;
            ajnfVar2.b |= 8;
            ajnfVar2.l = z;
            aeaaVar.a((ajnf) aihhVar.build(), null, null);
        }
        this.k.setText(a());
        this.k.setEnabled(!z);
    }
}
