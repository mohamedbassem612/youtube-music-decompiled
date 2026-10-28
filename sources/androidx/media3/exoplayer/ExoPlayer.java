package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.media3.exoplayer.image.ImageOutput;
import defpackage.bth;
import defpackage.cbp;
import defpackage.cdm;
import defpackage.cdn;
import defpackage.cdv;
import defpackage.cdz;
import defpackage.tgr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends bth {
    void K(cbp cbpVar);

    void L();

    void M(boolean z);

    void N(cdv cdvVar);

    void O(boolean z);

    void P(tgr tgrVar);

    Looper c();

    cdn d(cdm cdmVar);

    void i(cdz cdzVar);

    boolean isScrubbingModeEnabled();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);
}
