package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vtj implements vvk {
    public vti a;
    public final vwt b;
    private final Context c;
    private final vuw d;
    private boolean e = false;

    public vtj(Context context, vuw vuwVar, vwt vwtVar) {
        this.c = context;
        this.d = vuwVar;
        this.b = vwtVar;
    }

    @Override // defpackage.vvk
    public final boolean a(MotionEvent motionEvent) {
        vti vtiVar = this.a;
        if (vtiVar == null) {
            return false;
        }
        if (vtiVar.b == 2) {
            if (!vtiVar.a || !this.d.a(motionEvent)) {
                return false;
            }
        } else if (vtiVar.d) {
            if (!vtiVar.c) {
                if (!vtiVar.a) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.e = motionEvent.getY() <= ((float) ((int) ((this.c.getResources().getDisplayMetrics().density * 60.0f) + 0.5f)));
                }
                if (this.e) {
                    return this.d.a(motionEvent);
                }
                return false;
            }
        } else if (!vtiVar.c) {
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        vti vtiVar = this.a;
        if (vtiVar == null) {
            return false;
        }
        if (vtiVar.b == 2) {
            if (!vtiVar.a || !this.d.onTouch(view, motionEvent)) {
                return false;
            }
        } else {
            if (vtiVar.d && this.e && vtiVar.a) {
                return this.d.onTouch(view, motionEvent);
            }
            if (!vtiVar.c) {
                return false;
            }
        }
        return true;
    }
}
