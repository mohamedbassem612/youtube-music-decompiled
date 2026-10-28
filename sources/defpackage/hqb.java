package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import com.google.research.xeno.effect.Effect;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.UUID;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hqb implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hqb(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [wbz] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, qvm] */
    /* JADX WARN: Type inference failed for: r11v2, types: [hqg] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v77, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r12v78 */
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
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int width;
        int width2;
        Object uvvVar;
        ?? usbVar;
        int i = 0;
        int i2 = 4;
        int i3 = 2;
        switch (this.$cid) {
            case 0:
                weh[] wehVarArr = {(weh) obj};
                ?? r12 = this.b;
                ((hqg) this.a).f(r12, wehVarArr);
                usbVar = r12;
                return usbVar;
            case 1:
                return ((tzk) obj).I(((hps) this.a).a.b(this.b));
            case 2:
                agrf agrfVar = hsn.a;
                annv annvVar = (annv) ((weh) obj);
                Stream stream = Collection.EL.stream(annvVar.e());
                Object obj2 = this.a;
                stream.forEach(new hsk(obj2, 6));
                Collection.EL.stream(annvVar.g()).forEach(new hsk(obj2, i));
                Collection.EL.stream(annvVar.i()).forEach(new hsk(obj2, i3));
                Collection.EL.stream(annvVar.j()).forEach(new hsk(obj2, 3));
                Collection.EL.stream(this.b).forEach(new hsk(obj2, i2));
                return obj2;
            case 3:
                mrb mrbVar = (mrb) this.b;
                Rect rect = (Rect) obj;
                boolean zBs = qnl.bs(mrbVar.b.getResources());
                Object obj3 = this.a;
                if (zBs) {
                    width = ((View) obj3).getWidth() - rect.right;
                    width2 = ((View) obj3).getWidth() - rect.left;
                } else {
                    width = rect.left;
                    width2 = rect.right;
                }
                aihf aihfVarCreateBuilder = asmk.a.createBuilder();
                asml asmlVar = asml.a;
                aihf aihfVarCreateBuilder2 = asmlVar.createBuilder();
                DisplayMetrics displayMetrics = mrbVar.c;
                float fA = mrl.a(displayMetrics, rect.top);
                aihfVarCreateBuilder2.copyOnWrite();
                asml asmlVar2 = (asml) aihfVarCreateBuilder2.instance;
                asmlVar2.b |= 1;
                asmlVar2.c = fA;
                asml asmlVar3 = (asml) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                asmk asmkVar = (asmk) aihfVarCreateBuilder.instance;
                asmlVar3.getClass();
                asmkVar.c = asmlVar3;
                asmkVar.b |= 1;
                aihf aihfVarCreateBuilder3 = asmlVar.createBuilder();
                float fA2 = mrl.a(displayMetrics, width);
                aihfVarCreateBuilder3.copyOnWrite();
                asml asmlVar4 = (asml) aihfVarCreateBuilder3.instance;
                asmlVar4.b |= 1;
                asmlVar4.c = fA2;
                asml asmlVar5 = (asml) aihfVarCreateBuilder3.build();
                aihfVarCreateBuilder.copyOnWrite();
                asmk asmkVar2 = (asmk) aihfVarCreateBuilder.instance;
                asmlVar5.getClass();
                asmkVar2.g = asmlVar5;
                asmkVar2.b |= 16;
                aihf aihfVarCreateBuilder4 = asmlVar.createBuilder();
                float fA3 = mrl.a(displayMetrics, rect.bottom);
                aihfVarCreateBuilder4.copyOnWrite();
                asml asmlVar6 = (asml) aihfVarCreateBuilder4.instance;
                asmlVar6.b |= 1;
                asmlVar6.c = fA3;
                asml asmlVar7 = (asml) aihfVarCreateBuilder4.build();
                aihfVarCreateBuilder.copyOnWrite();
                asmk asmkVar3 = (asmk) aihfVarCreateBuilder.instance;
                asmlVar7.getClass();
                asmkVar3.e = asmlVar7;
                asmkVar3.b |= 4;
                aihf aihfVarCreateBuilder5 = asmlVar.createBuilder();
                float fA4 = mrl.a(displayMetrics, width2);
                aihfVarCreateBuilder5.copyOnWrite();
                asml asmlVar8 = (asml) aihfVarCreateBuilder5.instance;
                asmlVar8.b |= 1;
                asmlVar8.c = fA4;
                asml asmlVar9 = (asml) aihfVarCreateBuilder5.build();
                aihfVarCreateBuilder.copyOnWrite();
                asmk asmkVar4 = (asmk) aihfVarCreateBuilder.instance;
                asmlVar9.getClass();
                asmkVar4.h = asmlVar9;
                asmkVar4.b |= 32;
                return (asmk) aihfVarCreateBuilder.build();
            case 4:
                ahgb ahgbVar = (ahgb) this.a;
                return ((aczl) obj).q((apsd) rbh.b.b(ahgbVar.e), Optional.of((apsc) rbh.a.b(ahgbVar.d)), (Optional) this.b);
            case 5:
                reo reoVar = ((rec) this.a).h;
                reoVar.getClass();
                return ((reo) obj).iw((Duration) afyd.f(this.b, reoVar.ix().minus(rec.b)));
            case 6:
                reo reoVar2 = ((rec) this.a).i;
                reoVar2.getClass();
                return ((reo) obj).iw((Duration) afyd.e(this.b, reoVar2.iy()));
            case 7:
                new ttk((Context) this.a);
                return ttk.c((Drawable) this.b, (ColorStateList) obj);
            case 8:
                Rect rect2 = ((qub) obj).b;
                augy augyVar = (augy) this.b;
                uvvVar = new uvv(augyVar.e, rect2, ((uql) this.a).o.O(augyVar), zf.P(augyVar));
                return uvvVar;
            case 9:
                augy augyVar2 = (augy) obj;
                uvvVar = new uvv(augyVar2.e, ((qub) this.a).b, ((uql) this.b).o.O(augyVar2), zf.P(augyVar2));
                return uvvVar;
            case 10:
                return ((uqx) this.b).a((qub) obj, (Size) this.a);
            case 11:
                return ((uqx) this.b).a((qub) obj, ((uqv) this.a).k);
            case 12:
                ujr ujrVar = (ujr) obj;
                auhp auhpVar = auhp.a;
                aihf aihfVarCreateBuilder6 = auhpVar.createBuilder();
                augy augyVar3 = (augy) this.b;
                auhp auhpVar2 = augyVar3.k;
                if (auhpVar2 == null) {
                    auhpVar2 = auhpVar;
                }
                double d = ujrVar.a;
                Size size = (Size) this.a;
                float fC = auhpVar2.c + uqx.c(d, size);
                aihfVarCreateBuilder6.copyOnWrite();
                auhp auhpVar3 = (auhp) aihfVarCreateBuilder6.instance;
                auhpVar3.b |= 1;
                auhpVar3.c = fC;
                auhp auhpVar4 = augyVar3.k;
                if (auhpVar4 != null) {
                    auhpVar = auhpVar4;
                }
                float fC2 = auhpVar.d + uqx.c(ujrVar.b, size);
                aihfVarCreateBuilder6.copyOnWrite();
                auhp auhpVar5 = (auhp) aihfVarCreateBuilder6.instance;
                auhpVar5.b |= 2;
                auhpVar5.d = fC2;
                return (auhp) aihfVarCreateBuilder6.build();
            case 13:
                SizeF sizeF = (SizeF) obj;
                auho auhoVar = ((augy) this.b).l;
                if (auhoVar == null) {
                    auhoVar = auho.a;
                }
                Object obj4 = this.a;
                aihf aihfVarCreateBuilder7 = auho.a.createBuilder();
                Range range = (Range) obj4;
                float fFloatValue = ((Float) range.clamp(Float.valueOf(auhoVar.c * sizeF.getWidth()))).floatValue();
                aihfVarCreateBuilder7.copyOnWrite();
                auho auhoVar2 = (auho) aihfVarCreateBuilder7.instance;
                auhoVar2.b |= 1;
                auhoVar2.c = fFloatValue;
                float fFloatValue2 = ((Float) range.clamp(Float.valueOf(auhoVar.d * sizeF.getHeight()))).floatValue();
                aihfVarCreateBuilder7.copyOnWrite();
                auho auhoVar3 = (auho) aihfVarCreateBuilder7.instance;
                auhoVar3.b |= 2;
                auhoVar3.d = fFloatValue2;
                return (auho) aihfVarCreateBuilder7.build();
            case 14:
                ujr ujrVar2 = (ujr) obj;
                auhp auhpVar6 = auhp.a;
                aihf aihfVarCreateBuilder8 = auhpVar6.createBuilder();
                augy augyVar4 = (augy) this.b;
                auhp auhpVar7 = augyVar4.k;
                if (auhpVar7 == null) {
                    auhpVar7 = auhpVar6;
                }
                double d2 = ujrVar2.a;
                Size size2 = (Size) this.a;
                float fC3 = auhpVar7.c + uqx.c(d2, size2);
                aihfVarCreateBuilder8.copyOnWrite();
                auhp auhpVar8 = (auhp) aihfVarCreateBuilder8.instance;
                auhpVar8.b |= 1;
                auhpVar8.c = fC3;
                auhp auhpVar9 = augyVar4.k;
                if (auhpVar9 != null) {
                    auhpVar6 = auhpVar9;
                }
                float fC4 = auhpVar6.d + uqx.c(ujrVar2.b, size2);
                aihfVarCreateBuilder8.copyOnWrite();
                auhp auhpVar10 = (auhp) aihfVarCreateBuilder8.instance;
                auhpVar10.b |= 2;
                auhpVar10.d = fC4;
                return (auhp) aihfVarCreateBuilder8.build();
            case 15:
                return ((uqx) this.a).b((PointF) obj, ((uro) this.b).f);
            case 16:
                uvvVar = new usb((augy) obj, ((usd) this.a).b((UUID) this.b));
                return uvvVar;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                usd usdVar = (usd) this.a;
                usbVar = new usb((augy) usj.n(usdVar.c.b, jLongValue).orElseThrow(new ieu(16)), usdVar.b((UUID) this.b));
                return usbVar;
            case 18:
                aufa aufaVar = (aufa) obj;
                agrf agrfVar2 = usj.a;
                aihf builder = aufaVar.toBuilder();
                aufb aufbVar = aufaVar.c == 100 ? (aufb) aufaVar.d : aufb.a;
                Object obj5 = this.b;
                Object obj6 = this.a;
                aihf builder2 = aufbVar.toBuilder();
                String string = ((Uri) obj6).toString();
                builder2.copyOnWrite();
                aufb aufbVar2 = (aufb) builder2.instance;
                string.getClass();
                aufbVar2.b |= 1;
                aufbVar2.c = string;
                builder.copyOnWrite();
                aufa aufaVar2 = (aufa) builder.instance;
                aufb aufbVar3 = (aufb) builder2.build();
                aufbVar3.getClass();
                aufaVar2.d = aufbVar3;
                aufaVar2.c = 100;
                aigu aiguVarAu = ahng.au((Duration) obj5);
                builder.copyOnWrite();
                aufa aufaVar3 = (aufa) builder.instance;
                aiguVarAu.getClass();
                aufaVar3.g = aiguVarAu;
                aufaVar3.b |= 4;
                return (aufa) builder.build();
            case 19:
                augy augyVar5 = (augy) obj;
                agrf agrfVar3 = usj.a;
                jrr jrrVar = (jrr) augyVar5.toBuilder();
                aihf builder3 = (augyVar5.c == 108 ? (auhc) augyVar5.d : auhc.a).toBuilder();
                auhc auhcVar = augyVar5.c == 108 ? (auhc) augyVar5.d : auhc.a;
                auhl auhlVar = auhcVar.c == 1 ? (auhl) auhcVar.d : auhl.a;
                Object obj7 = this.b;
                Object obj8 = this.a;
                aihf builder4 = auhlVar.toBuilder();
                String string2 = ((Uri) obj8).toString();
                builder4.copyOnWrite();
                auhl auhlVar2 = (auhl) builder4.instance;
                string2.getClass();
                auhlVar2.b |= 1;
                auhlVar2.c = string2;
                builder3.copyOnWrite();
                auhc auhcVar2 = (auhc) builder3.instance;
                auhl auhlVar3 = (auhl) builder4.build();
                auhlVar3.getClass();
                auhcVar2.d = auhlVar3;
                auhcVar2.c = 1;
                jrrVar.copyOnWrite();
                augy augyVar6 = (augy) jrrVar.instance;
                auhc auhcVar3 = (auhc) builder3.build();
                auhcVar3.getClass();
                augyVar6.d = auhcVar3;
                augyVar6.c = 108;
                aigu aiguVarAu2 = ahng.au((Duration) obj7);
                jrrVar.copyOnWrite();
                augy augyVar7 = (augy) jrrVar.instance;
                aiguVarAu2.getClass();
                augyVar7.j = aiguVarAu2;
                augyVar7.b |= 32;
                return (augy) jrrVar.build();
            default:
                return new qvn((Effect) this.b, (String) obj, this.a);
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

    public /* synthetic */ hqb(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
