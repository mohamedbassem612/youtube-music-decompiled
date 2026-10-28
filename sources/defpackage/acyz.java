package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acyz {
    public final Set a = new CopyOnWriteArraySet();
    public ViewGroup b;
    public aeeq c;
    acyu d;
    public int e;
    public final vxz f;
    private final Context g;
    private final awmd h;
    private final aeda i;
    private final afip j;

    public acyz(Context context, awmd awmdVar, afip afipVar, aeda aedaVar, vxz vxzVar) {
        this.g = context;
        this.h = awmdVar;
        this.j = afipVar;
        this.i = aedaVar;
        this.f = vxzVar;
    }

    public static final /* bridge */ /* synthetic */ aeep c() {
        acxi acxiVar = new acxi();
        acxiVar.d(-1);
        byte b = acxiVar.e;
        acxiVar.f = 2;
        acxiVar.e = (byte) (b | 37);
        acxiVar.b(1);
        acxiVar.e(0);
        acxiVar.c(aigj.d);
        return acxiVar;
    }

    public final void a(aeeq aeeqVar) {
        acyu acyuVar;
        if (a.x() && aeeqVar == this.c && (acyuVar = this.d) != null) {
            acyuVar.e(3);
        }
    }

    public final void b(aeeq aeeqVar) {
        asmv asmvVar;
        ViewGroup viewGroup;
        acyu acyuVar;
        afcq afcqVar;
        agkj agkjVar;
        if (!a.x() || aeeqVar == null) {
            return;
        }
        this.c = aeeqVar;
        if (aeeqVar.e == 2 || (asmvVar = aeeqVar.b) == null) {
            return;
        }
        Context context = this.g;
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context);
        if (this.f.l(400, 45827589L, false)) {
            nrv nrvVar = aeeqVar.f;
            View viewB = nrvVar != null ? nrvVar.b() : null;
            if (viewB == null || (agkjVar = nrvVar.e) == null || !agkjVar.containsKey("221293762")) {
                viewGroup = context instanceof Activity ? (ViewGroup) ((Activity) context).getWindow().findViewById(R.id.interstitials_container) : null;
            } else {
                viewGroup = (ViewGroup) viewB.getRootView().findViewById(android.R.id.content);
            }
            if (viewGroup == null) {
                return;
            }
        } else {
            ViewGroup viewGroup2 = (ViewGroup) ((Activity) context).getWindow().findViewById(R.id.interstitials_container);
            this.b = viewGroup2;
            if (viewGroup2 == null) {
                return;
            }
            this.e = viewGroup2.getVisibility();
            viewGroup = this.b;
        }
        viewGroup.setVisibility(0);
        viewGroup.addView(coordinatorLayout);
        aeem aeemVar = aeeqVar.d;
        if (aeemVar != null) {
            this.a.add(aeemVar);
        }
        xgn xgnVar = aeeqVar.c;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClickable(true);
        frameLayout.setImportantForAccessibility(2);
        ntw ntwVarA = ntx.a((ntr) this.h.io());
        ntwVarA.c(false);
        if (xgnVar != null) {
            ntwVarA.i = this.j.e(xgnVar);
        }
        mel melVar = new mel(context, ntwVarA.a());
        melVar.setAccessibilityLiveRegion(2);
        melVar.b = xgnVar != null ? new adat(xgnVar) : null;
        melVar.a(asmvVar.toByteArray(), null);
        frameLayout.addView(melVar, new FrameLayout.LayoutParams(-1, -2));
        int i = aeeqVar.a;
        acyu acyuVar2 = new acyu(coordinatorLayout, frameLayout, new acyo(), aeeqVar);
        acyuVar2.w = new acyt();
        acyuVar2.m = i;
        acyuVar2.k.setPadding(0, 0, 0, 0);
        this.d = acyuVar2;
        if (this.i.p() && (acyuVar = this.d) != null && (afcqVar = acyuVar.k) != null) {
            Drawable drawable = context.getDrawable(R.drawable.bg_snackbar_rounded);
            drawable.getClass();
            afcqVar.setBackground(drawable);
            afcqVar.setClipToOutline(true);
            int dimensionPixelSize = afcqVar.getResources().getDimensionPixelSize(R.dimen.rounded_snackbar_inset);
            asv asvVar = (asv) afcqVar.getLayoutParams();
            if (asvVar != null) {
                asvVar.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                afcqVar.setLayoutParams(asvVar);
            }
        }
        View viewFindViewById = ((Activity) context).getWindow().findViewById(R.id.pivot_bar);
        if (viewFindViewById != null && viewFindViewById.getVisibility() == 0) {
            tym.h(coordinatorLayout, new tyi(viewFindViewById.getHeight(), 1), ViewGroup.MarginLayoutParams.class);
        }
        acyu acyuVar3 = this.d;
        if (acyuVar3 != null) {
            acyuVar3.m(new acyy(this, coordinatorLayout, viewGroup));
            this.d.h();
        }
        this.a.clear();
    }
}
