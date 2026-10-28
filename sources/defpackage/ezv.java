package defpackage;

import android.graphics.ImageDecoder;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ezv implements eua {
    private final ewn a = new ewo();
    private final boolean b;

    public ezv(boolean z) {
        this.b = z;
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ ewf a(Object obj, int i, int i2, ety etyVar) {
        return c(fd$$ExternalSyntheticApiModelOutline0.m767m(obj), i, i2, etyVar);
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ boolean b(Object obj, ety etyVar) {
        fd$$ExternalSyntheticApiModelOutline0.m767m(obj);
        return true;
    }

    public final ewf c(ImageDecoder.Source source, int i, int i2, ety etyVar) {
        try {
            return new ezw(ImageDecoder.decodeBitmap(source, new ezp(i, i2, etyVar, this.b)), this.a);
        } catch (IOException unused) {
            return null;
        }
    }
}
