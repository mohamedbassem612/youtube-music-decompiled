package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.creation.common.ui.ShortsEditToolButtonView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vbr implements vbn {
    public xgz a;
    private final aduv b;
    private ShortsEditToolButtonView c;
    private vbq d;
    private roq e;

    public vbr(aduv aduvVar) {
        this.b = aduvVar;
    }

    @Override // defpackage.vbn
    public final void a() {
        vbq vbqVar = this.d;
        if (vbqVar != null) {
            vbqVar.a();
        }
    }

    @Override // defpackage.vbn
    public final void b() {
        vbq vbqVar = this.d;
        if (vbqVar != null) {
            vbqVar.b();
        }
    }

    @Override // defpackage.vbn
    public final void c(Drawable drawable) {
        vbq vbqVar = this.d;
        if (vbqVar != null) {
            vbqVar.c(drawable);
        }
    }

    @Override // defpackage.vbn
    public final void d(int i) {
        xgz xgzVar;
        ShortsEditToolButtonView shortsEditToolButtonView = this.c;
        if (shortsEditToolButtonView == null || shortsEditToolButtonView.getVisibility() == i) {
            return;
        }
        this.c.setVisibility(i);
        roq roqVar = this.e;
        if (roqVar == null || (xgzVar = this.a) == null) {
            return;
        }
        ugo ugoVar = new ugo(roqVar, xgzVar);
        if (i == 0) {
            ugoVar.f();
        } else {
            ugoVar.e();
        }
    }

    @Override // defpackage.vbn
    public final /* bridge */ /* synthetic */ void e(vxe vxeVar, View view, ajnf ajnfVar, roq roqVar) {
        ShortsEditToolButtonView shortsEditToolButtonView = (ShortsEditToolButtonView) view;
        this.c = shortsEditToolButtonView;
        if (yno.fy(ajnfVar)) {
            aduv aduvVar = this.b;
            Drawable drawableFv = yno.fv(aduvVar, shortsEditToolButtonView.getContext(), ajnfVar.e == 8 ? (alja) ajnfVar.f : alja.a);
            if (drawableFv != null) {
                ImageView imageView = shortsEditToolButtonView.b;
                imageView.getClass();
                this.d = new vbq(imageView, drawableFv, yno.fv(aduvVar, shortsEditToolButtonView.getContext(), ajnfVar.g == 27 ? (alja) ajnfVar.h : alja.a));
                alay alayVar = ajnfVar.m;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                String string = ackj.k(null, alayVar, null, false).toString();
                TextView textView = shortsEditToolButtonView.a;
                textView.getClass();
                textView.setText(string);
                shortsEditToolButtonView.setContentDescription(string);
                aiqe aiqeVar = ajnfVar.v;
                if (aiqeVar == null) {
                    aiqeVar = aiqe.a;
                }
                aiqd aiqdVar = aiqeVar.c;
                if (aiqdVar == null) {
                    aiqdVar = aiqd.a;
                }
                shortsEditToolButtonView.setContentDescription(aiqdVar.c);
                xgz xgzVarFx = yno.fx(ajnfVar);
                this.a = xgzVarFx;
                if (roqVar != null) {
                    this.e = roqVar;
                    new ugo(roqVar, xgzVarFx).c();
                }
                shortsEditToolButtonView.setOnClickListener(new upl(this, vxeVar, ajnfVar, roqVar, 4));
            }
        }
    }
}
