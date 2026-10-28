package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rph implements adme {
    private final Context a;
    private final int b;
    private final xgn c;

    public rph(Context context, int i, xgn xgnVar) {
        context.getClass();
        this.a = context;
        this.b = i;
        xgnVar.getClass();
        this.c = xgnVar;
    }

    @Override // defpackage.adme
    public final /* bridge */ /* synthetic */ adma a(ViewGroup viewGroup) {
        return new jgj(this.a, this.b, this.c, 2);
    }
}
