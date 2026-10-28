package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class axm extends axk {
    static final axm a = new axm();

    public axm() {
        super(null);
    }

    @Override // defpackage.axk
    protected final boolean b() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
