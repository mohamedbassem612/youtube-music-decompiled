package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.api.innertube.AssetDetail;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class urh implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ urh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v29, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v61, types: [java.lang.Object, vsq] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        adxd adxdVar;
        ListenableFuture listenableFutureG;
        switch (this.$cid) {
            case 0:
                ((agjz) this.a).h((uqn) obj);
                break;
            case 1:
                akgw akgwVar = (akgw) obj;
                if ((akgwVar.b & 2) != 0) {
                    aihf aihfVarCreateBuilder = aual.a.createBuilder();
                    akgu akguVar = akgwVar.d;
                    if (akguVar == null) {
                        akguVar = akgu.a;
                    }
                    if ((akguVar.b & 2) != 0) {
                        akgu akguVar2 = akgwVar.d;
                        if (akguVar2 == null) {
                            akguVar2 = akgu.a;
                        }
                        int i = akguVar2.d;
                        aihfVarCreateBuilder.copyOnWrite();
                        aual aualVar = (aual) aihfVarCreateBuilder.instance;
                        aualVar.b |= 1;
                        aualVar.c = i;
                    }
                    akgu akguVar3 = akgwVar.d;
                    if (((akguVar3 == null ? akgu.a : akguVar3).b & 1) != 0) {
                        if (akguVar3 == null) {
                            akguVar3 = akgu.a;
                        }
                        float f = akguVar3.c;
                        aihfVarCreateBuilder.copyOnWrite();
                        aual aualVar2 = (aual) aihfVarCreateBuilder.instance;
                        aualVar2.b |= 2;
                        aualVar2.d = f;
                    }
                    aihf aihfVar = (aihf) this.a;
                    aihfVar.copyOnWrite();
                    auak auakVar = (auak) aihfVar.instance;
                    aual aualVar3 = (aual) aihfVarCreateBuilder.build();
                    auak auakVar2 = auak.a;
                    aualVar3.getClass();
                    auakVar.h = aualVar3;
                    auakVar.b |= 32;
                }
                break;
            case 2:
                usr usrVar = (usr) obj;
                ((usd) this.a).h(new uug(agke.q(new ury(usrVar.a, usrVar.b)), 0));
                break;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                aufw aufwVar = (aufw) aihfVar2.instance;
                aufw aufwVar2 = aufw.a;
                aufwVar.b |= 2;
                aufwVar.d = jLongValue;
                break;
            case 4:
                auho auhoVar = (auho) obj;
                Object obj2 = this.a;
                ((aihf) obj2).copyOnWrite();
                augy augyVar = (augy) ((jrr) obj2).instance;
                augy augyVar2 = augy.a;
                auhoVar.getClass();
                augyVar.l = auhoVar;
                augyVar.b |= SemanticState.Focused;
                break;
            case 5:
                double dDoubleValue = ((Double) obj).doubleValue();
                Object obj3 = this.a;
                ((aihf) obj3).copyOnWrite();
                augy augyVar3 = (augy) ((jrr) obj3).instance;
                augy augyVar4 = augy.a;
                augyVar3.b |= SemanticState.ReadOnly;
                augyVar3.o = dDoubleValue;
                break;
            case 6:
                aigj aigjVar = (aigj) obj;
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                AssetDetail assetDetail = (AssetDetail) aihfVar3.instance;
                AssetDetail assetDetail2 = AssetDetail.a;
                aigjVar.getClass();
                assetDetail.b |= 32;
                assetDetail.e = aigjVar;
                break;
            case 7:
                ((vzq) this.a).a((zwa) obj);
                break;
            case 8:
                zwa zwaVar = (zwa) obj;
                if (zwaVar.d()) {
                    ((tyt) this.a).e("pageId", zwaVar.l());
                }
                break;
            case 9:
                this.a.invoke(obj);
                break;
            case 10:
                aigj aigjVar2 = (aigj) obj;
                aihf aihfVar4 = (aihf) this.a;
                aihfVar4.copyOnWrite();
                AssetDetail assetDetail3 = (AssetDetail) aihfVar4.instance;
                AssetDetail assetDetail4 = AssetDetail.a;
                aigjVar2.getClass();
                assetDetail3.b |= 32;
                assetDetail3.e = aigjVar2;
                break;
            case 11:
                ((vfs) this.a).d.c(((Float) obj).floatValue(), arfu.VOLUME_TYPE_ADDED_MUSIC);
                break;
            case 12:
                ((vfs) this.a).d.c(((Float) obj).floatValue(), arfu.VOLUME_TYPE_ADDED_MUSIC);
                break;
            case 13:
                aqpj aqpjVar = (aqpj) obj;
                aihf aihfVar5 = (aihf) this.a;
                aihfVar5.copyOnWrite();
                akqy akqyVar = (akqy) aihfVar5.instance;
                akqy akqyVar2 = akqy.a;
                aqpjVar.getClass();
                aiie aiieVar = akqyVar.j;
                if (!aiieVar.c()) {
                    akqyVar.j = aihn.mutableCopy(aiieVar);
                }
                akqyVar.j.add(aqpjVar);
                break;
            case 14:
                vmb.aE((fhd) this.a, (vmd) obj);
                break;
            case 15:
                vmb.aE((fhd) this.a, (vmd) obj);
                break;
            case 16:
                ((ahgb) obj).ai((Throwable) this.a);
                break;
            case 17:
                ((RecyclerView) ((avju) this.a).a).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) obj);
                break;
            case 18:
                avju avjuVar = (avju) obj;
                apoq apoqVar = (apoq) this.a;
                avjuVar.b((apoqVar.c & 1048576) != 0 ? apoqVar.q : 0.0f);
                break;
            case 19:
                this.a.a();
                break;
            default:
                Object obj4 = this.a;
                String str = (String) obj;
                vqs vqsVar = (vqs) obj4;
                vqsVar.g = str;
                abxv abxvVar = (abxv) vqsVar.f.get();
                int i2 = 5;
                byte[] bArr = null;
                if (((vxz) abxvVar.c).l(372, 45812899L, false)) {
                    xpl xplVar = (xpl) abxvVar.b.remove(str);
                    if (xplVar == null) {
                        adxdVar = null;
                    } else if (abxv.t((vsv) xplVar.b)) {
                        listenableFutureG = ahng.n(Optional.of(xplVar));
                    } else {
                        twu.c(5, "Dropping invalid EngagementPanelSavedState.", null);
                        listenableFutureG = ahng.n(Optional.empty());
                    }
                    taf.l(vqsVar.e, listenableFutureG, new jco(19), new uny(obj4, 13));
                } else {
                    ?? r1 = abxvVar.d;
                    Optional optionalFindFirst = Collection.EL.stream(r1).filter(new uso(str, 17)).findFirst();
                    if (true == optionalFindFirst.isPresent()) {
                        optionalFindFirst = Optional.ofNullable(((vvi) optionalFindFirst.get()).b);
                    }
                    adxdVar = (adxd) optionalFindFirst.orElse(null);
                    Collection.EL.removeIf(r1, new uso(str, 14));
                }
                listenableFutureG = afxd.f(((abxv) abxvVar.a).u()).h(new oly(i2), MoreExecutors.directExecutor()).g(new tvm(str, adxdVar, 9, bArr), MoreExecutors.directExecutor());
                taf.l(vqsVar.e, listenableFutureG, new jco(19), new uny(obj4, 13));
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
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
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
