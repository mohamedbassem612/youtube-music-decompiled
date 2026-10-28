package defpackage;

import com.google.android.apps.youtube.music.offline.appsearch.schema.MusicOfflineVideoAppSearchDocument;
import com.google.android.libraries.blocks.StreamReaderWriter;
import com.google.android.libraries.blocks.runtime.InPlaceStream;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hfw implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hfw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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
    /* JADX WARN: Type inference failed for: r5v13, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v36, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [awqg, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 10;
        switch (this.$cid) {
            case 0:
                return ((agyg) this.a).k((String) obj);
            case 1:
                return ((daa) this.a).h((daj) obj);
            case 2:
                return this.a.invoke(obj);
            case 3:
                Object obj2 = this.a;
                final hia hiaVar = (hia) obj2;
                final String str = (String) obj;
                return gzj.ap((hpy) hiaVar.l.io(), wfs.h(str), (avmb) hiaVar.o.io()).B(new gkq(i)).K(new gnw(i)).B(new avno() { // from class: hhu
                    @Override // defpackage.avno
                    public final boolean a(Object obj3) {
                        boolean zRemove;
                        boolean z = ((hte) obj3).a;
                        String strH = wfs.h(str);
                        hia hiaVar2 = hiaVar;
                        if (z) {
                            synchronized (hiaVar2.t) {
                                zRemove = hiaVar2.u.remove(strH);
                            }
                            return zRemove;
                        }
                        synchronized (hiaVar2.t) {
                            hiaVar2.u.add(strH);
                        }
                        return false;
                    }
                }).O((avmb) hiaVar.n.io()).af(new hgl(obj2, 14));
            case 4:
                Object obj3 = this.a;
                hia hiaVar2 = (hia) obj3;
                return gzj.ao((hpy) hiaVar2.l.io(), wfs.h((String) obj)).B(new gkq(i)).K(new gnw(12)).B(new gkq(11)).ar().O((avmb) hiaVar2.n.io()).af(new hgl(obj3, 19));
            case 5:
                return this.a.invoke(obj);
            case 6:
                return this.a.invoke(obj);
            case 7:
                agrf agrfVar = hnl.a;
                String str2 = (String) ((agkj) this.a).get((String) obj);
                str2.getClass();
                return str2;
            case 8:
                agrf agrfVar2 = hnl.a;
                Object obj4 = this.a.get((String) obj);
                return obj4 != null ? Stream.CC.of(obj4) : Stream.CC.empty();
            case 9:
                anjx anjxVar = (anjx) obj;
                List listE = anjxVar.e();
                Object obj5 = this.a;
                hnm hnmVar = (hnm) obj5;
                return afxd.f(hnmVar.a.b(listE)).g(new gqa(obj5, anjxVar, 7), hnmVar.b);
            case 10:
                anuk anukVar = (anuk) obj;
                List listJ = anukVar.j();
                Object obj6 = this.a;
                hnm hnmVar2 = (hnm) obj6;
                return aheo.p(hnmVar2.a.b(listJ)).q(new gqa(obj6, anukVar, 8), hnmVar2.b);
            case 11:
                anyx anyxVar = (anyx) obj;
                String strB = aaka.b(anyxVar.getVideoId());
                String strY = ((hnn) this.a).a.y();
                String title = anyxVar.getTitle();
                agke agkeVarQ = agke.q(anyxVar.getArtistNames());
                if (true == agkeVarQ.isEmpty()) {
                    agkeVarQ = null;
                }
                return new MusicOfflineVideoAppSearchDocument(strB, strY, title, agkeVarQ);
            case 12:
                afyl afylVar = (afyl) obj;
                afym afymVarI = afylVar.i();
                ?? r5 = this.a;
                if (afymVarI == null) {
                    almd almdVar = almd.a;
                    return afylVar.b(-2128800151, r5, aihn.getParserForClass(almd.class));
                }
                StreamReaderWriter streamReaderWriterA = InPlaceStream.a();
                afymVarI.g((ascc) r5, streamReaderWriterA.b);
                return streamReaderWriterA.a;
            case 13:
                afyl afylVar2 = (afyl) obj;
                afym afymVarI2 = afylVar2.i();
                ?? r6 = this.a;
                if (afymVarI2 == null) {
                    almd almdVar2 = almd.a;
                    return afylVar2.b(-2047133634, r6, aihn.getParserForClass(almd.class));
                }
                StreamReaderWriter streamReaderWriterA2 = InPlaceStream.a();
                afymVarI2.f((ascb) r6, streamReaderWriterA2.b);
                return streamReaderWriterA2.a;
            case 14:
                return ((hpd) this.a).k((String) obj);
            case 15:
                return ((hpd) this.a).g((String) obj);
            case 16:
                return ((hpd) this.a).e((String) obj);
            case 17:
                return ((hpb) this.a).g((String) obj);
            case 18:
                hpt hptVarA = hpu.a();
                hptVarA.c(true);
                hptVarA.d(true);
                hptVarA.e(true);
                hptVarA.b(true);
                return tzk.c(((hpk) this.a).e(hptVarA.a()));
            case 19:
                aamg aamgVarAh = ((aaex) this.a).ah(((aamo) obj).d());
                aamgVarAh.getClass();
                return aamgVarAh;
            default:
                return ((aaex) this.a).al(((aamh) obj).a);
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
}
