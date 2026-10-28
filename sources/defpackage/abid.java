package defpackage;

import android.util.Pair;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abid implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abid(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                this.a.invoke(obj);
                return;
            case 1:
                Pair pair = (Pair) obj;
                aayt aaytVar = (aayt) pair.second;
                int iA = ((acip) pair.first).a();
                Object obj2 = this.a;
                afvx afvxVarAe = tym.ae(tsa.HANDLE_RX_VIDEO_STAGE_EVENT, aawm.b("SOP", aaytVar != null ? aaytVar.b : null));
                try {
                    ((abhe) obj2).h = aaytVar.b;
                    if (iA == 0 && aaytVar.a() != null) {
                        ((abhe) obj2).c = aaytVar.a().G();
                    }
                    if (aaytVar.a() != null && aaytVar.g() != null) {
                        ((abhe) obj2).n(aaytVar.a().G(), aaytVar.g());
                        break;
                    }
                    afvxVarAe.close();
                    return;
                } catch (Throwable th) {
                    try {
                        afvxVarAe.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 2:
                this.a.invoke(obj);
                return;
            case 3:
                this.a.invoke(obj);
                return;
            case 4:
                this.a.invoke(obj);
                return;
            case 5:
                this.a.invoke(obj);
                return;
            case 6:
                this.a.invoke(obj);
                return;
            case 7:
                this.a.invoke(obj);
                return;
            case 8:
                this.a.invoke(obj);
                return;
            case 9:
                Duration duration = abin.a;
                this.a.invoke(obj);
                return;
            case 10:
                Duration duration2 = abin.a;
                this.a.invoke(obj);
                return;
            case 11:
                aayv aayvVar = (aayv) obj;
                int i = aayvVar.c;
                boolean z = i == 1;
                abip abipVar = (abip) this.a;
                abipVar.d = z;
                boolean z2 = aayvVar.d;
                abipVar.e = i == 2;
                abipVar.d();
                return;
            case 12:
                aayw aaywVar = (aayw) obj;
                if (aaywVar.b.b(abnw.e)) {
                    wgi wgiVar = aaywVar.d;
                    avbm avbmVar = wgiVar != null ? wgiVar.h : null;
                    abip abipVar2 = (abip) this.a;
                    abipVar2.f = avbmVar;
                    abipVar2.d();
                    return;
                }
                return;
            case 13:
                aazj aazjVar = (aazj) obj;
                abob abobVar = aazjVar.a;
                if (!abobVar.c(abob.c) || abobVar.h()) {
                    return;
                }
                ((abir) this.a).d(aazjVar.f);
                return;
            case 14:
                ((abiv) this.a).a((aazj) obj);
                return;
            case 15:
                ((abix) this.a).a = ((Boolean) obj).booleanValue();
                return;
            case 16:
                ((ablk) this.a).e = (tyy) obj;
                return;
            case 17:
                acip acipVar = ((aazq) obj).b;
                abyv abyvVarP = acipVar.p();
                ablk ablkVar = (ablk) this.a;
                ablkVar.d = abyvVarP;
                ablkVar.n = acipVar.bq();
                ablkVar.g();
                return;
            case 18:
                ((ablk) this.a).g();
                return;
            case 19:
                ((ablk) this.a).f((Pair) obj);
                return;
            default:
                aaxj aaxjVar = (aaxj) obj;
                ablk ablkVar2 = (ablk) this.a;
                acfx acfxVar = ablkVar2.g;
                if (acfxVar == null || !acfxVar.o(aaxjVar.b)) {
                    if (ablkVar2.m == 3) {
                        ablkVar2.m = 2;
                    }
                    ablkVar2.f = aaxjVar.a;
                    return;
                }
                return;
        }
    }
}
