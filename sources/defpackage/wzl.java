package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wzl extends wze {
    public aunn k;
    public adxl l;

    public final aunn k() {
        aunn aunnVar = this.k;
        if (aunnVar != null) {
            return aunnVar;
        }
        awrc.b("liveChatPollCreationSheetView");
        return null;
    }

    @Override // defpackage.adyw
    protected final Optional n() {
        return this.k == null ? Optional.empty() : Optional.of(((xsc) k().io()).b);
    }

    @Override // defpackage.adyw
    protected final Optional o() {
        adxl adxlVar = this.l;
        if (adxlVar == null) {
            awrc.b("componentHighlighter");
            adxlVar = null;
        }
        return Optional.of(adxlVar);
    }

    @Override // defpackage.adyw, defpackage.cc
    public final void onDestroy() {
        super.onDestroy();
        ViewParent parent = ((View) ((xsc) k().io()).b).getParent();
        parent.getClass();
        ((ViewGroup) parent).removeAllViews();
    }

    @Override // defpackage.adyw
    protected final Optional p() {
        return Optional.empty();
    }

    @Override // defpackage.adyw
    protected final Optional q() {
        return Optional.empty();
    }
}
