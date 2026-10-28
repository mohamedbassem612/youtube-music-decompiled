package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ijd implements adme {
    private final Context a;
    private final tbt b;
    private final jij c;

    public ijd(Context context, tbt tbtVar, jij jijVar) {
        this.a = context;
        this.b = tbtVar;
        this.c = jijVar;
    }

    @Override // defpackage.adme
    public final /* bridge */ /* synthetic */ adma a(ViewGroup viewGroup) {
        return b();
    }

    public final ije b() {
        return new ije(this.a, this.b, this.c);
    }
}
