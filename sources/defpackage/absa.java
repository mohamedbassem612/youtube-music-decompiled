package defpackage;

import android.app.Activity;
import android.app.Dialog;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog$CustomWebView;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class absa {
    public final WeakReference a;
    public final Executor b;
    public final zwb c;
    public Dialog d;
    public AgeVerificationDialog$CustomWebView e;
    public sxw f;
    public abse g;
    public final omj h;

    public absa(Activity activity, Executor executor, zwb zwbVar, omj omjVar) {
        this.a = new WeakReference(activity);
        executor.getClass();
        this.b = executor;
        zwbVar.getClass();
        this.c = zwbVar;
        omjVar.getClass();
        this.h = omjVar;
    }

    public final void a() {
        sxw sxwVar = this.f;
        if (sxwVar != null) {
            sxwVar.c();
        }
        this.d.dismiss();
        this.e.loadUrl("about:blank");
    }

    public final void b() {
        a();
        this.g.b();
    }

    public final void c() {
        a();
        abse abseVar = this.g;
        absh.a(abseVar.b, abseVar.c.i(abseVar.a));
    }
}
