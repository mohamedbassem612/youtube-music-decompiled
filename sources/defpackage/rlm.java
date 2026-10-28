package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rlm implements adme {
    private final Context a;
    private final vxe b;
    private final rps c;
    private final xgn d;
    private final boolean e;

    public rlm(Context context, vxe vxeVar, rps rpsVar, xgn xgnVar, boolean z) {
        context.getClass();
        this.a = context;
        this.b = vxeVar;
        this.c = rpsVar;
        xgnVar.getClass();
        this.d = xgnVar;
        this.e = z;
    }

    @Override // defpackage.adme
    public final /* bridge */ /* synthetic */ adma a(ViewGroup viewGroup) {
        return new rln(this.a, this.b, this.c, this.d, this.e);
    }
}
