package defpackage;

import android.os.Handler;
import android.view.View;
import androidx.car.app.model.Alert;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hrr implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hrr(aamo aamoVar, List list, mbb mbbVar, int i) {
        this.$cid = i;
        this.b = aamoVar;
        this.c = list;
        this.a = mbbVar;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0195  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, myv] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, myv] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, orq] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, orq] */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, kty] */
    /* JADX WARN: Type inference failed for: r15v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v42, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        ajwo ajwoVar;
        boolean z;
        Iterable iterableQ;
        switch (this.$cid) {
            case 0:
                aofh aofhVar = (aofh) obj;
                aofg aofgVar = aofhVar.e;
                if (aofgVar == null) {
                    aofgVar = aofg.b;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(anue.b);
                aofgVar.c(aihlVarCheckIsLite);
                Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
                anue anueVar = (anue) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                String strH = wfs.h(aofhVar.d);
                int i = (anueVar.c & 4) != 0 ? anueVar.h : Alert.DURATION_SHOW_INDEFINITELY;
                Object obj2 = this.c;
                Object obj3 = this.b;
                ((agjz) this.a).h(strH);
                ((agkh) obj3).e(strH, Integer.valueOf(i));
                ((agkh) obj2).e(strH, anueVar);
                break;
            case 1:
                anyx anyxVar = (anyx) obj;
                zh zhVar = new zh();
                zhVar.a = 2;
                ListenableFuture listenableFutureAo = ((hnl) this.a).e.ao(anyx.class, anzi.class, anyxVar, agkj.j("display_context", zhVar.d()));
                if (!igs.c(anyxVar.getMusicVideoType())) {
                    this.c.add(listenableFutureAo);
                } else {
                    this.b.add(listenableFutureAo);
                }
                break;
            case 2:
                Status status = (Status) obj;
                ahgb ahgbVar = (ahgb) this.b;
                kro.e((Handler) ahgbVar.d);
                boolean zC = status.c();
                Object obj4 = this.c;
                if (!zC) {
                    ((kjc) obj4).w(kro.q(status));
                } else {
                    ahgb.an(this.a, (kqs) ahgbVar.e, (kjc) obj4);
                }
                break;
            case 3:
                ((moz) this.a).b(this.b.g(), (asmq) obj, (nsl) this.c);
                break;
            case 4:
                ((moz) this.a).b(this.b.h(), (asmq) obj, (nsl) this.c);
                break;
            case 5:
                Object obj5 = this.a;
                orr orrVarB = ors.b();
                orrVarB.e((View) obj5);
                orrVarB.g = (mew) obj;
                ors orsVarA = orrVarB.a();
                Object obj6 = this.c;
                atbh atbhVar = (atbh) obj6;
                if (atbhVar.f == null) {
                    mew mewVar = (mew) obj6;
                    if ((Memory.peekByte(mewVar.c + 8) & 4) != 0) {
                        atbhVar.f = new mew(mewVar.cp(true != atbh.a ? 20 : 24, atcm.a));
                    }
                }
                this.b.d(atbhVar.f == null ? atcl.a : atbhVar.f, orsVarA);
                break;
            case 6:
                Object obj7 = this.a;
                orr orrVarB2 = ors.b();
                orrVarB2.e((View) obj7);
                orrVarB2.g = (mew) obj;
                ors orsVarA2 = orrVarB2.a();
                Object obj8 = this.c;
                atbh atbhVar2 = (atbh) obj8;
                if (atbhVar2.e == null) {
                    mew mewVar2 = (mew) obj8;
                    if ((Memory.peekByte(mewVar2.c + 8) & 2) != 0) {
                        atbhVar2.e = new mew(mewVar2.cp(16, atcm.a));
                    }
                }
                this.b.d(atbhVar2.e == null ? atcl.a : atbhVar2.e, orsVarA2);
                break;
            case 7:
                ((rsq) obj).n((wgi) this.a, (String) this.c, this.b);
                break;
            case 8:
                Optional optional = (Optional) obj;
                vae vaeVar = (vae) this.c;
                vaeVar.u();
                boolean zIsPresent = optional.isPresent();
                Object obj9 = this.a;
                if (!zIsPresent) {
                    vaeVar.w(((uzz) this.b).a);
                    ((usq) obj9).r(vae.b);
                } else {
                    ((usq) obj9).r(vaeVar.q((String) optional.get()));
                }
                break;
            case 9:
                vst vstVar = (vst) obj;
                akuj akujVar = vstVar.c;
                if (akujVar == null) {
                    akujVar = akuj.b;
                }
                akuj akujVar2 = akujVar;
                Object obj10 = this.b;
                String strAa = tzk.aa(akujVar2);
                strAa.getClass();
                vor vorVar = (vor) obj10;
                boolean zL = vorVar.v.l(372, 45812899L, false);
                boolean z2 = akujVar2.B;
                if (!zL || (vstVar.b & 2) == 0) {
                    ajwoVar = null;
                } else {
                    ajwo ajwoVar2 = vstVar.d;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    ajwoVar = ajwoVar2;
                }
                if (!zL || (vstVar.b & 2) == 0) {
                    z = false;
                } else {
                    ajwo ajwoVar3 = vstVar.d;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    if (vor.N(ajwoVar3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                Object obj11 = this.a;
                vorVar.x(akujVar2, null, z2, ajwoVar, z, obj11 != null ? (adxd) ((vop) obj11).a.get(strAa) : null);
                vot votVarA = vorVar.a.a(strAa);
                votVarA.getClass();
                if ((vstVar.b & 2) != 0) {
                    ajwo ajwoVar4 = vstVar.d;
                    if (ajwoVar4 == null) {
                        ajwoVar4 = ajwo.a;
                    }
                    votVarA.e = ajwoVar4;
                }
                ((HashMap) this.c).put(strAa, Integer.valueOf(vstVar.e));
                break;
            case 10:
                xgo xgoVar = ((xge) this.a).c;
                xgt xgtVar = (xgt) obj;
                if (xgo.p(xgoVar.a(), xgtVar)) {
                    xgoVar.k(xgtVar, xgo.c(xgtVar.f), (String) this.c, (xie) this.b);
                }
                break;
            case 11:
                xgt xgtVar2 = (xgt) obj;
                agjz agjzVar = new agjz(4);
                ?? r0 = this.c;
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    agjzVar.h(((xgz) it.next()).c());
                }
                xge xgeVar = (xge) this.a;
                xie xieVar = (xie) this.b;
                xgeVar.c.i(xgtVar2, agjzVar.g(), xieVar);
                Iterator it2 = r0.iterator();
                while (it2.hasNext()) {
                    xgeVar.e.b((xgz) it2.next(), Optional.empty(), null, xgtVar2, xieVar);
                }
                break;
            case 12:
                ((xge) this.a).c.i((xgt) obj, this.c, (xie) this.b);
                break;
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                ((xgo) this.a).h((xgt) this.b, (argn) entry.getKey(), (argn) entry.getValue(), (xie) this.c);
                break;
            case 14:
                ((xgo) this.a).n((xgt) this.b, new xhm(xgo.a, ((xgz) obj).c(), Optional.empty(), null), (xie) this.c);
                break;
            case 15:
                List list = (List) this.c.remove(this.a);
                if (list != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((acga) this.b).n((abac) it3.next());
                    }
                }
                break;
            case 16:
                Iterator it4 = this.c.iterator();
                while (true) {
                    Object obj12 = this.b;
                    if (!it4.hasNext()) {
                        ((aamo) obj12).c.remove(this.a);
                    } else {
                        ((acga) ((aamo) obj12).e).n((abac) it4.next());
                    }
                    break;
                }
                break;
            default:
                ahub ahubVar = (ahub) obj;
                ((AtomicBoolean) this.c).set(true);
                int i2 = ((asib) ahubVar.a).b & 1;
                Object obj13 = this.a;
                if (i2 != 0) {
                    apjh apjhVarJ = ahubVar.j();
                    aihl aihlVar = aqho.b;
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    apjhVarJ.c(aihlVarCheckIsLite2);
                    if (apjhVarJ.j.n(aihlVarCheckIsLite2.d)) {
                        apjh apjhVarJ2 = ahubVar.j();
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                        apjhVarJ2.c(aihlVarCheckIsLite3);
                        Object objK2 = apjhVarJ2.j.k(aihlVarCheckIsLite3.d);
                        aqho aqhoVar = (aqho) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                        if (((adcw) obj13).g) {
                            iterableQ = aqhoVar.c;
                        } else {
                            aqhl aqhlVar = aqhoVar.d;
                            if (aqhlVar == null) {
                                aqhlVar = aqhl.a;
                            }
                            iterableQ = agke.q(aqhlVar);
                        }
                        Iterable$EL.forEach(iterableQ, new acfb(obj13, 6));
                    }
                }
                String str = (String) this.b;
                adcw adcwVar = (adcw) obj13;
                if (adcwVar.m(str)) {
                    acfz.ap(adcwVar.j, str);
                }
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
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ hrr(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ hrr(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ hrr(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ hrr(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }
}
