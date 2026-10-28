package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezb implements eyw {
    private final /* synthetic */ int $cid;
    private final Object a;

    public ezb(int i) {
        this.$cid = i;
        this.a = new ci(500L);
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [awmd, java.lang.Object] */
    @Override // defpackage.eyw
    public final eyv b(eza ezaVar) {
        switch (this.$cid) {
            case 0:
                return new eyg(this.a, ezaVar.a(Uri.class, AssetFileDescriptor.class), 2);
            case 1:
                return new eyr(this.a, 0);
            case 2:
                return new eyg(this.a, ezaVar.a(Uri.class, InputStream.class), 2);
            case 3:
                return new eyg(this.a, eyz.a, 2);
            case 4:
                return new ezk((ci) this.a);
            case 5:
                return new eyr((Context) this.a, 2, (byte[]) null);
            case 6:
                return new eyr((Context) this.a, 3, (char[]) null);
            case 7:
                return new adjt(this.a, ezaVar.a(File.class, ByteBuffer.class));
            default:
                return new adjt(this.a, ezaVar.a(File.class, InputStream.class));
        }
    }

    public ezb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.eyw
    public final void c() {
    }
}
