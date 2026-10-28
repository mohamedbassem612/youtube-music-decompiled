package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eup extends eut {
    @Override // defpackage.euh
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.eut
    protected final /* bridge */ /* synthetic */ Object b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorE = e(uri);
        if (assetFileDescriptorE != null) {
            return assetFileDescriptorE.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.eut
    protected final /* synthetic */ void c(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }
}
