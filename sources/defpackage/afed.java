package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afed extends aeyl {
    final /* synthetic */ afef a;

    public afed(afef afefVar) {
        this.a = afefVar;
    }

    @Override // defpackage.aeyl, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.c().l();
    }

    @Override // defpackage.aeyl, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.c().y();
    }
}
