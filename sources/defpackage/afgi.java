package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class afgi implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ afgi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [afil, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [afna, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [afna, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [afso, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() throws IOException {
        agke agkeVarN;
        ListenableFuture listenableFutureN;
        int i = 15;
        byte[] bArr = null;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                List list = ((afgj) this.a).d;
                synchronized (list) {
                    agkeVarN = agke.n(list);
                    break;
                }
                ArrayList arrayList = new ArrayList(agkeVarN.size());
                int size = agkeVarN.size();
                while (i2 < size) {
                    try {
                        listenableFutureN = ((afgh) agkeVarN.get(i2)).e();
                    } catch (Throwable th) {
                        ((agrc) ((agrc) ((agrc) afgj.a.b()).j(th)).k("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl", "notifyRequirementStateChanged", (char) 198, "AccountRequirementManagerImpl.java")).t("OnRequirementStateChanged observer failed.");
                        listenableFutureN = ahng.n(null);
                    }
                    arrayList.add(listenableFutureN);
                    i2++;
                }
                return ahng.g(arrayList).a(new okp(15), MoreExecutors.directExecutor());
            case 1:
                List<File> list2 = (List) this.a.io();
                if (!list2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("rm");
                    arrayList2.add("-r");
                    for (File file : list2) {
                        if (file.exists()) {
                            arrayList2.add(file.getAbsolutePath());
                            i2 = 1;
                        }
                    }
                    if (i2 != 0) {
                        aeoo.c(arrayList2);
                    }
                }
                return ahng.n(null);
            case 2:
                return this.a.a();
            case 3:
                Object obj = this.a;
                afja afjaVar = (afja) obj;
                afid afidVar = afjaVar.d;
                ListenableFuture listenableFutureA = afjaVar.a();
                aheo aheoVarR = aheo.p(afidVar.d()).r(afwl.d(new aekb(obj, 5)), afjaVar.g);
                ahcy ahcyVarD = afwl.d(new aekb(obj, 6));
                ahex ahexVar = afjaVar.f;
                aheo aheoVarR2 = aheoVarR.r(ahcyVarD, ahexVar);
                return ahng.h(listenableFutureA, aheoVarR2).a(afwl.j(new aalq(listenableFutureA, aheoVarR2, 18)), ahexVar);
            case 4:
                Object obj2 = this.a;
                afja afjaVar2 = (afja) obj2;
                agke agkeVarN2 = afjaVar2.h.n(true);
                agkx agkxVar = new agkx();
                int i3 = ((agpi) agkeVarN2).d;
                while (i2 < i3) {
                    File file2 = (File) agkeVarN2.get(i2);
                    try {
                        agkxVar.c(Integer.valueOf(Integer.parseInt(file2.getName())));
                    } catch (NumberFormatException e) {
                        ((agrc) ((agrc) ((agrc) afja.a.b()).j(e)).k("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "cleanUpObseleteAccountDirsInternal", (char) 172, "WipeoutAccountsSynclet.java")).w("Account directory name is malformed. Directory name: %s", file2.getName());
                    }
                    i2++;
                }
                return ahcs.f(ahno.ar(((abhh) ((abhh) afjaVar2.i.b).b).r(), new aeni(7), MoreExecutors.directExecutor()), afwl.d(new aaoq(obj2, agkxVar.g(), 10, bArr)), afjaVar2.g);
            case 5:
                afjd afjdVar = (afjd) this.a;
                erj erjVarB = erj.b(afjdVar.a);
                ffs.f();
                ((kmm) erjVarB.i.b).e().b();
                erjVarB.getClass();
                return afjdVar.b.submit(new afjc(erjVarB, 0));
            case 6:
                return this.a.a();
            case 7:
                syn synVar = afnp.m;
                return this.a.a();
            case 8:
                Object obj3 = this.a;
                aekb aekbVar = new aekb(obj3, i);
                afry afryVar = (afry) obj3;
                return afryVar.f(ahno.as(afryVar.g, aekbVar, afryVar.b));
            case 9:
                return this.a.a();
            case 10:
                return this.a;
            case 11:
                agsn agsnVar = ahup.a;
                return ahng.n((CronetEngine) ((ahum) this.a).d.io());
            default:
                agsn agsnVar2 = ahup.a;
                return ahng.o(((afkb) this.a).a());
        }
    }
}
