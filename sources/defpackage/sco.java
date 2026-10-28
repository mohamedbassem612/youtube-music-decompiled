package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Predicate$CC;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sco implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ sco(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo841negate() {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.$cid) {
            case 0:
                aizs aizsVar = ((snl) obj).b;
                aixr aixrVarA = aixr.a(aizsVar.e);
                if (aixrVarA == null) {
                    aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
                }
                if (aixrVarA == aixr.TRIGGER_TYPE_SLOT_ID_ENTERED) {
                    if (TextUtils.equals((aizsVar.b == 3 ? (aqan) aizsVar.c : aqan.a).b, this.a)) {
                        return true;
                    }
                }
                break;
            case 1:
                sbo sboVar = (sbo) obj;
                if (((String) this.a).equals(sboVar.a)) {
                    ListenableFuture listenableFuture = sboVar.b;
                    if (listenableFuture == null) {
                        return true;
                    }
                    listenableFuture.cancel(false);
                    return true;
                }
                break;
            case 2:
                aizs aizsVar2 = ((snl) obj).b;
                aixr aixrVarA2 = aixr.a(aizsVar2.e);
                if (aixrVarA2 == null) {
                    aixrVarA2 = aixr.TRIGGER_TYPE_UNSPECIFIED;
                }
                if (aixrVarA2 == aixr.TRIGGER_TYPE_SLOT_ID_EXITED) {
                    if (TextUtils.equals((aizsVar2.b == 8 ? (aqao) aizsVar2.c : aqao.a).b, this.a)) {
                        return true;
                    }
                }
                break;
            case 3:
                snl snlVar = (snl) obj;
                aizs aizsVar3 = snlVar.b;
                aixr aixrVarA3 = aixr.a(aizsVar3.e);
                if (aixrVarA3 == null) {
                    aixrVarA3 = aixr.TRIGGER_TYPE_UNSPECIFIED;
                }
                if (aixrVarA3 == aixr.TRIGGER_TYPE_ON_NEXT_SLOT_ENTER_REQUESTED) {
                    smr smrVar = (smr) this.a;
                    if (!TextUtils.equals(smrVar.a, snlVar.c.a)) {
                        aixo aixoVarC = smrVar.c();
                        Iterator<E> it = new aihx((aizsVar3.b == 30 ? (aoiq) aizsVar3.c : aoiq.b).c, aoiq.a).iterator();
                        while (it.hasNext()) {
                            if (aixoVarC == ((aixo) it.next())) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 4:
                aivt aivtVar = (aivt) obj;
                agqs agqsVarListIterator = ((agke) this.a).listIterator(0);
                while (agqsVarListIterator.hasNext()) {
                    aixo aixoVar = (aixo) agqsVarListIterator.next();
                    aivs aivsVar = aivtVar.c;
                    if (aivsVar == null) {
                        aivsVar = aivs.a;
                    }
                    aixo aixoVarA = aixo.a(aivsVar.d);
                    if (aixoVarA == null) {
                        aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                    }
                    if (aixoVarA.equals(aixoVar)) {
                        return true;
                    }
                }
                break;
            case 5:
                aivt aivtVar2 = (aivt) obj;
                if (aivtVar2 != null) {
                    aivs aivsVar2 = aivtVar2.c;
                    if (aivsVar2 == null) {
                        aivsVar2 = aivs.a;
                    }
                    aixo aixoVarA2 = aixo.a(aivsVar2.d);
                    if (aixoVarA2 == null) {
                        aixoVarA2 = aixo.SLOT_TYPE_UNSPECIFIED;
                    }
                    if (this.a.contains(aixoVarA2)) {
                        return true;
                    }
                }
                break;
            case 6:
                sko skoVar = (sko) obj;
                if (skoVar.e(sjb.class)) {
                    slb slbVar = (slb) skoVar.d(sjb.class);
                    if (slbVar.A() && (!taq.aA((vyo) ((aehs) this.a).b) || slbVar.iJ() == 0)) {
                        return true;
                    }
                }
                break;
            case 7:
                aizs aizsVar4 = (aizs) obj;
                int i = aizsVar4.b;
                if (i != 7) {
                    return true;
                }
                aqac aqacVar = i == 7 ? (aqac) aizsVar4.c : aqac.a;
                ?? r5 = this.a;
                String str = aqacVar.b;
                for (sko skoVar2 : r5) {
                    if (skoVar2.a.equals(str) && skoVar2.e(sjb.class) && smc.av(((slb) skoVar2.d(sjb.class)).iJ())) {
                        break;
                    }
                }
                return true;
            case 8:
                return ((sko) this.a).e((Class) obj);
            case 9:
                return ((smr) this.a).e((Class) obj);
            case 10:
                qvu qvuVar = (qvu) obj;
                agrf agrfVar = uld.a;
                if (qvuVar.m.equals(((quh) this.a).a) && (qvuVar instanceof qvq)) {
                    return true;
                }
                break;
            case 11:
                augy augyVar = (augy) obj;
                augz augzVar = augyVar.c == 109 ? (augz) augyVar.d : augz.a;
                return (augzVar.b == 1 ? (auhk) augzVar.c : auhk.a).c.equals(((Uri) this.a).toString());
            case 12:
                auak auakVar = ((uqn) this.a).a;
                auak auakVar2 = (auak) obj;
                if (xsc.Q(auakVar2, auakVar) && auakVar2.g == auakVar.g) {
                    return true;
                }
                break;
            case 13:
                auak auakVar3 = ((uqn) this.a).a;
                auak auakVar4 = (auak) obj;
                if (xsc.Q(auakVar4, auakVar3) && auakVar4.g == auakVar3.g) {
                    return true;
                }
                break;
            case 14:
                agrf agrfVar2 = usj.a;
                return ((agkz) this.a).contains(Long.valueOf(((augy) obj).e));
            case 15:
                agrf agrfVar3 = usj.a;
                arfu arfuVarA = arfu.a(((auhr) obj).b);
                if (arfuVarA == null) {
                    arfuVarA = arfu.VOLUME_TYPE_UNKNOWN;
                }
                if (arfuVarA == this.a) {
                    return true;
                }
                break;
            case 16:
                agrf agrfVar4 = usj.a;
                if (((augy) this.a).e != ((augy) obj).e) {
                    return true;
                }
                break;
            case 17:
                agrf agrfVar5 = usj.a;
                if (((aufa) this.a).e != ((aufa) obj).e) {
                    return true;
                }
                break;
            case 18:
                agrf agrfVar6 = usj.a;
                return ((agkz) this.a).contains(Long.valueOf(((augy) obj).e));
            case 19:
                agrf agrfVar7 = usj.a;
                if (!((agkz) this.a).contains(Long.valueOf(((augy) obj).e))) {
                    return true;
                }
                break;
            default:
                File file = (File) obj;
                Object obj2 = this.a;
                try {
                    if (file.getCanonicalPath().startsWith(((String) obj2) + File.separator) && file.exists() && file.canRead()) {
                        return true;
                    }
                } catch (IOException unused) {
                }
                break;
        }
        return false;
    }
}
