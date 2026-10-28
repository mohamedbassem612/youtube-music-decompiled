package defpackage;

import android.graphics.Bitmap;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oly implements ahcy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ oly(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) throws oma, IOException {
        switch (this.$cid) {
            case 0:
                oiv oivVarA = oiv.a(((ojb) obj).d);
                if (oivVarA == null) {
                    oivVarA = oiv.NONE;
                }
                return ahng.n(oivVarA);
            case 1:
                return aher.a;
            case 2:
                oma omaVar = new oma();
                if (((Boolean) obj).booleanValue()) {
                    throw omaVar;
                }
                throw new IOException("failed to save sharedFilesMetadata", omaVar);
            case 3:
                return ahng.n(null);
            case 4:
                Bitmap bitmap = (Bitmap) obj;
                Duration duration = rdr.a;
                return bitmap == null ? ahng.m(new IllegalStateException("Unable to create thumbnail.")) : ahng.n(bitmap);
            case 5:
                ayq ayqVar = (ayq) obj;
                ayqVar.getClass();
                return ayqVar.i();
            case 6:
                dov.Z((Throwable) obj);
                return aher.a;
            case 7:
                return aher.a;
            case 8:
                aqeg aqegVar = (aqeg) obj;
                int i = aqegVar.c;
                if (i != 3) {
                    return ahng.n(awmy.a);
                }
                int size = (i == 3 ? (aqee) aqegVar.d : aqee.a).b.size();
                return ahng.m(new RuntimeException(size > 0 ? a.bP(size, "Form submission failed with ", " validation error(s).") : "Form submission failed for non-validation reasons."));
            case 9:
                ug ugVar = (ug) obj;
                azs.h(!ugVar.g, "AppSearchSession has already been closed");
                return ugVar.b(new ub(ugVar, 4));
            case 10:
                return ahng.m(new aaos((Throwable) obj));
            case 11:
                return aher.a;
            case 12:
                awmd awmdVar = (awmd) obj;
                return awmdVar == null ? ahng.l() : ahng.n((abng) awmdVar.io());
            case 13:
                return ((ayq) obj).i();
            case 14:
                return ((aflh) obj).a();
            case 15:
                return ((aflh) obj).b();
            case 16:
                return ((afsr) obj).b();
            case 17:
                return ahng.n(((aihd) obj).toByteArray());
            case 18:
                return ahng.n(((aigv) obj).toByteArray());
            case 19:
                return ahng.n(((asdg) obj).toByteArray());
            default:
                return ahng.n(((asdn) obj).toByteArray());
        }
    }
}
