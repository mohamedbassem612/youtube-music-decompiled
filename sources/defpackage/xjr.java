package defpackage;

import androidx.media3.decoder.av1.Dav1dLibrary;
import androidx.media3.decoder.opus.OpusLibrary;
import androidx.media3.decoder.vp9.VpxLibrary;
import j$.util.Optional;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xjr implements agfr {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xjr(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agfr
    public final Object io() {
        erf erfVar;
        few fexVar;
        switch (this.$cid) {
            case 0:
                return Optional.ofNullable(null);
            case 1:
                return tnr.b;
            case 2:
            case 3:
            case 4:
            case 9:
                return null;
            case 5:
                return Collections.EMPTY_LIST;
            case 6:
                return Boolean.valueOf(VpxLibrary.a());
            case 7:
                return Boolean.valueOf(Dav1dLibrary.isAvailable());
            case 8:
                return Boolean.valueOf(OpusLibrary.a());
            case 10:
                return axg.a();
            case 11:
                erfVar = new erf();
                fexVar = fet.b;
                break;
            default:
                etx etxVar = adiz.a;
                erfVar = new erf();
                fexVar = new fex();
                break;
        }
        erfVar.a = fexVar;
        return erfVar;
    }
}
