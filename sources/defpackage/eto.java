package defpackage;

import java.io.FileInputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eto implements etr {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public eto(euv euvVar, ewv ewvVar, int i) {
        this.$cid = i;
        this.a = euvVar;
        this.b = ewvVar;
    }

    @Override // defpackage.etr
    public final int a(etj etjVar) throws Throwable {
        fbg fbgVar;
        int iC;
        if (this.$cid != 0) {
            try {
                iC = etjVar.d((ByteBuffer) this.b, (ewv) this.a);
            } finally {
                fff.b((ByteBuffer) this.b);
            }
        } else {
            try {
                FileInputStream fileInputStream = new FileInputStream(((euv) this.a).a().getFileDescriptor());
                Object obj = this.b;
                fbgVar = new fbg(fileInputStream, (ewv) obj);
                try {
                    iC = etjVar.c(fbgVar, (ewv) obj);
                    fbgVar.b();
                    ((euv) this.a).a();
                } catch (Throwable th) {
                    th = th;
                    if (fbgVar != null) {
                        fbgVar.b();
                    }
                    ((euv) this.a).a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fbgVar = null;
            }
        }
        return iC;
    }

    public eto(ByteBuffer byteBuffer, ewv ewvVar, int i) {
        this.$cid = i;
        this.b = byteBuffer;
        this.a = ewvVar;
    }
}
