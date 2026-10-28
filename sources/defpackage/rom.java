package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rom extends admr {
    public final Context a;
    public final rnp b;
    public final Handler c;
    public final cc d;
    public final snu e;
    private final Resources f;
    private final zwb g;
    private final rmw h;
    private final rop i;
    private final FrameLayout j;
    private final tld k;
    private final xsc l;

    public rom(Context context, zwb zwbVar, rmw rmwVar, xsc xscVar, Activity activity, Handler handler, abzo abzoVar, tld tldVar, rnp rnpVar, cc ccVar) {
        this.a = context;
        this.f = activity.getResources();
        this.g = zwbVar;
        this.h = rmwVar;
        this.l = xscVar;
        this.b = rnpVar;
        this.d = ccVar;
        this.c = handler;
        this.k = tldVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.j = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.i = abzoVar.F(rnpVar, frameLayout);
        this.e = new snu(tldVar, ccVar, avg.e(context), this);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.j;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.i.b(admhVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        aomb aombVar = (aomb) obj;
        apji apjiVar = aombVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aoma.b);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
        rop ropVar = this.i;
        aoma aomaVar = (aoma) objC;
        ropVar.h(aomaVar);
        this.j.addView(ropVar.f);
        if ((aomaVar.c & SemanticState.ReadOnly) != 0) {
            ajhs ajhsVarA = ajhs.a(aomaVar.m);
            if (ajhsVarA == null) {
                ajhsVarA = ajhs.AUTH_CASE_ENUMS_UNKNOWN;
            }
            int i = rnt.a[ajhsVarA.ordinal()];
        }
        xsc xscVar = this.l;
        ajhs ajhsVarA2 = ajhs.a(aomaVar.m);
        if (ajhsVarA2 == null) {
            ajhsVarA2 = ajhs.AUTH_CASE_ENUMS_UNKNOWN;
        }
        ListenableFuture listenableFutureAe = xscVar.ae(ajhsVarA2);
        if (listenableFutureAe != null) {
            taf.i(listenableFutureAe, MoreExecutors.directExecutor(), new roc(this, 2), new rjy(this, aombVar, aomaVar, 7), null);
        } else {
            g(aombVar, null, aomaVar);
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }

    public final void g(aomb aombVar, rlt rltVar, aoma aomaVar) {
        airb airbVar;
        String string;
        String string2;
        if (rltVar == null) {
            if ((aomaVar.c & SemanticState.Hidden) != 0) {
                ajue ajueVar = aomaVar.k;
                if (ajueVar == null) {
                    ajueVar = ajue.b;
                }
                rltVar = rlt.a(ajueVar);
            } else {
                rltVar = (rlt) this.g.e();
            }
        }
        rmv rmvVarD = this.h.d(rltVar);
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
            alay alayVar = airbVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            string = ackj.k(null, alayVar, null, false).toString();
        } else {
            string = rmvVarD.b;
        }
        tld tldVar = this.k;
        if (wa.a((Context) tldVar.b).c() == 0 || tldVar.j()) {
            if ((aombVar.c & 2) != 0) {
                alay alayVar2 = aombVar.e;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
                string2 = ackj.k(null, alayVar2, null, false).toString();
            } else {
                alay alayVar3 = aomaVar.d;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                string2 = ackj.k(null, alayVar3, null, false).toString();
            }
            eob eobVar = new eob(null);
            eobVar.d = string2;
            eobVar.c = string;
            if ((aombVar.c & 4) != 0 && aombVar.f && tldVar.j()) {
                eobVar.a = true;
            } else {
                eobVar.b = this.f.getString(R.string.cancel);
            }
            this.e.c(eobVar.g());
            rop ropVar = this.i;
            jip jipVar = new jip(this, eobVar, 9, (char[]) null);
            ImageView imageView = ropVar.e;
            imageView.setImageResource(com.google.android.apps.youtube.music.R.drawable.quantum_ic_fingerprint_grey600_48);
            imageView.setOnClickListener(jipVar);
            imageView.setVisibility(0);
            Resources resources = ropVar.b;
            TextView textView = ropVar.h;
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), resources.getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.biometric_icon_size), textView.getPaddingBottom());
        }
    }
}
