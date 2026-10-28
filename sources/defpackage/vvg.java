package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vvg implements axp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vvg(Object obj, String str, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = str;
    }

    @Override // defpackage.axp
    public final Object a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            vsw vswVar = (vsw) obj;
            aihf builder = vswVar.toBuilder();
            builder.copyOnWrite();
            ((vsw) builder.instance).b = vsw.emptyProtobufList();
            Stream stream = Collection.EL.stream(vswVar.b);
            String str = this.a;
            builder.ae((Iterable) stream.filter(new uso(str, 13)).collect(Collectors.toCollection(new ieu(17))));
            aihf builder2 = ((aihn) this.b).toBuilder();
            builder2.copyOnWrite();
            vsv vsvVar = (vsv) builder2.instance;
            str.getClass();
            vsvVar.b |= 1;
            vsvVar.c = str;
            builder.copyOnWrite();
            vsw vswVar2 = (vsw) builder.instance;
            vsv vsvVar2 = (vsv) builder2.build();
            vsvVar2.getClass();
            vswVar2.a();
            vswVar2.b.add(vsvVar2);
            vsw vswVar3 = (vsw) builder.build();
            if (vswVar3.b.size() <= 8) {
                return vswVar3;
            }
            aiie aiieVar = vswVar3.b;
            List listSubList = aiieVar.subList(aiieVar.size() - 8, vswVar3.b.size());
            aihf builder3 = vswVar3.toBuilder();
            builder3.copyOnWrite();
            ((vsw) builder3.instance).b = vsw.emptyProtobufList();
            builder3.ae(listSubList);
            return (vsw) builder3.build();
        }
        if (i == 1) {
            aihf builder4 = ((ailp) obj).toBuilder();
            aihf aihfVarCreateBuilder = ailo.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ailo ailoVar = (ailo) aihfVarCreateBuilder.instance;
            ailoVar.b |= 1;
            String str2 = this.a;
            ailoVar.c = str2;
            aihfVarCreateBuilder.copyOnWrite();
            ailo ailoVar2 = (ailo) aihfVarCreateBuilder.instance;
            ailoVar2.d = ((ailn) this.b).getNumber();
            ailoVar2.b |= 2;
            ailo ailoVar3 = (ailo) aihfVarCreateBuilder.build();
            ailoVar3.getClass();
            builder4.copyOnWrite();
            ailp ailpVar = (ailp) builder4.instance;
            aiip aiipVar = ailpVar.b;
            if (!aiipVar.b) {
                ailpVar.b = aiipVar.a();
            }
            ailpVar.b.put(str2, ailoVar3);
            return (ailp) builder4.build();
        }
        if (i != 2) {
            aihf builder5 = ((arkk) obj).toBuilder();
            Object obj2 = this.b;
            obj2.getClass();
            String str3 = this.a;
            str3.getClass();
            builder5.copyOnWrite();
            ((arkk) builder5.instance).a().put(obj2, str3);
            return (arkk) builder5.build();
        }
        aihf builder6 = ((abwt) obj).toBuilder();
        Object obj3 = this.b;
        if (obj3 != null) {
            Optional optional = (Optional) obj3;
            if (optional.isEmpty()) {
                builder6.copyOnWrite();
                abwt abwtVar = (abwt) builder6.instance;
                abwtVar.b &= -2;
                abwtVar.c = false;
            } else {
                boolean zBooleanValue = ((Boolean) optional.get()).booleanValue();
                builder6.copyOnWrite();
                abwt abwtVar2 = (abwt) builder6.instance;
                abwtVar2.b |= 1;
                abwtVar2.c = zBooleanValue;
            }
        }
        String str4 = this.a;
        if (str4 != null) {
            if (str4.isEmpty()) {
                builder6.copyOnWrite();
                abwt abwtVar3 = (abwt) builder6.instance;
                abwtVar3.b &= -3;
                abwtVar3.d = abwt.a.d;
            } else {
                builder6.copyOnWrite();
                abwt abwtVar4 = (abwt) builder6.instance;
                abwtVar4.b |= 2;
                abwtVar4.d = str4;
            }
        }
        return (abwt) builder6.build();
    }

    public /* synthetic */ vvg(String str, Object obj, int i) {
        this.$cid = i;
        this.a = str;
        this.b = obj;
    }
}
