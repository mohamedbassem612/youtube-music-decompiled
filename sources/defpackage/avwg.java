package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avwg implements Callable {
    private final /* synthetic */ int $cid;

    public avwg(int i) {
        this.$cid = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.$cid;
        if (i == 0) {
            return new avwj();
        }
        if (i == 1) {
            return avmg.a;
        }
        if (i == 2) {
            return awlc.a;
        }
        if (i != 3) {
            return i != 4 ? awlf.a : awle.a;
        }
        return awld.a;
    }
}
