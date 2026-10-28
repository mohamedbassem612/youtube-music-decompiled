package defpackage;

import android.util.Range;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public interface abch {
    public static final Range a;
    public static final Range b;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        a = new Range(dValueOf, Double.valueOf(1.0d));
        b = new Range(dValueOf, Double.valueOf(Double.MAX_VALUE));
    }

    double a(double d);

    double b();

    double c(double d);

    boolean d();
}
