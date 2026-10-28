package defpackage;

import android.media.MediaMetadataRetriever;
import j$.time.Duration;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fxv implements Callable {
    private final /* synthetic */ int $cid;

    public /* synthetic */ fxv(int i) {
        this.$cid = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$cid) {
            case 0:
                return new fyj();
            case 1:
                return new dtp();
            case 2:
                return new MediaMetadataRetriever();
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 17:
            case 19:
                return null;
            case 11:
                int i = rdl.c;
                return Duration.ZERO;
            case 12:
                int i2 = rdl.c;
                return Duration.ZERO;
            case 13:
                return aigv.a;
            case 14:
                return ohx.a;
            case 15:
                agrf agrfVar = yam.a;
                return Boolean.FALSE;
            case 16:
                return Boolean.FALSE;
            case 18:
                return Boolean.FALSE;
            default:
                syn synVar = afnp.m;
                return Boolean.TRUE;
        }
    }
}
