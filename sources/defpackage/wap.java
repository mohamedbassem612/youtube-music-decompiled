package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.media.interfaces.AutocropCalculator;
import com.google.android.libraries.youtube.media.interfaces.AutocropFormat;
import com.google.android.libraries.youtube.media.interfaces.Time;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wap implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wap(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, zwn] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i;
        int i2 = this.$cid;
        if (i2 == 0) {
            zwa zwaVar = (zwa) obj;
            return ((aczl) this.a).e.a(zwaVar).a(zwaVar).b((String) this.b);
        }
        if (i2 != 1) {
            AutocropFormat autocropFormat = (AutocropFormat) obj;
            return new zdk(((AutocropCalculator) ((zdj) this.a).a).calculateFrame(new Time(((Duration) this.b).toNanos(), 1000000000L), autocropFormat), autocropFormat);
        }
        Object obj2 = this.a;
        augi augiVar = (augi) obj;
        akqs akqsVar = ((akqu) obj2).c;
        if (akqsVar == null) {
            akqsVar = akqs.a;
        }
        akql akqlVar = akqsVar.b == 1 ? (akql) akqsVar.c : akql.a;
        aihf builder = ((aihn) obj2).toBuilder();
        aihf builder2 = akqsVar.toBuilder();
        aihf builder3 = akqlVar.toBuilder();
        String str = augiVar.h;
        builder3.copyOnWrite();
        akql akqlVar2 = (akql) builder3.instance;
        str.getClass();
        akqlVar2.b |= 1;
        akqlVar2.c = str;
        int iBc = a.bc(augiVar.g);
        if (iBc == 0) {
            iBc = 1;
        }
        Object obj3 = this.b;
        builder3.copyOnWrite();
        akql akqlVar3 = (akql) builder3.instance;
        akqlVar3.h = iBc - 1;
        akqlVar3.b |= 32;
        int iBc2 = a.bc(augiVar.g);
        if (iBc2 == 0 || iBc2 != 3) {
            augy augyVar = (augy) obj3;
            i = (augyVar.c == 110 ? (auhb) augyVar.d : auhb.a).e;
        } else {
            augy augyVar2 = (augy) obj3;
            i = (augyVar2.c == 110 ? (auhb) augyVar2.d : auhb.a).f;
        }
        akqk akqkVarA = vfo.a(i);
        builder3.copyOnWrite();
        akql akqlVar4 = (akql) builder3.instance;
        akqkVarA.getClass();
        akqlVar4.e = akqkVarA;
        akqlVar4.b |= 4;
        String str2 = augiVar.e;
        builder3.copyOnWrite();
        akql akqlVar5 = (akql) builder3.instance;
        str2.getClass();
        akqlVar5.b |= 64;
        akqlVar5.i = str2;
        int iAV = a.aV(augiVar.i);
        if (iAV == 0) {
            iAV = 1;
        }
        builder3.copyOnWrite();
        akql akqlVar6 = (akql) builder3.instance;
        akqlVar6.j = iAV - 1;
        akqlVar6.b |= SemanticState.Focused;
        akql akqlVar7 = (akql) builder3.build();
        builder2.copyOnWrite();
        akqs akqsVar2 = (akqs) builder2.instance;
        akqlVar7.getClass();
        akqsVar2.c = akqlVar7;
        akqsVar2.b = 1;
        akqs akqsVar3 = (akqs) builder2.build();
        builder.copyOnWrite();
        akqu akquVar = (akqu) builder.instance;
        akqsVar3.getClass();
        akquVar.c = akqsVar3;
        akquVar.b |= 2;
        return (akqu) builder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}
