package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aawi implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aawi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xhy] */
    /* JADX WARN: Type inference failed for: r5v21, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, xgn] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        String str;
        String strG;
        abdx abdxVar;
        int i;
        switch (this.$cid) {
            case 0:
                ((aawj) this.a).d();
                break;
            case 1:
                ((aawf) this.a).c();
                break;
            case 2:
                ((aawj) this.a).d();
                break;
            case 3:
                ((aawj) this.a).c((aaxw) obj);
                break;
            case 4:
                ((aawj) this.a).b((aaxz) obj);
                break;
            case 5:
                ((aawj) this.a).b((aaxv) obj);
                break;
            case 6:
                acip acipVar = ((aazq) obj).b;
                trd trdVar = ((aawk) this.a).a.h;
                String strAu = acipVar.au();
                if (strAu != null) {
                    trdVar.l = strAu;
                }
                wjf wjfVarF = acipVar.f();
                if (wjfVarF != null && !wjfVarF.G().isEmpty()) {
                    trdVar.m = wjfVarF.G();
                    break;
                }
                break;
            case 7:
                aazj aazjVar = (aazj) obj;
                wjf wjfVar = aazjVar.b;
                if (aazjVar.a == abob.c && (str = aazjVar.g) != null && wjfVar != null) {
                    trd trdVar2 = ((aawk) this.a).a.h;
                    trdVar2.k = str;
                    if (!wjfVar.G().isEmpty() && (strG = wjfVar.G()) != null) {
                        trdVar2.n = strG;
                        break;
                    }
                }
                break;
            case 8:
                this.a.invoke(obj);
                break;
            case 9:
                this.a.invoke(obj);
                break;
            case 10:
                ((abbd) this.a).c((aazj) obj);
                break;
            case 11:
                ((abbd) this.a).handleYouTubePlayerStateEvent((aazn) obj);
                break;
            case 12:
                aazj aazjVar2 = (aazj) obj;
                String str2 = aazjVar2.g;
                abdi abdiVar = (abdi) this.a;
                abdiVar.e = str2;
                if (abdiVar.f != abdy.a) {
                    if (!abdiVar.b || (aazjVar2.c != null && aazjVar2.h != null)) {
                        abjf abjfVar = abdiVar.h;
                        wjf wjfVar2 = aazjVar2.c;
                        String str3 = aazjVar2.h;
                        if (wjfVar2 != null && !TextUtils.isEmpty(str3)) {
                            Set set = abjfVar.a;
                            if (!set.contains(ByteBuffer.wrap(wjfVar2.ab()))) {
                                ?? r2 = abjfVar.b;
                                if (!TextUtils.isEmpty(str3)) {
                                    ?? r5 = abjfVar.b;
                                    xgz xgzVarA = aawo.a(null);
                                    if (xgzVarA == null) {
                                        r5.r(str3);
                                    } else {
                                        r5.s(xgzVarA, str3);
                                    }
                                }
                                xgj xgjVar = new xgj(wjfVar2.ab());
                                xgz xgzVarA2 = aawo.a(null);
                                if (xgzVarA2 != null) {
                                    r2.e(xgjVar, xgzVarA2);
                                } else {
                                    r2.d(xgjVar);
                                }
                                set.add(ByteBuffer.wrap(wjfVar2.ab()));
                            }
                            break;
                        }
                    }
                }
                break;
            case 13:
                abdi abdiVar2 = (abdi) this.a;
                aayw aaywVar = (aayw) obj;
                if (!abdiVar2.a && (abdxVar = abdiVar2.c) != null) {
                    abdxVar.b(aaywVar);
                    break;
                }
                break;
            case 14:
                abdx abdxVar2 = ((abdi) this.a).c;
                if (abdxVar2 != null) {
                    abdxVar2.a();
                }
                break;
            case 15:
                ((aber) this.a).handleVideoStageEvent((aazj) obj);
                break;
            case 16:
                ((aber) this.a).a((aazk) obj);
                break;
            case 17:
                ((aber) this.a).handlePlayerGeometryEvent((aaxo) obj);
                break;
            case 18:
                ((abfv) this.a).handleFormatStreamChangeEvent((yvu) obj);
                break;
            case 19:
                ((abge) this.a).y.v(((abfq) obj).a);
                break;
            default:
                Pair pair = (Pair) obj;
                if (pair.second != null) {
                    Object obj2 = this.a;
                    acip acipVar2 = (acip) pair.first;
                    aboe aboeVar = (aboe) pair.second;
                    if (!(acipVar2 == null || acipVar2.f() == null || aaje.l(acipVar2.f().t()) == null) || (i = aboeVar.j) == 16) {
                        ((abge) ((aber) obj2).a).j(new abgi(abgh.f, false));
                    } else if (aawb.B(i)) {
                        abge abgeVar = (abge) ((aber) obj2).a;
                        abgeVar.H = true;
                        aoqp aoqpVar = aboeVar.f;
                        if (aoqpVar != null) {
                            abfz abfzVar = abgeVar.y;
                            boolean z = aboeVar.a;
                            abfzVar.R(aoqpVar);
                        } else {
                            abfz abfzVar2 = abgeVar.y;
                            String str4 = aboeVar.c;
                            boolean z2 = aboeVar.a;
                            abfzVar2.P();
                        }
                    }
                }
                break;
        }
    }
}
