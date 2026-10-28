package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.axla;
import defpackage.axlb;
import defpackage.axld;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(byte[] bArr) {
        return new axlb(ByteBuffer.wrap(bArr, 0, bArr.length).slice());
    }

    public static UploadDataProvider create(File file) {
        return new axld(new axla(file, 1));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new axlb(byteBuffer.slice());
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new axld(new axla(parcelFileDescriptor, 0));
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new axlb(ByteBuffer.wrap(bArr, i, i2).slice());
    }
}
