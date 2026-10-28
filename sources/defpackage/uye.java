package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uye implements View.OnTouchListener {
    public final vor a;
    public final aaok b;
    private final ViewGroup c;

    public uye(ViewGroup viewGroup, vor vorVar, aaok aaokVar) {
        this.c = viewGroup;
        this.a = vorVar;
        this.b = aaokVar;
    }

    public final View a() {
        View viewFindViewById = this.c.findViewById(R.id.app_engagement_panel_wrapper);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.a.u(true);
            view.performClick();
        }
        return true;
    }
}
