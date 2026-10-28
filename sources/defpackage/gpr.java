package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gpr implements ahcy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ gpr(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v47, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                iql iqlVar = (iql) obj;
                return afxd.f(((ayq) iqlVar.a.io()).i()).g(new iqj(5), iqlVar.b);
            case 1:
                iql iqlVar2 = (iql) obj;
                return afxd.f(((ayq) iqlVar2.a.io()).i()).g(new iqj(6), iqlVar2.b);
            case 2:
                kyr kyrVar = (kyr) obj;
                return ((qrx) kyrVar.a).a(new hdn(i), kyrVar.b);
            case 3:
                iql iqlVar3 = (iql) obj;
                return afxd.f(((ayq) iqlVar3.a.io()).i()).g(new iqj(4), iqlVar3.b);
            case 4:
                return ((iqk) obj).a();
            case 5:
                aaqn aaqnVar = (aaqn) obj;
                return aaqnVar instanceof aado ? ((aado) aaqnVar).p() : ahng.m(new Throwable("Fail to get initFuture."));
            case 6:
                iqk iqkVar = (iqk) obj;
                return ahno.ar(((ayq) iqkVar.a.io()).i(), new iqj(i), iqkVar.b);
            case 7:
                return ((iqk) obj).a();
            case 8:
                return ((iqk) obj).d(false);
            case 9:
                return ((xsc) obj).ax();
            case 10:
                iqn iqnVar = (iqn) obj;
                return ahno.ar(((ayq) iqnVar.d.io()).i(), new iqj(8), iqnVar.e);
            case 11:
                iqn iqnVar2 = (iqn) obj;
                return ahno.ar(((ayq) iqnVar2.d.io()).i(), new iqj(7), iqnVar2.e);
            case 12:
                return ((iqk) obj).a();
            case 13:
                return ahno.ar(((ayq) ((xsc) obj).b.io()).i(), new iqj(9), MoreExecutors.directExecutor());
            case 14:
                Throwable th = (Throwable) obj;
                ((agrc) ((agrc) ((agrc) itq.a.b().i(agso.a, "SideloadedBrowsePage")).j(th)).k("com/google/android/apps/youtube/music/sideloaded/service/SideloadedBrowsePageGenerationService", "createBrowsePageResponse", (char) 512, "SideloadedBrowsePageGenerationService.java")).t("Unable to query for item view mode");
                return ahng.m(th);
            case 15:
                Throwable th2 = (Throwable) obj;
                ((agrc) ((agrc) ((agrc) itq.a.b().i(agso.a, "SideloadedBrowsePage")).j(th2)).k("com/google/android/apps/youtube/music/sideloaded/service/SideloadedBrowsePageGenerationService", "createBrowsePageResponse", (char) 522, "SideloadedBrowsePageGenerationService.java")).t("Unable to query for sideloaded content");
                return ahng.m(th2);
            case 16:
                oip oipVar = (oip) obj;
                return ahng.n(oipVar != null ? agev.i(nss.a(oipVar)) : agdf.a);
            case 17:
                onb.g((IOException) obj, "%s: IOException while adding group for download", "MobileDataDownload");
                return ahng.n(Boolean.FALSE);
            case 18:
                acb acbVarA = oig.a();
                acbVarA.b = oif.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
                acbVarA.d = (IOException) obj;
                return ahng.m(acbVarA.a());
            case 19:
                return aher.a;
            default:
                return aher.a;
        }
    }
}
