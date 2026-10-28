package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.apps.youtube.music.R;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaac implements vxc {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/notification/commands/NotificationOptOutCommand");
    public final cf b;
    public final ttm c;
    public final vxe d;
    public final Executor e;
    protected AlertDialog f;
    public final wva g;
    private final abfv h;

    public aaac(cf cfVar, wva wvaVar, ttm ttmVar, vxe vxeVar, Executor executor, abfv abfvVar) {
        this.b = cfVar;
        this.g = wvaVar;
        this.c = ttmVar;
        this.d = vxeVar;
        this.e = executor;
        this.h = abfvVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        CharSequence charSequenceK;
        alay alayVar;
        AlertDialog alertDialog = this.f;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        abfv abfvVar = this.h;
        cf cfVar = this.b;
        acws acwsVarG = abfvVar.g(cfVar);
        aihl aihlVar = aocq.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            aocq aocqVar = (aocq) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if ((aocqVar.c & 8) != 0) {
                alayVar = aocqVar.e;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            charSequenceK = ackj.k(null, alayVar, null, false);
        } else {
            charSequenceK = "";
        }
        AlertDialog alertDialogCreate = acwsVarG.setMessage(charSequenceK).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(cfVar.getString(R.string.ok), new hrg(this, ajwoVar, map, 2)).create();
        this.f = alertDialogCreate;
        alertDialogCreate.show();
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
