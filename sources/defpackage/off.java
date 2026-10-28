package defpackage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class off {
    public static final DecimalFormatSymbols a;
    public static final DecimalFormat b;
    public static final DecimalFormat c;

    static {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        a = decimalFormatSymbols;
        b = new DecimalFormat("0.00", decimalFormatSymbols);
        c = new DecimalFormat("0.000", decimalFormatSymbols);
    }
}
