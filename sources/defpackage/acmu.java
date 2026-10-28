package defpackage;

import android.app.Activity;
import android.view.ContextThemeWrapper;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acmu implements zza {
    private final Activity a;
    private final vxe b;
    private final ttm c;
    private final awmd d;
    private final Object e = this;
    private final abfv f;

    public acmu(Activity activity, vxe vxeVar, ttm ttmVar, awmd awmdVar, abfv abfvVar) {
        this.a = activity;
        this.b = vxeVar;
        this.c = ttmVar;
        this.d = awmdVar;
        this.f = abfvVar;
    }

    @Override // defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        amkl amklVar;
        boolean z;
        akxk akxkVar;
        alph alphVar = (alph) obj;
        if (alphVar != null) {
            Activity activity = this.a;
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, R.style.ReelTheme_Dialog_Alert);
            boolean zIsFinishing = activity.isFinishing();
            boolean z2 = !zIsFinishing;
            if (!zIsFinishing) {
                z2 = !activity.isDestroyed();
            }
            boolean z3 = z2;
            alpk alpkVar = alphVar.f;
            if (alpkVar == null) {
                alpkVar = alpk.a;
            }
            if (alpkVar.b == 171313147) {
                alpk alpkVar2 = alphVar.f;
                if (alpkVar2 == null) {
                    alpkVar2 = alpk.a;
                }
                amklVar = alpkVar2.b == 171313147 ? (amkl) alpkVar2.c : amkl.a;
            } else {
                amklVar = null;
            }
            boolean z4 = false;
            if (!z3 || amklVar == null) {
                z = true;
            } else {
                ((eqq) this.d.io()).e(amklVar, this.e);
                z = false;
            }
            alpk alpkVar3 = alphVar.f;
            if ((alpkVar3 == null ? alpk.a : alpkVar3).b == 85374086) {
                if (alpkVar3 == null) {
                    alpkVar3 = alpk.a;
                }
                akxkVar = alpkVar3.b == 85374086 ? (akxk) alpkVar3.c : akxk.a;
            } else {
                akxkVar = null;
            }
            if (!z3 || akxkVar == null) {
                z4 = z;
            } else {
                acwp.i(contextThemeWrapper, akxkVar, this.b, null, this.e, this.f);
            }
            if (z3 && alphVar.g.size() > 0) {
                this.b.d(alphVar.g, null);
            } else if (z4) {
                tuk.n(activity.getApplicationContext(), R.string.video_is_flagged, 1);
            }
        }
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        this.c.e(toeVar);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
