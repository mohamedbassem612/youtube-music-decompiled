package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mqe extends od {
    final /* synthetic */ float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqe(Context context, float f) {
        super(context);
        this.a = f;
    }

    @Override // defpackage.od
    protected final int b(int i) {
        return (int) (this.a * 1000.0f);
    }
}
