package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vbo implements vbn {
    private final aduv a;
    private final adxj b;
    private CreationButtonView c;
    private vbq d;

    public vbo(aduv aduvVar, adxj adxjVar) {
        this.a = aduvVar;
        this.b = adxjVar;
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
        CreationButtonView creationButtonView = this.c;
        if (creationButtonView != null) {
            creationButtonView.setVisibility(i);
        }
    }

    @Override // defpackage.vbn
    public final /* bridge */ /* synthetic */ void e(vxe vxeVar, View view, ajnf ajnfVar, roq roqVar) {
        Drawable drawableFw;
        arqz arqzVarA;
        Drawable drawableFw2;
        arqz arqzVarA2;
        xgz xgzVar;
        xgz xgzVar2;
        CreationButtonView creationButtonView = (CreationButtonView) view;
        this.c = creationButtonView;
        creationButtonView.d = "server_driven_filter_picker";
        if (yno.fy(ajnfVar)) {
            int i = ajnfVar.e;
            if (i == 8) {
                drawableFw = yno.fv(this.a, creationButtonView.getContext(), ajnfVar.e == 8 ? (alja) ajnfVar.f : alja.a);
            } else if (i == 35) {
                adxj adxjVar = this.b;
                Context context = creationButtonView.getContext();
                if (ajnfVar.e != 35 || (arqzVarA = arqz.a(((Integer) ajnfVar.f).intValue())) == null) {
                    arqzVarA = arqz.a;
                }
                drawableFw = yno.fw(adxjVar, context, arqzVarA);
            } else {
                drawableFw = null;
            }
            if (drawableFw != null) {
                int i2 = ajnfVar.g;
                if (i2 == 27) {
                    drawableFw2 = yno.fv(this.a, creationButtonView.getContext(), ajnfVar.g == 27 ? (alja) ajnfVar.h : alja.a);
                } else if (i2 == 36) {
                    adxj adxjVar2 = this.b;
                    Context context2 = creationButtonView.getContext();
                    if (ajnfVar.g != 36 || (arqzVarA2 = arqz.a(((Integer) ajnfVar.h).intValue())) == null) {
                        arqzVarA2 = arqz.a;
                    }
                    drawableFw2 = yno.fw(adxjVar2, context2, arqzVarA2);
                } else {
                    drawableFw2 = null;
                }
                this.d = new vbq(creationButtonView.b, drawableFw, drawableFw2);
                alay alayVar = ajnfVar.m;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                creationButtonView.a.setText(ackj.k(null, alayVar, null, false));
                aiqe aiqeVar = ajnfVar.v;
                if (aiqeVar == null) {
                    aiqeVar = aiqe.a;
                }
                aiqd aiqdVar = aiqeVar.c;
                if (aiqdVar == null) {
                    aiqdVar = aiqd.a;
                }
                creationButtonView.setContentDescription(aiqdVar.c);
                xgz xgzVarFx = yno.fx(ajnfVar);
                CreationButtonView creationButtonView2 = this.c;
                if (creationButtonView2 == null || ((xgzVar2 = creationButtonView2.c) != null && ((xgj) xgzVar2).a.d == 119242)) {
                    xgzVar = null;
                } else {
                    creationButtonView2.c = xgzVarFx;
                    xgzVar = xgzVarFx;
                }
                creationButtonView.setOnClickListener(new upl(vxeVar, ajnfVar, roqVar, xgzVar, 3));
            }
        }
    }
}
