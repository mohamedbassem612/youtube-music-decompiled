package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class euw extends eue {
    @Override // defpackage.euh
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.eue
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.eue
    protected final /* synthetic */ void e(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
