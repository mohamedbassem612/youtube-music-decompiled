package defpackage;

import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.CardboardView;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abaq implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public abaq(abao abaoVar, CountDownLatch countDownLatch, int i) {
        this.$cid = i;
        this.b = countDownLatch;
        this.a = abaoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [aeez, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r12v54, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r12v55, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r12v63, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r12v69, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, xgz] */
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
    @Override // java.lang.Runnable
    public final void run() {
        alay alayVar;
        alay alayVar2;
        switch (this.$cid) {
            case 0:
                abbd abbdVar = (abbd) this.a;
                abbu abbuVar = abbdVar.f;
                Object obj = this.b;
                if (abbuVar != null) {
                    try {
                        abbuVar.f.f((abce) obj);
                        abdb abdbVar = abbuVar.e;
                        abce abceVar = abdbVar.a;
                        abdbVar.a = (abce) obj;
                        if (abceVar.a() != ((abce) obj).a()) {
                            abdbVar.b();
                            abdbVar.a();
                            return;
                        }
                        return;
                    } catch (abbx e) {
                        abbdVar.l(e);
                        return;
                    }
                }
                return;
            case 1:
                CardboardView.Renderer renderer = ((abao) this.a).d;
                if (renderer != null) {
                    renderer.onRendererShutdown();
                }
                ((CountDownLatch) this.b).countDown();
                return;
            case 2:
                Handler handler = ((abbd) this.a).j;
                if (handler != null) {
                    handler.obtainMessage(4, 1, 0, this.b).sendToTarget();
                    return;
                }
                return;
            case 3:
                ((abdl) this.b).a.l(this.a);
                return;
            case 4:
                ((abdl) this.a).b.add(this.b);
                return;
            case 5:
                ((abdl) this.a).a.k(this.b);
                return;
            case 6:
                ((abdl) this.a).c.add(this.b);
                return;
            case 7:
                ((abdl) this.b).a.d(this.a);
                return;
            case 8:
                Object obj2 = this.b;
                Object obj3 = this.a;
                synchronized (obj3) {
                    Iterator it = ((ablx) obj3).c.iterator();
                    while (it.hasNext()) {
                        ((ablw) it.next()).e((ably) obj2);
                    }
                    break;
                }
                return;
            case 9:
                Object obj4 = this.a;
                abmc abmcVar = (abmc) obj4;
                abmcVar.h = null;
                Object obj5 = this.b;
                arnj arnjVar = (arnj) obj5;
                if (!arnjVar.o.isEmpty()) {
                    abmcVar.e.b(arnjVar.o);
                    abmcVar.d(arnjVar);
                    return;
                }
                hee heeVar = abmcVar.m;
                jiq jiqVar = new jiq(obj4, obj5, 2);
                vqd vqdVar = new vqd(obj4, (aihn) obj5, 17);
                if ((arnjVar.b & SemanticState.Obscured) != 0) {
                    alayVar = arnjVar.l;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                Spanned spannedK = ackj.k(null, alayVar, null, false);
                if (TextUtils.isEmpty(spannedK)) {
                    return;
                }
                ?? r0 = heeVar.a;
                jio jioVarE = jin.e();
                jik jikVar = (jik) jioVarE;
                jikVar.i(-2);
                jikVar.k(spannedK);
                jikVar.a = jiqVar;
                ajng ajngVar = arnjVar.k;
                if (ajngVar == null) {
                    ajngVar = ajng.a;
                }
                if ((ajngVar.b & 1) != 0) {
                    ajng ajngVar2 = arnjVar.k;
                    if (ajngVar2 == null) {
                        ajngVar2 = ajng.a;
                    }
                    ajnf ajnfVar = ajngVar2.c;
                    if (ajnfVar == null) {
                        ajnfVar = ajnf.a;
                    }
                    if ((ajnfVar.b & 64) != 0) {
                        ajng ajngVar3 = arnjVar.k;
                        if (ajngVar3 == null) {
                            ajngVar3 = ajng.a;
                        }
                        ajnf ajnfVar2 = ajngVar3.c;
                        if (ajnfVar2 == null) {
                            ajnfVar2 = ajnf.a;
                        }
                        alayVar2 = ajnfVar2.m;
                        if (alayVar2 == null) {
                            alayVar2 = alay.a;
                        }
                    } else {
                        alayVar2 = null;
                    }
                    jioVarE.l(ackj.k(null, alayVar2, null, false), vqdVar);
                }
                r0.d(jioVarE.b());
                return;
            case 10:
                this.a.b(null, this.b);
                return;
            case 11:
                this.a.iT(null, (Exception) this.b);
                return;
            case 12:
                ((sxw) this.a).b(null, this.b);
                return;
            case 13:
                ((sxw) this.a).iT(null, (Exception) this.b);
                return;
            case 14:
                ?? r1 = this.a;
                if (r1 != 0) {
                    r1.n((String) this.b);
                    return;
                }
                return;
            case 15:
                abqc abqcVar = (abqc) this.a;
                if (abqcVar.g) {
                    return;
                }
                Throwable th = (Throwable) this.b;
                abqcVar.d.b(new aboe(4, true, 1, abqcVar.e.b(th), th, abqcVar.a.w(), null, null));
                return;
            case 16:
                abqc abqcVar2 = (abqc) this.b;
                if (abqcVar2.g) {
                    return;
                }
                abqcVar2.d.d(this.a);
                return;
            case 17:
                abqc abqcVar3 = (abqc) this.b;
                if (abqcVar3.g) {
                    return;
                }
                abqcVar3.d.g((wgi) this.a, abqcVar3.c);
                return;
            case 18:
                abqc abqcVar4 = (abqc) this.a;
                if (abqcVar4.g) {
                    return;
                }
                Throwable th2 = (Throwable) this.b;
                abqcVar4.d.f(new aboe(12, true, 1, abqcVar4.e.b(th2), th2, null, null, null));
                return;
            case 19:
                Object obj6 = this.b;
                Object obj7 = this.a;
                try {
                    Object obj8 = ((xsc) obj7).a;
                    wgi wgiVarB = ((abrm) ((xsc) obj7).c).a((alyi) obj6);
                    awlx awlxVar = ((rtm) obj8).e;
                    if (awlxVar != null) {
                        awlxVar.ki(wgiVarB);
                        return;
                    }
                    return;
                } catch (ExecutionException e2) {
                    zvl zvlVar = (zvl) ((xsc) obj7).b.io();
                    zvj zvjVarA = zvk.a();
                    zvjVarA.j = 21;
                    zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
                    zvjVarA.d(TextUtils.isEmpty(e2.getMessage()) ? e2.toString() : e2.getMessage());
                    zvlVar.a(zvjVarA.a());
                    return;
                }
            default:
                boolean zL = ((abmt) this.a).g.l(249, 45715813L, false);
                Object obj9 = this.b;
                if (zL) {
                    abmw abmwVar = abmw.MEDIASESSION;
                    ((abrp) obj9).k();
                    return;
                } else {
                    abmw abmwVar2 = abmw.MEDIASESSION;
                    ((abrp) obj9).j();
                    return;
                }
        }
    }

    public /* synthetic */ abaq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ abaq(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
