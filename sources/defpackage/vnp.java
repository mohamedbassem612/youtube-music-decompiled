package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.stickyheaders.StickyHeaderContainer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vnp implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;
    public final /* synthetic */ vnr b;

    public vnp(vnr vnrVar, View view) {
        this.a = view;
        this.b = vnrVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        vnr vnrVar = this.b;
        boolean z = !vnrVar.v.l(297, 45739723L, true);
        View view2 = this.a;
        vnrVar.o = tuk.v(view2, z).ak(new mnt(this, view2, 7, null));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        vnr vnrVar = this.b;
        Object obj = vnrVar.o;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        vnrVar.o = null;
        StickyHeaderContainer stickyHeaderContainer = vnrVar.i;
        if (stickyHeaderContainer != null) {
            stickyHeaderContainer.setPadding(0, 0, 0, 0);
        }
        this.a.setPadding(0, 0, 0, 0);
    }
}
