package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class addc implements ntp {
    final /* synthetic */ adau a;
    final /* synthetic */ xgz b;
    final /* synthetic */ adde c;

    public addc(adde addeVar, adau adauVar, xgz xgzVar) {
        this.a = adauVar;
        this.b = xgzVar;
        this.c = addeVar;
    }

    @Override // defpackage.ntp
    public final void d(View view, View view2) {
        amdw amdwVar;
        adau adauVar = this.a;
        amdd amddVar = adauVar.b;
        aihf aihfVarCreateBuilder = amddVar == null ? amdd.a.createBuilder() : amddVar.toBuilder();
        if (view2 != null) {
            view = view2;
        }
        aihf aihfVarCreateBuilder2 = amda.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amda amdaVar = (amda) aihfVarCreateBuilder2.instance;
        amdaVar.b |= 1;
        amdaVar.c = true;
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar2 = (amdd) aihfVarCreateBuilder.instance;
        amda amdaVar2 = (amda) aihfVarCreateBuilder2.build();
        amdaVar2.getClass();
        amddVar2.x = amdaVar2;
        amddVar2.d |= 8;
        if (view != null) {
            boolean zL = this.c.a.l(165, 45825748L, false);
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            agrf agrfVar = twm.a;
            displayMetrics.getClass();
            float f = i / displayMetrics.density;
            int i2 = iArr[1];
            displayMetrics.getClass();
            int i3 = (int) ((i2 / displayMetrics.density) + 0.5f);
            int i4 = (int) (f + 0.5f);
            if (zL) {
                float width = view.getWidth();
                float height = view.getHeight();
                Matrix matrix = new Matrix(view.getMatrix());
                Object parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    if (!view3.getMatrix().isIdentity()) {
                        matrix.postConcat(view3.getMatrix());
                    }
                    parent = view3.getParent();
                }
                RectF rectF = new RectF(0.0f, 0.0f, width, height);
                matrix.mapRect(rectF);
                float fWidth = rectF.width();
                float fHeight = rectF.height();
                aihf aihfVarCreateBuilder3 = amdw.a.createBuilder();
                int iRound = Math.round(fWidth / displayMetrics.density);
                aihfVarCreateBuilder3.copyOnWrite();
                amdw amdwVar2 = (amdw) aihfVarCreateBuilder3.instance;
                amdwVar2.b |= 4;
                amdwVar2.e = iRound;
                int iRound2 = Math.round(fHeight / displayMetrics.density);
                aihfVarCreateBuilder3.copyOnWrite();
                amdw amdwVar3 = (amdw) aihfVarCreateBuilder3.instance;
                amdwVar3.b |= 8;
                amdwVar3.f = iRound2;
                aihfVarCreateBuilder3.copyOnWrite();
                amdw amdwVar4 = (amdw) aihfVarCreateBuilder3.instance;
                amdwVar4.b |= 1;
                amdwVar4.c = i4;
                aihfVarCreateBuilder3.copyOnWrite();
                amdw amdwVar5 = (amdw) aihfVarCreateBuilder3.instance;
                amdwVar5.b |= 2;
                amdwVar5.d = i3;
                amdwVar = (amdw) aihfVarCreateBuilder3.build();
            } else {
                int width2 = view.getWidth();
                displayMetrics.getClass();
                float f2 = width2 / displayMetrics.density;
                int height2 = view.getHeight();
                displayMetrics.getClass();
                float f3 = height2 / displayMetrics.density;
                aihf aihfVarCreateBuilder4 = amdw.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                amdw amdwVar6 = (amdw) aihfVarCreateBuilder4.instance;
                amdwVar6.b |= 4;
                amdwVar6.e = (int) (f2 + 0.5f);
                aihfVarCreateBuilder4.copyOnWrite();
                amdw amdwVar7 = (amdw) aihfVarCreateBuilder4.instance;
                amdwVar7.b |= 8;
                amdwVar7.f = (int) (f3 + 0.5f);
                aihfVarCreateBuilder4.copyOnWrite();
                amdw amdwVar8 = (amdw) aihfVarCreateBuilder4.instance;
                amdwVar8.b |= 1;
                amdwVar8.c = i4;
                aihfVarCreateBuilder4.copyOnWrite();
                amdw amdwVar9 = (amdw) aihfVarCreateBuilder4.instance;
                amdwVar9.b |= 2;
                amdwVar9.d = i3;
                amdwVar = (amdw) aihfVarCreateBuilder4.build();
            }
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar3 = (amdd) aihfVarCreateBuilder.instance;
            amdwVar.getClass();
            amddVar3.y = amdwVar;
            amddVar3.d |= SemanticState.Focused;
        }
        adauVar.a.w(this.b, (amdd) aihfVarCreateBuilder.build());
    }
}
