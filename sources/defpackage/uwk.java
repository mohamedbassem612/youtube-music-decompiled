package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uwk implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ uwk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v54, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        Object objD;
        uwo uwoVar;
        int i = 3;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    objD = usj.d((auhs) optional.get());
                    objD.getClass();
                } else {
                    objD = awno.a;
                }
                ((uwn) this.a).b.h(new uwk(objD, i));
                return awmy.a;
            case 1:
                ((uwo) obj).getClass();
                ?? r4 = this.a;
                r4.getClass();
                uwoVar = new uwo(r4);
                break;
            case 2:
                ((uwn) this.a).b.h(new uwk((agke) obj, i2));
                return awmy.a;
            case 3:
                ((uwo) obj).getClass();
                uwoVar = new uwo(this.a);
                break;
            case 4:
                return ((uwq) this.a).a();
            case 5:
                return Boolean.valueOf(awrc.c(this.a, ((ajhu) obj).b));
            case 6:
                Object obj2 = this.a;
                synchronized (((van) obj2).d) {
                    ((van) obj2).l(((van) obj2).e);
                }
                return awmy.a;
            case 7:
                jrq jrqVar = (jrq) ((aufo) obj).toBuilder();
                jrqVar.copyOnWrite();
                ((aufo) jrqVar.instance).c = aufo.emptyProtobufList();
                jrqVar.j((ajai) this.a);
                return (aufo) jrqVar.build();
            case 8:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 1) {
                    vwp vwpVar = (vwp) this.a;
                    awro.t(vwpVar.a, null, 0, new hqx(vwpVar, (awoq) null, 9), 3);
                }
                return awmy.a;
            case 9:
                Integer num2 = (Integer) obj;
                num2.getClass();
                ((axst) this.a).n(num2.intValue());
                return awmy.a;
            case 10:
                Integer num3 = (Integer) obj;
                num3.getClass();
                ((axst) this.a).n(num3.intValue());
                return awmy.a;
            case 11:
                Integer num4 = (Integer) obj;
                num4.getClass();
                ((axst) this.a).n(num4.intValue());
                return awmy.a;
            case 12:
                ((aqi) this.a).b((aiqj) obj);
                return awmy.a;
            case 13:
                ((aqi) this.a).d((Throwable) obj);
                return awmy.a;
            case 14:
                ((vze) this.a).a = (aiqj) obj;
                return awmy.a;
            case 15:
                Object obj3 = this.a;
                aihl aihlVar = ainq.b;
                aihf builder = ((aihn) obj3).toBuilder();
                builder.copyOnWrite();
                ainq ainqVar = (ainq) builder.instance;
                ainqVar.c |= 1;
                ainqVar.d = true;
                ((aihh) obj).e(aihlVar, (ainq) builder.build());
                return awmy.a;
            case 16:
                tne tneVar = (tne) obj;
                tneVar.getClass();
                this.a.add(tneVar);
                return awmy.a;
            case 17:
                String str = (String) obj;
                str.getClass();
                awrm awrmVar = (awrm) this.a;
                if (awrmVar.a == null) {
                    awrmVar.a = new ArrayList();
                }
                ((List) awrmVar.a).add(str);
                return awmy.a;
            case 18:
                ((xll) this.a).l.b((asem) obj);
                return awmy.a;
            case 19:
                xnw xnwVar = (xnw) obj;
                Object obj4 = this.a;
                int i3 = xnx.h;
                xnwVar.getClass();
                return Boolean.valueOf(awrc.c(xnwVar.a, obj4));
            default:
                Integer num5 = (Integer) obj;
                num5.getClass();
                ((yrd) this.a).a.onNetworkChange(num5.intValue());
                return awmy.a;
        }
        return uwoVar;
    }
}
