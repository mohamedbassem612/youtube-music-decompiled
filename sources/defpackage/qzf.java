package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.mediapipe.framework.AndroidAssetUtil;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qzf implements qyy {
    public static final /* synthetic */ int f = 0;
    private static final rbm i = new rbm("qzf");
    public final Context a;
    public final qug b;
    public final qyz c;
    public final qyt d;
    public final rjb e;
    private final qzi g;
    private final qzk h;

    public qzf(Context context, qug qugVar, qyt qytVar, rjb rjbVar) {
        this.a = context;
        this.b = qugVar;
        this.c = new qyz(context);
        xsc xscVar = new xsc(context, rjbVar, qytVar.a);
        this.g = new qzi(xscVar);
        this.h = new qzk(xscVar);
        this.d = qytVar;
        this.e = rjbVar;
        if (AndroidAssetUtil.a(context)) {
            return;
        }
        rbc rbcVar = new rbc(i, rbd.e);
        rbcVar.c();
        rbcVar.a("Failed to initialize native asset manager.", new Object[0]);
        tge tgeVarA = quk.a();
        tgeVarA.c = new quf(3);
        ((rdr) qugVar).D(tgeVarA.e());
    }

    private static String e(qvi qviVar) {
        return qzr.b(qviVar.i().getPath());
    }

    @Override // defpackage.qyy
    public final agkj a(List list) {
        return (agkj) Collection.EL.stream(list).map(new iuk(this, 16)).filter(new jor(9)).collect(aghu.a(new qdi(19), new qdi(20)));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00be  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
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
    @Override // defpackage.qyy
    public final Optional b(qvc qvcVar) {
        List listQ;
        qvc qvcVar2;
        Optional optionalEmpty;
        Optional optionalOfNullable;
        int i2 = 0;
        if (qvcVar instanceof rcb) {
            listQ = (agke) Collection.EL.stream(((rcb) qvcVar).a).map(new qzp(8)).collect(aghu.a);
            qvcVar2 = (qvc) ((rcb) qvcVar).a.get(0);
        } else {
            listQ = agke.q(qvcVar.c);
            qvcVar2 = qvcVar;
        }
        int i3 = 12;
        if (qvcVar2 instanceof qvk) {
            optionalEmpty = Optional.of(ahng.n((qvk) qvcVar2));
        } else {
            int i4 = 2;
            byte[] bArr = null;
            int i5 = 1;
            if (qvcVar2 instanceof qvd) {
                qve qveVar = ((qvd) qvcVar2).a;
                qzi qziVar = this.g;
                Optional optionalOfNullable2 = Optional.ofNullable((qyv) qzi.a.get(null));
                hlx hlxVar = new hlx(qziVar.b, i3);
                if (true != optionalOfNullable2.isPresent()) {
                    optionalOfNullable = optionalOfNullable2;
                } else {
                    optionalOfNullable = Optional.ofNullable(((xsc) hlxVar.a).ag((qyv) optionalOfNullable2.get()));
                }
                if (this.d.a.ae) {
                    qze qzeVar = new qze(this, qvcVar2, listQ, i5);
                    if (true == optionalOfNullable.isPresent()) {
                        Object obj = optionalOfNullable.get();
                        Object obj2 = qzeVar.a;
                        optionalEmpty = Optional.ofNullable(((qzf) obj2).e.e((ListenableFuture) obj, new qzc(obj2, qzeVar.b, qzeVar.c, i4)));
                    } else {
                        optionalEmpty = optionalOfNullable;
                    }
                } else {
                    qze qzeVar2 = new qze(this, qvcVar2, listQ, i2);
                    if (true != optionalOfNullable.isPresent()) {
                        optionalEmpty = optionalOfNullable;
                    } else {
                        optionalEmpty = Optional.ofNullable(ahcs.f((ListenableFuture) optionalOfNullable.get(), new qzc(qzeVar2.a, qzeVar2.b, qzeVar2.c, i2), MoreExecutors.directExecutor()));
                    }
                }
            } else if ((qvcVar2 instanceof qvj) || (qvcVar2 instanceof qva) || (qvcVar2 instanceof qvg)) {
                optionalEmpty = Optional.of(d(this.b, c(qvcVar2, ""), listQ));
            } else if (qvcVar2 instanceof qvh) {
                boolean z = this.d.a.ae;
                qzk qzkVar = this.h;
                if (z) {
                    Optional optionalA = qzkVar.a();
                    qze qzeVar3 = new qze(this, qvcVar2, listQ, i4);
                    optionalA.isPresent();
                    ?? r0 = optionalA.get();
                    Object obj3 = qzeVar3.a;
                    optionalEmpty = Optional.ofNullable(((qzf) obj3).e.e(r0, new qzc(obj3, qzeVar3.b, qzeVar3.c, i5)));
                } else {
                    Optional optionalA2 = qzkVar.a();
                    qze qzeVar4 = new qze(this, qvcVar2, listQ, 3);
                    optionalA2.isPresent();
                    optionalEmpty = Optional.ofNullable(ahcs.f(optionalA2.get(), new okx(qzeVar4.a, qzeVar4.b, qzeVar4.c, 20, (char[]) null), MoreExecutors.directExecutor()));
                }
            } else if (qvcVar2 instanceof qzm) {
                qzm qzmVar = (qzm) qvcVar2;
                optionalEmpty = Optional.of(this.e.b(c(qzmVar, e(qzmVar)), Exception.class, new ols(this, qvcVar2.c, 18, bArr)));
            } else if (qvcVar2 instanceof qzl) {
                qzl qzlVar = (qzl) qvcVar2;
                optionalEmpty = Optional.of(this.e.b(c(qzlVar, e(qzlVar)), Exception.class, new ols(this, qvcVar2.c, 17, bArr)));
            } else if (qvcVar2 instanceof qvi) {
                qvi qviVar = (qvi) qvcVar2;
                optionalEmpty = qviVar.a == null ? Optional.empty() : Optional.of(d(this.b, c(qviVar, e(qviVar)), listQ));
            } else if (qvcVar2 instanceof qvb) {
                optionalEmpty = Optional.of(d(this.b, ape.f(new qzb(this, true != this.d.a.a ? "denoise_seanet_16khz_effect.binarypb" : "denoise_seanet_24khz_effect.binarypb", (Object) qvcVar2.c, i2)), listQ));
            } else {
                optionalEmpty = Optional.empty();
            }
        }
        if (optionalEmpty.isPresent()) {
            return Optional.of(this.e.d((ListenableFuture) optionalEmpty.get(), new onn(qvcVar, i3)));
        }
        return Optional.empty();
    }

    public final ListenableFuture c(qvc qvcVar, String str) {
        return ape.f(new qzb(this, qvcVar, str, 2));
    }

    public final ListenableFuture d(qug qugVar, ListenableFuture listenableFuture, List list) {
        return this.e.b(listenableFuture, Exception.class, new ols(list, qugVar, 19));
    }
}
