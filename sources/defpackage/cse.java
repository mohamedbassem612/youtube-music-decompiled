package defpackage;

import android.net.Uri;
import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cse implements crk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public cse(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.crk
    public final /* synthetic */ void gq(crm crmVar, long j, long j2, boolean z) {
        if (this.$cid != 0) {
            ((chz) this.a).f((crs) crmVar, j, j2);
            return;
        }
        crs crsVar = (crs) crmVar;
        csf csfVar = (csf) this.a;
        if (csfVar.f) {
            cnd cndVarA = csf.a(crsVar, j, j2);
            aae aaeVar = csfVar.g;
            aaeVar.getClass();
            aaeVar.f(cndVarA, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    @Override // defpackage.crk
    public final /* synthetic */ void gr(crm crmVar, long j, long j2, int i) {
        if (this.$cid == 0) {
            crs crsVar = (crs) crmVar;
            csf csfVar = (csf) this.a;
            if (csfVar.f) {
                cnd cndVarA = csf.a(crsVar, j, j2);
                aae aaeVar = csfVar.g;
                aaeVar.getClass();
                aaeVar.l(cndVarA, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
            }
        }
    }

    @Override // defpackage.crk
    public final /* synthetic */ yvt gs(crm crmVar, long j, long j2, IOException iOException, int i) {
        long j3;
        long j4;
        if (this.$cid != 0) {
            crs crsVar = (crs) crmVar;
            cnc cncVar = new cnc(crsVar.a, crsVar.b, j);
            cncVar.d = crsVar.d();
            cncVar.e = crsVar.e();
            cncVar.f = j2;
            cncVar.g = crsVar.c();
            cnd cndVar = new cnd(cncVar);
            int i2 = crsVar.c;
            chz chzVar = (chz) this.a;
            chzVar.w.j(cndVar, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
            chzVar.g(iOException);
            return crp.d;
        }
        crs crsVar2 = (crs) crmVar;
        csf csfVar = (csf) this.a;
        if (!csfVar.f) {
            return crp.d;
        }
        int i3 = iOException instanceof byv ? ((byv) iOException).d : Alert.DURATION_SHOW_INDEFINITELY;
        if (i3 == 410) {
            crp crpVar = csfVar.e;
            crpVar.getClass();
            crpVar.e(null);
            j3 = -9223372036854775807L;
        } else {
            j3 = 300000;
            if (i3 == 429) {
                List list = (List) crsVar2.e().get("Retry-After");
                if (list != null) {
                    try {
                        j4 = Long.parseLong((String) list.get(0)) * 1000;
                        j3 = j4;
                    } catch (NumberFormatException unused) {
                        bvx.e("SteeringManifestTracker", "Retry-After header string doesn't contain a parsable long");
                    }
                }
            } else {
                crz crzVar = ((csf) this.a).c;
                if (crzVar != null) {
                    j4 = crzVar.b;
                    if (j4 != -9223372036854775807L) {
                        j3 = j4;
                    }
                }
            }
        }
        if (j3 != -9223372036854775807L) {
            Object obj = this.a;
            ((csf) obj).c(new cqc(obj, 2), j3);
        }
        boolean z = j3 == -9223372036854775807L;
        csf csfVar2 = (csf) this.a;
        csfVar2.c(new csd(this, z, 0), 0L);
        cnd cndVarA = csf.a(crsVar2, j, j2);
        aae aaeVar = csfVar2.g;
        aaeVar.getClass();
        aaeVar.j(cndVarA, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        return crp.d;
    }

    @Override // defpackage.crk
    public final /* synthetic */ void gv(crm crmVar, long j, long j2) {
        if (this.$cid != 0) {
            crs crsVar = (crs) crmVar;
            cnc cncVar = new cnc(crsVar.a, crsVar.b, j);
            cncVar.d = crsVar.d();
            cncVar.e = crsVar.e();
            cncVar.f = j2;
            cncVar.g = crsVar.c();
            cnd cndVar = new cnd(cncVar);
            int i = crsVar.c;
            chz chzVar = (chz) this.a;
            chzVar.w.h(cndVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            chzVar.h(((Long) crsVar.d).longValue() - j);
            return;
        }
        Object obj = this.a;
        crs crsVar2 = (crs) crmVar;
        csf csfVar = (csf) obj;
        if (csfVar.f) {
            crz crzVar = (crz) crsVar2.d;
            crzVar.getClass();
            csfVar.c = crzVar;
            csfVar.c(new cfv(this, crzVar, 14), 0L);
            Uri uriC = csfVar.b;
            uriC.getClass();
            Uri uri = crzVar.c;
            if (uri != null) {
                uriC = atv.e(uri.toString()) ? uri : atv.c(uriC.toString(), uri.toString());
            }
            csfVar.b = uriC;
            long j3 = crzVar.b;
            if (j3 == -9223372036854775807L) {
                j3 = 300000;
            }
            csfVar.c(new cqc(obj, 2), j3);
            cnd cndVarA = csf.a(crsVar2, j, j2);
            aae aaeVar = csfVar.g;
            aaeVar.getClass();
            aaeVar.h(cndVarA, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }
}
