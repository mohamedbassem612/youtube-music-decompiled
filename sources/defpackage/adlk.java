package defpackage;

import android.util.Pair;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adlk implements adlz {
    private final /* synthetic */ int $cid;
    public Object a;

    public adlk(xgn xgnVar, int i) {
        this.$cid = i;
        this.a = xgnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xgn] */
    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        int i2 = this.$cid;
        ?? r3 = this.a;
        if (i2 != 0) {
            adlyVar.f((String) ((Pair) r3).first, ((Pair) this.a).second);
        } else if (r3 != 0) {
            adlyVar.a(r3);
            adlyVar.a = Optional.ofNullable(null);
        }
    }

    public adlk(int i) {
        this.$cid = i;
    }
}
