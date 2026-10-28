package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exz implements eth {
    @Override // defpackage.eth
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, ety etyVar) throws Throwable {
        try {
            fff.c((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
