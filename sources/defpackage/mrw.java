package defpackage;

import android.text.Spannable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mrw extends Spannable.Factory {
    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        return new mrv(charSequence);
    }
}
