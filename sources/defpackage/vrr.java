package defpackage;

import android.widget.FrameLayout;
import j$.util.Optional;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vrr implements awmd {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vrr(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        switch (this.$cid) {
            case 0:
                return oph.a().a();
            case 1:
                int i = vhn.h;
                return new FrameLayout.LayoutParams(-1, -2);
            case 2:
                return Collections.EMPTY_SET;
            case 3:
                return new aacf();
            case 4:
                return new xgy();
            case 5:
                return new xgy();
            case 6:
                return agpr.a;
            default:
                ahva ahvaVar = ahva.a;
                return Optional.empty();
        }
    }
}
