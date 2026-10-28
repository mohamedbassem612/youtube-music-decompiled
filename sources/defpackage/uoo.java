package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.apps.youtube.music.R;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uoo {
    public final View a;
    public final uon b;
    public uop c = uop.a;
    private final adxj d;
    private final vxe e;
    private alcy f;

    public uoo(View view, uon uonVar, adxj adxjVar, vxe vxeVar) {
        this.d = adxjVar;
        this.a = view;
        this.b = uonVar;
        this.e = vxeVar;
        a();
    }

    private final Drawable e(arqz arqzVar) {
        adxj adxjVar;
        View view = this.a;
        if (view.getContext() != null && (adxjVar = this.d) != null) {
            new ttk(view.getContext());
            int iOrElse = tzk.n(view.getContext(), R.attr.ytTextPrimary).orElse(0);
            Drawable drawableD = adxjVar.d(view.getContext(), arqzVar);
            if (drawableD != null) {
                return ttk.b(drawableD, iOrElse);
            }
        }
        return null;
    }

    public final void a() {
        arqz arqzVar = arqz.nS;
        arqz arqzVar2 = arqz.nO;
        uop uopVar = this.c;
        uopVar.getClass();
        int iOrdinal = uopVar.ordinal();
        if (iOrdinal == 1) {
            arqzVar = arqz.dm;
        } else if (iOrdinal == 2) {
            arqzVar2 = arqz.dh;
        }
        View view = this.a;
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.ai_image_edit_thumbs_up_button);
        imageButton.getClass();
        imageButton.setImageDrawable(e(arqzVar));
        ((ImageButton) view.findViewById(R.id.ai_image_edit_thumbs_down_button)).setImageDrawable(e(arqzVar2));
    }

    public final void b() {
        if (this.f != null) {
            int iOrdinal = this.c.ordinal();
            if (iOrdinal == 0) {
                vxe vxeVar = this.e;
                CommandOuterClass$Command defaultInstance = this.f.d;
                if (defaultInstance == null) {
                    defaultInstance = CommandOuterClass$Command.getDefaultInstance();
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(almz.a);
                defaultInstance.c(aihlVarCheckIsLite);
                Object objK = defaultInstance.j.k(aihlVarCheckIsLite.d);
                vxeVar.a((ajwo) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
                return;
            }
            if (iOrdinal == 1) {
                vxe vxeVar2 = this.e;
                CommandOuterClass$Command defaultInstance2 = this.f.b;
                if (defaultInstance2 == null) {
                    defaultInstance2 = CommandOuterClass$Command.getDefaultInstance();
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(almz.a);
                defaultInstance2.c(aihlVarCheckIsLite2);
                Object objK2 = defaultInstance2.j.k(aihlVarCheckIsLite2.d);
                vxeVar2.a((ajwo) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2)));
                return;
            }
            if (iOrdinal == 2) {
                vxe vxeVar3 = this.e;
                CommandOuterClass$Command defaultInstance3 = this.f.c;
                if (defaultInstance3 == null) {
                    defaultInstance3 = CommandOuterClass$Command.getDefaultInstance();
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(almz.a);
                defaultInstance3.c(aihlVarCheckIsLite3);
                Object objK3 = defaultInstance3.j.k(aihlVarCheckIsLite3.d);
                vxeVar3.a((ajwo) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3)));
            }
        }
    }

    public final void c() {
        aami aamiVarE;
        uop uopVar = this.c;
        uon uonVar = this.b;
        int i = uonVar.b;
        if (i < 0 || i > uonVar.a.size() - 1 || (aamiVarE = uonVar.e()) == null) {
            return;
        }
        int i2 = uonVar.c;
        ArrayList arrayList = (ArrayList) aamiVarE.b;
        uom uomVar = (uom) arrayList.get(i2);
        arrayList.set(uonVar.c, new uom(uomVar.a, uomVar.b, uopVar, uomVar.d));
    }

    public final boolean d(alps alpsVar) {
        apji apjiVar = alpsVar.f;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVar = aoxv.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        aoxv aoxvVar = (aoxv) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (((aoxvVar.c == 1 ? (aoxu) aoxvVar.d : aoxu.a).b & 1) == 0) {
            this.f = null;
            return false;
        }
        View view = this.a;
        ((ImageButton) view.findViewById(R.id.ai_image_edit_thumbs_up_button)).setOnClickListener(new uit(this, 5));
        ((ImageButton) view.findViewById(R.id.ai_image_edit_thumbs_down_button)).setOnClickListener(new uit(this, 6));
        apji apjiVar2 = alpsVar.f;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        aoxv aoxvVar2 = (aoxv) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
        alcy alcyVar = (aoxvVar2.c == 1 ? (aoxu) aoxvVar2.d : aoxu.a).d;
        if (alcyVar == null) {
            alcyVar = alcy.a;
        }
        this.f = alcyVar;
        return true;
    }
}
