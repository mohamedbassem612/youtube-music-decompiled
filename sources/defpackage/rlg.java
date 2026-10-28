package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rlg implements adme {
    private final Context a;
    private final rpt b;
    private final boolean c;

    public rlg(Context context, rpt rptVar, boolean z) {
        context.getClass();
        this.a = context;
        this.b = rptVar;
        this.c = z;
    }

    @Override // defpackage.adme
    public final /* bridge */ /* synthetic */ adma a(ViewGroup viewGroup) {
        return new rli(this.a, this.b, this.c);
    }
}
