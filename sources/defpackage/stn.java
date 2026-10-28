package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class stn implements TextWatcher {
    private final Handler a = new Handler();
    private adta[] b;
    private boolean c;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        adta[] adtaVarArr;
        byte[] bArr = null;
        if (editable != null && editable.length() != 0 && (adtaVarArr = this.b) != null) {
            if (this.c) {
                for (adta adtaVar : adtaVarArr) {
                    this.a.post(new rhz(editable, adtaVar, 20, bArr));
                }
            } else {
                for (adta adtaVar2 : adtaVarArr) {
                    editable.removeSpan(adtaVar2);
                }
            }
        }
        this.b = null;
        this.c = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || charSequence.length() == 0 || !(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        if (i2 > 0) {
            this.b = (adta[]) spanned.getSpans(i, i2 + i, adta.class);
            this.c = true;
            return;
        }
        if (i3 <= 0 || i <= 0 || i >= spanned.length()) {
            return;
        }
        adta[] adtaVarArr = (adta[]) spanned.getSpans(i - 1, i, adta.class);
        int i4 = i + 1;
        adta[] adtaVarArr2 = (adta[]) spanned.getSpans(i, i4, adta.class);
        if (adtaVarArr == null || adtaVarArr.length == 0 || adtaVarArr2 == null || adtaVarArr2.length == 0) {
            return;
        }
        this.b = (adta[]) spanned.getSpans(i, i4, adta.class);
        this.c = false;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
