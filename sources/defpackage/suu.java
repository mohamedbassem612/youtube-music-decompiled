package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class suu implements vxc {
    public final Context a;
    public final vxe b;
    public final xgn c;
    public RadioGroup d;
    public final abfv e;

    public suu(Context context, vxe vxeVar, xgn xgnVar, abfv abfvVar) {
        this.a = context;
        this.b = vxeVar;
        this.c = xgnVar;
        this.e = abfvVar;
    }

    private static Spanned d(ajng ajngVar) {
        if ((ajngVar.b & 1) == 0) {
            return null;
        }
        ajnf ajnfVar = ajngVar.c;
        if (ajnfVar == null) {
            ajnfVar = ajnf.a;
        }
        alay alayVar = ajnfVar.m;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        return ackj.k(null, alayVar, null, false);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aqgo aqgoVar;
        boolean z;
        alay alayVar;
        int iAS;
        alay alayVar2;
        int i;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arnz.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        arnz arnzVar = (arnz) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if ((arnzVar.c & 1) != 0) {
            aqgx aqgxVar = arnzVar.d;
            if (aqgxVar == null) {
                aqgxVar = aqgx.a;
            }
            aqgoVar = aqgxVar.e;
            if (aqgoVar == null) {
                aqgoVar = aqgo.a;
            }
        } else {
            aqgoVar = null;
        }
        Context context = this.a;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.red_cancel_survey_dialog, (ViewGroup) null);
        this.d = (RadioGroup) viewInflate.findViewById(R.id.options);
        if ((aqgoVar.b & 2) == 0) {
            z = false;
        } else {
            aqgp aqgpVar = aqgoVar.d;
            if (aqgpVar == null) {
                aqgpVar = aqgp.a;
            }
            int iAS2 = a.aS(aqgpVar.c);
            if (iAS2 == 0 || iAS2 != 3) {
                z = false;
            } else {
                z = true;
            }
        }
        aqgp aqgpVar2 = aqgoVar.d;
        if (aqgpVar2 == null) {
            aqgpVar2 = aqgp.a;
        }
        aiie<aqgu> aiieVar = aqgpVar2.b;
        for (aqgu aqguVar : aiieVar) {
            aqgn aqgnVar = (aqguVar == null || (i = aqguVar.b) != 131108496) ? null : i == 131108496 ? (aqgn) aqguVar.c : aqgn.a;
            if (aqgnVar != null) {
                RadioButton radioButton = (RadioButton) layoutInflaterFrom.inflate(R.layout.red_cancel_survey_item, (ViewGroup) null);
                radioButton.setTag(aqgnVar);
                if ((aqgnVar.b & 1) != 0) {
                    alayVar2 = aqgnVar.c;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                } else {
                    alayVar2 = null;
                }
                radioButton.setText(ackj.k(null, alayVar2, null, false));
                this.d.addView(radioButton);
            }
        }
        if (z) {
            ((RadioButton) this.d.getChildAt(aiieVar.size() - 1)).setChecked(true);
        }
        ijf ijfVar = new ijf((Object) this, (aihn) aqgoVar, 4);
        acws acwsVarG = this.e.g(context);
        if ((aqgoVar.b & 1) != 0) {
            alayVar = aqgoVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        AlertDialog.Builder view = acwsVarG.setTitle(ackj.k(null, alayVar, null, false)).setView(viewInflate);
        ajng ajngVar = aqgoVar.f;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        AlertDialog.Builder positiveButton = view.setPositiveButton(d(ajngVar), ijfVar);
        ajng ajngVar2 = aqgoVar.e;
        if (ajngVar2 == null) {
            ajngVar2 = ajng.a;
        }
        AlertDialog alertDialogCreate = positiveButton.setNegativeButton(d(ajngVar2), ijfVar).create();
        alertDialogCreate.setOnShowListener(new sut(this, aqgoVar, 0));
        alertDialogCreate.show();
        if (!z && ((iAS = a.aS(aqgoVar.g)) == 0 || iAS != 2)) {
            alertDialogCreate.getButton(-1).setEnabled(false);
        }
        this.d.setOnCheckedChangeListener(new aekc(alertDialogCreate, 1));
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
