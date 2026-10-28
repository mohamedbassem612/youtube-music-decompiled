package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uls extends bdl {
    private static final Rect a = new Rect(0, 0, 1, 1);
    private final View b;
    private final PointF c;
    private final umf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uls(View view, umf umfVar) {
        super(view);
        view.getClass();
        this.b = view;
        this.d = umfVar;
        this.c = new PointF();
    }

    @Override // defpackage.bdl
    public final int getVirtualViewAt(float f, float f2) {
        PointF pointF = this.c;
        pointF.set(f, f2);
        Optional optionalOfNullable = this.d.f.f;
        sla slaVar = new sla(pointF, 8);
        if (true == optionalOfNullable.isPresent()) {
            Object obj = optionalOfNullable.get();
            Object obj2 = slaVar.a;
            uql uqlVar = (uql) obj;
            if (uqlVar.n.H()) {
                PointF pointF2 = (PointF) obj2;
                Optional optionalO = uqlVar.d.o(new PointF(pointF2.x, pointF2.y), uqlVar.k);
                sla slaVar2 = new sla(obj, 12);
                if (true != optionalO.isPresent()) {
                    optionalOfNullable = optionalO;
                } else {
                    Object obj3 = optionalO.get();
                    Object obj4 = slaVar2.a;
                    Optional optionalF = ((uql) obj4).f.f(((qub) obj3).a);
                    hqb hqbVar = new hqb(obj4, obj3, 9, null);
                    if (true != optionalF.isPresent()) {
                        optionalOfNullable = optionalF;
                    } else {
                        Object obj5 = optionalF.get();
                        Object obj6 = hqbVar.b;
                        Object obj7 = hqbVar.a;
                        augy augyVar = (augy) obj5;
                        optionalOfNullable = Optional.ofNullable(new uvv(augyVar.e, ((qub) obj7).b, ((uql) obj6).o.O(augyVar), zf.P(augyVar)));
                    }
                }
            } else {
                optionalOfNullable = Optional.empty();
            }
            optionalOfNullable.getClass();
        }
        if (optionalOfNullable.isPresent()) {
            return nuo.d(((uvv) optionalOfNullable.get()).a);
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.bdl
    public final void getVisibleVirtualViews(List list) {
        list.getClass();
        Optional optionalOfNullable = this.d.f.f;
        if (true == optionalOfNullable.isPresent()) {
            auhs auhsVarD = ((uql) optionalOfNullable.get()).d();
            optionalOfNullable = Optional.ofNullable((agke) Collection.EL.stream(auhsVarD.d).filter(new sde(15)).map(new uot(auhsVarD, 2)).collect(aghu.a));
        }
        agke agkeVar = (agke) optionalOfNullable.orElse(agpi.a);
        agkeVar.getClass();
        agqs agqsVarListIterator = agkeVar.listIterator(0);
        agqsVarListIterator.getClass();
        while (agqsVarListIterator.hasNext()) {
            E next = agqsVarListIterator.next();
            next.getClass();
            list.add(Integer.valueOf(nuo.d(((uxi) next).a())));
        }
    }

    @Override // defpackage.bdl
    public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        if (i2 == 16) {
            Optional optionalL = this.d.l(nuo.c(i));
            if (optionalL.isPresent() && ((uvv) optionalL.get()).d) {
                Rect rect = ((uvv) optionalL.get()).b;
                View view = this.b;
                float fExactCenterX = rect.exactCenterX();
                float fExactCenterY = rect.exactCenterY();
                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, fExactCenterX, fExactCenterY, 0);
                view.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 1, fExactCenterX, fExactCenterY, 0);
                view.dispatchTouchEvent(motionEventObtain2);
                motionEventObtain2.recycle();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bdl
    public final void onPopulateNodeForVirtualView(int i, bbz bbzVar) {
        bbzVar.getClass();
        Optional optionalL = this.d.l(nuo.c(i));
        if (!optionalL.isPresent()) {
            bbzVar.z("");
            bbzVar.q(a);
            bbzVar.R(false);
            bbzVar.C(false);
            return;
        }
        uvv uvvVar = (uvv) optionalL.get();
        Rect rect = uvvVar.b;
        boolean z = uvvVar.d;
        bbzVar.v((z ? Button.class : ImageView.class).getName());
        bbzVar.q(rect);
        bbzVar.w(z);
        if (z) {
            bbzVar.j(16);
        }
        bbzVar.C(true);
        bbzVar.R(true);
        String string = uvvVar.c;
        if (string.length() == 0) {
            string = this.b.getContext().getString(R.string.shorts_a11y_sticker);
            string.getClass();
        }
        bbzVar.z(string);
    }
}
