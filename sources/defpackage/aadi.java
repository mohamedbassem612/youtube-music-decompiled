package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aadi implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public aadi(aaco aacoVar, String str, int i) {
        this.$cid = i;
        this.b = str;
        this.a = aacoVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                ((aadj) this.a).m((aamw) this.b);
                break;
            case 1:
                aaco aacoVar = (aaco) this.a;
                aanb aanbVar = (aanb) aacoVar.d.io();
                String strD = aanbVar.d();
                String str = (String) this.b;
                if (str.equals(strD)) {
                    ((aapr) aacoVar.e.io()).a(str, aanbVar.b());
                }
                break;
            case 2:
                ((aadj) this.a).m((aamw) this.b);
                break;
            case 3:
                ((aadj) this.a).m((aamw) this.b);
                break;
            case 4:
                ((aadj) this.a).m((aamw) this.b);
                break;
            case 5:
                if (((aado) this.a).B()) {
                    this.b.run();
                }
                break;
            case 6:
                String strK = this.a.k();
                String strR = aado.r(strK);
                aadq aadqVar = (aadq) this.b;
                Context context = aadqVar.a;
                context.deleteDatabase(strR);
                aauk aaukVar = aadqVar.b;
                aalf.t(context, aadqVar.c, strK, aadqVar.d, aaukVar);
                break;
            case 7:
                aadv aadvVar = (aadv) this.a;
                if (aadvVar.k.C()) {
                    String str2 = (String) this.b;
                    aadvVar.c(str2);
                    aadvVar.d(str2);
                }
                break;
            case 8:
                aadv aadvVar2 = (aadv) this.a;
                if (aadvVar2.k.C()) {
                    String str3 = (String) this.b;
                    ((aaew) aadvVar2.g.io()).I(str3);
                    aadvVar2.d(str3);
                }
                break;
            case 9:
                aadv aadvVar3 = (aadv) this.a;
                if (aadvVar3.k.C()) {
                    Object obj = this.b;
                    taq.c();
                    aady aadyVar = (aady) aadvVar3.i.io();
                    taq.c();
                    if (aadyVar.n.C()) {
                        aaew aaewVar = (aaew) aadyVar.h.io();
                        String str4 = (String) obj;
                        if (aaewVar.aj(str4) != null) {
                            try {
                                aamo aamoVarW = ((abfv) aadyVar.f.io()).w((String) obj);
                                if (aaewVar.G(aamoVarW)) {
                                    ((elr) aadyVar.i.io()).n(aamoVarW);
                                    aadyVar.k(str4);
                                    aadyVar.j();
                                }
                            } catch (ExecutionException e) {
                                ((agrc) ((agrc) ((agrc) aady.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideosStore", "updateVideoMetadataInternal", (char) 874, "DefaultOfflineVideosStore.java")).w("Failed requesting video %s for offline", obj);
                            }
                        }
                    }
                    taq.c();
                    String str5 = (String) obj;
                    if (((aaew) aadvVar3.g.io()).f(str5) == null) {
                        ((agrc) ((agrc) aadv.a.b()).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideoPolicyStore", "refreshVideoThumbnailInBackground", 615, "DefaultOfflineVideoPolicyStore.java")).w("Refresh video failed because snapshot invalid for %s", obj);
                    } else {
                        aerj aerjVar = (aerj) aadvVar3.h.io();
                        taq.c();
                        ((abfv) aerjVar.e).s((String) aerjVar.b, str5);
                    }
                    agqr it = ((agpr) aadvVar3.j).iterator();
                    while (it.hasNext()) {
                        aaqs aaqsVar = (aaqs) it.next();
                        aaqsVar.a();
                    }
                }
                break;
            default:
                aadv aadvVar4 = (aadv) this.a;
                if (aadvVar4.k.C()) {
                    aadvVar4.e((String) this.b);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ aadi(aadq aadqVar, zwa zwaVar, int i) {
        this.$cid = i;
        this.b = aadqVar;
        this.a = zwaVar;
    }

    public /* synthetic */ aadi(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
