package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abms implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abms(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((isi) this.a).C((aaxh) obj);
                break;
            case 1:
                ((isi) this.a).C((aaxd) obj);
                break;
            case 2:
                ((isi) this.a).C((aaxt) obj);
                break;
            case 3:
                ((isi) this.a).C((aaxz) obj);
                break;
            case 4:
                ((isi) this.a).D((aaxv) obj);
                break;
            case 5:
                aaye aayeVar = (aaye) obj;
                isi isiVar = (isi) this.a;
                isiVar.C(aayeVar);
                isiVar.C(aayb.a(aayeVar));
                break;
            case 6:
                ((isi) this.a).D((abme) obj);
                break;
            case 7:
                ((isi) this.a).D((abmi) obj);
                break;
            case 8:
                ((isi) this.a).D((aazd) obj);
                break;
            case 9:
                ((isi) this.a).C((yvu) obj);
                break;
            case 10:
                ((isi) this.a).C((aazn) obj);
                break;
            case 11:
                ((isi) this.a).D((aazb) obj);
                break;
            case 12:
                ((isi) this.a).C((aazc) obj);
                break;
            case 13:
                ((isi) this.a).D((aayq) obj);
                break;
            case 14:
                ((isi) this.a).C((aazj) obj);
                break;
            case 15:
                ((isi) this.a).D((yvu) obj);
                break;
            case 16:
                abun abunVar = ((aayx) obj).b;
                aboi aboiVar = (aboi) this.a;
                aboiVar.h(true);
                aboiVar.g(true);
                break;
            case 17:
                Throwable th = (Throwable) obj;
                boolean z = th instanceof CancellationException;
                Object obj2 = this.a;
                if (!z) {
                    ((aqi) obj2).d(th);
                } else {
                    ((aqi) obj2).c();
                }
                break;
            case 18:
                ((abpi) this.a).handlePlaybackServiceException((aboe) obj);
                break;
            case 19:
                ((abpi) this.a).handleVideoStageEvent((aazj) obj);
                break;
            default:
                ((AtomicReference) this.a).set((avmn) obj);
                break;
        }
    }
}
