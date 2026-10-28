package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ByteStoreConfig;
import com.google.android.libraries.elements.interfaces.ComponentSharedResources;
import com.google.android.libraries.elements.interfaces.NamespacedStoreConfig;
import java.util.HashMap;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cln implements agfr {
    private final /* synthetic */ int $cid;

    public /* synthetic */ cln(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agfr
    public final Object io() {
        int i = 0;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                agfr agfrVar = clo.a;
                return ahng.T(ahno.Z(bwp.O("ro.vendor.api_level")));
            case 1:
                return new cbd();
            case 2:
                int i3 = cth.a;
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 3:
                khn khnVar = kdi.a;
                kbk kbkVarB = kbk.b();
                kro.l(kbkVarB);
                return kbkVarB.c().d;
            case 4:
                return new agit((int) auqx.a.io().a());
            case 5:
                meg.a();
                ByteStore byteStoreCreate = ByteStore.create(new ByteStoreConfig(false, NamespacedStoreConfig.EMPTY_CONFIG, false, true), null);
                if (byteStoreCreate == null) {
                    throw new nud("Error creating Elements ByteStore.");
                }
                return byteStoreCreate;
            case 6:
                boolean z = osu.a;
                return new ComponentSharedResources(new HashMap(), null, null, null);
            case 7:
                int i4 = oty.a;
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            case 8:
                return tnr.b;
            case 9:
                return Executors.newSingleThreadExecutor(new szw(10, "mdxMsg"));
            case 10:
                return Executors.newSingleThreadExecutor(new szw(10, "mdxConnect"));
            case 11:
                return Executors.newSingleThreadExecutor(new szw(10, "mdxHangingGet"));
            case 12:
            case 13:
                return null;
            case 14:
                int i5 = ytk.a;
                agkh agkhVar = new agkh(4);
                agkhVar.e("plt_cpc", new ytj(i));
                agkhVar.e("plt_qvc", new ytj(8));
                agkhVar.e("plt_spi", new ytj(9));
                agkhVar.e("plt_spr", new cln(15));
                agkhVar.e("nrrps", new cln(16));
                agkhVar.e("fab_r", new cln(17));
                agkhVar.e("fvb_r", new cln(18));
                agkhVar.e("ais_r", new cln(19));
                agkhVar.e("vis_r", new cln(20));
                agkhVar.e("mb_s", new ytj(i2));
                agkhVar.e("orh_r", new ytj(2));
                agkhVar.e("ormk", new ytj(3));
                agkhVar.e("omp_r", new ytj(4));
                agkhVar.e("omp_c", new ytj(5));
                agkhVar.e("oprd_s", new ytj(6));
                agkhVar.e("oprd_c", new ytj(7));
                return agkhVar.d(true);
            case 15:
                return new ylo();
            case 16:
                return new ymg();
            case 17:
                return new yik();
            case 18:
                return new ymq();
            case 19:
                return new yim();
            default:
                return new yms();
        }
    }
}
