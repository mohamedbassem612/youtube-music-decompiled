package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import com.google.android.libraries.material.dialog.ButtonPaneLayout;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ohc extends TouchDelegate {
    public final Set a;
    public TouchDelegate b;
    final /* synthetic */ ButtonPaneLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohc(ButtonPaneLayout buttonPaneLayout) {
        super(new Rect(), buttonPaneLayout);
        this.c = buttonPaneLayout;
        this.a = new afx(0);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate = this.b;
        if (touchDelegate != null && touchDelegate.onTouchEvent(motionEvent)) {
            return true;
        }
        ButtonPaneLayout buttonPaneLayout = this.c;
        motionEvent.offsetLocation(-buttonPaneLayout.getLeft(), -buttonPaneLayout.getTop());
        Set set = this.a;
        if (!set.isEmpty()) {
            afw afwVar = new afw((afx) set);
            while (afwVar.hasNext()) {
                if (((TouchDelegate) afwVar.next()).onTouchEvent(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }
}
