package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.creation.videoeffects.stickers.text.ColorChip;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vkt implements View.OnTouchListener, vje {
    public Activity a;
    public vjc b;
    public vis c;
    public ViewGroup d;
    public ViewGroup e;
    public EditText f;
    public vjb g;
    public Optional h = Optional.empty();
    public final auzc i;
    public final zf j;
    public final aaok k;
    public xxj l;
    private final xgm m;

    public vkt(xgm xgmVar, zf zfVar, auzc auzcVar, aaok aaokVar) {
        this.m = xgmVar;
        this.j = zfVar;
        this.i = auzcVar;
        this.k = aaokVar;
    }

    public final void a(vjb vjbVar) {
        int iArgb;
        xxj xxjVar;
        if (vjbVar != null) {
            vjb vjbVar2 = this.g;
            int iE = 0;
            if (vjbVar2 != null && !vjbVar.equals(vjbVar2) && (xxjVar = this.l) != null) {
                ((vkl) xxjVar.a).k(false);
            }
            vjb vjbVar3 = this.g;
            if (vjbVar3 == null || vjbVar.b() != vjbVar3.b() || vjbVar.c() != this.g.c()) {
                this.h = Optional.empty();
            }
            this.g = vjbVar;
            auzc auzcVar = this.i;
            EditText editText = this.f;
            int i = auzcVar.a;
            if (i == 0) {
                iE = auzc.e(vjbVar);
                iArgb = 0;
            } else if (i != 2) {
                if (vjbVar instanceof ColorChip) {
                    iE = ((ColorChip) vjbVar).b;
                } else if (vjbVar instanceof viy) {
                    iE = ((viy) vjbVar).a.d;
                }
                iArgb = auzc.e(vjbVar);
            } else {
                if (vjbVar instanceof ColorChip) {
                    iE = ((ColorChip) vjbVar).d;
                } else if (vjbVar instanceof viy) {
                    iE = ((viy) vjbVar).a.e;
                }
                iArgb = Color.argb(SemanticState.Focused, Color.red(auzc.f(vjbVar)), Color.green(auzc.f(vjbVar)), Color.blue(auzc.f(vjbVar)));
            }
            editText.setTextColor(iE);
            editText.setBackgroundColor(iArgb);
        }
    }

    @Override // defpackage.vje
    public final vis b() {
        return this.c;
    }

    @Override // defpackage.vje
    public final void c(vjb vjbVar) {
        a(vjbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        vjb vjbVar;
        if (view != this.d) {
            return false;
        }
        Rect rect = new Rect();
        int i = 0;
        while (true) {
            if (i >= this.d.getChildCount()) {
                vjbVar = null;
                break;
            }
            View childAt = ((ViewGroup) this.d.getChildAt(i)).getChildAt(0);
            if (childAt instanceof vjb) {
                ((View) childAt.getParent()).getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    vjbVar = (vjb) childAt;
                    break;
                }
            }
            i++;
        }
        if (vjbVar != null) {
            this.m.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(37173)), null);
            vjc vjcVar = this.b;
            if (vjcVar != null) {
                vjcVar.b(vjbVar);
            }
        }
        return true;
    }
}
