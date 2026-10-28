package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auoa implements bpl {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public auoa(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi a(Class cls) {
        int i = this.$cid;
        if (i == 0) {
            return bnz.h();
        }
        if (i == 1) {
            return bnz.h();
        }
        if (i != 2) {
            return i != 3 ? bnz.h() : bnz.h();
        }
        return bnz.h();
    }

    @Override // defpackage.bpl
    public final bpi b(Class cls, bpt bptVar) {
        bpi bpiVar;
        aunv aunvVarC;
        int i = this.$cid;
        if (i == 0) {
            auod auodVar = new auod();
            aupe aupeVar = (aupe) bptVar.a(aupe.b);
            if (aupeVar == null) {
                aupeVar = aupe.a;
            }
            aupf aupfVar = (aupf) bptVar.a(aupd.d);
            gjd gjdVar = (gjd) this.a;
            gjdVar.b = bpd.a(bptVar);
            gjdVar.c = auodVar;
            aupeVar.getClass();
            gjdVar.d = aupeVar;
            if (aupfVar == null) {
                aupfVar = aupf.a;
            }
            gjdVar.e = aupfVar;
            atqq.b(gjdVar.b, boy.class);
            atqq.b(gjdVar.c, auns.class);
            atqq.b(gjdVar.d, aupe.class);
            atqq.b(gjdVar.e, aupf.class);
            gkl gklVar = new gkl(gjdVar.a, gjdVar.b);
            awmd awmdVar = (awmd) ((auob) atqp.a(gklVar, auob.class)).b().get(cls);
            awqg awqgVar = (awqg) bptVar.a(auoc.a);
            Object obj = ((auob) atqp.a(gklVar, auob.class)).a().get(cls);
            if (obj == null) {
                if (awqgVar != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (awmdVar == null) {
                    throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                }
                bpiVar = (bpi) awmdVar.io();
            } else {
                if (awmdVar != null) {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                if (awqgVar == null) {
                    throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                }
                bpiVar = (bpi) awqgVar.invoke(obj);
            }
            bpiVar.s(new aunz(auodVar, 0));
            return bpiVar;
        }
        if (i == 1) {
            Object objC = ((afod) this.a).c();
            auor auorVar = new auor(bptVar);
            aupf aupfVar2 = (aupf) bptVar.a(afpc.c);
            if (aupfVar2 == null) {
                aupfVar2 = aupf.a;
            }
            return new afoa(objC, auorVar, aupfVar2);
        }
        if (i == 2) {
            auor auorVar2 = new auor(bptVar);
            aupf aupfVar3 = (aupf) bptVar.a(aupd.a);
            trf trfVarFK = ((auog) atqp.a(a.aJ(((Context) this.a).getApplicationContext()), auog.class)).fK();
            trfVarFK.c = auorVar2;
            if (aupfVar3 == null) {
                aupfVar3 = aupf.a;
            }
            trfVarFK.b = aupfVar3;
            atqq.b(trfVarFK.c, auor.class);
            atqq.b(trfVarFK.b, aupf.class);
            return new auoh(new gjw((ght) trfVarFK.a), auorVar2);
        }
        if (i != 3) {
            auor auorVar3 = new auor(bptVar);
            aupf aupfVar4 = (aupf) bptVar.a(aupd.c);
            Object obj2 = this.a;
            if (!(obj2 instanceof aupi)) {
                throw new IllegalStateException("ScreenRetainedComponent cannot be instantiated without a host");
            }
            giu giuVarB = ((auou) atqp.a(((auof) ((aupi) obj2).componentManager()).b(), auou.class)).b();
            giuVarB.b = auorVar3;
            if (aupfVar4 == null) {
                aupfVar4 = aupf.a;
            }
            giuVarB.c = aupfVar4;
            atqq.b(giuVarB.b, auor.class);
            atqq.b(giuVarB.c, aupf.class);
            return new auov(new gke(giuVarB.a, giuVarB.d), auorVar3);
        }
        auor auorVar4 = new auor(bptVar);
        Object obj3 = this.a;
        Object parentFragment = obj3;
        while (true) {
            if (parentFragment == null) {
                cc ccVar = (cc) obj3;
                atqq.c(ccVar.getHost() instanceof aupi, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", ccVar.getHost().getClass());
                aunvVarC = ((auof) ((aupi) ccVar.getHost()).componentManager()).c();
                break;
            }
            if (parentFragment instanceof aupi) {
                auph auphVarComponentManager = ((aupi) parentFragment).componentManager();
                if (auphVarComponentManager instanceof auof) {
                    aunvVarC = ((auof) auphVarComponentManager).c();
                    break;
                }
            }
            parentFragment = ((cc) parentFragment).getParentFragment();
        }
        aupf aupfVar5 = (aupf) bptVar.a(aupd.b);
        gat gatVarB = ((auon) atqp.a(aunvVarC, auon.class)).b();
        gatVarB.a = auorVar4;
        if (aupfVar5 == null) {
            aupfVar5 = aupf.a;
        }
        gatVarB.b = aupfVar5;
        atqq.b(gatVarB.a, auor.class);
        atqq.b(gatVarB.b, aupf.class);
        return new auoo(new gka(), auorVar4);
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi c(awsd awsdVar, bpt bptVar) {
        int i = this.$cid;
        if (i == 0) {
            return bnz.g(this, awsdVar, bptVar);
        }
        if (i == 1) {
            return b(((awqv) awsdVar).b, bptVar);
        }
        if (i != 2) {
            return i != 3 ? b(((awqv) awsdVar).b, bptVar) : b(((awqv) awsdVar).b, bptVar);
        }
        return b(((awqv) awsdVar).b, bptVar);
    }
}
