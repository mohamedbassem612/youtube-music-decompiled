package defpackage;

import j$.util.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acaa implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acaa(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.avni
    public final void a(Object obj) {
        aopz aopzVarX;
        switch (this.$cid) {
            case 0:
                aaxo aaxoVar = (aaxo) obj;
                zgj zgjVar = ((acab) this.a).p;
                if (zgjVar != null) {
                    abnr abnrVar = aaxoVar.a;
                    zgjVar.i(abnrVar.i, abnrVar.b(), aaxoVar.c, aaxoVar.d);
                    zgjVar.G(false);
                }
                break;
            case 1:
                Integer num = (Integer) obj;
                zgj zgjVar2 = ((acab) this.a).p;
                if (zgjVar2 != null) {
                    zgjVar2.g(num.intValue());
                }
                break;
            case 2:
                acab acabVar = (acab) this.a;
                aboe aboeVar = (aboe) obj;
                apbx apbxVarA = acab.a(acabVar.c);
                zgj zgjVar3 = acabVar.p;
                if (zgjVar3 != null && apbxVarA.e) {
                    int i = aboeVar.j - 1;
                    if (i == 3) {
                        if (acabVar.d(aboeVar)) {
                            zgjVar3.A(aboeVar.h, aboeVar.g);
                        }
                    } else if (i == 16) {
                        zgjVar3.G(true);
                    }
                    break;
                }
                break;
            case 3:
                aboe aboeVar2 = (aboe) obj;
                int i2 = aboeVar2.j;
                acab acabVar2 = (acab) this.a;
                apbx apbxVarA2 = acab.a(acabVar2.c);
                zgj zgjVar4 = acabVar2.p;
                if (i2 == 4 && acabVar2.d(aboeVar2) && zgjVar4 != null && apbxVarA2.e) {
                    zgjVar4.A(aboeVar2.h, aboeVar2.g);
                    break;
                }
                break;
            case 4:
                aaww aawwVar = (aaww) obj;
                wjf wjfVar = aawwVar.a;
                acag acagVar = (acag) this.a;
                acagVar.p = wjfVar;
                akef akefVar = aawwVar.b;
                if ((akefVar.b & 8) != 0) {
                    ajom ajomVar = akefVar.e;
                    if (ajomVar == null) {
                        ajomVar = ajom.a;
                    }
                    aopzVarX = ajomVar.b;
                    if (aopzVarX == null) {
                        aopzVarX = aopz.a;
                    }
                } else {
                    aopzVarX = wjfVar.x();
                }
                acagVar.s = !((akefVar.b & 8) != 0);
                acagVar.k(wjfVar, aopzVarX);
                break;
            case 5:
                ((acal) this.a).b = (String) ((Optional) obj).orElse("");
                break;
            case 6:
                aaxb aaxbVar = (aaxb) obj;
                int i3 = aaxbVar.a;
                int i4 = aaxbVar.b;
                if (i3 < 0 || i4 < 0) {
                    i3 = 1280;
                    i4 = 720;
                }
                float f = 0.0f;
                if (i4 > 0 && i3 > 0) {
                    f = i3 / i4;
                }
                acdc acdcVar = (acdc) this.a;
                acdcVar.d = f;
                Iterator it = acdcVar.b.iterator();
                while (it.hasNext()) {
                    ((acdb) it.next()).a();
                }
                break;
            case 7:
                ((acdc) this.a).handleFormatStreamChangeEvent((yvu) obj);
                break;
            case 8:
                ((acdv) this.a).b();
                break;
            case 9:
                ((acea) this.a).handleFormatStreamChangeEvent((yvu) obj);
                break;
            case 10:
                ((acea) this.a).handleSequencerStageEvent((aayw) obj);
                break;
            case 11:
                ((acea) this.a).handleSequencerHasPreviousNextEvent((aayv) obj);
                break;
            case 12:
                ((acea) this.a).handleVideoTimeEvent((aazk) obj);
                break;
            case 13:
                ((acea) this.a).handlePlaybackRateChangedEvent((aaxh) obj);
                break;
            case 14:
                ((acea) this.a).handlePlaybackServiceException((aboe) obj);
                break;
            case 15:
                ((acea) this.a).handleYouTubePlayerStateEvent((aazn) obj);
                break;
            case 16:
                ((acea) this.a).handleVideoStageEvent((aazj) obj);
                break;
            case 17:
                ((acea) this.a).handleFormatStreamChangeEvent((yvu) obj);
                break;
            case 18:
                ((acea) this.a).handleSequencerStageEvent((aayw) obj);
                break;
            case 19:
                ((acea) this.a).handleSequencerHasPreviousNextEvent((aayv) obj);
                break;
            default:
                ((acea) this.a).handleVideoTimeEvent((aazk) obj);
                break;
        }
    }
}
