package defpackage;

import android.app.Dialog;
import android.text.Spanned;
import android.view.View;
import android.widget.SeekBar;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class suy implements vxc {
    private final xgm a;
    private final sui b;

    public suy(xgm xgmVar, sui suiVar) {
        this.a = xgmVar;
        this.b = suiVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        ajnf ajnfVar;
        ajnf ajnfVar2;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arpp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apji apjiVar = ((arpp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqxc.a);
        apjiVar.c(aihlVarCheckIsLite2);
        Object objK2 = apjiVar.j.k(aihlVarCheckIsLite2.d);
        aqxb aqxbVar = (aqxb) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
        adly adlyVar = new adly();
        adlyVar.a(this.a.hB());
        sui suiVar = this.b;
        suiVar.j = aqxbVar;
        gxu gxuVar = new gxu(suiVar, 7);
        Dialog dialog = suiVar.i;
        dialog.setOnShowListener(gxuVar);
        dialog.setOnCancelListener(new gxt(suiVar, 9));
        alay alayVar = suiVar.j.b;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(suiVar.c, ackj.k(null, alayVar, null, false));
        aiie aiieVar = suiVar.j.c;
        Spanned[] spannedArr = new Spanned[aiieVar.size()];
        for (int i = 0; i < aiieVar.size(); i++) {
            spannedArr[i] = ackj.k(null, (alay) aiieVar.get(i), null, false);
        }
        tuk.u(suiVar.d, sui.a(spannedArr, 0));
        tuk.u(suiVar.e, sui.a(spannedArr, 1));
        SeekBar seekBar = suiVar.f;
        seekBar.setMax(suiVar.j.d.size() - 1);
        seekBar.setOnSeekBarChangeListener(new suh(suiVar, 0));
        int i2 = suiVar.j.e;
        suiVar.k = i2;
        seekBar.setProgress(i2);
        suiVar.b();
        xgn xgnVar = adlyVar.b;
        aeaa aeaaVar = suiVar.g;
        ajng ajngVar = suiVar.j.f;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        if ((ajngVar.b & 1) != 0) {
            ajng ajngVar2 = suiVar.j.f;
            if (ajngVar2 == null) {
                ajngVar2 = ajng.a;
            }
            ajnfVar = ajngVar2.c;
            if (ajnfVar == null) {
                ajnfVar = ajnf.a;
            }
        } else {
            ajnfVar = null;
        }
        aeaaVar.a(ajnfVar, xgnVar, null);
        aeaaVar.c = new sug(suiVar, 0);
        aeaa aeaaVar2 = suiVar.h;
        ajng ajngVar3 = suiVar.j.g;
        if (((ajngVar3 == null ? ajng.a : ajngVar3).b & 1) != 0) {
            if (ajngVar3 == null) {
                ajngVar3 = ajng.a;
            }
            ajnfVar2 = ajngVar3.c;
            if (ajnfVar2 == null) {
                ajnfVar2 = ajnf.a;
            }
        } else {
            ajnfVar2 = null;
        }
        aeaaVar2.a(ajnfVar2, xgnVar, null);
        aeaaVar2.c = new roa(suiVar, xgnVar, 3);
        aeaaVar.d = new acxa(suiVar, 1);
        xgnVar.w(new xgj(aqxbVar.h, (amud) null), null);
        View viewFindViewById = suiVar.b.findViewById(R.id.scroll_body);
        double d = dialog.getContext().getResources().getDisplayMetrics().heightPixels;
        viewFindViewById.getLayoutParams().height = -2;
        int i3 = (int) (d * 0.5d);
        if (viewFindViewById.getMeasuredHeight() > i3) {
            viewFindViewById.getLayoutParams().height = i3;
        }
        dialog.show();
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
