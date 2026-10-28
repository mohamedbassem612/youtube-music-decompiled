package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mru extends Editable.Factory {
    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        return new mrx(charSequence);
    }
}
