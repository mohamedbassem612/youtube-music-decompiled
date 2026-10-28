package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nii extends mew implements mzc {
    final AtomicReference d;

    public nii() {
        super(nih.a);
        this.d = new AtomicReference();
    }

    final void aR() {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(8, nkk.a, new njk(1)));
        }
    }

    @Override // defpackage.mzc
    public final int g() {
        aR();
        return ((ArrayList) this.d.get()).size();
    }

    @Override // defpackage.mzc
    public final /* bridge */ /* synthetic */ nay h(int i) {
        aR();
        return (nkl) ((ArrayList) this.d.get()).get(i);
    }

    public nii(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
