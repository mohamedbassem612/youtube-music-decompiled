package defpackage;

import android.R;
import android.accounts.Account;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog$CustomWebView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class absb implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    final /* synthetic */ absc a;
    private final aoqv b;
    private final abse c;
    private final absa d;

    public absb(absc abscVar, abse abseVar, absa absaVar, aoqv aoqvVar) {
        this.a = abscVar;
        this.c = abseVar;
        this.b = aoqvVar;
        this.d = absaVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.c.b();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.c.b();
            this.a.e = null;
            return;
        }
        if (i == -1) {
            aoqv aoqvVar = this.b;
            if (aoqvVar != null) {
                absa absaVar = this.d;
                abse abseVar = this.c;
                zwb zwbVar = absaVar.c;
                ahno.O(zwbVar.u());
                absaVar.g = abseVar;
                WeakReference weakReference = absaVar.a;
                Activity activity = (Activity) weakReference.get();
                if (activity == null || activity.isFinishing()) {
                    zvp.a(zvn.a, zvm.k, "Attempted to start AgeVerificationDialog when the activity is destroyed");
                } else {
                    absaVar.d = new Dialog(activity, R.style.Theme.Black.NoTitleBar.Fullscreen);
                }
                absaVar.d.setContentView(com.google.android.apps.youtube.music.R.layout.age_verification_dialog);
                absaVar.d.setOnCancelListener(new gxt(absaVar, 15));
                View viewFindViewById = absaVar.d.findViewById(com.google.android.apps.youtube.music.R.id.close);
                viewFindViewById.setClickable(true);
                viewFindViewById.setOnClickListener(new yde(absaVar, 5));
                absaVar.e = (AgeVerificationDialog$CustomWebView) absaVar.d.findViewById(com.google.android.apps.youtube.music.R.id.webview);
                absaVar.e.getSettings().setJavaScriptEnabled(true);
                absaVar.e.getSettings().setAllowContentAccess(false);
                absaVar.e.getSettings().setAllowFileAccess(false);
                absaVar.e.setVisibility(0);
                absaVar.e.getSettings().setSaveFormData(false);
                Account accountN = absaVar.h.N(zwbVar.e());
                String str = aoqvVar.c;
                String str2 = accountN == null ? "" : accountN.name;
                absaVar.e.setWebViewClient(new abrz(absaVar, str));
                absaVar.f = new sxw(new vgi(absaVar, 4));
                Activity activity2 = (Activity) weakReference.get();
                if (activity2 == null || activity2.isFinishing()) {
                    zvp.a(zvn.a, zvm.k, "Attempted to loadVideoView for AgeVerificationDialog when the activity is destroyed");
                } else {
                    absaVar.b.execute(new aasv(absaVar, str, str2, activity2, 7));
                }
            } else {
                this.c.a();
            }
            this.a.e = null;
        }
    }
}
