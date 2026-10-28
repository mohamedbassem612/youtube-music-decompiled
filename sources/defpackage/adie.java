package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adie implements eua {
    private final ewv a;

    public adie(ewv ewvVar) {
        this.a = ewvVar;
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ ewf a(Object obj, int i, int i2, ety etyVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ewv ewvVar = this.a;
        byte[] bArr = (byte[]) ewvVar.a(65536, byte[].class);
        while (true) {
            int i3 = inputStream.read(bArr, 0, bArr.length);
            if (i3 == -1) {
                byteArrayOutputStream.flush();
                ewvVar.c(bArr);
                return new fbu(byteArrayOutputStream.toByteArray(), 0);
            }
            byteArrayOutputStream.write(bArr, 0, i3);
        }
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ boolean b(Object obj, ety etyVar) {
        return true;
    }
}
