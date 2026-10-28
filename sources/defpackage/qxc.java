package defpackage;

import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxc {
    private static final rbm a = new rbm("qxc");

    private qxc() {
    }

    public static int a(MediaMetadataRetriever mediaMetadataRetriever, int i, int i2, boolean z) {
        Optional optionalB = b(mediaMetadataRetriever, i, z);
        if (true == optionalB.isPresent()) {
            optionalB = Optional.ofNullable(Integer.valueOf(Integer.parseInt((String) optionalB.get())));
        }
        return ((Integer) optionalB.orElse(Integer.valueOf(i2))).intValue();
    }

    public static Optional b(MediaMetadataRetriever mediaMetadataRetriever, int i, boolean z) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(i);
        if (strExtractMetadata != null) {
            return Optional.of(strExtractMetadata);
        }
        if (z) {
            rbc rbcVar = new rbc(a, rbd.c);
            rbcVar.c();
            rbcVar.a("The source did not have key %d present, using default value.", Integer.valueOf(i));
        }
        return Optional.empty();
    }

    public static Optional c(MediaFormat mediaFormat, String str) {
        return mediaFormat.containsKey(str) ? Optional.of(Integer.valueOf(mediaFormat.getInteger(str))) : Optional.empty();
    }

    public static long d(MediaMetadataRetriever mediaMetadataRetriever, long j) {
        Optional optionalB = b(mediaMetadataRetriever, 9, true);
        if (true == optionalB.isPresent()) {
            optionalB = Optional.ofNullable(Long.valueOf(Long.parseLong((String) optionalB.get())));
        }
        return ((Long) optionalB.orElse(Long.valueOf(j))).longValue();
    }
}
