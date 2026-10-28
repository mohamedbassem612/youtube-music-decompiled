package defpackage;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acyy extends aewo {
    final /* synthetic */ CoordinatorLayout a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ acyz c;
    private final Set d;

    public acyy(acyz acyzVar, CoordinatorLayout coordinatorLayout, ViewGroup viewGroup) {
        this.a = coordinatorLayout;
        this.b = viewGroup;
        this.c = acyzVar;
        this.d = new CopyOnWriteArraySet(acyzVar.a);
    }

    @Override // defpackage.aewo
    public final /* bridge */ /* synthetic */ void b(Object obj, int i) {
        aeeq aeeqVar = ((acyu) obj).a;
        Set set = this.d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((aeem) it.next()).a(aeeqVar, i);
        }
        set.clear();
        acyz acyzVar = this.c;
        if (acyzVar.f.l(400, 45827589L, false)) {
            CoordinatorLayout coordinatorLayout = this.a;
            ViewGroup viewGroup = this.b;
            viewGroup.removeView(coordinatorLayout);
            if (viewGroup.getId() == R.id.interstitials_container && viewGroup.getChildCount() == 0) {
                viewGroup.setVisibility(8);
            }
            if (acyzVar.c == aeeqVar) {
                acyzVar.d = null;
                acyzVar.c = null;
                return;
            }
            return;
        }
        aeeq aeeqVar2 = acyzVar.c;
        if (aeeqVar2 == null || aeeqVar2 == aeeqVar) {
            ViewGroup viewGroup2 = acyzVar.b;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
                acyzVar.b.setVisibility(acyzVar.e);
            }
            acyzVar.d = null;
            acyzVar.c = null;
        }
    }

    @Override // defpackage.aewo
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        acyu acyuVar = (acyu) obj;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((aeem) it.next()).b(acyuVar.a);
        }
    }
}
