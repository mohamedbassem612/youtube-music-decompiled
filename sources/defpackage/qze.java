package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qze implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qze(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
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
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, qvm] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, vab] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        agke agkeVarN;
        String str;
        int i = 1;
        int i2 = 2;
        switch (this.$cid) {
            case 0:
                return ahcs.f((ListenableFuture) obj, new qzc(this.a, this.b, this.c, 0), MoreExecutors.directExecutor());
            case 1:
                Object obj2 = this.c;
                Object obj3 = this.b;
                Object obj4 = this.a;
                return ((qzf) obj4).e.e((ListenableFuture) obj, new qzc(obj4, obj3, obj2, i2));
            case 2:
                Object obj5 = this.c;
                Object obj6 = this.b;
                Object obj7 = this.a;
                return ((qzf) obj7).e.e((ListenableFuture) obj, new qzc(obj7, obj6, obj5, i));
            case 3:
                return ahcs.f((ListenableFuture) obj, new okx(this.a, this.b, this.c, 20, (char[]) null), MoreExecutors.directExecutor());
            case 4:
                uqn uqnVar = (uqn) obj;
                boolean z = uqnVar.a.g;
                Object obj8 = this.c;
                if (!z) {
                    return Optional.of(Float.valueOf(((auhp) obj8).d));
                }
                if (Collection.EL.stream(this.a).anyMatch(new sco(uqnVar, 12))) {
                    return Optional.empty();
                }
                return Optional.of(Float.valueOf(((auhp) obj8).d + ((xsc) this.b).M(uqnVar.b)));
            case 5:
                uqn uqnVar2 = (uqn) obj;
                if (((agkz) this.a).contains(uqnVar2.a)) {
                    return Optional.empty();
                }
                return Optional.of(Float.valueOf(((auhp) this.c).c + ((xsc) this.b).M(uqnVar2.b)));
            case 6:
                uqn uqnVar3 = (uqn) obj;
                if (((agkz) this.a).contains(uqnVar3.a)) {
                    return Optional.empty();
                }
                return Optional.of(Float.valueOf(((auhp) this.c).d + ((xsc) this.b).M(uqnVar3.b)));
            case 7:
                uqn uqnVar4 = (uqn) obj;
                boolean z2 = uqnVar4.a.g;
                Object obj9 = this.c;
                if (!z2) {
                    return Optional.of(Float.valueOf(((auhp) obj9).c));
                }
                if (Collection.EL.stream(this.a).anyMatch(new sco(uqnVar4, 13))) {
                    return Optional.empty();
                }
                return Optional.of(Float.valueOf(((auhp) obj9).c + ((xsc) this.b).M(uqnVar4.b)));
            case 8:
                aufd aufdVar = (aufd) obj;
                apsr apsrVar = aufdVar.g;
                if (apsrVar == null) {
                    apsrVar = apsr.a;
                }
                if (apsrVar.b != 4) {
                    return ahng.n(Optional.empty());
                }
                apsr apsrVar2 = aufdVar.g;
                if (apsrVar2 == null) {
                    apsrVar2 = apsr.a;
                }
                apse apseVar = apsrVar2.b == 4 ? (apse) apsrVar2.c : apse.a;
                uzy uzyVarA = uzz.a();
                uzyVarA.b(apseVar.c);
                uzyVarA.c(apseVar.d);
                uzz uzzVarA = uzyVarA.a();
                aufe aufeVar = aufdVar.c == 2 ? (aufe) aufdVar.d : aufe.a;
                ?? r11 = this.b;
                ?? r7 = this.c;
                if ((aufeVar.b & 1) == 0) {
                    Object obj10 = this.a;
                    r7.f(uzzVarA);
                    return ape.f(new usl(aufdVar, r7, r11, ((use) obj10).b));
                }
                int i3 = aufdVar.e;
                if (i3 == 1001) {
                    aufc aufcVar = (i3 == 1001 ? (aufl) aufdVar.f : aufl.a).c;
                    if (aufcVar == null) {
                        aufcVar = aufc.a;
                    }
                    agkeVarN = agke.n(aufcVar.b);
                } else {
                    agkeVarN = agpi.a;
                }
                return ape.f(new usp((vab) r7, uzzVarA, aufdVar, agkeVarN, (qvm) r11, 0));
            case 9:
                ajcp ajcpVar = (ajcp) obj;
                if ((ajcpVar.b & 1) == 0) {
                    ((aaap) ((aczl) this.a).e).a("Payload does not have the required navigation endpoint.");
                    return Optional.empty();
                }
                ajwo ajwoVar = ajcpVar.c;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                Optional optional = (Optional) this.c;
                str = optional.isPresent() ? ((xgt) optional.get()).a : null;
                Object obj11 = this.b;
                Intent intent = (Intent) obj11;
                zik.be(intent, ajwoVar, str);
                yno.U(intent, "ytnchime");
                return Optional.of(obj11);
            default:
                ajcs ajcsVar = (ajcs) obj;
                String str2 = ((ozj) ((Optional) this.c).get()).a;
                int i4 = ajcsVar.b;
                int i5 = i4 & 2;
                Object obj12 = this.a;
                if (i5 == 0) {
                    if ((i4 & 32) == 0) {
                        ((aaap) ((aczl) obj12).e).a("Payload does not have the required navigation endpoint.");
                    }
                    return Optional.empty();
                }
                Optional optionalF = ((aczl) obj12).f(str2);
                ajwo ajwoVar2 = ajcsVar.d;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                str = optionalF.isPresent() ? ((xgt) optionalF.get()).a : null;
                Object obj13 = this.b;
                Intent intent2 = (Intent) obj13;
                zik.be(intent2, ajwoVar2, str);
                ajwo ajwoVar3 = ajcsVar.e;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                aabq.b(intent2, ajwoVar3);
                yno.U(intent2, "ytnchime");
                return Optional.of(obj13);
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
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ qze(use useVar, vab vabVar, qvm qvmVar, int i) {
        this.$cid = i;
        this.a = useVar;
        this.c = vabVar;
        this.b = qvmVar;
    }

    public /* synthetic */ qze(xsc xscVar, agkz agkzVar, auhp auhpVar, int i) {
        this.$cid = i;
        this.b = xscVar;
        this.a = agkzVar;
        this.c = auhpVar;
    }

    public /* synthetic */ qze(xsc xscVar, auhp auhpVar, agkz agkzVar, int i) {
        this.$cid = i;
        this.b = xscVar;
        this.c = auhpVar;
        this.a = agkzVar;
    }
}
