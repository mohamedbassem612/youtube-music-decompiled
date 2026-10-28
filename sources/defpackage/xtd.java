package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xtd implements adma {
    private final /* synthetic */ int $cid;
    final View a;
    public final Object b;
    final Object c;
    public final Object d;

    public xtd(Context context, xgv xgvVar, aeag aeagVar, int i) {
        this.$cid = i;
        View viewInflate = View.inflate(context, R.layout.emoji_picker_category, null);
        this.b = viewInflate;
        this.a = (TextView) viewInflate.findViewById(R.id.category_name);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.emoji_grid);
        recyclerView.ah(new GridLayoutManager(context, 7));
        recyclerView.ad(aeagVar);
        this.d = aeagVar;
        this.c = xgvVar;
    }

    private final void d() {
        Object obj = this.c;
        if (obj != null) {
            ViewParent parent = ((TextView) obj).getParent();
            if (parent instanceof xts) {
                ((xts) parent).a();
            }
        }
    }

    @Override // defpackage.adma
    public final View a() {
        int i = this.$cid;
        if (i == 0) {
            return this.a;
        }
        Object obj = this.b;
        if (i != 1) {
        }
        return (View) obj;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        int i = this.$cid;
        if (i == 0 || i == 1) {
            return;
        }
        Object obj = this.d;
        if (i != 2) {
            ((aeaq) obj).a = null;
        } else {
            ((aeag) obj).e = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, xgn] */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        int i = this.$cid;
        if (i == 0) {
            if (((xtb) obj).a) {
                ((TextView) this.c).setText(R.string.cancel);
                d();
            } else {
                boolean zF = ((xsh) this.d).f();
                Object obj2 = this.c;
                if (zF) {
                    ((TextView) obj2).setText(R.string.stop_casting);
                } else {
                    ((TextView) obj2).setText(R.string.disconnect);
                    d();
                }
            }
            Object obj3 = this.c;
            bac.p((View) obj3, new xtc(this));
            TextView textView = (TextView) obj3;
            textView.setOnClickListener(new xpr(this, 16));
            textView.setVisibility(0);
            xsj xsjVar = ((xsh) this.d).c;
            xgx xgxVarC = xsjVar.c(xsjVar.A, xhb.b(12927));
            if (xgxVarC != null) {
                xsjVar.A = xgxVarC;
                return;
            }
            return;
        }
        if (i == 1) {
            airo airoVar = (airo) obj;
            alay alayVar = airoVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar, null, false);
            int length = spannedK.length();
            Object obj4 = this.c;
            if (length > 0) {
                ((TextView) obj4).setText(spannedK);
            } else {
                ((TextView) obj4).setVisibility(8);
            }
            View view = this.a;
            alay alayVar2 = airoVar.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            ((TextView) view).setText(ackj.k(null, alayVar2, null, false));
            akrq akrqVar = airoVar.e;
            if (akrqVar == null) {
                akrqVar = akrq.a;
            }
            adll adllVar = new adll(akrqVar);
            adlm adlmVar = (adlm) this.d;
            adlmVar.d(adllVar);
            View view2 = adlmVar.a;
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            ((LinearLayout) this.b).addView(view2);
            return;
        }
        if (i == 2) {
            aktk aktkVar = (aktk) obj;
            aeaj aeajVar = (aeaj) adlyVar.c("CONTROLLER_KEY");
            Object obj5 = this.d;
            aeag aeagVar = (aeag) obj5;
            aeagVar.a = aeajVar;
            alay alayVar3 = aktkVar.d;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
            tuk.u((TextView) this.a, ackj.k(null, alayVar3, null, false));
            if (aktkVar.e.size() > 0) {
                aeagVar.e = agke.n(aktkVar.e);
                ((nh) obj5).jW();
            }
            if ((aktkVar.b & 64) == 0 || aktkVar.g.E()) {
                if ((aktkVar.b & 32) == 0) {
                    return;
                }
                aipe aipeVar = aktkVar.f;
                if (aipeVar == null) {
                    aipeVar = aipe.a;
                }
                if (aipeVar.b == 0) {
                    return;
                }
            }
            ?? r6 = this.c;
            adlyVar.a(r6);
            r6.l(new xgj(aktkVar.g, (amud) null));
            return;
        }
        akto aktoVar = (akto) obj;
        ajwo ajwoVar = aktoVar.f;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        Object obj6 = this.d;
        aeaq aeaqVar = (aeaq) obj6;
        aeaqVar.e = ajwoVar;
        View view3 = this.a;
        alay alayVar4 = aktoVar.d;
        if (alayVar4 == null) {
            alayVar4 = alay.a;
        }
        tuk.u((TextView) view3, ackj.k(null, alayVar4, null, false));
        if (aktoVar.e.size() > 0) {
            aeaqVar.a = agke.n(aktoVar.e);
            ((nh) obj6).jW();
        }
        if ((aktoVar.b & 64) == 0 || aktoVar.h.E()) {
            if ((aktoVar.b & 32) == 0) {
                return;
            }
            aipe aipeVar2 = aktoVar.g;
            if (aipeVar2 == null) {
                aipeVar2 = aipe.a;
            }
            if (aipeVar2.b == 0) {
                return;
            }
        }
        ?? r7 = this.c;
        adlyVar.a(r7);
        r7.l(new xgj(aktoVar.h, (amud) null));
    }

    public xtd(Context context, xsh xshVar, int i) {
        this.$cid = i;
        this.b = context;
        View viewInflate = View.inflate(context, R.layout.mdx_device_picker_stop_casting_button, null);
        this.a = viewInflate;
        this.c = (TextView) viewInflate.findViewById(R.id.stop_casting_button);
        this.d = xshVar;
    }

    public xtd(Context context, int i) {
        this.$cid = i;
        this.d = new adlm(context);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.google_account_header, (ViewGroup) null);
        this.b = linearLayout;
        this.c = (TextView) linearLayout.findViewById(R.id.name);
        this.a = (TextView) linearLayout.findViewById(R.id.email);
    }

    public xtd(Context context, xgv xgvVar, aeaq aeaqVar, int i) {
        this.$cid = i;
        this.c = xgvVar;
        View viewInflate = View.inflate(context, R.layout.emoji_picker_category, null);
        this.b = viewInflate;
        this.a = (TextView) viewInflate.findViewById(R.id.category_name);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.emoji_grid);
        recyclerView.ah(new GridLayoutManager(context, 7));
        recyclerView.ad(aeaqVar);
        this.d = aeaqVar;
    }
}
