package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class efi implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ efi(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [axo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r10v37, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v38, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r10v39, types: [java.lang.CharSequence, java.lang.Object] */
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
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        char c = 1;
        tjk tjkVar = null;
        switch (this.$cid) {
            case 0:
                Object obj = this.a;
                ebm ebmVar = (ebm) obj;
                WorkDatabase workDatabase = ebmVar.d;
                workDatabase.getClass();
                workDatabase.o(new dhr(obj, this.b, 11));
                dms.k(ebmVar);
                return awmy.a;
            case 1:
                ((dww) this.b).b.a(this.a);
                return awmy.a;
            case 2:
                this.a.y((toe) this.b);
                return awmy.a;
            case 3:
                tiz tizVar = (tiz) ((vwt) this.a).a;
                tmf tmfVar = tizVar.a;
                tmfVar.c();
                Object obj2 = this.b;
                Throwable thB = tmfVar.b();
                if (thB == null) {
                    thB = new toe(new CancellationException(obj2 != null ? ((UrlResponseInfo) obj2).getUrl() : null));
                }
                tizVar.d((UrlResponseInfo) obj2, thB);
                return awmy.a;
            case 4:
                tiz tizVar2 = (tiz) ((vwt) this.a).a;
                AtomicBoolean atomicBoolean = tizVar2.d;
                if (!atomicBoolean.get()) {
                    Object obj3 = this.b;
                    tizVar2.a.h();
                    UrlResponseInfo urlResponseInfo = (UrlResponseInfo) obj3;
                    if (!taq.v(urlResponseInfo.getHttpStatusCode())) {
                        tizVar2.d(urlResponseInfo, taq.w(new tnm(urlResponseInfo.getHttpStatusCode(), tja.a, false, (List) taq.l(urlResponseInfo)), urlResponseInfo.getHttpStatusCode()));
                    } else if (atomicBoolean.compareAndSet(false, true)) {
                        if (!tizVar2.c) {
                            tjk tjkVar2 = tizVar2.e.f;
                            if (tjkVar2 == null) {
                                awrc.b("callbacks");
                                tjkVar2 = null;
                            }
                            tjkVar2.c(new tnm(urlResponseInfo.getHttpStatusCode(), tja.a, urlResponseInfo.getHttpStatusCode() == 304, taq.l(urlResponseInfo)));
                        }
                        tja tjaVar = tizVar2.e;
                        tjaVar.c();
                        tjk tjkVar3 = tjaVar.f;
                        if (tjkVar3 == null) {
                            awrc.b("callbacks");
                        } else {
                            tjkVar = tjkVar3;
                        }
                        tjkVar.a();
                    }
                }
                return awmy.a;
            case 5:
                boolean z = ((awri) this.b).a;
                Object obj4 = this.a;
                if (z) {
                    synchronized (((van) obj4).d) {
                        ((van) obj4).l(((van) obj4).e);
                    }
                }
                return awmy.a;
            case 6:
                if (!((vxz) this.a).l(18, 45390562L, false)) {
                    return null;
                }
                ahfg ahfgVar = new ahfg(((wck) this.b).a);
                avmb avmbVar = awlg.a;
                return new awir(ahfgVar);
            case 7:
                return ((elq) this.a).x(((xxd) this.b).e);
            case 8:
                return ((elq) this.a).x(((xxd) this.b).f);
            case 9:
                final awmp awmpVar = new awmp(new zqe(this.b, c == true ? 1 : 0));
                return new dov(((Boolean) ((zqf) this.a).a.a()).booleanValue() ? atqq.H(new zqt() { // from class: zqd
                    @Override // defpackage.zqt
                    public final void a(zrc zrcVar) {
                        Iterator it = zqf.g(awmpVar).iterator();
                        while (it.hasNext()) {
                            ((zqt) it.next()).a(zrcVar);
                        }
                    }
                }) : zqf.g(awmpVar));
            case 10:
                awtk awtkVar = acbx.a;
                return new accr((Integer) this.a, ((Integer) this.b).intValue());
            case 11:
                Object obj5 = this.a;
                if (obj5 != null) {
                    ((adcw) obj5).d((String) this.b, null);
                }
                return awmy.a;
            case 12:
                adgu adguVar = (adgu) this.b;
                return new adgq(adguVar.getContext(), new adgt(this.a, adguVar));
            case 13:
                if (((adrf) this.a).f instanceof adqn) {
                    this.b.invoke();
                }
                return awmy.a;
            default:
                Pattern pattern = ((awtk) this.b).a;
                ?? r10 = this.a;
                Matcher matcher = pattern.matcher(r10);
                matcher.getClass();
                return avkz.g(matcher, 0, r10);
        }
    }

    public /* synthetic */ efi(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
