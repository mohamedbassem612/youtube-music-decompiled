package defpackage;

import android.text.TextUtils;
import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fts extends fgv {
    public final ftu a;
    public final BitSet d;
    private final String[] e;

    public fts(fhd fhdVar, ftu ftuVar) {
        super(fhdVar, ftuVar);
        this.e = new String[]{"text"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.a = ftuVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ftu a() {
        hmy.c(1, this.d, this.e);
        return this.a;
    }

    public final void c() {
        this.a.a = true;
    }

    public final void d(TextUtils.TruncateAt truncateAt) {
        this.a.e = truncateAt;
    }

    public final void e(int i) {
        this.a.q = i;
    }
}
