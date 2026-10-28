package defpackage;

import android.os.ParcelFileDescriptor;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axla implements axlc {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public axla(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.axlc
    public final FileChannel a() throws IOException {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileInputStream((File) obj).getChannel());
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: ".concat(String.valueOf(String.valueOf(obj))));
    }
}
