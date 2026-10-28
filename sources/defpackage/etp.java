package defpackage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class etp implements etq {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public etp(euv euvVar, ewv ewvVar, int i) {
        this.$cid = i;
        this.b = euvVar;
        this.a = ewvVar;
    }

    @Override // defpackage.etq
    public final boolean a(etj etjVar) throws Throwable {
        boolean zE;
        fbg fbgVar;
        int i = this.$cid;
        if (i == 0) {
            try {
                zE = etjVar.e((InputStream) this.a, (ewv) this.b);
            } finally {
                ((InputStream) this.a).reset();
            }
        } else if (i != 1) {
            try {
                FileInputStream fileInputStream = new FileInputStream(((euv) this.b).a().getFileDescriptor());
                Object obj = this.a;
                fbgVar = new fbg(fileInputStream, (ewv) obj);
                try {
                    zE = etjVar.e(fbgVar, (ewv) obj);
                    fbgVar.b();
                    ((euv) this.b).a();
                } catch (Throwable th) {
                    th = th;
                    if (fbgVar != null) {
                        fbgVar.b();
                    }
                    ((euv) this.b).a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fbgVar = null;
            }
        } else {
            try {
                zE = etjVar.f((ByteBuffer) this.a, (ewv) this.b);
            } finally {
                fff.b((ByteBuffer) this.a);
            }
        }
        return zE;
    }

    public etp(Object obj, ewv ewvVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = ewvVar;
    }
}
