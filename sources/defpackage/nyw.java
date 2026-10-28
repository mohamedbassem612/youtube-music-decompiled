package defpackage;

import android.util.Size;
import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nyw implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nyw(Object obj, Object obj2, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        int i = this.$cid;
        if (i == 0) {
            return Function$CC.$default$andThen(this, function);
        }
        if (i != 1) {
            return i != 2 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x021a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0240  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, wbz] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object obj2;
        nzq nzqVarA;
        agke agkeVarG;
        boolean z;
        int i = this.$cid;
        if (i == 0) {
            nyy nyyVar = (nyy) obj;
            agjz agjzVar = new agjz(4);
            if (nyyVar.a == 0 && nyyVar.b == 0) {
                agkeVarG = agjzVar.g();
            } else {
                if (this.a) {
                    obj2 = this.c;
                    nzqVarA = nzr.a();
                    nzqVarA.b(nyyVar.a);
                    nzqVarA.n = Integer.valueOf(nyyVar.b);
                    nzqVarA.c(agkz.n(nyyVar.c));
                    nzqVarA.a = Boolean.valueOf(nyyVar.d);
                    if (obj2 != null) {
                        nzk nzkVar = (nzk) obj2;
                        nzqVarA.l = Integer.valueOf(nzkVar.b);
                        nzqVarA.m = nzkVar.c;
                    }
                    nzp nzpVar = new nzp();
                    nzpVar.b(nyyVar.e.x);
                    nzpVar.a = Long.valueOf(nyyVar.f);
                    nzpVar.b = Long.valueOf(nyyVar.g);
                    nzpVar.e = nzqVarA.a();
                    agjzVar.h(nzpVar.a());
                } else {
                    if (((nyz) this.b).i.a(nyyVar.e)) {
                        obj2 = this.c;
                        nzqVarA = nzr.a();
                        nzqVarA.b(nyyVar.a);
                        nzqVarA.n = Integer.valueOf(nyyVar.b);
                        nzqVarA.c(agkz.n(nyyVar.c));
                        nzqVarA.a = Boolean.valueOf(nyyVar.d);
                        if (obj2 != null) {
                            nzk nzkVar2 = (nzk) obj2;
                            nzqVarA.l = Integer.valueOf(nzkVar2.b);
                            nzqVarA.m = nzkVar2.c;
                        }
                        nzp nzpVar2 = new nzp();
                        nzpVar2.b(nyyVar.e.x);
                        nzpVar2.a = Long.valueOf(nyyVar.f);
                        nzpVar2.b = Long.valueOf(nyyVar.g);
                        nzpVar2.e = nzqVarA.a();
                        agjzVar.h(nzpVar2.a());
                    }
                }
                agkeVarG = agjzVar.g();
            }
            return Collection.EL.stream(agkeVarG);
        }
        int i2 = 5;
        if (i == 1) {
            aamo aamoVar = (aamo) this.c.get((String) obj);
            Object obj3 = this.b;
            if (!this.a) {
                Optional optionalOfNullable = Optional.ofNullable(aamoVar);
                Object obj4 = ((jan) obj3).e;
                obj4.getClass();
                hlx hlxVar = new hlx(obj4, 6);
                if (true == optionalOfNullable.isPresent()) {
                    return Optional.ofNullable(((jnm) hlxVar.a).n((aamo) optionalOfNullable.get()));
                }
                return optionalOfNullable;
            }
            Optional optionalOfNullable2 = Optional.ofNullable(aamoVar);
            Object obj5 = ((jan) obj3).e;
            obj5.getClass();
            hlx hlxVar2 = new hlx(obj5, i2);
            if (true != optionalOfNullable2.isPresent()) {
                return optionalOfNullable2;
            }
            Object obj6 = optionalOfNullable2.get();
            jnm jnmVar = (jnm) hlxVar2.a;
            anym anymVarL = jnmVar.l((aamo) obj6);
            jnmVar.a.e(jnmVar.d.e());
            return Optional.ofNullable(anymVarL.am());
        }
        if (i != 2) {
            augy augyVar = (augy) obj;
            if (!this.a) {
                return augyVar;
            }
            if (((agkz) this.c).contains(Long.valueOf(augyVar.e)) || (augyVar.b & SemanticState.Obscured) == 0) {
                return augyVar;
            }
            auhn auhnVar = augyVar.r;
            if (auhnVar == null) {
                auhnVar = auhn.a;
            }
            int i3 = auhnVar.c;
            auhn auhnVar2 = augyVar.r;
            if (auhnVar2 == null) {
                auhnVar2 = auhn.a;
            }
            float fGD = yno.gD((Size) this.b, new Size(i3, auhnVar2.d));
            jrr jrrVar = (jrr) augyVar.toBuilder();
            auho auhoVar = auho.a;
            aihf aihfVarCreateBuilder = auhoVar.createBuilder();
            auho auhoVar2 = augyVar.l;
            if (auhoVar2 == null) {
                auhoVar2 = auhoVar;
            }
            float f = auhoVar2.c * fGD;
            aihfVarCreateBuilder.copyOnWrite();
            auho auhoVar3 = (auho) aihfVarCreateBuilder.instance;
            auhoVar3.b |= 1;
            auhoVar3.c = f;
            auho auhoVar4 = augyVar.l;
            if (auhoVar4 != null) {
                auhoVar = auhoVar4;
            }
            float f2 = fGD * auhoVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            auho auhoVar5 = (auho) aihfVarCreateBuilder.instance;
            auhoVar5.b |= 2;
            auhoVar5.d = f2;
            jrrVar.copyOnWrite();
            augy augyVar2 = (augy) jrrVar.instance;
            auho auhoVar6 = (auho) aihfVarCreateBuilder.build();
            auhoVar6.getClass();
            augyVar2.l = auhoVar6;
            augyVar2.b |= SemanticState.Focused;
            return (augy) jrrVar.build();
        }
        airb airbVar = (airb) obj;
        wnq wnqVar = new wnq(airbVar);
        aihf builder = airbVar.toBuilder();
        if (wnqVar.k()) {
            if (wnqVar.h().equals(this.b)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        boolean z2 = (wnqVar.k() && this.c.contains(wnqVar.h()) && wnqVar.c != null) ? false : true;
        boolean z3 = this.a;
        builder.copyOnWrite();
        airb airbVar2 = (airb) builder.instance;
        airbVar2.h = null;
        airbVar2.b &= -257;
        builder.copyOnWrite();
        airb airbVar3 = (airb) builder.instance;
        airbVar3.b |= SemanticState.LiveRegion;
        airbVar3.i = z;
        builder.copyOnWrite();
        airb airbVar4 = (airb) builder.instance;
        airbVar4.b |= SemanticState.ReadOnly;
        airbVar4.j = z2;
        int i4 = true != z3 ? 36 : 48;
        aqmh aqmhVar = airbVar.g;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        aihh aihhVar = (aihh) aqmhVar.toBuilder();
        aihhVar.copyOnWrite();
        ((aqmh) aihhVar.instance).c = aqmh.emptyProtobufList();
        aqmh aqmhVar2 = airbVar.g;
        if (aqmhVar2 == null) {
            aqmhVar2 = aqmh.a;
        }
        aihhVar.q((Iterable) Collection.EL.stream(aqmhVar2.c).map(new ccf(i4, i2)).collect(aghu.a));
        aqmh aqmhVar3 = (aqmh) aihhVar.build();
        builder.copyOnWrite();
        airb airbVar5 = (airb) builder.instance;
        aqmhVar3.getClass();
        airbVar5.g = aqmhVar3;
        airbVar5.b |= SemanticState.Focused;
        aihf aihfVarCreateBuilder2 = airf.a.createBuilder();
        airb airbVar6 = (airb) builder.build();
        aihfVarCreateBuilder2.copyOnWrite();
        airf airfVar = (airf) aihfVarCreateBuilder2.instance;
        airbVar6.getClass();
        airfVar.c = airbVar6;
        airfVar.b = 62381864;
        return (airf) aihfVarCreateBuilder2.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.$cid;
        if (i == 0) {
            return Function$CC.$default$compose(this, function);
        }
        if (i != 1) {
            return i != 2 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ nyw(boolean z, agkz agkzVar, Size size, int i) {
        this.$cid = i;
        this.a = z;
        this.c = agkzVar;
        this.b = size;
    }

    public /* synthetic */ nyw(boolean z, String str, Set set, int i) {
        this.$cid = i;
        this.a = z;
        this.b = str;
        this.c = set;
    }
}
