package defpackage;

import android.util.Pair;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aceb implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aceb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v47, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v48, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((acea) this.a).handlePlaybackServiceException((aboe) obj);
                break;
            case 1:
                ((acea) this.a).handlePlaybackRateChangedEvent((aaxh) obj);
                break;
            case 2:
                ((acea) this.a).handleYouTubePlayerStateEvent((aazn) obj);
                break;
            case 3:
                ((acea) this.a).handleVideoStageEvent((aazj) obj);
                break;
            case 4:
                ((acea) this.a).n((aawn) obj);
                break;
            case 5:
                Pair pair = (Pair) obj;
                ((acii) this.a).X((aaxh) pair.second, ((acip) pair.first).a());
                break;
            case 6:
                ((acfp) this.a).A();
                break;
            case 7:
                ((acii) this.a).h((aazn) obj);
                break;
            case 8:
                ((acii) this.a).g((aazk) obj);
                break;
            case 9:
                aayt aaytVar = (aayt) obj;
                int iOrdinal = aaytVar.a.ordinal();
                Object obj2 = this.a;
                if (iOrdinal == 1) {
                    wjf wjfVarA = aaytVar.a();
                    boolean z = wjfVarA != null && wjfVarA.V();
                    acfp acfpVar = (acfp) obj2;
                    acfpVar.e = z;
                    if (z && acfpVar.d > 1.0f) {
                        acfpVar.z();
                    }
                    ((abvk) acfpVar.a.io()).J(acfpVar.d);
                } else if (iOrdinal == 7) {
                    ((acfp) obj2).A();
                }
                break;
            case 10:
                aaza aazaVar = (aaza) obj;
                ((acfr) this.a).j = aazaVar.g && !Objects.equals(aazaVar.a, aazaVar.d);
                break;
            case 11:
                int iOrdinal2 = ((aayt) obj).a.ordinal();
                Object obj3 = this.a;
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                if (iOrdinal2 == 4 || iOrdinal2 == 5) {
                                    ((acft) obj3).b(false);
                                    break;
                                } else if (iOrdinal2 != 7) {
                                }
                            }
                        }
                    }
                    acft acftVar = (acft) obj3;
                    acftVar.u = false;
                    acftVar.t = false;
                    acftVar.v = 0;
                    acftVar.w.g();
                }
                ((acft) obj3).c();
                break;
            case 12:
                int i = ((aazn) obj).a;
                acft acftVar2 = (acft) this.a;
                int i2 = acftVar2.v;
                acftVar2.v = i;
                switch (i) {
                    case 2:
                        acftVar2.b(i2 != 2);
                        break;
                    case 3:
                    case 5:
                    case 6:
                        if (!acftVar2.u && !acftVar2.t) {
                            acftVar2.b(false);
                            break;
                        }
                        break;
                    case 4:
                    case 7:
                    case 8:
                        acftVar2.c();
                        break;
                }
                break;
            case 13:
                ((acft) this.a).c();
                break;
            case 14:
                acft acftVar3 = (acft) this.a;
                if (!acftVar3.u) {
                    acftVar3.b(true);
                }
                break;
            case 15:
                aaza aazaVar2 = (aaza) obj;
                ((acft) this.a).s = aazaVar2.g && !Objects.equals(aazaVar2.a, aazaVar2.d);
                break;
            case 16:
                acip acipVar = ((aazq) obj).b;
                ((acgo) this.a).f = acipVar != null ? (ahhp) acipVar.e().a() : null;
                break;
            case 17:
                aazq aazqVar = (aazq) obj;
                boolean zEquals = aazqVar.equals(aazq.a);
                Object obj4 = this.a;
                if (!zEquals) {
                    ((AtomicReference) ((ache) obj4).a).set(aazqVar.b.p());
                } else {
                    ((AtomicReference) ((ache) obj4).a).set(null);
                }
                break;
            case 18:
                this.a.invoke(obj);
                break;
            case 19:
                this.a.invoke(obj);
                break;
            default:
                aazq aazqVar2 = (aazq) obj;
                boolean zEquals2 = aazqVar2.equals(aazq.a);
                Object obj5 = this.a;
                if (!zEquals2) {
                    ((achw) obj5).d.set(aazqVar2.b);
                } else {
                    ((achw) obj5).d.set(null);
                }
                break;
        }
    }
}
