package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vmg implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public /* synthetic */ vmg(aamo aamoVar, nrv nrvVar, int i) {
        this.$cid = i;
        this.b = aamoVar;
        this.a = nrvVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aunn, java.lang.Object] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$cid;
        if (i == 0) {
            ((aepb) this.b).m((yvh) this.a, valueAnimator.getAnimatedFraction());
            return;
        }
        if (i == 1) {
            aamo aamoVar = (aamo) this.b;
            String strE = aamoVar.e();
            long currentPlayTime = valueAnimator.getCurrentPlayTime();
            asqr asqrVar = (asqr) aamoVar.b;
            float f = asqrVar.g;
            nrv nrvVar = (nrv) this.a;
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = nrvVar.f;
            aihh aihhVar = senderStateOuterClass$SenderState == null ? (aihh) SenderStateOuterClass$SenderState.a.createBuilder() : (aihh) SenderStateOuterClass$SenderState.a.createBuilder(senderStateOuterClass$SenderState);
            float f2 = currentPlayTime;
            float fMin = f > 0.0f ? Math.min(f2 / f, 1.0f) : 0.0f;
            aihl aihlVar = asqs.b;
            aihf aihfVarCreateBuilder = asqs.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            asqs asqsVar = (asqs) aihfVarCreateBuilder.instance;
            strE.getClass();
            asqsVar.c |= 1;
            asqsVar.d = strE;
            aihfVarCreateBuilder.copyOnWrite();
            asqs asqsVar2 = (asqs) aihfVarCreateBuilder.instance;
            asqsVar2.c |= 2;
            asqsVar2.e = f2;
            aihfVarCreateBuilder.copyOnWrite();
            asqs asqsVar3 = (asqs) aihfVarCreateBuilder.instance;
            asqsVar3.c |= 4;
            asqsVar3.f = fMin;
            aihhVar.e(aihlVar, (asqs) aihfVarCreateBuilder.build());
            nrt nrtVarE = nrvVar.e();
            nrtVarE.e = (SenderStateOuterClass$SenderState) aihhVar.build();
            nrv nrvVarA = nrtVarE.a();
            int i2 = asqrVar.d;
            if (i2 != 5) {
                if (i2 == 4) {
                    ((nry) aamoVar.e.io()).a(asqrVar.d == 4 ? (CommandOuterClass$Command) asqrVar.e : CommandOuterClass$Command.getDefaultInstance(), nrvVarA).D();
                    return;
                }
                return;
            } else {
                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = nrvVarA.f;
                if (senderStateOuterClass$SenderState2 != null) {
                    ((DirectUpdateDataRelay) aamoVar.d.io()).send(asqrVar.d == 5 ? (String) asqrVar.e : "", senderStateOuterClass$SenderState2.toByteArray());
                    return;
                }
                return;
            }
        }
        if (i == 2) {
            zpt zptVar = (zpt) this.a;
            int iIntValue = zptVar.c - ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ((View) this.b).scrollBy(0, -iIntValue);
            zptVar.c -= iIntValue;
            return;
        }
        if (i == 3) {
            zpt zptVar2 = (zpt) this.a;
            NestedScrollView nestedScrollView = zptVar2.a;
            int iA = zpt.a((View) this.b);
            if (nestedScrollView != null) {
                zptVar2.b(iA, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            } else {
                zptVar2.d(iA, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            }
        }
        if (i == 4) {
            float fFloatValue = ((Float) ((ValueAnimator) this.b).getAnimatedValue()).floatValue() % 1.0f;
            aedb aedbVar = (aedb) this.a;
            Rect bounds = aedbVar.getBounds();
            float fCenterX = bounds.centerX();
            float fCenterY = bounds.centerY();
            SweepGradient sweepGradient = new SweepGradient(fCenterX, fCenterY, aedbVar.b, (float[]) null);
            Matrix matrix = new Matrix();
            matrix.setRotate((int) (fFloatValue * 360.0f), fCenterX, fCenterY);
            sweepGradient.setLocalMatrix(matrix);
            aedbVar.c.setShader(sweepGradient);
            aedbVar.invalidateSelf();
            return;
        }
        if (i != 5) {
            int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.b;
            layoutParams.height = iIntValue2;
            ((affa) this.a).b.setLayoutParams(layoutParams);
            return;
        }
        aezc aezcVar = (aezc) this.b;
        if (!aezcVar.c(true) || aezcVar.m == 0) {
            return;
        }
        aezq aezqVar = (aezq) this.a;
        if (aezqVar.isVisible()) {
            aezqVar.invalidateSelf();
        }
    }

    public vmg(aepb aepbVar, yvh yvhVar, int i) {
        this.$cid = i;
        this.a = yvhVar;
        this.b = aepbVar;
    }

    public /* synthetic */ vmg(Drawable drawable, Object obj, int i) {
        this.$cid = i;
        this.a = drawable;
        this.b = obj;
    }

    public vmg(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj2;
        this.a = obj;
    }
}
