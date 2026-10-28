package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hge implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hge(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v35, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v47, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                hgf hgfVar = (hgf) ((hfb) this.a).a;
                ((hwm) hgfVar.e.io()).c((aima) obj);
                ((aceo) hgfVar.d.io()).i();
                break;
            case 1:
                ((wsi) this.a).d = (aigj) obj;
                break;
            case 2:
                aunn aunnVar = (aunn) obj;
                if (!((hgy) this.a).r()) {
                    ((acdo) aunnVar.io()).d();
                } else {
                    ((acdo) aunnVar.io()).c();
                }
                break;
            case 3:
                aunn aunnVar2 = (aunn) obj;
                if (!((hgy) this.a).r()) {
                    ((acdo) aunnVar2.io()).d();
                } else {
                    ((acdo) aunnVar2.io()).c();
                }
                break;
            case 4:
                annv annvVar = (annv) ((weh) obj);
                Stream streamConcat = Stream.CC.concat(Collection.EL.stream(annvVar.g()), Collection.EL.stream(annvVar.e()));
                Object obj2 = this.a;
                streamConcat.forEach(new gmk(obj2, 16));
                Stream.CC.concat(Collection.EL.stream(annvVar.j()), Collection.EL.stream(annvVar.i())).forEach(new gmk(obj2, 17));
                break;
            case 5:
                anqt anqtVar = (anqt) obj;
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                asch aschVar = (asch) aihfVar.instance;
                asch aschVar2 = asch.a;
                anqtVar.getClass();
                aschVar.j = anqtVar;
                aschVar.b |= 32;
                break;
            case 6:
                anqt anqtVar2 = (anqt) obj;
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                asce asceVar = (asce) aihfVar2.instance;
                asce asceVar2 = asce.a;
                anqtVar2.getClass();
                asceVar.i = anqtVar2;
                asceVar.b |= 32;
                break;
            case 7:
                ((anui) this.a).an((aqmh) obj);
                break;
            case 8:
                this.a.invoke(obj);
                break;
            case 9:
                ((hot) this.a).p(obj);
                break;
            case 10:
                this.a.add((hcg) obj);
                break;
            case 11:
                ((aqpf) this.a).aq((aqpe) obj);
                break;
            case 12:
                hqg hqgVar = (hqg) this.a;
                wer werVar = (wer) obj;
                if (!((vxz) hqgVar.h.io()).l(60, 45385690L, false)) {
                    hqgVar.h(werVar);
                    hqg.o(werVar);
                } else {
                    ahno.at(hqgVar.a(werVar), new hfb(werVar, 5), hqgVar.i);
                }
                break;
            case 13:
                ((hry) this.a).b((anvi) obj);
                break;
            case 14:
                this.a.add((aamo) obj);
                break;
            case 15:
                this.a.invoke(obj);
                break;
            case 16:
                this.a.put(hui.a, agke.q(obj));
                break;
            case 17:
                this.a.add((hcg) obj);
                break;
            case 18:
                ankz ankzVar = (ankz) obj;
                agrf agrfVar = hur.a;
                aihf aihfVarCreateBuilder = anwv.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                anwv anwvVar = (anwv) aihfVarCreateBuilder.instance;
                ankzVar.getClass();
                anwvVar.f = ankzVar;
                anwvVar.b |= 2097152;
                ((aihf) this.a).bR(aihfVarCreateBuilder);
                break;
            case 19:
                ankz ankzVar2 = (ankz) obj;
                agrf agrfVar2 = hur.a;
                aihf aihfVarCreateBuilder2 = anwv.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                anwv anwvVar2 = (anwv) aihfVarCreateBuilder2.instance;
                ankzVar2.getClass();
                anwvVar2.f = ankzVar2;
                anwvVar2.b |= 2097152;
                ((aihf) this.a).bR(aihfVarCreateBuilder2);
                break;
            default:
                ((aihf) this.a).bQ((apji) obj);
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
