package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class euv implements euj {
    private final ParcelFileDescriptorRewinder$InternalRewinder a;

    public euv(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public static boolean d() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // defpackage.euj
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }

    @Override // defpackage.euj
    public final void b() {
    }
}
