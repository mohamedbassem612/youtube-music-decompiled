package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class euo extends eue {
    @Override // defpackage.euh
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.eue
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // defpackage.eue
    protected final /* synthetic */ void e(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }
}
