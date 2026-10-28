package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ztg implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ztg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [aati, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                ((zst) ((zth) this.a).a.io()).f();
                break;
            case 1:
                ((ztk) ((zth) this.a).b.io()).d();
                break;
            case 2:
                ((ztk) this.a).d();
                break;
            case 3:
                aihf aihfVar = ((zui) this.a).f;
                long j = ((akkq) aihfVar.instance).j + 1;
                aihfVar.copyOnWrite();
                akkq akkqVar = (akkq) aihfVar.instance;
                akkqVar.c |= 8;
                akkqVar.j = j;
                break;
            case 4:
                aihf aihfVar2 = ((zui) this.a).f;
                long j2 = ((akkq) aihfVar2.instance).Q + 1;
                aihfVar2.copyOnWrite();
                akkq akkqVar2 = (akkq) aihfVar2.instance;
                akkqVar2.d |= 4;
                akkqVar2.Q = j2;
                break;
            case 5:
                aihf aihfVar3 = ((zui) this.a).f;
                long j3 = ((akkq) aihfVar3.instance).S + 1;
                aihfVar3.copyOnWrite();
                akkq akkqVar3 = (akkq) aihfVar3.instance;
                akkqVar3.d |= 16;
                akkqVar3.S = j3;
                break;
            case 6:
                aihf aihfVar4 = ((zui) this.a).f;
                long j4 = ((akkq) aihfVar4.instance).O + 1;
                aihfVar4.copyOnWrite();
                akkq akkqVar4 = (akkq) aihfVar4.instance;
                akkqVar4.d |= 1;
                akkqVar4.O = j4;
                break;
            case 7:
                aihf aihfVar5 = ((zui) this.a).f;
                long j5 = ((akkq) aihfVar5.instance).ai + 1;
                aihfVar5.copyOnWrite();
                akkq akkqVar5 = (akkq) aihfVar5.instance;
                akkqVar5.d |= 2097152;
                akkqVar5.ai = j5;
                break;
            case 8:
                aihf aihfVar6 = ((zui) this.a).f;
                long j6 = ((akkq) aihfVar6.instance).M + 1;
                aihfVar6.copyOnWrite();
                akkq akkqVar6 = (akkq) aihfVar6.instance;
                akkqVar6.c |= 536870912;
                akkqVar6.M = j6;
                break;
            case 9:
                aihf aihfVar7 = ((zui) this.a).f;
                long j7 = ((akkq) aihfVar7.instance).F + 1;
                aihfVar7.copyOnWrite();
                akkq akkqVar7 = (akkq) aihfVar7.instance;
                akkqVar7.c |= 4194304;
                akkqVar7.F = j7;
                break;
            case 10:
                aihf aihfVar8 = ((zui) this.a).f;
                long j8 = ((akkq) aihfVar8.instance).K + 1;
                aihfVar8.copyOnWrite();
                akkq akkqVar8 = (akkq) aihfVar8.instance;
                akkqVar8.c |= 134217728;
                akkqVar8.K = j8;
                break;
            case 11:
                ((zui) this.a).f();
                break;
            case 12:
                ((zui) this.a).e();
                break;
            case 13:
                ((aacg) this.a).c();
                break;
            case 14:
                ((aacg) this.a).c();
                break;
            case 15:
                taq.d();
                aach aachVar = (aach) this.a;
                aaci aaciVar = aachVar.h;
                aaciVar.c.remove(aachVar.b);
                aagu.g(aaciVar);
                break;
            case 16:
                Object obj = this.a;
                aaci aaciVar2 = (aaci) obj;
                aabz aabzVar = aaciVar2.b;
                aabzVar.e();
                aaciVar2.e = (String) ((agfa) aabzVar.c()).a;
                if (aaciVar2.f()) {
                    aaciVar2.d.execute(new ztg(obj, 18));
                }
                break;
            case 17:
                ((aaci) this.a).e();
                break;
            case 18:
                ((aaci) this.a).e();
                break;
            case 19:
                aadk aadkVar = ((aadj) this.a).a;
                ci ciVar = aadkVar.x;
                String str = aadkVar.d;
                if (str.equals(ciVar.as())) {
                    aaqz aaqzVarB = ((aaqx) aadkVar.q.io()).b();
                    boolean z = false;
                    for (aamw aamwVar : ciVar.at(str).values()) {
                        if (aamwVar.c()) {
                            String strE = aarq.e(aamwVar.f);
                            awmd awmdVar = aadkVar.i;
                            for (String str2 : ((aaew) awmdVar.io()).m(strE)) {
                                awmd awmdVar2 = aadkVar.r;
                                aaqw aaqwVarA = ((aaqu) awmdVar2.io()).a(str2);
                                if (aaqwVarA == null) {
                                    aamj aamjVarE = ((aaew) awmdVar.io()).e(str2);
                                    if (aamjVarE != null) {
                                        aaqwVarA = ((aaqu) awmdVar2.io()).b(aamjVarE.a, null);
                                    } else {
                                        ((agrc) ((agrc) aadk.a.b()).k("com/google/android/libraries/youtube/offline/client/DefaultOfflinePlaylistsStore$OfflinePlaylistsTransferListener", "onRestored", 1636, "DefaultOfflinePlaylistsStore.java")).t("[Offline] pudl transfer playlist not in database");
                                    }
                                }
                                aaqwVarA.b(strE);
                                aaqzVarB.b(strE);
                                z = true;
                            }
                        }
                    }
                    Iterator it = ((aaqu) aadkVar.r.io()).d().values().iterator();
                    while (it.hasNext()) {
                        aadkVar.i(((aaqw) it.next()).a());
                    }
                    if (z) {
                        ((aady) aadkVar.n.io()).o(aaqzVarB.a());
                    }
                }
                break;
            default:
                aado aadoVar = (aado) this.a;
                aadoVar.A.a.c().d(aadoVar.b);
                break;
        }
    }

    public ztg(ztk ztkVar, int i) {
        this.$cid = i;
        this.a = ztkVar;
    }
}
