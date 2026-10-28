package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rpp implements adme {
    private final /* synthetic */ int $cid;
    private final Context a;

    public rpp(Context context, int i, byte[] bArr) {
        this.$cid = i;
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.adme
    public final /* synthetic */ adma a(ViewGroup viewGroup) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new rpj(this.a, 2, (char[]) null) : new rpj(this.a, 0);
        }
        return new xtd(this.a, 1);
    }

    public rpp(Context context, int i) {
        this.$cid = i;
        context.getClass();
        this.a = context;
    }

    public rpp(Context context, int i, char[] cArr) {
        this.$cid = i;
        context.getClass();
        this.a = context;
    }
}
