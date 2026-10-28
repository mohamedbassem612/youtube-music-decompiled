package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eud extends eut {
    @Override // defpackage.euh
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.eut
    protected final /* bridge */ /* synthetic */ Object b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorE = e(uri);
        if (assetFileDescriptorE != null) {
            return assetFileDescriptorE;
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.eut
    protected final /* synthetic */ void c(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }
}
