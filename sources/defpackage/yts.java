package defpackage;

import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yts implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yts(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ywz] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object, yoe] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.$cid) {
            case 0:
                ((ytv) this.a).t((String) this.b);
                break;
            case 1:
                ((ytv) this.a).p((yuf) this.b);
                break;
            case 2:
                ((ytv) this.a).l(this.b);
                break;
            case 3:
                ((ywh) this.b).b.j((yvu) this.a);
                break;
            case 4:
                ((ywh) this.a).b.l((String) this.b);
                break;
            case 5:
                ((ywh) this.a).b.z((arfb) this.b);
                break;
            case 6:
                ((ywh) this.a).b.t((aphs) this.b);
                break;
            case 7:
                ((ywh) this.a).b.h((zhz) this.b);
                break;
            case 8:
                ((ywh) this.b).b.x((StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) this.a);
                break;
            case 9:
                ((ywl) this.a).k((zhz) this.b);
                break;
            case 10:
                ((ywl) this.a).a.h((zhz) this.b);
                break;
            case 11:
                zhq zhqVar = zhq.ABR;
                ((yyb) this.a).a((ajvs) this.b);
                break;
            case 12:
                yyi yyiVar = (yyi) this.a;
                zjr zjrVar = yyiVar.b;
                Object obj = this.b;
                if (!zjrVar.j.m(341, 45774635L)) {
                    yyiVar.c.k(new zhz("player.exception", yyiVar.a(), (Throwable) obj));
                } else {
                    zhv zhvVar = new zhv("player.exception");
                    zhvVar.e(yyiVar.a());
                    zhvVar.d = (Throwable) obj;
                    zhvVar.d();
                    yyiVar.c.k(zhvVar.a());
                }
                break;
            case 13:
                ((yyv) this.a).ar((zcf) this.b);
                break;
            case 14:
                yyu yyuVar = (yyu) this.a;
                yyuVar.i.ah(yyuVar.a.b, (zhz) this.b);
                break;
            case 15:
                yzx yzxVar = (yzx) this.a;
                yzxVar.c.b.h(new zhz("player.fatalexception", yzxVar.c.g, (Throwable) this.b));
                break;
            case 16:
                ((zcf) this.b).Z.l("pmqs", ((yod) this.a).e());
                break;
            case 17:
                ((zcf) this.b).Z.l("pmqs", this.a.e());
                break;
            case 18:
                Object obj2 = this.b;
                Object obj3 = this.a;
                try {
                    ((zae) obj3).g = (zcf) obj2;
                    ((zae) obj3).q = true;
                    ((zae) obj3).p = ((zae) obj3).b.c(((zcf) obj2).y);
                    ((zae) obj3).h();
                } catch (Exception e) {
                    ((zae) obj3).i(e);
                    return;
                }
                break;
            case 19:
                Object obj4 = this.b;
                yyz yyzVar = (yyz) ((zay) this.a).b;
                yyzVar.a.ah(yyzVar.b, (zhz) obj4);
                break;
            default:
                ((zbg) this.a).d.z((btn) this.b);
                break;
        }
    }

    public /* synthetic */ yts(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
