package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tvg implements View.OnTouchListener {
    public final List a = new ArrayList();
    public View b;
    private tve c;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean zB;
        tve tveVar = this.c;
        tve tveVar2 = null;
        if (tveVar != null) {
            zB = tveVar.b(view, motionEvent);
            if (!zB) {
                tve tveVar3 = this.c;
                this.c = null;
                tveVar2 = tveVar3;
            }
        } else {
            zB = false;
        }
        List<tve> list = this.a;
        Iterator it = list.iterator();
        while (!zB) {
            if (!it.hasNext()) {
                if (!list.isEmpty() && motionEvent.getActionMasked() == 0) {
                    break;
                }
                return false;
            }
            tve tveVar4 = (tve) it.next();
            if (tveVar4 != tveVar2 && (zB = tveVar4.b(view, motionEvent))) {
                this.c = tveVar4;
                for (tve tveVar5 : list) {
                    if (tveVar5 != tveVar4) {
                        tveVar5.a();
                    }
                }
                break;
            }
        }
        return true;
    }
}
