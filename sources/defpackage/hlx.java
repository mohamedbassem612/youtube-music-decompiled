package defpackage;

import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hlx implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hlx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
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
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object, wbz] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 4;
        char c = 1;
        switch (this.$cid) {
            case 0:
                Optional optional = ((imi) obj).b;
                Object obj2 = this.a;
                agke agkeVar = hlz.a;
                return (Integer) optional.orElse(Integer.valueOf(((anuk) obj2).getTrackCount().intValue()));
            case 1:
                ajwo ajwoVar = (ajwo) obj;
                gnf gnfVar = (gnf) this.a;
                return ((gnfVar.J.l(27, 45722447L, false) || gnfVar.K.l(53, 45785910L, false)) && kro.ah(ajwoVar).c.equals("FEmusic_home")) ? Boolean.TRUE : Boolean.valueOf(!gnfVar.A());
            case 2:
                String strAH = kro.aH((String) this.a);
                agjz agjzVar = new agjz(4);
                annv annvVar = (annv) ((weh) obj);
                if (annvVar.h().contains(strAH)) {
                    agjzVar.h("PPSV");
                }
                if (annvVar.f().contains(strAH)) {
                    agjzVar.h("PPSE");
                }
                if (annvVar.k().contains(strAH)) {
                    agjzVar.h("PPSDST");
                }
                return agjzVar.g();
            case 3:
                annv annvVar2 = (annv) ((weh) obj);
                List listH = annvVar2.h();
                Object obj3 = this.a;
                return Boolean.valueOf((listH.contains(obj3) || annvVar2.f().contains(obj3)) ? false : true);
            case 4:
                annv annvVar3 = (annv) ((weh) obj);
                List list = (List) Stream.CC.concat(Collection.EL.stream(annvVar3.g()), Collection.EL.stream(annvVar3.e())).map(new hnv(3)).collect(aghu.a);
                hoe hoeVar = (hoe) this.a;
                return ahno.ar(hoeVar.a.m(list, false), new hdn(18), hoeVar.b);
            case 5:
                jnm jnmVar = (jnm) this.a;
                anym anymVarL = jnmVar.l((aamo) obj);
                jnmVar.a.e(jnmVar.d.e());
                return anymVarL.am();
            case 6:
                return ((jnm) this.a).n((aamo) obj);
            case 7:
                agrf agrfVar = hur.a;
                return (agke) Collection.EL.stream((agke) obj).filter(new gnh(this.a, 20)).collect(aghu.a);
            case 8:
                hyz hyzVar = (hyz) ((abiy) obj).a;
                ((iby) this.a).p(hyzVar);
                return hyzVar;
            case 9:
                abiy abiyVar = (abiy) obj;
                ((iby) this.a).p((hyz) abiyVar.a);
                return Integer.valueOf(abiyVar.b);
            case 10:
                return ((ihs) this.a).a((amlg) obj);
            case 11:
                ArrayList arrayList = new ArrayList();
                annv annvVar4 = (annv) ((weh) obj);
                arrayList.addAll(annvVar4.g());
                arrayList.addAll(annvVar4.j());
                arrayList.addAll(annvVar4.e());
                arrayList.addAll(annvVar4.i());
                return ((ixd) this.a).e.m((List) Collection.EL.stream(arrayList).map(new ixa(c == true ? 1 : 0)).collect(Collectors.toList()), false);
            case 12:
                return ((xsc) this.a).ag((qyv) obj);
            case 13:
                ahgb ahgbVar = (ahgb) this.a;
                apsd apsdVar = (apsd) rbh.b.b(ahgbVar.e);
                Optional optionalOf = Optional.of((apsc) rbh.a.b(ahgbVar.d));
                aihf aihfVarCreateBuilder = aske.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aske askeVar = (aske) aihfVarCreateBuilder.instance;
                askeVar.c = ((anck) ahgbVar.b).h;
                askeVar.b |= 1;
                return ((aczl) obj).p(apsdVar, optionalOf, (Optional) ahgbVar.a, (aske) aihfVarCreateBuilder.build());
            case 14:
                Optional optionalA = ((rbs) obj).a();
                ahgb ahgbVar2 = ((rdr) this.a).K;
                hqb hqbVar = new hqb(ahgbVar2, optionalA, i);
                Optional optional2 = (Optional) ahgbVar2.c;
                optional2.isPresent();
                Object obj4 = hqbVar.a;
                Object obj5 = hqbVar.b;
                ahgb ahgbVar3 = (ahgb) obj4;
                return Optional.ofNullable(((aczl) optional2.get()).q((apsd) rbh.b.b(ahgbVar3.e), Optional.of((apsc) rbh.a.b(ahgbVar3.d)), (Optional) obj5));
            case 15:
                return ((rdr) this.a).v((Duration) obj);
            case 16:
                Duration duration = rec.a;
                return ((reo) obj).iw((Duration) this.a);
            case 17:
                Duration duration2 = rec.a;
                return ((reo) obj).iw((Duration) this.a);
            case 18:
                Duration duration3 = rec.a;
                return ((reo) obj).iw((Duration) this.a);
            case 19:
                Duration duration4 = rec.a;
                return ((reo) obj).iw((Duration) this.a);
            default:
                rbm rbmVar = rhg.p;
                return ((Optional) this.a).get();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
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
        return Function$CC.$default$compose(this, function);
    }
}
