package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class acqc extends od {
    public boolean a;
    private final float n;
    private final float o;
    private final hno p;

    public acqc(Context context, hno hnoVar, float f, float f2) {
        super(context);
        this.a = false;
        this.p = hnoVar;
        this.n = f;
        this.o = f2;
    }

    @Override // defpackage.od
    protected final float a(DisplayMetrics displayMetrics) {
        return (this.p.aZ() && this.a) ? this.o : this.n;
    }

    @Override // defpackage.od
    protected final int b(int i) {
        return Math.min(100, super.b(i));
    }
}
