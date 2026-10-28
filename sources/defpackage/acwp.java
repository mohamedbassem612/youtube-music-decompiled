package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acwp extends acwh {
    private final akxk d;

    protected acwp(akxk akxkVar, vxe vxeVar, abfv abfvVar, Object obj) {
        super(vxeVar, abfvVar, obj, null);
        akxkVar.getClass();
        this.d = akxkVar;
    }

    public static /* synthetic */ void h(AlertDialog alertDialog, Context context) {
        Button button = alertDialog.getButton(-1);
        if (button != null) {
            try {
                button.setTextColor(tzk.i(context, R.attr.ytCallToAction));
            } catch (Resources.NotFoundException unused) {
                if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                    button.setTextColor(-12671233);
                } else {
                    button.setTextColor(-16359468);
                }
            }
        }
    }

    public static void i(Context context, akxk akxkVar, vxe vxeVar, abfv abfvVar, Object obj, abfv abfvVar2) {
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        acwp acwpVar = new acwp(akxkVar, vxeVar, abfvVar, obj);
        AlertDialog.Builder builderG = abfvVar2 != null ? abfvVar2.g(context) : new AlertDialog.Builder(context);
        if ((akxkVar.b & 2) != 0) {
            alayVar = akxkVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        builderG.setTitle(ackj.k(null, alayVar, null, false));
        if ((akxkVar.b & 1) != 0) {
            alayVar2 = akxkVar.c;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        builderG.setMessage(vxl.a(null, alayVar2, vxeVar, true));
        if ((akxkVar.b & 4) != 0) {
            alayVar3 = akxkVar.e;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        builderG.setPositiveButton(ackj.k(null, alayVar3, null, false), acwpVar);
        if (((Boolean) tym.M(context).a(new abzr(15)).e(Boolean.TRUE)).booleanValue()) {
            return;
        }
        AlertDialog alertDialogCreate = builderG.create();
        alertDialogCreate.setOnShowListener(new sut(alertDialogCreate, context, 3));
        acwpVar.e(alertDialogCreate);
        acwpVar.f();
        ((TextView) acwpVar.c.findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());
        agev.i(acwpVar);
    }

    @Override // defpackage.acwh
    protected final void d() {
        akxk akxkVar = this.d;
        int i = akxkVar.b;
        if ((i & 16) != 0) {
            vxe vxeVar = this.a;
            ajwo ajwoVar = akxkVar.g;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.c(ajwoVar, a());
            return;
        }
        if ((i & 8) != 0) {
            vxe vxeVar2 = this.a;
            ajwo ajwoVar2 = akxkVar.f;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            vxeVar2.c(ajwoVar2, a());
        }
    }
}
