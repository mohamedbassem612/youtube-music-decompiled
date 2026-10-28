package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sqp implements adme {
    private final Context a;
    private final heg b;
    private final vwt c;

    public sqp(Context context, heg hegVar, vwt vwtVar) {
        this.a = context;
        this.b = hegVar;
        this.c = vwtVar;
    }

    @Override // defpackage.adme
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sqq a(ViewGroup viewGroup) {
        return new sqq(this.a, viewGroup, this.b, this.c);
    }
}
