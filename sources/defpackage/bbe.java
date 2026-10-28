package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class bbe extends bbd {
    public bbe(bbn bbnVar, WindowInsets windowInsets) {
        super(bbnVar, windowInsets);
    }

    @Override // defpackage.bbk
    public ayi B() {
        DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ayi(displayCutout);
    }

    @Override // defpackage.bbk
    public bbn C() {
        return bbn.o(this.a.consumeDisplayCutout(), null);
    }

    @Override // defpackage.bbc, defpackage.bbk
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bbe) {
            bbe bbeVar = (bbe) obj;
            if (Objects.equals(this.a, bbeVar.a) && Objects.equals(this.b, bbeVar.b) && v(this.c, bbeVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bbk
    public int hashCode() {
        return this.a.hashCode();
    }

    public bbe(bbn bbnVar, bbe bbeVar) {
        super(bbnVar, bbeVar);
    }
}
