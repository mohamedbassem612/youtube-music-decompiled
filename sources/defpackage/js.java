package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class js extends iz {
    final /* synthetic */ jx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js(jx jxVar, Context context, jj jjVar, View view) {
        super(context, jjVar, view, false, R.attr.actionOverflowMenuStyle);
        this.d = jxVar;
        if (!jjVar.l.o()) {
            View view2 = jxVar.g;
            this.a = view2 == null ? (View) jxVar.f : view2;
        }
        e(jxVar.k);
    }

    @Override // defpackage.iz
    public final void c() {
        this.d.j = null;
        super.c();
    }
}
