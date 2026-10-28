package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyk implements eyj {
    private final /* synthetic */ int $cid;

    public eyk(int i) {
        this.$cid = i;
    }

    @Override // defpackage.eyj
    public final Class a() {
        return this.$cid != 0 ? ParcelFileDescriptor.class : InputStream.class;
    }

    @Override // defpackage.eyj
    public final /* synthetic */ Object b(File file) {
        return this.$cid != 0 ? ParcelFileDescriptor.open(file, 268435456) : new FileInputStream(file);
    }

    @Override // defpackage.eyj
    public final /* synthetic */ void c(Object obj) throws IOException {
        if (this.$cid != 0) {
            ((ParcelFileDescriptor) obj).close();
        } else {
            ((InputStream) obj).close();
        }
    }
}
