package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jv extends iz {
    final /* synthetic */ jx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(jx jxVar, Context context, iq iqVar, View view) {
        super(context, iqVar, view, true, R.attr.actionOverflowMenuStyle);
        this.d = jxVar;
        this.b = 8388613;
        e(jxVar.k);
    }

    @Override // defpackage.iz
    public final void c() {
        jx jxVar = this.d;
        iq iqVar = jxVar.c;
        if (iqVar != null) {
            iqVar.i(true);
        }
        jxVar.i = null;
        super.c();
    }
}
