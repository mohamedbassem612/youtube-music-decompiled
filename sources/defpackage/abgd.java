package defpackage;

import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abgd implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abgd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.avni
    public final void a(Object obj) {
        acan acanVar;
        switch (this.$cid) {
            case 0:
                aber aberVar = (aber) this.a;
                Object obj2 = aberVar.a;
                yvu yvuVar = (yvu) obj;
                abge abgeVar = (abge) obj2;
                abgeVar.P = 0L;
                abgeVar.Q = 0L;
                wgs wgsVar = yvuVar.f;
                wgs wgsVar2 = yvuVar.c;
                synchronized (abgeVar.R) {
                    try {
                        if (wgsVar != null) {
                            if (wgsVar2 != null) {
                                ((abge) obj2).S = new wgs[]{wgsVar, wgsVar2};
                            } else {
                                ((abge) obj2).S = new wgs[]{wgsVar};
                            }
                        } else if (wgsVar2 != null) {
                            ((abge) obj2).S = new wgs[]{wgsVar2};
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                ((abge) aberVar.a).k(true);
                return;
            case 1:
                aazk aazkVar = (aazk) obj;
                long j = aazkVar.a;
                abge abgeVar2 = (abge) ((aber) this.a).a;
                abgeVar2.M = j;
                long j2 = aazkVar.b;
                abgeVar2.N = aazkVar.c;
                abgeVar2.O = aazkVar.d;
                abgeVar2.P = aazkVar.e;
                abgeVar2.n();
                return;
            case 2:
                aazn aaznVar = (aazn) obj;
                abge abgeVar3 = (abge) ((aber) this.a).a;
                if (!abgeVar3.E || abgeVar3.G) {
                    return;
                }
                int i = aaznVar.a;
                if (i == 2 || i == 5) {
                    abgeVar3.H = false;
                } else if (i == 6) {
                    i = 6;
                    abgeVar3.H = false;
                }
                if (i == 2) {
                    abgeVar3.j(new abgi(abgh.b, false));
                    return;
                }
                if (i != 3 && i != 4) {
                    if (i == 5) {
                        abgeVar3.j(new abgi(abgh.b, true));
                        return;
                    } else if (i != 6) {
                        return;
                    }
                }
                abgeVar3.j(aaznVar.a() ? new abgi(abgh.c, true) : new abgi(abgh.c, false));
                return;
            case 3:
                aaxo aaxoVar = (aaxo) obj;
                boolean z = aaxoVar.b == abnr.FULLSCREEN;
                abge abgeVar4 = (abge) ((aber) this.a).a;
                if (abgeVar4.D != z) {
                    abgeVar4.D = z;
                    abgeVar4.y.p(z);
                }
                abgeVar4.C = aaxoVar.a == abnr.REMOTE;
                return;
            case 4:
                ((abge) ((aber) this.a).a).F = true;
                return;
            case 5:
                abge abgeVar5 = (abge) ((aber) this.a).a;
                abmt abmtVar = abgeVar5.B;
                aaza aazaVar = (aaza) obj;
                if ((abmtVar == null || !abmtVar.af()) && !aazaVar.g) {
                    return;
                }
                abgeVar5.T = !Objects.equals(aazaVar.d, aazaVar.a) ? Optional.of(aazaVar) : Optional.empty();
                abgeVar5.m();
                if (abmtVar == null || !abmtVar.aH()) {
                    return;
                }
                abgeVar5.n();
                return;
            case 6:
                if (((aayt) obj).a == abnv.g) {
                    ((abge) ((aber) this.a).a).j(new abgi(abgh.f, false));
                    return;
                }
                return;
            case 7:
                Object[] objArr = (Object[]) obj;
                acip acipVar = (acip) objArr[0];
                zhz zhzVar = (zhz) objArr[1];
                String strAu = acipVar.au();
                if (strAu != null) {
                    abgp abgpVar = (abgp) ((abgb) this.a).a;
                    if (abgpVar.z) {
                        ((List) Map.EL.computeIfAbsent(abgpVar.y, strAu, new aalr(13))).add(zhzVar);
                        return;
                    } else {
                        ((List) Map.EL.computeIfAbsent(abgpVar.y, strAu, new aalr(14))).add(zhzVar);
                        return;
                    }
                }
                return;
            case 8:
                String strA = ((aazs) obj).a();
                if (strA != null) {
                    ((abgp) ((abgb) this.a).a).y.remove(strA);
                    return;
                }
                return;
            case 9:
                ((abgo) this.a).onVideoStage((aazj) obj);
                return;
            case 10:
                ((abgo) this.a).onFormatStreamChange((yvu) obj);
                return;
            case 11:
                ((abgu) this.a).a((aazj) obj);
                return;
            case 12:
                ((abgu) this.a).handlePlaybackRateChangedEvent((aaxh) obj);
                return;
            case 13:
                ((abgx) this.a).handleSequencerHasPreviousNextEvent((aayv) obj);
                return;
            case 14:
                ((abhe) this.a).handlePlayerGeometryEvent((aaxo) obj);
                return;
            case 15:
                ((abhe) this.a).handleSubtitleTrackChangedEvent((aazb) obj);
                return;
            case 16:
                acip acipVar2 = ((aazq) obj).b;
                abgz abgzVar = ((abhe) this.a).i;
                acil acilVarBr = acipVar2.br();
                if (abgzVar.c != acilVarBr) {
                    abgzVar.c = acilVarBr;
                    acca accaVar = abgzVar.b;
                    if (accaVar == null || (acanVar = abgzVar.a) == null) {
                        return;
                    }
                    abgzVar.c.a(accaVar, acanVar);
                    return;
                }
                return;
            case 17:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj3 = this.a;
                abha abhaVar = zBooleanValue ? ((abhe) obj3).i : ((abhe) obj3).j;
                abhe abheVar = (abhe) obj3;
                abha abhaVar2 = abheVar.k;
                if (abhaVar2 != abhaVar) {
                    abhaVar2.g();
                    abheVar.k = abhaVar;
                    abheVar.k.h(abheVar.d);
                    return;
                }
                return;
            case 18:
                ((abhe) this.a).f();
                return;
            case 19:
                aazn aaznVar2 = (aazn) obj;
                String str = aaznVar2.b;
                abhe abheVar2 = (abhe) this.a;
                abheVar2.h = str;
                if (aaznVar2.a != 7 || abheVar2.a.S()) {
                    return;
                }
                abheVar2.k(abheVar2.d);
                return;
            default:
                if (((aaxj) obj).c.equals(appa.SEEK_SOURCE_ANDROID_CLEAR_BUFFER)) {
                    abhe abheVar3 = (abhe) this.a;
                    abheVar3.l.f();
                    abheVar3.k.c();
                    return;
                }
                return;
        }
    }
}
