package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.music.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aack {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public aack(dow dowVar, Function0 function0) {
        this.d = dowVar;
        this.b = function0;
        dpa dpaVar = new dpa(new ayq((byte[]) null), new agw(this, 5));
        this.c = dpaVar;
        this.e = new dou(dpaVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aunn, java.lang.Object] */
    public final void a() {
        rmv rmvVarC = ((rmw) this.c.io()).c();
        if (rmvVarC != null) {
            jin jinVar = (jin) this.d.io();
            Object obj = this.e;
            jio jioVarE = jin.e();
            Activity activity = (Activity) obj;
            ((jik) jioVarE).k(activity.getResources().getString(R.string.sign_in_toast, rmvVarC.d));
            jioVarE.l(activity.getString(R.string.title_account_switcher), new hdf(this, 20));
            jinVar.d(jioVarE.b());
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [abvn, java.lang.Object] */
    public final void b() {
        int i = 1;
        int i2 = 6;
        ((hwz) this.d).h().i(new abwr(i)).al(new hxi(this, 12), new hyx(i2));
        ?? r0 = this.b;
        ((avlh) r0.r().a).i(new abwr(i)).al(new hxi(this, 11), new hyx(i2));
        ((avlh) r0.r().n).i(new abwr(i)).al(new hyx(7), new hyx(i2));
        ((avlh) r0.r().k).i(new abwr(i)).al(new hyx(8), new hyx(i2));
        r0.P().i(new abwr(i)).al(new hyx(9), new hyx(i2));
    }

    public final void c(boolean z) {
        abvk abvkVar = (abvk) this.c;
        abvkVar.ah();
        abvkVar.y(z);
    }

    public final void d(ibh ibhVar) {
        if (this.a || hwz.l(ibhVar)) {
            ((abvk) this.c).s();
        } else {
            ((abvk) this.c).f.j(ibhVar == ibh.DONT_PLAY_VIDEO_OVERRIDE || ibhVar == ibh.ATV_PREFERRED_USER_TRIGGERED, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dow, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    public final void e() {
        ?? r0 = this.d;
        if (r0.getLifecycle().a() != bob.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.b.invoke();
        r0.getLifecycle().b(new pz(this, 5));
        this.a = true;
    }

    public aack(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.e = awmdVar4;
        this.a = false;
    }

    public aack(abvk abvkVar, abvn abvnVar, hwz hwzVar, kro kroVar) {
        abvkVar.getClass();
        this.c = abvkVar;
        this.b = abvnVar;
        this.d = hwzVar;
        this.e = kroVar;
    }

    public aack(Activity activity, aunn aunnVar, aunn aunnVar2, aunn aunnVar3) {
        activity.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        this.e = activity;
        this.c = aunnVar;
        this.d = aunnVar2;
        this.b = aunnVar3;
    }
}
