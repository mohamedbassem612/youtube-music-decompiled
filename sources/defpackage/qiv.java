package defpackage;

import android.R;
import app.rive.semantics.SemanticState;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qiv {
    public final int c;
    public final short[] a = new short[SemanticState.Hidden];
    public final short[] b = new short[SemanticState.Hidden];
    public long d = 0;

    public qiv(Random random) {
        this.c = (random.nextInt() & (-33686019)) | R.attr.cacheColorHint;
    }
}
